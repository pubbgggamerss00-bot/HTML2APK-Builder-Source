package id;

/* loaded from: classes2.dex */
public final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    public final long f14472a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14473b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14474c;

    public a(long j10, long j11, long j12) {
        this.f14472a = j10;
        this.f14473b = j11;
        this.f14474c = j12;
    }

    @Override // id.n
    public final long a() {
        return this.f14473b;
    }

    @Override // id.n
    public final long b() {
        return this.f14472a;
    }

    @Override // id.n
    public final long c() {
        return this.f14474c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f14472a == nVar.b() && this.f14473b == nVar.a() && this.f14474c == nVar.c();
    }

    public final int hashCode() {
        long j10 = this.f14472a;
        long j11 = this.f14473b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f14474c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f14472a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f14473b);
        sb.append(", uptimeMillis=");
        return com.android.apksig.internal.apk.a.a(this.f14474c, "}", sb);
    }
}
