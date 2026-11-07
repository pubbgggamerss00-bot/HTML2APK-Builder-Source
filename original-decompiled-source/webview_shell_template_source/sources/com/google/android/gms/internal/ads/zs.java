package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zzf;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zs extends as {
    public final /* synthetic */ pc1 s;

    @Override // com.google.android.gms.internal.ads.cs
    public final void D0(tr trVar, String str) {
        ur urVar;
        pc1 pc1Var = this.s;
        zzf zzfVar = (zzf) pc1Var.f8028b;
        if (zzfVar == null) {
            return;
        }
        synchronized (pc1Var) {
            urVar = (ur) pc1Var.f8029c;
            if (urVar == null) {
                urVar = new ur(trVar);
                pc1Var.f8029c = urVar;
            }
        }
        zzfVar.zzb(urVar, str);
    }
}
