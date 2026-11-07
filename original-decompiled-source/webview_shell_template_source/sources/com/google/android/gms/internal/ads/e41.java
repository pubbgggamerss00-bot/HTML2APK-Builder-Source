package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e41 extends zzbx {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final zzbl f4113t;

    /* renamed from: u, reason: collision with root package name */
    public final ec1 f4114u;

    /* renamed from: v, reason: collision with root package name */
    public final hh0 f4115v;

    /* renamed from: w, reason: collision with root package name */
    public final FrameLayout f4116w;

    /* renamed from: x, reason: collision with root package name */
    public final cu0 f4117x;

    public e41(Context context, zzbl zzblVar, ec1 ec1Var, hh0 hh0Var, cu0 cu0Var) {
        this.s = context;
        this.f4113t = zzblVar;
        this.f4114u = ec1Var;
        this.f4115v = hh0Var;
        this.f4117x = cu0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = hh0Var.f5388k;
        zzv.zzq();
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.f4116w = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
        this.f4115v.h();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() {
        com.google.android.gms.common.internal.l.d("destroy must be called on the main UI thread.");
        dl0 dl0Var = this.f4115v.f9290c;
        dl0Var.getClass();
        dl0Var.o0(new yn(null, 1));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
        zzo.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
        zzo.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        zzo.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzsVar) {
        com.google.android.gms.common.internal.l.d("setAdSize must be called on the main UI thread.");
        hh0 hh0Var = this.f4115v;
        if (hh0Var != null) {
            hh0Var.i(this.f4116w, zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
        j41 j41Var = this.f4114u.f4208c;
        if (j41Var != null) {
            j41Var.f(zzcmVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z6) {
        zzo.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(to toVar) {
        zzo.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
        if (!((Boolean) zzbe.zzc().a(zn.tb)).booleanValue()) {
            zzo.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        j41 j41Var = this.f4114u.f4208c;
        if (j41Var != null) {
            try {
                if (!zzdrVar.zzf()) {
                    this.f4117x.b();
                }
            } catch (RemoteException e6) {
                zzo.zzf("Error in making CSI ping for reporting paid event callback", e6);
            }
            j41Var.f5930u.set(zzdrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzgaVar) {
        zzo.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() {
        hh0 hh0Var = this.f4115v;
        return hh0Var != null && hh0Var.f9289b.f9202q0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzmVar) {
        zzo.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) {
        zzo.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        zzo.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        com.google.android.gms.common.internal.l.d("getAdSize must be called on the main UI thread.");
        return ed0.g(this.s, Collections.singletonList(this.f4115v.f()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return this.f4113t;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        return this.f4114u.f4218n;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() {
        return this.f4115v.f9293f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() {
        return this.f4115v.e();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final k3.a zzn() {
        return new k3.b(this.f4116w);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        return this.f4114u.f4211f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzs() {
        return this.f4115v.f9293f.s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzt() {
        return this.f4115v.f9293f.s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() {
        com.google.android.gms.common.internal.l.d("destroy must be called on the main UI thread.");
        dl0 dl0Var = this.f4115v.f9290c;
        dl0Var.getClass();
        dl0Var.o0(new wg1(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() {
        com.google.android.gms.common.internal.l.d("destroy must be called on the main UI thread.");
        dl0 dl0Var = this.f4115v.f9290c;
        dl0Var.getClass();
        dl0Var.o0(new cl0(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(kj kjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z6) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(a20 a20Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(f40 f40Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(k3.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(c20 c20Var, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) {
    }
}
