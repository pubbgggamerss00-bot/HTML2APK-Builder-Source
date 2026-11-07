package b8;

import java.util.Arrays;
import java.util.ServiceConfigurationError;
import x0.m0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3678a;

    @Override // eh.a
    public final Object invoke() {
        switch (this.f3678a) {
            case 0:
                try {
                    return c.a(lh.j.k(lh.l.g(Arrays.asList(new v7.d()).iterator())));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            default:
                m0 m0Var = v8.k.f30705a;
                return null;
        }
    }
}
