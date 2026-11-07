package u5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: v, reason: collision with root package name */
    public static final c f14725v = new c(1, 0, 1);

    @Override // u5.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.s == cVar.s && this.f14720t == cVar.f14720t;
    }

    @Override // u5.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.s * 31) + this.f14720t;
    }

    @Override // u5.a
    public final boolean isEmpty() {
        return this.s > this.f14720t;
    }

    @Override // u5.a
    public final String toString() {
        return this.s + ".." + this.f14720t;
    }
}
