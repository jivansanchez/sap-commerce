package de.hybris.training.facades.newsletter;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.training.facades.newsletter.data.NewsLetterOptionData;

import java.util.List;

public interface NewsLetterOptionsFacade {

    /**
     *
     * @return
     */
    List<NewsLetterOptionData> getAllNewsLetterOptions();

    /**
     *
     * @param customerData
     * @return
     */
    Boolean saveNewsLetterOptionsForCurrentCustomer(CustomerData customerData);
}
