<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<div class="account-section-header">
    <div class="row">
        <div class="container-lg col-md-6">
            <spring:theme code="text.account.profile.updatePersonalDetails"/>
        </div>
    </div>
</div>
<div class="row">
    <div class="container-lg col-md-6">
        <div class="account-section-content">
            <div class="account-section-form">
                <form:form action="update-profile" method="post" commandName="updateProfileForm">

                    <formElement:formSelectBox idKey="profile.title" labelKey="profile.title" path="titleCode" mandatory="true" skipBlank="false" skipBlankMessageKey="form.select.empty" items="${titleData}" selectCSSClass="form-control"/>
                    <formElement:formInputBox idKey="profile.firstName" labelKey="profile.firstName" path="firstName" inputCSS="text" mandatory="true"/>
                    <formElement:formInputBox idKey="profile.lastName" labelKey="profile.lastName" path="lastName" inputCSS="text" mandatory="true"/>

                    <div class="account-section-header">
                        <div class="row">
                            <div class="col-md-6">
                                <spring:theme code="text.account.profile.updatePersonalDetails.newsletteroptions"/>
                            </div>
                        </div>
                    </div>


                    <c:forEach var="newsLetterOption" items="${avilableNewsLetterOptions}" varStatus="status">
                        <c:set var="checked" value=""/>
                        <c:forEach var="newsLetterOptionSelected" items="${selectedNewsLetterOptions}" varStatus="statusSelected">
                            <c:if test="${newsLetterOptionSelected.code eq newsLetterOption.code}">
                                <c:set var="checked" value="checked"/>
                            </c:if>
                        </c:forEach>
                        <form:checkbox id="${newsLetterOption.code}"
                                       label="${newsLetterOption.name}"
                                       value="${newsLetterOption.code}"
                                       path="selectedNewsLetterOptions"
                                       cssClass="newsLetterOption"
                                       checked="${checked}"/> &nbsp;
                    </c:forEach>


                    <div class="account-section-header">
                        <div class="row">
                            <div class="col-md-6">
                                <spring:theme code="text.account.profile.updatePersonalDetails.contactPreferencesOptions"/>
                            </div>
                        </div>
                    </div>

                    <c:forEach var="contactPreferencesOption" items="${avilableContactPreferencesOptions}" varStatus="status">
                        <c:set var="checked" value=""/>
                        <c:forEach var="contactPreferencesOptionSelected" items="${selectedContactPreferencesOptions}" varStatus="statusSelected">
                            <c:if test="${contactPreferencesOptionSelected.code eq contactPreferencesOption.code}">
                                <c:set var="checked" value="checked"/>
                            </c:if>
                        </c:forEach>
                        <form:checkbox id="${contactPreferencesOption.code}"
                                       label="${contactPreferencesOption.name}"
                                       value="${contactPreferencesOption.code}"
                                       path="selectedContactPreferencesOptions"
                                       cssClass="contactPreferencesOption"
                                       checked="${checked}"/> &nbsp;
                    </c:forEach>

                    <div class="row">
                        <div class="col-sm-6 col-sm-push-6">
                            <div class="accountActions">
                                <ycommerce:testId code="personalDetails_savePersonalDetails_button">
                                    <button type="button" class="btn btn-primary btn-block js-profileFormUpdateButton">
                                        <spring:theme code="text.account.profile.saveUpdates" text="Save Updates"/>
                                    </button>
                                </ycommerce:testId>
                            </div>
                        </div>
                        <div class="col-sm-6 col-sm-pull-6">
                            <div class="accountActions">
                                <ycommerce:testId code="personalDetails_cancelPersonalDetails_button">
                                    <button type="button" class="btn btn-default btn-block backToHome">
                                        <spring:theme code="text.account.profile.cancel" text="Cancel"/>
                                    </button>
                                </ycommerce:testId>
                            </div>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>