package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p92 extends me {

    /* renamed from: t, reason: collision with root package name */
    public final String f8001t;

    public p92(String str) {
        super(11);
        this.f8001t = str;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void f(String str) {
        String str2 = this.f8001t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
