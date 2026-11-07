package t0;

import g2.g1;

/* loaded from: classes.dex */
public final class q8 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26798h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26799j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(g2.g1 g1Var, g2.g1 g1Var2, int i10, int i11, g2.g1 g1Var3, int i12, int i13, int i14, int i15) {
        super(1);
        this.f26791a = g1Var;
        this.f26792b = g1Var2;
        this.f26793c = i10;
        this.f26794d = i11;
        this.f26795e = g1Var3;
        this.f26796f = i12;
        this.f26797g = i13;
        this.f26798h = i14;
        this.f26799j = i15;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        g2.g1 g1Var = this.f26791a;
        if (g1Var != null) {
            g1.a.g(aVar2, g1Var, (this.f26798h - g1Var.f11382a) / 2, (this.f26799j - g1Var.f11383b) / 2);
        }
        g1.a.g(aVar2, this.f26792b, this.f26793c, this.f26794d);
        g1.a.g(aVar2, this.f26795e, this.f26796f, this.f26797g);
        return pg.f0.f21461a;
    }
}
