package c;

import pg.f0;
import x0.k0;

/* loaded from: classes.dex */
public final class c implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f4286a;

    public c(a aVar) {
        this.f4286a = aVar;
    }

    @Override // x0.k0
    public final void a() {
        f0 f0Var;
        e.i iVar = this.f4286a.f4284a;
        if (iVar != null) {
            iVar.b();
            f0Var = f0.f21461a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
