package t0;

/* loaded from: classes.dex */
public final class mb extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb f26464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.m f26465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jb f26467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f26469f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(rb rbVar, x.m mVar, androidx.compose.ui.d dVar, jb jbVar, boolean z10, long j10, int i10) {
        super(2);
        this.f26464a = rbVar;
        this.f26465b = mVar;
        this.f26466c = dVar;
        this.f26467d = jbVar;
        this.f26468e = z10;
        this.f26469f = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(196609);
        this.f26464a.a(this.f26465b, this.f26466c, this.f26467d, this.f26468e, this.f26469f, jVar, iN);
        return pg.f0.f21461a;
    }
}
