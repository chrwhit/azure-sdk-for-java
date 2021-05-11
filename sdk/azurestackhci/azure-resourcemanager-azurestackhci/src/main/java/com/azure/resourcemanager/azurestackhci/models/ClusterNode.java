// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cluster node details. */
@Immutable
public final class ClusterNode {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterNode.class);

    /*
     * Name of the cluster node.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Id of the node in the cluster.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private Float id;

    /*
     * Manufacturer of the cluster node hardware.
     */
    @JsonProperty(value = "manufacturer", access = JsonProperty.Access.WRITE_ONLY)
    private String manufacturer;

    /*
     * Model name of the cluster node hardware.
     */
    @JsonProperty(value = "model", access = JsonProperty.Access.WRITE_ONLY)
    private String model;

    /*
     * Operating system running on the cluster node.
     */
    @JsonProperty(value = "osName", access = JsonProperty.Access.WRITE_ONLY)
    private String osName;

    /*
     * Version of the operating system running on the cluster node.
     */
    @JsonProperty(value = "osVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String osVersion;

    /*
     * Immutable id of the cluster node.
     */
    @JsonProperty(value = "serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * Number of physical cores on the cluster node.
     */
    @JsonProperty(value = "coreCount", access = JsonProperty.Access.WRITE_ONLY)
    private Float coreCount;

    /*
     * Total available memory on the cluster node (in GiB).
     */
    @JsonProperty(value = "memoryInGiB", access = JsonProperty.Access.WRITE_ONLY)
    private Float memoryInGiB;

    /**
     * Get the name property: Name of the cluster node.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Id of the node in the cluster.
     *
     * @return the id value.
     */
    public Float id() {
        return this.id;
    }

    /**
     * Get the manufacturer property: Manufacturer of the cluster node hardware.
     *
     * @return the manufacturer value.
     */
    public String manufacturer() {
        return this.manufacturer;
    }

    /**
     * Get the model property: Model name of the cluster node hardware.
     *
     * @return the model value.
     */
    public String model() {
        return this.model;
    }

    /**
     * Get the osName property: Operating system running on the cluster node.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Get the osVersion property: Version of the operating system running on the cluster node.
     *
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Get the serialNumber property: Immutable id of the cluster node.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the coreCount property: Number of physical cores on the cluster node.
     *
     * @return the coreCount value.
     */
    public Float coreCount() {
        return this.coreCount;
    }

    /**
     * Get the memoryInGiB property: Total available memory on the cluster node (in GiB).
     *
     * @return the memoryInGiB value.
     */
    public Float memoryInGiB() {
        return this.memoryInGiB;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
