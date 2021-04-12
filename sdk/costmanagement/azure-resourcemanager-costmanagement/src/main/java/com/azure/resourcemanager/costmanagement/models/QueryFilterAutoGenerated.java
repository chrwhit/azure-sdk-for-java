// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The filter expression to be used in the export. */
@Fluent
public final class QueryFilterAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryFilterAutoGenerated.class);

    /*
     * The logical "AND" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "and")
    private List<QueryFilterAutoGenerated> and;

    /*
     * The logical "OR" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "or")
    private List<QueryFilterAutoGenerated> or;

    /*
     * Has comparison expression for a dimension
     */
    @JsonProperty(value = "dimensions")
    private QueryComparisonExpression dimensions;

    /*
     * Has comparison expression for a tag
     */
    @JsonProperty(value = "tags")
    private QueryComparisonExpression tags;

    /**
     * Get the and property: The logical "AND" expression. Must have at least 2 items.
     *
     * @return the and value.
     */
    public List<QueryFilterAutoGenerated> and() {
        return this.and;
    }

    /**
     * Set the and property: The logical "AND" expression. Must have at least 2 items.
     *
     * @param and the and value to set.
     * @return the QueryFilterAutoGenerated object itself.
     */
    public QueryFilterAutoGenerated withAnd(List<QueryFilterAutoGenerated> and) {
        this.and = and;
        return this;
    }

    /**
     * Get the or property: The logical "OR" expression. Must have at least 2 items.
     *
     * @return the or value.
     */
    public List<QueryFilterAutoGenerated> or() {
        return this.or;
    }

    /**
     * Set the or property: The logical "OR" expression. Must have at least 2 items.
     *
     * @param or the or value to set.
     * @return the QueryFilterAutoGenerated object itself.
     */
    public QueryFilterAutoGenerated withOr(List<QueryFilterAutoGenerated> or) {
        this.or = or;
        return this;
    }

    /**
     * Get the dimensions property: Has comparison expression for a dimension.
     *
     * @return the dimensions value.
     */
    public QueryComparisonExpression dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Has comparison expression for a dimension.
     *
     * @param dimensions the dimensions value to set.
     * @return the QueryFilterAutoGenerated object itself.
     */
    public QueryFilterAutoGenerated withDimensions(QueryComparisonExpression dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the tags property: Has comparison expression for a tag.
     *
     * @return the tags value.
     */
    public QueryComparisonExpression tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Has comparison expression for a tag.
     *
     * @param tags the tags value to set.
     * @return the QueryFilterAutoGenerated object itself.
     */
    public QueryFilterAutoGenerated withTags(QueryComparisonExpression tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (and() != null) {
            and().forEach(e -> e.validate());
        }
        if (or() != null) {
            or().forEach(e -> e.validate());
        }
        if (dimensions() != null) {
            dimensions().validate();
        }
        if (tags() != null) {
            tags().validate();
        }
    }
}
