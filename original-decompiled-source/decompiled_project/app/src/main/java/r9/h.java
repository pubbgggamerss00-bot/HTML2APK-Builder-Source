package r9;

import java.util.HashMap;
import java.util.Map;
import r9.n;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f23274a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f23275b;

    /* renamed from: c, reason: collision with root package name */
    public final m f23276c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23277d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23278e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, String> f23279f;

    public static final class a extends n.a {

        /* renamed from: a, reason: collision with root package name */
        public String f23280a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f23281b;

        /* renamed from: c, reason: collision with root package name */
        public m f23282c;

        /* renamed from: d, reason: collision with root package name */
        public Long f23283d;

        /* renamed from: e, reason: collision with root package name */
        public Long f23284e;

        /* renamed from: f, reason: collision with root package name */
        public HashMap f23285f;

        public final h b() {
            String strA = this.f23280a == null ? " transportName" : "";
            if (this.f23282c == null) {
                strA = strA.concat(" encodedPayload");
            }
            if (this.f23283d == null) {
                strA = k3.a.a(strA, " eventMillis");
            }
            if (this.f23284e == null) {
                strA = k3.a.a(strA, " uptimeMillis");
            }
            if (this.f23285f == null) {
                strA = k3.a.a(strA, " autoMetadata");
            }
            if (strA.isEmpty()) {
                return new h(this.f23280a, this.f23281b, this.f23282c, this.f23283d.longValue(), this.f23284e.longValue(), this.f23285f);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
    }

    public h(String str, Integer num, m mVar, long j10, long j11, HashMap map) {
        this.f23274a = str;
        this.f23275b = num;
        this.f23276c = mVar;
        this.f23277d = j10;
        this.f23278e = j11;
        this.f23279f = map;
    }

    @Override // r9.n
    public final Map<String, String> b() {
        return this.f23279f;
    }

    @Override // r9.n
    public final Integer c() {
        return this.f23275b;
    }

    @Override // r9.n
    public final m d() {
        return this.f23276c;
    }

    @Override // r9.n
    public final long e() {
        return this.f23277d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f23274a.equals(nVar.g())) {
            return false;
        }
        Integer num = this.f23275b;
        if (num == null) {
            if (nVar.c() != null) {
                return false;
            }
        } else if (!num.equals(nVar.c())) {
            return false;
        }
        return this.f23276c.equals(nVar.d()) && this.f23277d == nVar.e() && this.f23278e == nVar.h() && this.f23279f.equals(nVar.b());
    }

    @Override // r9.n
    public final String g() {
        return this.f23274a;
    }

    @Override // r9.n
    public final long h() {
        return this.f23278e;
    }

    public final int hashCode() {
        int iHashCode = (this.f23274a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f23275b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f23276c.hashCode()) * 1000003;
        long j10 = this.f23277d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f23278e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f23279f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f23274a + ", code=" + this.f23275b + ", encodedPayload=" + this.f23276c + ", eventMillis=" + this.f23277d + ", uptimeMillis=" + this.f23278e + ", autoMetadata=" + this.f23279f + "}";
    }
}
