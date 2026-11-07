package z7;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class a {
    public abstract String a();

    public abstract Object b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && r.a(a(), ((a) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return h0.a(a.class).e() + "(cacheKey=" + a() + ')';
    }
}
