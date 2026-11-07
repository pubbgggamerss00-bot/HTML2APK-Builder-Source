package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e80 implements Runnable {
    public final /* synthetic */ boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f80 f4157t;

    public e80(f80 f80Var, boolean z6) {
        this.s = z6;
        this.f4157t = f80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4157t.c("windowVisibilityChanged", "isVisible", String.valueOf(this.s));
    }
}
