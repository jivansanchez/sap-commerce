package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import de.hybris.training.facades.newsletter.data.NewsLetterOptionData;

import java.util.HashSet;
import java.util.Set;

public class CustomerNewsLetterOptionsPopulator implements Populator<CustomerModel, CustomerData>  {

    @Override
    public void populate(CustomerModel customerModel, CustomerData customerData) throws ConversionException {
        Set<NewsLetterOptionData> letterOptionDataSet = new HashSet<>();

        for (NewsLetterOptionsModel newsLetterOptionsModel : customerModel.getNewsLetterOption()) {
            NewsLetterOptionData newsLetterOptionData = new NewsLetterOptionData();
            newsLetterOptionData.setCode(newsLetterOptionsModel.getCode());
            newsLetterOptionData.setName(newsLetterOptionsModel.getName());
            newsLetterOptionData.setDescription(newsLetterOptionsModel.getDescription());
            letterOptionDataSet.add(newsLetterOptionData);
        }

        customerData.setNewsLetterOptions(letterOptionDataSet);
    }
}
