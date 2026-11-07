package t0;

/* loaded from: classes.dex */
public final class i3 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f26064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b f26066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(boolean z10, eh.l lVar, androidx.compose.ui.d dVar, f1.b bVar, int i10) {
        super(2);
        this.f26063a = z10;
        this.f26064b = lVar;
        this.f26065c = dVar;
        this.f26066d = bVar;
        this.f26067e = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        o3.a(this.f26063a, this.f26064b, this.f26065c, this.f26066d, jVar, f3.i.n(this.f26067e | 1));
        return pg.f0.f21461a;
    }
}
