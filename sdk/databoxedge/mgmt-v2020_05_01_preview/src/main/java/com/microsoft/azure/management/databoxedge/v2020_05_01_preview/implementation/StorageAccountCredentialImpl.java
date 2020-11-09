/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.StorageAccountCredential;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.AsymmetricEncryptedSecret;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.SSLStatus;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.AccountType;

class StorageAccountCredentialImpl extends CreatableUpdatableImpl<StorageAccountCredential, StorageAccountCredentialInner, StorageAccountCredentialImpl> implements StorageAccountCredential, StorageAccountCredential.Definition, StorageAccountCredential.Update {
    private final DataBoxEdgeManager manager;
    private String deviceName;
    private String name;
    private String resourceGroupName;

    StorageAccountCredentialImpl(String name, DataBoxEdgeManager manager) {
        super(name, new StorageAccountCredentialInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    StorageAccountCredentialImpl(StorageAccountCredentialInner inner, DataBoxEdgeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.deviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "dataBoxEdgeDevices");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccountCredentials");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        //
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<StorageAccountCredential> createResourceAsync() {
        StorageAccountCredentialsInner client = this.manager().inner().storageAccountCredentials();
        return client.createOrUpdateAsync(this.deviceName, this.name, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<StorageAccountCredential> updateResourceAsync() {
        StorageAccountCredentialsInner client = this.manager().inner().storageAccountCredentials();
        return client.createOrUpdateAsync(this.deviceName, this.name, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<StorageAccountCredentialInner> getInnerAsync() {
        StorageAccountCredentialsInner client = this.manager().inner().storageAccountCredentials();
        return client.getAsync(this.deviceName, this.name, this.resourceGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AsymmetricEncryptedSecret accountKey() {
        return this.inner().accountKey();
    }

    @Override
    public AccountType accountType() {
        return this.inner().accountType();
    }

    @Override
    public String alias() {
        return this.inner().alias();
    }

    @Override
    public String blobDomainName() {
        return this.inner().blobDomainName();
    }

    @Override
    public String connectionString() {
        return this.inner().connectionString();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SSLStatus sslStatus() {
        return this.inner().sslStatus();
    }

    @Override
    public String storageAccountId() {
        return this.inner().storageAccountId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userName() {
        return this.inner().userName();
    }

    @Override
    public StorageAccountCredentialImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public StorageAccountCredentialImpl withAccountType(AccountType accountType) {
        this.inner().withAccountType(accountType);
        return this;
    }

    @Override
    public StorageAccountCredentialImpl withAlias(String alias) {
        this.inner().withAlias(alias);
        return this;
    }

    @Override
    public StorageAccountCredentialImpl withSslStatus(SSLStatus sslStatus) {
        this.inner().withSslStatus(sslStatus);
        return this;
    }

    @Override
    public StorageAccountCredentialImpl withAccountKey(AsymmetricEncryptedSecret accountKey) {
        this.inner().withAccountKey(accountKey);
        return this;
    }

    @Override
    public StorageAccountCredentialImpl withBlobDomainName(String blobDomainName) {
        this.inner().withBlobDomainName(blobDomainName);
        return this;
    }

    @Override
    public StorageAccountCredentialImpl withConnectionString(String connectionString) {
        this.inner().withConnectionString(connectionString);
        return this;
    }

    @Override
    public StorageAccountCredentialImpl withStorageAccountId(String storageAccountId) {
        this.inner().withStorageAccountId(storageAccountId);
        return this;
    }

    @Override
    public StorageAccountCredentialImpl withUserName(String userName) {
        this.inner().withUserName(userName);
        return this;
    }

}