package tc;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class v extends ad.r {

    /* renamed from: a, reason: collision with root package name */
    public final int f28683a;

    /* renamed from: b, reason: collision with root package name */
    public final a f28684b;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f28685b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f28686c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f28687d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f28688a;

        public a(String str) {
            this.f28688a = str;
        }

        public final String toString() {
            return this.f28688a;
        }
    }

    public v(int i10, a aVar) {
        this.f28683a = i10;
        this.f28684b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.f28683a == this.f28683a && vVar.f28684b == this.f28684b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f28683a), this.f28684b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f28684b);
        sb.append(", ");
        return x0.a.a(sb, this.f28683a, "-byte key)");
    }
}
