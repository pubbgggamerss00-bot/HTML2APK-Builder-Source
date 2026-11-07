package com.google.android.gms.common.api.internal;

import android.graphics.Canvas;
import f9.x8;
import j2.j2;
import java.util.ArrayList;
import x0.e2;
import x0.j;
import x8.n8;
import x8.o8;
import x8.p8;
import x8.q8;
import x8.s8;
import x8.t8;

/* loaded from: classes2.dex */
public final class a implements s {
    public static final q1.b0 a(q1.e0 e0Var) {
        Canvas canvas = q1.c0.f21657a;
        q1.b0 b0Var = new q1.b0();
        b0Var.f21645a = new Canvas(q1.f0.a(e0Var));
        return b0Var;
    }

    public static final n8 b(c0.w0 grid, ArrayList arrayList, eh.l onMove, eh.l onFinish, eh.l lVar, eh.p pVar, x0.j jVar) {
        n8 n8Var;
        kotlin.jvm.internal.r.e(grid, "grid");
        kotlin.jvm.internal.r.e(onMove, "onMove");
        kotlin.jvm.internal.r.e(onFinish, "onFinish");
        jVar.L(-2112240950);
        x0.n1 n1VarK = bg.b.k(arrayList, jVar);
        x0.n1 n1VarK2 = bg.b.k(onMove, jVar);
        x0.n1 n1VarK3 = bg.b.k(onFinish, jVar);
        x0.n1 n1VarK4 = bg.b.k(lVar, jVar);
        x0.n1 n1VarK5 = bg.b.k(pVar, jVar);
        jVar.L(-1591306689);
        boolean zK = jVar.K(grid);
        Object objG = jVar.g();
        Object obj = j.a.f31715a;
        if (zK || objG == obj) {
            Object n8Var2 = new n8(grid, new o8(n1VarK), new x8(n1VarK2, 2), new p8(n1VarK3), new x8.w(n1VarK4, 1), new q8(n1VarK5));
            jVar.C(n8Var2);
            objG = n8Var2;
        }
        n8 n8Var3 = (n8) objG;
        jVar.B();
        Long lG = n8Var3.g();
        jVar.L(-1591297570);
        boolean zK2 = jVar.K(n8Var3);
        Object objG2 = jVar.g();
        if (zK2 || objG2 == obj) {
            objG2 = new s8(n8Var3, null);
            jVar.C(objG2);
        }
        jVar.B();
        x0.o0.d((eh.p) objG2, lG, jVar);
        e2 e2Var = j2.f14779h;
        float fN0 = ((f3.d) jVar.f(e2Var)).N0(64);
        float fN02 = ((f3.d) jVar.f(e2Var)).N0(600);
        Long lF = n8Var3.f();
        jVar.L(-1591290043);
        boolean zK3 = jVar.K(n8Var3) | jVar.h(fN0) | jVar.h(fN02) | jVar.K(grid);
        Object objG3 = jVar.g();
        if (zK3 || objG3 == obj) {
            n8Var = n8Var3;
            Object t8Var = new t8(n8Var, fN0, fN02, grid, null);
            jVar.C(t8Var);
            objG3 = t8Var;
        } else {
            n8Var = n8Var3;
        }
        jVar.B();
        x0.o0.d((eh.p) objG3, lF, jVar);
        jVar.B();
        return n8Var;
    }
}
