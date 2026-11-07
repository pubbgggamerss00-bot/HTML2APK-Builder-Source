package g2;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f11430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f11431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<t1, f3.b, m0> f11432c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, androidx.compose.ui.d dVar, eh.p pVar, int i10) {
        super(2);
        this.f11430a = s1Var;
        this.f11431b = dVar;
        this.f11432c = pVar;
        this.f11433d = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f11433d | 1);
        p1.b(this.f11430a, this.f11431b, this.f11432c, jVar, iN);
        return pg.f0.f21461a;
    }
}
