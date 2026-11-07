package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9525a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f9526b;

    public /* synthetic */ uc0(w92 w92Var, int i6) {
        this.f9525a = i6;
        this.f9526b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        int i6 = this.f9525a;
        w92 w92Var = this.f9526b;
        switch (i6) {
            case 0:
                gv0 gv0Var = (gv0) w92Var.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                Set setSingleton = ((Boolean) zzbe.zzc().a(zn.L1)).booleanValue() ? Collections.singleton(new kn0(gv0Var, h70Var)) : Collections.EMPTY_SET;
                ih1.j(setSingleton);
                return setSingleton;
            case 1:
                es0 es0Var = (es0) w92Var.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new sc1(es0Var, h70Var2);
            case 2:
                tl0 tl0Var = (tl0) w92Var.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new kn0(tl0Var, h70Var3);
            case 3:
                return new kn0((hj0) w92Var.zzb(), i70.f5592g);
            case 4:
                cg0 cg0Var = (cg0) w92Var.zzb();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new kn0(cg0Var, h70Var4);
            case 5:
                ut0 ut0Var = (ut0) w92Var.zzb();
                h70 h70Var5 = i70.f5586a;
                ih1.j(h70Var5);
                return new kn0(ut0Var, h70Var5);
            case 6:
                ij0 ij0Var = (ij0) w92Var.zzb();
                h70 h70Var6 = i70.f5586a;
                ih1.j(h70Var6);
                kn0 kn0Var = new kn0(ij0Var, h70Var6);
                int i7 = go1.f5097u;
                return new rp1(kn0Var);
            case 7:
                return new kn0((ce1) w92Var.zzb(), i70.f5592g);
            case 8:
                return new kn0((ps0) w92Var.zzb(), i70.f5592g);
            case 9:
                k41 k41Var = (k41) w92Var.zzb();
                h70 h70Var7 = i70.f5586a;
                ih1.j(h70Var7);
                return new kn0(k41Var, h70Var7);
            default:
                return new fc1((mf) w92Var.zzb());
        }
    }
}
