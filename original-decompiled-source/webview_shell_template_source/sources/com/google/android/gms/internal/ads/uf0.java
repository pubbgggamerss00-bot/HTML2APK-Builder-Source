package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uf0 implements zr1 {
    public final /* synthetic */ cf1 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f9548t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzv f9549u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ vf0 f9550v;

    public uf0(vf0 vf0Var, cf1 cf1Var, String str, zzv zzvVar) {
        this.s = cf1Var;
        this.f9548t = str;
        this.f9549u = zzvVar;
        this.f9550v = vf0Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2a(Object obj) {
        hs1 hs1Var = this.f9550v.f9848e;
        zzv zzvVar = this.f9549u;
        hs1Var.w(new tf0(this.s, (String) obj, zzvVar));
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        this.f9550v.f9848e.w(new sf0(this, th, this.s, this.f9548t, this.f9549u));
    }
}
