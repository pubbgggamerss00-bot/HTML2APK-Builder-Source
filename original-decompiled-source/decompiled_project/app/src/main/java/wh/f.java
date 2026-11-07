package wh;

import java.util.concurrent.Executor;
import ph.j1;

/* loaded from: classes2.dex */
public class f extends j1 {

    /* renamed from: c, reason: collision with root package name */
    public a f31567c;

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        a.z(this.f31567c, runnable, 6);
    }

    @Override // ph.g0
    public final void E0(tg.h hVar, Runnable runnable) {
        a.z(this.f31567c, runnable, 2);
    }

    @Override // ph.j1
    public final Executor H0() {
        return this.f31567c;
    }
}
