package de.hybris.training.facade;

import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

public interface TrainingProductFacade {

    List<ProductData> getProductsForCategory(String categoryCode);
}
