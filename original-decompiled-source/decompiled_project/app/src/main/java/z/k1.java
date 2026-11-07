package z;

import j1.d;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f34578a = new m1(b.f34444a, d.a.f14611j);

    public static final m1 a(b.e eVar, d.c cVar, x0.j jVar, int i10) {
        if (kotlin.jvm.internal.r.a(eVar, b.f34444a) && kotlin.jvm.internal.r.a(cVar, d.a.f14611j)) {
            jVar.L(-848964613);
            jVar.B();
            return f34578a;
        }
        jVar.L(-848913742);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && jVar.K(eVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && jVar.K(cVar)) || (i10 & 48) == 32);
        Object objG = jVar.g();
        if (z10 || objG == j.a.f31715a) {
            objG = new m1(eVar, cVar);
            jVar.C(objG);
        }
        m1 m1Var = (m1) objG;
        jVar.B();
        return m1Var;
    }
}
