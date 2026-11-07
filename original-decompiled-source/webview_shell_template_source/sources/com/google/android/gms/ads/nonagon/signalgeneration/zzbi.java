package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Binder;
import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.bs1;
import com.google.android.gms.internal.ads.ix0;
import com.google.android.gms.internal.ads.jx0;
import com.google.android.gms.internal.ads.pr1;
import com.google.android.gms.internal.ads.qw0;
import com.google.android.gms.internal.ads.r30;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.xr1;
import com.google.android.gms.internal.ads.zn;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbi implements pr1 {
    private final Executor zza;
    private final qw0 zzb;

    public zzbi(Executor executor, qw0 qw0Var) {
        this.zza = executor;
        this.zzb = qw0Var;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        c5.a aVarU;
        final qw0 qw0Var = this.zzb;
        final r30 r30Var = (r30) obj;
        qw0Var.getClass();
        String str = r30Var.f8526v;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(str)) {
            aVarU = bs1.l(new ix0(1));
        } else {
            aVarU = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.n7)).booleanValue() ? qw0Var.f8469c.u(new vg(1, qw0Var, r30Var)) : qw0Var.f8470d.c(r30Var);
        }
        final int callingUid = Binder.getCallingUid();
        return bs1.p(bs1.k((xr1) bs1.q(xr1.p(aVarU), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11514y5)).intValue(), TimeUnit.SECONDS, qw0Var.f8467a), Throwable.class, new pr1() { // from class: com.google.android.gms.internal.ads.pw0
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj2) {
                qw0 qw0Var2 = qw0Var;
                r30 r30Var2 = r30Var;
                if (r30Var2 != null) {
                    qw0Var2.getClass();
                    Bundle bundle = r30Var2.E;
                    if (bundle != null) {
                        bundle.putBoolean("ls", true);
                    }
                }
                return bs1.p(((yx0) qw0Var2.f8471e.zzb()).f2(r30Var2, callingUid), new ow0(r30Var2, 0), qw0Var2.f8468b);
            }
        }, qw0Var.f8468b), new pr1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj2) {
                jx0 jx0Var = (jx0) obj2;
                zzbk zzbkVar = new zzbk(new JsonReader(new InputStreamReader(jx0Var.f6186a)), jx0Var.f6187b);
                r30 r30Var2 = r30Var;
                try {
                    zzbkVar.zzb = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(r30Var2.s).toString();
                } catch (JSONException unused) {
                    zzbkVar.zzb = "{}";
                }
                if (!r30Var2.F.isEmpty()) {
                    try {
                        zzbkVar.zzc = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(r30Var2.F).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return bs1.m(zzbkVar);
            }
        }, this.zza);
    }
}
