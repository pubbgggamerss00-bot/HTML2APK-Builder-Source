package e3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8345a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f8345a, ((a) obj).f8345a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8345a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f8345a + ')';
    }
}
