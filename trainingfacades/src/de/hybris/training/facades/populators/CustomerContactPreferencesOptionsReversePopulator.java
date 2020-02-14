package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import de.hybris.training.core.services.NewsLetterOptionsService;
import de.hybris.training.facades.newsletter.data.NewsLetterOptionData;
import org.springframework.beans.factory.annotation.Required;

import java.util.HashSet;
import java.util.Set;

public class CustomerNewsLetterOptionsReversePopulator implements Populator<CustomerData, CustomerModel>  {

    private NewsLetterOptionsService newsLetterOptionsService;

    @Override
    public void populate(CustomerData customerData, CustomerModel customerModel) throws ConversionException {
        Set<NewsLetterOptionsModel> newsLetterOptionsModels = new HashSet<>();

        for (NewsLetterOptionData newsLetterOptionData : customerData.getNewsLetterOptions()) {
            newsLetterOptionsModels.add(this.getNewsLetterOptionsService().getNewsLetterOptionByCode(newsLetterOptionData.getCode()));
        }

        customerModel.setNewsLetterOption(newsLetterOptionsModels);
    }

    public NewsLetterOptionsService getNewsLetterOptionsService() {
        return newsLetterOptionsService;
    }

    @Required
    public void setNewsLetterOptionsService(NewsLetterOptionsService newsLetterOptionsService) {
        this.newsLetterOptionsService = newsLetterOptionsService;
    }
}
