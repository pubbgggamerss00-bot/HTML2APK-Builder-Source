package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class n41 implements rk0 {
    public final /* synthetic */ j41 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ jw f7314t;

    public /* synthetic */ n41(j41 j41Var, jw jwVar) {
        this.s = j41Var;
        this.f7314t = jwVar;
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) {
        this.s.k0(zzeVar);
        jw jwVar = this.f7314t;
        if (jwVar != null) {
            try {
                jwVar.zzf(zzeVar);
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        if (jwVar != null) {
            try {
                jwVar.zze(zzeVar.zza);
            } catch (RemoteException e7) {
                zzo.zzl("#007 Could not call remote method.", e7);
            }
        }
    }
}
