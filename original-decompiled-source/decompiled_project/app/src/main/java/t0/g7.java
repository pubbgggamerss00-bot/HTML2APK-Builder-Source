package t0;

/* loaded from: classes.dex */
public final class g7 extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f25929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f25933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f25934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(hb hbVar, String str, String str2, String str3, eh.a<pg.f0> aVar, ph.i0 i0Var) {
        super(1);
        this.f25929a = hbVar;
        this.f25930b = str;
        this.f25931c = str2;
        this.f25932d = str3;
        this.f25933e = aVar;
        this.f25934f = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final pg.f0 invoke(q2.d0 d0Var) {
        q2.d0 d0Var2 = d0Var;
        b7 b7Var = new b7(this.f25933e);
        kh.i<Object>[] iVarArr = q2.a0.f21754a;
        d0Var2.c(q2.k.f21793u, new q2.a(this.f25930b, b7Var));
        hb hbVar = this.f25929a;
        u0.a0<ib> a0Var = hbVar.f26015b;
        ib ibVar = (ib) a0Var.f28947g.getValue();
        ph.i0 i0Var = this.f25934f;
        ib ibVar2 = ib.f26110c;
        if (ibVar == ibVar2) {
            d0Var2.c(q2.k.f21791s, new q2.a(this.f25931c, new d7(hbVar, i0Var, hbVar)));
        } else if (a0Var.e().e(ibVar2)) {
            d0Var2.c(q2.k.f21792t, new q2.a(this.f25932d, new f7(hbVar, i0Var)));
        }
        return pg.f0.f21461a;
    }
}
