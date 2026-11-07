package u;

import pg.f0;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f28866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f28867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f28868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f28869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(p pVar, eh.a aVar, androidx.compose.ui.d dVar, eh.l lVar, int i10) {
        super(2);
        this.f28866a = pVar;
        this.f28867b = aVar;
        this.f28868c = dVar;
        this.f28869d = (kotlin.jvm.internal.s) lVar;
        this.f28870e = i10;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        f.a(this.f28866a, this.f28867b, this.f28868c, this.f28869d, jVar, f3.i.n(this.f28870e | 1));
        return f0.f21461a;
    }
}
