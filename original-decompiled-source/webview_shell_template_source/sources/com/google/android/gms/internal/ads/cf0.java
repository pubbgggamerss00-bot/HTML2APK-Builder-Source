package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cf0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3551a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f3552b;

    public /* synthetic */ cf0(int i6, Object obj) {
        this.f3551a = i6;
        this.f3552b = (ga2) obj;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f3551a) {
            case 0:
                return new bf0((sv0) this.f3552b.zzb());
            case 1:
                return new hf0((sb1) this.f3552b.zzb());
            case 2:
                return new kn0((oj0) this.f3552b.zzb(), i70.f5592g);
            case 3:
                qt0 qt0Var = (qt0) this.f3552b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(qt0Var, h70Var);
            case 4:
                wt0 wt0Var = (wt0) this.f3552b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(wt0Var, h70Var2);
            case 5:
                ku0 ku0Var = (ku0) this.f3552b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                Set setI = bq.i(ku0Var, h70Var3);
                ih1.j(setI);
                return setI;
            case 6:
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new i71(h70Var4, (sv0) this.f3552b.zzb());
            case 7:
                return new n81((cb1) this.f3552b.zzb());
            default:
                return new hb1((vc1) this.f3552b.zzb());
        }
    }
}
