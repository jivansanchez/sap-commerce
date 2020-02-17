package de.hybris.training.facades.subscriptions;


import de.hybris.platform.commercewebservicescommons.dto.user.SubscriptionsWsDTO;

import java.util.List;

public interface ProductSubscriptionFacade {

    /**
     *
     * @return
     */
    List<SubscriptionsWsDTO> getAllProductSubscriptions();

    /**
     *
     * @return
     */
    SubscriptionsWsDTO getProductSubscriptionsByCode(String productSubscriptionsCode);

    /**
     *
     * @return
     */
    Boolean updateProductSubscriptions(SubscriptionsWsDTO subscriptionsWsDTO);

    /**
     *
     * @return
     */
    Boolean saveProductSubscriptions(SubscriptionsWsDTO subscriptionsWsDTO);

    /**
     *
     * @param subscriptionsWsDTO
     * @return
     */
    Boolean removeProductSubscriptions(SubscriptionsWsDTO subscriptionsWsDTO);

}
