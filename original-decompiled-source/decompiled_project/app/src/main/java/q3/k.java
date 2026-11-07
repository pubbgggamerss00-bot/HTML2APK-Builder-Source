package q3;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final k f21902k;

    /* renamed from: a, reason: collision with root package name */
    public final float f21903a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21904b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21905c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21906d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21907e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21908f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f21909g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21910h;

    /* renamed from: i, reason: collision with root package name */
    public final float f21911i;

    /* renamed from: j, reason: collision with root package name */
    public final float f21912j;

    static {
        float fC = (float) ((b.c() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f21872c;
        float f10 = fArr[0];
        float[][] fArr2 = b.f21870a;
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f19 = 1.0f / ((5.0f * fC) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(fC * 5.0d))) + (f20 * fC);
        float fC2 = b.c() / fArr[1];
        double d11 = fC2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * fCbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * fCbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * fCbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr6[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr6[2];
        float[] fArr7 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f21902k = new k(fC2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f18, 1.0f, new float[]{(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public k(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f21908f = f10;
        this.f21903a = f11;
        this.f21904b = f12;
        this.f21905c = f13;
        this.f21906d = f14;
        this.f21907e = f15;
        this.f21909g = fArr;
        this.f21910h = f16;
        this.f21911i = f17;
        this.f21912j = f18;
    }
}
