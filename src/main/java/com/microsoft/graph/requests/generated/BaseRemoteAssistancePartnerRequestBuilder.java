// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Remote Assistance Partner Request Builder.
 */
public class BaseRemoteAssistancePartnerRequestBuilder extends BaseRequestBuilder implements IBaseRemoteAssistancePartnerRequestBuilder {

    /**
     * The request builder for the RemoteAssistancePartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseRemoteAssistancePartnerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IRemoteAssistancePartnerRequest instance
     */
    public IRemoteAssistancePartnerRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IRemoteAssistancePartnerRequest instance
     */
    public IRemoteAssistancePartnerRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new RemoteAssistancePartnerRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IRemoteAssistancePartnerBeginOnboardingRequestBuilder beginOnboarding() {
        return new RemoteAssistancePartnerBeginOnboardingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.beginOnboarding"), getClient(), null);
    }

    public IRemoteAssistancePartnerDisconnectRequestBuilder disconnect() {
        return new RemoteAssistancePartnerDisconnectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.disconnect"), getClient(), null);
    }
}