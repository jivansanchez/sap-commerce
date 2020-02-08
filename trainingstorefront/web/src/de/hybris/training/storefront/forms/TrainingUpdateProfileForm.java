package de.hybris.training.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.UpdateProfileForm;

public class TrainingUpdateProfileForm extends UpdateProfileForm {

    private String [] selectedNewsLetterOptions;

    public String[] getSelectedNewsLetterOptions() {
        return selectedNewsLetterOptions;
    }

    public void setSelectedNewsLetterOptions(String[] selectedNewsLetterOptions) {
        this.selectedNewsLetterOptions = selectedNewsLetterOptions;
    }
}
