// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The AssignmentPrincipal. */
@Fluent
public final class AssignmentPrincipal {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AssignmentPrincipal.class);

    /*
     * The principal id being assigned to.
     */
    @JsonProperty(value = "principalId", required = true)
    private String principalId;

    /*
     * The Type of the principal ID.
     */
    @JsonProperty(value = "principalType", required = true)
    private String principalType;

    /*
     * Other metadata for the principal.
     */
    @JsonProperty(value = "principalMetadata")
    private Map<String, String> principalMetadata;

    /**
     * Get the principalId property: The principal id being assigned to.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal id being assigned to.
     *
     * @param principalId the principalId value to set.
     * @return the AssignmentPrincipal object itself.
     */
    public AssignmentPrincipal withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the principalType property: The Type of the principal ID.
     *
     * @return the principalType value.
     */
    public String principalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: The Type of the principal ID.
     *
     * @param principalType the principalType value to set.
     * @return the AssignmentPrincipal object itself.
     */
    public AssignmentPrincipal withPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the principalMetadata property: Other metadata for the principal.
     *
     * @return the principalMetadata value.
     */
    public Map<String, String> principalMetadata() {
        return this.principalMetadata;
    }

    /**
     * Set the principalMetadata property: Other metadata for the principal.
     *
     * @param principalMetadata the principalMetadata value to set.
     * @return the AssignmentPrincipal object itself.
     */
    public AssignmentPrincipal withPrincipalMetadata(Map<String, String> principalMetadata) {
        this.principalMetadata = principalMetadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (principalId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property principalId in model AssignmentPrincipal"));
        }
        if (principalType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property principalType in model AssignmentPrincipal"));
        }
    }
}
