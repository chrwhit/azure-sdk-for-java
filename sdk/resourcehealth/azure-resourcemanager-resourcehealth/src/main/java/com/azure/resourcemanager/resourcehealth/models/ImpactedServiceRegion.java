// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Azure region impacted by the service health event. */
@Fluent
public final class ImpactedServiceRegion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImpactedServiceRegion.class);

    /*
     * Impacted region name.
     */
    @JsonProperty(value = "impactedRegion")
    private String impactedRegion;

    /*
     * Current status of event in the region.
     */
    @JsonProperty(value = "status")
    private EventStatusValues status;

    /*
     * List subscription impacted by the service health event.
     */
    @JsonProperty(value = "impactedSubscriptions")
    private List<String> impactedSubscriptions;

    /*
     * It provides the Timestamp for when the last update for the service
     * health event.
     */
    @JsonProperty(value = "lastUpdateTime")
    private OffsetDateTime lastUpdateTime;

    /*
     * List of updates for given service health event.
     */
    @JsonProperty(value = "updates")
    private List<Update> updates;

    /**
     * Get the impactedRegion property: Impacted region name.
     *
     * @return the impactedRegion value.
     */
    public String impactedRegion() {
        return this.impactedRegion;
    }

    /**
     * Set the impactedRegion property: Impacted region name.
     *
     * @param impactedRegion the impactedRegion value to set.
     * @return the ImpactedServiceRegion object itself.
     */
    public ImpactedServiceRegion withImpactedRegion(String impactedRegion) {
        this.impactedRegion = impactedRegion;
        return this;
    }

    /**
     * Get the status property: Current status of event in the region.
     *
     * @return the status value.
     */
    public EventStatusValues status() {
        return this.status;
    }

    /**
     * Set the status property: Current status of event in the region.
     *
     * @param status the status value to set.
     * @return the ImpactedServiceRegion object itself.
     */
    public ImpactedServiceRegion withStatus(EventStatusValues status) {
        this.status = status;
        return this;
    }

    /**
     * Get the impactedSubscriptions property: List subscription impacted by the service health event.
     *
     * @return the impactedSubscriptions value.
     */
    public List<String> impactedSubscriptions() {
        return this.impactedSubscriptions;
    }

    /**
     * Set the impactedSubscriptions property: List subscription impacted by the service health event.
     *
     * @param impactedSubscriptions the impactedSubscriptions value to set.
     * @return the ImpactedServiceRegion object itself.
     */
    public ImpactedServiceRegion withImpactedSubscriptions(List<String> impactedSubscriptions) {
        this.impactedSubscriptions = impactedSubscriptions;
        return this;
    }

    /**
     * Get the lastUpdateTime property: It provides the Timestamp for when the last update for the service health event.
     *
     * @return the lastUpdateTime value.
     */
    public OffsetDateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Set the lastUpdateTime property: It provides the Timestamp for when the last update for the service health event.
     *
     * @param lastUpdateTime the lastUpdateTime value to set.
     * @return the ImpactedServiceRegion object itself.
     */
    public ImpactedServiceRegion withLastUpdateTime(OffsetDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * Get the updates property: List of updates for given service health event.
     *
     * @return the updates value.
     */
    public List<Update> updates() {
        return this.updates;
    }

    /**
     * Set the updates property: List of updates for given service health event.
     *
     * @param updates the updates value to set.
     * @return the ImpactedServiceRegion object itself.
     */
    public ImpactedServiceRegion withUpdates(List<Update> updates) {
        this.updates = updates;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (updates() != null) {
            updates().forEach(e -> e.validate());
        }
    }
}
