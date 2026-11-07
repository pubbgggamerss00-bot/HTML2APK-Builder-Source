package c0;

import g2.g1;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.s implements eh.q<Integer, Integer, eh.l<? super g1.a, ? extends pg.f0>, g2.m0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0.q0 f4546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0.q0 q0Var, long j10, int i10, int i11) {
        super(3);
        this.f4546a = q0Var;
        this.f4547b = j10;
        this.f4548c = i10;
        this.f4549d = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final g2.m0 b(Integer num, Integer num2, eh.l<? super g1.a, ? extends pg.f0> lVar) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int i10 = iIntValue + this.f4548c;
        long j10 = this.f4547b;
        int iG = f3.c.g(i10, j10);
        int iF = f3.c.f(iIntValue2 + this.f4549d, j10);
        qg.a0 a0Var = qg.a0.f22708a;
        return this.f4546a.i0(iG, iF, a0Var, lVar);
    }
}
