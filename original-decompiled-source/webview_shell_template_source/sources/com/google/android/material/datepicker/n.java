package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f12284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f12285b;

    public n(j jVar, c0 c0Var) {
        this.f12285b = jVar;
        this.f12284a = c0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView recyclerView, int i6) {
        j jVar;
        androidx.recyclerview.widget.u uVar;
        RecyclerView recyclerView2;
        if (i6 != 0 || (uVar = (jVar = this.f12285b).B0) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar.f12267u0.getLayoutManager();
        View viewE = linearLayoutManager.e() ? androidx.recyclerview.widget.u.e(linearLayoutManager, uVar.g(linearLayoutManager)) : linearLayoutManager.d() ? androidx.recyclerview.widget.u.e(linearLayoutManager, uVar.f(linearLayoutManager)) : null;
        if (viewE != null) {
            RecyclerView.b0 b0VarM = RecyclerView.M(viewE);
            int iJ = (b0VarM == null || (recyclerView2 = b0VarM.f1457r) == null) ? -1 : recyclerView2.J(b0VarM);
            if (iJ != -1) {
                c0 c0Var = this.f12284a;
                jVar.f12263q0 = c0Var.h(iJ);
                jVar.f12272z0.setText(c0Var.h(iJ).n());
                jVar.I(iJ);
            }
        }
        jVar.H();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(RecyclerView recyclerView, int i6, int i7) {
        j jVar = this.f12285b;
        int iM0 = i6 < 0 ? ((LinearLayoutManager) jVar.f12267u0.getLayoutManager()).M0() : ((LinearLayoutManager) jVar.f12267u0.getLayoutManager()).N0();
        androidx.recyclerview.widget.u uVar = jVar.B0;
        c0 c0Var = this.f12284a;
        if (uVar == null) {
            jVar.f12263q0 = c0Var.h(iM0);
        }
        jVar.f12272z0.setText(c0Var.h(iM0).n());
        jVar.I(iM0);
    }
}
