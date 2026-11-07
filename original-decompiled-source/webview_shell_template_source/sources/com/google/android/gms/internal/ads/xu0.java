package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xu0 implements mu0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10713a;

    /* renamed from: b, reason: collision with root package name */
    public final qu0 f10714b;

    /* renamed from: c, reason: collision with root package name */
    public final ob1 f10715c;

    public xu0(long j6, Context context, qu0 qu0Var, kd0 kd0Var, String str) {
        this.f10713a = j6;
        this.f10714b = qu0Var;
        b7 b7VarT = kd0Var.T();
        b7VarT.f2944t = context;
        b7VarT.f2945u = str;
        this.f10715c = (ob1) ((w92) b7VarT.a().f8494t).zzb();
    }

    @Override // com.google.android.gms.internal.ads.mu0
    public final void a(zzm zzmVar) {
        try {
            this.f10715c.zzf(zzmVar, new vu0(this));
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.mu0
    public final void zzc() {
        ob1 ob1Var = this.f10715c;
        try {
            ob1Var.zzk(new wu0(this));
            ob1Var.zzm(new k3.b(null));
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.mu0
    public final void zza() {
    }
}
