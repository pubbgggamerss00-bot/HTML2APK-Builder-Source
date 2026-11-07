package g8;

import r.o2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f11561a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11562b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f11563c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11564d;

    public d(long j10, boolean z10, Long l10, boolean z11) {
        this.f11561a = j10;
        this.f11562b = z10;
        this.f11563c = l10;
        this.f11564d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11561a == dVar.f11561a && this.f11562b == dVar.f11562b && kotlin.jvm.internal.r.a(this.f11563c, dVar.f11563c) && this.f11564d == dVar.f11564d;
    }

    public final int hashCode() {
        int iA = o2.a(Long.hashCode(this.f11561a) * 31, 31, this.f11562b);
        Long l10 = this.f11563c;
        return Boolean.hashCode(this.f11564d) + ((iA + (l10 == null ? 0 : l10.hashCode())) * 31);
    }

    public final String toString() {
        return "AccountProfile(credits=" + this.f11561a + ", proLifetime=" + this.f11562b + ", proMonthlyUntilMillis=" + this.f11563c + ", freeNewApp=" + this.f11564d + ")";
    }
}
