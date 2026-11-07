package l0;

import android.graphics.Color;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f13769a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13770b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13771c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13772d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13773e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13774f;

    public a(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f13769a = f6;
        this.f13770b = f7;
        this.f13771c = f8;
        this.f13772d = f9;
        this.f13773e = f10;
        this.f13774f = f11;
    }

    public static a a(int i6) {
        k kVar = k.f13807k;
        float fB = b.b(Color.red(i6));
        float fB2 = b.b(Color.green(i6));
        float fB3 = b.b(Color.blue(i6));
        float[][] fArr = b.f13778d;
        float[] fArr2 = fArr[0];
        float f6 = (fArr2[2] * fB3) + (fArr2[1] * fB2) + (fArr2[0] * fB);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[2] * fB3) + (fArr3[1] * fB2) + (fArr3[0] * fB);
        float[] fArr4 = fArr[2];
        float f8 = (fB3 * fArr4[2]) + (fB2 * fArr4[1]) + (fB * fArr4[0]);
        float[][] fArr5 = b.f13775a;
        float[] fArr6 = fArr5[0];
        float f9 = (fArr6[2] * f8) + (fArr6[1] * f7) + (fArr6[0] * f6);
        float[] fArr7 = fArr5[1];
        float f10 = (fArr7[2] * f8) + (fArr7[1] * f7) + (fArr7[0] * f6);
        float[] fArr8 = fArr5[2];
        float f11 = (f8 * fArr8[2]) + (f7 * fArr8[1]) + (f6 * fArr8[0]);
        float[] fArr9 = kVar.f13814g;
        float f12 = kVar.f13815i;
        float f13 = kVar.f13811d;
        float f14 = kVar.f13808a;
        float f15 = fArr9[0] * f9;
        float f16 = fArr9[1] * f10;
        float f17 = fArr9[2] * f11;
        float f18 = kVar.h;
        float fPow = (float) Math.pow((Math.abs(f15) * f18) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f16) * f18) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f17) * f18) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d7 = fSignum3;
        float f19 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d7)) / 11.0f;
        float f20 = ((float) ((fSignum + fSignum2) - (d7 * 2.0d))) / 9.0f;
        float f21 = fSignum2 * 20.0f;
        float f22 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f21)) / 20.0f;
        float f23 = (((fSignum * 40.0f) + f21) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f24 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f23 * kVar.f13809b) / f14, kVar.f13816j * f13)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f25 = f14 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f13813f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f13812e) * kVar.f13810c) * ((float) Math.sqrt((f20 * f20) + (f19 * f19)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        Math.sqrt((r0 * f13) / f25);
        float f26 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f12 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d8 = f24;
        return new a(fAtan2, fPow5, fPow4, f26, fLog * ((float) Math.cos(d8)), fLog * ((float) Math.sin(d8)));
    }

    public static a b(float f6, float f7, float f8) {
        k kVar = k.f13807k;
        float f9 = kVar.f13811d;
        Math.sqrt(f6 / 100.0d);
        float f10 = kVar.f13808a + 4.0f;
        float f11 = kVar.f13815i * f7;
        Math.sqrt(((f7 / ((float) Math.sqrt(r1))) * kVar.f13811d) / f10);
        float f12 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float fLog = ((float) Math.log((f11 * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f8) / 180.0f;
        return new a(f8, f7, f6, f12, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(k kVar) {
        float fSqrt;
        float f6 = this.f13770b;
        double d7 = f6;
        float f7 = this.f13771c;
        if (d7 != 0.0d) {
            double d8 = f7;
            fSqrt = d8 == 0.0d ? 0.0f : f6 / ((float) Math.sqrt(d8 / 100.0d));
        }
        float f8 = kVar.f13813f;
        float f9 = kVar.h;
        float fPow = (float) Math.pow(fSqrt / Math.pow(1.64d - Math.pow(0.29d, f8), 0.73d), 1.1111111111111112d);
        double d9 = (this.f13769a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d9) + 3.8d)) * 0.25f;
        float fPow2 = kVar.f13808a * ((float) Math.pow(f7 / 100.0d, (1.0d / kVar.f13811d) / kVar.f13816j));
        float f10 = fCos * 3846.1538f * kVar.f13812e * kVar.f13810c;
        float f11 = fPow2 / kVar.f13809b;
        float fSin = (float) Math.sin(d9);
        float fCos2 = (float) Math.cos(d9);
        float f12 = (((0.305f + f11) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f10 * 23.0f)));
        float f13 = fCos2 * f12;
        float f14 = f12 * fSin;
        float f15 = f11 * 460.0f;
        float f16 = ((288.0f * f14) + ((451.0f * f13) + f15)) / 1403.0f;
        float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
        float f18 = ((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f;
        float f19 = 100.0f / f9;
        float fSignum = Math.signum(f16) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
        float fSignum2 = Math.signum(f17) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
        float fSignum3 = Math.signum(f18) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
        float[] fArr = kVar.f13814g;
        float f20 = fSignum / fArr[0];
        float f21 = fSignum2 / fArr[1];
        float f22 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f13776b;
        float[] fArr3 = fArr2[0];
        float f23 = (fArr3[2] * f22) + (fArr3[1] * f21) + (fArr3[0] * f20);
        float[] fArr4 = fArr2[1];
        float f24 = (fArr4[2] * f22) + (fArr4[1] * f21) + (fArr4[0] * f20);
        float[] fArr5 = fArr2[2];
        return m0.a.a(f23, f24, (f22 * fArr5[2]) + (f21 * fArr5[1]) + (f20 * fArr5[0]));
    }
}
