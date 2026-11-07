package q2;

import androidx.compose.ui.d;
import i2.k2;
import pg.f0;

/* loaded from: classes.dex */
public final class d extends d.c implements k2 {

    /* renamed from: q, reason: collision with root package name */
    public boolean f21761q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21762r;

    /* renamed from: s, reason: collision with root package name */
    public eh.l<? super d0, f0> f21763s;

    public d(boolean z10, boolean z11, eh.l<? super d0, f0> lVar) {
        this.f21761q = z10;
        this.f21762r = z11;
        this.f21763s = lVar;
    }

    @Override // i2.k2
    public final void X(d0 d0Var) {
        this.f21763s.invoke(d0Var);
    }

    @Override // i2.k2
    public final boolean s0() {
        return this.f21762r;
    }

    @Override // i2.k2
    public final boolean w1() {
        return this.f21761q;
    }
}
