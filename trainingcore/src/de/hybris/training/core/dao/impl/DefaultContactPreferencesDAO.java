package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.ContactPreferencesDAO;
import de.hybris.training.core.model.ContactPreferencesOptionsModel;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

public class DefaultContactPreferencesDAO extends DefaultGenericDao<ContactPreferencesOptionsModel> implements ContactPreferencesDAO {


    private static final String FIND_CONTACT_PREFERENCES_OPTIONS_BY_CODE = "SELECT {" + ContactPreferencesOptionsModel.PK + "} FROM {"
            + ContactPreferencesOptionsModel._TYPECODE + "} WHERE {" + ContactPreferencesOptionsModel.CODE + "} = ?" + ContactPreferencesOptionsModel.CODE;
    private static final String FIND_ALL_CONTACT_PREFERENCES_OPTIONS = "SELECT {" + ContactPreferencesOptionsModel.PK + "} FROM {"
            + ContactPreferencesOptionsModel._TYPECODE + "} ";

    public DefaultContactPreferencesDAO(String typecode) {
        super(typecode);
    }


    @Override
    public ContactPreferencesOptionsModel getContactPreferencesOptionsByCode(String optionCode) {
        validateParameterNotNullStandardMessage("optionCode", optionCode);
        final SearchResult<ContactPreferencesOptionsModel> contactPreferencesOptions = getFlexibleSearchService().search(
                FIND_CONTACT_PREFERENCES_OPTIONS_BY_CODE, Collections.singletonMap(ContactPreferencesOptionsModel.CODE, optionCode));
        if (CollectionUtils.isNotEmpty(contactPreferencesOptions.getResult()) && CollectionUtils.size(contactPreferencesOptions.getResult()) == 1) {
            return contactPreferencesOptions.getResult().get(0);
        } else {
            return new ContactPreferencesOptionsModel();
        }
    }

    @Override
    public List<ContactPreferencesOptionsModel> getAllContactPreferencesOptions() {
        final SearchResult<ContactPreferencesOptionsModel> contactPreferencesOptions = getFlexibleSearchService().search(
                FIND_ALL_CONTACT_PREFERENCES_OPTIONS);
        if (CollectionUtils.isNotEmpty(contactPreferencesOptions.getResult())) {
            return contactPreferencesOptions.getResult();
        } else {
            return new ArrayList<>();
        }
    }
}
