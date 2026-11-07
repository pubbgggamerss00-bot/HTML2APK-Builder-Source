package c0;

import d0.c2;
import h1.h;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.s implements eh.l<c2, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f4550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(w0 w0Var, int i10) {
        super(1);
        this.f4550a = w0Var;
        this.f4551b = i10;
    }

    @Override // eh.l
    public final pg.f0 invoke(c2 c2Var) {
        c2 c2Var2 = c2Var;
        a aVar = this.f4550a.f4505a;
        h1.h hVarA = h.a.a();
        h.a.d(hVarA, h.a.b(hVarA), hVarA != null ? hVarA.e() : null);
        aVar.getClass();
        for (int i10 = 0; i10 < 2; i10++) {
            c2Var2.a(this.f4551b + i10);
        }
        return pg.f0.f21461a;
    }
}
