/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2020_12_01.DiskEncryptionSet;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_12_01.DiskEncryptionSetUpdate;
import com.microsoft.azure.management.compute.v2020_12_01.EncryptionSetIdentity;
import com.microsoft.azure.management.compute.v2020_12_01.DiskEncryptionSetType;
import com.microsoft.azure.management.compute.v2020_12_01.KeyForDiskEncryptionSet;
import java.util.List;
import rx.functions.Func1;

class DiskEncryptionSetImpl extends GroupableResourceCoreImpl<DiskEncryptionSet, DiskEncryptionSetInner, DiskEncryptionSetImpl, ComputeManager> implements DiskEncryptionSet, DiskEncryptionSet.Definition, DiskEncryptionSet.Update {
    private DiskEncryptionSetUpdate updateParameter;
    DiskEncryptionSetImpl(String name, DiskEncryptionSetInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new DiskEncryptionSetUpdate();
    }

    @Override
    public Observable<DiskEncryptionSet> createResourceAsync() {
        DiskEncryptionSetsInner client = this.manager().inner().diskEncryptionSets();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<DiskEncryptionSetInner, DiskEncryptionSetInner>() {
               @Override
               public DiskEncryptionSetInner call(DiskEncryptionSetInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DiskEncryptionSet> updateResourceAsync() {
        DiskEncryptionSetsInner client = this.manager().inner().diskEncryptionSets();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DiskEncryptionSetInner, DiskEncryptionSetInner>() {
               @Override
               public DiskEncryptionSetInner call(DiskEncryptionSetInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DiskEncryptionSetInner> getInnerAsync() {
        DiskEncryptionSetsInner client = this.manager().inner().diskEncryptionSets();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DiskEncryptionSetUpdate();
    }

    @Override
    public KeyForDiskEncryptionSet activeKey() {
        return this.inner().activeKey();
    }

    @Override
    public DiskEncryptionSetType encryptionType() {
        return this.inner().encryptionType();
    }

    @Override
    public EncryptionSetIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public List<KeyForDiskEncryptionSet> previousKeys() {
        return this.inner().previousKeys();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DiskEncryptionSetImpl withIdentity(EncryptionSetIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public DiskEncryptionSetImpl withActiveKey(KeyForDiskEncryptionSet activeKey) {
        if (isInCreateMode()) {
            this.inner().withActiveKey(activeKey);
        } else {
            this.updateParameter.withActiveKey(activeKey);
        }
        return this;
    }

    @Override
    public DiskEncryptionSetImpl withEncryptionType(DiskEncryptionSetType encryptionType) {
        if (isInCreateMode()) {
            this.inner().withEncryptionType(encryptionType);
        } else {
            this.updateParameter.withEncryptionType(encryptionType);
        }
        return this;
    }

}
