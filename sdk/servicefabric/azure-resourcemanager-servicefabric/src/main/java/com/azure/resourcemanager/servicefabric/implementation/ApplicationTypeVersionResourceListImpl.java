// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeVersionResourceInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeVersionResourceListInner;
import com.azure.resourcemanager.servicefabric.models.ApplicationTypeVersionResource;
import com.azure.resourcemanager.servicefabric.models.ApplicationTypeVersionResourceList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ApplicationTypeVersionResourceListImpl implements ApplicationTypeVersionResourceList {
    private ApplicationTypeVersionResourceListInner innerObject;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    ApplicationTypeVersionResourceListImpl(
        ApplicationTypeVersionResourceListInner innerObject,
        com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ApplicationTypeVersionResource> value() {
        List<ApplicationTypeVersionResourceInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ApplicationTypeVersionResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ApplicationTypeVersionResourceListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }
}
