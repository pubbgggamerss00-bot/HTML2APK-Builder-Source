package x0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a1 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final eh.p<ph.i0, tg.e<? super pg.f0>, Object> f31606a;

    /* renamed from: b, reason: collision with root package name */
    public final uh.c f31607b;

    /* renamed from: c, reason: collision with root package name */
    public ph.l2 f31608c;

    /* JADX WARN: Multi-variable type inference failed */
    public a1(tg.h hVar, eh.p<? super ph.i0, ? super tg.e<? super pg.f0>, ? extends Object> pVar) {
        this.f31606a = pVar;
        this.f31607b = ph.j0.a(hVar);
    }

    @Override // x0.u2
    public final void b() {
        ph.l2 l2Var = this.f31608c;
        if (l2Var != null) {
            l2Var.n(new c1());
        }
        this.f31608c = null;
    }

    @Override // x0.u2
    public final void c() {
        ph.l2 l2Var = this.f31608c;
        if (l2Var != null) {
            l2Var.n(new c1());
        }
        this.f31608c = null;
    }

    @Override // x0.u2
    public final void d() {
        ph.l2 l2Var = this.f31608c;
        if (l2Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            l2Var.cancel(cancellationException);
        }
        this.f31608c = ph.h.c(this.f31607b, null, null, this.f31606a, 3);
    }
}
