package u0;

import q1.f2;
import t0.ef;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.s implements eh.l<n1.g, n1.k> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f29173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ef.a f29174b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(f2 f2Var, ef.a aVar) {
        super(1);
        this.f29173a = f2Var;
        this.f29174b = aVar;
    }

    @Override // eh.l
    public final n1.k invoke(n1.g gVar) {
        n1.g gVar2 = gVar;
        return gVar2.m(new n1.f(new v1(this.f29173a.a(gVar2.f18310a.i(), gVar2.f18310a.getLayoutDirection(), gVar2), this.f29174b)));
    }
}
