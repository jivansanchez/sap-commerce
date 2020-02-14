package de.hybris.training.core.services;

import de.hybris.training.core.model.ContactPreferencesOptionsModel;
import java.util.List;

public interface ContactPreferencesOptionsService {

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