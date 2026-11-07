package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class js1 implements Executor {
    public final /* synthetic */ Executor s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wr1 f6162t;

    public js1(Executor executor, wr1 wr1Var) {
        this.s = executor;
        this.f6162t = wr1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.s.execute(runnable);
        } catch (RejectedExecutionException e6) {
            this.f6162t.f(e6);
        }
    }
}
