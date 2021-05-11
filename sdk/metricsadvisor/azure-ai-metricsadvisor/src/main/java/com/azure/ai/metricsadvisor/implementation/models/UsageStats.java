// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The UsageStats model. */
@Immutable
public final class UsageStats {
    /*
     * The timestamp of the stats
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * The active series count
     */
    @JsonProperty(value = "activeSeriesCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer activeSeriesCount;

    /*
     * All series count under non deleted data feed
     */
    @JsonProperty(value = "allSeriesCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer allSeriesCount;

    /*
     * The metrics count under non deleted data feed
     */
    @JsonProperty(value = "metricsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer metricsCount;

    /*
     * The count of non deleted data feed
     */
    @JsonProperty(value = "dataFeedCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer dataFeedCount;

    /**
     * Get the timestamp property: The timestamp of the stats.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the activeSeriesCount property: The active series count.
     *
     * @return the activeSeriesCount value.
     */
    public Integer getActiveSeriesCount() {
        return this.activeSeriesCount;
    }

    /**
     * Get the allSeriesCount property: All series count under non deleted data feed.
     *
     * @return the allSeriesCount value.
     */
    public Integer getAllSeriesCount() {
        return this.allSeriesCount;
    }

    /**
     * Get the metricsCount property: The metrics count under non deleted data feed.
     *
     * @return the metricsCount value.
     */
    public Integer getMetricsCount() {
        return this.metricsCount;
    }

    /**
     * Get the dataFeedCount property: The count of non deleted data feed.
     *
     * @return the dataFeedCount value.
     */
    public Integer getDataFeedCount() {
        return this.dataFeedCount;
    }
}
