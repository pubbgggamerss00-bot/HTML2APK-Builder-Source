package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f9052t;

    public /* synthetic */ t(int i6, long j6, y yVar) {
        this.s = 0;
        this.f9052t = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                y yVar = (y) this.f9052t;
                yVar.getClass();
                int i6 = j31.f5914a;
                bd2 bd2Var = yVar.f10757b.s.I;
                bd2Var.q(bd2Var.r(bd2Var.f3044d.f2669e), 1021, new ov1(14));
                return;
            case 1:
                tj.b((tj) this.f9052t);
                return;
            case 2:
                f80 f80Var = ((z70) this.f9052t).H;
                if (f80Var != null) {
                    f80Var.e();
                    return;
                }
                return;
            case 3:
                f80 f80Var2 = ((z80) this.f9052t).f11216x;
                if (f80Var2 != null) {
                    f80Var2.h();
                    return;
                }
                return;
            case 4:
                int i7 = eb0.Z;
                co coVarC = zzv.zzp().c();
                String str = (String) this.f9052t;
                if (coVarC.f3625g.contains(str)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", coVarC.f3624f);
                linkedHashMap.put("ue", str);
                coVarC.b(coVarC.a(coVarC.f3620b, linkedHashMap), null);
                return;
            case 5:
                hh0 hh0Var = (hh0) this.f9052t;
                js jsVar = hh0Var.f5392o.f8128d;
                if (jsVar == null) {
                    return;
                }
                try {
                    jsVar.I1((zzby) hh0Var.f5394q.zzb(), new k3.b(hh0Var.f5387j));
                    return;
                } catch (RemoteException e6) {
                    zzo.zzh("RemoteException when notifyAdLoad is called", e6);
                    return;
                }
            case 6:
                Runnable runnable = (Runnable) ((AtomicReference) this.f9052t).getAndSet(null);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                oj0 oj0Var = (oj0) this.f9052t;
                mn.a(oj0Var.f7784u);
                oj0Var.f7789z = true;
                return;
            case 8:
                vk0 vk0Var = (vk0) this.f9052t;
                synchronized (vk0Var) {
                    zzo.zzg("Timeout waiting for show call succeed to be called.");
                    vk0Var.v(new io0("Timeout for show call succeed."));
                    vk0Var.f9891v = true;
                }
                return;
            case 9:
                sr0 sr0Var = (sr0) this.f9052t;
                try {
                    sr0Var.getClass();
                    com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
                    sr0Var.f2();
                    fp0 fp0Var = sr0Var.f8995u;
                    if (fp0Var != null) {
                        fp0Var.p();
                    }
                    sr0Var.f8995u = null;
                    sr0Var.s = null;
                    sr0Var.f8994t = null;
                    sr0Var.f8996v = true;
                    return;
                } catch (RemoteException e7) {
                    zzo.zzl("#007 Could not call remote method.", e7);
                    return;
                }
            case 10:
                ((fg1) this.f9052t).d();
                return;
            case 11:
                ((r41) this.f9052t).f8540w.f8787d.f7594b.t();
                return;
            case 12:
                ((mb1) this.f9052t).f7070d.k0(tc1.d(6, null, null));
                return;
            case 13:
                yf1 yf1Var = (yf1) this.f9052t;
                synchronized (yf1Var) {
                    if (yf1Var.f10967l.get()) {
                        try {
                            yf1Var.f10963g.zze(yf1Var.f10961e);
                        } catch (RemoteException unused) {
                            zzo.zzj("Failed to call onAdsAvailable");
                            return;
                        }
                    }
                }
                return;
            case 14:
                vd2 vd2Var = (vd2) this.f9052t;
                vd2Var.getClass();
                int i8 = j31.f5914a;
                bd2 bd2Var2 = vd2Var.f9836b.s.I;
                bd2Var2.q(bd2Var2.t(), 1032, new yz1(12));
                return;
            case 15:
                mf2 mf2Var = (mf2) this.f9052t;
                synchronized (mf2Var.f7126a) {
                    try {
                        if (mf2Var.f7137m) {
                            return;
                        }
                        long j6 = mf2Var.f7136l - 1;
                        mf2Var.f7136l = j6;
                        if (j6 > 0) {
                            return;
                        }
                        if (j6 >= 0) {
                            mf2Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (mf2Var.f7126a) {
                            mf2Var.f7138n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case 16:
                ei2 ei2Var = (ei2) ((qk2) this.f9052t);
                for (li2 li2Var : ei2Var.I) {
                    li2Var.m(true);
                    if (li2Var.A != null) {
                        li2Var.A = null;
                        li2Var.f6757f = null;
                    }
                }
                tg2 tg2Var = ei2Var.B;
                if (tg2Var.f9279b != null) {
                    tg2Var.f9279b = null;
                }
                tg2Var.f9280c = null;
                return;
            default:
                g gVar = (g) this.f9052t;
                gVar.f4845m--;
                return;
        }
    }

    public /* synthetic */ t(int i6, Object obj) {
        this.s = i6;
        this.f9052t = obj;
    }

    public /* synthetic */ t(vd2 vd2Var, wd2 wd2Var) {
        this.s = 14;
        this.f9052t = vd2Var;
    }
}
