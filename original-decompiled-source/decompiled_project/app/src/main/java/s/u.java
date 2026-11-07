package s;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final a[][] f23929a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f23930a;

        /* renamed from: b, reason: collision with root package name */
        public final float f23931b;

        /* renamed from: c, reason: collision with root package name */
        public final float f23932c;

        /* renamed from: d, reason: collision with root package name */
        public final float f23933d;

        /* renamed from: e, reason: collision with root package name */
        public final float f23934e;

        /* renamed from: f, reason: collision with root package name */
        public final float f23935f;

        /* renamed from: g, reason: collision with root package name */
        public final float f23936g;

        /* renamed from: h, reason: collision with root package name */
        public float f23937h;

        /* renamed from: i, reason: collision with root package name */
        public float f23938i;

        /* renamed from: j, reason: collision with root package name */
        public final float[] f23939j;

        /* renamed from: k, reason: collision with root package name */
        public final float f23940k;

        /* renamed from: l, reason: collision with root package name */
        public final float f23941l;

        /* renamed from: m, reason: collision with root package name */
        public final float f23942m;

        /* renamed from: n, reason: collision with root package name */
        public final float f23943n;

        /* renamed from: o, reason: collision with root package name */
        public final float f23944o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f23945p;

        /* renamed from: q, reason: collision with root package name */
        public final float f23946q;

        /* renamed from: r, reason: collision with root package name */
        public final float f23947r;

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            boolean z10;
            int i11;
            float f16;
            float[] fArr;
            this.f23930a = f10;
            this.f23931b = f11;
            this.f23932c = f12;
            this.f23933d = f13;
            this.f23934e = f14;
            this.f23935f = f15;
            float f17 = f14 - f12;
            float f18 = f15 - f13;
            float f19 = CropImageView.DEFAULT_ASPECT_RATIO;
            int i12 = 1;
            boolean z11 = i10 == 1 || (i10 == 4 ? f18 > CropImageView.DEFAULT_ASPECT_RATIO : !(i10 != 5 || f18 >= CropImageView.DEFAULT_ASPECT_RATIO));
            float f20 = z11 ? -1.0f : 1.0f;
            this.f23942m = f20;
            float f21 = 1 / (f11 - f10);
            this.f23940k = f21;
            float[] fArr2 = new float[101];
            this.f23939j = fArr2;
            boolean z12 = i10 == 3;
            if (z12 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
                float fHypot = (float) Math.hypot(f18, f17);
                this.f23936g = fHypot;
                this.f23941l = fHypot * f21;
                this.f23946q = f17 * f21;
                this.f23947r = f18 * f21;
                this.f23943n = Float.NaN;
                this.f23944o = Float.NaN;
                z10 = true;
            } else {
                this.f23943n = f17 * f20;
                this.f23944o = f18 * (-f20);
                this.f23946q = z11 ? f14 : f12;
                this.f23947r = z11 ? f13 : f15;
                float f22 = f14 - f12;
                float f23 = f13 - f15;
                float f24 = 90;
                float f25 = f23;
                float fHypot2 = 0.0f;
                float f26 = 0.0f;
                int i13 = 1;
                while (true) {
                    i11 = i12;
                    float f27 = f25;
                    double radians = (float) Math.toRadians((i13 * 90.0d) / 90);
                    float fSin = ((float) Math.sin(radians)) * f22;
                    float fCos = ((float) Math.cos(radians)) * f23;
                    f16 = f19;
                    fHypot2 += (float) Math.hypot(fSin - f26, fCos - f27);
                    fArr = v.f23949a;
                    fArr[i13] = fHypot2;
                    if (i13 == 90) {
                        break;
                    }
                    i13++;
                    f26 = fSin;
                    f19 = f16;
                    f25 = fCos;
                    i12 = i11;
                }
                this.f23936g = fHypot2;
                int i14 = i11;
                while (true) {
                    fArr[i14] = fArr[i14] / fHypot2;
                    if (i14 == 90) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int length = fArr2.length;
                for (int i15 = 0; i15 < length; i15++) {
                    float f28 = i15 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr, 0, 91, f28);
                    if (iBinarySearch >= 0) {
                        fArr2[i15] = iBinarySearch / f24;
                    } else if (iBinarySearch == -1) {
                        fArr2[i15] = f16;
                    } else {
                        int i16 = -iBinarySearch;
                        int i17 = i16 - 2;
                        float f29 = i17;
                        float f30 = fArr[i17];
                        fArr2[i15] = (((f28 - f30) / (fArr[i16 - 1] - f30)) + f29) / f24;
                    }
                }
                this.f23941l = this.f23936g * this.f23940k;
                z10 = z12;
            }
            this.f23945p = z10;
        }

        public final float a() {
            float f10 = this.f23943n * this.f23938i;
            return f10 * this.f23942m * (this.f23941l / ((float) Math.hypot(f10, (-this.f23944o) * this.f23937h)));
        }

        public final float b() {
            float f10 = this.f23943n * this.f23938i;
            float f11 = (-this.f23944o) * this.f23937h;
            return f11 * this.f23942m * (this.f23941l / ((float) Math.hypot(f10, f11)));
        }

        public final void c(float f10) {
            float f11 = (this.f23942m == -1.0f ? this.f23931b - f10 : f10 - this.f23930a) * this.f23940k;
            float fA = CropImageView.DEFAULT_ASPECT_RATIO;
            if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                fA = 1.0f;
                if (f11 < 1.0f) {
                    float f12 = f11 * 100;
                    int i10 = (int) f12;
                    float[] fArr = this.f23939j;
                    float f13 = fArr[i10];
                    fA = org.bouncycastle.jcajce.provider.digest.c.a(fArr[i10 + 1], f13, f12 - i10, f13);
                }
            }
            double d10 = fA * 1.5707964f;
            this.f23937h = (float) Math.sin(d10);
            this.f23938i = (float) Math.cos(d10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[PHI: r9
      0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(int[] iArr, float[] fArr, float[][] fArr2) {
        int i10;
        int length = fArr.length - 1;
        a[][] aVarArr = new a[length][];
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            int i14 = iArr[i13];
            int i15 = 3;
            if (i14 == 0) {
                i10 = i15;
            } else if (i14 == 1) {
                i11 = 1;
                i10 = i11;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        i15 = 4;
                        if (i14 != 4) {
                            i15 = 5;
                            if (i14 != 5) {
                                i10 = i12;
                            }
                        }
                    } else {
                        if (i11 == 1) {
                        }
                        i10 = i11;
                    }
                }
                i11 = 2;
                i10 = i11;
            }
            float[] fArr3 = fArr2[i13];
            int i16 = i13 + 1;
            float[] fArr4 = fArr2[i16];
            float f10 = fArr[i13];
            float f11 = fArr[i16];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            a[] aVarArr2 = new a[length2];
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17 * 2;
                a[] aVarArr3 = aVarArr2;
                int i19 = i17;
                int i20 = i18 + 1;
                aVarArr3[i19] = new a(i10, f10, f11, fArr3[i18], fArr3[i20], fArr4[i18], fArr4[i20]);
                i17 = i19 + 1;
                aVarArr2 = aVarArr3;
            }
            aVarArr[i13] = aVarArr2;
            i13 = i16;
            i12 = i10;
        }
        this.f23929a = aVarArr;
    }
}
