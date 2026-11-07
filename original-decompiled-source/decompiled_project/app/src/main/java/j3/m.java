package j3;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f15091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f15092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f3.r f15094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g0 g0Var, eh.a<pg.f0> aVar, p0 p0Var, String str, f3.r rVar) {
        super(1);
        this.f15090a = g0Var;
        this.f15091b = aVar;
        this.f15092c = p0Var;
        this.f15093d = str;
        this.f15094e = rVar;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        g0 g0Var = this.f15090a;
        g0Var.f15063p.addView(g0Var, g0Var.f15064q);
        g0Var.l(this.f15091b, this.f15092c, this.f15093d, this.f15094e);
        return new l(g0Var);
    }
}
