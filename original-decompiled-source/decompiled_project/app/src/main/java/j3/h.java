package j3;

import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f15079a = new h();

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f15080a = arrayList;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            ArrayList arrayList = this.f15080a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g1.a.g(aVar2, (g1) arrayList.get(i10), 0, 0);
            }
            return pg.f0.f21461a;
        }
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iK = 0;
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            g1 g1VarP = list.get(i10).P(j10);
            iK = Math.max(iK, g1VarP.f11382a);
            iJ = Math.max(iJ, g1VarP.f11383b);
            arrayList.add(g1VarP);
        }
        if (list.isEmpty()) {
            iK = f3.b.k(j10);
            iJ = f3.b.j(j10);
        }
        return o0Var.i0(iK, iJ, qg.a0.f22708a, new a(arrayList));
    }
}
