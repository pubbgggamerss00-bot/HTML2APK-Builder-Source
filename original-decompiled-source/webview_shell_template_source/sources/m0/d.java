package m0;

import android.graphics.Path;
import android.util.Log;
import androidx.camera.camera2.internal.v0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {
    public static float[] a(float[] fArr, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i6, length);
        float[] fArr2 = new float[i6];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a[] b(String str) {
        int i6;
        String strTrim;
        float[] fArrA;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        while (i9 < str.length()) {
            while (i9 < str.length()) {
                char cCharAt = str.charAt(i9);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i9++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i9++;
                } else {
                    strTrim = str.substring(i8, i9).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i7) == 'z' || strTrim.charAt(i7) == 'Z') {
                            fArrA = new float[i7];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i10 = i7;
                                int i11 = 1;
                                while (i11 < length) {
                                    int i12 = i7;
                                    int i13 = i12;
                                    int i14 = i13;
                                    int i15 = i14;
                                    for (int i16 = i11; i16 < strTrim.length(); i16++) {
                                        char cCharAt2 = strTrim.charAt(i16);
                                        if (cCharAt2 == ' ') {
                                            i12 = 0;
                                            i14 = 1;
                                            if (i14 != 0) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i16 != i11 && i12 == 0) {
                                                            i12 = 0;
                                                            i14 = 1;
                                                            i15 = 1;
                                                            break;
                                                        }
                                                        i12 = 0;
                                                        break;
                                                    case '.':
                                                        if (i13 == 0) {
                                                            i12 = 0;
                                                            i13 = 1;
                                                            break;
                                                        } else {
                                                            i12 = 0;
                                                            i14 = 1;
                                                            i15 = 1;
                                                            break;
                                                        }
                                                    default:
                                                        i12 = 0;
                                                        break;
                                                }
                                            } else {
                                                i12 = 1;
                                            }
                                            if (i14 != 0) {
                                            }
                                        }
                                        if (i11 < i16) {
                                            fArr[i10] = Float.parseFloat(strTrim.substring(i11, i16));
                                            i10++;
                                        }
                                        i11 = i15 == 0 ? i16 : i16 + 1;
                                        i7 = 0;
                                    }
                                    if (i11 < i16) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    i7 = 0;
                                }
                                fArrA = a(fArr, i10);
                                i7 = 0;
                            } catch (NumberFormatException e6) {
                                throw new RuntimeException(v0.b("error in parsing \"", strTrim, "\""), e6);
                            }
                        }
                        arrayList.add(new a(strTrim.charAt(i7), fArrA));
                    }
                    i8 = i9;
                    i9++;
                    i7 = 0;
                }
            }
            strTrim = str.substring(i8, i9).trim();
            if (!strTrim.isEmpty()) {
            }
            i8 = i9;
            i9++;
            i7 = 0;
        }
        if (i9 - i8 != 1 || i8 >= str.length()) {
            i6 = 0;
        } else {
            i6 = 0;
            arrayList.add(new a(str.charAt(i8), new float[0]));
        }
        return (a[]) arrayList.toArray(new a[i6]);
    }

    public static a[] c(a[] aVarArr) {
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            aVarArr2[i6] = new a(aVarArr[i6]);
        }
        return aVarArr2;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public char f13859a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f13860b;

        public a(char c7, float[] fArr) {
            this.f13859a = c7;
            this.f13860b = fArr;
        }

        public static void a(Path path, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z6, boolean z7) {
            double d7;
            double d8;
            double radians = Math.toRadians(f12);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d9 = f6;
            double d10 = f7;
            double d11 = f10;
            double d12 = ((d10 * dSin) + (d9 * dCos)) / d11;
            double d13 = f11;
            double d14 = ((d10 * dCos) + ((-f6) * dSin)) / d13;
            double d15 = f9;
            double d16 = ((d15 * dSin) + (f8 * dCos)) / d11;
            double d17 = ((d15 * dCos) + ((-f8) * dSin)) / d13;
            double d18 = d12 - d16;
            double d19 = d14 - d17;
            double d20 = (d12 + d16) / 2.0d;
            double d21 = (d14 + d17) / 2.0d;
            double d22 = (d19 * d19) + (d18 * d18);
            if (d22 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d22);
                float fSqrt = (float) (Math.sqrt(d22) / 1.99999d);
                a(path, f6, f7, f8, f9, f10 * fSqrt, fSqrt * f11, f12, z6, z7);
                return;
            }
            double dSqrt = Math.sqrt(d23);
            double d24 = dSqrt * d18;
            double d25 = dSqrt * d19;
            if (z6 == z7) {
                d7 = d20 - d25;
                d8 = d21 + d24;
            } else {
                d7 = d20 + d25;
                d8 = d21 - d24;
            }
            double dAtan2 = Math.atan2(d14 - d8, d12 - d7);
            double dAtan22 = Math.atan2(d17 - d8, d16 - d7) - dAtan2;
            if (z7 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d26 = d7 * d11;
            double d27 = d8 * d13;
            double d28 = (d26 * dCos) - (d27 * dSin);
            double d29 = (d27 * dCos) + (d26 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d30 = -d11;
            double d31 = d30 * dCos2;
            double d32 = d13 * dSin2;
            double d33 = (d31 * dSin3) - (d32 * dCos3);
            double d34 = d30 * dSin2;
            double d35 = d13 * dCos2;
            double d36 = dAtan22 / iCeil;
            double d37 = (dCos3 * d35) + (dSin3 * d34);
            double d38 = d9;
            double d39 = d10;
            int i6 = 0;
            double d40 = dAtan2;
            while (i6 < iCeil) {
                double d41 = d40 + d36;
                double dSin4 = Math.sin(d41);
                double dCos4 = Math.cos(d41);
                int i7 = iCeil;
                double d42 = (((d11 * dCos2) * dCos4) + d28) - (d32 * dSin4);
                double d43 = (d35 * dSin4) + (d11 * dSin2 * dCos4) + d29;
                double d44 = (d31 * dSin4) - (d32 * dCos4);
                double d45 = (dCos4 * d35) + (dSin4 * d34);
                double d46 = d41 - d40;
                double dTan = Math.tan(d46 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d33 * dSqrt2) + d38), (float) ((d37 * dSqrt2) + d39), (float) (d42 - (dSqrt2 * d44)), (float) (d43 - (dSqrt2 * d45)), (float) d42, (float) d43);
                i6++;
                d39 = d43;
                dCos2 = dCos2;
                d34 = d34;
                d40 = d41;
                d37 = d45;
                d38 = d42;
                iCeil = i7;
                d33 = d44;
                d36 = d36;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated
        public static void b(a[] aVarArr, Path path) {
            int i6;
            float[] fArr;
            int i7;
            a aVar;
            int i8;
            char c7;
            float f6;
            float f7;
            a aVar2;
            boolean z6;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            a[] aVarArr2 = aVarArr;
            Path path2 = path;
            float[] fArr2 = new float[6];
            int length = aVarArr2.length;
            int i9 = 0;
            int i10 = 0;
            char c8 = 'm';
            while (i10 < length) {
                a aVar3 = aVarArr2[i10];
                char c9 = aVar3.f13859a;
                float[] fArr3 = aVar3.f13860b;
                float f16 = fArr2[i9];
                float f17 = fArr2[1];
                float f18 = fArr2[2];
                float f19 = fArr2[3];
                float f20 = fArr2[4];
                int i11 = i9;
                float f21 = fArr2[5];
                switch (c9) {
                    case 'A':
                    case 'a':
                        i6 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i6 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i6 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i6 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path2.close();
                        path2.moveTo(f20, f21);
                        f16 = f20;
                        f18 = f16;
                        f17 = f21;
                        f19 = f17;
                    default:
                        i6 = 2;
                        break;
                }
                float f22 = f20;
                float f23 = f21;
                float f24 = f16;
                float f25 = f17;
                int i12 = i11;
                while (i12 < fArr3.length) {
                    if (c9 == 'A') {
                        fArr = fArr3;
                        i7 = i12;
                        aVar = aVar3;
                        float f26 = f24;
                        float f27 = f25;
                        i8 = i10;
                        c7 = c9;
                        int i13 = i7 + 5;
                        int i14 = i7 + 6;
                        a(path, f26, f27, fArr[i13], fArr[i14], fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3] != 0.0f ? 1 : i11, fArr[i7 + 4] != 0.0f ? 1 : i11);
                        f18 = fArr[i13];
                        f6 = fArr[i14];
                        f19 = f6;
                        f7 = f18;
                    } else if (c9 == 'C') {
                        fArr = fArr3;
                        i7 = i12;
                        i8 = i10;
                        aVar = aVar3;
                        c7 = c9;
                        int i15 = i7 + 2;
                        int i16 = i7 + 3;
                        int i17 = i7 + 4;
                        int i18 = i7 + 5;
                        path2.cubicTo(fArr[i7], fArr[i7 + 1], fArr[i15], fArr[i16], fArr[i17], fArr[i18]);
                        float f28 = fArr[i17];
                        float f29 = fArr[i18];
                        f18 = fArr[i15];
                        f19 = fArr[i16];
                        f6 = f29;
                        f7 = f28;
                    } else if (c9 == 'H') {
                        fArr = fArr3;
                        i7 = i12;
                        aVar = aVar3;
                        c7 = c9;
                        f6 = f25;
                        i8 = i10;
                        path2.lineTo(fArr[i7], f6);
                        f7 = fArr[i7];
                    } else if (c9 == 'Q') {
                        fArr = fArr3;
                        i7 = i12;
                        i8 = i10;
                        aVar = aVar3;
                        c7 = c9;
                        int i19 = i7 + 1;
                        int i20 = i7 + 2;
                        int i21 = i7 + 3;
                        path2.quadTo(fArr[i7], fArr[i19], fArr[i20], fArr[i21]);
                        float f30 = fArr[i7];
                        float f31 = fArr[i19];
                        float f32 = fArr[i20];
                        float f33 = fArr[i21];
                        f18 = f30;
                        f19 = f31;
                        f7 = f32;
                        f6 = f33;
                    } else if (c9 == 'V') {
                        fArr = fArr3;
                        i7 = i12;
                        i8 = i10;
                        aVar = aVar3;
                        f7 = f24;
                        c7 = c9;
                        path2.lineTo(f7, fArr[i7]);
                        f6 = fArr[i7];
                    } else if (c9 != 'a') {
                        if (c9 == 'c') {
                            fArr = fArr3;
                            i7 = i12;
                            int i22 = i7 + 2;
                            int i23 = i7 + 3;
                            int i24 = i7 + 4;
                            int i25 = i7 + 5;
                            path2.rCubicTo(fArr[i7], fArr[i7 + 1], fArr[i22], fArr[i23], fArr[i24], fArr[i25]);
                            float f34 = fArr[i22] + f24;
                            float f35 = fArr[i23] + f25;
                            f24 += fArr[i24];
                            f25 += fArr[i25];
                            f18 = f34;
                            f19 = f35;
                        } else if (c9 != 'h') {
                            if (c9 != 'q') {
                                if (c9 != 'v') {
                                    if (c9 == 'L') {
                                        fArr = fArr3;
                                        i7 = i12;
                                        int i26 = i7 + 1;
                                        path2.lineTo(fArr[i7], fArr[i26]);
                                        f7 = fArr[i7];
                                        f6 = fArr[i26];
                                    } else if (c9 == 'M') {
                                        fArr = fArr3;
                                        i7 = i12;
                                        f7 = fArr[i7];
                                        f6 = fArr[i7 + 1];
                                        if (i7 > 0) {
                                            path2.lineTo(f7, f6);
                                        } else {
                                            path2.moveTo(f7, f6);
                                            f22 = f7;
                                            f23 = f6;
                                        }
                                    } else if (c9 != 'S') {
                                        if (c9 == 'T') {
                                            fArr = fArr3;
                                            i7 = i12;
                                            if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                                f24 = (f24 * 2.0f) - f18;
                                                f25 = (f25 * 2.0f) - f19;
                                            }
                                            int i27 = i7 + 1;
                                            path2.quadTo(f24, f25, fArr[i7], fArr[i27]);
                                            f7 = fArr[i7];
                                            f6 = fArr[i27];
                                            aVar = aVar3;
                                            f18 = f24;
                                            f19 = f25;
                                        } else if (c9 == 'l') {
                                            fArr = fArr3;
                                            i7 = i12;
                                            int i28 = i7 + 1;
                                            path2.rLineTo(fArr[i7], fArr[i28]);
                                            f24 += fArr[i7];
                                            f11 = fArr[i28];
                                        } else if (c9 == 'm') {
                                            fArr = fArr3;
                                            i7 = i12;
                                            float f36 = fArr[i7];
                                            f24 += f36;
                                            float f37 = fArr[i7 + 1];
                                            f25 += f37;
                                            if (i7 > 0) {
                                                path2.rLineTo(f36, f37);
                                            } else {
                                                path2.rMoveTo(f36, f37);
                                                aVar = aVar3;
                                                f7 = f24;
                                                f22 = f7;
                                                f6 = f25;
                                                f23 = f6;
                                            }
                                        } else if (c9 != 's') {
                                            if (c9 != 't') {
                                                fArr = fArr3;
                                                i7 = i12;
                                                aVar = aVar3;
                                                f7 = f24;
                                            } else {
                                                if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                                    f14 = f24 - f18;
                                                    f15 = f25 - f19;
                                                } else {
                                                    f15 = 0.0f;
                                                    f14 = 0.0f;
                                                }
                                                int i29 = i12 + 1;
                                                path2.rQuadTo(f14, f15, fArr3[i12], fArr3[i29]);
                                                float f38 = f14 + f24;
                                                float f39 = f15 + f25;
                                                float f40 = f24 + fArr3[i12];
                                                f25 += fArr3[i29];
                                                f19 = f39;
                                                fArr = fArr3;
                                                i7 = i12;
                                                aVar = aVar3;
                                                f7 = f40;
                                                f18 = f38;
                                            }
                                            f6 = f25;
                                        } else {
                                            if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                                f12 = f25 - f19;
                                                f13 = f24 - f18;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i30 = i12;
                                            int i31 = i30 + 1;
                                            int i32 = i30 + 2;
                                            int i33 = i30 + 3;
                                            fArr = fArr3;
                                            i7 = i30;
                                            path2.rCubicTo(f13, f12, fArr3[i30], fArr3[i31], fArr3[i32], fArr3[i33]);
                                            f8 = fArr[i7] + f24;
                                            f9 = fArr[i31] + f25;
                                            f24 += fArr[i32];
                                            f10 = fArr[i33];
                                        }
                                        i8 = i10;
                                        c7 = c9;
                                    } else {
                                        fArr = fArr3;
                                        i7 = i12;
                                        if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                            f24 = (f24 * 2.0f) - f18;
                                            f25 = (f25 * 2.0f) - f19;
                                        }
                                        float f41 = f24;
                                        float f42 = f25;
                                        int i34 = i7 + 1;
                                        int i35 = i7 + 2;
                                        int i36 = i7 + 3;
                                        path2.cubicTo(f41, f42, fArr[i7], fArr[i34], fArr[i35], fArr[i36]);
                                        f18 = fArr[i7];
                                        f19 = fArr[i34];
                                        f7 = fArr[i35];
                                        f6 = fArr[i36];
                                    }
                                    i8 = i10;
                                    aVar = aVar3;
                                    c7 = c9;
                                } else {
                                    fArr = fArr3;
                                    i7 = i12;
                                    path2.rLineTo(0.0f, fArr[i7]);
                                    f11 = fArr[i7];
                                }
                                f25 += f11;
                            } else {
                                fArr = fArr3;
                                i7 = i12;
                                int i37 = i7 + 1;
                                int i38 = i7 + 2;
                                int i39 = i7 + 3;
                                path2.rQuadTo(fArr[i7], fArr[i37], fArr[i38], fArr[i39]);
                                f8 = fArr[i7] + f24;
                                f9 = fArr[i37] + f25;
                                f24 += fArr[i38];
                                f10 = fArr[i39];
                            }
                            f25 += f10;
                            f18 = f8;
                            f19 = f9;
                        } else {
                            fArr = fArr3;
                            i7 = i12;
                            path2.rLineTo(fArr[i7], 0.0f);
                            f24 += fArr[i7];
                        }
                        aVar = aVar3;
                        f7 = f24;
                        f6 = f25;
                        i8 = i10;
                        c7 = c9;
                    } else {
                        fArr = fArr3;
                        i7 = i12;
                        int i40 = i7 + 5;
                        float f43 = fArr[i40] + f24;
                        int i41 = i7 + 6;
                        float f44 = fArr[i41] + f25;
                        float f45 = fArr[i7];
                        float f46 = fArr[i7 + 1];
                        float f47 = fArr[i7 + 2];
                        if (fArr[i7 + 3] != 0.0f) {
                            aVar2 = aVar3;
                            z6 = 1;
                        } else {
                            aVar2 = aVar3;
                            z6 = i11;
                        }
                        aVar = aVar2;
                        float f48 = f24;
                        c7 = c9;
                        float f49 = f25;
                        i8 = i10;
                        a(path, f48, f49, f43, f44, f45, f46, f47, z6, fArr[i7 + 4] != 0.0f ? 1 : i11);
                        f7 = f48 + fArr[i40];
                        f6 = f49 + fArr[i41];
                        f18 = f7;
                        f19 = f6;
                    }
                    i12 = i7 + i6;
                    path2 = path;
                    aVar3 = aVar;
                    c9 = c7;
                    i10 = i8;
                    f24 = f7;
                    f25 = f6;
                    c8 = c9;
                    fArr3 = fArr;
                }
                fArr2[i11] = f24;
                fArr2[1] = f25;
                fArr2[2] = f18;
                fArr2[3] = f19;
                fArr2[4] = f22;
                fArr2[5] = f23;
                c8 = aVar3.f13859a;
                i10++;
                aVarArr2 = aVarArr;
                path2 = path;
                i9 = i11;
            }
        }

        public a(a aVar) {
            this.f13859a = aVar.f13859a;
            float[] fArr = aVar.f13860b;
            this.f13860b = d.a(fArr, fArr.length);
        }
    }
}
