package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fa2 implements ca2 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4577c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile x92 f4578a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4579b;

    public static ca2 a(x92 x92Var) {
        if ((x92Var instanceof fa2) || (x92Var instanceof w92)) {
            return x92Var;
        }
        fa2 fa2Var = new fa2();
        fa2Var.f4579b = f4577c;
        fa2Var.f4578a = x92Var;
        return fa2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Object obj = this.f4579b;
        if (obj != f4577c) {
            return obj;
        }
        x92 x92Var = this.f4578a;
        if (x92Var == null) {
            return this.f4579b;
        }
        Object objZzb = x92Var.zzb();
        this.f4579b = objZzb;
        this.f4578a = null;
        return objZzb;
    }
}
