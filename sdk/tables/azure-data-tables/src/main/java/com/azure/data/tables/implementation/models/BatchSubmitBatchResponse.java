// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.data.tables.models.BatchOperationResponse;

/**
 * Contains all response data for the submitBatch operation.
 */
public final class BatchSubmitBatchResponse extends ResponseBase<BatchSubmitBatchHeaders, BatchOperationResponse[]> {
    /**
     * Creates an instance of BatchSubmitBatchResponse.
     *
     * @param request the request which resulted in this BatchSubmitBatchResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the content stream.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BatchSubmitBatchResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders,
                                    BatchOperationResponse[] value, BatchSubmitBatchHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the response content stream.
     */
    @Override
    public BatchOperationResponse[] getValue() {
        return super.getValue();
    }
}