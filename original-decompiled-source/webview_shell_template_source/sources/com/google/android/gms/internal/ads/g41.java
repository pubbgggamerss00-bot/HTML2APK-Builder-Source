package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g41 extends zzbq {
    public final wv0 s;

    public g41(Context context, kd0 kd0Var, dc1 dc1Var, pp0 pp0Var, zzbl zzblVar) {
        o41 o41Var = new o41(pp0Var, (cu0) kd0Var.f6376z.zzb());
        o41Var.f7594b.s.set(zzblVar);
        this.s = new wv0(new s41(kd0Var, context, o41Var, dc1Var), dc1Var.f3831c);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zze() {
        String str;
        wv0 wv0Var = this.s;
        synchronized (wv0Var) {
            str = null;
            try {
                mk0 mk0Var = (mk0) wv0Var.f10279u;
                if (mk0Var != null) {
                    str = mk0Var.s;
                }
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zzf() {
        String str;
        wv0 wv0Var = this.s;
        synchronized (wv0Var) {
            str = null;
            try {
                mk0 mk0Var = (mk0) wv0Var.f10279u;
                if (mk0Var != null) {
                    str = mk0Var.s;
                }
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzmVar) {
        this.s.c(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized void zzh(zzm zzmVar, int i6) {
        this.s.c(zzmVar, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    @Override // com.google.android.gms.ads.internal.client.zzbr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzi() {
        boolean z6;
        wv0 wv0Var = this.s;
        synchronized (wv0Var) {
            try {
                bj0 bj0Var = ((s41) wv0Var.s).f8789f;
                if (bj0Var != null) {
                    z6 = bj0Var.f3205c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }
}
