package x0;

import java.util.concurrent.CancellationException;
import x0.k2;

/* loaded from: classes.dex */
public final class l2 extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2 f31802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f31803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(k2 k2Var, Throwable th2) {
        super(1);
        this.f31802a = k2Var;
        this.f31803b = th2;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) {
        Throwable th3 = th2;
        k2 k2Var = this.f31802a;
        Object obj = k2Var.f31765b;
        Throwable th4 = this.f31803b;
        synchronized (obj) {
            if (th4 == null) {
                th4 = null;
            } else if (th3 != null) {
                try {
                    if (th3 instanceof CancellationException) {
                        th3 = null;
                    }
                    if (th3 != null) {
                        c9.u1.b(th4, th3);
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            k2Var.f31767d = th4;
            sh.z0 z0Var = k2Var.f31783t;
            k2.d dVar = k2.d.f31788a;
            z0Var.getClass();
            z0Var.j(null, dVar);
        }
        return pg.f0.f21461a;
    }
}
