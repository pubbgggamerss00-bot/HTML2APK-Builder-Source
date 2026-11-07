package e3;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8363a;

    public static String a(int i10) {
        return i10 == 1 ? "Left" : i10 == 2 ? "Right" : i10 == 3 ? "Center" : i10 == 4 ? "Justify" : i10 == 5 ? "Start" : i10 == 6 ? "End" : i10 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f8363a == ((h) obj).f8363a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8363a);
    }

    public final String toString() {
        return a(this.f8363a);
    }
}
