package r2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f14272a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14273b;

    public e(String str, int i6) {
        this.f14272a = str;
        this.f14273b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f14273b != eVar.f14273b) {
            return false;
        }
        return this.f14272a.equals(eVar.f14272a);
    }

    public final int hashCode() {
        return (this.f14272a.hashCode() * 31) + this.f14273b;
    }
}
