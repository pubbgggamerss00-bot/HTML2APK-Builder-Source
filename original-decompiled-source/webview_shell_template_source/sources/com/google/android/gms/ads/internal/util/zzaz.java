package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.bc;
import com.google.android.gms.internal.ads.cc;
import com.google.android.gms.internal.ads.ic;
import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.mc;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.pj1;
import com.google.android.gms.internal.ads.qv;
import com.google.android.gms.internal.ads.sb;
import com.google.android.gms.internal.ads.zn;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzaz extends cc {
    private final Context zzb;

    private zzaz(Context context, bc bcVar) {
        super(bcVar);
        this.zzb = context;
    }

    public static sb zzb(Context context) {
        zzaz zzazVar = new zzaz(context, new mc());
        File cacheDir = context.getCacheDir();
        int i6 = pj1.f8098a;
        sb sbVar = new sb(new ic(new File(new File(cacheDir, "admob_volley").getPath())), zzazVar);
        sbVar.c();
        return sbVar;
    }

    @Override // com.google.android.gms.internal.ads.cc, com.google.android.gms.internal.ads.ib
    public final lb zza(pb pbVar) {
        if (pbVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11507x4), pbVar.zzk())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzs(context, 13400000)) {
                    lb lbVarZza = new qv(this.zzb).zza(pbVar);
                    if (lbVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(pbVar.zzk())));
                        return lbVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(pbVar.zzk())));
                }
            }
        }
        return super.zza(pbVar);
    }
}
