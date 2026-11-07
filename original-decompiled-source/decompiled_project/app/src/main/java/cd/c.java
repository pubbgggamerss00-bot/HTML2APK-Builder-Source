package cd;

import java.util.List;
import java.util.Objects;
import sc.g;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final cd.a f5396a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f5397b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f5398c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final g f5399a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5400b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5401c;

        /* renamed from: d, reason: collision with root package name */
        public final String f5402d;

        public a(g gVar, int i10, String str, String str2) {
            this.f5399a = gVar;
            this.f5400b = i10;
            this.f5401c = str;
            this.f5402d = str2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5399a == aVar.f5399a && this.f5400b == aVar.f5400b && this.f5401c.equals(aVar.f5401c) && this.f5402d.equals(aVar.f5402d);
        }

        public final int hashCode() {
            return Objects.hash(this.f5399a, Integer.valueOf(this.f5400b), this.f5401c, this.f5402d);
        }

        public final String toString() {
            return "(status=" + this.f5399a + ", keyId=" + this.f5400b + ", keyType='" + this.f5401c + "', keyPrefix='" + this.f5402d + "')";
        }
    }

    public c(cd.a aVar, List list, Integer num) {
        this.f5396a = aVar;
        this.f5397b = list;
        this.f5398c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5396a.equals(cVar.f5396a) && this.f5397b.equals(cVar.f5397b) && Objects.equals(this.f5398c, cVar.f5398c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5396a, this.f5397b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f5396a, this.f5397b, this.f5398c);
    }
}
