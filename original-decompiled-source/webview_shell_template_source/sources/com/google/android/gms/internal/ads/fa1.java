package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
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
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fa1 extends zzbx implements zzr, aj {
    public tg0 B;
    public bh0 C;
    public final hc0 s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f4570t;

    /* renamed from: v, reason: collision with root package name */
    public final String f4572v;

    /* renamed from: w, reason: collision with root package name */
    public final ca1 f4573w;

    /* renamed from: x, reason: collision with root package name */
    public final ba1 f4574x;

    /* renamed from: y, reason: collision with root package name */
    public final VersionInfoParcel f4575y;

    /* renamed from: z, reason: collision with root package name */
    public final cu0 f4576z;

    /* renamed from: u, reason: collision with root package name */
    public AtomicBoolean f4571u = new AtomicBoolean();
    public long A = -1;

    public fa1(hc0 hc0Var, Context context, String str, ca1 ca1Var, ba1 ba1Var, VersionInfoParcel versionInfoParcel, cu0 cu0Var) {
        this.s = hc0Var;
        this.f4570t = context;
        this.f4572v = str;
        this.f4573w = ca1Var;
        this.f4574x = ba1Var;
        this.f4575y = versionInfoParcel;
        this.f4576z = cu0Var;
        ba1Var.f3022x.set(this);
    }

    public final synchronized void i1(int i6) {
        try {
            if (this.f4571u.compareAndSet(false, true)) {
                this.f4574x.f();
                tg0 tg0Var = this.B;
                if (tg0Var != null) {
                    mi miVarZzb = zzv.zzb();
                    synchronized (miVarZzb.f7160a) {
                        try {
                            ki kiVar = miVarZzb.f7161b;
                            if (kiVar != null) {
                                synchronized (kiVar.f6424u) {
                                    kiVar.f6427x.remove(tg0Var);
                                }
                            }
                        } finally {
                        }
                    }
                }
                if (this.C != null) {
                    long jB = -1;
                    if (this.A != -1) {
                        jB = zzv.zzC().b() - this.A;
                    }
                    this.C.d(i6, jB);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        com.google.android.gms.common.internal.l.d("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(zzs zzsVar) {
        com.google.android.gms.common.internal.l.d("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(kj kjVar) {
        this.f4574x.f3018t.set(kjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
        this.f4573w.f10905i.f3836i = zzyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzN(boolean z6) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(to toVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzU(zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzZ() {
        boolean z6;
        c5.a aVar = this.f4573w.f10906j;
        if (aVar != null) {
            z6 = !aVar.isDone();
        }
        return z6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzab(zzm zzmVar) {
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) pp.f8118d.c()).booleanValue()) {
                    boolean z6 = ((Boolean) zzbe.zzc().a(zn.ab)).booleanValue();
                    if (this.f4575y.clientJarVersion < ((Integer) zzbe.zzc().a(zn.bb)).intValue() || !z6) {
                        com.google.android.gms.common.internal.l.d("loadAd must be called on the main UI thread.");
                    }
                }
            }
            zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzI(this.f4570t) && zzmVar.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                this.f4574x.k0(tc1.d(4, null, null));
                return false;
            }
            if (zzZ()) {
                return false;
            }
            this.f4571u = new AtomicBoolean();
            return this.f4573w.a(zzmVar, this.f4572v, new ea1(27), new dh0(20, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        if (this.C != null) {
            this.A = zzv.zzC().b();
            int i6 = this.C.f3173k;
            if (i6 > 0) {
                ScheduledExecutorService scheduledExecutorServiceB = this.s.b();
                i3.a aVarZzC = zzv.zzC();
                tg0 tg0Var = new tg0(scheduledExecutorServiceB, aVarZzC);
                this.B = tg0Var;
                p pVar = new p(14, this);
                synchronized (tg0Var) {
                    tg0Var.f9274f = pVar;
                    long j6 = i6;
                    tg0Var.f9272d = aVarZzC.b() + j6;
                    tg0Var.f9271c = scheduledExecutorServiceB.schedule(pVar, j6, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        bh0 bh0Var = this.C;
        if (bh0Var != null) {
            bh0Var.d(1, zzv.zzC().b() - this.A);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i6) {
        if (i6 == 0) {
            throw null;
        }
        int i7 = i6 - 1;
        if (i7 == 0) {
            i1(2);
            return;
        }
        if (i7 == 1) {
            i1(4);
        } else if (i7 != 2) {
            i1(6);
        } else {
            i1(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final k3.a zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.f4572v;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        com.google.android.gms.common.internal.l.d("destroy must be called on the main UI thread.");
        bh0 bh0Var = this.C;
        if (bh0Var != null) {
            bh0Var.b();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        com.google.android.gms.common.internal.l.d("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
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
    public final void zzP(zzdr zzdrVar) {
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
