package e0;

/* loaded from: classes.dex */
public interface o {

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8249a = new a();

        @Override // e0.o
        public final int a(d0.q0 q0Var, int i10) {
            return i10;
        }
    }

    public static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final float f8250a;

        public b(float f10) {
            this.f8250a = f10;
        }

        @Override // e0.o
        public final int a(d0.q0 q0Var, int i10) {
            return q0Var.b1(this.f8250a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return f3.h.a(this.f8250a, ((b) obj).f8250a);
        }

        public final int hashCode() {
            return Float.hashCode(this.f8250a);
        }
    }

    int a(d0.q0 q0Var, int i10);
}
