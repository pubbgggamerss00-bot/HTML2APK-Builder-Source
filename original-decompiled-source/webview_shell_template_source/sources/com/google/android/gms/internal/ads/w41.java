package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w41 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f10033a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10034b;

    /* renamed from: c, reason: collision with root package name */
    public final ec1 f10035c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f10036d;

    public w41(hs1 hs1Var, Context context, ec1 ec1Var, ViewGroup viewGroup) {
        this.f10033a = hs1Var;
        this.f10034b = context;
        this.f10035c = ec1Var;
        this.f10036d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        zn.a(this.f10034b);
        return this.f10033a.u(new bz0(1, this));
    }
}
