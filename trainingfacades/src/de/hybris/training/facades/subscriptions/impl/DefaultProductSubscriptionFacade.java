package de.hybris.training.facades.subscriptions.impl;

import de.hybris.platform.commercewebservicescommons.dto.user.SubscriptionsWsDTO;
import de.hybris.training.facades.subscriptions.ProductSubscriptionFacade;

import java.util.List;

public class DefaultProductSubscriptionFacade implements ProductSubscriptionFacade {

    @Override
    public List<SubscriptionsWsDTO> getAllProductSubscriptions() {
        return null;
    }

    @Override
    public SubscriptionsWsDTO getProductSubscriptionsByCode(String productSubscriptionsCode) {
        return null;
    }

    @Override
    public Boolean updateProductSubscriptions(SubscriptionsWsDTO subscriptionsWsDTO) {
        return null;
    }

    @Override
    public Boolean saveProductSubscriptions(SubscriptionsWsDTO subscriptionsWsDTO) {
        return null;
    }

    @Override
    public Boolean removeProductSubscriptions(SubscriptionsWsDTO subscriptionsWsDTO) {
        return null;
    }
}
