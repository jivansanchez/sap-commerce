package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.ContactPreferencesOptionsModel;
import de.hybris.training.facades.contactpreferences.data.ContactPreferencesOptionsData;

public class ContactPreferencesOptionsPopulator implements Populator<ContactPreferencesOptionsModel, ContactPreferencesOptionsData> {

    @Override
    public void populate(ContactPreferencesOptionsModel source, ContactPreferencesOptionsData target) throws ConversionException {
        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setDescription(source.getDescription());
    }
}
