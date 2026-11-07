package ge;

/* loaded from: classes2.dex */
public final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f12012a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12013b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12014c;

    public a(String str, long j10, long j11) {
        this.f12012a = str;
        this.f12013b = j10;
        this.f12014c = j11;
    }

    @Override // ge.m
    public final String a() {
        return this.f12012a;
    }

    @Override // ge.m
    public final long b() {
        return this.f12014c;
    }

    @Override // ge.m
    public final long c() {
        return this.f12013b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f12012a.equals(mVar.a()) && this.f12013b == mVar.c() && this.f12014c == mVar.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f12012a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f12013b;
        long j11 = this.f12014c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f12012a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f12013b);
        sb.append(", tokenCreationTimestamp=");
        return com.android.apksig.internal.apk.a.a(this.f12014c, "}", sb);
    }
}
