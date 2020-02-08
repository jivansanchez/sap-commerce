package de.hybris.training.core.services.impl;

import de.hybris.training.core.dao.NewsLetterDAO;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import de.hybris.training.core.services.NewsLetterOptionsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.security.access.method.P;

import java.util.List;

public class DefaultNewsLetterOptionsService implements NewsLetterOptionsService {

    private NewsLetterDAO newsLetterDAO;

    @Override
    public NewsLetterOptionsModel getNewsLetterOptionByCode(String optionCode) {
        if (StringUtils.isEmpty(optionCode)) {
            return null;
        } else {
            return this.getNewsLetterDAO().getNewsLetterOptionByCode(optionCode);
        }
    }

    @Override
    public List<NewsLetterOptionsModel> getAllNewsLetterOptions() {
        return this.getNewsLetterDAO().getAllNewsLetterOptions();
    }

    public NewsLetterDAO getNewsLetterDAO() {
        return newsLetterDAO;
    }

    @Required
    public void setNewsLetterDAO(NewsLetterDAO newsLetterDAO) {
        this.newsLetterDAO = newsLetterDAO;
    }
}
