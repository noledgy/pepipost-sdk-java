/*
 * PepipostLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.pepipost.api.models;

import java.util.*;

public class PersonalizationsBuilder {
    //the instance to build
    private Personalizations personalizations;

    /**
     * Default constructor to initialize the instance
     */
    public PersonalizationsBuilder() {
        personalizations = new Personalizations();
    }

    /**
     * Dynamic attributes
     */
    public PersonalizationsBuilder attributes(Object attributes) {
        personalizations.setAttributes(attributes);
        return this;
    }

    /**
     * Dynamic headers attributes
     */
    public PersonalizationsBuilder headers(Object headers) {
        personalizations.setHeaders(headers);
        return this;
    }

    /**
     * Attachments to individuals recipient
     */
    public PersonalizationsBuilder attachments(List<Attachments> attachments) {
        personalizations.setAttachments(attachments);
        return this;
    }

    /**
     * To email-address
     */
    public PersonalizationsBuilder to(List<EmailStruct> to) {
        personalizations.setTo(to);
        return this;
    }

    /**
     * CC email-address
     */
    public PersonalizationsBuilder cc(List<EmailStruct> cc) {
        personalizations.setCc(cc);
        return this;
    }

    /**
     * Bcc email-addresses
     */
    public PersonalizationsBuilder bcc(List<EmailStruct> bcc) {
        personalizations.setBcc(bcc);
        return this;
    }

    /**
     * token to which is json string
     */
    public PersonalizationsBuilder tokenTo(String tokenTo) {
        personalizations.setTokenTo(tokenTo);
        return this;
    }

    /**
     * token cc which is json string
     */
    public PersonalizationsBuilder tokenCc(String tokenCc) {
        personalizations.setTokenCc(tokenCc);
        return this;
    }

    /**
     * token bcc which is json string
     */
    public PersonalizationsBuilder tokenBcc(String tokenBcc) {
        personalizations.setTokenBcc(tokenBcc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Personalizations build() {
        return personalizations;
    }
}