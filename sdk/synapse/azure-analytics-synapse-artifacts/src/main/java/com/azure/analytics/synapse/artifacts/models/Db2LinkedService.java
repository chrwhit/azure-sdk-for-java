// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Linked service for DB2 data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Db2")
@JsonFlatten
@Fluent
public class Db2LinkedService extends LinkedService {
    /*
     * Server name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /*
     * Database name for connection. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /*
     * AuthenticationType to be used for connection.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Db2AuthenticationType authenticationType;

    /*
     * Username for authentication. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * Password for authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * Under where packages are created when querying database. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.packageCollection")
    private Object packageCollection;

    /*
     * Certificate Common Name when TLS is enabled. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.certificateCommonName")
    private Object certificateCommonName;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server property: Server name for connection. Type: string (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object getServer() {
        return this.server;
    }

    /**
     * Set the server property: Server name for connection. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService setServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the database property: Database name for connection. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: Database name for connection. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService setDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the authenticationType property: AuthenticationType to be used for connection.
     *
     * @return the authenticationType value.
     */
    public Db2AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: AuthenticationType to be used for connection.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService setAuthenticationType(Db2AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for authentication.
     *
     * @param password the password value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the packageCollection property: Under where packages are created when querying database. Type: string (or
     * Expression with resultType string).
     *
     * @return the packageCollection value.
     */
    public Object getPackageCollection() {
        return this.packageCollection;
    }

    /**
     * Set the packageCollection property: Under where packages are created when querying database. Type: string (or
     * Expression with resultType string).
     *
     * @param packageCollection the packageCollection value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService setPackageCollection(Object packageCollection) {
        this.packageCollection = packageCollection;
        return this;
    }

    /**
     * Get the certificateCommonName property: Certificate Common Name when TLS is enabled. Type: string (or Expression
     * with resultType string).
     *
     * @return the certificateCommonName value.
     */
    public Object getCertificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * Set the certificateCommonName property: Certificate Common Name when TLS is enabled. Type: string (or Expression
     * with resultType string).
     *
     * @param certificateCommonName the certificateCommonName value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService setCertificateCommonName(Object certificateCommonName) {
        this.certificateCommonName = certificateCommonName;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}