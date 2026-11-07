package r1;

import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class z extends r1.c {

    /* renamed from: r, reason: collision with root package name */
    public static final p3.c f23125r = new p3.c();

    /* renamed from: d, reason: collision with root package name */
    public final b0 f23126d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23127e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23128f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f23129g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f23130h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f23131i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f23132j;

    /* renamed from: k, reason: collision with root package name */
    public final n f23133k;

    /* renamed from: l, reason: collision with root package name */
    public final c f23134l;

    /* renamed from: m, reason: collision with root package name */
    public final ld.d f23135m;

    /* renamed from: n, reason: collision with root package name */
    public final n f23136n;

    /* renamed from: o, reason: collision with root package name */
    public final b f23137o;

    /* renamed from: p, reason: collision with root package name */
    public final r f23138p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f23139q;

    public static final class a {
        public static float a(float[] fArr) {
            if (fArr.length < 6) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = (((((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < CropImageView.DEFAULT_ASPECT_RATIO ? -f16 : f16;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Double, Double> {
        public b() {
            super(1);
        }

        @Override // eh.l
        public final Double invoke(Double d10) {
            double dDoubleValue = d10.doubleValue();
            return Double.valueOf(z.this.f23136n.b(jh.j.k(dDoubleValue, r8.f23127e, r8.f23128f)));
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<Double, Double> {
        public c() {
            super(1);
        }

        @Override // eh.l
        public final Double invoke(Double d10) {
            return Double.valueOf(jh.j.k(z.this.f23133k.b(d10.doubleValue()), r10.f23127e, r10.f23128f));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String str, float[] fArr, b0 b0Var, final a0 a0Var, int i10) {
        double d10 = a0Var.f23058a;
        boolean z10 = d10 == -3.0d;
        double d11 = a0Var.f23064g;
        double d12 = a0Var.f23063f;
        this(str, fArr, b0Var, null, z10 ? new n() { // from class: r1.v
            @Override // r1.n
            public final double b(double d13) {
                float[] fArr2 = j.f23075a;
                return j.b(a0Var, d13);
            }
        } : d10 == -2.0d ? new n() { // from class: r1.w
            @Override // r1.n
            public final double b(double d13) {
                float[] fArr2 = j.f23075a;
                return j.d(a0Var, d13);
            }
        } : (d12 == 0.0d && d11 == 0.0d) ? new n() { // from class: r1.x
            @Override // r1.n
            public final double b(double d13) {
                a0 a0Var2 = a0Var;
                double d14 = a0Var2.f23059b;
                double d15 = a0Var2.f23060c;
                double d16 = a0Var2.f23061d;
                return d13 >= a0Var2.f23062e * d16 ? (Math.pow(d13, 1.0d / a0Var2.f23058a) - d15) / d14 : d13 / d16;
            }
        } : new n() { // from class: r1.y
            @Override // r1.n
            public final double b(double d13) {
                a0 a0Var2 = a0Var;
                double d14 = a0Var2.f23059b;
                double d15 = a0Var2.f23060c;
                double d16 = a0Var2.f23061d;
                return d13 >= a0Var2.f23062e * d16 ? (Math.pow(d13 - a0Var2.f23063f, 1.0d / a0Var2.f23058a) - d15) / d14 : (d13 - a0Var2.f23064g) / d16;
            }
        }, d10 == -3.0d ? new b9.w(a0Var) : d10 == -2.0d ? new b9.x(a0Var) : (d12 == 0.0d && d11 == 0.0d) ? new ld.k(a0Var) : new n() { // from class: r1.u
            @Override // r1.n
            public final double b(double d13) {
                a0 a0Var2 = a0Var;
                double d14 = a0Var2.f23059b;
                double d15 = a0Var2.f23060c;
                double d16 = a0Var2.f23061d;
                return d13 >= a0Var2.f23062e ? Math.pow((d14 * d13) + d15, a0Var2.f23058a) + a0Var2.f23063f : (d16 * d13) + a0Var2.f23064g;
            }
        }, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, a0Var, i10);
    }

    @Override // r1.c
    public final float[] a(float[] fArr) {
        d.g(this.f23132j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d10 = fArr[0];
        ld.d dVar = this.f23135m;
        fArr[0] = (float) dVar.b(d10);
        fArr[1] = (float) dVar.b(fArr[1]);
        fArr[2] = (float) dVar.b(fArr[2]);
        return fArr;
    }

    @Override // r1.c
    public final float b(int i10) {
        return this.f23128f;
    }

    @Override // r1.c
    public final float c(int i10) {
        return this.f23127e;
    }

    @Override // r1.c
    public final boolean d() {
        return this.f23139q;
    }

    @Override // r1.c
    public final long e(float f10, float f11, float f12) {
        double d10 = f10;
        r rVar = this.f23138p;
        float fB = (float) rVar.b(d10);
        float fB2 = (float) rVar.b(f11);
        float fB3 = (float) rVar.b(f12);
        float[] fArr = this.f23131i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f14 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        return (Float.floatToRawIntBits(f14) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // r1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        z zVar = (z) obj;
        a0 a0Var = zVar.f23129g;
        if (Float.compare(zVar.f23127e, this.f23127e) != 0 || Float.compare(zVar.f23128f, this.f23128f) != 0 || !kotlin.jvm.internal.r.a(this.f23126d, zVar.f23126d) || !Arrays.equals(this.f23130h, zVar.f23130h)) {
            return false;
        }
        a0 a0Var2 = this.f23129g;
        if (a0Var2 != null) {
            return kotlin.jvm.internal.r.a(a0Var2, a0Var);
        }
        if (a0Var == null) {
            return true;
        }
        if (kotlin.jvm.internal.r.a(this.f23133k, zVar.f23133k)) {
            return kotlin.jvm.internal.r.a(this.f23136n, zVar.f23136n);
        }
        return false;
    }

    @Override // r1.c
    public final float[] f(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d10 = fArr[0];
        r rVar = this.f23138p;
        fArr[0] = (float) rVar.b(d10);
        fArr[1] = (float) rVar.b(fArr[1]);
        fArr[2] = (float) rVar.b(fArr[2]);
        d.g(this.f23131i, fArr);
        return fArr;
    }

    @Override // r1.c
    public final float g(float f10, float f11, float f12) {
        double d10 = f10;
        r rVar = this.f23138p;
        float fB = (float) rVar.b(d10);
        float fB2 = (float) rVar.b(f11);
        float fB3 = (float) rVar.b(f12);
        float[] fArr = this.f23131i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // r1.c
    public final long h(float f10, float f11, float f12, float f13, r1.c cVar) {
        float[] fArr = this.f23132j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        ld.d dVar = this.f23135m;
        return n0.a((float) dVar.b(f14), (float) dVar.b(f15), (float) dVar.b(f16), f13, cVar);
    }

    @Override // r1.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f23130h) + ((this.f23126d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f23127e;
        int iFloatToIntBits = (iHashCode + (f10 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f23128f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : Float.floatToIntBits(f11))) * 31;
        a0 a0Var = this.f23129g;
        int iHashCode2 = iFloatToIntBits2 + (a0Var != null ? a0Var.hashCode() : 0);
        if (a0Var == null) {
            return this.f23136n.hashCode() + ((this.f23133k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0264  */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z(String str, float[] fArr, b0 b0Var, float[] fArr2, n nVar, n nVar2, float f10, float f11, a0 a0Var, int i10) {
        ?? r23;
        char c10;
        float f12;
        float f13;
        boolean z10;
        double d10;
        super(str, r1.b.f23065a, i10);
        this.f23126d = b0Var;
        this.f23127e = f10;
        this.f23128f = f11;
        this.f23129g = a0Var;
        this.f23133k = nVar;
        this.f23134l = new c();
        this.f23135m = new ld.d(this);
        this.f23136n = nVar2;
        this.f23137o = new b();
        this.f23138p = new r(this);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 < f11) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f14 = fArr[0];
                float f15 = fArr[1];
                float f16 = f14 + f15 + fArr[2];
                fArr3[0] = f14 / f16;
                fArr3[1] = f15 / f16;
                float f17 = fArr[3];
                float f18 = fArr[4];
                float f19 = f17 + f18 + fArr[5];
                fArr3[2] = f17 / f19;
                fArr3[3] = f18 / f19;
                float f20 = fArr[6];
                float f21 = fArr[7];
                float f22 = f20 + f21 + fArr[8];
                fArr3[4] = f20 / f22;
                fArr3[5] = f21 / f22;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.f23130h = fArr3;
            if (fArr2 == null) {
                float f23 = fArr3[0];
                float f24 = fArr3[1];
                float f25 = fArr3[2];
                float f26 = fArr3[3];
                float f27 = fArr3[4];
                float f28 = fArr3[5];
                f12 = 1.0f;
                float f29 = b0Var.f23070a;
                r23 = 0;
                float f30 = b0Var.f23071b;
                c10 = 2;
                float f31 = 1;
                float f32 = (f31 - f23) / f24;
                float f33 = (f31 - f25) / f26;
                float f34 = (f31 - f27) / f28;
                float f35 = (f31 - f29) / f30;
                float f36 = f23 / f24;
                float f37 = (f25 / f26) - f36;
                float f38 = (f29 / f30) - f36;
                float f39 = f33 - f32;
                float f40 = (f27 / f28) - f36;
                float f41 = (((f35 - f32) * f37) - (f38 * f39)) / (((f34 - f32) * f37) - (f39 * f40));
                float f42 = (f38 - (f40 * f41)) / f37;
                float f43 = (1.0f - f42) - f41;
                float f44 = f43 / f24;
                float f45 = f42 / f26;
                float f46 = f41 / f28;
                this.f23131i = new float[]{f44 * f23, f43, ((1.0f - f23) - f24) * f44, f45 * f25, f42, ((1.0f - f25) - f26) * f45, f46 * f27, f41, ((1.0f - f27) - f28) * f46};
            } else {
                r23 = 0;
                c10 = 2;
                f12 = 1.0f;
                if (fArr2.length == 9) {
                    this.f23131i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f23132j = d.e(this.f23131i);
            float fA = a.a(fArr3);
            float[] fArr4 = j.f23075a;
            if (fA / a.a(j.f23076b) > 0.9f) {
                float[] fArr5 = j.f23075a;
                float f47 = fArr3[r23];
                float f48 = fArr5[r23];
                float f49 = fArr3[1];
                float f50 = fArr5[1];
                float f51 = fArr3[c10];
                float f52 = fArr5[c10];
                float f53 = fArr3[3];
                float f54 = fArr5[3];
                float f55 = fArr3[4];
                float f56 = fArr5[4];
                float f57 = fArr3[5];
                float f58 = fArr5[5];
                f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                float[] fArr6 = new float[6];
                fArr6[r23] = f47 - f48;
                fArr6[1] = f49 - f50;
                fArr6[c10] = f51 - f52;
                fArr6[3] = f53 - f54;
                fArr6[4] = f55 - f56;
                fArr6[5] = f57 - f58;
                float f59 = fArr6[r23];
                float f60 = fArr6[1];
                if (((f50 - f58) * f59) - ((f48 - f56) * f60) >= CropImageView.DEFAULT_ASPECT_RATIO && ((f48 - f52) * f60) - ((f50 - f54) * f59) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    float f61 = fArr6[c10];
                    float f62 = fArr6[3];
                    if (((f54 - f50) * f61) - ((f52 - f48) * f62) >= CropImageView.DEFAULT_ASPECT_RATIO && ((f52 - f56) * f62) - ((f54 - f58) * f61) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        float f63 = fArr6[4];
                        float f64 = fArr6[5];
                        if (((f58 - f54) * f63) - ((f56 - f52) * f64) < CropImageView.DEFAULT_ASPECT_RATIO || ((f56 - f48) * f64) - ((f58 - f50) * f63) < CropImageView.DEFAULT_ASPECT_RATIO) {
                        }
                    }
                }
                if (i10 != 0) {
                    float[] fArr7 = j.f23075a;
                    if (fArr3 == fArr7) {
                        if (d.c(b0Var, o.f23111d) && f10 == f13 && f11 == f12) {
                            float[] fArr8 = j.f23075a;
                            z zVar = j.f23079e;
                            for (d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                                if (Math.abs(nVar.b(d10) - zVar.f23133k.b(d10)) <= 0.001d && Math.abs(nVar2.b(d10) - zVar.f23136n.b(d10)) <= 0.001d) {
                                }
                            }
                            z10 = true;
                        }
                        z10 = r23;
                        break;
                    }
                    for (int i11 = r23; i11 < 6; i11++) {
                        if (Float.compare(fArr3[i11], fArr7[i11]) != 0 && Math.abs(fArr3[i11] - fArr7[i11]) > 0.001f) {
                            break;
                        }
                    }
                    if (d.c(b0Var, o.f23111d)) {
                        float[] fArr82 = j.f23075a;
                        z zVar2 = j.f23079e;
                        while (d10 <= 1.0d) {
                        }
                        z10 = true;
                    }
                    z10 = r23;
                    break;
                }
                z10 = true;
                this.f23139q = z10;
                return;
            }
            f13 = CropImageView.DEFAULT_ASPECT_RATIO;
            int i12 = (f10 > f13 ? 1 : (f10 == f13 ? 0 : -1));
            if (i10 != 0) {
            }
            this.f23139q = z10;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String str, float[] fArr, b0 b0Var, final double d10, float f10, float f11, int i10) {
        n nVar = f23125r;
        this(str, fArr, b0Var, null, d10 == 1.0d ? nVar : new n() { // from class: r1.s
            @Override // r1.n
            public final double b(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Math.pow(d11, 1.0d / d10);
            }
        }, d10 != 1.0d ? new n() { // from class: r1.t
            @Override // r1.n
            public final double b(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Math.pow(d11, d10);
            }
        } : nVar, f10, f11, new a0(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}
