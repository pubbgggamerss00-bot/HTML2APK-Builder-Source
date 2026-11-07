package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class af0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2737a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2738b;

    public /* synthetic */ af0(int i6, Object obj) {
        this.f2737a = i6;
        this.f2738b = obj;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f2737a) {
            case 0:
                return new ze0(new xz0(((oc0) ((bi0) this.f2738b).f3184b).a()));
            case 1:
                ps psVar = (ps) ((ni0) this.f2738b).f7447t;
                ih1.j(psVar);
                return psVar;
            case 2:
                return (hm0) ((ni0) this.f2738b).f7448u;
            case 3:
                return ((jk0) this.f2738b).f6098d;
            case 4:
                return new ml0(((ea2) this.f2738b).zzb());
            case 5:
                xa0 xa0Var = ((bo0) this.f2738b).f3235b;
                if (xa0Var != null) {
                    return xa0Var.u();
                }
                return null;
            case 6:
                return new mp0(((qi0) this.f2738b).a());
            case 7:
                return new kn0(new jt0((xa0) ((x92) ((cd0) this.f2738b).f3521b).zzb()), i70.f5591f);
            case 8:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                pe0 pe0Var = (pe0) this.f2738b;
                Set setSingleton = ((Boolean) zzbe.zzc().a(zn.W4)).booleanValue() ? Collections.singleton(new kn0(new st0((kk) pe0Var.f8052c.zzb(), ((z92) pe0Var.f8051b).zzb()), h70Var)) : Collections.EMPTY_SET;
                ih1.j(setSingleton);
                return setSingleton;
            case 9:
                sh0 sh0Var = (sh0) this.f2738b;
                fx0 fx0Var = new fx0(((oc0) sh0Var.f8936b).a(), (b60) sh0Var.f8937c.zzb());
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(fx0Var, h70Var2);
            case 10:
                return (v31) this.f2738b;
            default:
                return Boolean.valueOf(((q91) this.f2738b).f8279a.s.getBoolean("is_gbid"));
        }
    }
}
