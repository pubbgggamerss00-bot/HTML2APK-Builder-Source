package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h41 extends zzbx implements vl0 {
    public fh0 A;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final ia1 f5245t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5246u;

    /* renamed from: v, reason: collision with root package name */
    public final j41 f5247v;

    /* renamed from: w, reason: collision with root package name */
    public zzs f5248w;

    /* renamed from: x, reason: collision with root package name */
    public final dc1 f5249x;

    /* renamed from: y, reason: collision with root package name */
    public final VersionInfoParcel f5250y;

    /* renamed from: z, reason: collision with root package name */
    public final cu0 f5251z;

    public h41(Context context, zzs zzsVar, String str, ia1 ia1Var, j41 j41Var, VersionInfoParcel versionInfoParcel, cu0 cu0Var) {
        this.s = context;
        this.f5245t = ia1Var;
        this.f5248w = zzsVar;
        this.f5246u = str;
        this.f5247v = j41Var;
        this.f5249x = ia1Var.f5646k;
        this.f5250y = versionInfoParcel;
        this.f5251z = cu0Var;
        ia1Var.h.l0(this, ia1Var.f5638b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e2() {
        boolean z6;
        if (((Boolean) pp.f8120f.c()).booleanValue()) {
            z6 = ((Boolean) zzbe.zzc().a(zn.ab)).booleanValue();
        }
        return this.f5250y.clientJarVersion < ((Integer) zzbe.zzc().a(zn.bb)).intValue() || !z6;
    }

    public final synchronized boolean i1(zzm zzmVar) {
        try {
            if (e2()) {
                com.google.android.gms.common.internal.l.d("loadAd must be called on the main UI thread.");
            }
            zzv.zzq();
            if (!com.google.android.gms.ads.internal.util.zzs.zzI(this.s) || zzmVar.zzs != null) {
                qc1.a(this.s, zzmVar.zzf);
                return this.f5245t.b(zzmVar, this.f5246u, null, new dh0(17, this));
            }
            zzo.zzg("Failed to load the ad because app ID is missing.");
            j41 j41Var = this.f5247v;
            if (j41Var != null) {
                j41Var.k0(tc1.d(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
        com.google.android.gms.common.internal.l.d("recordManualImpression must be called on the main UI thread.");
        fh0 fh0Var = this.A;
        if (fh0Var != null) {
            fh0Var.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzB() {
        try {
            if (((Boolean) pp.h.c()).booleanValue()) {
                if (((Boolean) zzbe.zzc().a(zn.Wa)).booleanValue()) {
                    if (this.f5250y.clientJarVersion < ((Integer) zzbe.zzc().a(zn.cb)).intValue()) {
                        com.google.android.gms.common.internal.l.d("resume must be called on the main UI thread.");
                    }
                } else {
                    com.google.android.gms.common.internal.l.d("resume must be called on the main UI thread.");
                }
            }
            fh0 fh0Var = this.A;
            if (fh0Var != null) {
                dl0 dl0Var = fh0Var.f9290c;
                dl0Var.getClass();
                dl0Var.o0(new yn(null, 1));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
        if (e2()) {
            com.google.android.gms.common.internal.l.d("setAdListener must be called on the main UI thread.");
        }
        l41 l41Var = this.f5245t.f5641e;
        synchronized (l41Var) {
            l41Var.s = zzbiVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
        if (e2()) {
            com.google.android.gms.common.internal.l.d("setAdListener must be called on the main UI thread.");
        }
        this.f5247v.s.set(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        com.google.android.gms.common.internal.l.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(zzs zzsVar) {
        com.google.android.gms.common.internal.l.d("setAdSize must be called on the main UI thread.");
        this.f5249x.f3830b = zzsVar;
        this.f5248w = zzsVar;
        fh0 fh0Var = this.A;
        if (fh0Var != null) {
            fh0Var.i(this.f5245t.f5642f, zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
        if (e2()) {
            com.google.android.gms.common.internal.l.d("setAppEventListener must be called on the main UI thread.");
        }
        this.f5247v.f(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzN(boolean z6) {
        try {
            if (e2()) {
                com.google.android.gms.common.internal.l.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f5249x.f3833e = z6;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(to toVar) {
        com.google.android.gms.common.internal.l.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f5245t.f5643g = toVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
        if (e2()) {
            com.google.android.gms.common.internal.l.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdrVar.zzf()) {
                this.f5251z.b();
            }
        } catch (RemoteException e6) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f5247v.f5930u.set(zzdrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzU(zzga zzgaVar) {
        try {
            if (e2()) {
                com.google.android.gms.common.internal.l.d("setVideoOptions must be called on the main UI thread.");
            }
            this.f5249x.f3832d = zzgaVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        fh0 fh0Var = this.A;
        if (fh0Var != null) {
            if (fh0Var.f9289b.f9202q0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.f5245t.a();
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final synchronized void zza() {
        boolean zZzW;
        int i6;
        try {
            Object parent = this.f5245t.f5642f.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                zzv.zzq();
                zZzW = com.google.android.gms.ads.internal.util.zzs.zzW(view, view.getContext());
            } else {
                zZzW = false;
            }
            if (!zZzW) {
                ia1 ia1Var = this.f5245t;
                hm0 hm0Var = ia1Var.f5645j;
                wl0 wl0Var = ia1Var.h;
                synchronized (hm0Var) {
                    i6 = hm0Var.s;
                }
                wl0Var.p0(i6);
                return;
            }
            zzs zzsVarG = this.f5249x.f3830b;
            fh0 fh0Var = this.A;
            if (fh0Var != null && fh0Var.g() != null && this.f5249x.f3844q) {
                zzsVarG = ed0.g(this.s, Collections.singletonList(this.A.g()));
            }
            synchronized (this) {
                dc1 dc1Var = this.f5249x;
                dc1Var.f3830b = zzsVarG;
                dc1Var.f3844q = this.f5248w.zzn;
                dc1Var.f3843p = true;
                try {
                    i1(dc1Var.f3829a);
                } catch (RemoteException unused) {
                    zzo.zzj("Failed to refresh the banner ad.");
                }
                this.f5249x.f3843p = false;
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(zzm zzmVar) {
        zzs zzsVar = this.f5248w;
        synchronized (this) {
            dc1 dc1Var = this.f5249x;
            dc1Var.f3830b = zzsVar;
            dc1Var.f3844q = this.f5248w.zzn;
        }
        return i1(zzmVar);
        return i1(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(zzcq zzcqVar) {
        com.google.android.gms.common.internal.l.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f5249x.f3847u = zzcqVar;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final synchronized void zzb() {
        boolean zZzW;
        int i6;
        Object parent = this.f5245t.f5642f.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            zzv.zzq();
            zZzW = com.google.android.gms.ads.internal.util.zzs.zzW(view, view.getContext());
        } else {
            zZzW = false;
        }
        if (zZzW) {
            this.f5245t.c();
            return;
        }
        ia1 ia1Var = this.f5245t;
        hm0 hm0Var = ia1Var.f5645j;
        wl0 wl0Var = ia1Var.h;
        synchronized (hm0Var) {
            i6 = hm0Var.f5446t;
        }
        wl0Var.q0(i6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        com.google.android.gms.common.internal.l.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzs zzg() {
        com.google.android.gms.common.internal.l.d("getAdSize must be called on the main UI thread.");
        fh0 fh0Var = this.A;
        if (fh0Var != null) {
            return ed0.g(this.s, Collections.singletonList(fh0Var.f()));
        }
        return this.f5249x.f3830b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return this.f5247v.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        zzcm zzcmVar;
        j41 j41Var = this.f5247v;
        synchronized (j41Var) {
            zzcmVar = (zzcm) j41Var.f5929t.get();
        }
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzdy zzk() {
        fh0 fh0Var;
        if (((Boolean) zzbe.zzc().a(zn.C6)).booleanValue() && (fh0Var = this.A) != null) {
            return fh0Var.f9293f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzeb zzl() {
        com.google.android.gms.common.internal.l.d("getVideoController must be called from the main thread.");
        fh0 fh0Var = this.A;
        if (fh0Var == null) {
            return null;
        }
        return fh0Var.e();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final k3.a zzn() {
        if (e2()) {
            com.google.android.gms.common.internal.l.d("getAdFrame must be called on the main UI thread.");
        }
        return new k3.b(this.f5245t.f5642f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.f5246u;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzs() {
        mk0 mk0Var;
        fh0 fh0Var = this.A;
        if (fh0Var == null || (mk0Var = fh0Var.f9293f) == null) {
            return null;
        }
        return mk0Var.s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzt() {
        mk0 mk0Var;
        fh0 fh0Var = this.A;
        if (fh0Var == null || (mk0Var = fh0Var.f9293f) == null) {
            return null;
        }
        return mk0Var.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzx() {
        try {
            if (((Boolean) pp.f8119e.c()).booleanValue()) {
                if (((Boolean) zzbe.zzc().a(zn.Xa)).booleanValue()) {
                    if (this.f5250y.clientJarVersion < ((Integer) zzbe.zzc().a(zn.cb)).intValue()) {
                        com.google.android.gms.common.internal.l.d("destroy must be called on the main UI thread.");
                    }
                } else {
                    com.google.android.gms.common.internal.l.d("destroy must be called on the main UI thread.");
                }
            }
            fh0 fh0Var = this.A;
            if (fh0Var != null) {
                dl0 dl0Var = fh0Var.f9290c;
                dl0Var.getClass();
                dl0Var.o0(new wg1(null));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzz() {
        try {
            if (((Boolean) pp.f8121g.c()).booleanValue()) {
                if (((Boolean) zzbe.zzc().a(zn.Ya)).booleanValue()) {
                    if (this.f5250y.clientJarVersion < ((Integer) zzbe.zzc().a(zn.cb)).intValue()) {
                        com.google.android.gms.common.internal.l.d("pause must be called on the main UI thread.");
                    }
                } else {
                    com.google.android.gms.common.internal.l.d("pause must be called on the main UI thread.");
                }
            }
            fh0 fh0Var = this.A;
            if (fh0Var != null) {
                dl0 dl0Var = fh0Var.f9290c;
                dl0Var.getClass();
                dl0Var.o0(new cl0(null));
            }
        } catch (Throwable th) {
            throw th;
        }
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
