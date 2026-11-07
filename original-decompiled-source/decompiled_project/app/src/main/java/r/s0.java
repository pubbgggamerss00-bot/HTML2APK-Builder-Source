package r;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.y1<Object> f22920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f22921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.e0<Float> f22922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<Object, Object> f22923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(s.y1 y1Var, androidx.compose.ui.d dVar, s.e0 e0Var, eh.l lVar, int i10) {
        super(2);
        f1.b bVar = b9.a.f3685a;
        this.f22920a = y1Var;
        this.f22921b = dVar;
        this.f22922c = e0Var;
        this.f22923d = lVar;
        this.f22924e = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        f1.b bVar = b9.a.f3685a;
        t0.b(this.f22920a, this.f22921b, this.f22922c, this.f22923d, jVar2, f3.i.n(this.f22924e | 1));
        return pg.f0.f21461a;
    }
}
