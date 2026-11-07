package t0;

import g2.g1;

/* loaded from: classes.dex */
public final class h9 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26005g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26006h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26007j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(g2.g1 g1Var, g2.g1 g1Var2, int i10, int i11, g2.g1 g1Var3, int i12, int i13, int i14, int i15) {
        super(1);
        this.f25999a = g1Var;
        this.f26000b = g1Var2;
        this.f26001c = i10;
        this.f26002d = i11;
        this.f26003e = g1Var3;
        this.f26004f = i12;
        this.f26005g = i13;
        this.f26006h = i14;
        this.f26007j = i15;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        g2.g1 g1Var = this.f25999a;
        if (g1Var != null) {
            g1.a.g(aVar2, g1Var, (this.f26006h - g1Var.f11382a) / 2, (this.f26007j - g1Var.f11383b) / 2);
        }
        g1.a.g(aVar2, this.f26000b, this.f26001c, this.f26002d);
        g1.a.g(aVar2, this.f26003e, this.f26004f, this.f26005g);
        return pg.f0.f21461a;
    }
}
