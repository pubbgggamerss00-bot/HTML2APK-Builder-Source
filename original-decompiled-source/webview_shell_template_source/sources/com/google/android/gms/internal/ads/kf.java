package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kf extends jf {
    public static kf m(Context context, hf hfVar) {
        synchronized (jf.class) {
            try {
                if (!jf.R) {
                    jf.S = System.currentTimeMillis() / 1000;
                    gf.M = jf.h(context, hfVar.f5373t);
                    if (((Boolean) zzbe.zzc().a(zn.f11499w3)).booleanValue()) {
                        jf.T = sf.a(context);
                    }
                    ExecutorService executorService = gf.M.f3898b;
                    if (((Boolean) zzbe.zzc().a(zn.f11506x3)).booleanValue() && executorService != null) {
                        jf.U = mg.a(context, executorService);
                    }
                    if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
                        jf.V = new eg();
                    }
                    if (((Boolean) zzbe.zzc().a(zn.R2)).booleanValue() || ((gd) hfVar.f5374u).G()) {
                        jf.X = new pf(context, executorService);
                    }
                    if (((Boolean) zzbe.zzc().a(zn.N2)).booleanValue() || ((gd) hfVar.f5374u).F()) {
                        jf.W = new se(context, executorService, (gd) hfVar.f5374u, jf.X);
                    }
                    jf.R = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new kf(context, hfVar);
    }

    @Override // com.google.android.gms.internal.ads.jf
    public final ArrayList j(dg dgVar, Context context, kd kdVar) {
        if (dgVar.f3898b == null || !this.N.f5373t) {
            return super.j(dgVar, context, kdVar);
        }
        int iA = dgVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.j(dgVar, context, kdVar));
        arrayList.add(new ug(dgVar, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", kdVar, iA, 24));
        return arrayList;
    }
}
