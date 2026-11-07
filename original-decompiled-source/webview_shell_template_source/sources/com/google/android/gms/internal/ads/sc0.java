package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8892a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8893b;

    public /* synthetic */ sc0(w92 w92Var, int i6) {
        this.f8892a = i6;
        this.f8893b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8892a) {
            case 0:
                return new mf((zzk) this.f8893b.zzb());
            case 1:
                return new kf0((Context) this.f8893b.zzb());
            case 2:
                return new cj0((fl0) this.f8893b.zzb());
            case 3:
                return new kn0((hj0) this.f8893b.zzb(), i70.f5592g);
            case 4:
                cg0 cg0Var = (cg0) this.f8893b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(cg0Var, h70Var);
            case 5:
                return new kn0((cj0) this.f8893b.zzb(), i70.f5592g);
            case 6:
                return new kn0((ak0) this.f8893b.zzb(), i70.f5592g);
            case 7:
                xf0 xf0Var = (xf0) this.f8893b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(xf0Var, h70Var2);
            case 8:
                String str = ((hj0) this.f8893b.zzb()).f5430t.f9726e;
                ih1.j(str);
                return str;
            case 9:
                Set setSingleton = Collections.singleton(new kn0((yj0) this.f8893b.zzb(), i70.f5592g));
                ih1.j(setSingleton);
                return setSingleton;
            case 10:
                return new kn0((ko0) this.f8893b.zzb(), i70.f5591f);
            case 11:
                Set setSingleton2 = Collections.singleton(new kn0((mo0) this.f8893b.zzb(), i70.f5592g));
                ih1.j(setSingleton2);
                return setSingleton2;
            case 12:
                yo0 yo0Var = (yo0) this.f8893b.zzb();
                ih1.j(yo0Var);
                return yo0Var;
            case 13:
                wt0 wt0Var = (wt0) this.f8893b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new kn0(wt0Var, h70Var3);
            default:
                return new ze1((dz0) this.f8893b.zzb());
        }
    }
}
