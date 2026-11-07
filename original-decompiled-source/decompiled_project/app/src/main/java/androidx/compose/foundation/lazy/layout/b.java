package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.c0;
import d0.d1;
import d0.e1;
import d0.h2;
import d0.i0;
import d0.i2;
import d0.l0;
import d0.n0;
import d0.q0;
import eh.l;
import eh.p;
import eh.q;
import g1.d;
import g2.m0;
import g2.p1;
import g2.s1;
import kotlin.jvm.internal.s;
import pg.f0;
import x0.j;
import x0.n1;
import x0.o0;

/* loaded from: classes.dex */
public final class b extends s implements q<d, j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f1016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f1017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<q0, f3.b, m0> f1018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f1019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d1 d1Var, androidx.compose.ui.d dVar, p pVar, n1 n1Var) {
        super(3);
        this.f1016a = d1Var;
        this.f1017b = dVar;
        this.f1018c = pVar;
        this.f1019d = n1Var;
    }

    @Override // eh.q
    public final f0 b(d dVar, j jVar, Integer num) {
        androidx.compose.ui.d dVarH;
        d dVar2 = dVar;
        j jVar2 = jVar;
        num.intValue();
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = new c0(dVar2, new n0(this.f1019d));
            jVar2.C(objG);
        }
        c0 c0Var = (c0) objG;
        Object objG2 = jVar2.g();
        if (objG2 == c0321a) {
            objG2 = new s1(new i0(c0Var));
            jVar2.C(objG2);
        }
        s1 s1Var = (s1) objG2;
        d1 d1Var = this.f1016a;
        if (d1Var != null) {
            jVar2.L(204281539);
            h2 h2Var = d1Var.f7084a;
            if (h2Var == null) {
                jVar2.L(6591363);
                h2Var = i2.f7153a;
                if (h2Var != null) {
                    jVar2.L(1213893039);
                    jVar2.B();
                } else {
                    jVar2.L(1213931944);
                    View view = (View) jVar2.f(AndroidCompositionLocals_androidKt.f1285f);
                    boolean zK = jVar2.K(view);
                    Object objG3 = jVar2.g();
                    if (zK || objG3 == c0321a) {
                        objG3 = new d0.a(view);
                        jVar2.C(objG3);
                    }
                    jVar2.B();
                    h2Var = (d0.a) objG3;
                }
            } else {
                jVar2.L(6590278);
            }
            jVar2.B();
            Object[] objArr = {d1Var, c0Var, s1Var, h2Var};
            boolean zK2 = jVar2.K(d1Var) | jVar2.l(c0Var) | jVar2.l(s1Var) | jVar2.l(h2Var);
            Object objG4 = jVar2.g();
            if (zK2 || objG4 == c0321a) {
                objG4 = new l0(d1Var, c0Var, s1Var, h2Var);
                jVar2.C(objG4);
            }
            o0.c(objArr, (l) objG4, jVar2);
            jVar2.B();
        } else {
            jVar2.L(204710145);
            jVar2.B();
        }
        int i10 = e1.f7097b;
        androidx.compose.ui.d dVar3 = this.f1017b;
        if (d1Var != null && (dVarH = dVar3.h(new TraversablePrefetchStateModifierElement(d1Var))) != null) {
            dVar3 = dVarH;
        }
        boolean zK3 = jVar2.K(c0Var);
        p<q0, f3.b, m0> pVar = this.f1018c;
        boolean zK4 = zK3 | jVar2.K(pVar);
        Object objG5 = jVar2.g();
        if (zK4 || objG5 == c0321a) {
            objG5 = new d0.m0(c0Var, pVar);
            jVar2.C(objG5);
        }
        p1.b(s1Var, dVar3, (p) objG5, jVar2, 8);
        return f0.f21461a;
    }
}
