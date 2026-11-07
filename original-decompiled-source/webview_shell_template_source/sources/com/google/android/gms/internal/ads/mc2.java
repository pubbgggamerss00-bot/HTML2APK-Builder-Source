package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mc2 {

    /* renamed from: a, reason: collision with root package name */
    public final lc2 f7083a;

    /* renamed from: b, reason: collision with root package name */
    public int f7084b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7085c;

    /* renamed from: d, reason: collision with root package name */
    public final Looper f7086d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7087e;

    public mc2(kc2 kc2Var, pa2 pa2Var, Looper looper) {
        this.f7083a = pa2Var;
        this.f7086d = looper;
    }

    public final synchronized void a(boolean z6) {
        notifyAll();
    }
}
