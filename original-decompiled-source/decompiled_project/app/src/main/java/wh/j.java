package wh;

import ph.g0;

/* loaded from: classes2.dex */
public final class j extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f31577c = new j();

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        c.f31565d.f31567c.p(runnable, true, false);
    }

    @Override // ph.g0
    public final void E0(tg.h hVar, Runnable runnable) {
        c.f31565d.f31567c.p(runnable, true, true);
    }

    @Override // ph.g0
    public final g0 G0(int i10) {
        uh.i.a(i10);
        return i10 >= i.f31574d ? this : super.G0(i10);
    }

    @Override // ph.g0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
