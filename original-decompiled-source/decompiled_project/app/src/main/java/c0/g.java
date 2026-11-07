package c0;

import c0.b;
import z.b;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.s implements eh.p<f3.d, f3.b, s0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.a f4389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.e f4390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b.a aVar, b.e eVar) {
        super(2);
        this.f4389a = aVar;
        this.f4390b = eVar;
    }

    @Override // eh.p
    public final s0 invoke(f3.d dVar, f3.b bVar) {
        f3.d dVar2 = dVar;
        long j10 = bVar.f8811a;
        if (f3.b.i(j10) == Integer.MAX_VALUE) {
            y.c.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int i10 = f3.b.i(j10);
        b.e eVar = this.f4390b;
        int[] iArrB0 = qg.x.b0(this.f4389a.a(dVar2, i10, dVar2.b1(eVar.a())));
        int[] iArr = new int[iArrB0.length];
        eVar.b(dVar2, i10, iArrB0, f3.r.f8828a, iArr);
        return new s0(iArrB0, iArr);
    }
}
