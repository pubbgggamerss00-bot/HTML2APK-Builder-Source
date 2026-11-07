package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xk2 implements Executor {
    public final /* synthetic */ Executor s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ov1 f10624t;

    public xk2(ExecutorService executorService, ov1 ov1Var) {
        this.s = executorService;
        this.f10624t = ov1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.s.execute(runnable);
    }
}
