/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in IntelligencePacks.
 */
public class IntelligencePacksInner {
    /** The Retrofit service to perform REST calls. */
    private IntelligencePacksService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of IntelligencePacksInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntelligencePacksInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(IntelligencePacksService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for IntelligencePacks to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntelligencePacksService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_08_01.IntelligencePacks disable" })
        @POST("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/intelligencePacks/{intelligencePackName}/Disable")
        Observable<Response<ResponseBody>> disable(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("intelligencePackName") String intelligencePackName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_08_01.IntelligencePacks enable" })
        @POST("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/intelligencePacks/{intelligencePackName}/Enable")
        Observable<Response<ResponseBody>> enable(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("intelligencePackName") String intelligencePackName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_08_01.IntelligencePacks list" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/intelligencePacks")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Disables an intelligence pack for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be disabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void disable(String resourceGroupName, String workspaceName, String intelligencePackName) {
        disableWithServiceResponseAsync(resourceGroupName, workspaceName, intelligencePackName).toBlocking().single().body();
    }

    /**
     * Disables an intelligence pack for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be disabled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> disableAsync(String resourceGroupName, String workspaceName, String intelligencePackName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(disableWithServiceResponseAsync(resourceGroupName, workspaceName, intelligencePackName), serviceCallback);
    }

    /**
     * Disables an intelligence pack for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be disabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> disableAsync(String resourceGroupName, String workspaceName, String intelligencePackName) {
        return disableWithServiceResponseAsync(resourceGroupName, workspaceName, intelligencePackName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Disables an intelligence pack for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be disabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> disableWithServiceResponseAsync(String resourceGroupName, String workspaceName, String intelligencePackName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (intelligencePackName == null) {
            throw new IllegalArgumentException("Parameter intelligencePackName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.disable(resourceGroupName, workspaceName, intelligencePackName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = disableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> disableDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Enables an intelligence pack for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void enable(String resourceGroupName, String workspaceName, String intelligencePackName) {
        enableWithServiceResponseAsync(resourceGroupName, workspaceName, intelligencePackName).toBlocking().single().body();
    }

    /**
     * Enables an intelligence pack for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be enabled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> enableAsync(String resourceGroupName, String workspaceName, String intelligencePackName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(enableWithServiceResponseAsync(resourceGroupName, workspaceName, intelligencePackName), serviceCallback);
    }

    /**
     * Enables an intelligence pack for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> enableAsync(String resourceGroupName, String workspaceName, String intelligencePackName) {
        return enableWithServiceResponseAsync(resourceGroupName, workspaceName, intelligencePackName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Enables an intelligence pack for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> enableWithServiceResponseAsync(String resourceGroupName, String workspaceName, String intelligencePackName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (intelligencePackName == null) {
            throw new IllegalArgumentException("Parameter intelligencePackName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.enable(resourceGroupName, workspaceName, intelligencePackName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = enableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> enableDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all the intelligence packs possible and whether they are enabled or disabled for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;IntelligencePackInner&gt; object if successful.
     */
    public List<IntelligencePackInner> list(String resourceGroupName, String workspaceName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Lists all the intelligence packs possible and whether they are enabled or disabled for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<IntelligencePackInner>> listAsync(String resourceGroupName, String workspaceName, final ServiceCallback<List<IntelligencePackInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Lists all the intelligence packs possible and whether they are enabled or disabled for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IntelligencePackInner&gt; object
     */
    public Observable<List<IntelligencePackInner>> listAsync(String resourceGroupName, String workspaceName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<List<IntelligencePackInner>>, List<IntelligencePackInner>>() {
            @Override
            public List<IntelligencePackInner> call(ServiceResponse<List<IntelligencePackInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the intelligence packs possible and whether they are enabled or disabled for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IntelligencePackInner&gt; object
     */
    public Observable<ServiceResponse<List<IntelligencePackInner>>> listWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, workspaceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<IntelligencePackInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<IntelligencePackInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<IntelligencePackInner>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<IntelligencePackInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<IntelligencePackInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<IntelligencePackInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
