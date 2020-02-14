package de.hybris.training.core.services.impl;

import de.hybris.training.core.dao.ContactPreferencesDAO;
import de.hybris.training.core.dao.NewsLetterDAO;
import de.hybris.training.core.model.ContactPreferencesOptionsModel;
import de.hybris.training.core.model.NewsLetterOptionsModel;
import de.hybris.training.core.services.ContactPreferencesOptionsService;
import de.hybris.training.core.services.NewsLetterOptionsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultContactPreferencesOptionsService implements ContactPreferencesOptionsService {

    private ContactPreferencesDAO contactPreferencesDAO;

    @Override
    public ContactPreferencesOptionsModel getContactPreferencesOptionsByCode(String optionCode) {
        if (StringUtils.isEmpty(optionCode)) {
            return null;
        } else {
            return this.getContactPreferencesOptionsDAO().getContactPreferencesOptionsByCode(optionCode);
        }
    }

    @Override
    public List<ContactPreferencesOptionsModel> getAllContactPreferencesOptions() {
        return this.getContactPreferencesOptionsDAO().getAllContactPreferencesOptions();
    }

    public ContactPreferencesDAO getContactPreferencesOptionsDAO() {
        return contactPreferencesDAO;
    }

    @Required
    public void setContactPreferencesDAO(ContactPreferencesDAO contactPreferencesDAO) {
        this.contactPreferencesDAO = contactPreferencesDAO;
    }


}
