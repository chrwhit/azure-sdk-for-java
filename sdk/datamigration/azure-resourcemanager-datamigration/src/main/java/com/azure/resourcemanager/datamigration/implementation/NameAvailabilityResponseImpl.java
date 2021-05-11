// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.resourcemanager.datamigration.fluent.models.NameAvailabilityResponseInner;
import com.azure.resourcemanager.datamigration.models.NameAvailabilityResponse;
import com.azure.resourcemanager.datamigration.models.NameCheckFailureReason;

public final class NameAvailabilityResponseImpl implements NameAvailabilityResponse {
    private NameAvailabilityResponseInner innerObject;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    NameAvailabilityResponseImpl(
        NameAvailabilityResponseInner innerObject,
        com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public NameCheckFailureReason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public NameAvailabilityResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }
}
