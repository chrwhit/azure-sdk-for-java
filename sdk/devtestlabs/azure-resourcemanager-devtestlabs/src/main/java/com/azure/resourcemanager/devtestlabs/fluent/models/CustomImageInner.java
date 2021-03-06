// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.models.CustomImagePropertiesCustom;
import com.azure.resourcemanager.devtestlabs.models.CustomImagePropertiesFromPlan;
import com.azure.resourcemanager.devtestlabs.models.CustomImagePropertiesFromVm;
import com.azure.resourcemanager.devtestlabs.models.DataDiskStorageTypeInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** A custom image. */
@JsonFlatten
@Fluent
public class CustomImageInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomImageInner.class);

    /*
     * The virtual machine from which the image is to be created.
     */
    @JsonProperty(value = "properties.vm")
    private CustomImagePropertiesFromVm vm;

    /*
     * The VHD from which the image is to be created.
     */
    @JsonProperty(value = "properties.vhd")
    private CustomImagePropertiesCustom vhd;

    /*
     * The description of the custom image.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The author of the custom image.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /*
     * The creation date of the custom image.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The Managed Image Id backing the custom image.
     */
    @JsonProperty(value = "properties.managedImageId")
    private String managedImageId;

    /*
     * The Managed Snapshot Id backing the custom image.
     */
    @JsonProperty(value = "properties.managedSnapshotId")
    private String managedSnapshotId;

    /*
     * Storage information about the data disks present in the custom image
     */
    @JsonProperty(value = "properties.dataDiskStorageInfo")
    private List<DataDiskStorageTypeInfo> dataDiskStorageInfo;

    /*
     * Storage information about the plan related to this custom image
     */
    @JsonProperty(value = "properties.customImagePlan")
    private CustomImagePropertiesFromPlan customImagePlan;

    /*
     * Whether or not the custom images underlying offer/plan has been enabled
     * for programmatic deployment
     */
    @JsonProperty(value = "properties.isPlanAuthorized")
    private Boolean isPlanAuthorized;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the vm property: The virtual machine from which the image is to be created.
     *
     * @return the vm value.
     */
    public CustomImagePropertiesFromVm vm() {
        return this.vm;
    }

    /**
     * Set the vm property: The virtual machine from which the image is to be created.
     *
     * @param vm the vm value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withVm(CustomImagePropertiesFromVm vm) {
        this.vm = vm;
        return this;
    }

    /**
     * Get the vhd property: The VHD from which the image is to be created.
     *
     * @return the vhd value.
     */
    public CustomImagePropertiesCustom vhd() {
        return this.vhd;
    }

    /**
     * Set the vhd property: The VHD from which the image is to be created.
     *
     * @param vhd the vhd value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withVhd(CustomImagePropertiesCustom vhd) {
        this.vhd = vhd;
        return this;
    }

    /**
     * Get the description property: The description of the custom image.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the custom image.
     *
     * @param description the description value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the author property: The author of the custom image.
     *
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author property: The author of the custom image.
     *
     * @param author the author value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the creationDate property: The creation date of the custom image.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the managedImageId property: The Managed Image Id backing the custom image.
     *
     * @return the managedImageId value.
     */
    public String managedImageId() {
        return this.managedImageId;
    }

    /**
     * Set the managedImageId property: The Managed Image Id backing the custom image.
     *
     * @param managedImageId the managedImageId value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withManagedImageId(String managedImageId) {
        this.managedImageId = managedImageId;
        return this;
    }

    /**
     * Get the managedSnapshotId property: The Managed Snapshot Id backing the custom image.
     *
     * @return the managedSnapshotId value.
     */
    public String managedSnapshotId() {
        return this.managedSnapshotId;
    }

    /**
     * Set the managedSnapshotId property: The Managed Snapshot Id backing the custom image.
     *
     * @param managedSnapshotId the managedSnapshotId value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withManagedSnapshotId(String managedSnapshotId) {
        this.managedSnapshotId = managedSnapshotId;
        return this;
    }

    /**
     * Get the dataDiskStorageInfo property: Storage information about the data disks present in the custom image.
     *
     * @return the dataDiskStorageInfo value.
     */
    public List<DataDiskStorageTypeInfo> dataDiskStorageInfo() {
        return this.dataDiskStorageInfo;
    }

    /**
     * Set the dataDiskStorageInfo property: Storage information about the data disks present in the custom image.
     *
     * @param dataDiskStorageInfo the dataDiskStorageInfo value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withDataDiskStorageInfo(List<DataDiskStorageTypeInfo> dataDiskStorageInfo) {
        this.dataDiskStorageInfo = dataDiskStorageInfo;
        return this;
    }

    /**
     * Get the customImagePlan property: Storage information about the plan related to this custom image.
     *
     * @return the customImagePlan value.
     */
    public CustomImagePropertiesFromPlan customImagePlan() {
        return this.customImagePlan;
    }

    /**
     * Set the customImagePlan property: Storage information about the plan related to this custom image.
     *
     * @param customImagePlan the customImagePlan value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withCustomImagePlan(CustomImagePropertiesFromPlan customImagePlan) {
        this.customImagePlan = customImagePlan;
        return this;
    }

    /**
     * Get the isPlanAuthorized property: Whether or not the custom images underlying offer/plan has been enabled for
     * programmatic deployment.
     *
     * @return the isPlanAuthorized value.
     */
    public Boolean isPlanAuthorized() {
        return this.isPlanAuthorized;
    }

    /**
     * Set the isPlanAuthorized property: Whether or not the custom images underlying offer/plan has been enabled for
     * programmatic deployment.
     *
     * @param isPlanAuthorized the isPlanAuthorized value to set.
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withIsPlanAuthorized(Boolean isPlanAuthorized) {
        this.isPlanAuthorized = isPlanAuthorized;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /** {@inheritDoc} */
    @Override
    public CustomImageInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomImageInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vm() != null) {
            vm().validate();
        }
        if (vhd() != null) {
            vhd().validate();
        }
        if (dataDiskStorageInfo() != null) {
            dataDiskStorageInfo().forEach(e -> e.validate());
        }
        if (customImagePlan() != null) {
            customImagePlan().validate();
        }
    }
}
