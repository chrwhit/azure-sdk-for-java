// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.resourcemanager.machinelearningservices.fluent.models.UpdateWorkspaceQuotasResultInner;
import com.azure.resourcemanager.machinelearningservices.models.UpdateWorkspaceQuotas;
import com.azure.resourcemanager.machinelearningservices.models.UpdateWorkspaceQuotasResult;
import java.util.Collections;
import java.util.List;

public final class UpdateWorkspaceQuotasResultImpl implements UpdateWorkspaceQuotasResult {
    private UpdateWorkspaceQuotasResultInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    UpdateWorkspaceQuotasResultImpl(
        UpdateWorkspaceQuotasResultInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<UpdateWorkspaceQuotas> value() {
        List<UpdateWorkspaceQuotas> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public UpdateWorkspaceQuotasResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
