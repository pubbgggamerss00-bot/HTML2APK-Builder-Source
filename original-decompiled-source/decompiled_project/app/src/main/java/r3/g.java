package r3;

import android.graphics.Path;
import android.util.Log;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

/* loaded from: classes.dex */
public final class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final char f23167a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f23168b;

        public a(char c10, float[] fArr) {
            this.f23167a = c10;
            this.f23168b = fArr;
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = f14;
            double d15 = ((d13 * dSin) + (d12 * dCos)) / d14;
            double d16 = f15;
            double d17 = ((d13 * dCos) + ((-f10) * dSin)) / d16;
            double d18 = f13;
            double d19 = ((d18 * dSin) + (f12 * dCos)) / d14;
            double d20 = ((d18 * dCos) + ((-f12) * dSin)) / d16;
            double d21 = d15 - d19;
            double d22 = d17 - d20;
            double d23 = (d15 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d22 * d22) + (d21 * d21);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d26);
            double d27 = dSqrt * d21;
            double d28 = dSqrt * d22;
            if (z10 == z11) {
                d10 = d23 - d28;
                d11 = d24 + d27;
            } else {
                d10 = d23 + d28;
                d11 = d24 - d27;
            }
            double dAtan2 = Math.atan2(d17 - d11, d15 - d10);
            double dAtan22 = Math.atan2(d20 - d11, d19 - d10) - dAtan2;
            if (z11 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d29 = d10 * d14;
            double d30 = d11 * d16;
            double d31 = (d29 * dCos) - (d30 * dSin);
            double d32 = (d30 * dCos) + (d29 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d33 = -d14;
            double d34 = d33 * dCos2;
            double d35 = d16 * dSin2;
            double d36 = (d34 * dSin3) - (d35 * dCos3);
            double d37 = d33 * dSin2;
            double d38 = d16 * dCos2;
            double d39 = dAtan22 / iCeil;
            double d40 = (dCos3 * d38) + (dSin3 * d37);
            double d41 = d12;
            double d42 = d13;
            int i10 = 0;
            double d43 = dAtan2;
            while (i10 < iCeil) {
                double d44 = d43 + d39;
                double dSin4 = Math.sin(d44);
                double dCos4 = Math.cos(d44);
                int i11 = iCeil;
                double d45 = (((d14 * dCos2) * dCos4) + d31) - (d35 * dSin4);
                double d46 = (d38 * dSin4) + (d14 * dSin2 * dCos4) + d32;
                double d47 = (d34 * dSin4) - (d35 * dCos4);
                double d48 = (dCos4 * d38) + (dSin4 * d37);
                double d49 = d44 - d43;
                double dTan = Math.tan(d49 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
                path.rLineTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                path.cubicTo((float) ((d36 * dSqrt2) + d41), (float) ((d40 * dSqrt2) + d42), (float) (d45 - (dSqrt2 * d47)), (float) (d46 - (dSqrt2 * d48)), (float) d45, (float) d46);
                i10++;
                d42 = d46;
                dCos2 = dCos2;
                d37 = d37;
                d43 = d44;
                d40 = d48;
                d41 = d45;
                iCeil = i11;
                d36 = d47;
                d39 = d39;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(a[] aVarArr, Path path) {
        int i10;
        float[] fArr;
        int i11;
        a aVar;
        int i12;
        char c10;
        float f10;
        float f11;
        a aVar2;
        boolean z10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        a[] aVarArr2 = aVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = aVarArr2.length;
        int i13 = 0;
        int i14 = 0;
        char c11 = 'm';
        while (i14 < length) {
            a aVar3 = aVarArr2[i14];
            char c12 = aVar3.f23167a;
            float[] fArr3 = aVar3.f23168b;
            float f20 = fArr2[i13];
            float f21 = fArr2[1];
            float f22 = fArr2[2];
            float f23 = fArr2[3];
            float f24 = fArr2[4];
            int i15 = i13;
            float f25 = fArr2[5];
            switch (c12) {
                case EACTags.ELEMENT_LIST /* 65 */:
                case 'a':
                    i10 = 7;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case HeaderItem.DATA_SIZE_OFFSET /* 104 */:
                case 'v':
                    i10 = 1;
                    break;
                case EACTags.ANSWER_TO_RESET /* 81 */:
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f24, f25);
                    f20 = f24;
                    f22 = f20;
                    f21 = f25;
                    f23 = f21;
                default:
                    i10 = 2;
                    break;
            }
            float f26 = f24;
            float f27 = f25;
            float f28 = f20;
            float f29 = f21;
            int i16 = i15;
            while (i16 < fArr3.length) {
                if (c12 == 'A') {
                    fArr = fArr3;
                    i11 = i16;
                    aVar = aVar3;
                    float f30 = f28;
                    float f31 = f29;
                    i12 = i14;
                    c10 = c12;
                    int i17 = i11 + 5;
                    int i18 = i11 + 6;
                    a.a(path, f30, f31, fArr[i17], fArr[i18], fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != CropImageView.DEFAULT_ASPECT_RATIO ? 1 : i15, fArr[i11 + 4] != CropImageView.DEFAULT_ASPECT_RATIO ? 1 : i15);
                    f22 = fArr[i17];
                    f10 = fArr[i18];
                    f23 = f10;
                    f11 = f22;
                } else if (c12 == 'C') {
                    fArr = fArr3;
                    i11 = i16;
                    i12 = i14;
                    aVar = aVar3;
                    c10 = c12;
                    int i19 = i11 + 2;
                    int i20 = i11 + 3;
                    int i21 = i11 + 4;
                    int i22 = i11 + 5;
                    path2.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i19], fArr[i20], fArr[i21], fArr[i22]);
                    float f32 = fArr[i21];
                    float f33 = fArr[i22];
                    f22 = fArr[i19];
                    f23 = fArr[i20];
                    f10 = f33;
                    f11 = f32;
                } else if (c12 == 'H') {
                    fArr = fArr3;
                    i11 = i16;
                    aVar = aVar3;
                    c10 = c12;
                    f10 = f29;
                    i12 = i14;
                    path2.lineTo(fArr[i11], f10);
                    f11 = fArr[i11];
                } else if (c12 == 'Q') {
                    fArr = fArr3;
                    i11 = i16;
                    i12 = i14;
                    aVar = aVar3;
                    c10 = c12;
                    int i23 = i11 + 1;
                    int i24 = i11 + 2;
                    int i25 = i11 + 3;
                    path2.quadTo(fArr[i11], fArr[i23], fArr[i24], fArr[i25]);
                    float f34 = fArr[i11];
                    float f35 = fArr[i23];
                    float f36 = fArr[i24];
                    float f37 = fArr[i25];
                    f22 = f34;
                    f23 = f35;
                    f11 = f36;
                    f10 = f37;
                } else if (c12 == 'V') {
                    fArr = fArr3;
                    i11 = i16;
                    i12 = i14;
                    aVar = aVar3;
                    f11 = f28;
                    c10 = c12;
                    path2.lineTo(f11, fArr[i11]);
                    f10 = fArr[i11];
                } else if (c12 != 'a') {
                    if (c12 == 'c') {
                        fArr = fArr3;
                        i11 = i16;
                        int i26 = i11 + 2;
                        int i27 = i11 + 3;
                        int i28 = i11 + 4;
                        int i29 = i11 + 5;
                        path2.rCubicTo(fArr[i11], fArr[i11 + 1], fArr[i26], fArr[i27], fArr[i28], fArr[i29]);
                        float f38 = fArr[i26] + f28;
                        float f39 = fArr[i27] + f29;
                        f28 += fArr[i28];
                        f29 += fArr[i29];
                        f22 = f38;
                        f23 = f39;
                    } else if (c12 != 'h') {
                        if (c12 != 'q') {
                            if (c12 != 'v') {
                                if (c12 == 'L') {
                                    fArr = fArr3;
                                    i11 = i16;
                                    int i30 = i11 + 1;
                                    path2.lineTo(fArr[i11], fArr[i30]);
                                    f11 = fArr[i11];
                                    f10 = fArr[i30];
                                } else if (c12 == 'M') {
                                    fArr = fArr3;
                                    i11 = i16;
                                    f11 = fArr[i11];
                                    f10 = fArr[i11 + 1];
                                    if (i11 > 0) {
                                        path2.lineTo(f11, f10);
                                    } else {
                                        path2.moveTo(f11, f10);
                                        f26 = f11;
                                        f27 = f10;
                                    }
                                } else if (c12 != 'S') {
                                    if (c12 == 'T') {
                                        fArr = fArr3;
                                        i11 = i16;
                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                            f28 = (f28 * 2.0f) - f22;
                                            f29 = (f29 * 2.0f) - f23;
                                        }
                                        int i31 = i11 + 1;
                                        path2.quadTo(f28, f29, fArr[i11], fArr[i31]);
                                        f11 = fArr[i11];
                                        f10 = fArr[i31];
                                        aVar = aVar3;
                                        f22 = f28;
                                        f23 = f29;
                                    } else if (c12 == 'l') {
                                        fArr = fArr3;
                                        i11 = i16;
                                        int i32 = i11 + 1;
                                        path2.rLineTo(fArr[i11], fArr[i32]);
                                        f28 += fArr[i11];
                                        f15 = fArr[i32];
                                    } else if (c12 == 'm') {
                                        fArr = fArr3;
                                        i11 = i16;
                                        float f40 = fArr[i11];
                                        f28 += f40;
                                        float f41 = fArr[i11 + 1];
                                        f29 += f41;
                                        if (i11 > 0) {
                                            path2.rLineTo(f40, f41);
                                        } else {
                                            path2.rMoveTo(f40, f41);
                                            aVar = aVar3;
                                            f11 = f28;
                                            f26 = f11;
                                            f10 = f29;
                                            f27 = f10;
                                        }
                                    } else if (c12 != 's') {
                                        if (c12 != 't') {
                                            fArr = fArr3;
                                            i11 = i16;
                                            aVar = aVar3;
                                            f11 = f28;
                                        } else {
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f18 = f28 - f22;
                                                f19 = f29 - f23;
                                            } else {
                                                f19 = CropImageView.DEFAULT_ASPECT_RATIO;
                                                f18 = CropImageView.DEFAULT_ASPECT_RATIO;
                                            }
                                            int i33 = i16 + 1;
                                            path2.rQuadTo(f18, f19, fArr3[i16], fArr3[i33]);
                                            float f42 = f18 + f28;
                                            float f43 = f19 + f29;
                                            float f44 = f28 + fArr3[i16];
                                            f29 += fArr3[i33];
                                            f23 = f43;
                                            fArr = fArr3;
                                            i11 = i16;
                                            aVar = aVar3;
                                            f11 = f44;
                                            f22 = f42;
                                        }
                                        f10 = f29;
                                    } else {
                                        if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                            f16 = f29 - f23;
                                            f17 = f28 - f22;
                                        } else {
                                            f17 = CropImageView.DEFAULT_ASPECT_RATIO;
                                            f16 = CropImageView.DEFAULT_ASPECT_RATIO;
                                        }
                                        int i34 = i16;
                                        int i35 = i34 + 1;
                                        int i36 = i34 + 2;
                                        int i37 = i34 + 3;
                                        fArr = fArr3;
                                        i11 = i34;
                                        path2.rCubicTo(f17, f16, fArr3[i34], fArr3[i35], fArr3[i36], fArr3[i37]);
                                        f12 = fArr[i11] + f28;
                                        f13 = fArr[i35] + f29;
                                        f28 += fArr[i36];
                                        f14 = fArr[i37];
                                    }
                                    i12 = i14;
                                    c10 = c12;
                                } else {
                                    fArr = fArr3;
                                    i11 = i16;
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f28 = (f28 * 2.0f) - f22;
                                        f29 = (f29 * 2.0f) - f23;
                                    }
                                    float f45 = f28;
                                    float f46 = f29;
                                    int i38 = i11 + 1;
                                    int i39 = i11 + 2;
                                    int i40 = i11 + 3;
                                    path2.cubicTo(f45, f46, fArr[i11], fArr[i38], fArr[i39], fArr[i40]);
                                    f22 = fArr[i11];
                                    f23 = fArr[i38];
                                    f11 = fArr[i39];
                                    f10 = fArr[i40];
                                }
                                i12 = i14;
                                aVar = aVar3;
                                c10 = c12;
                            } else {
                                fArr = fArr3;
                                i11 = i16;
                                path2.rLineTo(CropImageView.DEFAULT_ASPECT_RATIO, fArr[i11]);
                                f15 = fArr[i11];
                            }
                            f29 += f15;
                        } else {
                            fArr = fArr3;
                            i11 = i16;
                            int i41 = i11 + 1;
                            int i42 = i11 + 2;
                            int i43 = i11 + 3;
                            path2.rQuadTo(fArr[i11], fArr[i41], fArr[i42], fArr[i43]);
                            f12 = fArr[i11] + f28;
                            f13 = fArr[i41] + f29;
                            f28 += fArr[i42];
                            f14 = fArr[i43];
                        }
                        f29 += f14;
                        f22 = f12;
                        f23 = f13;
                    } else {
                        fArr = fArr3;
                        i11 = i16;
                        path2.rLineTo(fArr[i11], CropImageView.DEFAULT_ASPECT_RATIO);
                        f28 += fArr[i11];
                    }
                    aVar = aVar3;
                    f11 = f28;
                    f10 = f29;
                    i12 = i14;
                    c10 = c12;
                } else {
                    fArr = fArr3;
                    i11 = i16;
                    int i44 = i11 + 5;
                    float f47 = fArr[i44] + f28;
                    int i45 = i11 + 6;
                    float f48 = fArr[i45] + f29;
                    float f49 = fArr[i11];
                    float f50 = fArr[i11 + 1];
                    float f51 = fArr[i11 + 2];
                    if (fArr[i11 + 3] != CropImageView.DEFAULT_ASPECT_RATIO) {
                        aVar2 = aVar3;
                        z10 = 1;
                    } else {
                        aVar2 = aVar3;
                        z10 = i15;
                    }
                    aVar = aVar2;
                    float f52 = f28;
                    c10 = c12;
                    float f53 = f29;
                    i12 = i14;
                    a.a(path, f52, f53, f47, f48, f49, f50, f51, z10, fArr[i11 + 4] != CropImageView.DEFAULT_ASPECT_RATIO ? 1 : i15);
                    f11 = f52 + fArr[i44];
                    f10 = f53 + fArr[i45];
                    f22 = f11;
                    f23 = f10;
                }
                i16 = i11 + i10;
                path2 = path;
                aVar3 = aVar;
                c12 = c10;
                i14 = i12;
                f28 = f11;
                f29 = f10;
                c11 = c12;
                fArr3 = fArr;
            }
            fArr2[i15] = f28;
            fArr2[1] = f29;
            fArr2[2] = f22;
            fArr2[3] = f23;
            fArr2[4] = f26;
            fArr2[5] = f27;
            c11 = aVar3.f23167a;
            i14++;
            aVarArr2 = aVarArr;
            path2 = path;
            i13 = i15;
        }
    }
}
