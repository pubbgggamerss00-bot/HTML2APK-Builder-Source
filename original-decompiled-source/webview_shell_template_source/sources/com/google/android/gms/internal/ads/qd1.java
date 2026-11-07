package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qd1 {

    /* renamed from: a, reason: collision with root package name */
    public final ld1 f8355a;

    /* renamed from: b, reason: collision with root package name */
    public final oq1 f8356b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8357c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8358d = false;

    public qd1(final xc1 xc1Var, final l2 l2Var, final ld1 ld1Var) {
        this.f8355a = ld1Var;
        ma1 ma1Var = (ma1) ld1Var;
        this.f8356b = bs1.k(bs1.p(((ka1) l2Var.f6565t).a(ma1Var.f7033b, ma1Var.f7032a, null), new pr1() { // from class: com.google.android.gms.internal.ads.pd1
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                qd1 qd1Var = this.f8037a;
                l2 l2Var2 = l2Var;
                xc1 xc1Var2 = xc1Var;
                ld1 ld1Var2 = ld1Var;
                ed1 ed1Var = (ed1) obj;
                synchronized (qd1Var) {
                    try {
                        qd1Var.f8358d = true;
                        ed1Var.f4234a = ((ka1) l2Var2.f6565t).s;
                        if (qd1Var.f8357c) {
                            return bs1.m(new kd1(ed1Var, ld1Var2));
                        }
                        xc1Var2.a(ld1Var2.zza(), ed1Var);
                        return ds1.f4001t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, ld1Var.zzb()), Exception.class, new l50(this, l2Var), ld1Var.zzb());
    }

    public final synchronized oq1 a(ma1 ma1Var) {
        if (!this.f8358d && !this.f8357c && this.f8355a.zza() != null && ma1Var.f7038g != null && this.f8355a.zza().equals(ma1Var.f7038g)) {
            this.f8357c = true;
            return this.f8356b;
        }
        return null;
    }
}
