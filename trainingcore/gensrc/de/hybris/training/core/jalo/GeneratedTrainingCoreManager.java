/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 8, 2020 5:10:11 AM                      ---
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

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.ApparelProduct;
import de.hybris.training.core.jalo.ApparelSizeVariantProduct;
import de.hybris.training.core.jalo.ApparelStyleVariantProduct;
import de.hybris.training.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.training.core.jalo.NewsLetterOptions;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	/** Relation ordering override parameter constants for Customer2Options from ((trainingcore))*/
	protected static String CUSTOMER2OPTIONS_SRC_ORDERED = "relation.Customer2Options.source.ordered";
	protected static String CUSTOMER2OPTIONS_TGT_ORDERED = "relation.Customer2Options.target.ordered";
	/** Relation disable markmodifed parameter constants for Customer2Options from ((trainingcore))*/
	protected static String CUSTOMER2OPTIONS_MARKMODIFIED = "relation.Customer2Options.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public NewsLetterOptions createNewsLetterOptions(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.NEWSLETTEROPTIONS );
			return (NewsLetterOptions)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NewsLetterOptions : "+e.getMessage(), 0 );
		}
	}
	
	public NewsLetterOptions createNewsLetterOptions(final Map attributeValues)
	{
		return createNewsLetterOptions( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newsLetterOption</code> attribute.
	 * @return the newsLetterOption
	 */
	public Set<NewsLetterOptions> getNewsLetterOption(final SessionContext ctx, final Customer item)
	{
		final List<NewsLetterOptions> items = item.getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			"NewsLetterOptions",
			null,
			false,
			false
		);
		return new LinkedHashSet<NewsLetterOptions>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newsLetterOption</code> attribute.
	 * @return the newsLetterOption
	 */
	public Set<NewsLetterOptions> getNewsLetterOption(final Customer item)
	{
		return getNewsLetterOption( getSession().getSessionContext(), item );
	}
	
	public long getNewsLetterOptionCount(final SessionContext ctx, final Customer item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			"NewsLetterOptions",
			null
		);
	}
	
	public long getNewsLetterOptionCount(final Customer item)
	{
		return getNewsLetterOptionCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newsLetterOption</code> attribute. 
	 * @param value the newsLetterOption
	 */
	public void setNewsLetterOption(final SessionContext ctx, final Customer item, final Set<NewsLetterOptions> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2OPTIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newsLetterOption</code> attribute. 
	 * @param value the newsLetterOption
	 */
	public void setNewsLetterOption(final Customer item, final Set<NewsLetterOptions> value)
	{
		setNewsLetterOption( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to newsLetterOption. 
	 * @param value the item to add to newsLetterOption
	 */
	public void addToNewsLetterOption(final SessionContext ctx, final Customer item, final NewsLetterOptions value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2OPTIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to newsLetterOption. 
	 * @param value the item to add to newsLetterOption
	 */
	public void addToNewsLetterOption(final Customer item, final NewsLetterOptions value)
	{
		addToNewsLetterOption( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from newsLetterOption. 
	 * @param value the item to remove from newsLetterOption
	 */
	public void removeFromNewsLetterOption(final SessionContext ctx, final Customer item, final NewsLetterOptions value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.CUSTOMER2OPTIONS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2OPTIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from newsLetterOption. 
	 * @param value the item to remove from newsLetterOption
	 */
	public void removeFromNewsLetterOption(final Customer item, final NewsLetterOptions value)
	{
		removeFromNewsLetterOption( getSession().getSessionContext(), item, value );
	}
	
}
