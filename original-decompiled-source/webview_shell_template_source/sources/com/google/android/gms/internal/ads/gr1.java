package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gr1 extends ir1 {
    @Override // com.google.android.gms.internal.ads.ir1
    public final Object q(Object obj, Object obj2) {
        pr1 pr1Var = (pr1) obj;
        c5.a aVarZza = pr1Var.zza(obj2);
        if (aVarZza != null) {
            return aVarZza;
        }
        throw new NullPointerException(dm1.a("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", pr1Var));
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final /* synthetic */ void r(Object obj) {
        j((c5.a) obj);
    }
}
