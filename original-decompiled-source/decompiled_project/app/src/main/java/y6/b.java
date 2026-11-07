package y6;

/* loaded from: classes.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33959a = new a();
    }

    /* renamed from: y6.b$b, reason: collision with other inner class name */
    public static final class C0345b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f33960a;

        public C0345b(int i10) {
            this.f33960a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0345b) && this.f33960a == ((C0345b) obj).f33960a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f33960a);
        }

        public final String toString() {
            return b.b.a(new StringBuilder("ConstraintsNotMet(reason="), this.f33960a, ')');
        }
    }
}
