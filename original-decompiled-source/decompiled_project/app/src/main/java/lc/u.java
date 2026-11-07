package lc;

import java.io.Serializable;
import java.util.Arrays;
import mc.a;

/* loaded from: classes2.dex */
public final class u {

    public static class a<T> implements t<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final t<T> f16966a;

        /* renamed from: b, reason: collision with root package name */
        public volatile transient boolean f16967b;

        /* renamed from: c, reason: collision with root package name */
        public transient T f16968c;

        public a(t<T> tVar) {
            this.f16966a = tVar;
        }

        @Override // lc.t
        public final T get() {
            if (!this.f16967b) {
                synchronized (this) {
                    try {
                        if (!this.f16967b) {
                            T t3 = this.f16966a.get();
                            this.f16968c = t3;
                            this.f16967b = true;
                            return t3;
                        }
                    } finally {
                    }
                }
            }
            return this.f16968c;
        }

        public final String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.f16967b) {
                obj = "<supplier that returned " + this.f16968c + ">";
            } else {
                obj = this.f16966a;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class b<T> implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        public volatile t<T> f16969a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f16970b;

        /* renamed from: c, reason: collision with root package name */
        public T f16971c;

        @Override // lc.t
        public final T get() {
            if (!this.f16970b) {
                synchronized (this) {
                    try {
                        if (!this.f16970b) {
                            T t3 = this.f16969a.get();
                            this.f16971c = t3;
                            this.f16970b = true;
                            this.f16969a = null;
                            return t3;
                        }
                    } finally {
                    }
                }
            }
            return this.f16971c;
        }

        public final String toString() {
            Object obj = this.f16969a;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (obj == null) {
                obj = "<supplier that returned " + this.f16971c + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class c<T> implements t<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final a.C0177a f16972a;

        public c(a.C0177a c0177a) {
            this.f16972a = c0177a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return i.a(this.f16972a, ((c) obj).f16972a);
            }
            return false;
        }

        @Override // lc.t
        public final T get() {
            return (T) this.f16972a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f16972a});
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + this.f16972a + ")";
        }
    }

    public static <T> t<T> a(t<T> tVar) {
        if ((tVar instanceof b) || (tVar instanceof a)) {
            return tVar;
        }
        if (tVar instanceof Serializable) {
            return new a(tVar);
        }
        b bVar = new b();
        bVar.f16969a = tVar;
        return bVar;
    }
}
