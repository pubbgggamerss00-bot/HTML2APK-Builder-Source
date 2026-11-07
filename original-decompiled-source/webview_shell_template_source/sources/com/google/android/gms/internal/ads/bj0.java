package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bj0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3203a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f3204b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f3205c = true;

    public bj0(h70 h70Var, ScheduledExecutorService scheduledExecutorService, vd1 vd1Var) {
        this.f3203a = h70Var;
        this.f3204b = scheduledExecutorService;
    }
}
