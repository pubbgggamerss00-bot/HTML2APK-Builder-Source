package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ak0 implements jl0, bl0 {
    public final tb1 s;

    public ak0(tb1 tb1Var) {
        this.s = tb1Var;
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        tb1 tb1Var = this.s;
        y10 y10Var = tb1Var.f9178d0;
        if (y10Var == null || !y10Var.f10777a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (tb1Var.f9178d0.f10778b.isEmpty()) {
            return;
        }
        arrayList.add(tb1Var.f9178d0.f10778b);
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void a(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void e(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void i(Context context) {
    }
}
