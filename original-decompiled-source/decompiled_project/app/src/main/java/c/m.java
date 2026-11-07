package c;

import java.util.concurrent.CancellationException;
import ph.i0;
import ph.l2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4319a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.c f4320b = rh.k.a(-2, 4, rh.a.f23576a);

    /* renamed from: c, reason: collision with root package name */
    public final l2 f4321c;

    public m(i0 i0Var, boolean z10, eh.p pVar, n nVar) {
        this.f4319a = z10;
        this.f4321c = ph.h.c(i0Var, null, null, new l(nVar, pVar, this, null), 3);
    }

    public final void a() {
        this.f4320b.n(true, new CancellationException("onBack cancelled"));
        this.f4321c.cancel((CancellationException) null);
    }
}
