package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import de.hybris.training.core.model.NewsLetterOptionsModel;

import java.util.List;

public interface NewsLetterDAO extends GenericDao<NewsLetterOptionsModel> {

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
