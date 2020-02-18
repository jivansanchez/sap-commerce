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
package de.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import de.hybris.platform.store.services.BaseStoreService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Provides value for volumePrices flag. "true" if product has volume prices, "false" otherwise.
 */
public class SuccessOrdersProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider
{
	private FieldNameProvider fieldNameProvider;
	private CustomerAccountService customerAccountService;
	private BaseStoreService baseStoreService;

	@Override
	public Collection<FieldValue> getFieldValues(final IndexConfig indexConfig, final IndexedProperty indexedProperty,
			final Object model) throws FieldValueProviderException
	{
		final ProductModel product = (ProductModel) model;//this provider shall only be used with products
		final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();

		boolean valueIndex = false;
		final OrderModel orderModel = this.customerAccountService.getOrderForCode("00012001", baseStoreService.getCurrentBaseStore());

		if(orderModel != null && CollectionUtils.isNotEmpty(orderModel.getEntries()) && orderModel.getStatus().equals(OrderStatus.COMPLETED)){
			for (AbstractOrderEntryModel orderEntry: orderModel.getEntries()) {
				if(orderEntry.getProduct().getCode().equals(product.getCode())){
					valueIndex = true;
					break;
				}
			}
		}

		try
		{
			addFieldValues(indexedProperty, product, fieldValues, valueIndex);
		}catch (Exception ee) {
			LOG.warn("There was an error creating the indexed property for numberOfReviews");
		}

		return fieldValues;
	}

	protected void addFieldValues(final IndexedProperty indexedProperty, final ProductModel product,
			final Collection<FieldValue> fieldValues, Boolean value) {
		final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty, null);
		for (final String fieldName : fieldNames)
		{
			fieldValues.add(new FieldValue(fieldName, value));
		}
	}

	protected FieldNameProvider getFieldNameProvider()
	{
		return fieldNameProvider;
	}

	@Required
	public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
	{
		this.fieldNameProvider = fieldNameProvider;
	}

	public CustomerAccountService getCustomerAccountService() {
		return customerAccountService;
	}

	@Required
	public void setCustomerAccountService(CustomerAccountService customerAccountService) {
		this.customerAccountService = customerAccountService;
	}

	public BaseStoreService getBaseStoreService() {
		return baseStoreService;
	}

	@Required
	public void setBaseStoreService(BaseStoreService baseStoreService) {
		this.baseStoreService = baseStoreService;
	}
}
