package l9;

/* loaded from: classes.dex */
public interface n {

    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16854a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -917407736;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16855a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1642461410;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public final String f16856a;

        public c(String value) {
            kotlin.jvm.internal.r.e(value, "value");
            this.f16856a = value;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.r.a(this.f16856a, ((c) obj).f16856a);
        }

        public final int hashCode() {
            return this.f16856a.hashCode();
        }

        public final String toString() {
            return i8.n.d("Text(value=", this.f16856a, ")");
        }
    }

    public static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f16857a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 464227756;
        }

        public final String toString() {
            return "TooLarge";
        }
    }
}
