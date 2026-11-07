package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ce1 implements dn0, xk0, gn0 {
    public final he1 s;

    /* renamed from: t, reason: collision with root package name */
    public final de1 f3543t;

    public ce1(Context context, he1 he1Var) {
        this.s = he1Var;
        this.f3543t = d0.e(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.xk0
    public final void e(zze zzeVar) {
        if (((Boolean) mp.f7200d.c()).booleanValue()) {
            String string = zzeVar.zza().toString();
            de1 de1Var = this.f3543t;
            de1Var.e(string);
            de1Var.s(false);
            this.s.a(de1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void zzb() {
        if (((Boolean) mp.f7200d.c()).booleanValue()) {
            de1 de1Var = this.f3543t;
            de1Var.s(true);
            this.s.a(de1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.dn0
    public final void zzl() {
        if (((Boolean) mp.f7200d.c()).booleanValue()) {
            this.f3543t.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.dn0
    public final void zzk() {
    }
}
