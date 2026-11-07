package s9;

import s9.f;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f24770a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24771b;

    public b(f.a aVar, long j10) {
        this.f24770a = aVar;
        this.f24771b = j10;
    }

    @Override // s9.f
    public final long a() {
        return this.f24771b;
    }

    @Override // s9.f
    public final f.a b() {
        return this.f24770a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f24770a.equals(fVar.b()) && this.f24771b == fVar.a();
    }

    public final int hashCode() {
        int iHashCode = (this.f24770a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f24771b;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f24770a);
        sb.append(", nextRequestWaitMillis=");
        return com.android.apksig.internal.apk.a.a(this.f24771b, "}", sb);
    }
}
