package jh;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f15742a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15743b;

    public d(float f10, float f11) {
        this.f15742a = f10;
        this.f15743b = f11;
    }

    public final boolean a() {
        return this.f15742a > this.f15743b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (a() && ((d) obj).a()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f15742a == dVar.f15742a && this.f15743b == dVar.f15743b;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.hashCode(this.f15743b) + (Float.hashCode(this.f15742a) * 31);
    }

    public final String toString() {
        return this.f15742a + ".." + this.f15743b;
    }
}
