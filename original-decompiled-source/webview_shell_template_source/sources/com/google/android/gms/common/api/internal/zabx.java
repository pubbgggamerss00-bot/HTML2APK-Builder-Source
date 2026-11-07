package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.ads.r0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f2407a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f2408b;

    public zabx(r0 r0Var) {
        this.f2408b = r0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f2408b.f8494t;
            throw null;
        }
    }
}
