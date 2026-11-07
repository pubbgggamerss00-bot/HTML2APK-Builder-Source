package b3;

import kotlin.jvm.internal.r;
import t0.e2;
import t0.f2;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class l {
    public static e2 a(x0.j jVar) {
        return (e2) jVar.f(f2.f25858a);
    }

    public static nf b(x0.j jVar) {
        return (nf) jVar.f(of.f26647a);
    }

    public static final void c(String key) {
        r.e(key, "key");
        throw new IllegalArgumentException(i8.n.d("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
