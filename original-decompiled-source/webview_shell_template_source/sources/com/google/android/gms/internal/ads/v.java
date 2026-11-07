package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f9674t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f9675u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f9676v;

    public v(ct ctVar, AdManagerAdView adManagerAdView, zzby zzbyVar) {
        this.s = 2;
        this.f9674t = adManagerAdView;
        this.f9675u = zzbyVar;
        this.f9676v = ctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.s;
        Object obj = this.f9676v;
        Object obj2 = this.f9675u;
        Object obj3 = this.f9674t;
        switch (i6) {
            case 0:
                y yVar = (y) obj3;
                yVar.getClass();
                int i7 = j31.f5914a;
                bd2 bd2Var = yVar.f10757b.s.I;
                xc2 xc2VarT = bd2Var.t();
                bd2Var.q(xc2VarT, 1017, new dh0(xc2VarT, (w) obj2, (ra2) obj));
                break;
            case 1:
                pb pbVar = (pb) obj3;
                pbVar.zzw();
                ub ubVar = (ub) obj2;
                xb xbVar = ubVar.f9520c;
                if (xbVar == null) {
                    pbVar.zzo(ubVar.f9518a);
                } else {
                    pbVar.zzn(xbVar);
                }
                if (ubVar.f9521d) {
                    pbVar.zzm("intermediate-response");
                } else {
                    pbVar.zzp("done");
                }
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                AdManagerAdView adManagerAdView = (AdManagerAdView) obj3;
                if (!adManagerAdView.zzb((zzby) obj2)) {
                    zzo.zzj("Could not bind.");
                    break;
                } else {
                    ((ct) obj).s.onAdManagerAdViewLoaded(adManagerAdView);
                    break;
                }
            default:
                vd2 vd2Var = (vd2) obj3;
                vd2Var.getClass();
                int i8 = j31.f5914a;
                bd2 bd2Var2 = vd2Var.f9836b.s.I;
                xc2 xc2VarT2 = bd2Var2.t();
                bd2Var2.q(xc2VarT2, 1009, new v31(xc2VarT2, (w) obj2, (ra2) obj));
                break;
        }
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f9674t = obj;
        this.f9675u = obj2;
        this.f9676v = obj3;
    }
}
