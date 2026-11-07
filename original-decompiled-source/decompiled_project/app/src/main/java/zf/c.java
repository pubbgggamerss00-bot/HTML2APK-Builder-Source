package zf;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f35067a;

    /* renamed from: b, reason: collision with root package name */
    public int f35068b;

    /* renamed from: c, reason: collision with root package name */
    public int f35069c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f35067a == cVar.f35067a && this.f35068b == cVar.f35068b && this.f35069c == cVar.f35069c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f35067a * 31) + this.f35068b) * 31) + this.f35069c;
    }
}
