package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzee;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ip0 extends zzea {
    public final Object s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public final zzeb f5821t;

    /* renamed from: u, reason: collision with root package name */
    public final ty f5822u;

    public ip0(zzeb zzebVar, ty tyVar) {
        this.f5821t = zzebVar;
        this.f5822u = tyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        ty tyVar = this.f5822u;
        if (tyVar != null) {
            return tyVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        ty tyVar = this.f5822u;
        if (tyVar != null) {
            return tyVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final zzee zzi() {
        synchronized (this.s) {
            try {
                zzeb zzebVar = this.f5821t;
                if (zzebVar == null) {
                    return null;
                }
                return zzebVar.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z6) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(zzee zzeeVar) {
        synchronized (this.s) {
            try {
                zzeb zzebVar = this.f5821t;
                if (zzebVar != null) {
                    zzebVar.zzm(zzeeVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
