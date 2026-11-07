package z;

import j1.d;
import j1.f;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final q f34599a = new q(b.f34446c, d.a.f14614m);

    public static final q a(b.l lVar, f.a aVar, x0.j jVar, int i10) {
        if (kotlin.jvm.internal.r.a(lVar, b.f34446c) && aVar.equals(d.a.f14614m)) {
            jVar.L(346089448);
            jVar.B();
            return f34599a;
        }
        jVar.L(346143295);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && jVar.K(lVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && jVar.K(aVar)) || (i10 & 48) == 32);
        Object objG = jVar.g();
        if (z10 || objG == j.a.f31715a) {
            objG = new q(lVar, aVar);
            jVar.C(objG);
        }
        q qVar = (q) objG;
        jVar.B();
        return qVar;
    }
}
