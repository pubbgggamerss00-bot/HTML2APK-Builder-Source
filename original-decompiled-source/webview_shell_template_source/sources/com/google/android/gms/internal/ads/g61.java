package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g61 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4907a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4908b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4909c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4910d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4911e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4912f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4913g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4914i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4915j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4916k;

    public g61(int i6, boolean z6, boolean z7, int i7, int i8, int i9, int i10, int i11, float f6, boolean z8, boolean z9) {
        this.f4907a = i6;
        this.f4908b = z6;
        this.f4909c = z7;
        this.f4910d = i7;
        this.f4911e = i8;
        this.f4912f = i9;
        this.f4913g = i10;
        this.h = i11;
        this.f4914i = f6;
        this.f4915j = z8;
        this.f4916k = z9;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        if (((Boolean) zzbe.zzc().a(zn.Qa)).booleanValue()) {
            bundle.putInt("muv_min", this.f4911e);
            bundle.putInt("muv_max", this.f4912f);
        }
        bundle.putFloat("android_app_volume", this.f4914i);
        bundle.putBoolean("android_app_muted", this.f4915j);
        if (this.f4916k) {
            return;
        }
        bundle.putInt("am", this.f4907a);
        bundle.putBoolean("ma", this.f4908b);
        bundle.putBoolean("sp", this.f4909c);
        bundle.putInt("muv", this.f4910d);
        bundle.putInt("rm", this.f4913g);
        bundle.putInt("riv", this.h);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
