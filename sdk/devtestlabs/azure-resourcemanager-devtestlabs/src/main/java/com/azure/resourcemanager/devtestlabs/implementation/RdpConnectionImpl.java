// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.resourcemanager.devtestlabs.fluent.models.RdpConnectionInner;
import com.azure.resourcemanager.devtestlabs.models.RdpConnection;

public final class RdpConnectionImpl implements RdpConnection {
    private RdpConnectionInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    RdpConnectionImpl(
        RdpConnectionInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String contents() {
        return this.innerModel().contents();
    }

    public RdpConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }
}
