package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class nr1 extends zq1 {
    public static final me B;
    public static final gs1 C = new gs1(nr1.class);
    public volatile int A;

    /* renamed from: z, reason: collision with root package name */
    public volatile Set<Throwable> f7492z;

    static {
        Throwable th;
        me mr1Var;
        try {
            mr1Var = new lr1(AtomicReferenceFieldUpdater.newUpdater(nr1.class, Set.class, "z"), AtomicIntegerFieldUpdater.newUpdater(nr1.class, "A"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            mr1Var = new mr1(8);
        }
        Throwable th3 = th;
        B = mr1Var;
        if (th3 != null) {
            C.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
