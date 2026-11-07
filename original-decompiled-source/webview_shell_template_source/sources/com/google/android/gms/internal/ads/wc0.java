package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10155a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f10156b;

    public /* synthetic */ wc0(w92 w92Var, int i6) {
        this.f10155a = i6;
        this.f10156b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10155a) {
            case 0:
                return new z21((mt0) this.f10156b.zzb());
            case 1:
                return new kn0((ii0) this.f10156b.zzb(), i70.f5591f);
            case 2:
                return new kn0((hj0) this.f10156b.zzb(), i70.f5592g);
            case 3:
                cg0 cg0Var = (cg0) this.f10156b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(cg0Var, h70Var);
            case 4:
                ut0 ut0Var = (ut0) this.f10156b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(ut0Var, h70Var2);
            case 5:
                Set setSingleton = Collections.singleton(new kn0((yj0) this.f10156b.zzb(), i70.f5592g));
                ih1.j(setSingleton);
                return setSingleton;
            case 6:
                Set setSingleton2 = Collections.singleton(new kn0((yj0) this.f10156b.zzb(), i70.f5592g));
                ih1.j(setSingleton2);
                return setSingleton2;
            case 7:
                return new kn0((jq0) this.f10156b.zzb(), i70.f5586a);
            case 8:
                return new kn0((en0) this.f10156b.zzb(), i70.f5592g);
            case 9:
                return new ju0((i3.a) this.f10156b.zzb());
            case 10:
                Context context = (Context) this.f10156b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new yw0(context, h70Var3);
            case 11:
                ly0 ly0Var = (ly0) this.f10156b.zzb();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new kn0(ly0Var, h70Var4);
            default:
                return new kn0((uc1) this.f10156b.zzb(), i70.f5592g);
        }
    }
}
