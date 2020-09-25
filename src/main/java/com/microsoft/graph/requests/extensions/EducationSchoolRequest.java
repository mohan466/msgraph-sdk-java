// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Request.
 */
public class EducationSchoolRequest extends BaseRequest implements IEducationSchoolRequest {
	
    /**
     * The request for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSchoolRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchool.class);
    }

    /**
     * Gets the EducationSchool from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationSchool from the service
     *
     * @return the EducationSchool from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSchool get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationSchool with a source
     *
     * @param sourceEducationSchool the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationSchool sourceEducationSchool, final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationSchool);
    }

    /**
     * Patches this EducationSchool with a source
     *
     * @param sourceEducationSchool the source object with updates
     * @return the updated EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSchool patch(final EducationSchool sourceEducationSchool) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationSchool newEducationSchool, final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.POST, callback, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the new object to create
     * @return the created EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSchool post(final EducationSchool newEducationSchool) throws ClientException {
        return send(HttpMethod.POST, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EducationSchool newEducationSchool, final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.PUT, callback, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the object to create/update
     * @return the created EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSchool put(final EducationSchool newEducationSchool) throws ClientException {
        return send(HttpMethod.PUT, newEducationSchool);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationSchoolRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationSchoolRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationSchoolRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationSchoolRequest)this;
     }

}

