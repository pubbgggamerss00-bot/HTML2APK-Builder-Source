package o1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f18860a;

    public static String a(int i10) {
        return i10 == 1 ? "Next" : i10 == 2 ? "Previous" : i10 == 3 ? "Left" : i10 == 4 ? "Right" : i10 == 5 ? "Up" : i10 == 6 ? "Down" : i10 == 7 ? "Enter" : i10 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f18860a == ((e) obj).f18860a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18860a);
    }

    public final String toString() {
        return a(this.f18860a);
    }
}
