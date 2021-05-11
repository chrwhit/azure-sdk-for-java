// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.resourcemanager.mariadb.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.mariadb.models.NameAvailability;

public final class NameAvailabilityImpl implements NameAvailability {
    private NameAvailabilityInner innerObject;

    private final com.azure.resourcemanager.mariadb.MariaDBManager serviceManager;

    NameAvailabilityImpl(
        NameAvailabilityInner innerObject, com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String message() {
        return this.innerModel().message();
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public NameAvailabilityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mariadb.MariaDBManager manager() {
        return this.serviceManager;
    }
}
