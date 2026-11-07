package x9;

import java.util.Set;
import x9.e;

/* loaded from: classes.dex */
public final class c extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f33471a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33472b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<e.b> f33473c;

    public c(long j10, long j11, Set set) {
        this.f33471a = j10;
        this.f33472b = j11;
        this.f33473c = set;
    }

    @Override // x9.e.a
    public final long a() {
        return this.f33471a;
    }

    @Override // x9.e.a
    public final Set<e.b> b() {
        return this.f33473c;
    }

    @Override // x9.e.a
    public final long c() {
        return this.f33472b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f33471a == aVar.a() && this.f33472b == aVar.c() && this.f33473c.equals(aVar.b());
    }

    public final int hashCode() {
        long j10 = this.f33471a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f33472b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f33473c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f33471a + ", maxAllowedDelay=" + this.f33472b + ", flags=" + this.f33473c + "}";
    }
}
