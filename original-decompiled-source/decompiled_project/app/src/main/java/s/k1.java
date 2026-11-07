package s;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public float f23799a;

    /* renamed from: b, reason: collision with root package name */
    public double f23800b;

    /* renamed from: c, reason: collision with root package name */
    public float f23801c;

    public final long a(float f10, float f11, long j10) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f12 = f10 - this.f23799a;
        double d10 = j10 / 1000.0d;
        float f13 = this.f23801c;
        double d11 = f13 * f13;
        double d12 = this.f23800b;
        double d13 = (-f13) * d12;
        if (f13 > 1.0f) {
            double dSqrt = Math.sqrt(d11 - 1) * d12;
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f12;
            double d17 = ((d15 * d16) - f11) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            dSin = (Math.exp(d20) * d17) + (Math.exp(d19) * d18);
            dExp = Math.exp(d19) * d18 * d15;
            dExp2 = Math.exp(d20) * d17 * d14;
        } else {
            if (f13 != 1.0f) {
                double d21 = 1;
                double dSqrt2 = Math.sqrt(d21 - d11) * d12;
                double d22 = f12;
                double d23 = (((-d13) * d22) + f11) * (d21 / dSqrt2);
                double d24 = dSqrt2 * d10;
                double d25 = d10 * d13;
                dSin = ((Math.sin(d24) * d23) + (Math.cos(d24) * d22)) * Math.exp(d25);
                dCos = (((Math.cos(d24) * dSqrt2 * d23) + (Math.sin(d24) * (-dSqrt2) * d22)) * Math.exp(d25)) + (d13 * dSin);
                float f14 = (float) dCos;
                return (Float.floatToRawIntBits(f14) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits((float) (dSin + this.f23799a)) << 32);
            }
            double d26 = f12;
            double d27 = (d12 * d26) + f11;
            double d28 = (-d12) * d10;
            double d29 = (d10 * d27) + d26;
            dSin = Math.exp(d28) * d29;
            dExp = Math.exp(d28) * d29 * (-this.f23800b);
            dExp2 = Math.exp(d28) * d27;
        }
        dCos = dExp2 + dExp;
        float f142 = (float) dCos;
        return (Float.floatToRawIntBits(f142) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits((float) (dSin + this.f23799a)) << 32);
    }
}
