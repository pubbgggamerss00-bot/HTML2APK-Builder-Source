package j9;

/* loaded from: classes.dex */
public final class p1 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.e0 f15491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f15493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f15494e;

    public p1(q8.d0 d0Var, q8.e0 e0Var, long j10, p5.x xVar, String str) {
        this.f15490a = d0Var;
        this.f15491b = e0Var;
        this.f15492c = j10;
        this.f15493d = xVar;
        this.f15494e = str;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        this.f15490a.a(this.f15491b, this.f15492c, new o1(this.f15494e, this.f15493d));
        return pg.f0.f21461a;
    }
}
