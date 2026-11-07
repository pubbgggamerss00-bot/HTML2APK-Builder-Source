package t0;

/* loaded from: classes.dex */
public final class u4 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1.c f27120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f27122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(v1.c cVar, String str, androidx.compose.ui.d dVar, long j10, int i10) {
        super(2);
        this.f27120a = cVar;
        this.f27121b = str;
        this.f27122c = dVar;
        this.f27123d = j10;
        this.f27124e = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        t4.a(this.f27120a, this.f27121b, this.f27122c, this.f27123d, jVar, f3.i.n(this.f27124e | 1));
        return pg.f0.f21461a;
    }
}
