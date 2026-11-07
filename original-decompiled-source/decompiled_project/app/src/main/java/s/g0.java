package s;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f23750a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f23751b;

    public g0(float f10, float f11, float f12) {
        this.f23750a = f12;
        k1 k1Var = new k1();
        k1Var.f23799a = 1.0f;
        k1Var.f23800b = Math.sqrt(50.0d);
        k1Var.f23801c = 1.0f;
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            x0.a("Damping ratio must be non-negative");
        }
        k1Var.f23801c = f10;
        double d10 = k1Var.f23800b;
        if (((float) (d10 * d10)) <= CropImageView.DEFAULT_ASPECT_RATIO) {
            x0.a("Spring stiffness constant must be positive.");
        }
        k1Var.f23800b = Math.sqrt(f11);
        this.f23751b = k1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // s.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(float f10, float f11, float f12) {
        double dLog;
        int i10;
        long j10;
        k1 k1Var = this.f23751b;
        double d10 = k1Var.f23800b;
        float f13 = (float) (d10 * d10);
        float f14 = k1Var.f23801c;
        float f15 = this.f23750a;
        float f16 = (f10 - f11) / f15;
        float f17 = f12 / f15;
        if (f14 == CropImageView.DEFAULT_ASPECT_RATIO) {
            j10 = 9223372036854L;
        } else {
            double d11 = f13;
            double d12 = f14;
            double d13 = f17;
            double d14 = f16;
            double d15 = 1.0f;
            double dSqrt = d12 * 2.0d * Math.sqrt(d11);
            double d16 = (dSqrt * dSqrt) - (d11 * 4.0d);
            double dSqrt2 = d16 < 0.0d ? 0.0d : Math.sqrt(d16);
            double d17 = -dSqrt;
            double d18 = (d17 + dSqrt2) * 0.5d;
            double dSqrt3 = (d16 < 0.0d ? Math.sqrt(Math.abs(d16)) : 0.0d) * 0.5d;
            double d19 = (d17 - dSqrt2) * 0.5d;
            if (d14 == 0.0d && d13 == 0.0d) {
                j10 = 0;
            } else {
                if (d14 < 0.0d) {
                    d13 = -d13;
                }
                double dAbs = Math.abs(d14);
                double dAbs2 = Double.MAX_VALUE;
                if (d12 > 1.0d) {
                    double d20 = (d18 * dAbs) - d13;
                    double d21 = d18 - d19;
                    double d22 = d20 / d21;
                    double d23 = dAbs - d22;
                    dLog = Math.log(Math.abs(d15 / d23)) / d18;
                    double dLog2 = Math.log(Math.abs(d15 / d22)) / d19;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d24 = d23 * d18;
                    double dLog3 = Math.log(d24 / ((-d22) * d19)) / (d19 - d18);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d15 = -d15;
                    } else if (dLog3 > 0.0d) {
                        if ((-((Math.exp(dLog3 * d19) * d22) + (Math.exp(d18 * dLog3) * d23))) < d15) {
                            d15 = -d15;
                            dLog = (d22 <= 0.0d || d23 >= 0.0d) ? dLog : 0.0d;
                        } else {
                            dLog = Math.log((-((d22 * d19) * d19)) / (d24 * d18)) / d21;
                        }
                    }
                    double d25 = d22 * d19;
                    if (Math.abs((Math.exp(d19 * dLog) * d25) + (Math.exp(d18 * dLog) * d24)) >= 1.0E-4d) {
                        int i11 = 0;
                        while (dAbs2 > 0.001d && i11 < 100) {
                            i11++;
                            double d26 = d18 * dLog;
                            double d27 = d19 * dLog;
                            double dExp = dLog - ((((Math.exp(d27) * d22) + (Math.exp(d26) * d23)) + d15) / ((Math.exp(d27) * d25) + (Math.exp(d26) * d24)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d12 < 1.0d) {
                    double d28 = (d13 - (d18 * dAbs)) / dSqrt3;
                    dLog = Math.log(d15 / Math.sqrt((d28 * d28) + (dAbs * dAbs))) / d18;
                } else {
                    double d29 = d18 * dAbs;
                    double d30 = d13 - d29;
                    double dLog4 = Math.log(Math.abs(d15 / dAbs)) / d18;
                    double dLog5 = Math.log(Math.abs(d15 / d30));
                    double dLog6 = dLog5;
                    for (int i12 = 0; i12 < 6; i12++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d18));
                    }
                    double d31 = dLog6 / d18;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d31;
                    } else if ((Double.doubleToRawLongBits(d31) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d31);
                    }
                    double d32 = (-(d29 + d30)) / (d18 * d30);
                    double d33 = d18 * d32;
                    double dExp2 = (Math.exp(d33) * d30 * d32) + (Math.exp(d33) * dAbs);
                    if (Double.isNaN(d32) || d32 <= 0.0d) {
                        d15 = -d15;
                        dLog = dLog4;
                        i10 = 0;
                        while (dAbs2 > 0.001d && i10 < 100) {
                            i10++;
                            double d34 = d18 * dLog;
                            double dExp3 = dLog - (((Math.exp(d34) * ((d30 * dLog) + dAbs)) + d15) / (Math.exp(d34) * (((1 + d34) * d30) + d29)));
                            dAbs2 = Math.abs(dLog - dExp3);
                            dLog = dExp3;
                        }
                        break;
                    }
                    if (d32 <= 0.0d || (-dExp2) >= d15) {
                        dLog4 = (-(2.0d / d18)) - (dAbs / d30);
                        dLog = dLog4;
                        i10 = 0;
                        while (dAbs2 > 0.001d) {
                            i10++;
                            double d342 = d18 * dLog;
                            double dExp32 = dLog - (((Math.exp(d342) * ((d30 * dLog) + dAbs)) + d15) / (Math.exp(d342) * (((1 + d342) * d30) + d29)));
                            dAbs2 = Math.abs(dLog - dExp32);
                            dLog = dExp32;
                        }
                    } else {
                        if (d30 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d15 = -d15;
                        dLog = dLog4;
                        i10 = 0;
                        while (dAbs2 > 0.001d) {
                        }
                    }
                }
                j10 = (long) (dLog * 1000.0d);
            }
        }
        return j10 * 1000000;
    }

    @Override // s.f0
    public final float c(float f10, float f11, float f12, long j10) {
        k1 k1Var = this.f23751b;
        k1Var.f23799a = f11;
        return Float.intBitsToFloat((int) (k1Var.a(f10, f12, j10 / 1000000) & BodyPartID.bodyIdMax));
    }

    @Override // s.f0
    public final float d(float f10, float f11, float f12) {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // s.f0
    public final float e(float f10, float f11, float f12, long j10) {
        k1 k1Var = this.f23751b;
        k1Var.f23799a = f11;
        return Float.intBitsToFloat((int) (k1Var.a(f10, f12, j10 / 1000000) >> 32));
    }
}
