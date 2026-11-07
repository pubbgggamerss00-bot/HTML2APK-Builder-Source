package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ad0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2654a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2655b;

    public /* synthetic */ ad0(int i6, Object obj) {
        this.f2654a = i6;
        this.f2655b = obj;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f2654a) {
            case 0:
                kc0 kc0Var = (kc0) this.f2655b;
                String strZzc = zzv.zzq().zzc(kc0Var.f6321b, kc0Var.f6320a.afmaVersion);
                ih1.j(strZzc);
                return strZzc;
            case 1:
                vh0 vh0Var = (vh0) this.f2655b;
                return new kn0(new uh0(((nh0) vh0Var.f9868c).f7444b.f6734d, (cu0) vh0Var.f9867b.zzb(), ((qi0) vh0Var.f9869d).a()), i70.f5586a);
            case 2:
                return ((rm0) this.f2655b).f8662g;
            case 3:
                return (ro0) this.f2655b;
            case 4:
                return new ap0(((qc0) this.f2655b).a());
            case 5:
                ap0 ap0Var = new ap0(((qc0) ((ad0) this.f2655b).f2655b).a());
                hp0 hp0Var = new hp0();
                hp0Var.f5451a = ap0Var;
                return hp0Var;
            case 6:
                return ((mq0) this.f2655b).f7210b;
            case 7:
                return new k51((Set) ((ca2) this.f2655b).zzb());
            default:
                return Integer.valueOf(((q91) this.f2655b).f8280b);
        }
    }
}
