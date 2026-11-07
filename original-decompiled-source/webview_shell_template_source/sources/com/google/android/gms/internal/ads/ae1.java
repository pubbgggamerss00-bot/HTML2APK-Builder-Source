package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ae1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ds1 f2730d = ds1.f4001t;

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f2731a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f2732b;

    /* renamed from: c, reason: collision with root package name */
    public final zd1 f2733c;

    public ae1(hs1 hs1Var, ScheduledExecutorService scheduledExecutorService, zd1 zd1Var) {
        this.f2731a = hs1Var;
        this.f2732b = scheduledExecutorService;
        this.f2733c = zd1Var;
    }

    public final wd1 a(c5.a aVar, Object obj) {
        return new wd1(this, obj, null, aVar, Collections.singletonList(aVar), aVar);
    }
}
