package t0;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f14401a;

    /* renamed from: b, reason: collision with root package name */
    public final S f14402b;

    public b(F f6, S s) {
        this.f14401a = f6;
        this.f14402b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f14401a, this.f14401a) && Objects.equals(bVar.f14402b, this.f14402b);
    }

    public final int hashCode() {
        F f6 = this.f14401a;
        int iHashCode = f6 == null ? 0 : f6.hashCode();
        S s = this.f14402b;
        return (s != null ? s.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f14401a + " " + this.f14402b + "}";
    }
}
