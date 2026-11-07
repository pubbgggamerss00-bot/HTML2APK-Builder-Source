package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m41 extends zzbx {
    public final cu0 A;
    public xn0 B;
    public boolean C = ((Boolean) zzbe.zzc().a(zn.O0)).booleanValue();
    public final zzs s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f6927t;

    /* renamed from: u, reason: collision with root package name */
    public final fb1 f6928u;

    /* renamed from: v, reason: collision with root package name */
    public final String f6929v;

    /* renamed from: w, reason: collision with root package name */
    public final VersionInfoParcel f6930w;

    /* renamed from: x, reason: collision with root package name */
    public final j41 f6931x;

    /* renamed from: y, reason: collision with root package name */
    public final hb1 f6932y;

    /* renamed from: z, reason: collision with root package name */
    public final mf f6933z;

    public m41(Context context, zzs zzsVar, String str, fb1 fb1Var, j41 j41Var, hb1 hb1Var, VersionInfoParcel versionInfoParcel, mf mfVar, cu0 cu0Var) {
        this.s = zzsVar;
        this.f6929v = str;
        this.f6927t = context;
        this.f6928u = fb1Var;
        this.f6931x = j41Var;
        this.f6932y = hb1Var;
        this.f6930w = versionInfoParcel;
        this.f6933z = mfVar;
        this.A = cu0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        com.google.android.gms.common.internal.l.d("resume must be called on the main UI thread.");
        xn0 xn0Var = this.B;
        if (xn0Var != null) {
            dl0 dl0Var = xn0Var.f9290c;
            dl0Var.getClass();
            dl0Var.o0(new yn(null, 1));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
        com.google.android.gms.common.internal.l.d("setAdListener must be called on the main UI thread.");
        this.f6931x.s.set(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        com.google.android.gms.common.internal.l.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
        com.google.android.gms.common.internal.l.d("setAppEventListener must be called on the main UI thread.");
        this.f6931x.f(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) {
        this.f6931x.f5932w.set(zzctVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzL(boolean z6) {
        com.google.android.gms.common.internal.l.d("setImmersiveMode must be called on the main UI thread.");
        this.C = z6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(to toVar) {
        com.google.android.gms.common.internal.l.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f6928u.f4594f = toVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
        com.google.android.gms.common.internal.l.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.A.b();
            }
        } catch (RemoteException e6) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f6931x.f5930u.set(zzdrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(f40 f40Var) {
        this.f6932y.f5319w.set(f40Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzW(k3.a aVar) {
        if (this.B == null) {
            zzo.zzj("Interstitial can not be shown before loaded.");
            this.f6931x.e(tc1.d(9, null, null));
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.T2)).booleanValue()) {
            this.f6933z.f7110b.zzn(new Throwable().getStackTrace());
        }
        this.B.b(this.C, (Activity) k3.b.i1(aVar));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
        com.google.android.gms.common.internal.l.d("showInterstitial must be called on the main UI thread.");
        if (this.B == null) {
            zzo.zzj("Interstitial can not be shown before loaded.");
            this.f6931x.e(tc1.d(9, null, null));
        } else {
            if (((Boolean) zzbe.zzc().a(zn.T2)).booleanValue()) {
                this.f6933z.f7110b.zzn(new Throwable().getStackTrace());
            }
            this.B.b(this.C, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.f6928u.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzaa() {
        com.google.android.gms.common.internal.l.d("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzab(zzm zzmVar) {
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) pp.f8122i.c()).booleanValue()) {
                    boolean z6 = ((Boolean) zzbe.zzc().a(zn.ab)).booleanValue();
                    if (this.f6930w.clientJarVersion < ((Integer) zzbe.zzc().a(zn.bb)).intValue() || !z6) {
                        com.google.android.gms.common.internal.l.d("loadAd must be called on the main UI thread.");
                    }
                }
            }
            zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzI(this.f6927t) && zzmVar.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                j41 j41Var = this.f6931x;
                if (j41Var != null) {
                    j41Var.k0(tc1.d(4, null, null));
                }
            } else if (!zze()) {
                qc1.a(this.f6927t, zzmVar.zzf);
                this.B = null;
                return this.f6928u.b(zzmVar, this.f6929v, new db1(this.s), new dh0(18, this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        com.google.android.gms.common.internal.l.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized boolean zze() {
        xn0 xn0Var = this.B;
        if (xn0Var != null) {
            if (!xn0Var.f10643n.f3602t.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return this.f6931x.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        zzcm zzcmVar;
        j41 j41Var = this.f6931x;
        synchronized (j41Var) {
            zzcmVar = (zzcm) j41Var.f5929t.get();
        }
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzdy zzk() {
        xn0 xn0Var;
        if (((Boolean) zzbe.zzc().a(zn.C6)).booleanValue() && (xn0Var = this.B) != null) {
            return xn0Var.f9293f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final k3.a zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.f6929v;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzs() {
        mk0 mk0Var;
        xn0 xn0Var = this.B;
        if (xn0Var == null || (mk0Var = xn0Var.f9293f) == null) {
            return null;
        }
        return mk0Var.s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzt() {
        mk0 mk0Var;
        xn0 xn0Var = this.B;
        if (xn0Var == null || (mk0Var = xn0Var.f9293f) == null) {
            return null;
        }
        return mk0Var.s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        com.google.android.gms.common.internal.l.d("destroy must be called on the main UI thread.");
        xn0 xn0Var = this.B;
        if (xn0Var != null) {
            dl0 dl0Var = xn0Var.f9290c;
            dl0Var.getClass();
            dl0Var.o0(new wg1(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) {
        this.f6931x.f5931v.set(zzboVar);
        zzab(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        com.google.android.gms.common.internal.l.d("pause must be called on the main UI thread.");
        xn0 xn0Var = this.B;
        if (xn0Var != null) {
            dl0 dl0Var = xn0Var.f9290c;
            dl0Var.getClass();
            dl0Var.o0(new cl0(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(kj kjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(a20 a20Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z6) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(c20 c20Var, String str) {
    }
}
