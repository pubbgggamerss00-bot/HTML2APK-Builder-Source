package jh;

/* loaded from: classes2.dex */
public final class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final g f15751d = new g(1, 0, 1);

    @Override // jh.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return this.f15744a == gVar.f15744a && this.f15745b == gVar.f15745b;
    }

    @Override // jh.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f15744a * 31) + this.f15745b;
    }

    @Override // jh.e
    public final boolean isEmpty() {
        return this.f15744a > this.f15745b;
    }

    @Override // jh.e
    public final String toString() {
        return this.f15744a + ".." + this.f15745b;
    }
}
