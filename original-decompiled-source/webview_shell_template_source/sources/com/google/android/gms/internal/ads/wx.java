package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class wx implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10298t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f10299u;

    public /* synthetic */ wx(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f10299u = obj;
        this.f10298t = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        View view;
        switch (this.s) {
            case 0:
                Context context = (Context) this.f10299u;
                zn.a(context);
                if (((Boolean) zzbe.zzc().a(zn.G0)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) zzbe.zzc().a(zn.f11490v0)).booleanValue());
                if (((Boolean) zzbe.zzc().a(zn.C0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                String str = (String) this.f10298t;
                com.google.android.gms.common.internal.l.f(context);
                if (q3.e0.f14128i == null) {
                    synchronized (q3.e0.class) {
                        try {
                            if (q3.e0.f14128i == null) {
                                q3.e0.f14128i = new q3.e0(context, bundle, str);
                            }
                        } finally {
                        }
                    }
                }
                try {
                    ((gc0) zzs.zzb(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new fo(11))).a2(new k3.b(context), new vx(q3.e0.f14128i.f14132d));
                    return;
                } catch (RemoteException | zzr | NullPointerException e6) {
                    zzo.zzl("#007 Could not call remote method.", e6);
                    return;
                }
            case 1:
                ((zzu) this.f10299u).zza((String) this.f10298t);
                return;
            case 2:
                z80 z80Var = (z80) this.f10299u;
                String str2 = (String) this.f10298t;
                f80 f80Var = z80Var.f11216x;
                if (f80Var != null) {
                    f80Var.c("error", "what", "ExoPlayerAdapter error", "extra", str2);
                    return;
                }
                return;
            case 3:
                int i6 = 9;
                xj1 xj1Var = new xj1(i6, (jb0) this.f10299u);
                uz0 uz0Var = (uz0) this.f10298t;
                synchronized (uz0Var) {
                    t31 t31Var = uz0Var.f9672f;
                    if (t31Var != null && uz0Var.f9670d != null) {
                        ((sz0) zzv.zzB()).getClass();
                        sz0.j(new q(i6, t31Var, xj1Var));
                        uz0Var.f9672f = null;
                        uz0Var.f9670d.U(null);
                    }
                }
                return;
            case 4:
                try {
                    ((om0) this.f10299u).mo3zza(this.f10298t);
                    return;
                } catch (Throwable th) {
                    zzv.zzp().g("EventEmitter.notify", th);
                    zze.zzb("Event emitter exception.", th);
                    return;
                }
            case 5:
                ((fp0) this.f10299u).n((sh) this.f10298t);
                return;
            case 6:
                up0 up0Var = (up0) this.f10299u;
                ViewGroup viewGroup = (ViewGroup) this.f10298t;
                ec1 ec1Var = up0Var.f9596b;
                zzg zzgVar = up0Var.f9595a;
                jp0 jp0Var = up0Var.f9598d;
                synchronized (jp0Var) {
                    view = jp0Var.f6136o;
                }
                if (view != null) {
                    boolean z6 = viewGroup != null;
                    if (jp0Var.g() == 2 || jp0Var.g() == 1) {
                        zzgVar.zzF(ec1Var.f4211f, String.valueOf(jp0Var.g()), z6);
                        return;
                    } else {
                        if (jp0Var.g() == 6) {
                            zzgVar.zzF(ec1Var.f4211f, "2", z6);
                            zzgVar.zzF(ec1Var.f4211f, "1", z6);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 7:
                ((hu0) this.f10299u).f5486d.zza((String) this.f10298t);
                return;
            case 8:
                t31 t31Var2 = (t31) this.f10299u;
                hg1 hg1Var = hg1.s;
                View view2 = (View) this.f10298t;
                Iterator it = ((HashMap) t31Var2.f9097v).values().iterator();
                while (it.hasNext()) {
                    ((cg1) it.next()).a(view2, hg1Var);
                }
                ((vg1) t31Var2.f9098w).a(view2, hg1Var);
                return;
            case 9:
                ((eb1) this.f10299u).f4201w.f4592d.k0((com.google.android.gms.ads.internal.client.zze) this.f10298t);
                return;
            case 10:
                InputStream inputStream = (InputStream) this.f10299u;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) this.f10298t);
                        try {
                            i3.f.b(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                    return;
                }
            case 11:
                Context context2 = (Context) this.f10299u;
                ((v3.f) this.f10298t).f14800a.j(hj1.a(context2, "GLAS"));
                return;
            case 12:
                vd2 vd2Var = (vd2) this.f10299u;
                synchronized (((qa2) this.f10298t)) {
                }
                int i7 = j31.f5914a;
                bd2 bd2Var = vd2Var.f9836b.s.I;
                bd2Var.q(bd2Var.r(bd2Var.f3044d.f2669e), 1013, new sj1(20));
                return;
            default:
                vd2 vd2Var2 = ((ve2) ((xj1) this.f10299u).f10619t).R0;
                wd2 wd2Var = (wd2) this.f10298t;
                Handler handler = vd2Var2.f9835a;
                if (handler != null) {
                    handler.post(new t(vd2Var2, wd2Var));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wx(fp0 fp0Var, hq0 hq0Var) {
        this.s = 5;
        this.f10299u = fp0Var;
        this.f10298t = (sh) hq0Var;
    }
}
