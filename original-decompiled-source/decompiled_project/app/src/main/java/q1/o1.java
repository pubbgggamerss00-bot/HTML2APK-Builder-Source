package q1;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21722a;

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            return this.f21722a == ((o1) obj).f21722a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21722a);
    }

    public final String toString() {
        int i10 = this.f21722a;
        return i10 == 0 ? "Argb8888" : i10 == 1 ? "Alpha8" : i10 == 2 ? "Rgb565" : i10 == 3 ? "F16" : i10 == 4 ? "Gpu" : "Unknown";
    }
}
