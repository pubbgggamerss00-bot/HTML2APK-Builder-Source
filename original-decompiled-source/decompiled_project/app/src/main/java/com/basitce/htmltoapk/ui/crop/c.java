package com.basitce.htmltoapk.ui.crop;

import b9.i1;
import eh.p;
import pg.f0;
import t0.s4;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class c implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CropActivity f5752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5754c;

    public c(CropActivity cropActivity, n1<Boolean> n1Var, long j10) {
        this.f5752a = cropActivity;
        this.f5753b = n1Var;
        this.f5754c = j10;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1826528700);
            CropActivity cropActivity = this.f5752a;
            boolean zL = jVar2.l(cropActivity);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new i1(cropActivity, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            s4.c((eh.a) objG, null, !this.f5753b.getValue().booleanValue(), null, f1.c.b(856042415, new b(this.f5754c), jVar2), jVar2, 196608, 26);
        }
        return f0.f21461a;
    }
}
