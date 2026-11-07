package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class os0 extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final jp0 f7849a;

    public os0(jp0 jp0Var) {
        this.f7849a = jp0Var;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzeb zzebVarI = this.f7849a.i();
        zzee zzeeVarZzi = null;
        if (zzebVarI != null) {
            try {
                zzeeVarZzi = zzebVarI.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzeeVarZzi == null) {
            return;
        }
        try {
            zzeeVarZzi.zze();
        } catch (RemoteException e6) {
            zzo.zzk("Unable to call onVideoEnd()", e6);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzeb zzebVarI = this.f7849a.i();
        zzee zzeeVarZzi = null;
        if (zzebVarI != null) {
            try {
                zzeeVarZzi = zzebVarI.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzeeVarZzi == null) {
            return;
        }
        try {
            zzeeVarZzi.zzg();
        } catch (RemoteException e6) {
            zzo.zzk("Unable to call onVideoEnd()", e6);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzeb zzebVarI = this.f7849a.i();
        zzee zzeeVarZzi = null;
        if (zzebVarI != null) {
            try {
                zzeeVarZzi = zzebVarI.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzeeVarZzi == null) {
            return;
        }
        try {
            zzeeVarZzi.zzi();
        } catch (RemoteException e6) {
            zzo.zzk("Unable to call onVideoEnd()", e6);
        }
    }
}
