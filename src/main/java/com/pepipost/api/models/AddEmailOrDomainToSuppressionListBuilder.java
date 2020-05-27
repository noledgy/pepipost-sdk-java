/*
 * PepipostLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.pepipost.api.models;

import java.util.*;

public class AddEmailOrDomainToSuppressionListBuilder {
    //the instance to build
    private AddEmailOrDomainToSuppressionList addEmailOrDomainToSuppressionList;

    /**
     * Default constructor to initialize the instance
     */
    public AddEmailOrDomainToSuppressionListBuilder() {
        addEmailOrDomainToSuppressionList = new AddEmailOrDomainToSuppressionList();
    }

    /**
     * Add the domain to be suppressed here. We will not deliver emails to recipients email addresses with this domain.<br>\nComma separate the values to suppress multiple domains..
     */
    public AddEmailOrDomainToSuppressionListBuilder domain(String domain) {
        addEmailOrDomainToSuppressionList.setDomain(domain);
        return this;
    }

    /**
     * Add an email address to be suppressed here. We will not deliver emails to this email address.<br>\nComma separate the values to suppress multiple email addresses
     */
    public AddEmailOrDomainToSuppressionListBuilder email(String email) {
        addEmailOrDomainToSuppressionList.setEmail(email);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddEmailOrDomainToSuppressionList build() {
        return addEmailOrDomainToSuppressionList;
    }
}