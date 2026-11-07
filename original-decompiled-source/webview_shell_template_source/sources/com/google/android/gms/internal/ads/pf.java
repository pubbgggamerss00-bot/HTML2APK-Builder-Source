package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pf {

    /* renamed from: a, reason: collision with root package name */
    public final vs1 f8054a;

    public pf(Context context, Executor executor) {
        vs1 vs1Var = new vs1(new of(0, context));
        executor.execute(vs1Var);
        this.f8054a = vs1Var;
    }
}
