package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ts1 extends fs1 {

    /* renamed from: u, reason: collision with root package name */
    public final or1 f9372u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ vs1 f9373v;

    public ts1(vs1 vs1Var, or1 or1Var) {
        this.f9373v = vs1Var;
        this.f9372u = or1Var;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final Object a() {
        or1 or1Var = this.f9372u;
        c5.a aVarZza = or1Var.zza();
        if (aVarZza != null) {
            return aVarZza;
        }
        throw new NullPointerException(dm1.a("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", or1Var));
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String b() {
        return this.f9372u.toString();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void d(Throwable th) {
        this.f9373v.f(th);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final /* synthetic */ void e(Object obj) {
        this.f9373v.j((c5.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean f() {
        return this.f9373v.isDone();
    }
}
