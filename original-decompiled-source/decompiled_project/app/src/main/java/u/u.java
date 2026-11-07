package u;

import j3.o0;
import pg.f0;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f28925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f28926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f28927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(o0 o0Var, eh.a aVar, eh.l lVar, int i10) {
        super(2);
        this.f28925a = o0Var;
        this.f28926b = aVar;
        this.f28927c = (kotlin.jvm.internal.s) lVar;
        this.f28928d = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f28928d | 1);
        y.c(this.f28925a, this.f28926b, this.f28927c, jVar, iN);
        return f0.f21461a;
    }
}
