package s7;

/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final t7.a f24529a = new t7.a();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final r f24530a;

        public a(r rVar) {
            this.f24530a = rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.r.a(this.f24530a, ((a) obj).f24530a);
        }

        public final int hashCode() {
            r rVar = this.f24530a;
            if (rVar != null) {
                return rVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ReadResult(request=null, response=" + this.f24530a + ')';
        }
    }

    C0273b a(r rVar, r rVar2);

    a b(r rVar);

    /* renamed from: s7.b$b, reason: collision with other inner class name */
    public static final class C0273b {

        /* renamed from: a, reason: collision with root package name */
        public final r f24531a;

        static {
            new C0273b();
        }

        public C0273b(r rVar) {
            this.f24531a = rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0273b) {
                return kotlin.jvm.internal.r.a(this.f24531a, ((C0273b) obj).f24531a);
            }
            return false;
        }

        public final int hashCode() {
            r rVar = this.f24531a;
            if (rVar != null) {
                return rVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "WriteResult(response=" + this.f24531a + ')';
        }

        public C0273b() {
            this.f24531a = null;
        }
    }
}
