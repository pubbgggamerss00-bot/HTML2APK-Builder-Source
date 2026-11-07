package tc;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class p extends ad.r {

    /* renamed from: a, reason: collision with root package name */
    public final int f28668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28669b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28670c;

    /* renamed from: d, reason: collision with root package name */
    public final a f28671d;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f28672b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f28673c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f28674d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f28675a;

        public a(String str) {
            this.f28675a = str;
        }

        public final String toString() {
            return this.f28675a;
        }
    }

    public p(int i10, int i11, int i12, a aVar) {
        this.f28668a = i10;
        this.f28669b = i11;
        this.f28670c = i12;
        this.f28671d = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f28668a == this.f28668a && pVar.f28669b == this.f28669b && pVar.f28670c == this.f28670c && pVar.f28671d == this.f28671d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f28668a), Integer.valueOf(this.f28669b), Integer.valueOf(this.f28670c), this.f28671d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f28671d);
        sb.append(", ");
        sb.append(this.f28669b);
        sb.append("-byte IV, ");
        sb.append(this.f28670c);
        sb.append("-byte tag, and ");
        return x0.a.a(sb, this.f28668a, "-byte key)");
    }
}
