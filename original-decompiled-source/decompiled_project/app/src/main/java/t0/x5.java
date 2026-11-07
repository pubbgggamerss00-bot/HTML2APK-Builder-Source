package t0;

/* loaded from: classes.dex */
public final class x5 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o5 f27374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27375c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(eh.p pVar, o5 o5Var, boolean z10, eh.p pVar2, eh.p pVar3) {
        super(2);
        this.f27373a = pVar;
        this.f27374b = o5Var;
        this.f27375c = z10;
        this.f27376d = pVar2;
        this.f27377e = pVar3;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1264683960);
            boolean z10 = this.f27375c;
            o5 o5Var = this.f27374b;
            eh.p<x0.j, Integer, pg.f0> pVar = this.f27373a;
            if (pVar != null) {
                x0.y.a(com.android.aapt.a.b(z10 ? o5Var.f26586b : o5Var.f26589e, p2.f26666a), f1.c.b(2035552199, new u5(pVar), jVar2), jVar2, 56);
            }
            jVar2.B();
            x0.m0 m0Var = p2.f26666a;
            x0.f2 f2VarB = com.android.aapt.a.b(z10 ? o5Var.f26585a : o5Var.f26588d, m0Var);
            eh.p<x0.j, Integer, pg.f0> pVar2 = this.f27377e;
            eh.p<x0.j, Integer, pg.f0> pVar3 = this.f27376d;
            x0.y.a(f2VarB, f1.c.b(-1728894036, new v5(pVar, pVar3, pVar2), jVar2), jVar2, 56);
            if (pVar3 != null) {
                x0.y.a(com.android.aapt.a.b(z10 ? o5Var.f26587c : o5Var.f26590f, m0Var), f1.c.b(580312062, new w5(pVar3), jVar2), jVar2, 56);
            }
        }
        return pg.f0.f21461a;
    }
}
