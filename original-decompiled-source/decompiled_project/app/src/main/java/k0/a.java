package k0;

import i0.g3;
import k0.m1;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.s implements eh.l<p1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f15794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.o f15796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g3 f15797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<y2.n, pg.f0> f15798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y2.c0 c0Var, c cVar, y2.o oVar, g3 g3Var, eh.l lVar) {
        super(1);
        this.f15794a = c0Var;
        this.f15795b = cVar;
        this.f15796c = oVar;
        this.f15797d = g3Var;
        this.f15798e = lVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(p1 p1Var) {
        p1 p1Var2 = p1Var;
        m1.a aVar = this.f15795b.f15873a;
        p1Var2.f15893h = this.f15794a;
        p1Var2.f15894i = this.f15796c;
        p1Var2.f15888c = this.f15797d;
        p1Var2.f15889d = this.f15798e;
        p1Var2.f15890e = aVar != null ? aVar.u1() : null;
        p1Var2.f15891f = aVar != null ? aVar.p0() : null;
        p1Var2.f15892g = aVar != null ? aVar.getViewConfiguration() : null;
        return pg.f0.f21461a;
    }
}
