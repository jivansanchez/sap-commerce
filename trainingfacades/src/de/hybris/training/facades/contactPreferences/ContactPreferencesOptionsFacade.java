package de.hybris.training.facades.contactPreferences;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.training.facades.contactpreferences.data.ContactPreferencesOptionsData;

import java.util.List;

public interface ContactPreferencesOptionsFacade {

    /**
     *
     * @return
     */
    List<ContactPreferencesOptionsData> getAllContactPreferencesOptions();

    /**
     *
     * @param customerData
     * @return
     */
    Boolean saveContactPreferencesOptionsForCurrentCustomer(CustomerData customerData);

}
