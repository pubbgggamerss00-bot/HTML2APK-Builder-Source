package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.jc;
import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.o70;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.ub;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbm extends pb {
    private final o70 zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbm(String str, Map map, o70 o70Var) throws IOException {
        super(0, str, new i2.h(o70Var));
        this.zza = o70Var;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final ub zzh(lb lbVar) {
        return new ub(lbVar, jc.b(lbVar));
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final /* bridge */ /* synthetic */ void zzo(Object obj) throws IOException {
        lb lbVar = (lb) obj;
        this.zzb.zzf(lbVar.f6647c, lbVar.f6645a);
        byte[] bArr = lbVar.f6646b;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.a(lbVar);
    }
}
