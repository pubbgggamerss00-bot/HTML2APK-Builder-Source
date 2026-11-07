package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ee0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4243a;

    public /* synthetic */ ee0(int i6) {
        this.f4243a = i6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f4243a) {
            case 0:
                return new d0(14);
            case 1:
                return new ln();
            case 2:
                return new bm0();
            case 3:
                Set set = Collections.EMPTY_SET;
                ih1.j(set);
                return set;
            case 4:
                return new rt0(15, 16, 1005);
            case 5:
                return new du0(yd1.f10926t, "ttc");
            case 6:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new u91(h70Var);
            case 7:
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return h70Var2;
            default:
                return new rd1();
        }
    }

    public /* synthetic */ ee0(boolean z6) {
        this.f4243a = 3;
    }
}
