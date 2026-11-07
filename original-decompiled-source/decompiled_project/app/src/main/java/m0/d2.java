package m0;

/* loaded from: classes.dex */
public final class d2 extends kotlin.jvm.internal.s implements eh.l<u.m, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.p f17284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f17285b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(u.p pVar, r1 r1Var) {
        super(1);
        this.f17284a = pVar;
        this.f17285b = r1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(u.m mVar) {
        u.m mVar2 = mVar;
        i0.y2 y2Var = i0.y2.f13699c;
        r1 r1Var = this.f17285b;
        boolean zH = r1Var.h();
        u.p pVar = this.f17284a;
        if (zH) {
            u.m.b(mVar2, new i0.q0(y2Var), new b2(pVar, r1Var));
        }
        pg.f0 f0Var = pg.f0.f21461a;
        i0.y2 y2Var2 = i0.y2.f13701e;
        if (!r1Var.f()) {
            u.m.b(mVar2, new i0.q0(y2Var2), new c2(pVar, r1Var));
        }
        qg.p.j(f0Var, f0Var);
        return f0Var;
    }
}
