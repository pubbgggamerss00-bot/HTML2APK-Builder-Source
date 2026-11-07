package u;

import pg.f0;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f28921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f28922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f28923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(String str, g gVar, eh.a aVar, int i10) {
        super(2);
        this.f28921a = str;
        this.f28922b = gVar;
        this.f28923c = (kotlin.jvm.internal.s) aVar;
        this.f28924d = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.a, kotlin.jvm.internal.s] */
    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f28924d | 1);
        y.b(this.f28921a, this.f28922b, this.f28923c, jVar, iN);
        return f0.f21461a;
    }
}
