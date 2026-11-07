package q9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f22576a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22577b;

    /* renamed from: c, reason: collision with root package name */
    public final j f22578c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f22579d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22580e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22581f;

    /* renamed from: g, reason: collision with root package name */
    public final t f22582g;

    public l() {
        throw null;
    }

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        t tVar = t.f22592a;
        this.f22576a = j10;
        this.f22577b = j11;
        this.f22578c = jVar;
        this.f22579d = num;
        this.f22580e = str;
        this.f22581f = arrayList;
        this.f22582g = tVar;
    }

    @Override // q9.r
    public final p a() {
        return this.f22578c;
    }

    @Override // q9.r
    public final List<q> b() {
        return this.f22581f;
    }

    @Override // q9.r
    public final Integer c() {
        return this.f22579d;
    }

    @Override // q9.r
    public final String d() {
        return this.f22580e;
    }

    @Override // q9.r
    public final t e() {
        return this.f22582g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f22576a != rVar.f() || this.f22577b != rVar.g()) {
            return false;
        }
        j jVar = this.f22578c;
        if (jVar == null) {
            if (rVar.a() != null) {
                return false;
            }
        } else if (!jVar.equals(rVar.a())) {
            return false;
        }
        Integer num = this.f22579d;
        if (num == null) {
            if (rVar.c() != null) {
                return false;
            }
        } else if (!num.equals(rVar.c())) {
            return false;
        }
        String str = this.f22580e;
        if (str == null) {
            if (rVar.d() != null) {
                return false;
            }
        } else if (!str.equals(rVar.d())) {
            return false;
        }
        ArrayList arrayList = this.f22581f;
        if (arrayList == null) {
            if (rVar.b() != null) {
                return false;
            }
        } else if (!arrayList.equals(rVar.b())) {
            return false;
        }
        t tVar = this.f22582g;
        return tVar == null ? rVar.e() == null : tVar.equals(rVar.e());
    }

    @Override // q9.r
    public final long f() {
        return this.f22576a;
    }

    @Override // q9.r
    public final long g() {
        return this.f22577b;
    }

    public final int hashCode() {
        long j10 = this.f22576a;
        long j11 = this.f22577b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        j jVar = this.f22578c;
        int iHashCode = (i10 ^ (jVar == null ? 0 : jVar.hashCode())) * 1000003;
        Integer num = this.f22579d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f22580e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f22581f;
        int iHashCode4 = (iHashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        t tVar = this.f22582g;
        return iHashCode4 ^ (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f22576a + ", requestUptimeMs=" + this.f22577b + ", clientInfo=" + this.f22578c + ", logSource=" + this.f22579d + ", logSourceName=" + this.f22580e + ", logEvents=" + this.f22581f + ", qosTier=" + this.f22582g + "}";
    }
}
