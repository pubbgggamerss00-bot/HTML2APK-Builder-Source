package i0;

import androidx.compose.ui.d;
import g2.g1;
import i2.e0;
import i2.g;
import java.util.ArrayList;
import java.util.List;
import t2.b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final pg.n<List<b.c<t2.u>>, List<b.c<eh.q<String, x0.j, Integer, pg.f0>>>> f13321a;

    public static final class a implements g2.l0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13322a = new a();

        /* renamed from: i0.i$a$a, reason: collision with other inner class name */
        public static final class C0120a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayList f13323a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0120a(ArrayList arrayList) {
                super(1);
                this.f13323a = arrayList;
            }

            @Override // eh.l
            public final pg.f0 invoke(g1.a aVar) {
                g1.a aVar2 = aVar;
                ArrayList arrayList = this.f13323a;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g1.a.g(aVar2, (g2.g1) arrayList.get(i10), 0, 0);
                }
                return pg.f0.f21461a;
            }
        }

        @Override // g2.l0
        public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).P(j10));
            }
            return o0Var.i0(f3.b.i(j10), f3.b.h(j10), qg.a0.f22708a, new C0120a(arrayList));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t2.b f13324a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<b.c<eh.q<String, x0.j, Integer, pg.f0>>> f13325b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f13326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t2.b bVar, List<b.c<eh.q<String, x0.j, Integer, pg.f0>>> list, int i10) {
            super(2);
            this.f13324a = bVar;
            this.f13325b = list;
            this.f13326c = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f13326c | 1);
            i.a(this.f13324a, this.f13325b, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    static {
        qg.z zVar = qg.z.f22752a;
        f13321a = new pg.n<>(zVar, zVar);
    }

    public static final void a(t2.b bVar, List<b.c<eh.q<String, x0.j, Integer, pg.f0>>> list, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-1794596951);
        int i11 = (i10 & 6) == 0 ? (kVarP.K(bVar) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(list) ? 32 : 16;
        }
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b.c<eh.q<String, x0.j, Integer, pg.f0>> cVar = list.get(i12);
                eh.q<String, x0.j, Integer, pg.f0> qVar = cVar.f27771a;
                int i13 = cVar.f27772b;
                int i14 = cVar.f27773c;
                int i15 = kVarP.P;
                x0.a2 a2VarP = kVarP.P();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar);
                } else {
                    kVarP.z();
                }
                ph.v1.j(g.a.f13867f, a.f13322a, kVarP);
                ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                g.a.C0128a c0128a = g.a.f13868g;
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, kVarP);
                qVar.b(bVar.subSequence(i13, i14).f27761b, kVarP, 0);
                kVarP.T(true);
            }
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b(bVar, list, i10);
        }
    }
}
