// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes a node type in the cluster, each node type represents sub set of nodes in the cluster. */
@Fluent
public final class NodeTypeDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NodeTypeDescription.class);

    /*
     * The name of the node type.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The placement tags applied to nodes in the node type, which can be used
     * to indicate where certain services (workload) should run.
     */
    @JsonProperty(value = "placementProperties")
    private Map<String, String> placementProperties;

    /*
     * The capacity tags applied to the nodes in the node type, the cluster
     * resource manager uses these tags to understand how much resource a node
     * has.
     */
    @JsonProperty(value = "capacities")
    private Map<String, String> capacities;

    /*
     * The TCP cluster management endpoint port.
     */
    @JsonProperty(value = "clientConnectionEndpointPort", required = true)
    private int clientConnectionEndpointPort;

    /*
     * The HTTP cluster management endpoint port.
     */
    @JsonProperty(value = "httpGatewayEndpointPort", required = true)
    private int httpGatewayEndpointPort;

    /*
     * The durability level of the node type. Learn about
     * [DurabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * - Bronze - No privileges. This is the default.
     * - Silver - The infrastructure jobs can be paused for a duration of 10
     * minutes per UD.
     * - Gold - The infrastructure jobs can be paused for a duration of 2 hours
     * per UD. Gold durability can be enabled only on full node VM skus like
     * D15_V2, G5 etc.
     *
     */
    @JsonProperty(value = "durabilityLevel")
    private DurabilityLevel durabilityLevel;

    /*
     * The range of ports from which cluster assigned port to Service Fabric
     * applications.
     */
    @JsonProperty(value = "applicationPorts")
    private EndpointRangeDescription applicationPorts;

    /*
     * The range of ephemeral ports that nodes in this node type should be
     * configured with.
     */
    @JsonProperty(value = "ephemeralPorts")
    private EndpointRangeDescription ephemeralPorts;

    /*
     * The node type on which system services will run. Only one node type
     * should be marked as primary. Primary node type cannot be deleted or
     * changed for existing clusters.
     */
    @JsonProperty(value = "isPrimary", required = true)
    private boolean isPrimary;

    /*
     * The number of nodes in the node type. This count should match the
     * capacity property in the corresponding VirtualMachineScaleSet resource.
     */
    @JsonProperty(value = "vmInstanceCount", required = true)
    private int vmInstanceCount;

    /*
     * The endpoint used by reverse proxy.
     */
    @JsonProperty(value = "reverseProxyEndpointPort")
    private Integer reverseProxyEndpointPort;

    /**
     * Get the name property: The name of the node type.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the node type.
     *
     * @param name the name value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the placementProperties property: The placement tags applied to nodes in the node type, which can be used to
     * indicate where certain services (workload) should run.
     *
     * @return the placementProperties value.
     */
    public Map<String, String> placementProperties() {
        return this.placementProperties;
    }

    /**
     * Set the placementProperties property: The placement tags applied to nodes in the node type, which can be used to
     * indicate where certain services (workload) should run.
     *
     * @param placementProperties the placementProperties value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withPlacementProperties(Map<String, String> placementProperties) {
        this.placementProperties = placementProperties;
        return this;
    }

    /**
     * Get the capacities property: The capacity tags applied to the nodes in the node type, the cluster resource
     * manager uses these tags to understand how much resource a node has.
     *
     * @return the capacities value.
     */
    public Map<String, String> capacities() {
        return this.capacities;
    }

    /**
     * Set the capacities property: The capacity tags applied to the nodes in the node type, the cluster resource
     * manager uses these tags to understand how much resource a node has.
     *
     * @param capacities the capacities value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withCapacities(Map<String, String> capacities) {
        this.capacities = capacities;
        return this;
    }

    /**
     * Get the clientConnectionEndpointPort property: The TCP cluster management endpoint port.
     *
     * @return the clientConnectionEndpointPort value.
     */
    public int clientConnectionEndpointPort() {
        return this.clientConnectionEndpointPort;
    }

    /**
     * Set the clientConnectionEndpointPort property: The TCP cluster management endpoint port.
     *
     * @param clientConnectionEndpointPort the clientConnectionEndpointPort value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withClientConnectionEndpointPort(int clientConnectionEndpointPort) {
        this.clientConnectionEndpointPort = clientConnectionEndpointPort;
        return this;
    }

    /**
     * Get the httpGatewayEndpointPort property: The HTTP cluster management endpoint port.
     *
     * @return the httpGatewayEndpointPort value.
     */
    public int httpGatewayEndpointPort() {
        return this.httpGatewayEndpointPort;
    }

    /**
     * Set the httpGatewayEndpointPort property: The HTTP cluster management endpoint port.
     *
     * @param httpGatewayEndpointPort the httpGatewayEndpointPort value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withHttpGatewayEndpointPort(int httpGatewayEndpointPort) {
        this.httpGatewayEndpointPort = httpGatewayEndpointPort;
        return this;
    }

    /**
     * Get the durabilityLevel property: The durability level of the node type. Learn about
     * [DurabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * <p>- Bronze - No privileges. This is the default. - Silver - The infrastructure jobs can be paused for a duration
     * of 10 minutes per UD. - Gold - The infrastructure jobs can be paused for a duration of 2 hours per UD. Gold
     * durability can be enabled only on full node VM skus like D15_V2, G5 etc.
     *
     * @return the durabilityLevel value.
     */
    public DurabilityLevel durabilityLevel() {
        return this.durabilityLevel;
    }

    /**
     * Set the durabilityLevel property: The durability level of the node type. Learn about
     * [DurabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * <p>- Bronze - No privileges. This is the default. - Silver - The infrastructure jobs can be paused for a duration
     * of 10 minutes per UD. - Gold - The infrastructure jobs can be paused for a duration of 2 hours per UD. Gold
     * durability can be enabled only on full node VM skus like D15_V2, G5 etc.
     *
     * @param durabilityLevel the durabilityLevel value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withDurabilityLevel(DurabilityLevel durabilityLevel) {
        this.durabilityLevel = durabilityLevel;
        return this;
    }

    /**
     * Get the applicationPorts property: The range of ports from which cluster assigned port to Service Fabric
     * applications.
     *
     * @return the applicationPorts value.
     */
    public EndpointRangeDescription applicationPorts() {
        return this.applicationPorts;
    }

    /**
     * Set the applicationPorts property: The range of ports from which cluster assigned port to Service Fabric
     * applications.
     *
     * @param applicationPorts the applicationPorts value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withApplicationPorts(EndpointRangeDescription applicationPorts) {
        this.applicationPorts = applicationPorts;
        return this;
    }

    /**
     * Get the ephemeralPorts property: The range of ephemeral ports that nodes in this node type should be configured
     * with.
     *
     * @return the ephemeralPorts value.
     */
    public EndpointRangeDescription ephemeralPorts() {
        return this.ephemeralPorts;
    }

    /**
     * Set the ephemeralPorts property: The range of ephemeral ports that nodes in this node type should be configured
     * with.
     *
     * @param ephemeralPorts the ephemeralPorts value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withEphemeralPorts(EndpointRangeDescription ephemeralPorts) {
        this.ephemeralPorts = ephemeralPorts;
        return this;
    }

    /**
     * Get the isPrimary property: The node type on which system services will run. Only one node type should be marked
     * as primary. Primary node type cannot be deleted or changed for existing clusters.
     *
     * @return the isPrimary value.
     */
    public boolean isPrimary() {
        return this.isPrimary;
    }

    /**
     * Set the isPrimary property: The node type on which system services will run. Only one node type should be marked
     * as primary. Primary node type cannot be deleted or changed for existing clusters.
     *
     * @param isPrimary the isPrimary value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Get the vmInstanceCount property: The number of nodes in the node type. This count should match the capacity
     * property in the corresponding VirtualMachineScaleSet resource.
     *
     * @return the vmInstanceCount value.
     */
    public int vmInstanceCount() {
        return this.vmInstanceCount;
    }

    /**
     * Set the vmInstanceCount property: The number of nodes in the node type. This count should match the capacity
     * property in the corresponding VirtualMachineScaleSet resource.
     *
     * @param vmInstanceCount the vmInstanceCount value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withVmInstanceCount(int vmInstanceCount) {
        this.vmInstanceCount = vmInstanceCount;
        return this;
    }

    /**
     * Get the reverseProxyEndpointPort property: The endpoint used by reverse proxy.
     *
     * @return the reverseProxyEndpointPort value.
     */
    public Integer reverseProxyEndpointPort() {
        return this.reverseProxyEndpointPort;
    }

    /**
     * Set the reverseProxyEndpointPort property: The endpoint used by reverse proxy.
     *
     * @param reverseProxyEndpointPort the reverseProxyEndpointPort value to set.
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withReverseProxyEndpointPort(Integer reverseProxyEndpointPort) {
        this.reverseProxyEndpointPort = reverseProxyEndpointPort;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model NodeTypeDescription"));
        }
        if (applicationPorts() != null) {
            applicationPorts().validate();
        }
        if (ephemeralPorts() != null) {
            ephemeralPorts().validate();
        }
    }
}
