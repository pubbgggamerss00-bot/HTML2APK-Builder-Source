package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ie1 implements Runnable {
    public static final Object A = new Object();
    public static final Object B = new Object();
    public static final Object C = new Object();
    public static Boolean D;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final VersionInfoParcel f5725t;

    /* renamed from: w, reason: collision with root package name */
    public int f5728w;

    /* renamed from: x, reason: collision with root package name */
    public final lt0 f5729x;

    /* renamed from: y, reason: collision with root package name */
    public final List f5730y;

    /* renamed from: u, reason: collision with root package name */
    public final me1 f5726u = pe1.C();

    /* renamed from: v, reason: collision with root package name */
    public String f5727v = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5731z = false;

    public ie1(Context context, VersionInfoParcel versionInfoParcel, lt0 lt0Var, ed0 ed0Var) {
        this.s = context;
        this.f5725t = versionInfoParcel;
        this.f5729x = lt0Var;
        if (((Boolean) zzbe.zzc().a(zn.J8)).booleanValue()) {
            this.f5730y = zzs.zzd();
        } else {
            zn1 zn1Var = bo1.f3236t;
            this.f5730y = cp1.f3636w;
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (A) {
            try {
                if (D == null) {
                    if (((Boolean) mp.f7198b.c()).booleanValue()) {
                        D = Boolean.valueOf(Math.random() < ((Double) mp.f7197a.c()).doubleValue());
                    } else {
                        D = Boolean.FALSE;
                    }
                }
                zBooleanValue = D.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void b(fe1 fe1Var) {
        i70.f5586a.w(new q(11, this, fe1Var));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrI;
        if (a()) {
            Object obj = B;
            synchronized (obj) {
                try {
                    if (((pe1) this.f5726u.f4126t).B() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrI = ((pe1) this.f5726u.g()).i();
                            me1 me1Var = this.f5726u;
                            me1Var.i();
                            pe1.E((pe1) me1Var.f4126t);
                        }
                        ay0 ay0Var = new ay0((String) zzbe.zzc().a(zn.D8), 60000, new HashMap(), bArrI, "application/x-protobuf");
                        Context context = this.s;
                        String str = this.f5725t.afmaVersion;
                        Binder.getCallingUid();
                        new cy0(context, str).zza(ay0Var);
                    } catch (Exception e6) {
                        if ((e6 instanceof gw0) && ((gw0) e6).s == 3) {
                            return;
                        }
                        zzv.zzp().g("CuiMonitor.sendCuiPing", e6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
