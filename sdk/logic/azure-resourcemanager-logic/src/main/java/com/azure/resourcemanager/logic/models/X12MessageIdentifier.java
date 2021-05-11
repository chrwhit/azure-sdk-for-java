// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The X12 message identifier. */
@Fluent
public final class X12MessageIdentifier {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(X12MessageIdentifier.class);

    /*
     * The message id.
     */
    @JsonProperty(value = "messageId", required = true)
    private String messageId;

    /**
     * Get the messageId property: The message id.
     *
     * @return the messageId value.
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The message id.
     *
     * @param messageId the messageId value to set.
     * @return the X12MessageIdentifier object itself.
     */
    public X12MessageIdentifier withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (messageId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property messageId in model X12MessageIdentifier"));
        }
    }
}
