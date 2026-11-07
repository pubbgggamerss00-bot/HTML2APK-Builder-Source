package q9;

import java.util.Arrays;
import q9.q;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: a, reason: collision with root package name */
    public final long f22562a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f22563b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22564c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f22565d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22566e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22567f;

    /* renamed from: g, reason: collision with root package name */
    public final s f22568g;

    public static final class a extends q.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f22569a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f22570b;

        /* renamed from: c, reason: collision with root package name */
        public Long f22571c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f22572d;

        /* renamed from: e, reason: collision with root package name */
        public String f22573e;

        /* renamed from: f, reason: collision with root package name */
        public Long f22574f;

        /* renamed from: g, reason: collision with root package name */
        public n f22575g;
    }

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, s sVar) {
        this.f22562a = j10;
        this.f22563b = num;
        this.f22564c = j11;
        this.f22565d = bArr;
        this.f22566e = str;
        this.f22567f = j12;
        this.f22568g = sVar;
    }

    @Override // q9.q
    public final Integer a() {
        return this.f22563b;
    }

    @Override // q9.q
    public final long b() {
        return this.f22562a;
    }

    @Override // q9.q
    public final long c() {
        return this.f22564c;
    }

    @Override // q9.q
    public final s d() {
        return this.f22568g;
    }

    @Override // q9.q
    public final byte[] e() {
        return this.f22565d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f22562a != qVar.b()) {
            return false;
        }
        Integer num = this.f22563b;
        if (num == null) {
            if (qVar.a() != null) {
                return false;
            }
        } else if (!num.equals(qVar.a())) {
            return false;
        }
        if (this.f22564c != qVar.c()) {
            return false;
        }
        if (!Arrays.equals(this.f22565d, qVar instanceof k ? ((k) qVar).f22565d : qVar.e())) {
            return false;
        }
        String str = this.f22566e;
        if (str == null) {
            if (qVar.f() != null) {
                return false;
            }
        } else if (!str.equals(qVar.f())) {
            return false;
        }
        if (this.f22567f != qVar.g()) {
            return false;
        }
        s sVar = this.f22568g;
        return sVar == null ? qVar.d() == null : sVar.equals(qVar.d());
    }

    @Override // q9.q
    public final String f() {
        return this.f22566e;
    }

    @Override // q9.q
    public final long g() {
        return this.f22567f;
    }

    public final int hashCode() {
        long j10 = this.f22562a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f22563b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f22564c;
        int iHashCode2 = (((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f22565d)) * 1000003;
        String str = this.f22566e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f22567f;
        int i11 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        s sVar = this.f22568g;
        return i11 ^ (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f22562a + ", eventCode=" + this.f22563b + ", eventUptimeMs=" + this.f22564c + ", sourceExtension=" + Arrays.toString(this.f22565d) + ", sourceExtensionJsonProto3=" + this.f22566e + ", timezoneOffsetSeconds=" + this.f22567f + ", networkConnectionInfo=" + this.f22568g + "}";
    }
}
