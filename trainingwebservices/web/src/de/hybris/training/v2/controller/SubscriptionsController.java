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
package de.hybris.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.user.SubscriptionsWsDTO;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import de.hybris.platform.webservicescommons.errors.exceptions.WebserviceValidationException;
import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/{baseSiteId}/subcriptions/{subscriptionCode}")
@CacheControl(directive = CacheControlDirective.PRIVATE)
@Api(tags = " Subscriptions")
public class SubscriptionsController extends BaseController
{
	private static final Logger LOG = Logger.getLogger(SubscriptionsController.class);

	@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_GUEST", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	@ApiOperation(hidden = true, value = "Creates a new address.", notes = "Creates a new address.")
	@ApiImplicitParams(
	{ @ApiImplicitParam(name = "baseSiteId", value = "Base site identifier", required = true, dataType = "String", paramType = "path"),
			@ApiImplicitParam(name = "subscriptionCode", value = "Subscrioption identifier", required = true, dataType = "String", paramType = "path"),
			@ApiImplicitParam(name = "code", value = "Subscription Code", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "description", value = "Subscription description", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "customer.customerId", value = "Customer Id for Subscription", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "product.productCode", value = "Product Identifier for Subscription", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "deliveryDate", value = "Date when delivery will be sent", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "paymentCode", value = "Payment Identifier", required = false, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "bankCode", value = "Bank where payment was done.", required = false, dataType = "String", paramType = "query")})
	public SubscriptionsWsDTO createSubscription(final HttpServletRequest request,
											@ApiParam(value = "Response configuration. This is the list of fields that should be returned in the response body.", allowableValues = "BASIC, DEFAULT, FULL") @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields)
			throws WebserviceValidationException //NOSONAR
	{
		final SubscriptionsWsDTO subscriptionsData = new SubscriptionsWsDTO();
		return getDataMapper().map(subscriptionsData, SubscriptionsWsDTO.class, fields);
	}
}
