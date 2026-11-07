package s7;

import org.bouncycastle.asn1.x509.DisplayText;
import r.e2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f24585a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24586b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24587c;

    /* renamed from: d, reason: collision with root package name */
    public final o f24588d;

    /* renamed from: e, reason: collision with root package name */
    public final s f24589e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f24590f;

    public r() {
        this(0, 0L, 0L, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f24585a == rVar.f24585a && this.f24586b == rVar.f24586b && this.f24587c == rVar.f24587c && kotlin.jvm.internal.r.a(this.f24588d, rVar.f24588d) && kotlin.jvm.internal.r.a(this.f24589e, rVar.f24589e) && kotlin.jvm.internal.r.a(this.f24590f, rVar.f24590f);
    }

    public final int hashCode() {
        int iHashCode = (this.f24588d.f24578a.hashCode() + e2.a(e2.a(this.f24585a * 31, 31, this.f24586b), 31, this.f24587c)) * 31;
        s sVar = this.f24589e;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Object obj = this.f24590f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.f24585a + ", requestMillis=" + this.f24586b + ", responseMillis=" + this.f24587c + ", headers=" + this.f24588d + ", body=" + this.f24589e + ", delegate=" + this.f24590f + ')';
    }

    public r(int i10, long j10, long j11, o oVar, s sVar, Object obj) {
        this.f24585a = i10;
        this.f24586b = j10;
        this.f24587c = j11;
        this.f24588d = oVar;
        this.f24589e = sVar;
        this.f24590f = obj;
    }

    public /* synthetic */ r(int i10, long j10, long j11, o oVar, int i11) {
        this((i11 & 1) != 0 ? DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE : i10, (i11 & 2) != 0 ? 0L : j10, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? o.f24577b : oVar, null, null);
    }
}
