// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.DirectoryObjectPartnerReference;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Object Partner Reference Collection With References Request.
 */
public interface IDirectoryObjectPartnerReferenceCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IDirectoryObjectPartnerReferenceCollectionWithReferencesPage> callback);

    IDirectoryObjectPartnerReferenceCollectionWithReferencesPage get() throws ClientException;

    IDirectoryObjectPartnerReferenceCollectionWithReferencesRequest expand(final String value);
    
    IDirectoryObjectPartnerReferenceCollectionWithReferencesRequest select(final String value);

    IDirectoryObjectPartnerReferenceCollectionWithReferencesRequest top(final int value);

}
