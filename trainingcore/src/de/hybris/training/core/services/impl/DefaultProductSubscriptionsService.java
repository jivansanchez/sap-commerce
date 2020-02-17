package de.hybris.training.core.services.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.training.core.dao.ProductSubscriptionsDAO;
import de.hybris.training.core.model.ProductSubscriptionsModel;
import de.hybris.training.core.services.ProductSubscriptionsService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultProductSubscriptionsService  implements ProductSubscriptionsService {

    private ModelService modelService;
    private ProductSubscriptionsDAO productSubscriptionsDAO;

    @Override
    public List<ProductSubscriptionsModel> getAllProductSubscriptions() {
        return productSubscriptionsDAO.getAllProductSubscriptions();
    }

    @Override
    public ProductSubscriptionsModel getProductSubscriptionsByCode(String productSubscriptionsCode) {
        return productSubscriptionsDAO.getProductSubscriptionsByCode(productSubscriptionsCode);
    }

    @Override
    public Boolean updateProductSubscriptions(ProductSubscriptionsModel productSubscriptionsModel) {
        return null;
    }

    @Override
    public Boolean saveProductSubscriptions(ProductSubscriptionsModel productSubscriptionsModel) {
        this.getModelService().save(productSubscriptionsModel);
        return Boolean.TRUE;
    }

    @Override
    public Boolean removeProductSubscriptions(ProductSubscriptionsModel productSubscriptionsModel) {
        return null;
    }

    public ProductSubscriptionsDAO getProductSubscriptionsDAO() {
        return productSubscriptionsDAO;
    }

    @Required
    public void setProductSubscriptionsDAO(ProductSubscriptionsDAO productSubscriptionsDAO) {
        this.productSubscriptionsDAO = productSubscriptionsDAO;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Required
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
