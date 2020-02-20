/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.training.core.cronjob;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.order.dao.CommerceCartDao;
import de.hybris.platform.commerceservices.order.dao.CommerceOrderDao;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.time.TimeService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.training.model.CanceledOrdersRemovalCronJobModel;
import de.hybris.training.model.OldCartRemovalCronJobModel;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Required;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A Cron Job to clean up old carts.
 */
public class CanceledOrdersRemovalJob extends AbstractJobPerformable<CanceledOrdersRemovalCronJobModel>
{
	private static final Logger LOG = Logger.getLogger(CanceledOrdersRemovalJob.class);

	private CommerceOrderDao commerceOrderDao;

	@Override
	public PerformResult perform(final CanceledOrdersRemovalCronJobModel job)
	{
		try
		{
			if (job.getSites() == null || job.getSites().isEmpty())
			{
				LOG.warn("There is no sites defined for " + job.getCode());
				return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
			}

			final Map<String,Object> orderParams = new HashMap<>();
			orderParams.put(OrderModel.STATUS, OrderStatus.CANCELLED);

			List<OrderModel> cancelledOrders = this.commerceOrderDao.find(orderParams);
			this.modelService.removeAll(cancelledOrders);

			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occurred during cart cleanup", e);
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
	}

	public CommerceOrderDao getCommerceOrderDao() {
		return commerceOrderDao;
	}

	@Required
	public void setCommerceOrderDao(CommerceOrderDao commerceOrderDao) {
		this.commerceOrderDao = commerceOrderDao;
	}





}
