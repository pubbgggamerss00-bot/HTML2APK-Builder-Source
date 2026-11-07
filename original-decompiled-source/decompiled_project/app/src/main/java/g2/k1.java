package g2;

import g2.g1;
import i2.e0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k1 extends e0.e {

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f11401b = new k1("Undefined intrinsics block and it is required");

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11402a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1 f11403a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g1 g1Var) {
            super(1);
            this.f11403a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.h(aVar, this.f11403a, 0, 0);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f11404a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.f11404a = arrayList;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            ArrayList arrayList = this.f11404a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g1.a.h(aVar2, (g1) arrayList.get(i10), 0, 0);
            }
            return pg.f0.f21461a;
        }
    }

    @Override // g2.l0
    public final m0 h(o0 o0Var, List<? extends k0> list, long j10) {
        int size = list.size();
        qg.a0 a0Var = qg.a0.f22708a;
        if (size == 0) {
            return o0Var.i0(f3.b.k(j10), f3.b.j(j10), a0Var, a.f11402a);
        }
        if (size == 1) {
            g1 g1VarP = list.get(0).P(j10);
            return o0Var.i0(f3.c.g(g1VarP.f11382a, j10), f3.c.f(g1VarP.f11383b, j10), a0Var, new b(g1VarP));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            g1 g1VarP2 = list.get(i10).P(j10);
            iMax = Math.max(g1VarP2.f11382a, iMax);
            iMax2 = Math.max(g1VarP2.f11383b, iMax2);
            arrayList.add(g1VarP2);
        }
        return o0Var.i0(f3.c.g(iMax, j10), f3.c.f(iMax2, j10), a0Var, new c(arrayList));
    }
}
