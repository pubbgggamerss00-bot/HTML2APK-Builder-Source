package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cf implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f3550t;

    public /* synthetic */ cf(int i6, Object obj) {
        this.s = i6;
        this.f3550t = obj;
    }

    private final void a() {
        mc2 mc2Var = (mc2) this.f3550t;
        try {
            synchronized (mc2Var) {
            }
            try {
                mc2Var.f7083a.b(mc2Var.f7084b, mc2Var.f7085c);
            } finally {
                mc2Var.a(true);
            }
        } catch (wa2 e6) {
            qs0.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e6);
            throw new RuntimeException(e6);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                synchronized (((df) this.f3550t).F) {
                    if (((df) this.f3550t).G) {
                        return;
                    }
                    ((df) this.f3550t).G = true;
                    try {
                        df.a((df) this.f3550t);
                    } catch (Exception e6) {
                        ((df) this.f3550t).f3894x.b(2023, -1L, e6);
                    }
                    synchronized (((df) this.f3550t).F) {
                        ((df) this.f3550t).G = false;
                    }
                    return;
                }
            case 1:
                zn.a(((dg) this.f3550t).f3897a);
                return;
            case 2:
                synchronized (((ki) this.f3550t).f6424u) {
                    ki kiVar = (ki) this.f3550t;
                    if (kiVar.f6425v && kiVar.f6426w) {
                        kiVar.f6425v = false;
                        zzo.zze("App went background");
                        ArrayList arrayList = ((ki) this.f3550t).f6427x;
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            try {
                                ((li) obj).zza(false);
                            } catch (Exception e7) {
                                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
                            }
                        }
                    } else {
                        zzo.zze("App is still foreground");
                    }
                }
                return;
            case 3:
                f80 f80Var = ((z80) this.f3550t).f11216x;
                if (f80Var != null) {
                    f80Var.d();
                    return;
                }
                return;
            case 4:
                fe0 fe0Var = (fe0) this.f3550t;
                fe0Var.getClass();
                w20 w20Var = new w20("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                iq iqVar = fe0Var.B;
                iqVar.getClass();
                try {
                    jq jqVar = (jq) zzs.zzb(iqVar.f5827a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new d0(12));
                    Parcel parcelZza = jqVar.zza();
                    th.e(parcelZza, w20Var);
                    jqVar.zzda(1, parcelZza);
                    return;
                } catch (RemoteException e8) {
                    zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
                    return;
                } catch (zzr e9) {
                    zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e9.getMessage())));
                    return;
                }
            case 5:
                ((eg0) this.f3550t).s.f5036d.c();
                return;
            case 6:
                wl0 wl0Var = (wl0) ((WeakReference) this.f3550t).get();
                if (wl0Var != null) {
                    wl0Var.o0(new fo(14));
                    return;
                }
                return;
            case 7:
                bu0 bu0Var = (bu0) this.f3550t;
                fu0 fu0Var = bu0Var.f3292b.f3661a;
                ConcurrentHashMap concurrentHashMap = bu0Var.f3291a;
                fu0Var.getClass();
                if (concurrentHashMap.isEmpty()) {
                    zzo.zze("Empty paramMap.");
                    return;
                }
                fu0Var.a(concurrentHashMap);
                String strGenerateUrl = fu0Var.f5488f.generateUrl(concurrentHashMap);
                zze.zza(strGenerateUrl);
                if (((Boolean) zzbe.zzc().a(zn.Xc)).booleanValue() || fu0Var.f5487e) {
                    fu0Var.f5485c.execute(new wx(7, fu0Var, strGenerateUrl));
                    return;
                }
                return;
            case 8:
                n21 n21Var = (n21) this.f3550t;
                synchronized (n21Var) {
                    n21Var.h = n21Var.f7297a.b() - n21Var.f7304i;
                }
                return;
            case 9:
                n61 n61Var = (n61) this.f3550t;
                n61Var.f7323d.execute(new x(17, n61Var));
                return;
            case 10:
                v3.f fVar = (v3.f) this.f3550t;
                lj1 lj1Var = new lj1();
                Log.d("GASS", "Clearcut logging disabled");
                fVar.f14800a.j(new hj1(lj1Var));
                return;
            case 11:
                a();
                return;
            default:
                vd2 vd2Var = (vd2) this.f3550t;
                vd2Var.getClass();
                int i7 = j31.f5914a;
                bd2 bd2Var = vd2Var.f9836b.s.I;
                bd2Var.q(bd2Var.t(), 1010, new rj1(23));
                return;
        }
    }

    public /* synthetic */ cf(vd2 vd2Var, long j6) {
        this.s = 12;
        this.f3550t = vd2Var;
    }

    public /* synthetic */ cf(wl0 wl0Var) {
        this.s = 6;
        this.f3550t = new WeakReference(wl0Var);
    }
}
