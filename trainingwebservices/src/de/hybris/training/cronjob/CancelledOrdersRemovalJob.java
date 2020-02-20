package de.hybris.training.cronjob;

import de.hybris.platform.commerceservices.order.dao.CommerceOrderDao;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.training.model.CancelledOrdersRemovalCronJobModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class CancelledOrdersRemovalJob extends AbstractJobPerformable<CancelledOrdersRemovalCronJobModel> {
    private static final Logger LOG = Logger.getLogger(CancelledOrdersRemovalJob.class);

    private CommerceOrderDao commerceOrderDao;

    @Override
    public PerformResult perform(final CancelledOrdersRemovalCronJobModel job) {
        try {
//            if (job.getOrder() == null) {
//                LOG.warn("There are no orders defined for " + job.getOrder());
//                return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
//            }

            List<OrderModel> orders = commerceOrderDao.find();

            for(final OrderModel order: orders){
                if(order.getStatus().equals(OrderStatus.CANCELLED)){
                    getModelService().remove(order);
                }
            }
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

    protected ModelService getModelService()
    {
        return modelService;
    }
}