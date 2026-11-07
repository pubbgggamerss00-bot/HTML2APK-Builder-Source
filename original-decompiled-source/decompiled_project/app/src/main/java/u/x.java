package u;

import j3.o0;
import pg.f0;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f28933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f28934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f28935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f28936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(o0 o0Var, eh.a aVar, g gVar, eh.l lVar, int i10) {
        super(2);
        this.f28933a = o0Var;
        this.f28934b = aVar;
        this.f28935c = gVar;
        this.f28936d = (kotlin.jvm.internal.s) lVar;
        this.f28937e = i10;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        y.d(this.f28933a, this.f28934b, this.f28935c, this.f28936d, jVar, f3.i.n(this.f28937e | 1));
        return f0.f21461a;
    }
}
