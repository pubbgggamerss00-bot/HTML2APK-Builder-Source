package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8635a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8636b;

    public /* synthetic */ rh0(w92 w92Var, int i6) {
        this.f8635a = i6;
        this.f8636b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8635a) {
            case 0:
                Set setSingleton = Collections.singleton(new kn0((ki0) this.f8636b.zzb(), i70.f5592g));
                ih1.j(setSingleton);
                return setSingleton;
            case 1:
                return new kn0((hj0) this.f8636b.zzb(), i70.f5592g);
            case 2:
                cg0 cg0Var = (cg0) this.f8636b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(cg0Var, h70Var);
            case 3:
                return new kn0((uj0) this.f8636b.zzb(), i70.f5592g);
            case 4:
                return new kn0((ko0) this.f8636b.zzb(), i70.f5591f);
            case 5:
                no0 no0Var = (no0) this.f8636b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(no0Var, h70Var2);
            case 6:
                lp0 lp0Var = (lp0) this.f8636b.zzb();
                ih1.j(lp0Var);
                return lp0Var;
            case 7:
                qt0 qt0Var = (qt0) this.f8636b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new kn0(qt0Var, h70Var3);
            default:
                return new kn0((iw0) this.f8636b.zzb(), i70.f5592g);
        }
    }
}
