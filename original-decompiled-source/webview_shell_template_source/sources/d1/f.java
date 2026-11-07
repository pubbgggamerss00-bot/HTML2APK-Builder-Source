package d1;

import d1.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f12698a;

    /* renamed from: b, reason: collision with root package name */
    public double f12699b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12700c;

    /* renamed from: d, reason: collision with root package name */
    public double f12701d;

    /* renamed from: e, reason: collision with root package name */
    public double f12702e;

    /* renamed from: f, reason: collision with root package name */
    public double f12703f;

    /* renamed from: g, reason: collision with root package name */
    public double f12704g;
    public double h;

    /* renamed from: i, reason: collision with root package name */
    public double f12705i;

    /* renamed from: j, reason: collision with root package name */
    public final d.g f12706j;

    public f() {
        this.f12698a = Math.sqrt(1500.0d);
        this.f12699b = 0.5d;
        this.f12700c = false;
        this.f12705i = Double.MAX_VALUE;
        this.f12706j = new d.g();
    }

    public final d.g a(double d7, double d8, long j6) {
        double dSin;
        double dCos;
        if (!this.f12700c) {
            if (this.f12705i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d9 = this.f12699b;
            if (d9 > 1.0d) {
                double d10 = this.f12698a;
                this.f12703f = (Math.sqrt((d9 * d9) - 1.0d) * d10) + ((-d9) * d10);
                double d11 = this.f12699b;
                double d12 = this.f12698a;
                this.f12704g = ((-d11) * d12) - (Math.sqrt((d11 * d11) - 1.0d) * d12);
            } else if (d9 >= 0.0d && d9 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d9 * d9)) * this.f12698a;
            }
            this.f12700c = true;
        }
        double d13 = j6 / 1000.0d;
        double d14 = d7 - this.f12705i;
        double d15 = this.f12699b;
        if (d15 > 1.0d) {
            double d16 = this.f12704g;
            double d17 = ((d16 * d14) - d8) / (d16 - this.f12703f);
            double d18 = d14 - d17;
            dSin = (Math.pow(2.718281828459045d, this.f12703f * d13) * d17) + (Math.pow(2.718281828459045d, d16 * d13) * d18);
            double d19 = this.f12704g;
            double dPow = Math.pow(2.718281828459045d, d19 * d13) * d18 * d19;
            double d20 = this.f12703f;
            dCos = (Math.pow(2.718281828459045d, d20 * d13) * d17 * d20) + dPow;
        } else if (d15 == 1.0d) {
            double d21 = this.f12698a;
            double d22 = (d21 * d14) + d8;
            double d23 = (d22 * d13) + d14;
            double dPow2 = Math.pow(2.718281828459045d, (-d21) * d13) * d23;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f12698a) * d13) * d23;
            double d24 = -this.f12698a;
            dCos = (Math.pow(2.718281828459045d, d24 * d13) * d22) + (dPow3 * d24);
            dSin = dPow2;
        } else {
            double d25 = 1.0d / this.h;
            double d26 = this.f12698a;
            double d27 = ((d15 * d26 * d14) + d8) * d25;
            dSin = ((Math.sin(this.h * d13) * d27) + (Math.cos(this.h * d13) * d14)) * Math.pow(2.718281828459045d, (-d15) * d26 * d13);
            double d28 = this.f12698a;
            double d29 = this.f12699b;
            double d30 = (-d28) * dSin * d29;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d13);
            double d31 = this.h;
            double dSin2 = Math.sin(d31 * d13) * (-d31) * d14;
            double d32 = this.h;
            dCos = (((Math.cos(d32 * d13) * d27 * d32) + dSin2) * dPow4) + d30;
        }
        float f6 = (float) (dSin + this.f12705i);
        d.g gVar = this.f12706j;
        gVar.f12694a = f6;
        gVar.f12695b = (float) dCos;
        return gVar;
    }

    public f(float f6) {
        this.f12698a = Math.sqrt(1500.0d);
        this.f12699b = 0.5d;
        this.f12700c = false;
        this.f12706j = new d.g();
        this.f12705i = f6;
    }
}
