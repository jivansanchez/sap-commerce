package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import de.hybris.training.facades.newsletter.data.NewsLetterOptionData;

public class NewsLetterOptionsPopulator implements Populator<NewsLetterOptionsModel, NewsLetterOptionData> {

    @Override
    public void populate(NewsLetterOptionsModel source, NewsLetterOptionData target) throws ConversionException {
        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setDescription(source.getDescription());
    }
}
