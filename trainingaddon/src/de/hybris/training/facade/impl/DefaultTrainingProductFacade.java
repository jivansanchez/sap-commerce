package de.hybris.training.facade.impl;

import de.hybris.platform.category.CategoryService;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.facade.TrainingProductFacade;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.List;

public class DefaultTrainingProductFacade  implements TrainingProductFacade {

    private CategoryService categoryService;
    private ProductService productService;
    private Converter<ProductModel, ProductData> productConverter;

    @Override
    public List<ProductData> getProductsForCategory(String categoryCode) {
        if (StringUtils.isEmpty(categoryCode)) {
            return new ArrayList<>();
        }

        CategoryModel categoryModel = categoryService.getCategoryForCode(categoryCode);

        if (categoryModel != null) {
            List<ProductModel> productModelList =  categoryModel.getProducts();

            if (CollectionUtils.isNotEmpty(productModelList)) {
                return  this.getProductConverter().convertAll(productModelList);
            }
        }

        return new ArrayList<>();
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    @Required
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public ProductService getProductService() {
        return productService;
    }

    @Required
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public Converter<ProductModel, ProductData> getProductConverter() {
        return productConverter;
    }

    @Required
    public void setProductConverter(Converter<ProductModel, ProductData> productConverter) {
        this.productConverter = productConverter;
    }
}
