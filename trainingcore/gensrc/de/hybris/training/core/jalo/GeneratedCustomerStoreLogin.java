/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 10, 2020 11:56:44 AM                    ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.CustomerStoreLogin TripodsAdditionalData}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomerStoreLogin extends GenericItem
{
	/** Qualifier of the <code>TripodsAdditionalData.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TripodsAdditionalData.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>TripodsAdditionalData.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>TripodsAdditionalData.brand</code> attribute **/
	public static final String BRAND = "brand";
	/** Qualifier of the <code>TripodsAdditionalData.color</code> attribute **/
	public static final String COLOR = "color";
	/** Qualifier of the <code>TripodsAdditionalData.isNew</code> attribute **/
	public static final String ISNEW = "isNew";
	/** Qualifier of the <code>TripodsAdditionalData.isPortatil</code> attribute **/
	public static final String ISPORTATIL = "isPortatil";
	/** Qualifier of the <code>TripodsAdditionalData.high</code> attribute **/
	public static final String HIGH = "high";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(BRAND, AttributeMode.INITIAL);
		tmp.put(COLOR, AttributeMode.INITIAL);
		tmp.put(ISNEW, AttributeMode.INITIAL);
		tmp.put(ISPORTATIL, AttributeMode.INITIAL);
		tmp.put(HIGH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.brand</code> attribute.
	 * @return the brand
	 */
	public String getBrand(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.brand</code> attribute.
	 * @return the brand
	 */
	public String getBrand()
	{
		return getBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.brand</code> attribute. 
	 * @param value the brand
	 */
	public void setBrand(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.brand</code> attribute. 
	 * @param value the brand
	 */
	public void setBrand(final String value)
	{
		setBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.color</code> attribute.
	 * @return the color
	 */
	public String getColor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COLOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.color</code> attribute.
	 * @return the color
	 */
	public String getColor()
	{
		return getColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.color</code> attribute. 
	 * @param value the color
	 */
	public void setColor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COLOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.color</code> attribute. 
	 * @param value the color
	 */
	public void setColor(final String value)
	{
		setColor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.high</code> attribute.
	 * @return the high
	 */
	public Integer getHigh(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HIGH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.high</code> attribute.
	 * @return the high
	 */
	public Integer getHigh()
	{
		return getHigh( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.high</code> attribute. 
	 * @return the high
	 */
	public int getHighAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHigh( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.high</code> attribute. 
	 * @return the high
	 */
	public int getHighAsPrimitive()
	{
		return getHighAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.high</code> attribute. 
	 * @param value the high
	 */
	public void setHigh(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HIGH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.high</code> attribute. 
	 * @param value the high
	 */
	public void setHigh(final Integer value)
	{
		setHigh( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.high</code> attribute. 
	 * @param value the high
	 */
	public void setHigh(final SessionContext ctx, final int value)
	{
		setHigh( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.high</code> attribute. 
	 * @param value the high
	 */
	public void setHigh(final int value)
	{
		setHigh( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.isNew</code> attribute.
	 * @return the isNew
	 */
	public Boolean isIsNew(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISNEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.isNew</code> attribute.
	 * @return the isNew
	 */
	public Boolean isIsNew()
	{
		return isIsNew( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.isNew</code> attribute. 
	 * @return the isNew
	 */
	public boolean isIsNewAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsNew( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.isNew</code> attribute. 
	 * @return the isNew
	 */
	public boolean isIsNewAsPrimitive()
	{
		return isIsNewAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISNEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final Boolean value)
	{
		setIsNew( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final SessionContext ctx, final boolean value)
	{
		setIsNew( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final boolean value)
	{
		setIsNew( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.isPortatil</code> attribute.
	 * @return the isPortatil
	 */
	public Boolean isIsPortatil(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISPORTATIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.isPortatil</code> attribute.
	 * @return the isPortatil
	 */
	public Boolean isIsPortatil()
	{
		return isIsPortatil( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.isPortatil</code> attribute. 
	 * @return the isPortatil
	 */
	public boolean isIsPortatilAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsPortatil( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.isPortatil</code> attribute. 
	 * @return the isPortatil
	 */
	public boolean isIsPortatilAsPrimitive()
	{
		return isIsPortatilAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.isPortatil</code> attribute. 
	 * @param value the isPortatil
	 */
	public void setIsPortatil(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISPORTATIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.isPortatil</code> attribute. 
	 * @param value the isPortatil
	 */
	public void setIsPortatil(final Boolean value)
	{
		setIsPortatil( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.isPortatil</code> attribute. 
	 * @param value the isPortatil
	 */
	public void setIsPortatil(final SessionContext ctx, final boolean value)
	{
		setIsPortatil( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.isPortatil</code> attribute. 
	 * @param value the isPortatil
	 */
	public void setIsPortatil(final boolean value)
	{
		setIsPortatil( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TripodsAdditionalData.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TripodsAdditionalData.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
