/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.PrivateLinkResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.monitor.v2019_11_01.PrivateLinkResource;

class PrivateLinkResourcesImpl extends WrapperImpl<PrivateLinkResourcesInner> implements PrivateLinkResources {
    private final MonitorManager manager;

    PrivateLinkResourcesImpl(MonitorManager manager) {
        super(manager.inner().privateLinkResources());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    private PrivateLinkResourceImpl wrapModel(PrivateLinkResourceInner inner) {
        return  new PrivateLinkResourceImpl(inner, manager());
    }

    @Override
    public Observable<PrivateLinkResource> listByPrivateLinkScopeAsync(final String resourceGroupName, final String scopeName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.listByPrivateLinkScopeAsync(resourceGroupName, scopeName)
        .flatMapIterable(new Func1<Page<PrivateLinkResourceInner>, Iterable<PrivateLinkResourceInner>>() {
            @Override
            public Iterable<PrivateLinkResourceInner> call(Page<PrivateLinkResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateLinkResourceInner, PrivateLinkResource>() {
            @Override
            public PrivateLinkResource call(PrivateLinkResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PrivateLinkResource> getAsync(String resourceGroupName, String scopeName, String groupName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, scopeName, groupName)
        .flatMap(new Func1<PrivateLinkResourceInner, Observable<PrivateLinkResource>>() {
            @Override
            public Observable<PrivateLinkResource> call(PrivateLinkResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PrivateLinkResource)wrapModel(inner));
                }
            }
       });
    }

}