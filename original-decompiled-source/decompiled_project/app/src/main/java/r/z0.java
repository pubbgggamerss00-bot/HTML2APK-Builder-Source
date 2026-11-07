package r;

import s.y1;
import x0.r3;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.s implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3<Float> f23004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3<Float> f23005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3<q1.l2> f23006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(y1.a.C0268a c0268a, y1.a.C0268a c0268a2, y1.a.C0268a c0268a3) {
        super(1);
        this.f23004a = c0268a;
        this.f23005b = c0268a2;
        this.f23006c = c0268a3;
    }

    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        q1.l1 l1Var2 = l1Var;
        r3<Float> r3Var = this.f23004a;
        l1Var2.f(r3Var != null ? r3Var.getValue().floatValue() : 1.0f);
        r3<Float> r3Var2 = this.f23005b;
        l1Var2.h(r3Var2 != null ? r3Var2.getValue().floatValue() : 1.0f);
        l1Var2.d(r3Var2 != null ? r3Var2.getValue().floatValue() : 1.0f);
        r3<q1.l2> r3Var3 = this.f23006c;
        l1Var2.c1(r3Var3 != null ? r3Var3.getValue().f21720a : q1.l2.f21718b);
        return pg.f0.f21461a;
    }
}
