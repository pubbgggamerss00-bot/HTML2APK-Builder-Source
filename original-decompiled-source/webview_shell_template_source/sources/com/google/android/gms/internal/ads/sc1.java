package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sc1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f8894a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Callable f8895b;

    /* renamed from: c, reason: collision with root package name */
    public final hs1 f8896c;

    public sc1(es0 es0Var, hs1 hs1Var) {
        this.f8895b = es0Var;
        this.f8896c = hs1Var;
    }

    public final synchronized c5.a a() {
        b(1);
        return (c5.a) this.f8894a.poll();
    }

    public final synchronized void b(int i6) {
        int size = i6 - this.f8894a.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f8894a.add(this.f8896c.u(this.f8895b));
        }
    }
}
