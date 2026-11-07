package com.basitce.htmltoapk;

import eh.p;
import pg.f0;
import q8.x1;
import x0.j;
import x0.r3;
import x0.y;

/* loaded from: classes.dex */
public final class b implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f5659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f5660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f5661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3<Integer> f5662d;

    public b(r3<Boolean> r3Var, r3<Boolean> r3Var2, MainActivity mainActivity, r3<Integer> r3Var3) {
        this.f5659a = r3Var;
        this.f5660b = r3Var2;
        this.f5661c = mainActivity;
        this.f5662d = r3Var3;
    }

    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            Boolean value = this.f5659a.getValue();
            r3<Boolean> r3Var = this.f5660b;
            if (r3Var.getValue() != null && value != null) {
                y.a(x1.f22493a.a(value), f1.c.b(1289210900, new a(this.f5661c, r3Var, this.f5662d), jVar2), jVar2, 56);
            }
        }
        return f0.f21461a;
    }
}
