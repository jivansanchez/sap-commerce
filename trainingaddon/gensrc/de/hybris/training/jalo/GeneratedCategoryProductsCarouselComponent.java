/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 16, 2020 1:58:11 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.training.jalo;

import de.hybris.platform.cms2lib.components.ProductCarouselComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.training.constants.TrainingaddonConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2lib.components.ProductCarouselComponent CategoryProductsCarouselComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCategoryProductsCarouselComponent extends ProductCarouselComponent
{
	/** Qualifier of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute **/
	public static final String MAXPRODUCTS = "maxProducts";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ProductCarouselComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MAXPRODUCTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute.
	 * @return the maxProducts
	 */
	public Integer getMaxProducts(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute.
	 * @return the maxProducts
	 */
	public Integer getMaxProducts()
	{
		return getMaxProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute. 
	 * @return the maxProducts
	 */
	public int getMaxProductsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxProducts( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute. 
	 * @return the maxProducts
	 */
	public int getMaxProductsAsPrimitive()
	{
		return getMaxProductsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute. 
	 * @param value the maxProducts
	 */
	public void setMaxProducts(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute. 
	 * @param value the maxProducts
	 */
	public void setMaxProducts(final Integer value)
	{
		setMaxProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute. 
	 * @param value the maxProducts
	 */
	public void setMaxProducts(final SessionContext ctx, final int value)
	{
		setMaxProducts( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryProductsCarouselComponent.maxProducts</code> attribute. 
	 * @param value the maxProducts
	 */
	public void setMaxProducts(final int value)
	{
		setMaxProducts( getSession().getSessionContext(), value );
	}
	
}
