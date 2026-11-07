package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6446a;

    public kn(Context context) {
        com.google.android.gms.common.internal.l.g("Context can not be null", context);
        this.f6446a = context;
    }

    public final boolean a(Intent intent) {
        com.google.android.gms.common.internal.l.g("Intent can not be null", intent);
        return !this.f6446a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
