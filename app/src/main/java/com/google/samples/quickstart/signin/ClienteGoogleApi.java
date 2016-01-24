package com.google.samples.quickstart.signin;

import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Jose on 23/01/2016.
 */
public final class ClienteGoogleApi {
    public static GoogleApiClient mGoogleApiClient;

    public static GoogleApiClient getCliente() {
        return mGoogleApiClient;
    }

    public static void setCliente(GoogleApiClient googleApiClient) {
        mGoogleApiClient = googleApiClient;
    }
}
