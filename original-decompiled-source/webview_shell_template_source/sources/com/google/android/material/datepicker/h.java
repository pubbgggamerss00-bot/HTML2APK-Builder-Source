package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements View.OnClickListener {
    public final /* synthetic */ c0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f12257t;

    public h(j jVar, c0 c0Var) {
        this.f12257t = jVar;
        this.s = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f12257t;
        int iM0 = ((LinearLayoutManager) jVar.f12267u0.getLayoutManager()).M0();
        c0 c0Var = this.s;
        c0Var.f12250k = 2;
        jVar.E(c0Var.h(iM0 + 1));
    }
}
