/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.training.constants;

/**
 * Global class for all Trainingaddon web constants. You can add global constants for your extension into this class.
 */
public final class TrainingaddonWebConstants // NOSONAR
{
	private TrainingaddonWebConstants()
	{
		//empty to avoid instantiating this constant class
	}

	// implement here constants used by this extension
	final static int TEN_PRODUCTS = 10;

	public static int getTenProducts() {
		return TEN_PRODUCTS;
	}
}
