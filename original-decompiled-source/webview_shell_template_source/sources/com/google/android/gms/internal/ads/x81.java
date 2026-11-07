package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x81 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10428a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10429b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10430c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10431d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10432e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10433f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10434g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10435i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10436j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10437k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10438l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10439m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10440n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10441o;

    public x81(boolean z6, boolean z7, String str, boolean z8, boolean z9, boolean z10, String str2, ArrayList arrayList, String str3, String str4, boolean z11, long j6, boolean z12, String str5, int i6) {
        String str6 = Build.FINGERPRINT;
        String str7 = Build.MODEL;
        this.f10428a = z6;
        this.f10429b = z7;
        this.f10430c = str;
        this.f10431d = z8;
        this.f10432e = z9;
        this.f10433f = z10;
        this.f10434g = str2;
        this.h = arrayList;
        this.f10435i = str3;
        this.f10436j = str4;
        this.f10437k = z11;
        this.f10438l = j6;
        this.f10439m = z12;
        this.f10440n = str5;
        this.f10441o = i6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        bundle.putBoolean("cog", this.f10428a);
        bundle.putBoolean("coh", this.f10429b);
        bundle.putString("gl", this.f10430c);
        bundle.putBoolean("simulator", this.f10431d);
        bundle.putBoolean("is_latchsky", this.f10432e);
        bundle.putInt("build_api_level", this.f10441o);
        if (!((Boolean) zzbe.zzc().a(zn.Ta)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f10433f);
        }
        bundle.putString("hl", this.f10434g);
        ArrayList<String> arrayList = this.h;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("mv", this.f10435i);
        bundle.putString("submodel", Build.MODEL);
        Bundle bundleA = lc1.a("device", bundle);
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", Build.FINGERPRINT);
        bundleA.putLong("remaining_data_partition_space", this.f10438l);
        Bundle bundleA2 = lc1.a("browser", bundleA);
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f10437k);
        String str = this.f10436j;
        if (!TextUtils.isEmpty(str)) {
            Bundle bundleA3 = lc1.a("play_store", bundleA);
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", str);
        }
        if (((Boolean) zzbe.zzc().a(zn.jb)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f10439m);
        }
        String str2 = this.f10440n;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("v_unity", str2);
        }
        if (((Boolean) zzbe.zzc().a(zn.db)).booleanValue()) {
            lc1.f(bundle, "gotmt_l", true, ((Boolean) zzbe.zzc().a(zn.ab)).booleanValue());
            lc1.f(bundle, "gotmt_i", true, ((Boolean) zzbe.zzc().a(zn.Za)).booleanValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((ck0) obj).f3611b;
        bundle.putBoolean("simulator", this.f10431d);
        bundle.putInt("build_api_level", this.f10441o);
        ArrayList<String> arrayList = this.h;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", Build.MODEL);
    }
}
