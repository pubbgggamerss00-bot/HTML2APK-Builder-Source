package f9;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9900a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9901b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9902c;

    public k() {
        this(13.0f, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f9900a == kVar.f9900a && this.f9901b == kVar.f9901b && Float.compare(this.f9902c, kVar.f9902c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9902c) + r.o2.a(Boolean.hashCode(this.f9900a) * 31, 31, this.f9901b);
    }

    public final String toString() {
        return "Values(wordWrap=" + this.f9900a + ", smartTyping=" + this.f9901b + ", fontSize=" + this.f9902c + ")";
    }

    public k(float f10, boolean z10, boolean z11) {
        this.f9900a = z10;
        this.f9901b = z11;
        this.f9902c = f10;
    }
}
