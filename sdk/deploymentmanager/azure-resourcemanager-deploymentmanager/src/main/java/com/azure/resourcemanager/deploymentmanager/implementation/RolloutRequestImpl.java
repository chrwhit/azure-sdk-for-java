// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.RolloutRequestInner;
import com.azure.resourcemanager.deploymentmanager.models.Identity;
import com.azure.resourcemanager.deploymentmanager.models.Rollout;
import com.azure.resourcemanager.deploymentmanager.models.RolloutRequest;
import com.azure.resourcemanager.deploymentmanager.models.StepGroup;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class RolloutRequestImpl implements RolloutRequest, RolloutRequest.Definition, RolloutRequest.Update {
    private RolloutRequestInner innerObject;

    private final com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public String buildVersion() {
        return this.innerModel().buildVersion();
    }

    public String artifactSourceId() {
        return this.innerModel().artifactSourceId();
    }

    public String targetServiceTopologyId() {
        return this.innerModel().targetServiceTopologyId();
    }

    public List<StepGroup> stepGroups() {
        List<StepGroup> inner = this.innerModel().stepGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public RolloutRequestInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deploymentmanager.DeploymentManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String rolloutName;

    public RolloutRequestImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public RolloutRequest create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRollouts()
                .createOrUpdate(resourceGroupName, rolloutName, this.innerModel(), Context.NONE);
        return this;
    }

    public RolloutRequest create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRollouts()
                .createOrUpdate(resourceGroupName, rolloutName, this.innerModel(), context);
        return this;
    }

    RolloutRequestImpl(String name, com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = new RolloutRequestInner();
        this.serviceManager = serviceManager;
        this.rolloutName = name;
    }

    public RolloutRequestImpl update() {
        return this;
    }

    public RolloutRequest apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRollouts()
                .createOrUpdate(resourceGroupName, rolloutName, this.innerModel(), Context.NONE);
        return this;
    }

    public RolloutRequest apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRollouts()
                .createOrUpdate(resourceGroupName, rolloutName, this.innerModel(), context);
        return this;
    }

    RolloutRequestImpl(
        RolloutRequestInner innerObject, com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.rolloutName = Utils.getValueFromIdByName(innerObject.id(), "rollouts");
    }

    public Rollout cancel() {
        return serviceManager.rollouts().cancel(resourceGroupName, rolloutName);
    }

    public Response<Rollout> cancelWithResponse(Context context) {
        return serviceManager.rollouts().cancelWithResponse(resourceGroupName, rolloutName, context);
    }

    public Rollout restart() {
        return serviceManager.rollouts().restart(resourceGroupName, rolloutName);
    }

    public Response<Rollout> restartWithResponse(Boolean skipSucceeded, Context context) {
        return serviceManager.rollouts().restartWithResponse(resourceGroupName, rolloutName, skipSucceeded, context);
    }

    public RolloutRequestImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public RolloutRequestImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public RolloutRequestImpl withIdentity(Identity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public RolloutRequestImpl withBuildVersion(String buildVersion) {
        this.innerModel().withBuildVersion(buildVersion);
        return this;
    }

    public RolloutRequestImpl withTargetServiceTopologyId(String targetServiceTopologyId) {
        this.innerModel().withTargetServiceTopologyId(targetServiceTopologyId);
        return this;
    }

    public RolloutRequestImpl withStepGroups(List<StepGroup> stepGroups) {
        this.innerModel().withStepGroups(stepGroups);
        return this;
    }

    public RolloutRequestImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public RolloutRequestImpl withArtifactSourceId(String artifactSourceId) {
        this.innerModel().withArtifactSourceId(artifactSourceId);
        return this;
    }
}
