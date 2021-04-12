// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventSourceValues. */
public final class EventSourceValues extends ExpandableStringEnum<EventSourceValues> {
    /** Static value ResourceHealth for EventSourceValues. */
    public static final EventSourceValues RESOURCE_HEALTH = fromString("ResourceHealth");

    /** Static value ServiceHealth for EventSourceValues. */
    public static final EventSourceValues SERVICE_HEALTH = fromString("ServiceHealth");

    /**
     * Creates or finds a EventSourceValues from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventSourceValues.
     */
    @JsonCreator
    public static EventSourceValues fromString(String name) {
        return fromString(name, EventSourceValues.class);
    }

    /** @return known EventSourceValues values. */
    public static Collection<EventSourceValues> values() {
        return values(EventSourceValues.class);
    }
}
