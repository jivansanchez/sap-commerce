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

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import de.hybris.platform.util.Config;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


/**
 * Provides value for volumePrices flag. "true" if product has volume prices, "false" otherwise.
 */
public class ProductSuperCategoriesProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider
{
	private FieldNameProvider fieldNameProvider;

	@Override
	public Collection<FieldValue> getFieldValues(final IndexConfig indexConfig, final IndexedProperty indexedProperty,
			final Object model) throws FieldValueProviderException
	{
		int requiredSuperCategories = Config.getInt("solr.super.categories.required.quantity", 0);

		final ProductModel product = (ProductModel) model;//this provider shall only be used with products
		final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();

		int numberOfProductSuperCategories = product.getSupercategories().size();

		LOG.info("Supercategories " + numberOfProductSuperCategories);
		try
		{
			addFieldValues(indexedProperty, product, fieldValues,
					numberOfProductSuperCategories > requiredSuperCategories );
		}catch (Exception ee) {
			LOG.warn("There was an error creating the indexed property for numberOfSuperCategories");
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
}
