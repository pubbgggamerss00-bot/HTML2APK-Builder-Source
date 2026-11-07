package com.google.android.gms.ads.h5;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.xu;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {
    private final bv zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new bv(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        bv bvVar = this.zza;
        bvVar.getClass();
        if (((Boolean) zzbe.zzc().a(zn.N9)).booleanValue()) {
            if (bvVar.f3300c == null) {
                bvVar.f3300c = zzbc.zza().zzn(bvVar.f3298a, new dy(), bvVar.f3299b);
            }
            xu xuVar = bvVar.f3300c;
            if (xuVar != null) {
                try {
                    xuVar.zze();
                } catch (RemoteException e6) {
                    zzo.zzl("#007 Could not call remote method.", e6);
                }
            }
        }
    }

    public boolean handleH5AdsRequest(String str) {
        bv bvVar = this.zza;
        bvVar.getClass();
        if (!bv.a(str)) {
            return false;
        }
        if (bvVar.f3300c == null) {
            bvVar.f3300c = zzbc.zza().zzn(bvVar.f3298a, new dy(), bvVar.f3299b);
        }
        xu xuVar = bvVar.f3300c;
        if (xuVar == null) {
            return false;
        }
        try {
            xuVar.zzf(str);
            return true;
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            return true;
        }
    }

    public boolean shouldInterceptRequest(String str) {
        return bv.a(str);
    }
}
