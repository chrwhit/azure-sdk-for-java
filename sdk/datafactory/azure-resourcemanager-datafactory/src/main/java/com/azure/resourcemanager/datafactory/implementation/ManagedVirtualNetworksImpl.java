// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.ManagedVirtualNetworksClient;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedVirtualNetworkResourceInner;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkResource;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedVirtualNetworksImpl implements ManagedVirtualNetworks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedVirtualNetworksImpl.class);

    private final ManagedVirtualNetworksClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public ManagedVirtualNetworksImpl(
        ManagedVirtualNetworksClient innerClient,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagedVirtualNetworkResource> listByFactory(String resourceGroupName, String factoryName) {
        PagedIterable<ManagedVirtualNetworkResourceInner> inner =
            this.serviceClient().listByFactory(resourceGroupName, factoryName);
        return Utils.mapPage(inner, inner1 -> new ManagedVirtualNetworkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedVirtualNetworkResource> listByFactory(
        String resourceGroupName, String factoryName, Context context) {
        PagedIterable<ManagedVirtualNetworkResourceInner> inner =
            this.serviceClient().listByFactory(resourceGroupName, factoryName, context);
        return Utils.mapPage(inner, inner1 -> new ManagedVirtualNetworkResourceImpl(inner1, this.manager()));
    }

    public ManagedVirtualNetworkResource get(
        String resourceGroupName, String factoryName, String managedVirtualNetworkName) {
        ManagedVirtualNetworkResourceInner inner =
            this.serviceClient().get(resourceGroupName, factoryName, managedVirtualNetworkName);
        if (inner != null) {
            return new ManagedVirtualNetworkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedVirtualNetworkResource> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String ifNoneMatch,
        Context context) {
        Response<ManagedVirtualNetworkResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedVirtualNetworkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedVirtualNetworkResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String managedVirtualNetworkName = Utils.getValueFromIdByName(id, "managedVirtualNetworks");
        if (managedVirtualNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedVirtualNetworks'.",
                                id)));
        }
        String localIfNoneMatch = null;
        return this
            .getWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName, localIfNoneMatch, Context.NONE)
            .getValue();
    }

    public Response<ManagedVirtualNetworkResource> getByIdWithResponse(String id, String ifNoneMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String managedVirtualNetworkName = Utils.getValueFromIdByName(id, "managedVirtualNetworks");
        if (managedVirtualNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedVirtualNetworks'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName, ifNoneMatch, context);
    }

    private ManagedVirtualNetworksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    public ManagedVirtualNetworkResourceImpl define(String name) {
        return new ManagedVirtualNetworkResourceImpl(name, this.manager());
    }
}
