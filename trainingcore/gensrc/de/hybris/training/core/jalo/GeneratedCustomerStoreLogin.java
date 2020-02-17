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
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.CustomerStoreLogin MobileAdditionalInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomerStoreLogin extends GenericItem
{
	/** Qualifier of the <code>MobileAdditionalInfo.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>MobileAdditionalInfo.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>MobileAdditionalInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>MobileAdditionalInfo.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>MobileAdditionalInfo.isTouch</code> attribute **/
	public static final String ISTOUCH = "isTouch";
	/** Qualifier of the <code>MobileAdditionalInfo.factory</code> attribute **/
	public static final String FACTORY = "factory";
	/** Qualifier of the <code>MobileAdditionalInfo.isSmart</code> attribute **/
	public static final String ISSMART = "isSmart";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		tmp.put(ISTOUCH, AttributeMode.INITIAL);
		tmp.put(FACTORY, AttributeMode.INITIAL);
		tmp.put(ISSMART, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.factory</code> attribute.
	 * @return the factory
	 */
	public String getFactory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FACTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.factory</code> attribute.
	 * @return the factory
	 */
	public String getFactory()
	{
		return getFactory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.factory</code> attribute. 
	 * @param value the factory
	 */
	public void setFactory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FACTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.factory</code> attribute. 
	 * @param value the factory
	 */
	public void setFactory(final String value)
	{
		setFactory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.isSmart</code> attribute.
	 * @return the isSmart
	 */
	public Boolean isIsSmart(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISSMART);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.isSmart</code> attribute.
	 * @return the isSmart
	 */
	public Boolean isIsSmart()
	{
		return isIsSmart( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.isSmart</code> attribute. 
	 * @return the isSmart
	 */
	public boolean isIsSmartAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsSmart( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.isSmart</code> attribute. 
	 * @return the isSmart
	 */
	public boolean isIsSmartAsPrimitive()
	{
		return isIsSmartAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.isSmart</code> attribute. 
	 * @param value the isSmart
	 */
	public void setIsSmart(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISSMART,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.isSmart</code> attribute. 
	 * @param value the isSmart
	 */
	public void setIsSmart(final Boolean value)
	{
		setIsSmart( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.isSmart</code> attribute. 
	 * @param value the isSmart
	 */
	public void setIsSmart(final SessionContext ctx, final boolean value)
	{
		setIsSmart( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.isSmart</code> attribute. 
	 * @param value the isSmart
	 */
	public void setIsSmart(final boolean value)
	{
		setIsSmart( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.isTouch</code> attribute.
	 * @return the isTouch
	 */
	public Boolean isIsTouch(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISTOUCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.isTouch</code> attribute.
	 * @return the isTouch
	 */
	public Boolean isIsTouch()
	{
		return isIsTouch( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.isTouch</code> attribute. 
	 * @return the isTouch
	 */
	public boolean isIsTouchAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsTouch( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.isTouch</code> attribute. 
	 * @return the isTouch
	 */
	public boolean isIsTouchAsPrimitive()
	{
		return isIsTouchAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.isTouch</code> attribute. 
	 * @param value the isTouch
	 */
	public void setIsTouch(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISTOUCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.isTouch</code> attribute. 
	 * @param value the isTouch
	 */
	public void setIsTouch(final Boolean value)
	{
		setIsTouch( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.isTouch</code> attribute. 
	 * @param value the isTouch
	 */
	public void setIsTouch(final SessionContext ctx, final boolean value)
	{
		setIsTouch( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.isTouch</code> attribute. 
	 * @param value the isTouch
	 */
	public void setIsTouch(final boolean value)
	{
		setIsTouch( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.year</code> attribute.
	 * @return the year
	 */
	public String getYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MobileAdditionalInfo.year</code> attribute.
	 * @return the year
	 */
	public String getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MobileAdditionalInfo.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final String value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
