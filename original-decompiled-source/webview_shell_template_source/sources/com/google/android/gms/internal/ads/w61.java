package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w61 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10072b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f10073c;

    public /* synthetic */ w61(String str, Bundle bundle, String str2) {
        this.f10071a = str;
        this.f10072b = str2;
        this.f10073c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        bundle.putString("consent_string", this.f10071a);
        bundle.putString("fc_consent", this.f10072b);
        Bundle bundle2 = this.f10073c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
