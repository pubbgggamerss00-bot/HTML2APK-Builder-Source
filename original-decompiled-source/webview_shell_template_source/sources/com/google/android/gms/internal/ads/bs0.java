package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class bs0 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3261b;

    public /* synthetic */ bs0(int i6, Object obj) {
        this.f3260a = i6;
        this.f3261b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f3260a) {
            case 0:
                gs0 gs0Var = (gs0) this.f3261b;
                xa0 xa0Var = (xa0) obj;
                xa0Var.Z("/result", gs0Var.h);
                eb0 eb0VarZzN = xa0Var.zzN();
                zzb zzbVar = new zzb(gs0Var.f5142c, null, null);
                dz0 dz0Var = gs0Var.f5147i;
                cf1 cf1Var = gs0Var.f5148j;
                cu0 cu0Var = gs0Var.f5143d;
                yr0 yr0Var = gs0Var.f5140a;
                eb0VarZzN.j(null, yr0Var, yr0Var, yr0Var, yr0Var, false, null, zzbVar, null, null, dz0Var, cf1Var, cu0Var, null, null, null, null, null, null);
                return xa0Var;
            default:
                ed1 ed1Var = (ed1) this.f3261b;
                ed1Var.f4236c = (ti0) obj;
                return ed1Var;
        }
    }
}
