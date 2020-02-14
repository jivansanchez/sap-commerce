package de.hybris.training.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.UpdateProfileForm;

public class TrainingUpdateProfileForm extends UpdateProfileForm {

    private String [] selectedNewsLetterOptions;
    private String [] selectedContactPreferencesOptions;

    public String[] getSelectedNewsLetterOptions() {
        return selectedNewsLetterOptions;
    }
    public String[] getSelectedContactPreferencesOptions(){return selectedContactPreferencesOptions;}

    public void setSelectedNewsLetterOptions(String[] selectedNewsLetterOptions) {
        this.selectedNewsLetterOptions = selectedNewsLetterOptions;
    }

    public void setSelectedContactPreferencesOptions(String[] selectedContactPreferencesOptions) {
        this.selectedContactPreferencesOptions = selectedContactPreferencesOptions;
    }
}
