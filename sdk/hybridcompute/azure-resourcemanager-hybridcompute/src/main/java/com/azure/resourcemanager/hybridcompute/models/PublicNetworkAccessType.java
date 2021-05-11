// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PublicNetworkAccessType. */
public final class PublicNetworkAccessType extends ExpandableStringEnum<PublicNetworkAccessType> {
    /** Static value Enabled for PublicNetworkAccessType. */
    public static final PublicNetworkAccessType ENABLED = fromString("Enabled");

    /** Static value Disabled for PublicNetworkAccessType. */
    public static final PublicNetworkAccessType DISABLED = fromString("Disabled");

    /**
     * Creates or finds a PublicNetworkAccessType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PublicNetworkAccessType.
     */
    @JsonCreator
    public static PublicNetworkAccessType fromString(String name) {
        return fromString(name, PublicNetworkAccessType.class);
    }

    /** @return known PublicNetworkAccessType values. */
    public static Collection<PublicNetworkAccessType> values() {
        return values(PublicNetworkAccessType.class);
    }
}
