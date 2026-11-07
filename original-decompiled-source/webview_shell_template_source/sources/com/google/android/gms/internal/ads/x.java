package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f10322t;

    public /* synthetic */ x(int i6, Object obj) {
        this.s = i6;
        this.f10322t = obj;
    }

    private final void a() {
        a41 a41Var = (a41) this.f10322t;
        synchronized (a41Var) {
            a41Var.f2562b.clear();
            a41Var.f2561a.clear();
            a41Var.f2565e.clear();
            a41Var.f2564d.clear();
            a41Var.g();
            a41Var.h();
            a41Var.e();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap;
        fs fsVar = null;
        boolean z6 = false;
        switch (this.s) {
            case 0:
                y yVar = (y) this.f10322t;
                yVar.getClass();
                int i6 = j31.f5914a;
                bd2 bd2Var = yVar.f10757b.s.I;
                bd2Var.q(bd2Var.t(), 1019, new ov1(13));
                return;
            case 1:
                if (((ef) this.f10322t).f4267b != null) {
                    return;
                }
                synchronized (ef.f4263c) {
                    if (((ef) this.f10322t).f4267b != null) {
                        return;
                    }
                    try {
                        zBooleanValue = ((Boolean) zn.F2.c()).booleanValue();
                    } catch (IllegalStateException unused) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        try {
                            ef.f4264d = hj1.a(((ef) this.f10322t).f4266a.f3897a, "ADSHIELD");
                            z6 = zBooleanValue;
                        } catch (Throwable unused2) {
                        }
                    } else {
                        z6 = zBooleanValue;
                    }
                    ((ef) this.f10322t).f4267b = Boolean.valueOf(z6);
                    ef.f4263c.open();
                    return;
                }
            case 2:
                co coVar = (co) this.f10322t;
                while (true) {
                    try {
                        oo ooVar = (oo) coVar.f3619a.take();
                        mo moVarA = ooVar.a();
                        if (!TextUtils.isEmpty(moVarA.f7194a)) {
                            LinkedHashMap linkedHashMap2 = coVar.f3620b;
                            synchronized (ooVar.f7821c) {
                                zzv.zzp().c();
                                linkedHashMap = ooVar.f7820b;
                            }
                            coVar.b(coVar.a(linkedHashMap2, linkedHashMap), moVarA);
                        }
                    } catch (InterruptedException e6) {
                        zzo.zzk("CsiReporter:reporter interrupted", e6);
                        return;
                    }
                }
            case 3:
                nw nwVar = (nw) this.f10322t;
                nwVar.Q("/result", xt.f10680o);
                nwVar.zzc();
                return;
            case 4:
                z70 z70Var = (z70) this.f10322t;
                f80 f80Var = z70Var.H;
                if (f80Var != null) {
                    f80Var.e();
                    z70Var.H.i();
                    return;
                }
                return;
            case 5:
                ((f80) this.f10322t).c("surfaceCreated", new String[0]);
                return;
            case 6:
                ((cg0) this.f10322t).c();
                return;
            case 7:
                lg0 lg0Var = ((fg0) this.f10322t).s.f5036d;
                synchronized (lg0Var) {
                    lg0Var.f();
                    lg0Var.A = true;
                }
                return;
            case 8:
                ((xa0) this.f10322t).onPause();
                return;
            case 9:
                ((bj0) this.f10322t).f3205c = false;
                return;
            case 10:
                yj0 yj0Var = (yj0) this.f10322t;
                synchronized (yj0Var) {
                    try {
                        if (yj0Var.f11004w.isDone()) {
                            return;
                        }
                        yj0Var.f11004w.e(Boolean.TRUE);
                        return;
                    } finally {
                    }
                }
            case 11:
                wl0 wl0Var = (wl0) ((WeakReference) this.f10322t).get();
                if (wl0Var != null) {
                    wl0Var.o0(new f0(20));
                    return;
                }
                return;
            case 12:
                fp0 fp0Var = (fp0) this.f10322t;
                jp0 jp0Var = fp0Var.f4749k;
                try {
                    pp0 pp0Var = fp0Var.f4753o;
                    int iG = jp0Var.g();
                    if (iG == 1) {
                        yr yrVar = pp0Var.f8125a;
                        if (yrVar != null) {
                            fp0Var.k();
                            yrVar.X1((qr) fp0Var.f4754p.zzb());
                            return;
                        }
                        return;
                    }
                    if (iG == 2) {
                        wr wrVar = pp0Var.f8126b;
                        if (wrVar != null) {
                            fp0Var.k();
                            wrVar.S((or) fp0Var.f4755q.zzb());
                            return;
                        }
                        return;
                    }
                    if (iG == 3) {
                        String strA = jp0Var.a();
                        if (strA != null) {
                            fsVar = (fs) pp0Var.f8130f.get(strA);
                        }
                        if (fsVar != null) {
                            if (jp0Var.m() != null) {
                                fp0Var.q("Google", true);
                            }
                            fsVar.H0((tr) fp0Var.f4757t.zzb());
                            return;
                        }
                        return;
                    }
                    if (iG == 6) {
                        ms msVar = pp0Var.f8127c;
                        if (msVar != null) {
                            fp0Var.k();
                            msVar.J0((vs) fp0Var.f4756r.zzb());
                            return;
                        }
                        return;
                    }
                    if (iG != 7) {
                        zzo.zzg("Wrong native template id!");
                        return;
                    }
                    jw jwVar = pp0Var.f8129e;
                    if (jwVar != null) {
                        jwVar.Q((fw) fp0Var.s.zzb());
                        return;
                    }
                    return;
                } catch (RemoteException e7) {
                    zzo.zzh("RemoteException when notifyAdLoad is called", e7);
                    return;
                }
            case 13:
                ((dx0) this.f10322t).a();
                return;
            case 14:
                if (((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue() && bq.D.f3169a) {
                    ((fg1) this.f10322t).b();
                    return;
                }
                return;
            case 15:
                a();
                return;
            case 16:
                ((s41) this.f10322t).f8787d.f7595c.k0(tc1.d(4, null, null));
                return;
            case 17:
                n61 n61Var = (n61) this.f10322t;
                n61Var.f7320a.set(new m61(n61Var.f7324e.zzb(), n61Var.f7325f, n61Var.f7322c));
                return;
            case 18:
                ((eb1) this.f10322t).f4201w.f4592d.t();
                return;
            case 19:
                ((WebView) this.f10322t).destroy();
                return;
            case 20:
                s70 s70Var = ((oh1) this.f10322t).f7767e;
                s70Var.getClass();
                rh1 rh1Var = new rh1(s70Var);
                wv0 wv0Var = (wv0) s70Var.f8824u;
                rh1Var.f8388a = wv0Var;
                ArrayDeque arrayDeque = (ArrayDeque) wv0Var.f10278t;
                arrayDeque.add(rh1Var);
                if (((qh1) wv0Var.f10279u) == null) {
                    qh1 qh1Var = (qh1) arrayDeque.poll();
                    wv0Var.f10279u = qh1Var;
                    if (qh1Var != null) {
                        qh1Var.executeOnExecutor((ThreadPoolExecutor) wv0Var.s, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case dn.zzm /* 21 */:
                hl1 hl1Var = ((gl1) this.f10322t).f5088a;
                hl1Var.f5439c.c("unlinkToDeath", new Object[0]);
                ik1 ik1Var = hl1Var.f5445j;
                ik1Var.getClass();
                ik1Var.asBinder().unlinkToDeath(hl1Var.h, 0);
                hl1Var.f5445j = null;
                hl1Var.f5442f = false;
                return;
            case 22:
                bd2 bd2Var2 = (bd2) this.f10322t;
                bd2Var2.q(bd2Var2.o(), 1028, new ov1(11));
                bd2Var2.f3046f.d();
                return;
            default:
                ((z) this.f10322t).getClass();
                return;
        }
    }

    public /* synthetic */ x(c cVar, z zVar, n90 n90Var) {
        this.s = 23;
        this.f10322t = zVar;
    }

    public /* synthetic */ x(y yVar, String str) {
        this.s = 0;
        this.f10322t = yVar;
    }

    public x(fh1 fh1Var) {
        this.s = 19;
        this.f10322t = fh1Var.f4683e;
    }

    public /* synthetic */ x(wl0 wl0Var) {
        this.s = 11;
        this.f10322t = new WeakReference(wl0Var);
    }
}
