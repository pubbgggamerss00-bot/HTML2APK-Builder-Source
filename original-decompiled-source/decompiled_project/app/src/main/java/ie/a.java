package ie;

import b.o;
import ie.c;
import ie.d;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f14499b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f14500c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14501d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14502e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14503f;

    /* renamed from: g, reason: collision with root package name */
    public final long f14504g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14505h;

    /* renamed from: ie.a$a, reason: collision with other inner class name */
    public static final class C0136a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f14506a;

        /* renamed from: b, reason: collision with root package name */
        public c.a f14507b;

        /* renamed from: c, reason: collision with root package name */
        public String f14508c;

        /* renamed from: d, reason: collision with root package name */
        public String f14509d;

        /* renamed from: e, reason: collision with root package name */
        public Long f14510e;

        /* renamed from: f, reason: collision with root package name */
        public Long f14511f;

        /* renamed from: g, reason: collision with root package name */
        public String f14512g;

        public final a a() {
            String strConcat = this.f14507b == null ? " registrationStatus" : "";
            if (this.f14510e == null) {
                strConcat = strConcat.concat(" expiresInSecs");
            }
            if (strConcat.isEmpty()) {
                return new a(this.f14506a, this.f14507b, this.f14508c, this.f14509d, this.f14510e.longValue(), this.f14511f.longValue(), this.f14512g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f14499b = str;
        this.f14500c = aVar;
        this.f14501d = str2;
        this.f14502e = str3;
        this.f14503f = j10;
        this.f14504g = j11;
        this.f14505h = str4;
    }

    @Override // ie.d
    public final String a() {
        return this.f14501d;
    }

    @Override // ie.d
    public final long b() {
        return this.f14503f;
    }

    @Override // ie.d
    public final String c() {
        return this.f14499b;
    }

    @Override // ie.d
    public final String d() {
        return this.f14505h;
    }

    @Override // ie.d
    public final String e() {
        return this.f14502e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f14499b;
        if (str == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!str.equals(dVar.c())) {
            return false;
        }
        if (!this.f14500c.equals(dVar.f())) {
            return false;
        }
        String str2 = this.f14501d;
        if (str2 == null) {
            if (dVar.a() != null) {
                return false;
            }
        } else if (!str2.equals(dVar.a())) {
            return false;
        }
        String str3 = this.f14502e;
        if (str3 == null) {
            if (dVar.e() != null) {
                return false;
            }
        } else if (!str3.equals(dVar.e())) {
            return false;
        }
        if (this.f14503f != dVar.b() || this.f14504g != dVar.g()) {
            return false;
        }
        String str4 = this.f14505h;
        return str4 == null ? dVar.d() == null : str4.equals(dVar.d());
    }

    @Override // ie.d
    public final c.a f() {
        return this.f14500c;
    }

    @Override // ie.d
    public final long g() {
        return this.f14504g;
    }

    public final C0136a h() {
        C0136a c0136a = new C0136a();
        c0136a.f14506a = this.f14499b;
        c0136a.f14507b = this.f14500c;
        c0136a.f14508c = this.f14501d;
        c0136a.f14509d = this.f14502e;
        c0136a.f14510e = Long.valueOf(this.f14503f);
        c0136a.f14511f = Long.valueOf(this.f14504g);
        c0136a.f14512g = this.f14505h;
        return c0136a;
    }

    public final int hashCode() {
        String str = this.f14499b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f14500c.hashCode()) * 1000003;
        String str2 = this.f14501d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14502e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f14503f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f14504g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f14505h;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f14499b);
        sb.append(", registrationStatus=");
        sb.append(this.f14500c);
        sb.append(", authToken=");
        sb.append(this.f14501d);
        sb.append(", refreshToken=");
        sb.append(this.f14502e);
        sb.append(", expiresInSecs=");
        sb.append(this.f14503f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f14504g);
        sb.append(", fisError=");
        return o.a(sb, this.f14505h, "}");
    }
}
