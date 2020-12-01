// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The object representing the policy for taking backups on an account. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = BackupPolicy.class)
@JsonTypeName("BackupPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Periodic", value = PeriodicModeBackupPolicy.class),
    @JsonSubTypes.Type(name = "Continuous", value = ContinuousModeBackupPolicy.class)
})
@Immutable
public class BackupPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupPolicy.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}