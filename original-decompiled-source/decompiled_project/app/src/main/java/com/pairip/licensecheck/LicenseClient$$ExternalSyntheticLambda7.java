package com.pairip.licensecheck;

import android.content.Context;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class LicenseClient$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ Context f$0;

    @Override // java.lang.Runnable
    public final void run() {
        LicenseClient.getInstance(this.f$0).initializeLicenseCheck();
    }
}
