package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import de.hybris.training.core.model.ProductSubscriptionsModel;

import java.util.List;

public interface ProductSubscriptionsDAO extends GenericDao<ProductSubscriptionsModel> {

    /**
     *
     * @return
     */
    List<ProductSubscriptionsModel> getAllProductSubscriptions();

    /**
     *
     * @return
     */
    ProductSubscriptionsModel getProductSubscriptionsByCode(String productSubscriptionsCode);

}
