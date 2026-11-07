package t2;

import t2.b;
import x0.s1;

/* loaded from: classes.dex */
public abstract class i implements b.a {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final String f27825a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f27826b;

        public a(String str, i0 i0Var) {
            this.f27825a = str;
            this.f27826b = i0Var;
        }

        @Override // t2.i
        public final i0 a() {
            return this.f27826b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f27825a, aVar.f27825a) && kotlin.jvm.internal.r.a(this.f27826b, aVar.f27826b);
        }

        public final int hashCode() {
            int iHashCode = this.f27825a.hashCode() * 31;
            i0 i0Var = this.f27826b;
            return (iHashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return s1.a(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f27825a, ')');
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public final String f27827a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f27828b;

        public b(String str, i0 i0Var) {
            this.f27827a = str;
            this.f27828b = i0Var;
        }

        @Override // t2.i
        public final i0 a() {
            return this.f27828b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.r.a(this.f27827a, bVar.f27827a) && kotlin.jvm.internal.r.a(this.f27828b, bVar.f27828b);
        }

        public final int hashCode() {
            int iHashCode = this.f27827a.hashCode() * 31;
            i0 i0Var = this.f27828b;
            return (iHashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return s1.a(new StringBuilder("LinkAnnotation.Url(url="), this.f27827a, ')');
        }
    }

    public abstract i0 a();
}
