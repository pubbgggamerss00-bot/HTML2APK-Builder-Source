package w8;

import e9.i;
import eh.p;
import p5.x;
import pg.f0;
import t0.s4;
import x0.j;

/* loaded from: classes.dex */
public final class f implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f31448a;

    public f(x xVar) {
        this.f31448a = xVar;
    }

    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1727759271);
            x xVar = this.f31448a;
            boolean zL = jVar2.l(xVar);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new i(xVar, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            s4.c((eh.a) objG, null, false, null, a.f31429b, jVar2, 196608, 30);
        }
        return f0.f21461a;
    }
}
