package x7;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: x7.a$a, reason: collision with other inner class name */
    public static final class C0326a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f32183a;

        public final boolean equals(Object obj) {
            if (obj instanceof C0326a) {
                return this.f32183a == ((C0326a) obj).f32183a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32183a);
        }

        public final String toString() {
            return "Pixels(px=" + this.f32183a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32184a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2093724603;
        }

        public final String toString() {
            return "Undefined";
        }
    }
}
