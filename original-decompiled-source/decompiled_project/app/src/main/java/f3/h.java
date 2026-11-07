package f3;

/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: a, reason: collision with root package name */
    public final float f8817a;

    public static final boolean a(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static String b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return Float.compare(this.f8817a, hVar.f8817a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return Float.compare(this.f8817a, ((h) obj).f8817a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8817a);
    }

    public final String toString() {
        return b(this.f8817a);
    }
}
