package r1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final double f23058a;

    /* renamed from: b, reason: collision with root package name */
    public final double f23059b;

    /* renamed from: c, reason: collision with root package name */
    public final double f23060c;

    /* renamed from: d, reason: collision with root package name */
    public final double f23061d;

    /* renamed from: e, reason: collision with root package name */
    public final double f23062e;

    /* renamed from: f, reason: collision with root package name */
    public final double f23063f;

    /* renamed from: g, reason: collision with root package name */
    public final double f23064g;

    public /* synthetic */ a0(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Double.compare(this.f23058a, a0Var.f23058a) == 0 && Double.compare(this.f23059b, a0Var.f23059b) == 0 && Double.compare(this.f23060c, a0Var.f23060c) == 0 && Double.compare(this.f23061d, a0Var.f23061d) == 0 && Double.compare(this.f23062e, a0Var.f23062e) == 0 && Double.compare(this.f23063f, a0Var.f23063f) == 0 && Double.compare(this.f23064g, a0Var.f23064g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f23064g) + ((Double.hashCode(this.f23063f) + ((Double.hashCode(this.f23062e) + ((Double.hashCode(this.f23061d) + ((Double.hashCode(this.f23060c) + ((Double.hashCode(this.f23059b) + (Double.hashCode(this.f23058a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f23058a + ", a=" + this.f23059b + ", b=" + this.f23060c + ", c=" + this.f23061d + ", d=" + this.f23062e + ", e=" + this.f23063f + ", f=" + this.f23064g + ')';
    }

    public a0(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f23058a = d10;
        this.f23059b = d11;
        this.f23060c = d12;
        this.f23061d = d13;
        this.f23062e = d14;
        this.f23063f = d15;
        this.f23064g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
