package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ox0 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f7882a;

    /* renamed from: b, reason: collision with root package name */
    public final dx0 f7883b;

    /* renamed from: c, reason: collision with root package name */
    public final u92 f7884c;

    public ox0(hs1 hs1Var, dx0 dx0Var, u92 u92Var) {
        this.f7882a = hs1Var;
        this.f7883b = dx0Var;
        this.f7884c = u92Var;
    }

    public final xr1 a(final r30 r30Var, nx0 nx0Var, final nx0 nx0Var2, final pr1 pr1Var) {
        String str = r30Var.f8526v;
        zzv.zzq();
        boolean zZzD = zzs.zzD(str);
        hs1 hs1Var = this.f7882a;
        return bs1.k(bs1.p(bs1.p(xr1.p(zZzD ? bs1.l(new ix0(1)) : bs1.k(nx0Var.b(r30Var), ExecutionException.class, new sw0(2), hs1Var)), new lx0(), hs1Var), pr1Var, hs1Var), ix0.class, new pr1() { // from class: com.google.android.gms.internal.ads.mx0
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                return bs1.p(nx0Var2.b(r30Var), pr1Var, this.f7236a.f7882a);
            }
        }, hs1Var);
    }
}
