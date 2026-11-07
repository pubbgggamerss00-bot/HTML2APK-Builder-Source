package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g81 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4939a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f4940b;

    public g81(String str, Bundle bundle) {
        this.f4939a = str;
        this.f4940b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ck0 ck0Var = (ck0) obj;
        ck0Var.f3610a.putString("rtb", this.f4939a);
        Bundle bundle = this.f4940b;
        if (bundle.isEmpty()) {
            return;
        }
        ck0Var.f3610a.putBundle("adapter_initialization_status", bundle);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
