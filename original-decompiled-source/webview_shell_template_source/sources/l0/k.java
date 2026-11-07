package l0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final k f13807k;

    /* renamed from: a, reason: collision with root package name */
    public final float f13808a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13809b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13810c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13811d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13812e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13813f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f13814g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f13815i;

    /* renamed from: j, reason: collision with root package name */
    public final float f13816j;

    static {
        float fC = (float) ((b.c() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f13777c;
        float f6 = fArr[0];
        float[][] fArr2 = b.f13775a;
        float[] fArr3 = fArr2[0];
        float f7 = fArr3[0] * f6;
        float f8 = fArr[1];
        float f9 = (fArr3[1] * f8) + f7;
        float f10 = fArr[2];
        float f11 = (fArr3[2] * f10) + f9;
        float[] fArr4 = fArr2[1];
        float f12 = (fArr4[2] * f10) + (fArr4[1] * f8) + (fArr4[0] * f6);
        float[] fArr5 = fArr2[2];
        float f13 = (f10 * fArr5[2]) + (f8 * fArr5[1]) + (f6 * fArr5[0]);
        float f14 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d7 = fExp;
        if (d7 > 1.0d) {
            fExp = 1.0f;
        } else if (d7 < 0.0d) {
            fExp = 0.0f;
        }
        float f15 = 1.0f / ((5.0f * fC) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float fCbrt = (0.1f * f17 * f17 * ((float) Math.cbrt(fC * 5.0d))) + (f16 * fC);
        float fC2 = b.c() / fArr[1];
        double d8 = fC2;
        float fSqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * fCbrt) * f11) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * fCbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * fCbrt) * f13) / 100.0d, 0.42d)};
        float f18 = fArr6[0];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr6[1];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr6[2];
        float[] fArr7 = {f19, f21, (400.0f * f22) / (f22 + 27.13f)};
        f13807k = new k(fC2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f14, 1.0f, new float[]{(((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp, (((100.0f / f13) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public k(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f13813f = f6;
        this.f13808a = f7;
        this.f13809b = f8;
        this.f13810c = f9;
        this.f13811d = f10;
        this.f13812e = f11;
        this.f13814g = fArr;
        this.h = f12;
        this.f13815i = f13;
        this.f13816j = f14;
    }
}
