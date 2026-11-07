package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cg implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3561t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3562u;

    public /* synthetic */ cg(int i6, int i7, Object obj) {
        this.s = i7;
        this.f3561t = i6;
        this.f3562u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        yd ydVarH;
        switch (this.s) {
            case 0:
                int i6 = this.f3561t;
                dg dgVar = (dg) this.f3562u;
                if (i6 > 0) {
                    try {
                        Thread.sleep(i6 * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    PackageInfo packageInfo = dgVar.f3897a.getPackageManager().getPackageInfo(dgVar.f3897a.getPackageName(), 0);
                    Context context = dgVar.f3897a;
                    ydVarH = ed0.h(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
                } catch (Throwable unused2) {
                    ydVarH = null;
                }
                ((dg) this.f3562u).f3905j = ydVarH;
                if (this.f3561t < 4) {
                    if (ydVarH == null || !ydVarH.l0() || ydVarH.z0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !ydVarH.m0() || !ydVarH.x0().F() || ydVarH.x0().B() == -2) {
                        dg dgVar2 = (dg) this.f3562u;
                        int i7 = this.f3561t + 1;
                        if (dgVar2.f3910o) {
                            Future<?> futureSubmit = dgVar2.f3898b.submit(new cg(i7, 0, dgVar2));
                            if (i7 == 0) {
                                dgVar2.f3906k = futureSubmit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                z80 z80Var = (z80) this.f3562u;
                int i8 = this.f3561t;
                f80 f80Var = z80Var.f11216x;
                if (f80Var != null) {
                    f80Var.onWindowVisibilityChanged(i8);
                    break;
                }
                break;
            default:
                ((e3.r) this.f3562u).f(this.f3561t);
                break;
        }
    }
}
