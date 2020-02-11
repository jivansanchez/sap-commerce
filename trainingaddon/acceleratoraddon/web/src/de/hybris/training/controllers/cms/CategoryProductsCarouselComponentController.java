package de.hybris.training.controllers.cms;

import de.hybris.platform.addonsupport.controllers.cms.AbstractCMSAddOnComponentController;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.training.facade.TrainingProductFacade;
import de.hybris.training.model.CategoryProductsCarouselComponentModel;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller(CategoryProductsCarouselComponentModel._TYPECODE+ "Controller")
@RequestMapping("/view/" + CategoryProductsCarouselComponentModel._TYPECODE+ "Controller")
public class CategoryProductsCarouselComponentController extends AbstractCMSAddOnComponentController<CategoryProductsCarouselComponentModel> {


    @Resource
    private TrainingProductFacade trainingProductFacade;


    @Override
    protected void fillModel(HttpServletRequest request, Model model, CategoryProductsCarouselComponentModel component) {
        String categoryCode = component.getCategoryCode();

        final List<ProductData> products = new ArrayList<>();
        Integer maxProducts = component.getMaxProducts();

        List<ProductData> productsFacade = trainingProductFacade.getProductsForCategory(categoryCode);

        if(maxProducts != null && CollectionUtils.isNotEmpty(productsFacade)){
            for (int i =0; i<maxProducts; i++) {
                products.add(productsFacade.get(i));
            }
        }

        model.addAttribute("title", component.getTitle());
        model.addAttribute("productData", products);
    }
}
