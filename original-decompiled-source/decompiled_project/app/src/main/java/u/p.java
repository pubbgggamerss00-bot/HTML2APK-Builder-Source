package u;

import x0.x1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f28915a;

    public static abstract class a {

        /* renamed from: u.p$a$a, reason: collision with other inner class name */
        public static final class C0297a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0297a f28916a = new C0297a();

            public final String toString() {
                return "Closed";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final long f28917a;

            public b(long j10) {
                this.f28917a = j10;
                if ((j10 & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                y.c.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                return p1.c.b(this.f28917a, ((b) obj).f28917a);
            }

            public final int hashCode() {
                return Long.hashCode(this.f28917a);
            }

            public final String toString() {
                return "Open(offset=" + ((Object) p1.c.i(this.f28917a)) + ')';
            }
        }
    }

    public p() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return kotlin.jvm.internal.r.a((a) ((p) obj).f28915a.getValue(), (a) this.f28915a.getValue());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return ((a) this.f28915a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((a) this.f28915a.getValue()) + ')';
    }

    public p(int i10) {
        this.f28915a = bg.b.h(a.C0297a.f28916a);
    }
}
