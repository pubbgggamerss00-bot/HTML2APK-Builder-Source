package x2;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f32013a;

    public b(int i10) {
        this.f32013a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f32013a == ((b) obj).f32013a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32013a);
    }

    public final String toString() {
        return b.b.a(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f32013a, ')');
    }
}
