package com.google.android.material.datepicker;

import android.view.View;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u implements u0.r {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f12289t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12290u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f12291v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12292w;

    public u(View view, int i6, int i7, int i8, int i9) {
        this.s = i6;
        this.f12289t = view;
        this.f12290u = i7;
        this.f12291v = i8;
        this.f12292w = i9;
    }

    @Override // u0.r
    public final s0 d(View view, s0 s0Var) {
        m0.b bVarF = s0Var.f14553a.f(519);
        View view2 = this.f12289t;
        int i6 = this.s;
        if (i6 >= 0) {
            view2.getLayoutParams().height = i6 + bVarF.f13855b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f12290u + bVarF.f13854a, this.f12291v + bVarF.f13855b, this.f12292w + bVarF.f13856c, view2.getPaddingBottom());
        return s0Var;
    }
}
