package m0;

/* loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.s implements eh.l<u.m, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.r3<i0.t2> f17375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u.p f17376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f17377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(x0.n1 n1Var, u.p pVar, x2 x2Var) {
        super(1);
        this.f17375a = n1Var;
        this.f17376b = pVar;
        this.f17377c = x2Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(u.m mVar) {
        u.m mVar2 = mVar;
        int i10 = this.f17375a.getValue().f13601a;
        i0.y2 y2Var = i0.y2.f13698b;
        int i11 = i10 & 4;
        x2 x2Var = this.f17377c;
        u.p pVar = this.f17376b;
        if (i11 == 4) {
            u.m.b(mVar2, new i0.q0(y2Var), new e3(pVar, x2Var));
        }
        i0.y2 y2Var2 = i0.y2.f13699c;
        if ((i10 & 1) == 1) {
            u.m.b(mVar2, new i0.q0(y2Var2), new f3(pVar, x2Var));
        }
        i0.y2 y2Var3 = i0.y2.f13700d;
        if ((i10 & 2) == 2) {
            u.m.b(mVar2, new i0.q0(y2Var3), new g3(pVar, x2Var));
        }
        i0.y2 y2Var4 = i0.y2.f13701e;
        if ((i10 & 8) == 8) {
            u.m.b(mVar2, new i0.q0(y2Var4), new h3(pVar, x2Var));
        }
        i0.y2 y2Var5 = i0.y2.f13702f;
        if (x2Var.h() && t2.j0.b(x2Var.k().f33683b)) {
            u.m.b(mVar2, new i0.q0(y2Var5), new i3(0, pVar, x2Var));
        }
        return pg.f0.f21461a;
    }
}
