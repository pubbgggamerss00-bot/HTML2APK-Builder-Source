package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jt0 implements bl0 {
    public final xa0 s;

    public jt0(xa0 xa0Var) {
        this.s = xa0Var;
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void a(Context context) {
        xa0 xa0Var = this.s;
        if (xa0Var != null) {
            xa0Var.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void e(Context context) {
        xa0 xa0Var = this.s;
        if (xa0Var != null) {
            xa0Var.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void i(Context context) {
        xa0 xa0Var = this.s;
        if (xa0Var != null) {
            xa0Var.onResume();
        }
    }
}
