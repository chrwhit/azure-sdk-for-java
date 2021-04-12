// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Integration runtime debug resource. */
@Fluent
public final class IntegrationRuntimeDebugResource extends SubResourceDebugResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationRuntimeDebugResource.class);

    /*
     * Integration runtime properties.
     */
    @JsonProperty(value = "properties", required = true)
    private IntegrationRuntime properties;

    /**
     * Get the properties property: Integration runtime properties.
     *
     * @return the properties value.
     */
    public IntegrationRuntime properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Integration runtime properties.
     *
     * @param properties the properties value to set.
     * @return the IntegrationRuntimeDebugResource object itself.
     */
    public IntegrationRuntimeDebugResource withProperties(IntegrationRuntime properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IntegrationRuntimeDebugResource withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model IntegrationRuntimeDebugResource"));
        } else {
            properties().validate();
        }
    }
}
