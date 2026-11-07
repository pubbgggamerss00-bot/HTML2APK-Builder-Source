package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vq1 extends rq1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<br1, Thread> f9922a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<br1, br1> f9923b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<? super cr1<?>, br1> f9924c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<? super cr1<?>, uq1> f9925d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<? super cr1<?>, Object> f9926e;

    public vq1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f9922a = atomicReferenceFieldUpdater;
        this.f9923b = atomicReferenceFieldUpdater2;
        this.f9924c = atomicReferenceFieldUpdater3;
        this.f9925d = atomicReferenceFieldUpdater4;
        this.f9926e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final uq1 a(cr1 cr1Var, uq1 uq1Var) {
        return this.f9925d.getAndSet(cr1Var, uq1Var);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final br1 b(cr1 cr1Var) {
        return this.f9924c.getAndSet(cr1Var, br1.f3257c);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final void c(br1 br1Var, br1 br1Var2) {
        this.f9923b.lazySet(br1Var, br1Var2);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final void d(br1 br1Var, Thread thread) {
        this.f9922a.lazySet(br1Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean e(cr1 cr1Var, uq1 uq1Var, uq1 uq1Var2) {
        return sj1.i(this.f9925d, cr1Var, uq1Var, uq1Var2);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean f(cr1 cr1Var, Object obj, Object obj2) {
        return sj1.i(this.f9926e, cr1Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean g(cr1 cr1Var, br1 br1Var, br1 br1Var2) {
        return sj1.i(this.f9924c, cr1Var, br1Var, br1Var2);
    }
}
