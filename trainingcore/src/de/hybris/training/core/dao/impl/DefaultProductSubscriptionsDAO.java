package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.ProductSubscriptionsDAO;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import de.hybris.training.core.model.ProductSubscriptionsModel;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

public class DefaultProductSubscriptionsDAO extends DefaultGenericDao<ProductSubscriptionsModel>  implements ProductSubscriptionsDAO {

    private static final String FIND_SUBSCRIPTION_BY_CODE = "SELECT {" + ProductSubscriptionsModel.PK + "} FROM {"
            + ProductSubscriptionsModel._TYPECODE + "} WHERE {" + ProductSubscriptionsModel.CODE + "} = ?" + ProductSubscriptionsModel.CODE;

    private static final String FIND_ALL_SUBSCRIPTIONS = "SELECT {" + ProductSubscriptionsModel.PK + "} FROM {"
            + ProductSubscriptionsModel._TYPECODE + "} ";

    public DefaultProductSubscriptionsDAO(String typecode) {
        super(typecode);
    }

    @Override
    public List<ProductSubscriptionsModel> getAllProductSubscriptions() {
        final SearchResult<ProductSubscriptionsModel> subscriptions = getFlexibleSearchService().search(
                FIND_ALL_SUBSCRIPTIONS);
        if (CollectionUtils.isNotEmpty(subscriptions.getResult())) {
            return subscriptions.getResult();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public ProductSubscriptionsModel getProductSubscriptionsByCode(String productSubscriptionsCode) {
        validateParameterNotNullStandardMessage("productSubscriptionsCode", productSubscriptionsCode);
        //getFlexibleSearchService() comes from parent
        final SearchResult<ProductSubscriptionsModel> subscriptions = getFlexibleSearchService().search(
                FIND_SUBSCRIPTION_BY_CODE, Collections.singletonMap(NewsLetterOptionsModel.CODE, productSubscriptionsCode));
        if (CollectionUtils.isNotEmpty(subscriptions.getResult()) && CollectionUtils.size(subscriptions.getResult()) == 1) {
            return subscriptions.getResult().get(0);
        } else {
            return new ProductSubscriptionsModel();
        }
    }
}
