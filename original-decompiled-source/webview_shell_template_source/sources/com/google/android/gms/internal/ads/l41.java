package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l41 implements zza, on0 {
    public zzbi s;

    @Override // com.google.android.gms.internal.ads.on0
    public final synchronized void O() {
        zzbi zzbiVar = this.s;
        if (zzbiVar != null) {
            try {
                zzbiVar.zzb();
            } catch (RemoteException e6) {
                zzo.zzk("Remote Exception at onPhysicalClick.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zzbi zzbiVar = this.s;
        if (zzbiVar != null) {
            try {
                zzbiVar.zzb();
            } catch (RemoteException e6) {
                zzo.zzk("Remote Exception at onAdClicked.", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final synchronized void zzu() {
    }
}
