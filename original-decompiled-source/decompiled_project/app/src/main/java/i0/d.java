package i0;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f13231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.compose.ui.d dVar, int i10, int i11) {
        super(2);
        this.f13231a = dVar;
        this.f13232b = i10;
        this.f13233c = i11;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f13232b | 1);
        int i10 = this.f13233c;
        h.b(this.f13231a, jVar, iN, i10);
        return pg.f0.f21461a;
    }
}
