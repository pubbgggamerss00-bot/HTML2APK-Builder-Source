package u8;

import t0.he;
import x0.j;
import x0.l1;

/* loaded from: classes.dex */
public final class g0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f29461a;

    public g0(l1 l1Var) {
        this.f29461a = l1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            final int i10 = 0;
            for (Object obj : qg.p.j("🐱", "🧑\u200d🌾", "🏠", "📜", "💎")) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    qg.p.o();
                    throw null;
                }
                String str = (String) obj;
                final l1 l1Var = this.f29461a;
                boolean z10 = l1Var.g() == i10;
                jVar2.L(1781973806);
                boolean zI = jVar2.i(i10);
                Object objG = jVar2.g();
                if (zI || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: u8.e0
                        @Override // eh.a
                        public final Object invoke() {
                            l1Var.f(i10);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                he.b(z10, (eh.a) objG, null, false, f1.c.b(1305571635, new f0(str), jVar2), null, 0L, 0L, jVar2, 24576, 492);
                i10 = i11;
            }
        }
        return pg.f0.f21461a;
    }
}
