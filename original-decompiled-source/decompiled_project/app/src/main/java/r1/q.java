package r1;

import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f23113d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f23114e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f23115f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f23116g;

    static {
        float[] fArrF = d.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.b(a.f23056b.f23057a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f23113d = fArrF;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f23114e = fArr;
        f23115f = d.e(fArrF);
        f23116g = d.e(fArr);
    }

    @Override // r1.c
    public final float[] a(float[] fArr) {
        d.g(f23113d, fArr);
        fArr[0] = h3.b.a(fArr[0]);
        fArr[1] = h3.b.a(fArr[1]);
        fArr[2] = h3.b.a(fArr[2]);
        d.g(f23114e, fArr);
        return fArr;
    }

    @Override // r1.c
    public final float b(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // r1.c
    public final float c(int i10) {
        if (i10 == 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return -0.5f;
    }

    @Override // r1.c
    public final long e(float f10, float f11, float f12) {
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f23116g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f15 * f15 * f15;
        float f18 = f16 * f16 * f16;
        float[] fArr2 = f23115f;
        float f19 = (fArr2[6] * f18) + (fArr2[3] * f17) + (fArr2[0] * f14 * f14 * f14);
        return (Float.floatToRawIntBits((fArr2[7] * f18) + (fArr2[4] * f17) + (fArr2[1] * r11)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f19) << 32);
    }

    @Override // r1.c
    public final float[] f(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        fArr[2] = f13 <= 0.5f ? f13 : 0.5f;
        d.g(f23116g, fArr);
        float f14 = fArr[0];
        fArr[0] = f14 * f14 * f14;
        float f15 = fArr[1];
        fArr[1] = f15 * f15 * f15;
        float f16 = fArr[2];
        fArr[2] = f16 * f16 * f16;
        d.g(f23115f, fArr);
        return fArr;
    }

    @Override // r1.c
    public final float g(float f10, float f11, float f12) {
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f23116g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f23115f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // r1.c
    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = f23113d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        float fA = h3.b.a(f14);
        float fA2 = h3.b.a(f15);
        float fA3 = h3.b.a(f16);
        float[] fArr2 = f23114e;
        return n0.a((fArr2[6] * fA3) + (fArr2[3] * fA2) + (fArr2[0] * fA), (fArr2[7] * fA3) + (fArr2[4] * fA2) + (fArr2[1] * fA), (fArr2[8] * fA3) + (fArr2[5] * fA2) + (fArr2[2] * fA), f13, cVar);
    }
}
