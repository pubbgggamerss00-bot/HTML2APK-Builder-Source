package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ch0 extends gj {

    /* renamed from: t, reason: collision with root package name */
    public final bh0 f3571t;

    /* renamed from: u, reason: collision with root package name */
    public final zzby f3572u;

    /* renamed from: v, reason: collision with root package name */
    public final ba1 f3573v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3574w;

    /* renamed from: x, reason: collision with root package name */
    public final cu0 f3575x;

    public ch0(bh0 bh0Var, zzby zzbyVar, ba1 ba1Var, cu0 cu0Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f3574w = ((Boolean) zzbe.zzc().a(zn.R0)).booleanValue();
        this.f3571t = bh0Var;
        this.f3572u = zzbyVar;
        this.f3573v = ba1Var;
        this.f3575x = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.hj
    public final void K1(zzdr zzdrVar) {
        com.google.android.gms.common.internal.l.d("setOnPaidEventListener must be called on the main UI thread.");
        ba1 ba1Var = this.f3573v;
        if (ba1Var != null) {
            try {
                if (!zzdrVar.zzf()) {
                    this.f3575x.b();
                }
            } catch (RemoteException e6) {
                zzo.zzf("Error in making CSI ping for reporting paid event callback", e6);
            }
            ba1Var.f3023y.set(zzdrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.hj
    public final void h0(k3.a aVar, oj ojVar) {
        try {
            this.f3573v.f3020v.set(ojVar);
            this.f3571t.c(this.f3574w, (Activity) k3.b.i1(aVar));
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.hj
    public final void s(boolean z6) {
        this.f3574w = z6;
    }

    @Override // com.google.android.gms.internal.ads.hj
    public final zzdy zzf() {
        if (((Boolean) zzbe.zzc().a(zn.C6)).booleanValue()) {
            return this.f3571t.f9293f;
        }
        return null;
    }
}
