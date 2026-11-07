package r7;

import g7.l;
import java.util.Map;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public interface c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public r7.b f23219a;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f23220a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f23221b;

        public b(String str, Map<String, String> map) {
            this.f23220a = str;
            this.f23221b = b8.c.b(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return r.a(this.f23220a, bVar.f23220a) && r.a(this.f23221b, bVar.f23221b);
        }

        public final int hashCode() {
            return this.f23221b.hashCode() + (this.f23220a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(key=" + this.f23220a + ", extras=" + this.f23221b + ')';
        }
    }

    /* renamed from: r7.c$c, reason: collision with other inner class name */
    public static final class C0257c {

        /* renamed from: a, reason: collision with root package name */
        public final l f23222a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f23223b;

        public C0257c(l lVar, Map<String, ? extends Object> map) {
            this.f23222a = lVar;
            this.f23223b = b8.c.b(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0257c)) {
                return false;
            }
            C0257c c0257c = (C0257c) obj;
            return r.a(this.f23222a, c0257c.f23222a) && r.a(this.f23223b, c0257c.f23223b);
        }

        public final int hashCode() {
            return this.f23223b.hashCode() + (this.f23222a.hashCode() * 31);
        }

        public final String toString() {
            return "Value(image=" + this.f23222a + ", extras=" + this.f23223b + ')';
        }
    }

    C0257c a(b bVar);

    void b(long j10);

    void c(b bVar, C0257c c0257c);

    void clear();

    long getSize();
}
