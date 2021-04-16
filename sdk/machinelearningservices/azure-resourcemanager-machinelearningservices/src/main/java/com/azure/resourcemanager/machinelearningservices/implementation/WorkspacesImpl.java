// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.WorkspacesClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ListWorkspaceKeysResultInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.NotebookAccessTokenResultInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.machinelearningservices.models.ListWorkspaceKeysResult;
import com.azure.resourcemanager.machinelearningservices.models.NotebookAccessTokenResult;
import com.azure.resourcemanager.machinelearningservices.models.Workspace;
import com.azure.resourcemanager.machinelearningservices.models.Workspaces;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkspacesImpl implements Workspaces {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspacesImpl.class);

    private final WorkspacesClient innerClient;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    public WorkspacesImpl(
        WorkspacesClient innerClient,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Workspace getByResourceGroup(String resourceGroupName, String workspaceName) {
        WorkspaceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, workspaceName);
        if (inner != null) {
            return new WorkspaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Workspace> getByResourceGroupWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<WorkspaceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkspaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String workspaceName) {
        this.serviceClient().delete(resourceGroupName, workspaceName);
    }

    public void delete(String resourceGroupName, String workspaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, context);
    }

    public PagedIterable<Workspace> listByResourceGroup(String resourceGroupName) {
        PagedIterable<WorkspaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new WorkspaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Workspace> listByResourceGroup(String resourceGroupName, String skip, Context context) {
        PagedIterable<WorkspaceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, skip, context);
        return Utils.mapPage(inner, inner1 -> new WorkspaceImpl(inner1, this.manager()));
    }

    public ListWorkspaceKeysResult listKeys(String resourceGroupName, String workspaceName) {
        ListWorkspaceKeysResultInner inner = this.serviceClient().listKeys(resourceGroupName, workspaceName);
        if (inner != null) {
            return new ListWorkspaceKeysResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListWorkspaceKeysResult> listKeysWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<ListWorkspaceKeysResultInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ListWorkspaceKeysResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void resyncKeys(String resourceGroupName, String workspaceName) {
        this.serviceClient().resyncKeys(resourceGroupName, workspaceName);
    }

    public void resyncKeys(String resourceGroupName, String workspaceName, Context context) {
        this.serviceClient().resyncKeys(resourceGroupName, workspaceName, context);
    }

    public PagedIterable<Workspace> list() {
        PagedIterable<WorkspaceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new WorkspaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Workspace> list(String skip, Context context) {
        PagedIterable<WorkspaceInner> inner = this.serviceClient().list(skip, context);
        return Utils.mapPage(inner, inner1 -> new WorkspaceImpl(inner1, this.manager()));
    }

    public NotebookAccessTokenResult listNotebookAccessToken(String resourceGroupName, String workspaceName) {
        NotebookAccessTokenResultInner inner =
            this.serviceClient().listNotebookAccessToken(resourceGroupName, workspaceName);
        if (inner != null) {
            return new NotebookAccessTokenResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NotebookAccessTokenResult> listNotebookAccessTokenWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<NotebookAccessTokenResultInner> inner =
            this.serviceClient().listNotebookAccessTokenWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NotebookAccessTokenResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Workspace getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE).getValue();
    }

    public Response<Workspace> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, workspaceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, context);
    }

    private WorkspacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }

    public WorkspaceImpl define(String name) {
        return new WorkspaceImpl(name, this.manager());
    }
}
