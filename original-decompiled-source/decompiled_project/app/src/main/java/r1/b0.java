package r1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f23070a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23071b;

    public b0(float f10, float f11) {
        this.f23070a = f10;
        this.f23071b = f11;
    }

    public final float[] a() {
        float f10 = this.f23070a;
        float f11 = this.f23071b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Float.compare(this.f23070a, b0Var.f23070a) == 0 && Float.compare(this.f23071b, b0Var.f23071b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23071b) + (Float.hashCode(this.f23070a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f23070a);
        sb.append(", y=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f23071b, ')');
    }
}
