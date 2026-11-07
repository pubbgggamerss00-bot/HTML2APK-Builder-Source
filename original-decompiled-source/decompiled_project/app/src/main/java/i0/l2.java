package i0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l2 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final eh.a<Boolean> f13414a;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<g2.k0> f13415a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l2 f13416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends g2.k0> list, l2 l2Var) {
            super(1);
            this.f13415a = list;
            this.f13416b = l2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            ArrayList arrayListF = i0.f(this.f13415a, this.f13416b.f13414a);
            if (arrayListF != null) {
                int size = arrayListF.size();
                for (int i10 = 0; i10 < size; i10++) {
                    pg.n nVar = (pg.n) arrayListF.get(i10);
                    g2.g1 g1Var = (g2.g1) nVar.f21469a;
                    eh.a aVar3 = (eh.a) nVar.f21470b;
                    g1.a.f(aVar2, g1Var, aVar3 != null ? ((f3.m) aVar3.invoke()).f8820a : 0L);
                }
            }
            return pg.f0.f21461a;
        }
    }

    public l2(eh.a<Boolean> aVar) {
        this.f13414a = aVar;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        return o0Var.i0(f3.b.i(j10), f3.b.h(j10), qg.a0.f22708a, new a(list, this));
    }
}
