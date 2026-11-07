package y9;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final long f34322a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.r f34323b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.n f34324c;

    public b(long j10, r9.r rVar, r9.n nVar) {
        this.f34322a = j10;
        if (rVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f34323b = rVar;
        if (nVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f34324c = nVar;
    }

    @Override // y9.f
    public final r9.n a() {
        return this.f34324c;
    }

    @Override // y9.f
    public final long b() {
        return this.f34322a;
    }

    @Override // y9.f
    public final r9.r c() {
        return this.f34323b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f34322a == fVar.b() && this.f34323b.equals(fVar.c()) && this.f34324c.equals(fVar.a());
    }

    public final int hashCode() {
        long j10 = this.f34322a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f34323b.hashCode()) * 1000003) ^ this.f34324c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f34322a + ", transportContext=" + this.f34323b + ", event=" + this.f34324c + "}";
    }
}
