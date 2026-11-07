package j3;

import g2.g1;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f3.r f15115b;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15116a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
            return pg.f0.f21461a;
        }
    }

    public r(g0 g0Var, f3.r rVar) {
        this.f15114a = g0Var;
        this.f15115b = rVar;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        this.f15114a.setParentLayoutDirection(this.f15115b);
        return o0Var.i0(0, 0, qg.a0.f22708a, a.f15116a);
    }
}
