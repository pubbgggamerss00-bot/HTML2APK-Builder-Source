package c2;

import android.view.MotionEvent;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.b1;
import q1.p1;

/* loaded from: classes.dex */
public final class n0 {
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f10, float f11, float f12, float f13, r1.c cVar) {
        int i10;
        int i11;
        int i12;
        float fC;
        float fB;
        int i13;
        int i14;
        int i15;
        int i16;
        float fC2;
        float fB2;
        int i17;
        int i18;
        int i19;
        boolean zD = cVar.d();
        float f14 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (zD) {
            float f15 = f13 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f13;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i20 = ((int) ((f15 * 255.0f) + 0.5f)) << 24;
            float f16 = f10 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i21 = i20 | (((int) ((f16 * 255.0f) + 0.5f)) << 16);
            float f17 = f11 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f11;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i22 = i21 | (((int) ((f17 * 255.0f) + 0.5f)) << 8);
            if (f12 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                f14 = f12;
            }
            long j10 = (i22 | ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i23 = b1.f21655i;
            return j10;
        }
        long j11 = cVar.f23073b;
        int i24 = r1.b.f23069e;
        if (((int) (j11 >> 32)) != 3) {
            p1.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = cVar.f23074c;
        if (i25 == -1) {
            p1.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fC3 = cVar.c(0);
        float fB3 = cVar.b(0);
        if (f10 >= fC3) {
            fC3 = f10;
        }
        if (fC3 <= fB3) {
            fB3 = fC3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fB3);
        int i26 = iFloatToRawIntBits >>> 31;
        int i27 = (iFloatToRawIntBits >>> 23) & 255;
        int i28 = iFloatToRawIntBits & 8388607;
        if (i27 == 255) {
            i11 = i28 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i27 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else if (i10 > 0) {
                int i29 = i28 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i12 = (((i10 << 10) | i29) + 1) | (i26 << 15);
                    short s10 = (short) i12;
                    fC = cVar.c(1);
                    fB = cVar.b(1);
                    if (f11 >= fC) {
                        fC = f11;
                    }
                    if (fC <= fB) {
                        fB = fC;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fB);
                    int i30 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i31 = iFloatToRawIntBits2 & 8388607;
                    if (i13 != 255) {
                        i15 = i31 != 0 ? 512 : 0;
                        i14 = 31;
                    } else {
                        i14 = i13 - 112;
                        if (i14 >= 31) {
                            i15 = 0;
                            i14 = 49;
                        } else if (i14 > 0) {
                            int i32 = i31 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i16 = (((i14 << 10) | i32) + 1) | (i30 << 15);
                                short s11 = (short) i16;
                                fC2 = cVar.c(2);
                                fB2 = cVar.b(2);
                                if (f12 >= fC2) {
                                    fC2 = f12;
                                }
                                if (fC2 <= fB2) {
                                    fB2 = fC2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fB2);
                                int i33 = iFloatToRawIntBits3 >>> 31;
                                i17 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i34 = 8388607 & iFloatToRawIntBits3;
                                if (i17 == 255) {
                                    i18 = i34 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i35 = i17 - 112;
                                    if (i35 >= 31) {
                                        i18 = 0;
                                        i = 49;
                                    } else if (i35 > 0) {
                                        int i36 = i34 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i19 = (((i35 << 10) | i36) + 1) | (i33 << 15);
                                            short s12 = (short) i19;
                                            if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                                f14 = f13;
                                            }
                                            long j12 = (i25 & 63) | ((s10 & 65535) << 48) | ((s11 & 65535) << 32) | ((65535 & s12) << 16) | ((((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i37 = b1.f21655i;
                                            return j12;
                                        }
                                        i18 = i36;
                                        i = i35;
                                    } else if (i35 >= -10) {
                                        int i38 = (i34 | 8388608) >> (1 - i35);
                                        if ((i38 & 4096) != 0) {
                                            i38 += 8192;
                                        }
                                        i18 = i38 >> 13;
                                    } else {
                                        i18 = 0;
                                    }
                                }
                                i19 = i18 | (i33 << 15) | (i << 10);
                                short s122 = (short) i19;
                                if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                }
                                long j122 = (i25 & 63) | ((s10 & 65535) << 48) | ((s11 & 65535) << 32) | ((65535 & s122) << 16) | ((((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i372 = b1.f21655i;
                                return j122;
                            }
                            i15 = i32;
                        } else if (i14 >= -10) {
                            int i39 = (i31 | 8388608) >> (1 - i14);
                            if ((i39 & 4096) != 0) {
                                i39 += 8192;
                            }
                            i15 = i39 >> 13;
                            i14 = 0;
                        } else {
                            i15 = 0;
                            i14 = 0;
                        }
                    }
                    i16 = i15 | (i30 << 15) | (i14 << 10);
                    short s112 = (short) i16;
                    fC2 = cVar.c(2);
                    fB2 = cVar.b(2);
                    if (f12 >= fC2) {
                    }
                    if (fC2 <= fB2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fB2);
                    int i332 = iFloatToRawIntBits32 >>> 31;
                    i17 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i342 = 8388607 & iFloatToRawIntBits32;
                    if (i17 == 255) {
                    }
                    i19 = i18 | (i332 << 15) | (i << 10);
                    short s1222 = (short) i19;
                    if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    long j1222 = (i25 & 63) | ((s10 & 65535) << 48) | ((s112 & 65535) << 32) | ((65535 & s1222) << 16) | ((((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i3722 = b1.f21655i;
                    return j1222;
                }
                i11 = i29;
            } else if (i10 >= -10) {
                int i40 = (i28 | 8388608) >> (1 - i10);
                if ((i40 & 4096) != 0) {
                    i40 += 8192;
                }
                i11 = i40 >> 13;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
        }
        i12 = i11 | (i26 << 15) | (i10 << 10);
        short s102 = (short) i12;
        fC = cVar.c(1);
        fB = cVar.b(1);
        if (f11 >= fC) {
        }
        if (fC <= fB) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fB);
        int i302 = iFloatToRawIntBits22 >>> 31;
        i13 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i312 = iFloatToRawIntBits22 & 8388607;
        if (i13 != 255) {
        }
        i16 = i15 | (i302 << 15) | (i14 << 10);
        short s1122 = (short) i16;
        fC2 = cVar.c(2);
        fB2 = cVar.b(2);
        if (f12 >= fC2) {
        }
        if (fC2 <= fB2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fB2);
        int i3322 = iFloatToRawIntBits322 >>> 31;
        i17 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i3422 = 8388607 & iFloatToRawIntBits322;
        if (i17 == 255) {
        }
        i19 = i18 | (i3322 << 15) | (i << 10);
        short s12222 = (short) i19;
        if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
        }
        long j12222 = (i25 & 63) | ((s102 & 65535) << 48) | ((s1122 & 65535) << 32) | ((65535 & s12222) << 16) | ((((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i37222 = b1.f21655i;
        return j12222;
    }

    public static final long b(int i10) {
        long j10 = i10 << 32;
        int i11 = b1.f21655i;
        return j10;
    }

    public static final long c(long j10) {
        long j11 = j10 << 32;
        int i10 = b1.f21655i;
        return j11;
    }

    public static long d(int i10, int i11, int i12) {
        return b(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long e(float f10, float f11, float f12, float f13, r1.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (cVar.d()) {
            long j10 = ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f))) << 32;
            int i19 = b1.f21655i;
            return j10;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i20 = iFloatToRawIntBits >>> 31;
        int i21 = (iFloatToRawIntBits >>> 23) & 255;
        int i22 = iFloatToRawIntBits & 8388607;
        int i23 = 49;
        int i24 = 0;
        if (i21 == 255) {
            i11 = i22 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i21 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else if (i10 > 0) {
                int i25 = i22 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i12 = (((i10 << 10) | i25) + 1) | (i20 << 15);
                    short s10 = (short) i12;
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                    int i26 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i27 = iFloatToRawIntBits2 & 8388607;
                    if (i13 != 255) {
                        i15 = i27 != 0 ? 512 : 0;
                        i14 = 31;
                    } else {
                        i14 = i13 - 112;
                        if (i14 >= 31) {
                            i14 = 49;
                            i15 = 0;
                        } else if (i14 > 0) {
                            int i28 = i27 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i16 = (((i14 << 10) | i28) + 1) | (i26 << 15);
                                short s11 = (short) i16;
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(f12);
                                int i29 = iFloatToRawIntBits3 >>> 31;
                                i17 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i30 = 8388607 & iFloatToRawIntBits3;
                                if (i17 != 255) {
                                    int i31 = i17 - 112;
                                    if (i31 < 31) {
                                        if (i31 > 0) {
                                            i24 = i30 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i18 = (((i31 << 10) | i24) + 1) | (i29 << 15);
                                            } else {
                                                i23 = i31;
                                            }
                                        } else if (i31 >= -10) {
                                            int i32 = (i30 | 8388608) >> (1 - i31);
                                            if ((i32 & 4096) != 0) {
                                                i32 += 8192;
                                            }
                                            i23 = 0;
                                            i24 = i32 >> 13;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    long jMax = ((((short) i18) & 65535) << 16) | ((s10 & 65535) << 48) | ((s11 & 65535) << 32) | ((((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (cVar.f23074c & 63);
                                    int i33 = b1.f21655i;
                                    return jMax;
                                }
                                i24 = i30 == 0 ? 0 : 512;
                                i23 = 31;
                                i18 = (i29 << 15) | (i23 << 10) | i24;
                                long jMax2 = ((((short) i18) & 65535) << 16) | ((s10 & 65535) << 48) | ((s11 & 65535) << 32) | ((((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (cVar.f23074c & 63);
                                int i332 = b1.f21655i;
                                return jMax2;
                            }
                            i15 = i28;
                        } else if (i14 >= -10) {
                            int i34 = (i27 | 8388608) >> (1 - i14);
                            if ((i34 & 4096) != 0) {
                                i34 += 8192;
                            }
                            i15 = i34 >> 13;
                            i14 = 0;
                        } else {
                            i15 = 0;
                            i14 = 0;
                        }
                    }
                    i16 = i15 | (i26 << 15) | (i14 << 10);
                    short s112 = (short) i16;
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(f12);
                    int i292 = iFloatToRawIntBits32 >>> 31;
                    i17 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i302 = 8388607 & iFloatToRawIntBits32;
                    if (i17 != 255) {
                    }
                    i18 = (i292 << 15) | (i23 << 10) | i24;
                    long jMax22 = ((((short) i18) & 65535) << 16) | ((s10 & 65535) << 48) | ((s112 & 65535) << 32) | ((((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (cVar.f23074c & 63);
                    int i3322 = b1.f21655i;
                    return jMax22;
                }
                i11 = i25;
            } else if (i10 >= -10) {
                int i35 = (i22 | 8388608) >> (1 - i10);
                if ((i35 & 4096) != 0) {
                    i35 += 8192;
                }
                i11 = i35 >> 13;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
        }
        i12 = i11 | (i20 << 15) | (i10 << 10);
        short s102 = (short) i12;
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(f11);
        int i262 = iFloatToRawIntBits22 >>> 31;
        i13 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i272 = iFloatToRawIntBits22 & 8388607;
        if (i13 != 255) {
        }
        i16 = i15 | (i262 << 15) | (i14 << 10);
        short s1122 = (short) i16;
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(f12);
        int i2922 = iFloatToRawIntBits322 >>> 31;
        i17 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i3022 = 8388607 & iFloatToRawIntBits322;
        if (i17 != 255) {
        }
        i18 = (i2922 << 15) | (i23 << 10) | i24;
        long jMax222 = ((((short) i18) & 65535) << 16) | ((s102 & 65535) << 48) | ((s1122 & 65535) << 32) | ((((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (cVar.f23074c & 63);
        int i33222 = b1.f21655i;
        return jMax222;
    }

    public static final long f(long j10, long j11) {
        float f10;
        float f11;
        long jB = b1.b(j10, b1.g(j11));
        float fE = b1.e(j11);
        float fE2 = b1.e(jB);
        float f12 = 1.0f - fE2;
        float f13 = (fE * f12) + fE2;
        float fI = b1.i(jB);
        float fI2 = b1.i(j11);
        float f14 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f13 == CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        } else {
            f10 = (((fI2 * fE) * f12) + (fI * fE2)) / f13;
        }
        float fH = b1.h(jB);
        float fH2 = b1.h(j11);
        if (f13 == CropImageView.DEFAULT_ASPECT_RATIO) {
            f11 = 0.0f;
        } else {
            f11 = (((fH2 * fE) * f12) + (fH * fE2)) / f13;
        }
        float f15 = b1.f(jB);
        float f16 = b1.f(j11);
        if (f13 != CropImageView.DEFAULT_ASPECT_RATIO) {
            f14 = (((f16 * fE) * f12) + (f15 * fE2)) / f13;
        }
        return e(f10, f11, f14, f13, b1.g(j11));
    }

    public static final long g(long j10, long j11, float f10) {
        r1.q qVar = r1.j.f23098x;
        long jB = b1.b(j10, qVar);
        long jB2 = b1.b(j11, qVar);
        float fE = b1.e(jB);
        float fI = b1.i(jB);
        float fH = b1.h(jB);
        float f11 = b1.f(jB);
        float fE2 = b1.e(jB2);
        float fI2 = b1.i(jB2);
        float fH2 = b1.h(jB2);
        float f12 = b1.f(jB2);
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return b1.b(e(h3.b.b(fI, fI2, f10), h3.b.b(fH, fH2, f10), h3.b.b(f11, f12, f10), h3.b.b(fE, fE2, f10), qVar), b1.g(j11));
    }

    public static final float h(long j10) {
        r1.c cVarG = b1.g(j10);
        if (!r1.b.a(cVarG.f23073b, r1.b.f23065a)) {
            p1.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) r1.b.b(cVarG.f23073b)));
        }
        r1.r rVar = ((r1.z) cVarG).f23138p;
        double dB = rVar.b(b1.i(j10));
        float fB = (float) ((rVar.b(b1.f(j10)) * 0.0722d) + (rVar.b(b1.h(j10)) * 0.7152d) + (dB * 0.2126d));
        if (fB < CropImageView.DEFAULT_ASPECT_RATIO) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final g1.e i(x0.j jVar) {
        jVar.L(-796079677);
        g1.e eVar = (g1.e) b0.a0.d(new Object[0], g1.e.f11284e, g1.h.f11298a, jVar, 3072, 4);
        eVar.f11287c = (g1.i) jVar.f(g1.k.f11305a);
        jVar.B();
        return eVar;
    }

    public static final int j(long j10) {
        float[] fArr = r1.j.f23075a;
        return (int) (b1.b(j10, r1.j.f23079e) >>> 32);
    }

    public static final void k(r rVar, long j10, eh.l lVar, boolean z10) {
        j jVar = rVar.f4688b;
        MotionEvent motionEvent = jVar != null ? jVar.f4652b.f4614b : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z10) {
            motionEvent.setAction(3);
        }
        int i10 = (int) (j10 >> 32);
        float f10 = -Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        motionEvent.offsetLocation(f10, -Float.intBitsToFloat(i11));
        lVar.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEvent.setAction(action);
    }
}
