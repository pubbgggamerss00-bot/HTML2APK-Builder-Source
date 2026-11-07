package sh;

import x0.s1;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25120a;

    public x0(long j10) {
        this.f25120a = j10;
        if (j10 < 0) {
            throw new IllegalArgumentException(c2.u.a("stopTimeout(", " ms) cannot be negative", j10).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x0) {
            return this.f25120a == ((x0) obj).f25120a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.f25120a) * 31);
    }

    public final String toString() {
        rg.b bVar = new rg.b(2);
        long j10 = this.f25120a;
        if (j10 > 0) {
            bVar.add("stopTimeout=" + j10 + "ms");
        }
        return s1.a(new StringBuilder("SharingStarted.WhileSubscribed("), qg.x.I(c0.g0.a(bVar), null, null, null, null, 63), ')');
    }
}
