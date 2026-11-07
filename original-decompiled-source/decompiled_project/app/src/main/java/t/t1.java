package t;

import g2.g1;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int i10, int i11, g2.g1 g1Var) {
        super(1);
        this.f25366a = g1Var;
        this.f25367b = i10;
        this.f25368c = i11;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a.h(aVar, this.f25366a, this.f25367b, this.f25368c);
        return pg.f0.f21461a;
    }
}
