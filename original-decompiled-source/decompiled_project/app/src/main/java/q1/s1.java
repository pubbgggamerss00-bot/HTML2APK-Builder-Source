package q1;

/* loaded from: classes.dex */
public abstract class s1 {

    public static final class a extends s1 {

        /* renamed from: a, reason: collision with root package name */
        public final u1 f21733a;

        public a(u1 u1Var) {
            this.f21733a = u1Var;
        }
    }

    public static final class b extends s1 {

        /* renamed from: a, reason: collision with root package name */
        public final p1.e f21734a;

        public b(p1.e eVar) {
            this.f21734a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return kotlin.jvm.internal.r.a(this.f21734a, ((b) obj).f21734a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f21734a.hashCode();
        }
    }

    public static final class c extends s1 {

        /* renamed from: a, reason: collision with root package name */
        public final p1.g f21735a;

        /* renamed from: b, reason: collision with root package name */
        public final j0 f21736b;

        public c(p1.g gVar) {
            j0 j0VarA;
            this.f21735a = gVar;
            if (j1.l.b(gVar)) {
                j0VarA = null;
            } else {
                j0VarA = l0.a();
                u1.f(j0VarA, gVar);
            }
            this.f21736b = j0VarA;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return kotlin.jvm.internal.r.a(this.f21735a, ((c) obj).f21735a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f21735a.hashCode();
        }
    }
}
