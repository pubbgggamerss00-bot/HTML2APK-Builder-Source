package tc;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class j extends ad.r {

    /* renamed from: a, reason: collision with root package name */
    public final int f28645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28646b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28647c;

    /* renamed from: d, reason: collision with root package name */
    public final a f28648d;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f28649b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f28650c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f28651d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f28652a;

        public a(String str) {
            this.f28652a = str;
        }

        public final String toString() {
            return this.f28652a;
        }
    }

    public j(int i10, int i11, int i12, a aVar) {
        this.f28645a = i10;
        this.f28646b = i11;
        this.f28647c = i12;
        this.f28648d = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f28645a == this.f28645a && jVar.f28646b == this.f28646b && jVar.f28647c == this.f28647c && jVar.f28648d == this.f28648d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f28645a), Integer.valueOf(this.f28646b), Integer.valueOf(this.f28647c), this.f28648d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f28648d);
        sb.append(", ");
        sb.append(this.f28646b);
        sb.append("-byte IV, ");
        sb.append(this.f28647c);
        sb.append("-byte tag, and ");
        return x0.a.a(sb, this.f28645a, "-byte key)");
    }
}
