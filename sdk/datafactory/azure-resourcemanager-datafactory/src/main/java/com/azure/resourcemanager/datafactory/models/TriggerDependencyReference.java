// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger referenced dependency. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = TriggerDependencyReference.class)
@JsonTypeName("TriggerDependencyReference")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "TumblingWindowTriggerDependencyReference",
        value = TumblingWindowTriggerDependencyReference.class)
})
@Fluent
public class TriggerDependencyReference extends DependencyReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggerDependencyReference.class);

    /*
     * Referenced trigger.
     */
    @JsonProperty(value = "referenceTrigger", required = true)
    private TriggerReference referenceTrigger;

    /**
     * Get the referenceTrigger property: Referenced trigger.
     *
     * @return the referenceTrigger value.
     */
    public TriggerReference referenceTrigger() {
        return this.referenceTrigger;
    }

    /**
     * Set the referenceTrigger property: Referenced trigger.
     *
     * @param referenceTrigger the referenceTrigger value to set.
     * @return the TriggerDependencyReference object itself.
     */
    public TriggerDependencyReference withReferenceTrigger(TriggerReference referenceTrigger) {
        this.referenceTrigger = referenceTrigger;
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
        if (referenceTrigger() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property referenceTrigger in model TriggerDependencyReference"));
        } else {
            referenceTrigger().validate();
        }
    }
}
