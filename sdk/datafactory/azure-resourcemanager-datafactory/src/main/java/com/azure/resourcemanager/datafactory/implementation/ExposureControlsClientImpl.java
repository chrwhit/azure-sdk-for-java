// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.ExposureControlsClient;
import com.azure.resourcemanager.datafactory.fluent.models.ExposureControlBatchResponseInner;
import com.azure.resourcemanager.datafactory.fluent.models.ExposureControlResponseInner;
import com.azure.resourcemanager.datafactory.models.ExposureControlBatchRequest;
import com.azure.resourcemanager.datafactory.models.ExposureControlRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExposureControlsClient. */
public final class ExposureControlsClientImpl implements ExposureControlsClient {
    private final ClientLogger logger = new ClientLogger(ExposureControlsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ExposureControlsService service;

    /** The service client containing this operation class. */
    private final DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of ExposureControlsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ExposureControlsClientImpl(DataFactoryManagementClientImpl client) {
        this.service =
            RestProxy.create(ExposureControlsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataFactoryManagementClientExposureControls to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataFactoryManagemen")
    private interface ExposureControlsService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.DataFactory/locations/{locationId}/getFeatureValue")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExposureControlResponseInner>> getFeatureValue(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("locationId") String locationId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ExposureControlRequest exposureControlRequest,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/getFeatureValue")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExposureControlResponseInner>> getFeatureValueByFactory(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ExposureControlRequest exposureControlRequest,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/queryFeaturesValue")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExposureControlBatchResponseInner>> queryFeatureValuesByFactory(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ExposureControlBatchRequest exposureControlBatchRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get exposure control feature for specific location.
     *
     * @param locationId The location identifier.
     * @param exposureControlRequest The exposure control request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExposureControlResponseInner>> getFeatureValueWithResponseAsync(
        String locationId, ExposureControlRequest exposureControlRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationId is required and cannot be null."));
        }
        if (exposureControlRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter exposureControlRequest is required and cannot be null."));
        } else {
            exposureControlRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getFeatureValue(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            locationId,
                            this.client.getApiVersion(),
                            exposureControlRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get exposure control feature for specific location.
     *
     * @param locationId The location identifier.
     * @param exposureControlRequest The exposure control request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExposureControlResponseInner>> getFeatureValueWithResponseAsync(
        String locationId, ExposureControlRequest exposureControlRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationId is required and cannot be null."));
        }
        if (exposureControlRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter exposureControlRequest is required and cannot be null."));
        } else {
            exposureControlRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getFeatureValue(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                locationId,
                this.client.getApiVersion(),
                exposureControlRequest,
                accept,
                context);
    }

    /**
     * Get exposure control feature for specific location.
     *
     * @param locationId The location identifier.
     * @param exposureControlRequest The exposure control request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExposureControlResponseInner> getFeatureValueAsync(
        String locationId, ExposureControlRequest exposureControlRequest) {
        return getFeatureValueWithResponseAsync(locationId, exposureControlRequest)
            .flatMap(
                (Response<ExposureControlResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get exposure control feature for specific location.
     *
     * @param locationId The location identifier.
     * @param exposureControlRequest The exposure control request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExposureControlResponseInner getFeatureValue(
        String locationId, ExposureControlRequest exposureControlRequest) {
        return getFeatureValueAsync(locationId, exposureControlRequest).block();
    }

    /**
     * Get exposure control feature for specific location.
     *
     * @param locationId The location identifier.
     * @param exposureControlRequest The exposure control request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExposureControlResponseInner> getFeatureValueWithResponse(
        String locationId, ExposureControlRequest exposureControlRequest, Context context) {
        return getFeatureValueWithResponseAsync(locationId, exposureControlRequest, context).block();
    }

    /**
     * Get exposure control feature for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlRequest The exposure control request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExposureControlResponseInner>> getFeatureValueByFactoryWithResponseAsync(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (exposureControlRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter exposureControlRequest is required and cannot be null."));
        } else {
            exposureControlRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getFeatureValueByFactory(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            this.client.getApiVersion(),
                            exposureControlRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get exposure control feature for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlRequest The exposure control request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExposureControlResponseInner>> getFeatureValueByFactoryWithResponseAsync(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (exposureControlRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter exposureControlRequest is required and cannot be null."));
        } else {
            exposureControlRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getFeatureValueByFactory(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                this.client.getApiVersion(),
                exposureControlRequest,
                accept,
                context);
    }

    /**
     * Get exposure control feature for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlRequest The exposure control request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExposureControlResponseInner> getFeatureValueByFactoryAsync(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest) {
        return getFeatureValueByFactoryWithResponseAsync(resourceGroupName, factoryName, exposureControlRequest)
            .flatMap(
                (Response<ExposureControlResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get exposure control feature for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlRequest The exposure control request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExposureControlResponseInner getFeatureValueByFactory(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest) {
        return getFeatureValueByFactoryAsync(resourceGroupName, factoryName, exposureControlRequest).block();
    }

    /**
     * Get exposure control feature for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlRequest The exposure control request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExposureControlResponseInner> getFeatureValueByFactoryWithResponse(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest, Context context) {
        return getFeatureValueByFactoryWithResponseAsync(
                resourceGroupName, factoryName, exposureControlRequest, context)
            .block();
    }

    /**
     * Get list of exposure control features for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlBatchRequest The exposure control request for list of features.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of exposure control features for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExposureControlBatchResponseInner>> queryFeatureValuesByFactoryWithResponseAsync(
        String resourceGroupName, String factoryName, ExposureControlBatchRequest exposureControlBatchRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (exposureControlBatchRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter exposureControlBatchRequest is required and cannot be null."));
        } else {
            exposureControlBatchRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .queryFeatureValuesByFactory(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            this.client.getApiVersion(),
                            exposureControlBatchRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get list of exposure control features for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlBatchRequest The exposure control request for list of features.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of exposure control features for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExposureControlBatchResponseInner>> queryFeatureValuesByFactoryWithResponseAsync(
        String resourceGroupName,
        String factoryName,
        ExposureControlBatchRequest exposureControlBatchRequest,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (exposureControlBatchRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter exposureControlBatchRequest is required and cannot be null."));
        } else {
            exposureControlBatchRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .queryFeatureValuesByFactory(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                this.client.getApiVersion(),
                exposureControlBatchRequest,
                accept,
                context);
    }

    /**
     * Get list of exposure control features for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlBatchRequest The exposure control request for list of features.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of exposure control features for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExposureControlBatchResponseInner> queryFeatureValuesByFactoryAsync(
        String resourceGroupName, String factoryName, ExposureControlBatchRequest exposureControlBatchRequest) {
        return queryFeatureValuesByFactoryWithResponseAsync(resourceGroupName, factoryName, exposureControlBatchRequest)
            .flatMap(
                (Response<ExposureControlBatchResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get list of exposure control features for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlBatchRequest The exposure control request for list of features.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of exposure control features for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExposureControlBatchResponseInner queryFeatureValuesByFactory(
        String resourceGroupName, String factoryName, ExposureControlBatchRequest exposureControlBatchRequest) {
        return queryFeatureValuesByFactoryAsync(resourceGroupName, factoryName, exposureControlBatchRequest).block();
    }

    /**
     * Get list of exposure control features for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlBatchRequest The exposure control request for list of features.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of exposure control features for specific factory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExposureControlBatchResponseInner> queryFeatureValuesByFactoryWithResponse(
        String resourceGroupName,
        String factoryName,
        ExposureControlBatchRequest exposureControlBatchRequest,
        Context context) {
        return queryFeatureValuesByFactoryWithResponseAsync(
                resourceGroupName, factoryName, exposureControlBatchRequest, context)
            .block();
    }
}
