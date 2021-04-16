// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** AML Compute properties. */
@Fluent
public final class AmlComputeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AmlComputeProperties.class);

    /*
     * Compute OS Type
     */
    @JsonProperty(value = "osType")
    private OsType osType;

    /*
     * Virtual Machine Size
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * Virtual Machine priority
     */
    @JsonProperty(value = "vmPriority")
    private VmPriority vmPriority;

    /*
     * Virtual Machine image for AML Compute - windows only
     */
    @JsonProperty(value = "virtualMachineImage")
    private VirtualMachineImage virtualMachineImage;

    /*
     * Network is isolated or not
     */
    @JsonProperty(value = "isolatedNetwork")
    private Boolean isolatedNetwork;

    /*
     * Scale settings for AML Compute
     */
    @JsonProperty(value = "scaleSettings")
    private ScaleSettings scaleSettings;

    /*
     * Credentials for an administrator user account that will be created on
     * each compute node.
     */
    @JsonProperty(value = "userAccountCredentials")
    private UserAccountCredentials userAccountCredentials;

    /*
     * Virtual network subnet resource ID the compute nodes belong to.
     */
    @JsonProperty(value = "subnet")
    private ResourceId subnet;

    /*
     * State of the public SSH port. Possible values are: Disabled - Indicates
     * that the public ssh port is closed on all nodes of the cluster. Enabled
     * - Indicates that the public ssh port is open on all nodes of the
     * cluster. NotSpecified - Indicates that the public ssh port is closed on
     * all nodes of the cluster if VNet is defined, else is open all public
     * nodes. It can be default only during cluster creation time, after
     * creation it will be either enabled or disabled.
     */
    @JsonProperty(value = "remoteLoginPortPublicAccess")
    private RemoteLoginPortPublicAccess remoteLoginPortPublicAccess;

    /*
     * Allocation state of the compute. Possible values are: steady - Indicates
     * that the compute is not resizing. There are no changes to the number of
     * compute nodes in the compute in progress. A compute enters this state
     * when it is created and when no operations are being performed on the
     * compute to change the number of compute nodes. resizing - Indicates that
     * the compute is resizing; that is, compute nodes are being added to or
     * removed from the compute.
     */
    @JsonProperty(value = "allocationState", access = JsonProperty.Access.WRITE_ONLY)
    private AllocationState allocationState;

    /*
     * The time at which the compute entered its current allocation state.
     */
    @JsonProperty(value = "allocationStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime allocationStateTransitionTime;

    /*
     * Collection of errors encountered by various compute nodes during node
     * setup.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagementError> errors;

    /*
     * The number of compute nodes currently assigned to the compute.
     */
    @JsonProperty(value = "currentNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentNodeCount;

    /*
     * The target number of compute nodes for the compute. If the
     * allocationState is resizing, this property denotes the target node count
     * for the ongoing resize operation. If the allocationState is steady, this
     * property denotes the target node count for the previous resize
     * operation.
     */
    @JsonProperty(value = "targetNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer targetNodeCount;

    /*
     * Counts of various node states on the compute.
     */
    @JsonProperty(value = "nodeStateCounts", access = JsonProperty.Access.WRITE_ONLY)
    private NodeStateCounts nodeStateCounts;

    /*
     * Enable or disable node public IP address provisioning. Possible values
     * are: Possible values are: true - Indicates that the compute nodes will
     * have public IPs provisioned. false - Indicates that the compute nodes
     * will have a private endpoint and no public IPs.
     */
    @JsonProperty(value = "enableNodePublicIp")
    private Boolean enableNodePublicIp;

    /**
     * Get the osType property: Compute OS Type.
     *
     * @return the osType value.
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: Compute OS Type.
     *
     * @param osType the osType value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withOsType(OsType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the vmSize property: Virtual Machine Size.
     *
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Virtual Machine Size.
     *
     * @param vmSize the vmSize value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the vmPriority property: Virtual Machine priority.
     *
     * @return the vmPriority value.
     */
    public VmPriority vmPriority() {
        return this.vmPriority;
    }

    /**
     * Set the vmPriority property: Virtual Machine priority.
     *
     * @param vmPriority the vmPriority value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withVmPriority(VmPriority vmPriority) {
        this.vmPriority = vmPriority;
        return this;
    }

    /**
     * Get the virtualMachineImage property: Virtual Machine image for AML Compute - windows only.
     *
     * @return the virtualMachineImage value.
     */
    public VirtualMachineImage virtualMachineImage() {
        return this.virtualMachineImage;
    }

    /**
     * Set the virtualMachineImage property: Virtual Machine image for AML Compute - windows only.
     *
     * @param virtualMachineImage the virtualMachineImage value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withVirtualMachineImage(VirtualMachineImage virtualMachineImage) {
        this.virtualMachineImage = virtualMachineImage;
        return this;
    }

    /**
     * Get the isolatedNetwork property: Network is isolated or not.
     *
     * @return the isolatedNetwork value.
     */
    public Boolean isolatedNetwork() {
        return this.isolatedNetwork;
    }

    /**
     * Set the isolatedNetwork property: Network is isolated or not.
     *
     * @param isolatedNetwork the isolatedNetwork value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withIsolatedNetwork(Boolean isolatedNetwork) {
        this.isolatedNetwork = isolatedNetwork;
        return this;
    }

    /**
     * Get the scaleSettings property: Scale settings for AML Compute.
     *
     * @return the scaleSettings value.
     */
    public ScaleSettings scaleSettings() {
        return this.scaleSettings;
    }

    /**
     * Set the scaleSettings property: Scale settings for AML Compute.
     *
     * @param scaleSettings the scaleSettings value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withScaleSettings(ScaleSettings scaleSettings) {
        this.scaleSettings = scaleSettings;
        return this;
    }

    /**
     * Get the userAccountCredentials property: Credentials for an administrator user account that will be created on
     * each compute node.
     *
     * @return the userAccountCredentials value.
     */
    public UserAccountCredentials userAccountCredentials() {
        return this.userAccountCredentials;
    }

    /**
     * Set the userAccountCredentials property: Credentials for an administrator user account that will be created on
     * each compute node.
     *
     * @param userAccountCredentials the userAccountCredentials value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withUserAccountCredentials(UserAccountCredentials userAccountCredentials) {
        this.userAccountCredentials = userAccountCredentials;
        return this;
    }

    /**
     * Get the subnet property: Virtual network subnet resource ID the compute nodes belong to.
     *
     * @return the subnet value.
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Virtual network subnet resource ID the compute nodes belong to.
     *
     * @param subnet the subnet value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the remoteLoginPortPublicAccess property: State of the public SSH port. Possible values are: Disabled -
     * Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh
     * port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all
     * nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster
     * creation time, after creation it will be either enabled or disabled.
     *
     * @return the remoteLoginPortPublicAccess value.
     */
    public RemoteLoginPortPublicAccess remoteLoginPortPublicAccess() {
        return this.remoteLoginPortPublicAccess;
    }

    /**
     * Set the remoteLoginPortPublicAccess property: State of the public SSH port. Possible values are: Disabled -
     * Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh
     * port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all
     * nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster
     * creation time, after creation it will be either enabled or disabled.
     *
     * @param remoteLoginPortPublicAccess the remoteLoginPortPublicAccess value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withRemoteLoginPortPublicAccess(
        RemoteLoginPortPublicAccess remoteLoginPortPublicAccess) {
        this.remoteLoginPortPublicAccess = remoteLoginPortPublicAccess;
        return this;
    }

    /**
     * Get the allocationState property: Allocation state of the compute. Possible values are: steady - Indicates that
     * the compute is not resizing. There are no changes to the number of compute nodes in the compute in progress. A
     * compute enters this state when it is created and when no operations are being performed on the compute to change
     * the number of compute nodes. resizing - Indicates that the compute is resizing; that is, compute nodes are being
     * added to or removed from the compute.
     *
     * @return the allocationState value.
     */
    public AllocationState allocationState() {
        return this.allocationState;
    }

    /**
     * Get the allocationStateTransitionTime property: The time at which the compute entered its current allocation
     * state.
     *
     * @return the allocationStateTransitionTime value.
     */
    public OffsetDateTime allocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }

    /**
     * Get the errors property: Collection of errors encountered by various compute nodes during node setup.
     *
     * @return the errors value.
     */
    public List<ManagementError> errors() {
        return this.errors;
    }

    /**
     * Get the currentNodeCount property: The number of compute nodes currently assigned to the compute.
     *
     * @return the currentNodeCount value.
     */
    public Integer currentNodeCount() {
        return this.currentNodeCount;
    }

    /**
     * Get the targetNodeCount property: The target number of compute nodes for the compute. If the allocationState is
     * resizing, this property denotes the target node count for the ongoing resize operation. If the allocationState is
     * steady, this property denotes the target node count for the previous resize operation.
     *
     * @return the targetNodeCount value.
     */
    public Integer targetNodeCount() {
        return this.targetNodeCount;
    }

    /**
     * Get the nodeStateCounts property: Counts of various node states on the compute.
     *
     * @return the nodeStateCounts value.
     */
    public NodeStateCounts nodeStateCounts() {
        return this.nodeStateCounts;
    }

    /**
     * Get the enableNodePublicIp property: Enable or disable node public IP address provisioning. Possible values are:
     * Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates
     * that the compute nodes will have a private endpoint and no public IPs.
     *
     * @return the enableNodePublicIp value.
     */
    public Boolean enableNodePublicIp() {
        return this.enableNodePublicIp;
    }

    /**
     * Set the enableNodePublicIp property: Enable or disable node public IP address provisioning. Possible values are:
     * Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates
     * that the compute nodes will have a private endpoint and no public IPs.
     *
     * @param enableNodePublicIp the enableNodePublicIp value to set.
     * @return the AmlComputeProperties object itself.
     */
    public AmlComputeProperties withEnableNodePublicIp(Boolean enableNodePublicIp) {
        this.enableNodePublicIp = enableNodePublicIp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualMachineImage() != null) {
            virtualMachineImage().validate();
        }
        if (scaleSettings() != null) {
            scaleSettings().validate();
        }
        if (userAccountCredentials() != null) {
            userAccountCredentials().validate();
        }
        if (subnet() != null) {
            subnet().validate();
        }
        if (nodeStateCounts() != null) {
            nodeStateCounts().validate();
        }
    }
}
