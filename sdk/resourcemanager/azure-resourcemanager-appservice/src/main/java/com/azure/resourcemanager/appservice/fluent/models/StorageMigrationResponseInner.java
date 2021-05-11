// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response for a migration of app content request. */
@JsonFlatten
@Immutable
public class StorageMigrationResponseInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageMigrationResponseInner.class);

    /*
     * When server starts the migration process, it will return an operation ID
     * identifying that particular migration operation.
     */
    @JsonProperty(value = "properties.operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /**
     * Get the operationId property: When server starts the migration process, it will return an operation ID
     * identifying that particular migration operation.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /** {@inheritDoc} */
    @Override
    public StorageMigrationResponseInner withKind(String kind) {
        super.withKind(kind);
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
    }
}
