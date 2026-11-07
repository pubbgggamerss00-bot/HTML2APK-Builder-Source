package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final zk2 f7258a;

    /* renamed from: b, reason: collision with root package name */
    public final l f7259b;

    /* renamed from: c, reason: collision with root package name */
    public final m f7260c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7261d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f7262e;

    /* renamed from: f, reason: collision with root package name */
    public float f7263f;

    /* renamed from: g, reason: collision with root package name */
    public float f7264g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f7265i;

    /* renamed from: j, reason: collision with root package name */
    public int f7266j;

    /* renamed from: k, reason: collision with root package name */
    public long f7267k;

    /* renamed from: l, reason: collision with root package name */
    public long f7268l;

    /* renamed from: m, reason: collision with root package name */
    public long f7269m;

    /* renamed from: n, reason: collision with root package name */
    public long f7270n;

    /* renamed from: o, reason: collision with root package name */
    public long f7271o;

    /* renamed from: p, reason: collision with root package name */
    public long f7272p;

    /* renamed from: q, reason: collision with root package name */
    public long f7273q;

    public n(Context context) {
        DisplayManager displayManager;
        zk2 zk2Var = new zk2();
        zk2Var.f11330a = new yk2();
        zk2Var.f11331b = new yk2();
        zk2Var.f11333d = -9223372036854775807L;
        this.f7258a = zk2Var;
        l lVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new l(this, displayManager);
        this.f7259b = lVar;
        this.f7260c = lVar != null ? m.f6889w : null;
        this.f7267k = -9223372036854775807L;
        this.f7268l = -9223372036854775807L;
        this.f7263f = -1.0f;
        this.f7265i = 1.0f;
        this.f7266j = 0;
    }

    public static /* bridge */ /* synthetic */ void a(n nVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            nVar.f7267k = refreshRate;
            nVar.f7268l = (refreshRate * 80) / 100;
        } else {
            qs0.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            nVar.f7267k = -9223372036854775807L;
            nVar.f7268l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (j31.f5914a < 30 || (surface = this.f7262e) == null || this.f7266j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e6) {
            qs0.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e6);
        }
    }

    public final void c() {
        float f6;
        if (j31.f5914a < 30 || this.f7262e == null) {
            return;
        }
        zk2 zk2Var = this.f7258a;
        if (!zk2Var.f11330a.c()) {
            f6 = this.f7263f;
        } else if (zk2Var.f11330a.c()) {
            f6 = (float) (1.0E9d / (zk2Var.f11330a.f11024e != 0 ? r2.f11025f / r4 : 0L));
        } else {
            f6 = -1.0f;
        }
        float f7 = this.f7264g;
        if (f6 != f7) {
            if (f6 != -1.0f && f7 != -1.0f) {
                float f8 = 1.0f;
                if (zk2Var.f11330a.c()) {
                    if ((zk2Var.f11330a.c() ? zk2Var.f11330a.f11025f : -9223372036854775807L) >= 5000000000L) {
                        f8 = 0.02f;
                    }
                }
                if (Math.abs(f6 - this.f7264g) < f8) {
                    return;
                }
            } else if (f6 == -1.0f && zk2Var.f11334e < 30) {
                return;
            }
            this.f7264g = f6;
            d(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z6) {
        Surface surface;
        float f6;
        if (j31.f5914a < 30 || (surface = this.f7262e) == null || this.f7266j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f7261d) {
            float f7 = this.f7264g;
            f6 = f7 != -1.0f ? f7 * this.f7265i : 0.0f;
        }
        if (z6 || this.h != f6) {
            this.h = f6;
            try {
                surface.setFrameRate(f6, f6 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e6) {
                qs0.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e6);
            }
        }
    }
}
