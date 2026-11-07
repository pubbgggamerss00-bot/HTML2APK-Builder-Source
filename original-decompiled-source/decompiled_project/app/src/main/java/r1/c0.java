package r1;

import c2.n0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class c0 extends c {
    @Override // r1.c
    public final float[] a(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // r1.c
    public final float b(int i10) {
        return 2.0f;
    }

    @Override // r1.c
    public final float c(int i10) {
        return -2.0f;
    }

    @Override // r1.c
    public final long e(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f) & BodyPartID.bodyIdMax);
    }

    @Override // r1.c
    public final float[] f(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // r1.c
    public final float g(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // r1.c
    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return n0.a(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, cVar);
    }
}
