package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l81 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6607a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6608b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6609c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6610d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6611e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6612f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6613g;
    public final String h;

    public l81(boolean z6, boolean z7, String str, boolean z8, int i6, int i7, int i8, String str2) {
        this.f6607a = z6;
        this.f6608b = z7;
        this.f6609c = str;
        this.f6610d = z8;
        this.f6611e = i6;
        this.f6612f = i7;
        this.f6613g = i8;
        this.h = str2;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        bundle.putString("js", this.f6609c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzbe.zzc().a(zn.P3));
        bundle.putInt("target_api", this.f6611e);
        bundle.putInt("dv", this.f6612f);
        bundle.putInt("lv", this.f6613g);
        if (((Boolean) zzbe.zzc().a(zn.O5)).booleanValue()) {
            String str = this.h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleA = lc1.a("sdk_env", bundle);
        bundleA.putBoolean("mf", ((Boolean) rp.f8676c.c()).booleanValue());
        bundleA.putBoolean("instant_app", this.f6607a);
        bundleA.putBoolean("lite", this.f6608b);
        bundleA.putBoolean("is_privileged_process", this.f6610d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = lc1.a("build_meta", bundleA);
        bundleA2.putString("cl", "697668803");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ck0 ck0Var = (ck0) obj;
        ck0Var.f3611b.putString("js", this.f6609c);
        ck0Var.f3611b.putInt("target_api", this.f6611e);
    }
}
