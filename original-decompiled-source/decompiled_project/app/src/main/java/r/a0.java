package r;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f22768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f22769c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w1 f22770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f22771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b f22772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22773g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22774h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z10, androidx.compose.ui.d dVar, v1 v1Var, w1 w1Var, String str, f1.b bVar, int i10, int i11) {
        super(2);
        this.f22767a = z10;
        this.f22768b = dVar;
        this.f22769c = v1Var;
        this.f22770d = w1Var;
        this.f22771e = str;
        this.f22772f = bVar;
        this.f22773g = i10;
        this.f22774h = i11;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        androidx.compose.animation.d.c(this.f22767a, this.f22768b, this.f22769c, this.f22770d, this.f22771e, this.f22772f, jVar, f3.i.n(this.f22773g | 1), this.f22774h);
        return pg.f0.f21461a;
    }
}
