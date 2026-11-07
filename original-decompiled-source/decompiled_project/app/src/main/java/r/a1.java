package r;

import s.y1;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.s implements eh.l<y1.b<u0>, s.e0<Float>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1 f22775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f22776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(u1 u1Var, w1 w1Var) {
        super(1);
        this.f22775a = u1Var;
        this.f22776b = w1Var;
    }

    @Override // eh.l
    public final s.e0<Float> invoke(y1.b<u0> bVar) {
        s.e0<Float> e0Var;
        s.e0<Float> e0Var2;
        y1.b<u0> bVar2 = bVar;
        u0 u0Var = u0.f22955a;
        u0 u0Var2 = u0.f22956b;
        if (bVar2.d(u0Var, u0Var2)) {
            f2 f2Var = this.f22775a.a().f22905d;
            return (f2Var == null || (e0Var2 = f2Var.f22821c) == null) ? w0.f22974b : e0Var2;
        }
        if (!bVar2.d(u0Var2, u0.f22957c)) {
            return w0.f22974b;
        }
        f2 f2Var2 = this.f22776b.a().f22905d;
        return (f2Var2 == null || (e0Var = f2Var2.f22821c) == null) ? w0.f22974b : e0Var;
    }
}
