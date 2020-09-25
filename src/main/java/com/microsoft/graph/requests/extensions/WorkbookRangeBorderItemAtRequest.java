// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderItemAtRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderItemAtRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Border Item At Request.
 */
public class WorkbookRangeBorderItemAtRequest extends BaseRequest implements IWorkbookRangeBorderItemAtRequest {

    /**
     * The request for this WorkbookRangeBorderItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeBorderItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeBorder.class);
    }

    /**
     * Patches the WorkbookRangeBorderItemAt
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(WorkbookRangeBorder srcWorkbookRangeBorder, final ICallback<? super WorkbookRangeBorder> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookRangeBorder);
    }

    /**
     * Patches the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder with which to PATCH
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookRangeBorder patch(WorkbookRangeBorder srcWorkbookRangeBorder) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookRangeBorder);
    }

    /**
     * Puts the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookRangeBorder srcWorkbookRangeBorder, final ICallback<? super WorkbookRangeBorder> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRangeBorder);
    }

    /**
     * Puts the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder to PUT
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookRangeBorder put(WorkbookRangeBorder srcWorkbookRangeBorder) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookRangeBorder);
    }
    /**
     * Gets the WorkbookRangeBorder
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookRangeBorder> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeBorder
     *
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookRangeBorder get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookRangeBorderItemAtRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookRangeBorderItemAtRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookRangeBorderItemAtRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookRangeBorderItemAtRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWorkbookRangeBorderItemAtRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WorkbookRangeBorderItemAtRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IWorkbookRangeBorderItemAtRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (WorkbookRangeBorderItemAtRequest)this;
    }

}
