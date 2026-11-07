package r2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f14269a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f14270b;

    public c(String str, long j6) {
        this.f14269a = str;
        this.f14270b = Long.valueOf(j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Long l4 = cVar.f14270b;
        if (!this.f14269a.equals(cVar.f14269a)) {
            return false;
        }
        Long l6 = this.f14270b;
        return l6 != null ? l6.equals(l4) : l4 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f14269a.hashCode() * 31;
        Long l4 = this.f14270b;
        return iHashCode + (l4 != null ? l4.hashCode() : 0);
    }
}
