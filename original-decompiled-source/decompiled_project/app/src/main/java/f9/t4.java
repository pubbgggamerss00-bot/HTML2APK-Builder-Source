package f9;

/* loaded from: classes.dex */
public interface t4 {

    public static final class a implements t4 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10556a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -108254979;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public static final class b implements t4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10557a;

        public b(String str) {
            this.f10557a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.r.a(this.f10557a, ((b) obj).f10557a);
        }

        public final int hashCode() {
            return this.f10557a.hashCode();
        }

        public final String toString() {
            return i8.n.d("Text(value=", this.f10557a, ")");
        }
    }

    public static final class c implements t4 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f10558a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1652957959;
        }

        public final String toString() {
            return "TooLarge";
        }
    }
}
