// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SSH configuration. */
@Fluent
public final class SshConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SshConfiguration.class);

    /*
     * List of source IP ranges to allow SSH connection from. The default value
     * is '*' (all source IPs are allowed). Maximum number of IP ranges that
     * can be specified is 400.
     */
    @JsonProperty(value = "publicIPsToAllow")
    private List<String> publicIPsToAllow;

    /*
     * Settings for administrator user account to be created on a node. The
     * account can be used to establish SSH connection to the node.
     */
    @JsonProperty(value = "userAccountSettings", required = true)
    private UserAccountSettings userAccountSettings;

    /**
     * Get the publicIPsToAllow property: List of source IP ranges to allow SSH connection from. The default value is
     * '*' (all source IPs are allowed). Maximum number of IP ranges that can be specified is 400.
     *
     * @return the publicIPsToAllow value.
     */
    public List<String> publicIPsToAllow() {
        return this.publicIPsToAllow;
    }

    /**
     * Set the publicIPsToAllow property: List of source IP ranges to allow SSH connection from. The default value is
     * '*' (all source IPs are allowed). Maximum number of IP ranges that can be specified is 400.
     *
     * @param publicIPsToAllow the publicIPsToAllow value to set.
     * @return the SshConfiguration object itself.
     */
    public SshConfiguration withPublicIPsToAllow(List<String> publicIPsToAllow) {
        this.publicIPsToAllow = publicIPsToAllow;
        return this;
    }

    /**
     * Get the userAccountSettings property: Settings for administrator user account to be created on a node. The
     * account can be used to establish SSH connection to the node.
     *
     * @return the userAccountSettings value.
     */
    public UserAccountSettings userAccountSettings() {
        return this.userAccountSettings;
    }

    /**
     * Set the userAccountSettings property: Settings for administrator user account to be created on a node. The
     * account can be used to establish SSH connection to the node.
     *
     * @param userAccountSettings the userAccountSettings value to set.
     * @return the SshConfiguration object itself.
     */
    public SshConfiguration withUserAccountSettings(UserAccountSettings userAccountSettings) {
        this.userAccountSettings = userAccountSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAccountSettings() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property userAccountSettings in model SshConfiguration"));
        } else {
            userAccountSettings().validate();
        }
    }
}
