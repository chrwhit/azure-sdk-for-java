// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EndpointType. */
public final class EndpointType extends ExpandableStringEnum<EndpointType> {
    /** Static value AFD for EndpointType. */
    public static final EndpointType AFD = fromString("AFD");

    /** Static value AzureRegion for EndpointType. */
    public static final EndpointType AZURE_REGION = fromString("AzureRegion");

    /** Static value CDN for EndpointType. */
    public static final EndpointType CDN = fromString("CDN");

    /** Static value ATM for EndpointType. */
    public static final EndpointType ATM = fromString("ATM");

    /**
     * Creates or finds a EndpointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EndpointType.
     */
    @JsonCreator
    public static EndpointType fromString(String name) {
        return fromString(name, EndpointType.class);
    }

    /** @return known EndpointType values. */
    public static Collection<EndpointType> values() {
        return values(EndpointType.class);
    }
}
