package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class hc0 {

    /* renamed from: a, reason: collision with root package name */
    public static kd0 f5324a;

    public static kd0 d(Context context, gy gyVar, int i6) {
        SharedPreferences sharedPreferences;
        synchronized (hc0.class) {
            try {
                kd0 kd0Var = f5324a;
                if (kd0Var != null) {
                    return kd0Var;
                }
                long jA = zzv.zzC().a();
                zn.a(context);
                if (((Boolean) lp.f6810e.c()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", mn.b(context, "init_without_write") + 1).commit();
                }
                pc1 pc1VarA = pc1.a(context);
                zzv.zzq();
                boolean zZzF = zzs.zzF((Context) pc1VarA.f8027a);
                VersionInfoParcel versionInfoParcel = new VersionInfoParcel(244410000, i6, true, zZzF);
                if (((Boolean) sp.f8987c.c()).booleanValue()) {
                    zzcw zzcwVar = (zzcw) pc1VarA.f8028b;
                    zzfb liteSdkVersion = null;
                    if (zzcwVar != null) {
                        try {
                            liteSdkVersion = zzcwVar.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (liteSdkVersion != null) {
                        versionInfoParcel = new VersionInfoParcel(244410000, liteSdkVersion.zza(), true, zZzF);
                    }
                }
                pc1VarA.b(gyVar);
                ic0 ic0Var = new ic0();
                ic0Var.f5655a = versionInfoParcel;
                ic0Var.f5658d = new WeakReference(context);
                ic0Var.f5656b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                ic0Var.f5657c = jA;
                kd0 kd0Var2 = new kd0(new kc0(ic0Var), new f0(15));
                zzv.zzp().f(context, versionInfoParcel);
                zzv.zzc().c(context);
                zzv.zzq().zzm(context);
                zzv.zzq().zzl(context);
                zzd.zza(context);
                zzv.zzb().c(context);
                zzv.zzw().zzb(context);
                ((zzcb) kd0Var2.P.zzb()).zzc();
                y50.b(context);
                if (((Boolean) zzbe.zzc().a(zn.f11364b6)).booleanValue()) {
                    if (!((Boolean) zzbe.zzc().a(zn.I0)).booleanValue()) {
                        kk kkVar = new kk(new mk(context));
                        jy0 jy0Var = new jy0(new fy0(context), (hs1) kd0Var2.f6339f.zzb());
                        try {
                            jy0Var.a(new vy0(new wy0(context, versionInfoParcel, kkVar, jy0Var), zzv.zzp().d().zzN()));
                        } catch (Exception e6) {
                            zzo.zzg("Error in offline signals database startup: ".concat(String.valueOf(e6.getMessage())));
                        }
                    }
                }
                f5324a = kd0Var2;
                return kd0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Executor a();

    public abstract ScheduledExecutorService b();

    public abstract fo c();

    public abstract md0 e();

    public abstract pd0 f();

    public abstract wl0 g();

    public abstract wd0 h();

    public abstract gb0 i();

    public abstract zd0 j();

    public abstract sv0 k();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv l();

    public abstract pc1 m();

    public final jd0 n(r30 r30Var, int i6) {
        return o(new q91(r30Var, i6));
    }

    public abstract jd0 o(q91 q91Var);

    public abstract mc1 p();

    public abstract sc1 q();

    public abstract ie1 r();
}
