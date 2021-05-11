// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Details of the data collection options specified. */
@Immutable
public final class AciServiceResponseDataCollection extends ModelDataCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AciServiceResponseDataCollection.class);

    /** {@inheritDoc} */
    @Override
    public AciServiceResponseDataCollection withEventHubEnabled(Boolean eventHubEnabled) {
        super.withEventHubEnabled(eventHubEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceResponseDataCollection withStorageEnabled(Boolean storageEnabled) {
        super.withStorageEnabled(storageEnabled);
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
