package e3;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f8368a;

    public static String a(int i10) {
        return i10 == 1 ? "Ltr" : i10 == 2 ? "Rtl" : i10 == 3 ? "Content" : i10 == 4 ? "ContentOrLtr" : i10 == 5 ? "ContentOrRtl" : i10 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f8368a == ((j) obj).f8368a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8368a);
    }

    public final String toString() {
        return a(this.f8368a);
    }
}
