package s;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class w implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f23959a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23960b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23961c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23962d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23963e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23964f;

    public w(float f10, float f11, float f12, float f13) {
        int iA;
        this.f23959a = f10;
        this.f23960b = f11;
        this.f23961c = f12;
        this.f23962d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            x0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        float[] fArr = new float[5];
        float f14 = (f11 - CropImageView.DEFAULT_ASPECT_RATIO) * 3.0f;
        float f15 = (f13 - f11) * 3.0f;
        float f16 = (1.0f - f13) * 3.0f;
        double d10 = f14;
        double d11 = f15;
        double d12 = f16;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            iA = d11 == d12 ? 0 : q1.o0.a((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int iA2 = q1.o0.a((float) ((-(d15 + d16)) / d14), fArr, 0);
            int iA3 = q1.o0.a((float) ((d15 - d16) / d14), fArr, iA2) + iA2;
            if (iA3 > 1) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                if (f17 > f18) {
                    fArr[0] = f18;
                    fArr[1] = f17;
                } else if (f17 == f18) {
                    iA = iA3 - 1;
                }
                iA = iA3;
            } else {
                iA = iA3;
            }
        }
        float f19 = (f15 - f14) * 2.0f;
        int iA4 = q1.o0.a((-f19) / (((f16 - f15) * 2.0f) - f19), fArr, iA) + iA;
        float fMin = Math.min(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        for (int i10 = 0; i10 < iA4; i10++) {
            float f20 = fArr[i10];
            float f21 = (((((((((f11 - f13) * 3.0f) + 1.0f) - CropImageView.DEFAULT_ASPECT_RATIO) * f20) + (((f13 - (f11 * 2.0f)) + CropImageView.DEFAULT_ASPECT_RATIO) * 3.0f)) * f20) + f14) * f20) + CropImageView.DEFAULT_ASPECT_RATIO;
            fMin = Math.min(fMin, f21);
            fMax = Math.max(fMax, f21);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & BodyPartID.bodyIdMax);
        this.f23963e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f23964f = Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // s.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f10) {
        float f11;
        if (f10 <= CropImageView.DEFAULT_ASPECT_RATIO || f10 >= 1.0f) {
            return f10;
        }
        float fMax = Math.max(f10, 1.1920929E-7f);
        float f12 = CropImageView.DEFAULT_ASPECT_RATIO - fMax;
        float f13 = this.f23959a;
        float f14 = this.f23961c;
        float f15 = f14 - fMax;
        double d10 = f12;
        float f16 = 0.0f;
        double d11 = ((d10 - ((f13 - fMax) * 2.0d)) + f15) * 3.0d;
        double d12 = (r7 - f12) * 3.0d;
        double d13 = ((r7 - f15) * 3.0d) + (-f12) + (1.0f - fMax);
        float f17 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = d10 / d13;
            double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d19 = d17 * d17 * d17;
            double d20 = (d18 * d18) + d19;
            double d21 = d14 / 3.0d;
            if (d20 < 0.0d) {
                double dSqrt = Math.sqrt(-d19);
                double d22 = (-d18) / dSqrt;
                if (d22 < -1.0d) {
                    d22 = -1.0d;
                }
                if (d22 > 1.0d) {
                    d22 = 1.0d;
                }
                double dAcos = Math.acos(d22);
                double dA = h3.b.a((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dA) - d21);
                float f18 = fCos < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : fCos;
                if (f18 > 1.0f) {
                    f18 = 1.0f;
                }
                if (Math.abs(f18 - fCos) > 1.05E-6f) {
                    f18 = Float.NaN;
                }
                if (Float.isNaN(f18)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dA) - d21);
                    f18 = fCos2 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : fCos2;
                    if (f18 > 1.0f) {
                        f18 = 1.0f;
                    }
                    if (Math.abs(f18 - fCos2) > 1.05E-6f) {
                        f18 = Float.NaN;
                    }
                    if (Float.isNaN(f18)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dA) - d21);
                        if (fCos3 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                            f16 = fCos3;
                        }
                        f11 = f16 > 1.0f ? 1.0f : f16;
                        if (Math.abs(f11 - fCos3) <= 1.05E-6f) {
                        }
                    }
                } else {
                    f17 = f18;
                }
            } else if (d20 == 0.0d) {
                float f19 = -h3.b.a((float) d18);
                float f20 = (float) d21;
                float f21 = (f19 * 2.0f) - f20;
                float f22 = f21 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f21;
                if (f22 > 1.0f) {
                    f22 = 1.0f;
                }
                if (Math.abs(f22 - f21) > 1.05E-6f) {
                    f22 = Float.NaN;
                }
                if (Float.isNaN(f22)) {
                    float f23 = (-f19) - f20;
                    if (f23 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        f16 = f23;
                    }
                    f11 = f16 > 1.0f ? 1.0f : f16;
                    if (Math.abs(f11 - f23) <= 1.05E-6f) {
                    }
                } else {
                    f17 = f22;
                }
            } else {
                double dSqrt2 = Math.sqrt(d20);
                float fA = (float) ((h3.b.a((float) ((-d18) + dSqrt2)) - h3.b.a((float) (d18 + dSqrt2))) - d21);
                if (fA >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f16 = fA;
                }
                f11 = f16 > 1.0f ? 1.0f : f16;
                if (Math.abs(f11 - fA) <= 1.05E-6f) {
                }
            }
        } else if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d23 = d11 * 2.0d;
            float f24 = (float) ((dSqrt3 - d12) / d23);
            float f25 = f24 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f24;
            if (f25 > 1.0f) {
                f25 = 1.0f;
            }
            if (Math.abs(f25 - f24) > 1.05E-6f) {
                f25 = Float.NaN;
            }
            if (Float.isNaN(f25)) {
                float f26 = (float) (((-d12) - dSqrt3) / d23);
                if (f26 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f16 = f26;
                }
                f11 = f16 > 1.0f ? 1.0f : f16;
                if (Math.abs(f11 - f26) <= 1.05E-6f) {
                }
            } else {
                f17 = f25;
            }
        } else if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
            float f27 = (float) ((-d10) / d12);
            if (f27 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                f16 = f27;
            }
            f11 = f16 > 1.0f ? 1.0f : f16;
            if (Math.abs(f11 - f27) <= 1.05E-6f) {
                f17 = f11;
            }
        }
        boolean zIsNaN = Float.isNaN(f17);
        float f28 = this.f23962d;
        float f29 = this.f23960b;
        if (!zIsNaN) {
            float f30 = ((((((f29 - f28) + 0.33333334f) * f17) + (f28 - (2.0f * f29))) * f17) + f29) * 3.0f * f17;
            float f31 = this.f23963e;
            if (f30 < f31) {
                f30 = f31;
            }
            float f32 = this.f23964f;
            return f30 > f32 ? f32 : f30;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f13 + ", " + f29 + ", " + f14 + ", " + f28 + ") has no solution at " + f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f23959a == wVar.f23959a && this.f23960b == wVar.f23960b && this.f23961c == wVar.f23961c && this.f23962d == wVar.f23962d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23962d) + r.z1.a(this.f23961c, r.z1.a(this.f23960b, Float.hashCode(this.f23959a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f23959a);
        sb.append(", b=");
        sb.append(this.f23960b);
        sb.append(", c=");
        sb.append(this.f23961c);
        sb.append(", d=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f23962d, ')');
    }
}
