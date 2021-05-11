// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.resourcemanager.databoxedge.fluent.models.OperationInner;
import com.azure.resourcemanager.databoxedge.models.Operation;
import com.azure.resourcemanager.databoxedge.models.OperationDisplay;
import com.azure.resourcemanager.databoxedge.models.ServiceSpecification;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    OperationImpl(OperationInner innerObject, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public ServiceSpecification serviceSpecification() {
        return this.innerModel().serviceSpecification();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
