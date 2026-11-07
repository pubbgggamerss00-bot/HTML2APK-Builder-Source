package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7947a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7948b;

    public p51(String str, boolean z6) {
        this.f7947a = str;
        this.f7948b = z6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ck0 ck0Var = (ck0) obj;
        String str = this.f7947a;
        if (str != null) {
            Bundle bundleA = lc1.a("pii", ck0Var.f3610a);
            bundleA.putString("afai", str);
            bundleA.putBoolean("is_afai_lat", this.f7948b);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
