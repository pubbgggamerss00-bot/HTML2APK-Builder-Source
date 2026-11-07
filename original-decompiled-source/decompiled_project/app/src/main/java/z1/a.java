package z1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f34720a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f34720a == ((a) obj).f34720a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34720a);
    }

    public final String toString() {
        int i10 = this.f34720a;
        return i10 == 1 ? "Touch" : i10 == 2 ? "Keyboard" : "Error";
    }
}
