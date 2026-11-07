package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y60 extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b70 f10872a;

    public y60(b70 b70Var) {
        this.f10872a = b70Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        b70 b70Var = this.f10872a;
        bo boVar = new bo(b70Var.f2950e, b70Var.f2951f.afmaVersion);
        synchronized (this.f10872a.f2946a) {
            try {
                zzv.zze();
                eo.a(this.f10872a.h, boVar);
            } catch (IllegalArgumentException e6) {
                zzo.zzk("Cannot config CSI reporter.", e6);
            }
        }
    }
}
