package r1;

import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class p extends c {
    @Override // r1.c
    public final float[] a(float[] fArr) {
        float f10 = fArr[0];
        float[] fArr2 = o.f23112e;
        float f11 = f10 / fArr2[0];
        float f12 = fArr[1] / fArr2[1];
        float f13 = fArr[2] / fArr2[2];
        float fCbrt = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
        float f14 = (116.0f * fCbrt2) - 16.0f;
        float f15 = (fCbrt - fCbrt2) * 500.0f;
        float f16 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f14 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        fArr[0] = f14;
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        fArr[1] = f15;
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        fArr[2] = f16 <= 128.0f ? f16 : 128.0f;
        return fArr;
    }

    @Override // r1.c
    public final float b(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // r1.c
    public final float c(int i10) {
        if (i10 == 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return -128.0f;
    }

    @Override // r1.c
    public final long e(float f10, float f11, float f12) {
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        float f17 = f15 * o.f23112e[0];
        return (Float.floatToRawIntBits(f16 * r7[1]) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f17) << 32);
    }

    @Override // r1.c
    public final float[] f(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -128.0f ? f12 : -128.0f;
        float f14 = f13 <= 128.0f ? f13 : 128.0f;
        fArr[2] = f14;
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        float f17 = f15 - (f14 * 0.005f);
        float f18 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f19 = f15 > 0.20689656f ? f15 * f15 * f15 : (f15 - 0.13793103f) * 0.12841855f;
        float f20 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = o.f23112e;
        fArr[0] = f18 * fArr2[0];
        fArr[1] = f19 * fArr2[1];
        fArr[2] = f20 * fArr2[2];
        return fArr;
    }

    @Override // r1.c
    public final float g(float f10, float f11, float f12) {
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * o.f23112e[2];
    }

    @Override // r1.c
    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = o.f23112e;
        float f14 = f10 / fArr[0];
        float f15 = f11 / fArr[1];
        float f16 = f12 / fArr[2];
        float fCbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float f17 = (116.0f * fCbrt2) - 16.0f;
        float f18 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f17 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return n0.a(f17, f18, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f13, cVar);
    }
}
