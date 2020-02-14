package de.hybris.training.facades.contactPreferences.impl;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.training.core.model.ContactPreferencesOptionsModel;
import de.hybris.training.core.services.ContactPreferencesOptionsService;
import de.hybris.training.facades.contactPreferences.ContactPreferencesOptionsFacade;
import de.hybris.training.facades.contactpreferences.data.ContactPreferencesOptionsData;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultContactPreferencesOptionsFacade implements ContactPreferencesOptionsFacade {

    private UserService userService;
    private ModelService modelService;
    private ContactPreferencesOptionsService contactPreferencesOptionsService;
    private Converter<ContactPreferencesOptionsModel, ContactPreferencesOptionsData> contactPreferencesOptionsDataConverter;
    private Converter<CustomerData, CustomerModel> contactPreferencesOptionsReverseConverter;

    @Override
    public List<ContactPreferencesOptionsData> getAllContactPreferencesOptions() {
        return this.getContactPreferencesOptionsDataConverter()
                .convertAll(this.getContactPreferencesOptionsService().getAllContactPreferencesOptions());
    }

    @Override
    public Boolean saveContactPreferencesOptionsForCurrentCustomer(CustomerData customerData) {
        CustomerModel customerModel = (CustomerModel)this.userService.getCurrentUser();
        if (this.userService.isAnonymousUser(customerModel)) {
            return Boolean.FALSE;
        } else {
            contactPreferencesOptionsReverseConverter.convert(customerData, customerModel);
            modelService.save(customerModel);
            return Boolean.TRUE;
        }
    }

    public ContactPreferencesOptionsService getContactPreferencesOptionsService() {
        return contactPreferencesOptionsService;
    }

    @Required
    public void setContactPreferencesOptionsService(ContactPreferencesOptionsService contactPreferencesOptionsService) {
        this.contactPreferencesOptionsService = contactPreferencesOptionsService;
    }

    public Converter<ContactPreferencesOptionsModel, ContactPreferencesOptionsData> getContactPreferencesOptionsDataConverter() {
        return contactPreferencesOptionsDataConverter;
    }

    @Required
    public void setContactPreferencesOptionsDataConverter(Converter<ContactPreferencesOptionsModel, ContactPreferencesOptionsData> contactPreferencesOptionsDataConverter) {
        this.contactPreferencesOptionsDataConverter = contactPreferencesOptionsDataConverter;
    }

    public UserService getUserService() {
        return userService;
    }

    @Required
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Converter<CustomerData, CustomerModel> getContactPreferencesOptionsReverseConverter() {
        return contactPreferencesOptionsReverseConverter;
    }

    @Required
    public void setContactPreferencesOptionsReverseConverter(Converter<CustomerData, CustomerModel> contactPreferencesOptionsReverseConverter) {
        this.contactPreferencesOptionsReverseConverter = contactPreferencesOptionsReverseConverter;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Required
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
