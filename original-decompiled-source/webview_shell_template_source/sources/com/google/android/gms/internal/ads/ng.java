package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ng extends lh {
    public final Activity h;

    /* renamed from: i, reason: collision with root package name */
    public final View f7439i;

    public ng(dg dgVar, kd kdVar, int i6, View view, Activity activity) {
        super(dgVar, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", kdVar, i6, 62);
        this.f7439i = view;
        this.h = activity;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        if (this.f7439i == null) {
            return;
        }
        Boolean bool = (Boolean) zzbe.zzc().a(zn.J2);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f6728e.invoke(null, this.f7439i, this.h, bool);
        synchronized (this.f6727d) {
            try {
                kd kdVar = this.f6727d;
                long jLongValue = ((Long) objArr[0]).longValue();
                kdVar.i();
                yd.C0((yd) kdVar.f4126t, jLongValue);
                kd kdVar2 = this.f6727d;
                long jLongValue2 = ((Long) objArr[1]).longValue();
                kdVar2.i();
                yd.E0((yd) kdVar2.f4126t, jLongValue2);
                if (zBooleanValue) {
                    kd kdVar3 = this.f6727d;
                    String str = (String) objArr[2];
                    kdVar3.i();
                    yd.D0((yd) kdVar3.f4126t, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
