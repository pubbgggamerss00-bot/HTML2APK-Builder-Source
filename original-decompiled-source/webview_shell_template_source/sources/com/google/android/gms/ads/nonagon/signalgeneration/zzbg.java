package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.ae1;
import com.google.android.gms.internal.ads.as1;
import com.google.android.gms.internal.ads.bs1;
import com.google.android.gms.internal.ads.dk0;
import com.google.android.gms.internal.ads.ek0;
import com.google.android.gms.internal.ads.ga2;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.lk0;
import com.google.android.gms.internal.ads.p60;
import com.google.android.gms.internal.ads.un0;
import com.google.android.gms.internal.ads.vd1;
import com.google.android.gms.internal.ads.wd1;
import com.google.android.gms.internal.ads.x92;
import com.google.android.gms.internal.ads.xj0;
import com.google.android.gms.internal.ads.yd1;
import com.google.android.gms.internal.ads.zn;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbg implements x92 {
    private final ga2 zza;
    private final ga2 zzb;
    private final ga2 zzc;
    private final ga2 zzd;
    private final ga2 zze;
    private final ga2 zzf;
    private final ga2 zzg;
    private final ga2 zzh;
    private final ga2 zzi;

    public zzbg(ga2 ga2Var, ga2 ga2Var2, ga2 ga2Var3, ga2 ga2Var4, ga2 ga2Var5, ga2 ga2Var6, ga2 ga2Var7, ga2 ga2Var8, ga2 ga2Var9) {
        this.zza = ga2Var;
        this.zzb = ga2Var2;
        this.zzc = ga2Var3;
        this.zzd = ga2Var4;
        this.zze = ga2Var5;
        this.zzf = ga2Var6;
        this.zzg = ga2Var7;
        this.zzh = ga2Var8;
        this.zzi = ga2Var9;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() throws JSONException {
        zzau zzauVar = (zzau) this.zza.zzb();
        ae1 ae1Var = (ae1) this.zzb.zzb();
        zzbi zzbiVarZzb = ((zzbj) this.zzc).zzb();
        dk0 dk0VarZzb = ((ek0) this.zzd).zzb();
        un0 un0Var = (un0) this.zze.zzb();
        zzb zzbVar = (zzb) this.zzf.zzb();
        p60 p60Var = (p60) this.zzg.zzb();
        int iIntValue = ((Integer) this.zzh.zzb()).intValue();
        Bundle bundle = ((lk0) this.zzi).a().s;
        zzbk zzbkVarZza = null;
        if (iIntValue == 1 && p60Var != null) {
            androidx.camera.camera2.internal.compat.workaround.c.f("read-from-disk-start", bundle);
            zzbkVarZza = zzbVar.zza(p60Var, zzauVar, bundle);
            androidx.camera.camera2.internal.compat.workaround.c.f("read-from-disk-end", bundle);
        }
        if (zzbkVarZza != null) {
            synchronized (un0Var) {
                un0Var.o0(new xj0(9, zzbkVarZza));
            }
            return bs1.m(zzbkVarZza);
        }
        wd1 wd1VarC = ae1Var.a(dk0VarZzb.b(), yd1.L).c(zzbiVarZzb);
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11514y5)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vd1 vd1VarA = wd1VarC.d(jIntValue).a();
        vd1VarA.addListener(new as1(0, vd1VarA, new d(un0Var)), i70.f5586a);
        return vd1VarA;
    }
}
