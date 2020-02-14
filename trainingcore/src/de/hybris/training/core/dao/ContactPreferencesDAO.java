package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import de.hybris.training.core.jalo.ContactPreferencesOptions;
import de.hybris.training.core.model.ContactPreferencesOptionsModel;

import java.util.List;

public interface ContactPreferencesDAO extends GenericDao<ContactPreferencesOptionsModel> {

    /**
     *
     * @param optionCode
     * @return
     */
    ContactPreferencesOptionsModel getContactPreferencesOptionsByCode(String optionCode);

    /**
     *
     * @return
     */
    List<ContactPreferencesOptionsModel> getAllContactPreferencesOptions();

}