package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nb1 implements OnAdMetadataChangedListener {
    public final /* synthetic */ zzdo s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ob1 f7379t;

    public nb1(ob1 ob1Var, zzdo zzdoVar) {
        this.s = zzdoVar;
        this.f7379t = ob1Var;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.f7379t.A != null) {
            try {
                this.s.zze();
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
    }
}
