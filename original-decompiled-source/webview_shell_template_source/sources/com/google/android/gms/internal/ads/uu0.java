package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uu0 implements mu0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f9632a;

    /* renamed from: b, reason: collision with root package name */
    public final m41 f9633b;

    public uu0(long j6, Context context, qu0 qu0Var, kd0 kd0Var, String str) {
        this.f9632a = j6;
        p2.g gVarS = kd0Var.S();
        gVarS.f14079t = context;
        gVarS.f14081v = new zzs();
        str.getClass();
        gVarS.f14080u = str;
        m41 m41Var = (m41) gVarS.d().f8611a.zzb();
        this.f9633b = m41Var;
        m41Var.zzD(new tu0(this, qu0Var));
    }

    @Override // com.google.android.gms.internal.ads.mu0
    public final void a(zzm zzmVar) {
        this.f9633b.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.mu0
    public final void zza() {
        this.f9633b.zzx();
    }

    @Override // com.google.android.gms.internal.ads.mu0
    public final void zzc() {
        this.f9633b.zzW(new k3.b(null));
    }
}
