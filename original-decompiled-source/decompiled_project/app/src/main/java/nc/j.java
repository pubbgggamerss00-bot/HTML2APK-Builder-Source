package nc;

import java.io.Serializable;
import java.lang.Comparable;

/* loaded from: classes2.dex */
public abstract class j<C extends Comparable> implements Comparable<j<C>>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final C f18692a;

    public static final class a extends j<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18693b = new a(null);

        @Override // nc.j
        /* renamed from: a */
        public final int compareTo(j<Comparable<?>> jVar) {
            return jVar == this ? 0 : 1;
        }

        @Override // nc.j
        public final void b(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // nc.j
        public final void c(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // nc.j, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((j) obj) == this ? 0 : 1;
        }

        @Override // nc.j
        public final boolean d(Comparable<?> comparable) {
            return false;
        }

        @Override // nc.j
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "+∞";
        }
    }

    public static final class b<C extends Comparable> extends j<C> {
        @Override // nc.j
        public final void b(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f18692a);
        }

        @Override // nc.j
        public final void c(StringBuilder sb) {
            sb.append(this.f18692a);
            sb.append(']');
        }

        @Override // nc.j, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((j) obj);
        }

        @Override // nc.j
        public final boolean d(C c10) {
            q0<Comparable> q0Var = q0.f18730c;
            return this.f18692a.compareTo(c10) < 0;
        }

        @Override // nc.j
        public final int hashCode() {
            return ~this.f18692a.hashCode();
        }

        public final String toString() {
            return "/" + this.f18692a + "\\";
        }
    }

    public static final class c extends j<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18694b = new c(null);

        @Override // nc.j
        /* renamed from: a */
        public final int compareTo(j<Comparable<?>> jVar) {
            return jVar == this ? 0 : -1;
        }

        @Override // nc.j
        public final void b(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // nc.j
        public final void c(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // nc.j, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((j) obj) == this ? 0 : -1;
        }

        @Override // nc.j
        public final boolean d(Comparable<?> comparable) {
            return true;
        }

        @Override // nc.j
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "-∞";
        }
    }

    public static final class d<C extends Comparable> extends j<C> {
        @Override // nc.j
        public final void b(StringBuilder sb) {
            sb.append('[');
            sb.append(this.f18692a);
        }

        @Override // nc.j
        public final void c(StringBuilder sb) {
            sb.append(this.f18692a);
            sb.append(')');
        }

        @Override // nc.j, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((j) obj);
        }

        @Override // nc.j
        public final boolean d(C c10) {
            q0<Comparable> q0Var = q0.f18730c;
            return this.f18692a.compareTo(c10) <= 0;
        }

        @Override // nc.j
        public final int hashCode() {
            return this.f18692a.hashCode();
        }

        public final String toString() {
            return "\\" + this.f18692a + "/";
        }
    }

    public j(Integer num) {
        this.f18692a = num;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j<C> jVar) {
        if (jVar == c.f18694b) {
            return 1;
        }
        if (jVar == a.f18693b) {
            return -1;
        }
        C c10 = jVar.f18692a;
        q0<Comparable> q0Var = q0.f18730c;
        int iCompareTo = this.f18692a.compareTo(c10);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        boolean z10 = this instanceof b;
        if (z10 == (jVar instanceof b)) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public abstract boolean d(C c10);

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            try {
                if (compareTo((j) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
