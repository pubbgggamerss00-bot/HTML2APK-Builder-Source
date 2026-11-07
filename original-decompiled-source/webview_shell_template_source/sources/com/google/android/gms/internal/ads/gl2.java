package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gl2 extends Surface {

    /* renamed from: v, reason: collision with root package name */
    public static int f5089v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f5090w;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final fl2 f5091t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5092u;

    public /* synthetic */ gl2(fl2 fl2Var, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f5091t = fl2Var;
        this.s = z6;
    }

    public static synchronized boolean l(Context context) {
        String strEglQueryString;
        int i6;
        try {
            if (!f5090w) {
                int i7 = j31.f5914a;
                if (i7 >= 24 && ((i7 >= 26 || !("samsung".equals(j31.f5916c) || "XT1650".equals(j31.f5917d))) && ((i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i6 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i6 = 0;
                }
                f5089v = i6;
                f5090w = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5089v != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f5091t) {
            try {
                if (!this.f5092u) {
                    Handler handler = this.f5091t.f4720t;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f5092u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
