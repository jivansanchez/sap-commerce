package de.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import de.hybris.platform.ycommercewebservices.model.expressupdate.cron.ProductExpressUpdateCleanerCronJobModel;
import org.springframework.beans.factory.annotation.Required;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ProductStarProvider  extends AbstractPropertyFieldValueProvider implements FieldValueProvider {

    private FieldNameProvider fieldNameProvider;
    private ConfigurationService configurationService;
    private static final String STAR_PRODUCT_RATING = "starproduct.value";

    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {

        Random random = new Random();
        final ProductModel product = (ProductModel) model; //this provider shall only be used with products
        final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();

        Double averageRating = product.getAverageRating();
        final Double starProduct = getConfigurationService().getConfiguration().getDouble(STAR_PRODUCT_RATING);

        try
        {
            addFieldValues(indexedProperty, product, fieldValues, averageRating.doubleValue() >= starProduct);
        }catch (Exception ee) {
            LOG.warn("There was an error creating the indexed property for productAverageRating");
        }

        return fieldValues;
    }

    protected void addFieldValues(final IndexedProperty indexedProperty, final ProductModel product,final Collection<FieldValue> fieldValues, Boolean value) {
        final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty, null);
        for (final String fieldName : fieldNames)
        {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }

    public FieldNameProvider getFieldNameProvider() { return fieldNameProvider; }

    @Required
    public void setFieldNameProvider(FieldNameProvider fieldNameProvider) { this.fieldNameProvider = fieldNameProvider; }

    public ConfigurationService getConfigurationService() { return configurationService; }

    public void setConfigurationService(ConfigurationService configurationService) { this.configurationService = configurationService; }
}
