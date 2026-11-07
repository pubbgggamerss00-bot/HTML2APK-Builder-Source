package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yg1 implements sg1 {

    /* renamed from: d, reason: collision with root package name */
    public static yg1 f10973d;

    /* renamed from: a, reason: collision with root package name */
    public float f10974a;

    /* renamed from: b, reason: collision with root package name */
    public og1 f10975b;

    /* renamed from: c, reason: collision with root package name */
    public rg1 f10976c;

    public static yg1 b() {
        if (f10973d == null) {
            yg1 yg1Var = new yg1();
            yg1Var.f10974a = 0.0f;
            f10973d = yg1Var;
        }
        return f10973d;
    }

    @Override // com.google.android.gms.internal.ads.sg1
    public final void a(boolean z6) {
        if (z6) {
            oh1.f7759g.getClass();
            oh1.b();
            return;
        }
        oh1.f7759g.getClass();
        Handler handler = oh1.f7760i;
        if (handler != null) {
            handler.removeCallbacks(oh1.f7762k);
            oh1.f7760i = null;
        }
    }
}
