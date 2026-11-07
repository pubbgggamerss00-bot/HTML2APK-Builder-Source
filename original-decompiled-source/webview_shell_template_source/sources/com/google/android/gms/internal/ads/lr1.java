package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lr1 extends me {

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6837t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f6838u;

    public lr1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(8);
        this.f6837t = atomicReferenceFieldUpdater;
        this.f6838u = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final int a(kr1 kr1Var) {
        return this.f6838u.decrementAndGet(kr1Var);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void l(kr1 kr1Var, Set set) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f6837t;
            if (atomicReferenceFieldUpdater.compareAndSet(kr1Var, null, set)) {
                return;
            }
            if (atomicReferenceFieldUpdater.get(kr1Var) != null && atomicReferenceFieldUpdater.get(kr1Var) != null) {
                return;
            }
        }
    }
}
