package r;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f22764a;

    /* renamed from: r.a$a, reason: collision with other inner class name */
    public static final class C0254a {

        /* renamed from: a, reason: collision with root package name */
        public final float f22765a;

        /* renamed from: b, reason: collision with root package name */
        public final float f22766b;

        public C0254a(float f10, float f11) {
            this.f22765a = f10;
            this.f22766b = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0254a)) {
                return false;
            }
            C0254a c0254a = (C0254a) obj;
            return Float.compare(this.f22765a, c0254a.f22765a) == 0 && Float.compare(this.f22766b, c0254a.f22766b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f22766b) + (Float.hashCode(this.f22765a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.f22765a);
            sb.append(", velocityCoefficient=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f22766b, ')');
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float[] fArr = new float[101];
        f22764a = fArr;
        float[] fArr2 = new float[101];
        float f19 = CropImageView.DEFAULT_ASPECT_RATIO;
        int i10 = 0;
        float f20 = 0.0f;
        while (true) {
            float f21 = 1.0f;
            if (i10 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f22 = i10 / 100;
            float f23 = 1.0f;
            while (true) {
                f10 = ((f23 - f19) / 2.0f) + f19;
                f11 = f21 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f24 = (((f10 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
                f14 = f21;
                if (Math.abs(f24 - f22) < 1.0E-5d) {
                    break;
                }
                if (f24 > f22) {
                    f23 = f10;
                } else {
                    f19 = f10;
                }
                f21 = f14;
            }
            float f25 = 0.5f;
            fArr[i10] = (((f11 * 0.5f) + f10) * f12) + f13;
            float f26 = f14;
            while (true) {
                f15 = ((f26 - f20) / 2.0f) + f20;
                f16 = f14 - f15;
                f17 = f15 * 3.0f * f16;
                f18 = f15 * f15 * f15;
                float f27 = (((f16 * f25) + f15) * f17) + f18;
                float f28 = f26;
                if (Math.abs(f27 - f22) >= 1.0E-5d) {
                    if (f27 > f22) {
                        f26 = f15;
                    } else {
                        f20 = f15;
                        f26 = f28;
                    }
                    f25 = 0.5f;
                }
            }
            fArr2[i10] = (((f15 * 0.35000002f) + (f16 * 0.175f)) * f17) + f18;
            i10++;
        }
    }

    public static C0254a a(float f10) {
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f12 = 1.0f;
        float fL = jh.j.l(f10, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fL);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f22764a;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float fA = org.bouncycastle.jcajce.provider.digest.c.a(fL, f14, f17, f16);
            f11 = f17;
            f12 = fA;
        }
        return new C0254a(f12, f11);
    }
}
