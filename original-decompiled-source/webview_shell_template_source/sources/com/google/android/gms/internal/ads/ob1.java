package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ob1 extends q40 {
    public rs0 A;
    public boolean B = ((Boolean) zzbe.zzc().a(zn.O0)).booleanValue();
    public final mb1 s;

    /* renamed from: t, reason: collision with root package name */
    public final hb1 f7676t;

    /* renamed from: u, reason: collision with root package name */
    public final String f7677u;

    /* renamed from: v, reason: collision with root package name */
    public final bc1 f7678v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f7679w;

    /* renamed from: x, reason: collision with root package name */
    public final VersionInfoParcel f7680x;

    /* renamed from: y, reason: collision with root package name */
    public final mf f7681y;

    /* renamed from: z, reason: collision with root package name */
    public final cu0 f7682z;

    public ob1(String str, mb1 mb1Var, Context context, hb1 hb1Var, bc1 bc1Var, VersionInfoParcel versionInfoParcel, mf mfVar, cu0 cu0Var) {
        this.f7677u = str;
        this.s = mb1Var;
        this.f7676t = hb1Var;
        this.f7678v = bc1Var;
        this.f7679w = context;
        this.f7680x = versionInfoParcel;
        this.f7681y = mfVar;
        this.f7682z = cu0Var;
    }

    public final synchronized void i1(zzm zzmVar, y40 y40Var, int i6) {
        try {
            if (!zzmVar.zzb()) {
                boolean z6 = false;
                if (((Boolean) pp.f8124k.c()).booleanValue()) {
                    if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                        z6 = true;
                    }
                }
                if (this.f7680x.clientJarVersion < ((Integer) zzbe.zzc().a(zn.bb)).intValue() || !z6) {
                    com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
                }
            }
            this.f7676t.f5317u.set(y40Var);
            zzv.zzq();
            if (zzs.zzI(this.f7679w) && zzmVar.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                this.f7676t.k0(tc1.d(4, null, null));
                return;
            }
            if (this.A != null) {
                return;
            }
            ib1 ib1Var = new ib1(27);
            mb1 mb1Var = this.s;
            mb1Var.h.f3842o.f10916a = i6;
            mb1Var.a(zzmVar, this.f7677u, ib1Var, new xj0(13, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final Bundle zzb() {
        Bundle bundle;
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        rs0 rs0Var = this.A;
        if (rs0Var == null) {
            return new Bundle();
        }
        ml0 ml0Var = rs0Var.f8696o;
        synchronized (ml0Var) {
            bundle = new Bundle(ml0Var.f7187t);
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final zzdy zzc() {
        rs0 rs0Var;
        if (((Boolean) zzbe.zzc().a(zn.C6)).booleanValue() && (rs0Var = this.A) != null) {
            return rs0Var.f9293f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final o40 zzd() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        rs0 rs0Var = this.A;
        if (rs0Var != null) {
            return rs0Var.f8698q;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final synchronized String zze() {
        mk0 mk0Var;
        rs0 rs0Var = this.A;
        if (rs0Var == null || (mk0Var = rs0Var.f9293f) == null) {
            return null;
        }
        return mk0Var.s;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final synchronized void zzf(zzm zzmVar, y40 y40Var) {
        i1(zzmVar, y40Var, 2);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final synchronized void zzg(zzm zzmVar, y40 y40Var) {
        i1(zzmVar, y40Var, 3);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final synchronized void zzh(boolean z6) {
        com.google.android.gms.common.internal.l.d("setImmersiveMode must be called on the main UI thread.");
        this.B = z6;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzi(zzdo zzdoVar) {
        hb1 hb1Var = this.f7676t;
        if (zzdoVar == null) {
            hb1Var.f5316t.set(null);
        } else {
            hb1Var.f5316t.set(new nb1(this, zzdoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzj(zzdr zzdrVar) {
        com.google.android.gms.common.internal.l.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.f7682z.b();
            }
        } catch (RemoteException e6) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f7676t.f5322z.set(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzk(u40 u40Var) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        this.f7676t.f5318v.set(u40Var);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final synchronized void zzl(e50 e50Var) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        bc1 bc1Var = this.f7678v;
        bc1Var.f3032a = e50Var.s;
        bc1Var.f3033b = e50Var.f4122t;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final synchronized void zzm(k3.a aVar) {
        zzn(aVar, this.B);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final synchronized void zzn(k3.a aVar, boolean z6) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        if (this.A == null) {
            zzo.zzj("Rewarded can not be shown before loaded");
            this.f7676t.e(tc1.d(9, null, null));
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.T2)).booleanValue()) {
            this.f7681y.f7110b.zzn(new Throwable().getStackTrace());
        }
        this.A.b(z6, (Activity) k3.b.i1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final boolean zzo() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        rs0 rs0Var = this.A;
        return (rs0Var == null || rs0Var.f8700t) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void zzp(z40 z40Var) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        this.f7676t.f5320x.set(z40Var);
    }
}
