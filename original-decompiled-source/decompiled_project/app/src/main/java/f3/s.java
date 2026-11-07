package f3;

/* loaded from: classes.dex */
public final class s implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8831a;

    public s(float f10) {
        this.f8831a = f10;
    }

    @Override // g3.a
    public final float a(float f10) {
        return f10 / this.f8831a;
    }

    @Override // g3.a
    public final float b(float f10) {
        return f10 * this.f8831a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Float.compare(this.f8831a, ((s) obj).f8831a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8831a);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f8831a, ')');
    }
}
