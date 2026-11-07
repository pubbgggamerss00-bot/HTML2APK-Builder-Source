package t0;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f26123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26125c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f26127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f26128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, androidx.compose.ui.d dVar, float f10, float f11, q1.f2 f2Var, long j10, int i10) {
        super(2);
        this.f26123a = k0Var;
        this.f26124b = dVar;
        this.f26125c = f10;
        this.f26126d = f11;
        this.f26127e = f2Var;
        this.f26128f = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(196609);
        this.f26123a.a(this.f26125c, this.f26126d, iN, this.f26128f, this.f26124b, this.f26127e, jVar);
        return pg.f0.f21461a;
    }
}
