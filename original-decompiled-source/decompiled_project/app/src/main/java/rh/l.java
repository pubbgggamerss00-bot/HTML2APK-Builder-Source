package rh;

/* loaded from: classes2.dex */
public final class l<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f23625b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Object f23626a;

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f23627a;

        public a(Throwable th2) {
            this.f23627a = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.r.a(this.f23627a, ((a) obj).f23627a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th2 = this.f23627a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // rh.l.b
        public final String toString() {
            return "Closed(" + this.f23627a + ')';
        }
    }

    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T a(Object obj) {
        if (obj instanceof b) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return kotlin.jvm.internal.r.a(this.f23626a, ((l) obj).f23626a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f23626a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f23626a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
