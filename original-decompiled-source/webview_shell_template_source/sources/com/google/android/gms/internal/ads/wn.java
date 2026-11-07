package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wn implements fq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f10234a;

    public wn(SharedPreferences sharedPreferences) {
        this.f10234a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final String a(String str, String str2) {
        return this.f10234a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final Double b(String str, double d7) {
        try {
            return Double.valueOf(r0.getFloat(str, (float) d7));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f10234a.getString(str, String.valueOf(d7)));
        }
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final Long c(String str, long j6) {
        try {
            return Long.valueOf(this.f10234a.getLong(str, j6));
        } catch (ClassCastException unused) {
            return Long.valueOf(r0.getInt(str, (int) j6));
        }
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final Boolean d(String str, boolean z6) {
        SharedPreferences sharedPreferences = this.f10234a;
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, z6));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z6)));
        }
    }
}
