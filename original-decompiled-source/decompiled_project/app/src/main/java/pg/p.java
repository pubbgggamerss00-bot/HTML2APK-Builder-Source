package pg;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class p<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21471a;

    public static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f21472a;

        public a(Throwable exception) {
            kotlin.jvm.internal.r.e(exception, "exception");
            this.f21472a = exception;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.r.a(this.f21472a, ((a) obj).f21472a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f21472a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f21472a + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f21472a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return kotlin.jvm.internal.r.a(this.f21471a, ((p) obj).f21471a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f21471a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f21471a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
