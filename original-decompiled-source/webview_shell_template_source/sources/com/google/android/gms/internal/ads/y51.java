package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y51 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10864b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10865c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10866d;

    /* renamed from: e, reason: collision with root package name */
    public final hj0 f10867e;

    /* renamed from: f, reason: collision with root package name */
    public final uc1 f10868f;

    /* renamed from: g, reason: collision with root package name */
    public final ec1 f10869g;
    public final zzj h = zzv.zzp().d();

    /* renamed from: i, reason: collision with root package name */
    public final zt0 f10870i;

    /* renamed from: j, reason: collision with root package name */
    public final mj0 f10871j;

    public y51(Context context, String str, String str2, hj0 hj0Var, uc1 uc1Var, ec1 ec1Var, zt0 zt0Var, mj0 mj0Var, long j6) {
        this.f10863a = context;
        this.f10864b = str;
        this.f10865c = str2;
        this.f10867e = hj0Var;
        this.f10868f = uc1Var;
        this.f10869g = ec1Var;
        this.f10870i = zt0Var;
        this.f10871j = mj0Var;
        this.f10866d = j6;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        Bundle bundle = new Bundle();
        this.f10870i.f11575a.put("seq_num", this.f10864b);
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue()) {
            this.f10870i.a("tsacc", String.valueOf(zzv.zzC().a() - this.f10866d));
            zt0 zt0Var = this.f10870i;
            zzv.zzq();
            zt0Var.a("foreground", true != zzs.zzH(this.f10863a) ? "1" : "0");
        }
        hj0 hj0Var = this.f10867e;
        zzm zzmVar = this.f10869g.f4209d;
        v60 v60Var = hj0Var.f5430t;
        synchronized (v60Var.f9725d) {
            long jB = v60Var.f9722a.b();
            v60Var.f9730j = jB;
            e70 e70Var = v60Var.f9723b;
            synchronized (e70Var.f4140a) {
                e70Var.f4143d.a(zzmVar, jB);
            }
        }
        bundle.putAll(this.f10868f.a());
        return bs1.m(new z51(this.f10863a, bundle, this.f10864b, this.f10865c, this.h, this.f10869g.f4211f, this.f10871j));
    }
}
