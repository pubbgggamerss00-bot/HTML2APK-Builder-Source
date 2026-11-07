package b8;

import java.util.Arrays;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements eh.a {
    @Override // eh.a
    public final Object invoke() {
        try {
            return c.a(lh.j.k(lh.l.g(Arrays.asList(new n7.b()).iterator())));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
