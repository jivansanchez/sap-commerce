/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 9, 2020 6:44:59 AM                      ---
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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.NewsLetterOptions NewsLetterOptions}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNewsLetterOptions extends GenericItem
{
	/** Qualifier of the <code>NewsLetterOptions.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>NewsLetterOptions.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>NewsLetterOptions.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>NewsLetterOptions.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Relation ordering override parameter constants for Customer2Options from ((trainingcore))*/
	protected static String CUSTOMER2OPTIONS_SRC_ORDERED = "relation.Customer2Options.source.ordered";
	protected static String CUSTOMER2OPTIONS_TGT_ORDERED = "relation.Customer2Options.target.ordered";
	/** Relation disable markmodifed parameter constants for Customer2Options from ((trainingcore))*/
	protected static String CUSTOMER2OPTIONS_MARKMODIFIED = "relation.Customer2Options.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.code</code> attribute.
	 * @return the code - Code of the newsLetter option.
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.code</code> attribute.
	 * @return the code - Code of the newsLetter option.
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.code</code> attribute. 
	 * @param value the code - Code of the newsLetter option.
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.code</code> attribute. 
	 * @param value the code - Code of the newsLetter option.
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.customer</code> attribute.
	 * @return the customer
	 */
	public Collection<Customer> getCustomer(final SessionContext ctx)
	{
		final List<Customer> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			"Customer",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.customer</code> attribute.
	 * @return the customer
	 */
	public Collection<Customer> getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	public long getCustomerCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			"Customer",
			null
		);
	}
	
	public long getCustomerCount()
	{
		return getCustomerCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Collection<Customer> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2OPTIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Collection<Customer> value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customer. 
	 * @param value the item to add to customer
	 */
	public void addToCustomer(final SessionContext ctx, final Customer value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2OPTIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customer. 
	 * @param value the item to add to customer
	 */
	public void addToCustomer(final Customer value)
	{
		addToCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customer. 
	 * @param value the item to remove from customer
	 */
	public void removeFromCustomer(final SessionContext ctx, final Customer value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2OPTIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customer. 
	 * @param value the item to remove from customer
	 */
	public void removeFromCustomer(final Customer value)
	{
		removeFromCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.description</code> attribute.
	 * @return the description - Description of the newsLetter option.
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewsLetterOptions.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.description</code> attribute.
	 * @return the description - Description of the newsLetter option.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.description</code> attribute. 
	 * @return the localized description - Description of the newsLetter option.
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.description</code> attribute. 
	 * @return the localized description - Description of the newsLetter option.
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.description</code> attribute. 
	 * @param value the description - Description of the newsLetter option.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewsLetterOptions.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.description</code> attribute. 
	 * @param value the description - Description of the newsLetter option.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.description</code> attribute. 
	 * @param value the description - Description of the newsLetter option.
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.description</code> attribute. 
	 * @param value the description - Description of the newsLetter option.
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Customer");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(CUSTOMER2OPTIONS_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.name</code> attribute.
	 * @return the name - Name of the newsLetter option.
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewsLetterOptions.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.name</code> attribute.
	 * @return the name - Name of the newsLetter option.
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.name</code> attribute. 
	 * @return the localized name - Name of the newsLetter option.
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterOptions.name</code> attribute. 
	 * @return the localized name - Name of the newsLetter option.
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.name</code> attribute. 
	 * @param value the name - Name of the newsLetter option.
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewsLetterOptions.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.name</code> attribute. 
	 * @param value the name - Name of the newsLetter option.
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.name</code> attribute. 
	 * @param value the name - Name of the newsLetter option.
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterOptions.name</code> attribute. 
	 * @param value the name - Name of the newsLetter option.
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}
