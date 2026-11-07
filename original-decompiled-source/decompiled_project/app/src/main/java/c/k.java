package c;

import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final class k<I, O> extends e.c<I> {

    /* renamed from: a, reason: collision with root package name */
    public final a<I> f4311a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f4312b;

    public k(a aVar, n1 n1Var) {
        this.f4311a = aVar;
        this.f4312b = n1Var;
    }

    @Override // e.c
    public final void a(Object obj) {
        f0 f0Var;
        e.i iVar = this.f4311a.f4284a;
        if (iVar != null) {
            iVar.a(obj);
            f0Var = f0.f21461a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
