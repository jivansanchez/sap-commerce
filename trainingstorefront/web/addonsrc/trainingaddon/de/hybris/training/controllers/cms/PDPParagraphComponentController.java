package de.hybris.training.controllers.cms;

import de.hybris.platform.addonsupport.controllers.cms.AbstractCMSAddOnComponentController;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.training.facade.TrainingProductFacade;
import de.hybris.training.model.CategoryProductsCarouselComponentModel;
import de.hybris.training.model.PDPParagraphComponentModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller(PDPParagraphComponentModel._TYPECODE+ "Controller")
@RequestMapping("/view/" + PDPParagraphComponentModel._TYPECODE+ "Controller")
public class PDPParagraphComponentController extends AbstractCMSAddOnComponentController<PDPParagraphComponentModel> {


    @Resource
    private TrainingProductFacade trainingProductFacade;


    @Override
    protected void fillModel(HttpServletRequest request, Model model, PDPParagraphComponentModel component) {
        String componentContent = component.getContent();

        model.addAttribute("data", componentContent);
    }
}
