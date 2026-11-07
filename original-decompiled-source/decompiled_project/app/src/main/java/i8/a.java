package i8;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: i8.a$a, reason: collision with other inner class name */
    public static final class C0133a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0133a f14198a = new C0133a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0133a);
        }

        public final int hashCode() {
            return -1237458248;
        }

        public final String toString() {
            return "Connected";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14199a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 293504233;
        }

        public final String toString() {
            return "Connecting";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14200a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -419763156;
        }

        public final String toString() {
            return "Disconnected";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f14201a;

        public d(String message) {
            r.e(message, "message");
            this.f14201a = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && r.a(this.f14201a, ((d) obj).f14201a);
        }

        public final int hashCode() {
            return this.f14201a.hashCode();
        }

        public final String toString() {
            return n.d("Error(message=", this.f14201a, ")");
        }
    }
}
