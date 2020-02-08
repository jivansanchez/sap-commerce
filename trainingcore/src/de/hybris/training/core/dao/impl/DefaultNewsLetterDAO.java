package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.NewsLetterDAO;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

public class DefaultNewsLetterDAO extends DefaultGenericDao<NewsLetterOptionsModel> implements NewsLetterDAO {

    private static final String FIND_NEWS_LETTER_OPTION_BY_CODE = "SELECT {" + NewsLetterOptionsModel.PK + "} FROM {"
            + NewsLetterOptionsModel._TYPECODE + "} WHERE {" + NewsLetterOptionsModel.CODE + "} = ?" + NewsLetterOptionsModel.CODE;
    private static final String FIND_ALL_NEWS_LETTER_OPTIONS = "SELECT {" + NewsLetterOptionsModel.PK + "} FROM {"
            + NewsLetterOptionsModel._TYPECODE + "} ";

    public DefaultNewsLetterDAO(String typecode) {
        super(typecode);
    }

    @Override
    public NewsLetterOptionsModel getNewsLetterOptionByCode(String optionCode) {
        validateParameterNotNullStandardMessage("optionCode", optionCode);
        //getFlexibleSearchService() comes from parent
        final SearchResult<NewsLetterOptionsModel> newsLetterOptions = getFlexibleSearchService().search(
                FIND_NEWS_LETTER_OPTION_BY_CODE, Collections.singletonMap(NewsLetterOptionsModel.CODE, optionCode));
        if (CollectionUtils.isNotEmpty(newsLetterOptions.getResult()) && CollectionUtils.size(newsLetterOptions.getResult()) == 1) {
            return newsLetterOptions.getResult().get(0);
        } else {
            return new NewsLetterOptionsModel();
        }
    }
    @Override
    public List<NewsLetterOptionsModel> getAllNewsLetterOptions() {
        //getFlexibleSearchService() comes from parent
        final SearchResult<NewsLetterOptionsModel> newsLetterOptions = getFlexibleSearchService().search(
                FIND_ALL_NEWS_LETTER_OPTIONS);
        if (CollectionUtils.isNotEmpty(newsLetterOptions.getResult())) {
            return newsLetterOptions.getResult();
        } else {
            return new ArrayList<>();
        }
    }

}
