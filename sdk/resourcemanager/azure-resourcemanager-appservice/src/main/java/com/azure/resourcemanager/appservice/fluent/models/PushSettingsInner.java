// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Push settings for the App. */
@JsonFlatten
@Fluent
public class PushSettingsInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PushSettingsInner.class);

    /*
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     */
    @JsonProperty(value = "properties.isPushEnabled")
    private Boolean isPushEnabled;

    /*
     * Gets or sets a JSON string containing a list of tags that are
     * whitelisted for use by the push registration endpoint.
     */
    @JsonProperty(value = "properties.tagWhitelistJson")
    private String tagWhitelistJson;

    /*
     * Gets or sets a JSON string containing a list of tags that require user
     * authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     */
    @JsonProperty(value = "properties.tagsRequiringAuth")
    private String tagsRequiringAuth;

    /*
     * Gets or sets a JSON string containing a list of dynamic tags that will
     * be evaluated from user claims in the push registration endpoint.
     */
    @JsonProperty(value = "properties.dynamicTagsJson")
    private String dynamicTagsJson;

    /**
     * Get the isPushEnabled property: Gets or sets a flag indicating whether the Push endpoint is enabled.
     *
     * @return the isPushEnabled value.
     */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set the isPushEnabled property: Gets or sets a flag indicating whether the Push endpoint is enabled.
     *
     * @param isPushEnabled the isPushEnabled value to set.
     * @return the PushSettingsInner object itself.
     */
    public PushSettingsInner withIsPushEnabled(Boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get the tagWhitelistJson property: Gets or sets a JSON string containing a list of tags that are whitelisted for
     * use by the push registration endpoint.
     *
     * @return the tagWhitelistJson value.
     */
    public String tagWhitelistJson() {
        return this.tagWhitelistJson;
    }

    /**
     * Set the tagWhitelistJson property: Gets or sets a JSON string containing a list of tags that are whitelisted for
     * use by the push registration endpoint.
     *
     * @param tagWhitelistJson the tagWhitelistJson value to set.
     * @return the PushSettingsInner object itself.
     */
    public PushSettingsInner withTagWhitelistJson(String tagWhitelistJson) {
        this.tagWhitelistJson = tagWhitelistJson;
        return this;
    }

    /**
     * Get the tagsRequiringAuth property: Gets or sets a JSON string containing a list of tags that require user
     * authentication to be used in the push registration endpoint. Tags can consist of alphanumeric characters and the
     * following: '_', '@', '#', '.', ':', '-'. Validation should be performed at the PushRequestHandler.
     *
     * @return the tagsRequiringAuth value.
     */
    public String tagsRequiringAuth() {
        return this.tagsRequiringAuth;
    }

    /**
     * Set the tagsRequiringAuth property: Gets or sets a JSON string containing a list of tags that require user
     * authentication to be used in the push registration endpoint. Tags can consist of alphanumeric characters and the
     * following: '_', '@', '#', '.', ':', '-'. Validation should be performed at the PushRequestHandler.
     *
     * @param tagsRequiringAuth the tagsRequiringAuth value to set.
     * @return the PushSettingsInner object itself.
     */
    public PushSettingsInner withTagsRequiringAuth(String tagsRequiringAuth) {
        this.tagsRequiringAuth = tagsRequiringAuth;
        return this;
    }

    /**
     * Get the dynamicTagsJson property: Gets or sets a JSON string containing a list of dynamic tags that will be
     * evaluated from user claims in the push registration endpoint.
     *
     * @return the dynamicTagsJson value.
     */
    public String dynamicTagsJson() {
        return this.dynamicTagsJson;
    }

    /**
     * Set the dynamicTagsJson property: Gets or sets a JSON string containing a list of dynamic tags that will be
     * evaluated from user claims in the push registration endpoint.
     *
     * @param dynamicTagsJson the dynamicTagsJson value to set.
     * @return the PushSettingsInner object itself.
     */
    public PushSettingsInner withDynamicTagsJson(String dynamicTagsJson) {
        this.dynamicTagsJson = dynamicTagsJson;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PushSettingsInner withKind(String kind) {
        super.withKind(kind);
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
    }
}
