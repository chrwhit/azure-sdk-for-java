// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The managed identity for the Video Analyzer resource. */
@Fluent
public class VideoAnalyzerIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoAnalyzerIdentity.class);

    /*
     * The identity type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The User Assigned Managed Identities.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, UserAssignedManagedIdentity> userAssignedIdentities;

    /**
     * Get the type property: The identity type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     *
     * @param type the type value to set.
     * @return the VideoAnalyzerIdentity object itself.
     */
    public VideoAnalyzerIdentity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The User Assigned Managed Identities.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedManagedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The User Assigned Managed Identities.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the VideoAnalyzerIdentity object itself.
     */
    public VideoAnalyzerIdentity withUserAssignedIdentities(
        Map<String, UserAssignedManagedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model VideoAnalyzerIdentity"));
        }
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
