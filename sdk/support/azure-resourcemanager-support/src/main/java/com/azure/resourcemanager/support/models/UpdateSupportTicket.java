// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Updates severity, ticket status, and contact details in the support ticket. */
@Fluent
public final class UpdateSupportTicket {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateSupportTicket.class);

    /*
     * Severity level.
     */
    @JsonProperty(value = "severity")
    private SeverityLevel severity;

    /*
     * Status to be updated on the ticket.
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * Contact details to be updated on the support ticket.
     */
    @JsonProperty(value = "contactDetails")
    private UpdateContactProfile contactDetails;

    /**
     * Get the severity property: Severity level.
     *
     * @return the severity value.
     */
    public SeverityLevel severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Severity level.
     *
     * @param severity the severity value to set.
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withSeverity(SeverityLevel severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the status property: Status to be updated on the ticket.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Status to be updated on the ticket.
     *
     * @param status the status value to set.
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the contactDetails property: Contact details to be updated on the support ticket.
     *
     * @return the contactDetails value.
     */
    public UpdateContactProfile contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set the contactDetails property: Contact details to be updated on the support ticket.
     *
     * @param contactDetails the contactDetails value to set.
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withContactDetails(UpdateContactProfile contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contactDetails() != null) {
            contactDetails().validate();
        }
    }
}
