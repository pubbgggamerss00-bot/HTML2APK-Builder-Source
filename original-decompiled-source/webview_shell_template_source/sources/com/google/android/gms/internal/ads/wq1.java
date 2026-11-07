package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wq1<V> implements Runnable {
    public final cr1<V> s;

    /* renamed from: t, reason: collision with root package name */
    public final c5.a<? extends V> f10254t;

    public wq1(cr1 cr1Var, c5.a aVar) {
        this.s = cr1Var;
        this.f10254t = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.s.s != this) {
            return;
        }
        c5.a<? extends V> aVar = this.f10254t;
        if (cr1.f3647x.f(this.s, this, cr1.g(aVar))) {
            cr1.m(this.s, false);
        }
    }
}
