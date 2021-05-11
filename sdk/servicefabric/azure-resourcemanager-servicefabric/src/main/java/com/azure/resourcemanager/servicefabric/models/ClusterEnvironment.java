// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClusterEnvironment. */
public final class ClusterEnvironment extends ExpandableStringEnum<ClusterEnvironment> {
    /** Static value Windows for ClusterEnvironment. */
    public static final ClusterEnvironment WINDOWS = fromString("Windows");

    /** Static value Linux for ClusterEnvironment. */
    public static final ClusterEnvironment LINUX = fromString("Linux");

    /**
     * Creates or finds a ClusterEnvironment from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterEnvironment.
     */
    @JsonCreator
    public static ClusterEnvironment fromString(String name) {
        return fromString(name, ClusterEnvironment.class);
    }

    /** @return known ClusterEnvironment values. */
    public static Collection<ClusterEnvironment> values() {
        return values(ClusterEnvironment.class);
    }
}
