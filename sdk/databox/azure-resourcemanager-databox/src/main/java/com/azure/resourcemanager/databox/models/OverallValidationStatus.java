// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for OverallValidationStatus. */
public enum OverallValidationStatus {
    /** Enum value AllValidToProceed. */
    ALL_VALID_TO_PROCEED("AllValidToProceed"),

    /** Enum value InputsRevisitRequired. */
    INPUTS_REVISIT_REQUIRED("InputsRevisitRequired"),

    /** Enum value CertainInputValidationsSkipped. */
    CERTAIN_INPUT_VALIDATIONS_SKIPPED("CertainInputValidationsSkipped");

    /** The actual serialized value for a OverallValidationStatus instance. */
    private final String value;

    OverallValidationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OverallValidationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OverallValidationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static OverallValidationStatus fromString(String value) {
        OverallValidationStatus[] items = OverallValidationStatus.values();
        for (OverallValidationStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
