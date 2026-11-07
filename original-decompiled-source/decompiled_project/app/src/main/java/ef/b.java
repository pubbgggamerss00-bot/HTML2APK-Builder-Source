package ef;

import c2.u;
import h1.y;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8698a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8699b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8700c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8701d;

    public b(boolean z10, boolean z11, long j10) {
        boolean z12 = false;
        boolean z13 = !z11 || z10;
        j10 = z10 ? j10 : -1L;
        j10 = j10 < -1 ? -1L : j10;
        if (!z13 || j10 != 0) {
            z12 = z13;
        } else if (!z11) {
            z12 = z13;
            j10 = -1;
        }
        this.f8698a = z12;
        this.f8699b = z11;
        this.f8700c = j10;
        this.f8701d = -1L;
    }

    public final String toString() {
        boolean z10 = this.f8698a;
        long j10 = this.f8701d;
        if (!z10) {
            return j10 > 0 ? u.a("Scratch file only with max. of ", " bytes", j10) : "Scratch file only with no size restriction";
        }
        boolean z11 = this.f8699b;
        long j11 = this.f8700c;
        if (!z11) {
            return j11 >= 0 ? u.a("Main memory only with max. of ", " bytes", j11) : "Main memory only with no size restriction";
        }
        StringBuilder sbA = y.a("Mixed mode with max. of ", " main memory bytes", j11);
        sbA.append(j10 > 0 ? u.a(" and max. of ", " storage bytes", j10) : " and unrestricted scratch file size");
        return sbA.toString();
    }
}
