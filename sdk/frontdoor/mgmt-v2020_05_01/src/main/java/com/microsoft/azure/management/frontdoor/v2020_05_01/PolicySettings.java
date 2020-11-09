/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines top-level WebApplicationFirewallPolicy configuration settings.
 */
public class PolicySettings {
    /**
     * Describes if the policy is in enabled or disabled state. Defaults to
     * Enabled if not specified. Possible values include: 'Disabled',
     * 'Enabled'.
     */
    @JsonProperty(value = "enabledState")
    private PolicyEnabledState enabledState;

    /**
     * Describes if it is in detection mode or prevention mode at policy level.
     * Possible values include: 'Prevention', 'Detection'.
     */
    @JsonProperty(value = "mode")
    private PolicyMode mode;

    /**
     * If action type is redirect, this field represents redirect URL for the
     * client.
     */
    @JsonProperty(value = "redirectUrl")
    private String redirectUrl;

    /**
     * If the action type is block, customer can override the response status
     * code.
     */
    @JsonProperty(value = "customBlockResponseStatusCode")
    private Integer customBlockResponseStatusCode;

    /**
     * If the action type is block, customer can override the response body.
     * The body must be specified in base64 encoding.
     */
    @JsonProperty(value = "customBlockResponseBody")
    private String customBlockResponseBody;

    /**
     * Get describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the enabledState value
     */
    public PolicyEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param enabledState the enabledState value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withEnabledState(PolicyEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get describes if it is in detection mode or prevention mode at policy level. Possible values include: 'Prevention', 'Detection'.
     *
     * @return the mode value
     */
    public PolicyMode mode() {
        return this.mode;
    }

    /**
     * Set describes if it is in detection mode or prevention mode at policy level. Possible values include: 'Prevention', 'Detection'.
     *
     * @param mode the mode value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMode(PolicyMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get if action type is redirect, this field represents redirect URL for the client.
     *
     * @return the redirectUrl value
     */
    public String redirectUrl() {
        return this.redirectUrl;
    }

    /**
     * Set if action type is redirect, this field represents redirect URL for the client.
     *
     * @param redirectUrl the redirectUrl value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * Get if the action type is block, customer can override the response status code.
     *
     * @return the customBlockResponseStatusCode value
     */
    public Integer customBlockResponseStatusCode() {
        return this.customBlockResponseStatusCode;
    }

    /**
     * Set if the action type is block, customer can override the response status code.
     *
     * @param customBlockResponseStatusCode the customBlockResponseStatusCode value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withCustomBlockResponseStatusCode(Integer customBlockResponseStatusCode) {
        this.customBlockResponseStatusCode = customBlockResponseStatusCode;
        return this;
    }

    /**
     * Get if the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     *
     * @return the customBlockResponseBody value
     */
    public String customBlockResponseBody() {
        return this.customBlockResponseBody;
    }

    /**
     * Set if the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     *
     * @param customBlockResponseBody the customBlockResponseBody value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withCustomBlockResponseBody(String customBlockResponseBody) {
        this.customBlockResponseBody = customBlockResponseBody;
        return this;
    }

}