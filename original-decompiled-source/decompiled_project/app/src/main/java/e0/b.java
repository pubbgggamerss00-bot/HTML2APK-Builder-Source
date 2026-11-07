package e0;

import java.util.List;
import x0.x1;

/* loaded from: classes.dex */
public final class b extends d1 {
    public static final g1.n I = c2.y.e(a.f8120a, C0083b.f8121a);
    public final x1 H;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<g1.o, b, List<? extends Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8120a = new a(2);

        @Override // eh.p
        public final List<? extends Object> invoke(g1.o oVar, b bVar) {
            b bVar2 = bVar;
            return qg.p.j(Integer.valueOf(bVar2.j()), Float.valueOf(jh.j.l(bVar2.k(), -0.5f, 0.5f)), Integer.valueOf(bVar2.m()));
        }
    }

    /* renamed from: e0.b$b, reason: collision with other inner class name */
    public static final class C0083b extends kotlin.jvm.internal.s implements eh.l<List, b> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0083b f8121a = new C0083b(1);

        @Override // eh.l
        public final b invoke(List list) {
            List list2 = list;
            Object obj = list2.get(0);
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list2.get(1);
            kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new b(iIntValue, ((Float) obj2).floatValue(), new c(list2));
        }
    }

    public b(int i10, float f10, eh.a<Integer> aVar) {
        super(f10, i10);
        this.H = bg.b.h(aVar);
    }

    @Override // e0.d1
    public final int m() {
        return ((Number) ((eh.a) this.H.getValue()).invoke()).intValue();
    }
}
