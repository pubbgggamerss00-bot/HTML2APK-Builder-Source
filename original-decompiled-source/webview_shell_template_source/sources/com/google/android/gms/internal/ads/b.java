package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2879t;

    public /* synthetic */ b(int i6, Object obj) {
        this.s = i6;
        this.f2879t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((z) this.f2879t).zzb();
                return;
            case 1:
                y yVar = (y) this.f2879t;
                yVar.getClass();
                int i6 = j31.f5914a;
                bd2 bd2Var = yVar.f10757b.s.I;
                bd2Var.q(bd2Var.t(), 1015, new iu1(19));
                return;
            case 2:
                dg dgVar = (dg) this.f2879t;
                dgVar.getClass();
                try {
                    if (dgVar.f3902f == null && dgVar.f3904i) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(dgVar.f3897a);
                        advertisingIdClient.start();
                        dgVar.f3902f = advertisingIdClient;
                        return;
                    }
                    return;
                } catch (c3.i | IOException unused) {
                    dgVar.f3902f = null;
                    return;
                }
            case 3:
                lk lkVar = (lk) this.f2879t;
                synchronized (lkVar) {
                    try {
                        mk mkVar = lkVar.f6784c;
                        if (mkVar.f7171b) {
                            mkVar.f7170a.m(lkVar.f6782a);
                            lkVar.f6784c.f7170a.h(0);
                            lkVar.f6784c.f7170a.a(lkVar.f6783b);
                            lkVar.f6784c.f7170a.o();
                            lkVar.f6784c.f7170a.zzf();
                        }
                    } catch (RemoteException e6) {
                        zzo.zzf("Clearcut log failed", e6);
                        return;
                    }
                }
                return;
            case 4:
                ((ap) this.f2879t).d();
                return;
            case 5:
                qv qvVar = (qv) this.f2879t;
                if (qvVar.f8458a == null) {
                    return;
                }
                qvVar.f8458a.disconnect();
                Binder.flushPendingCommands();
                return;
            case 6:
                ((qw) this.f2879t).zzc();
                return;
            case 7:
                ((b80) this.f2879t).w();
                return;
            case 8:
                f80 f80Var = (f80) ((a80) this.f2879t);
                b80 b80Var = f80Var.f4542y;
                ImageView imageView = f80Var.I;
                if (f80Var.f4543z && imageView.getParent() != null) {
                    f80Var.f4537t.removeView(imageView);
                }
                if (b80Var == null || f80Var.H == null) {
                    return;
                }
                long jB = zzv.zzC().b();
                if (b80Var.getBitmap(f80Var.H) != null) {
                    f80Var.J = true;
                }
                long jB2 = zzv.zzC().b() - jB;
                if (zze.zzc()) {
                    zze.zza("Spinner frame grab took " + jB2 + "ms");
                }
                if (jB2 > f80Var.f4541x) {
                    zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                    f80Var.C = false;
                    f80Var.H = null;
                    oo ooVar = f80Var.f4539v;
                    if (ooVar != null) {
                        ooVar.b("spinner_jank", Long.toString(jB2));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                na0 na0Var = (na0) this.f2879t;
                f80 f80Var2 = na0Var.f7365w;
                if (f80Var2 != null) {
                    if (!na0Var.f7366x) {
                        f80Var2.h();
                        na0Var.f7366x = true;
                    }
                    na0Var.f7365w.f();
                    return;
                }
                return;
            case 10:
                vz0 vz0Var = (vz0) this.f2879t;
                tz0 tz0VarZzB = zzv.zzB();
                fg1 fg1Var = vz0Var.f9965a;
                ((sz0) tz0VarZzB).getClass();
                sz0.j(new x(14, fg1Var));
                return;
            case 11:
                ed0.o(((fe0) this.f2879t).s, true);
                return;
            case 12:
                fp0 fp0Var = (fp0) this.f2879t;
                fp0Var.f4750l.zzj();
                jp0 jp0Var = fp0Var.f4749k;
                synchronized (jp0Var) {
                    try {
                        xa0 xa0Var = jp0Var.f6130i;
                        if (xa0Var != null) {
                            xa0Var.destroy();
                            jp0Var.f6130i = null;
                        }
                        xa0 xa0Var2 = jp0Var.f6131j;
                        if (xa0Var2 != null) {
                            xa0Var2.destroy();
                            jp0Var.f6131j = null;
                        }
                        xa0 xa0Var3 = jp0Var.f6132k;
                        if (xa0Var3 != null) {
                            xa0Var3.destroy();
                            jp0Var.f6132k = null;
                        }
                        c5.a aVar = jp0Var.f6134m;
                        if (aVar != null) {
                            aVar.cancel(false);
                            jp0Var.f6134m = null;
                        }
                        o70 o70Var = jp0Var.f6135n;
                        if (o70Var != null) {
                            o70Var.cancel(false);
                            jp0Var.f6135n = null;
                        }
                        jp0Var.f6133l = null;
                        jp0Var.f6142v.clear();
                        jp0Var.f6143w.clear();
                        jp0Var.f6124b = null;
                        jp0Var.f6125c = null;
                        jp0Var.f6126d = null;
                        jp0Var.f6127e = null;
                        jp0Var.h = null;
                        jp0Var.f6136o = null;
                        jp0Var.f6137p = null;
                        jp0Var.f6138q = null;
                        jp0Var.s = null;
                        jp0Var.f6140t = null;
                        jp0Var.f6141u = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 13:
                tp0 tp0Var = (tp0) this.f2879t;
                if (tp0Var.f9362x == null) {
                    View view = new View(tp0Var.f9359u.getContext());
                    tp0Var.f9362x = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (tp0Var.f9359u != tp0Var.f9362x.getParent()) {
                    tp0Var.f9359u.addView(tp0Var.f9362x);
                    return;
                }
                return;
            case 14:
                nt0 nt0Var = (nt0) this.f2879t;
                nt0Var.f7506c.execute(new p(9, nt0Var));
                return;
            case 15:
                bu0 bu0Var = (bu0) this.f2879t;
                bu0Var.f3292b.f3661a.b(bu0Var.f3291a, false);
                return;
            case 16:
                ((fa1) this.f2879t).i1(5);
                return;
            case 17:
                ((ia1) this.f2879t).f5640d.k0(tc1.d(6, null, null));
                return;
            case 18:
                ((fb1) this.f2879t).f4592d.k0(tc1.d(6, null, null));
                return;
            case 19:
                yf1 yf1Var = (yf1) this.f2879t;
                synchronized (yf1Var) {
                    if (yf1Var.f10967l.get()) {
                        try {
                            yf1Var.f10963g.zzf(yf1Var.f10961e);
                        } catch (RemoteException unused2) {
                            zzo.zzj("Failed to call onAdsExhausted");
                            return;
                        }
                    }
                }
                return;
            case 20:
                te2 te2Var = (te2) this.f2879t;
                if (te2Var.V >= 300000) {
                    ((ve2) te2Var.f9250l.f10619t).f9840c1 = true;
                    te2Var.V = 0L;
                    return;
                }
                return;
            default:
                ((ei2) this.f2879t).q();
                return;
        }
    }

    public /* synthetic */ b(c cVar, z zVar) {
        this.s = 0;
        this.f2879t = zVar;
    }

    public /* synthetic */ b(y yVar, qa2 qa2Var) {
        this.s = 1;
        this.f2879t = yVar;
    }
}
