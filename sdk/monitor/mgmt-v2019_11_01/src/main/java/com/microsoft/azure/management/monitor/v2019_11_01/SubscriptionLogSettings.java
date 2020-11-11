/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Part of Subscription diagnostic setting. Specifies the settings for a
 * particular log.
 */
public class SubscriptionLogSettings {
    /**
     * Name of a Subscription Diagnostic Log category for a resource type this
     * setting is applied to.
     */
    @JsonProperty(value = "category")
    private String category;

    /**
     * a value indicating whether this log is enabled.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * Get name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     *
     * @param category the category value to set
     * @return the SubscriptionLogSettings object itself.
     */
    public SubscriptionLogSettings withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get a value indicating whether this log is enabled.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set a value indicating whether this log is enabled.
     *
     * @param enabled the enabled value to set
     * @return the SubscriptionLogSettings object itself.
     */
    public SubscriptionLogSettings withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}