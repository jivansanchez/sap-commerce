package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.ContactPreferencesOptionsModel;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import de.hybris.training.facades.contactpreferences.data.ContactPreferencesOptionsData;
import de.hybris.training.facades.newsletter.data.NewsLetterOptionData;

import java.util.HashSet;
import java.util.Set;

public class CustomerContactPreferencesOptionsPopulator implements Populator<CustomerModel, CustomerData>  {

    @Override
    public void populate(CustomerModel customerModel, CustomerData customerData) throws ConversionException {
        Set<ContactPreferencesOptionsData>  contactPreferencesOptionDataSet = new HashSet<>();

        for (ContactPreferencesOptionsModel contactPreferencesOptionsModel : customerModel.getContactPreferencesOption()) {
            ContactPreferencesOptionsData contactPreferencesOptionsData = new ContactPreferencesOptionsData();
            contactPreferencesOptionsData.setCode(contactPreferencesOptionsModel.getCode());
            contactPreferencesOptionsData.setName(contactPreferencesOptionsModel.getName());
            contactPreferencesOptionsData.setDescription(contactPreferencesOptionsModel.getDescription());
            contactPreferencesOptionDataSet.add(contactPreferencesOptionsData);
        }

        customerData.setContactPreferencesOptions(contactPreferencesOptionDataSet);
    }
}
