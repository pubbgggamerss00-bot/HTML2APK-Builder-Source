package y2;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f33749a;

    public static String a(int i10) {
        return i10 == -1 ? "Unspecified" : i10 == 0 ? "None" : i10 == 1 ? "Default" : i10 == 2 ? "Go" : i10 == 3 ? "Search" : i10 == 4 ? "Send" : i10 == 5 ? "Previous" : i10 == 6 ? "Next" : i10 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f33749a == ((n) obj).f33749a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33749a);
    }

    public final String toString() {
        return a(this.f33749a);
    }
}
