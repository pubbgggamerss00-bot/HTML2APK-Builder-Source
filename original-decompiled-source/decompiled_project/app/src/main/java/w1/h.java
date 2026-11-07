package w1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import w1.g;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public float[] f31182a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0400 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(h hVar, String str) {
        int i10;
        int i11;
        char cCharAt;
        char c10;
        int i12;
        ?? r20;
        int i13;
        long j10;
        boolean z10;
        char cCharAt2;
        int i14;
        int i15;
        char c11;
        char c12;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        long j11;
        boolean z11;
        long j12;
        int iFloatToRawIntBits;
        long jFloatToRawIntBits;
        long j13;
        int i22;
        long j14;
        long jFloatToRawIntBits2;
        int i23;
        boolean z12;
        float fIntBitsToFloat;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i24 = 0;
        while (true) {
            i10 = 32;
            if (i24 >= length || r.f(str.charAt(i24), 32) > 0) {
                break;
            }
            i24++;
        }
        while (length > i24 && r.f(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i25 = 0;
        while (i24 < length) {
            while (true) {
                i11 = i24 + 1;
                cCharAt = str.charAt(i24);
                int i26 = cCharAt | ' ';
                if ((i26 - 122) * (i26 - 97) > 0 || i26 == 101) {
                    if (i11 >= length) {
                        cCharAt = 0;
                    } else {
                        i24 = i11;
                    }
                }
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i25 = 0;
                    while (true) {
                        if (i11 >= length || r.f(str.charAt(i11), i10) > 0) {
                            if (i11 == length) {
                                int i27 = i10;
                                i13 = i25;
                                jFloatToRawIntBits = (i11 << i27) | (Float.floatToRawIntBits(Float.NaN) & BodyPartID.bodyIdMax);
                                c10 = cCharAt;
                                i12 = i27;
                            } else {
                                int i28 = i10;
                                i13 = i25;
                                char cCharAt3 = str.charAt(i11);
                                boolean z13 = cCharAt3 == '-';
                                i12 = i28;
                                if (z13) {
                                    i14 = i11 + 1;
                                    if (i14 == length) {
                                        jFloatToRawIntBits = (i14 << i12) | (Float.floatToRawIntBits(Float.NaN) & BodyPartID.bodyIdMax);
                                        c10 = cCharAt;
                                    } else {
                                        z10 = true;
                                        z12 = true;
                                        z10 = true;
                                        cCharAt2 = str.charAt(i14);
                                        j10 = 4294967295L;
                                        if (((char) (cCharAt2 - '0')) >= '\n' && cCharAt2 != '.') {
                                            j14 = i14 << i12;
                                            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                        jFloatToRawIntBits = j14 | (jFloatToRawIntBits2 & j10);
                                        c10 = cCharAt;
                                        r20 = z12;
                                        int i29 = (int) (jFloatToRawIntBits >>> i12);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j10));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            float[] fArr = hVar.f31182a;
                                            i25 = i13 + 1;
                                            fArr[i13] = fIntBitsToFloat;
                                            if (i25 >= fArr.length) {
                                                float[] fArr2 = new float[i25 * 2];
                                                hVar.f31182a = fArr2;
                                                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                            }
                                            i11 = i29;
                                        } else {
                                            i11 = i29;
                                            i25 = i13;
                                        }
                                        while (i11 < length && str.charAt(i11) == ',') {
                                            i11++;
                                        }
                                        if (i11 >= length && !Float.isNaN(fIntBitsToFloat)) {
                                            i10 = i12;
                                            cCharAt = c10;
                                        }
                                    }
                                } else {
                                    j10 = 4294967295L;
                                    z10 = true;
                                    cCharAt2 = cCharAt3;
                                    i14 = i11;
                                }
                                int length2 = str.length();
                                int i30 = i14;
                                long j15 = 0;
                                while (i30 != length) {
                                    int i31 = cCharAt2 - '0';
                                    if (((char) i31) < '\n') {
                                        int i32 = i11;
                                        j15 = (j15 * 10) + i31;
                                        i30++;
                                        cCharAt2 = i30 < length2 ? str.charAt(i30) : (char) 0;
                                        i11 = i32;
                                    } else {
                                        int i33 = i11;
                                        i15 = i30 - i14;
                                        if (i30 == length && cCharAt2 == '.') {
                                            int i34 = i30 + 1;
                                            i16 = i34;
                                            c11 = 16;
                                            while (true) {
                                                c12 = '0';
                                                if (length - i16 >= 4) {
                                                    i23 = i34;
                                                    long jCharAt = str.charAt(i16) | (str.charAt(i16 + 1) << 16) | (str.charAt(i16 + 2) << i12) | (str.charAt(i16 + 3) << 48);
                                                    long j16 = jCharAt - 13511005043687472L;
                                                    int i35 = (((jCharAt + 19703549022044230L) | j16) & (-35747867511423104L)) != 0 ? -1 : (int) ((j16 * 281475406208040961L) >>> 48);
                                                    if (i35 >= 0) {
                                                        j15 = (j15 * 10000) + i35;
                                                        i16 += 4;
                                                        i34 = i23;
                                                    }
                                                } else {
                                                    i23 = i34;
                                                }
                                            }
                                            char cCharAt4 = i16 < length2 ? str.charAt(i16) : (char) 0;
                                            while (true) {
                                                cCharAt2 = cCharAt4;
                                                while (i16 != length) {
                                                    int i36 = cCharAt2 - '0';
                                                    if (((char) i36) < '\n') {
                                                        j15 = (j15 * 10) + i36;
                                                        i16++;
                                                        if (i16 < length2) {
                                                            break;
                                                        }
                                                        cCharAt2 = 0;
                                                    }
                                                }
                                                cCharAt4 = str.charAt(i16);
                                            }
                                            int i37 = i23 - i16;
                                            i15 -= i37;
                                            i18 = i37;
                                            i17 = i23;
                                        } else {
                                            c11 = 16;
                                            c12 = '0';
                                            i16 = i30;
                                            i17 = i16;
                                            i18 = 0;
                                        }
                                        if (i15 != 0) {
                                            j14 = i16 << i12;
                                            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            z12 = z10;
                                            jFloatToRawIntBits = j14 | (jFloatToRawIntBits2 & j10);
                                            c10 = cCharAt;
                                            r20 = z12;
                                            int i292 = (int) (jFloatToRawIntBits >>> i12);
                                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j10));
                                            if (Float.isNaN(fIntBitsToFloat)) {
                                            }
                                            while (i11 < length) {
                                                i11++;
                                            }
                                            if (i11 >= length) {
                                            }
                                        } else {
                                            if ((cCharAt2 | ' ') == 101) {
                                                i20 = i16 + 1;
                                                char cCharAt5 = i20 < length2 ? str.charAt(i20) : (char) 0;
                                                boolean z14 = cCharAt5 == '-' ? z10 ? 1 : 0 : false;
                                                i19 = i33;
                                                if (z14 || cCharAt5 == '+') {
                                                    i20 = i16 + 2;
                                                }
                                                char cCharAt6 = str.charAt(i20);
                                                int i38 = 0;
                                                while (true) {
                                                    if (i20 != length) {
                                                        int i39 = cCharAt6 - '0';
                                                        i22 = i18;
                                                        if (((char) i39) < '\n') {
                                                            if (i38 < 1024) {
                                                                i38 = (i38 * 10) + i39;
                                                            }
                                                            i20++;
                                                            cCharAt6 = i20 < length2 ? str.charAt(i20) : (char) 0;
                                                            i18 = i22;
                                                        }
                                                    } else {
                                                        i22 = i18;
                                                    }
                                                }
                                                i21 = z14 ? -i38 : i38;
                                                i18 = i22 + i21;
                                            } else {
                                                i19 = i33;
                                                i20 = i16;
                                                i21 = 0;
                                            }
                                            int i40 = 19;
                                            if (i15 > 19) {
                                                char cCharAt7 = str.charAt(i14);
                                                int i41 = i14;
                                                while (true) {
                                                    if (i20 != length) {
                                                        if (cCharAt7 == c12 || cCharAt7 == '.') {
                                                            if (cCharAt7 == '0') {
                                                                i15--;
                                                            }
                                                            int i42 = i41 + 1;
                                                            cCharAt7 = i42 < length2 ? str.charAt(i42) : (char) 0;
                                                            i41 = i42;
                                                            i40 = 19;
                                                            c12 = '0';
                                                        } else {
                                                            i40 = 19;
                                                        }
                                                    }
                                                }
                                                if (i15 > i40) {
                                                    char cCharAt8 = str.charAt(i14);
                                                    int i43 = i21;
                                                    c10 = cCharAt;
                                                    j11 = 0;
                                                    while (true) {
                                                        if (i14 != i30 && Long.compareUnsigned(j11, 1000000000000000000L) < 0) {
                                                            j11 = (j11 * 10) + (cCharAt8 - '0');
                                                            i14++;
                                                            cCharAt8 = i14 < length2 ? str.charAt(i14) : (char) 0;
                                                        }
                                                    }
                                                    if (Long.compareUnsigned(j11, 1000000000000000000L) >= 0) {
                                                        i18 = (i30 - i14) + i43;
                                                    } else {
                                                        char cCharAt9 = str.charAt(i17);
                                                        int i44 = i17;
                                                        for (j13 = 1000000000000000000L; i44 != i16 && Long.compareUnsigned(j11, j13) < 0; j13 = 1000000000000000000L) {
                                                            j11 = (j11 * 10) + (cCharAt9 - '0');
                                                            i44++;
                                                            cCharAt9 = i44 < length2 ? str.charAt(i44) : (char) 0;
                                                        }
                                                        i18 = (i17 - i44) + i43;
                                                    }
                                                    z11 = z10 ? 1 : 0;
                                                } else {
                                                    c10 = cCharAt;
                                                    j11 = j15;
                                                    z11 = false;
                                                }
                                                if (-10 <= i18 && i18 < 11 && !z11 && Long.compareUnsigned(j11, 16777216L) <= 0) {
                                                    float f10 = j11;
                                                    float[] fArr3 = b.f31046a;
                                                    float f11 = i18 < 0 ? f10 / fArr3[-i18] : f10 * fArr3[i18];
                                                    if (z13) {
                                                        f11 = -f11;
                                                    }
                                                    j12 = i20 << i12;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                                                } else if (j11 == 0) {
                                                    j12 = i20 << i12;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(z13 ? -0.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                                                } else if (-126 > i18 || i18 >= 128) {
                                                    String strSubstring = str.substring(i19, i20);
                                                    r.d(strSubstring, "substring(...)");
                                                    j12 = i20 << i12;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring));
                                                } else {
                                                    long j17 = b.f31047b[i18 + 325];
                                                    int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j11);
                                                    long j18 = j11 << iNumberOfLeadingZeros;
                                                    long j19 = j18 & j10;
                                                    long j20 = j18 >>> i12;
                                                    long j21 = j17 & j10;
                                                    long j22 = j17 >>> i12;
                                                    long j23 = j20 * j22;
                                                    long j24 = j22 * j19;
                                                    long j25 = j23 + ((((j20 * j21) + ((j19 * j21) >>> i12)) + (j24 & j10)) >>> i12) + (j24 >>> i12);
                                                    int i45 = (int) (j25 >>> 63);
                                                    long j26 = j25 >>> (i45 + 9);
                                                    int i46 = iNumberOfLeadingZeros + (i45 ^ 1);
                                                    long j27 = j25 & 511;
                                                    if (j27 == 511 || (j27 == 0 && (3 & j26) == 1)) {
                                                        String strSubstring2 = str.substring(i19, i20);
                                                        r.d(strSubstring2, "substring(...)");
                                                        j12 = i20 << i12;
                                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring2));
                                                    } else {
                                                        long j28 = (j26 + 1) >>> (z10 ? 1L : 0L);
                                                        if (j28 >= 9007199254740992L) {
                                                            i46--;
                                                            j28 = 4503599627370496L;
                                                        }
                                                        long j29 = j28 & (-4503599627370497L);
                                                        long j30 = ((((i18 * 217706) >> c11) + 1024) + 63) - i46;
                                                        if (j30 < 1 || j30 > 2046) {
                                                            String strSubstring3 = str.substring(i19, i20);
                                                            r.d(strSubstring3, "substring(...)");
                                                            j12 = i20 << i12;
                                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring3));
                                                        } else {
                                                            j12 = i20 << i12;
                                                            iFloatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j30 << 52) | j29 | (z13 ? Long.MIN_VALUE : 0L)));
                                                        }
                                                    }
                                                }
                                                jFloatToRawIntBits = j12 | (iFloatToRawIntBits & j10);
                                                r20 = z10;
                                                int i2922 = (int) (jFloatToRawIntBits >>> i12);
                                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j10));
                                                if (Float.isNaN(fIntBitsToFloat)) {
                                                }
                                                while (i11 < length) {
                                                }
                                                if (i11 >= length) {
                                                }
                                            }
                                        }
                                    }
                                }
                                int i332 = i11;
                                i15 = i30 - i14;
                                if (i30 == length) {
                                    c11 = 16;
                                    c12 = '0';
                                    i16 = i30;
                                    i17 = i16;
                                    i18 = 0;
                                    if (i15 != 0) {
                                    }
                                }
                            }
                            j10 = 4294967295L;
                            r20 = 1;
                            int i29222 = (int) (jFloatToRawIntBits >>> i12);
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j10));
                            if (Float.isNaN(fIntBitsToFloat)) {
                            }
                            while (i11 < length) {
                            }
                            if (i11 >= length) {
                            }
                        } else {
                            i11++;
                        }
                    }
                } else {
                    c10 = cCharAt;
                    i12 = i10;
                    r20 = 1;
                }
                i24 = i11;
                float[] fArr4 = hVar.f31182a;
                int i47 = 2;
                switch (c10) {
                    case EACTags.ELEMENT_LIST /* 65 */:
                        int i48 = i25 - 7;
                        for (int i49 = 0; i49 <= i48; i49 += 7) {
                            arrayList.add(new g.a(fArr4[i49], fArr4[i49 + 1], fArr4[i49 + 2], Float.compare(fArr4[i49 + 3], CropImageView.DEFAULT_ASPECT_RATIO) != 0 ? r20 : false, Float.compare(fArr4[i49 + 4], CropImageView.DEFAULT_ASPECT_RATIO) != 0 ? r20 : false, fArr4[i49 + 5], fArr4[i49 + 6]));
                        }
                        i10 = i12;
                        break;
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        int i50 = i25 - 6;
                        for (int i51 = 0; i51 <= i50; i51 += 6) {
                            arrayList.add(new g.c(fArr4[i51], fArr4[i51 + 1], fArr4[i51 + 2], fArr4[i51 + 3], fArr4[i51 + 4], fArr4[i51 + 5]));
                        }
                        i10 = i12;
                        break;
                    case 'H':
                        int i52 = i25 - 1;
                        for (int i53 = 0; i53 <= i52; i53++) {
                            arrayList.add(new g.d(fArr4[i53]));
                        }
                        i10 = i12;
                        break;
                    case 'L':
                        int i54 = i25 - 2;
                        for (int i55 = 0; i55 <= i54; i55 += 2) {
                            arrayList.add(new g.e(fArr4[i55], fArr4[i55 + 1]));
                        }
                        i10 = i12;
                        break;
                    case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                        int i56 = i25 - 2;
                        if (i56 >= 0) {
                            arrayList.add(new g.f(fArr4[0], fArr4[r20]));
                            while (i47 <= i56) {
                                arrayList.add(new g.e(fArr4[i47], fArr4[i47 + 1]));
                                i47 += 2;
                            }
                        }
                        i10 = i12;
                        break;
                    case EACTags.ANSWER_TO_RESET /* 81 */:
                        int i57 = i25 - 4;
                        for (int i58 = 0; i58 <= i57; i58 += 4) {
                            arrayList.add(new g.C0315g(fArr4[i58], fArr4[i58 + 1], fArr4[i58 + 2], fArr4[i58 + 3]));
                        }
                        i10 = i12;
                        break;
                    case 'S':
                        int i59 = i25 - 4;
                        for (int i60 = 0; i60 <= i59; i60 += 4) {
                            arrayList.add(new g.h(fArr4[i60], fArr4[i60 + 1], fArr4[i60 + 2], fArr4[i60 + 3]));
                        }
                        i10 = i12;
                        break;
                    case HeaderItem.FIELD_START_OFFSET /* 84 */:
                        int i61 = i25 - 2;
                        for (int i62 = 0; i62 <= i61; i62 += 2) {
                            arrayList.add(new g.i(fArr4[i62], fArr4[i62 + 1]));
                        }
                        i10 = i12;
                        break;
                    case 'V':
                        int i63 = i25 - 1;
                        for (int i64 = 0; i64 <= i63; i64++) {
                            arrayList.add(new g.s(fArr4[i64]));
                        }
                        i10 = i12;
                        break;
                    case 'Z':
                    case 'z':
                        arrayList.add(g.b.f31130c);
                        i10 = i12;
                        break;
                    case 'a':
                        int i65 = i25 - 7;
                        for (int i66 = 0; i66 <= i65; i66 += 7) {
                            arrayList.add(new g.j(fArr4[i66], fArr4[i66 + 1], fArr4[i66 + 2], Float.compare(fArr4[i66 + 3], CropImageView.DEFAULT_ASPECT_RATIO) != 0 ? r20 : false, Float.compare(fArr4[i66 + 4], CropImageView.DEFAULT_ASPECT_RATIO) != 0 ? r20 : false, fArr4[i66 + 5], fArr4[i66 + 6]));
                        }
                        i10 = i12;
                        break;
                    case 'c':
                        int i67 = i25 - 6;
                        for (int i68 = 0; i68 <= i67; i68 += 6) {
                            arrayList.add(new g.k(fArr4[i68], fArr4[i68 + 1], fArr4[i68 + 2], fArr4[i68 + 3], fArr4[i68 + 4], fArr4[i68 + 5]));
                        }
                        i10 = i12;
                        break;
                    case HeaderItem.DATA_SIZE_OFFSET /* 104 */:
                        int i69 = i25 - 1;
                        for (int i70 = 0; i70 <= i69; i70++) {
                            arrayList.add(new g.l(fArr4[i70]));
                        }
                        i10 = i12;
                        break;
                    case HeaderItem.DATA_START_OFFSET /* 108 */:
                        int i71 = i25 - 2;
                        for (int i72 = 0; i72 <= i71; i72 += 2) {
                            arrayList.add(new g.m(fArr4[i72], fArr4[i72 + 1]));
                        }
                        i10 = i12;
                        break;
                    case 'm':
                        int i73 = i25 - 2;
                        if (i73 >= 0) {
                            arrayList.add(new g.n(fArr4[0], fArr4[r20]));
                            while (i47 <= i73) {
                                arrayList.add(new g.m(fArr4[i47], fArr4[i47 + 1]));
                                i47 += 2;
                            }
                        }
                        i10 = i12;
                        break;
                    case 'q':
                        int i74 = i25 - 4;
                        for (int i75 = 0; i75 <= i74; i75 += 4) {
                            arrayList.add(new g.o(fArr4[i75], fArr4[i75 + 1], fArr4[i75 + 2], fArr4[i75 + 3]));
                        }
                        i10 = i12;
                        break;
                    case 's':
                        int i76 = i25 - 4;
                        for (int i77 = 0; i77 <= i76; i77 += 4) {
                            arrayList.add(new g.p(fArr4[i77], fArr4[i77 + 1], fArr4[i77 + 2], fArr4[i77 + 3]));
                        }
                        i10 = i12;
                        break;
                    case CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET /* 116 */:
                        int i78 = i25 - 2;
                        for (int i79 = 0; i79 <= i78; i79 += 2) {
                            arrayList.add(new g.q(fArr4[i79], fArr4[i79 + 1]));
                        }
                        i10 = i12;
                        break;
                    case 'v':
                        int i80 = i25 - 1;
                        for (int i81 = 0; i81 <= i80; i81++) {
                            arrayList.add(new g.r(fArr4[i81]));
                        }
                        i10 = i12;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + c10);
                }
            } else {
                i24 = i11;
            }
        }
        return arrayList;
    }
}
