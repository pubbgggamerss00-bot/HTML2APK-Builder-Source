package y6;

import r.o2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33977a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33978b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33979c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33980d;

    public g(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f33977a = z10;
        this.f33978b = z11;
        this.f33979c = z12;
        this.f33980d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f33977a == gVar.f33977a && this.f33978b == gVar.f33978b && this.f33979c == gVar.f33979c && this.f33980d == gVar.f33980d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33980d) + o2.a(o2.a(Boolean.hashCode(this.f33977a) * 31, 31, this.f33978b), 31, this.f33979c);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f33977a + ", isValidated=" + this.f33978b + ", isMetered=" + this.f33979c + ", isNotRoaming=" + this.f33980d + ')';
    }
}
