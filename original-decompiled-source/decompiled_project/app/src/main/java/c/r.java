package c;

import pg.f0;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<sh.f<b.c>, tg.e<f0>, Object> f4333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, eh.p pVar, int i10) {
        super(2);
        this.f4332a = z10;
        this.f4333b = pVar;
        this.f4334c = i10;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f4334c | 1);
        s.a(this.f4332a, this.f4333b, jVar, iN);
        return f0.f21461a;
    }
}
