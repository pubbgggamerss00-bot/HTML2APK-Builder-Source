package com.pairip.licensecheck;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
public final class TrialClient {
    public static void stopTrial(Context context) {
        LicenseClient.stopTrial(context);
    }

    public static int checkTrialStatus(Context context) {
        Objects.requireNonNull(context, "Context must not be null.");
        return LicenseClient.checkTrialStatus().getStatusCode();
    }

    private TrialClient() {
    }
}
