package de.hybris.training.core.services;

import de.hybris.training.core.model.NewsLetterOptionsModel;

import java.util.List;

public interface NewsLetterOptionsService {

    /**
     *
     * @param optionCode
     * @return
     */
    NewsLetterOptionsModel getNewsLetterOptionByCode(String optionCode);

    /**
     *
     * @return
     */
    List<NewsLetterOptionsModel> getAllNewsLetterOptions();
}
