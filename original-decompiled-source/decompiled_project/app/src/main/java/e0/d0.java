package e0;

import d0.a2;

/* loaded from: classes.dex */
public final class d0 extends d0.o<s> {

    /* renamed from: a, reason: collision with root package name */
    public final eh.r<p0, Integer, x0.j, Integer, pg.f0> f8140a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<Integer, Object> f8141b;

    /* renamed from: c, reason: collision with root package name */
    public final a2 f8142c;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(eh.r<? super p0, ? super Integer, ? super x0.j, ? super Integer, pg.f0> rVar, eh.l<? super Integer, ? extends Object> lVar, int i10) {
        this.f8140a = rVar;
        this.f8141b = lVar;
        a2 a2Var = new a2();
        a2Var.a(i10, new s(lVar, rVar));
        this.f8142c = a2Var;
    }

    @Override // d0.o
    public final a2 f() {
        return this.f8142c;
    }
}
