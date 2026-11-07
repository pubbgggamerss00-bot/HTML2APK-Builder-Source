package u;

import i0.q0;
import pg.f0;
import x0.h2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final h1.u<eh.q<g, x0.j, Integer, f0>> f28897a = new h1.u<>();

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f28899b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, int i10) {
            super(2);
            this.f28899b = gVar;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(1);
            m.this.a(this.f28899b, jVar, iN);
            return f0.f21461a;
        }
    }

    public static void b(m mVar, q0 q0Var, eh.a aVar) {
        mVar.f28897a.add(new f1.b(262103052, true, new n(q0Var, aVar)));
    }

    public final void a(g gVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(1320309496);
        int i11 = (kVarP.K(gVar) ? 4 : 2) | i10 | (kVarP.K(this) ? 32 : 16);
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            h1.u<eh.q<g, x0.j, Integer, f0>> uVar = this.f28897a;
            int size = uVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                uVar.get(i12).b(gVar, kVarP, Integer.valueOf(i11 & 14));
            }
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a(gVar, i10);
        }
    }
}
