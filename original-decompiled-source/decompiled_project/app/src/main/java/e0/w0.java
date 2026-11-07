package e0;

import d0.c2;
import h1.h;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.s implements eh.l<c2, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f8321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(d1 d1Var) {
        super(1);
        this.f8321a = d1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(c2 c2Var) {
        c2 c2Var2 = c2Var;
        d1 d1Var = this.f8321a;
        h1.h hVarA = h.a.a();
        eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
        h1.h hVarB = h.a.b(hVarA);
        try {
            c2Var2.a(d1Var.f8147e);
            pg.f0 f0Var = pg.f0.f21461a;
            h.a.d(hVarA, hVarB, lVarE);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            h.a.d(hVarA, hVarB, lVarE);
            throw th2;
        }
    }
}
