package j3;

import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x f15128a = new x();

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15129a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1 f15130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g1 g1Var) {
            super(1);
            this.f15130a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.g(aVar, this.f15130a, 0, 0);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15131a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.f15131a = arrayList;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            ArrayList arrayList = this.f15131a;
            int i10 = qg.p.i(arrayList);
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    g1.a.g(aVar2, (g1) arrayList.get(i11), 0, 0);
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            return pg.f0.f21461a;
        }
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        int size = list.size();
        qg.a0 a0Var = qg.a0.f22708a;
        if (size == 0) {
            return o0Var.i0(0, 0, a0Var, a.f15129a);
        }
        if (size == 1) {
            g1 g1VarP = list.get(0).P(j10);
            return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, a0Var, new b(g1VarP));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            g1 g1VarP2 = list.get(i10).P(j10);
            iMax = Math.max(iMax, g1VarP2.f11382a);
            iMax2 = Math.max(iMax2, g1VarP2.f11383b);
            arrayList.add(g1VarP2);
        }
        return o0Var.i0(iMax, iMax2, a0Var, new c(arrayList));
    }
}
