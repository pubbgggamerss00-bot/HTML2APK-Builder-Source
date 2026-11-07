package je;

import je.f;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f15685a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15686b;

    /* renamed from: c, reason: collision with root package name */
    public final f.b f15687c;

    public static final class a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f15688a;

        /* renamed from: b, reason: collision with root package name */
        public Long f15689b;

        /* renamed from: c, reason: collision with root package name */
        public f.b f15690c;

        public final b a() {
            if ("".isEmpty()) {
                return new b(this.f15688a, this.f15689b.longValue(), this.f15690c);
            }
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
    }

    public b(String str, long j10, f.b bVar) {
        this.f15685a = str;
        this.f15686b = j10;
        this.f15687c = bVar;
    }

    @Override // je.f
    public final f.b b() {
        return this.f15687c;
    }

    @Override // je.f
    public final String c() {
        return this.f15685a;
    }

    @Override // je.f
    public final long d() {
        return this.f15686b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f15685a;
        if (str == null) {
            if (fVar.c() != null) {
                return false;
            }
        } else if (!str.equals(fVar.c())) {
            return false;
        }
        if (this.f15686b != fVar.d()) {
            return false;
        }
        f.b bVar = this.f15687c;
        return bVar == null ? fVar.b() == null : bVar.equals(fVar.b());
    }

    public final int hashCode() {
        String str = this.f15685a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f15686b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        f.b bVar = this.f15687c;
        return (bVar != null ? bVar.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f15685a + ", tokenExpirationTimestamp=" + this.f15686b + ", responseCode=" + this.f15687c + "}";
    }
}
