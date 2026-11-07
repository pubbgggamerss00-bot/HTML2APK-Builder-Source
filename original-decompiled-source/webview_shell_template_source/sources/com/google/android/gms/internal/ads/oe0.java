package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oe0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7736a;

    public /* synthetic */ oe0(int i6) {
        this.f7736a = i6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7736a) {
            case 0:
                return zzv.zzo();
            case 1:
                return new hm0();
            case 2:
                Set set = Collections.EMPTY_SET;
                ih1.j(set);
                return set;
            case 3:
                return new ms0();
            case 4:
                return new rt0(17, 18, 1006);
            case 5:
                return new du0(yd1.P, "t_load_as");
            case 6:
                return new gv0();
            case 7:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new a41(h70Var);
            case 8:
                h70 h70Var2 = i70.f5591f;
                ih1.j(h70Var2);
                return h70Var2;
            default:
                ns1 ns1Var = i70.f5590e;
                ih1.j(ns1Var);
                return ns1Var;
        }
    }

    public oe0(rm0 rm0Var) {
        this.f7736a = 2;
    }
}
