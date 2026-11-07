package t6;

/* loaded from: classes.dex */
public interface w {

    /* renamed from: a, reason: collision with root package name */
    public static final a.c f28060a = new a.c();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f28061b = new a.b();

    public static abstract class a {

        /* renamed from: t6.w$a$a, reason: collision with other inner class name */
        public static final class C0290a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f28062a;

            public C0290a(Throwable th2) {
                this.f28062a = th2;
            }

            public final String toString() {
                return "FAILURE (" + this.f28062a.getMessage() + ")";
            }
        }

        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
