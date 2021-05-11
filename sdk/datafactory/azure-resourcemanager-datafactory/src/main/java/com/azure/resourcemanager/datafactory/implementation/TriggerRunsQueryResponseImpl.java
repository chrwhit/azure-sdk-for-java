// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.TriggerRunsQueryResponseInner;
import com.azure.resourcemanager.datafactory.models.TriggerRun;
import com.azure.resourcemanager.datafactory.models.TriggerRunsQueryResponse;
import java.util.Collections;
import java.util.List;

public final class TriggerRunsQueryResponseImpl implements TriggerRunsQueryResponse {
    private TriggerRunsQueryResponseInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    TriggerRunsQueryResponseImpl(
        TriggerRunsQueryResponseInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<TriggerRun> value() {
        List<TriggerRun> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String continuationToken() {
        return this.innerModel().continuationToken();
    }

    public TriggerRunsQueryResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
