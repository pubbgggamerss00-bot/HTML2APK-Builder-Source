package q5;

import java.util.Iterator;
import java.util.List;
import p5.b1;
import p5.u0;

@b1.a("dialog")
/* loaded from: classes.dex */
public final class o extends b1<a> {

    public static final class a extends p5.k0 implements p5.i {

        /* renamed from: f, reason: collision with root package name */
        public final j3.d0 f22028f;

        /* renamed from: g, reason: collision with root package name */
        public final f1.b f22029g;

        public a() {
            throw null;
        }

        public a(o oVar) {
            f1.b bVar = c.f21937a;
            j3.d0 d0Var = new j3.d0(7);
            super(oVar);
            this.f22028f = d0Var;
            this.f22029g = bVar;
        }
    }

    @Override // p5.b1
    public final p5.k0 a() {
        f1.b bVar = c.f21937a;
        return new a(this);
    }

    @Override // p5.b1
    public final void d(List list, u0 u0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().j((p5.s) it.next());
        }
    }

    @Override // p5.b1
    public final void e(p5.s sVar, boolean z10) {
        b().h(sVar, z10);
        int iF = qg.x.F((Iterable) ((sh.l0) b().f21205f).f25021a.getValue(), sVar);
        int i10 = 0;
        for (Object obj : (Iterable) ((sh.l0) b().f21205f).f25021a.getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                qg.p.o();
                throw null;
            }
            p5.s sVar2 = (p5.s) obj;
            if (i10 > iF) {
                b().f(sVar2);
            }
            i10 = i11;
        }
    }
}
