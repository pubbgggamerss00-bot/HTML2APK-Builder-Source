package d0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b<a> f7169a = new z0.b<>(new a[16]);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7170a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7171b;

        public a(int i10, int i11) {
            this.f7170a = i10;
            this.f7171b = i11;
            if (!(i10 >= 0)) {
                y.c.a("negative start index");
            }
            if (i11 >= i10) {
                return;
            }
            y.c.a("end index greater than start");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7170a == aVar.f7170a && this.f7171b == aVar.f7171b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f7171b) + (Integer.hashCode(this.f7170a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.f7170a);
            sb.append(", end=");
            return b.b.a(sb, this.f7171b, ')');
        }
    }
}
