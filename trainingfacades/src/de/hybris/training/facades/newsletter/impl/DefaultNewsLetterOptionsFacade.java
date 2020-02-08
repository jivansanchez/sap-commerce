package de.hybris.training.facades.newsletter.impl;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import de.hybris.training.core.services.NewsLetterOptionsService;
import de.hybris.training.facades.newsletter.NewsLetterOptionsFacade;
import de.hybris.training.facades.newsletter.data.NewsLetterOptionData;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultNewsLetterOptionsFacade implements NewsLetterOptionsFacade {

    private UserService userService;
    private ModelService modelService;
    private NewsLetterOptionsService newsLetterOptionsService;
    private Converter<NewsLetterOptionsModel, NewsLetterOptionData> newsLetterOptionDataConverter;
    private Converter<CustomerData, CustomerModel> newsLetterOptionReverseConverter;

    @Override
    public List<NewsLetterOptionData> getAllNewsLetterOptions() {
        return this.getNewsLetterOptionDataConverter()
                .convertAll(this.getNewsLetterOptionsService().getAllNewsLetterOptions());
    }

    @Override
    public Boolean saveNewsLetterOptionsForCurrentCustomer(CustomerData customerData) {

        CustomerModel customerModel = (CustomerModel)this.userService.getCurrentUser();
        if (this.userService.isAnonymousUser(customerModel)) {
            return Boolean.FALSE;
        } else {
            newsLetterOptionReverseConverter.convert(customerData, customerModel);
            modelService.save(customerModel);
            return Boolean.TRUE;
        }
    }

    public NewsLetterOptionsService getNewsLetterOptionsService() {
        return newsLetterOptionsService;
    }

    @Required
    public void setNewsLetterOptionsService(NewsLetterOptionsService newsLetterOptionsService) {
        this.newsLetterOptionsService = newsLetterOptionsService;
    }

    public Converter<NewsLetterOptionsModel, NewsLetterOptionData> getNewsLetterOptionDataConverter() {
        return newsLetterOptionDataConverter;
    }

    @Required
    public void setNewsLetterOptionDataConverter(Converter<NewsLetterOptionsModel, NewsLetterOptionData> newsLetterOptionDataConverter) {
        this.newsLetterOptionDataConverter = newsLetterOptionDataConverter;
    }

    public UserService getUserService() {
        return userService;
    }

    @Required
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Converter<CustomerData, CustomerModel> getNewsLetterOptionReverseConverter() {
        return newsLetterOptionReverseConverter;
    }

    @Required
    public void setNewsLetterOptionReverseConverter(Converter<CustomerData, CustomerModel> newsLetterOptionReverseConverter) {
        this.newsLetterOptionReverseConverter = newsLetterOptionReverseConverter;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Required
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
