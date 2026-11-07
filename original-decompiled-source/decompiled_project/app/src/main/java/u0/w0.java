package u0;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.s implements eh.l<p1.h, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f29171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<p1.h> f29172b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(float f10, x0.n1<p1.h> n1Var) {
        super(1);
        this.f29171a = f10;
        this.f29172b = n1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(p1.h hVar) {
        long j10 = hVar.f21143a;
        float fD = p1.h.d(j10);
        float f10 = this.f29171a;
        float f11 = fD * f10;
        float fB = p1.h.b(j10) * f10;
        x0.n1<p1.h> n1Var = this.f29172b;
        if (p1.h.d(n1Var.getValue().f21143a) != f11 || p1.h.b(n1Var.getValue().f21143a) != fB) {
            n1Var.setValue(new p1.h(d0.h.a(f11, fB)));
        }
        return pg.f0.f21461a;
    }
}
