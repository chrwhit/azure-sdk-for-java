// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * This activity evaluates a boolean expression and executes either the activities under the ifTrueActivities property
 * or the ifFalseActivities property depending on the result of the expression.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("IfCondition")
@JsonFlatten
@Fluent
public class IfConditionActivity extends ControlActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IfConditionActivity.class);

    /*
     * An expression that would evaluate to Boolean. This is used to determine
     * the block of activities (ifTrueActivities or ifFalseActivities) that
     * will be executed.
     */
    @JsonProperty(value = "typeProperties.expression", required = true)
    private Expression expression;

    /*
     * List of activities to execute if expression is evaluated to true. This
     * is an optional property and if not provided, the activity will exit
     * without any action.
     */
    @JsonProperty(value = "typeProperties.ifTrueActivities")
    private List<Activity> ifTrueActivities;

    /*
     * List of activities to execute if expression is evaluated to false. This
     * is an optional property and if not provided, the activity will exit
     * without any action.
     */
    @JsonProperty(value = "typeProperties.ifFalseActivities")
    private List<Activity> ifFalseActivities;

    /**
     * Get the expression property: An expression that would evaluate to Boolean. This is used to determine the block of
     * activities (ifTrueActivities or ifFalseActivities) that will be executed.
     *
     * @return the expression value.
     */
    public Expression expression() {
        return this.expression;
    }

    /**
     * Set the expression property: An expression that would evaluate to Boolean. This is used to determine the block of
     * activities (ifTrueActivities or ifFalseActivities) that will be executed.
     *
     * @param expression the expression value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get the ifTrueActivities property: List of activities to execute if expression is evaluated to true. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @return the ifTrueActivities value.
     */
    public List<Activity> ifTrueActivities() {
        return this.ifTrueActivities;
    }

    /**
     * Set the ifTrueActivities property: List of activities to execute if expression is evaluated to true. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @param ifTrueActivities the ifTrueActivities value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withIfTrueActivities(List<Activity> ifTrueActivities) {
        this.ifTrueActivities = ifTrueActivities;
        return this;
    }

    /**
     * Get the ifFalseActivities property: List of activities to execute if expression is evaluated to false. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @return the ifFalseActivities value.
     */
    public List<Activity> ifFalseActivities() {
        return this.ifFalseActivities;
    }

    /**
     * Set the ifFalseActivities property: List of activities to execute if expression is evaluated to false. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @param ifFalseActivities the ifFalseActivities value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withIfFalseActivities(List<Activity> ifFalseActivities) {
        this.ifFalseActivities = ifFalseActivities;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IfConditionActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IfConditionActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IfConditionActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IfConditionActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
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
        if (expression() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property expression in model IfConditionActivity"));
        } else {
            expression().validate();
        }
        if (ifTrueActivities() != null) {
            ifTrueActivities().forEach(e -> e.validate());
        }
        if (ifFalseActivities() != null) {
            ifFalseActivities().forEach(e -> e.validate());
        }
    }
}
