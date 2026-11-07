package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzfb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final oc0 f9227a;

    public tc0(oc0 oc0Var) {
        this.f9227a = oc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        zzfb liteSdkVersion;
        zzcw zzcwVar = (zzcw) pc1.a(this.f9227a.a()).f8028b;
        if (zzcwVar != null) {
            try {
                liteSdkVersion = zzcwVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.zzb();
        }
        return null;
    }
}
