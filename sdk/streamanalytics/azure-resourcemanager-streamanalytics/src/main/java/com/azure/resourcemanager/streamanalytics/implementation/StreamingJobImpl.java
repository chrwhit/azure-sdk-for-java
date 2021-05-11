// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.FunctionInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.InputInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.OutputInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.StreamingJobInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.TransformationInner;
import com.azure.resourcemanager.streamanalytics.models.ClusterInfo;
import com.azure.resourcemanager.streamanalytics.models.CompatibilityLevel;
import com.azure.resourcemanager.streamanalytics.models.ContentStoragePolicy;
import com.azure.resourcemanager.streamanalytics.models.EventsOutOfOrderPolicy;
import com.azure.resourcemanager.streamanalytics.models.External;
import com.azure.resourcemanager.streamanalytics.models.Function;
import com.azure.resourcemanager.streamanalytics.models.Identity;
import com.azure.resourcemanager.streamanalytics.models.Input;
import com.azure.resourcemanager.streamanalytics.models.JobStorageAccount;
import com.azure.resourcemanager.streamanalytics.models.JobType;
import com.azure.resourcemanager.streamanalytics.models.Output;
import com.azure.resourcemanager.streamanalytics.models.OutputErrorPolicy;
import com.azure.resourcemanager.streamanalytics.models.OutputStartMode;
import com.azure.resourcemanager.streamanalytics.models.StreamingJob;
import com.azure.resourcemanager.streamanalytics.models.StreamingJobSku;
import com.azure.resourcemanager.streamanalytics.models.Transformation;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class StreamingJobImpl implements StreamingJob, StreamingJob.Definition, StreamingJob.Update {
    private StreamingJobInner innerObject;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

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

    public StreamingJobSku sku() {
        return this.innerModel().sku();
    }

    public String jobId() {
        return this.innerModel().jobId();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String jobState() {
        return this.innerModel().jobState();
    }

    public JobType jobType() {
        return this.innerModel().jobType();
    }

    public OutputStartMode outputStartMode() {
        return this.innerModel().outputStartMode();
    }

    public OffsetDateTime outputStartTime() {
        return this.innerModel().outputStartTime();
    }

    public OffsetDateTime lastOutputEventTime() {
        return this.innerModel().lastOutputEventTime();
    }

    public EventsOutOfOrderPolicy eventsOutOfOrderPolicy() {
        return this.innerModel().eventsOutOfOrderPolicy();
    }

    public OutputErrorPolicy outputErrorPolicy() {
        return this.innerModel().outputErrorPolicy();
    }

    public Integer eventsOutOfOrderMaxDelayInSeconds() {
        return this.innerModel().eventsOutOfOrderMaxDelayInSeconds();
    }

    public Integer eventsLateArrivalMaxDelayInSeconds() {
        return this.innerModel().eventsLateArrivalMaxDelayInSeconds();
    }

    public String dataLocale() {
        return this.innerModel().dataLocale();
    }

    public CompatibilityLevel compatibilityLevel() {
        return this.innerModel().compatibilityLevel();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public List<Input> inputs() {
        List<InputInner> inner = this.innerModel().inputs();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new InputImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Transformation transformation() {
        TransformationInner inner = this.innerModel().transformation();
        if (inner != null) {
            return new TransformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<Output> outputs() {
        List<OutputInner> inner = this.innerModel().outputs();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new OutputImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<Function> functions() {
        List<FunctionInner> inner = this.innerModel().functions();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new FunctionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public JobStorageAccount jobStorageAccount() {
        return this.innerModel().jobStorageAccount();
    }

    public ContentStoragePolicy contentStoragePolicy() {
        return this.innerModel().contentStoragePolicy();
    }

    public External externals() {
        return this.innerModel().externals();
    }

    public ClusterInfo cluster() {
        return this.innerModel().cluster();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public StreamingJobInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String jobName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    public StreamingJobImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public StreamingJob create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingJobs()
                .createOrReplace(
                    resourceGroupName, jobName, this.innerModel(), createIfMatch, createIfNoneMatch, Context.NONE);
        return this;
    }

    public StreamingJob create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingJobs()
                .createOrReplace(
                    resourceGroupName, jobName, this.innerModel(), createIfMatch, createIfNoneMatch, context);
        return this;
    }

    StreamingJobImpl(String name, com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = new StreamingJobInner();
        this.serviceManager = serviceManager;
        this.jobName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public StreamingJobImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public StreamingJob apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingJobs()
                .updateWithResponse(resourceGroupName, jobName, this.innerModel(), updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public StreamingJob apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingJobs()
                .updateWithResponse(resourceGroupName, jobName, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    StreamingJobImpl(
        StreamingJobInner innerObject,
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.jobName = Utils.getValueFromIdByName(innerObject.id(), "streamingjobs");
    }

    public StreamingJob refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingJobs()
                .getByResourceGroupWithResponse(resourceGroupName, jobName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public StreamingJob refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingJobs()
                .getByResourceGroupWithResponse(resourceGroupName, jobName, localExpand, context)
                .getValue();
        return this;
    }

    public StreamingJobImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public StreamingJobImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public StreamingJobImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public StreamingJobImpl withIdentity(Identity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public StreamingJobImpl withSku(StreamingJobSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public StreamingJobImpl withJobType(JobType jobType) {
        this.innerModel().withJobType(jobType);
        return this;
    }

    public StreamingJobImpl withOutputStartMode(OutputStartMode outputStartMode) {
        this.innerModel().withOutputStartMode(outputStartMode);
        return this;
    }

    public StreamingJobImpl withOutputStartTime(OffsetDateTime outputStartTime) {
        this.innerModel().withOutputStartTime(outputStartTime);
        return this;
    }

    public StreamingJobImpl withEventsOutOfOrderPolicy(EventsOutOfOrderPolicy eventsOutOfOrderPolicy) {
        this.innerModel().withEventsOutOfOrderPolicy(eventsOutOfOrderPolicy);
        return this;
    }

    public StreamingJobImpl withOutputErrorPolicy(OutputErrorPolicy outputErrorPolicy) {
        this.innerModel().withOutputErrorPolicy(outputErrorPolicy);
        return this;
    }

    public StreamingJobImpl withEventsOutOfOrderMaxDelayInSeconds(Integer eventsOutOfOrderMaxDelayInSeconds) {
        this.innerModel().withEventsOutOfOrderMaxDelayInSeconds(eventsOutOfOrderMaxDelayInSeconds);
        return this;
    }

    public StreamingJobImpl withEventsLateArrivalMaxDelayInSeconds(Integer eventsLateArrivalMaxDelayInSeconds) {
        this.innerModel().withEventsLateArrivalMaxDelayInSeconds(eventsLateArrivalMaxDelayInSeconds);
        return this;
    }

    public StreamingJobImpl withDataLocale(String dataLocale) {
        this.innerModel().withDataLocale(dataLocale);
        return this;
    }

    public StreamingJobImpl withCompatibilityLevel(CompatibilityLevel compatibilityLevel) {
        this.innerModel().withCompatibilityLevel(compatibilityLevel);
        return this;
    }

    public StreamingJobImpl withInputs(List<InputInner> inputs) {
        this.innerModel().withInputs(inputs);
        return this;
    }

    public StreamingJobImpl withTransformation(TransformationInner transformation) {
        this.innerModel().withTransformation(transformation);
        return this;
    }

    public StreamingJobImpl withOutputs(List<OutputInner> outputs) {
        this.innerModel().withOutputs(outputs);
        return this;
    }

    public StreamingJobImpl withFunctions(List<FunctionInner> functions) {
        this.innerModel().withFunctions(functions);
        return this;
    }

    public StreamingJobImpl withJobStorageAccount(JobStorageAccount jobStorageAccount) {
        this.innerModel().withJobStorageAccount(jobStorageAccount);
        return this;
    }

    public StreamingJobImpl withContentStoragePolicy(ContentStoragePolicy contentStoragePolicy) {
        this.innerModel().withContentStoragePolicy(contentStoragePolicy);
        return this;
    }

    public StreamingJobImpl withExternals(External externals) {
        this.innerModel().withExternals(externals);
        return this;
    }

    public StreamingJobImpl withCluster(ClusterInfo cluster) {
        this.innerModel().withCluster(cluster);
        return this;
    }

    public StreamingJobImpl withIfMatch(String ifMatch) {
        this.createIfMatch = ifMatch;
        return this;
    }

    public StreamingJobImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    public StreamingJobImpl ifMatch(String ifMatch) {
        this.updateIfMatch = ifMatch;
        return this;
    }
}
