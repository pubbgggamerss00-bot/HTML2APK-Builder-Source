package v4;

import java.util.Map;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class e {

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f30615a;

        public a(String str) {
            this.f30615a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return r.a(this.f30615a, ((a) obj).f30615a);
        }

        public final int hashCode() {
            return this.f30615a.hashCode();
        }

        public final String toString() {
            return this.f30615a;
        }
    }

    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);
}
