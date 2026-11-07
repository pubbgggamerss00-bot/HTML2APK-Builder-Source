package n2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13913a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13914b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13915c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13916d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13913a == bVar.f13913a && this.f13914b == bVar.f13914b && this.f13915c == bVar.f13915c && this.f13916d == bVar.f13916d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r02 = this.f13913a;
        int i6 = r02;
        if (this.f13914b) {
            i6 = r02 + 16;
        }
        int i7 = i6;
        if (this.f13915c) {
            i7 = i6 + 256;
        }
        return this.f13916d ? i7 + 4096 : i7;
    }

    public final String toString() {
        return "[ Connected=" + this.f13913a + " Validated=" + this.f13914b + " Metered=" + this.f13915c + " NotRoaming=" + this.f13916d + " ]";
    }
}
