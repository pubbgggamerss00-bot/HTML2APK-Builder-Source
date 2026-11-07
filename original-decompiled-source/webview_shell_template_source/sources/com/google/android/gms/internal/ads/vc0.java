package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9806a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f9807b;

    public vc0(lh0 lh0Var, w92 w92Var) {
        this.f9806a = 1;
        this.f9807b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        int i6 = this.f9806a;
        w92 w92Var = this.f9807b;
        switch (i6) {
            case 0:
                return new r11((mt0) w92Var.zzb());
            case 1:
                Set setSingleton = Collections.singleton(new kn0((ki0) w92Var.zzb(), i70.f5592g));
                ih1.j(setSingleton);
                return setSingleton;
            case 2:
                return new kn0((hj0) w92Var.zzb(), i70.f5592g);
            case 3:
                kn0 kn0Var = new kn0((kj0) w92Var.zzb(), i70.f5592g);
                int i7 = go1.f5097u;
                return new rp1(kn0Var);
            case 4:
                cg0 cg0Var = (cg0) w92Var.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(cg0Var, h70Var);
            case 5:
                ut0 ut0Var = (ut0) w92Var.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(ut0Var, h70Var2);
            case 6:
                return new mo0((dl0) w92Var.zzb());
            case 7:
                fu0 fu0Var = (fu0) w92Var.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new cu0(fu0Var, h70Var3);
            default:
                return new mf1((cu0) w92Var.zzb());
        }
    }

    public /* synthetic */ vc0(w92 w92Var, int i6) {
        this.f9806a = i6;
        this.f9807b = w92Var;
    }
}
