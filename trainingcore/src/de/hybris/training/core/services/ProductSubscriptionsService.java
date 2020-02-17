package de.hybris.training.core.services;

import de.hybris.training.core.model.ProductSubscriptionsModel;

import java.util.List;

public interface ProductSubscriptionsService {

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

    /**
     *
     * @return
     */
    Boolean updateProductSubscriptions(ProductSubscriptionsModel productSubscriptionsModel);

    /**
     *
     * @return
     */
    Boolean saveProductSubscriptions(ProductSubscriptionsModel productSubscriptionsModel);

    /**
     *
     * @param productSubscriptionsModel
     * @return
     */
    Boolean removeProductSubscriptions(ProductSubscriptionsModel productSubscriptionsModel);
}
