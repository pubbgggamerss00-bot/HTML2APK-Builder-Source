package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.text.TextUtils;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j31 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5914a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f5915b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f5916c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f5917d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f5918e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f5919f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f5920g;
    public static HashMap h;

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f5921i;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f5922j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5923k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f5924l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5925m;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f5914a = i6;
        String str = Build.DEVICE;
        f5915b = str;
        String str2 = Build.MANUFACTURER;
        f5916c = str2;
        String str3 = Build.MODEL;
        f5917d = str3;
        f5918e = str + ", " + str3 + ", " + str2 + ", " + i6;
        f5919f = new byte[0];
        f5920g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f5921i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f5922j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f5923k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f5924l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f5925m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String a(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strG = rj1.g(str);
        int i6 = 0;
        String str2 = strG.split("-", 2)[0];
        if (h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f5921i;
            int length2 = strArr.length;
            HashMap map = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i7 = 0; i7 < 88; i7 += 2) {
                map.put(strArr[i7], strArr[i7 + 1]);
            }
            h = map;
        }
        String str4 = (String) h.get(str2);
        if (str4 != null) {
            strG = str4.concat(String.valueOf(strG.substring(str2.length())));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strG;
        }
        while (true) {
            String[] strArr2 = f5922j;
            int length3 = strArr2.length;
            if (i6 >= 18) {
                return strG;
            }
            if (strG.startsWith(strArr2[i6])) {
                return String.valueOf(strArr2[i6 + 1]).concat(String.valueOf(strG.substring(strArr2[i6].length())));
            }
            i6 += 2;
        }
    }

    public static void b(long[] jArr, long j6) {
        long j7;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i6 = 0;
        if (j6 >= 1000000 && j6 % 1000000 == 0) {
            long jB = kq1.b(j6, 1000000L, RoundingMode.UNNECESSARY);
            while (i6 < jArr.length) {
                jArr[i6] = kq1.b(jArr[i6], jB, roundingMode);
                i6++;
            }
            return;
        }
        if (j6 < 1000000 && 1000000 % j6 == 0) {
            long jB2 = kq1.b(1000000L, j6, RoundingMode.UNNECESSARY);
            while (i6 < jArr.length) {
                jArr[i6] = kq1.d(jArr[i6], jB2);
                i6++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < jArr.length) {
            long j8 = jArr[i7];
            if (j8 != 0) {
                if (j6 >= j8 && j6 % j8 == 0) {
                    jArr[i7] = kq1.b(1000000L, kq1.b(j6, j8, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j6 >= j8 || j8 % j6 != 0) {
                    j7 = j6;
                    jArr[i7] = g(j8, 1000000L, j7, roundingMode);
                } else {
                    jArr[i7] = kq1.d(1000000L, kq1.b(j8, j6, RoundingMode.UNNECESSARY));
                }
                j7 = j6;
            } else {
                j7 = j6;
            }
            i7++;
            j6 = j7;
        }
    }

    public static boolean c(int i6) {
        return i6 == 3 || i6 == 2 || i6 == 268435456 || i6 == 21 || i6 == 1342177280 || i6 == 22 || i6 == 1610612736 || i6 == 4;
    }

    public static boolean d(Context context) {
        int i6 = f5914a;
        if (i6 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        String str = f5917d;
        if (i6 == 30 && (rj1.p(str, "moto g(20)") || rj1.p(str, "rmx3231"))) {
            return true;
        }
        return i6 == 34 && rj1.p(str, "sm-x200");
    }

    public static boolean e(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Object[] f(Object[] objArr, int i6) {
        y5.n(i6 <= objArr.length);
        return Arrays.copyOf(objArr, i6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long g(long j6, long j7, long j8, RoundingMode roundingMode) {
        double dRint;
        long j9;
        long j10;
        long jD = kq1.d(j6, j7);
        if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
            return kq1.b(jD, j8, roundingMode);
        }
        long jC = kq1.c(Math.abs(j7), Math.abs(j8));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jB = kq1.b(j7, jC, roundingMode2);
        long jB2 = kq1.b(j8, jC, roundingMode2);
        long jC2 = kq1.c(Math.abs(j6), Math.abs(jB2));
        long jB3 = kq1.b(j6, jC2, roundingMode2);
        long jB4 = kq1.b(jB2, jC2, roundingMode2);
        long jD2 = kq1.d(jB3, jB);
        if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
            return kq1.b(jD2, jB4, roundingMode);
        }
        double d7 = (jB / jB4) * jB3;
        if (d7 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d7 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i6 = gq1.f5123a;
        if (!me0.m(d7)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (fq1.f4772a[roundingMode.ordinal()]) {
            case 1:
                lq1.b(gq1.b(d7));
                dRint = d7;
                if (!((-9.223372036854776E18d) - dRint >= 1.0d) || !(dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d7 < 0.0d && !gq1.b(d7)) {
                    j9 = (long) d7;
                    j10 = -1;
                    dRint = j9 + j10;
                    if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                    }
                }
                dRint = d7;
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d7 > 0.0d && !gq1.b(d7)) {
                    j9 = (long) d7;
                    j10 = 1;
                    dRint = j9 + j10;
                    if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                    }
                }
                dRint = d7;
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                dRint = d7;
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!gq1.b(d7)) {
                    dRint = ((long) d7) + (d7 > 0.0d ? 1 : -1);
                }
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                dRint = Math.rint(d7);
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                dRint = Math.rint(d7);
                if (Math.abs(d7 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d7) + d7;
                }
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                dRint = Math.rint(d7);
                if (Math.abs(d7 - dRint) == 0.5d) {
                }
                if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static String h(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e6) {
            qs0.d("Util", "Failed to read system property ".concat(str), e6);
            return null;
        }
    }

    public static int i(int[] iArr, int i6, boolean z6, boolean z7) {
        int i7;
        int i8;
        int iBinarySearch = Arrays.binarySearch(iArr, i6);
        if (iBinarySearch < 0) {
            i8 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i7 = iBinarySearch - 1;
                if (i7 < 0 || iArr[i7] != i6) {
                    break;
                }
                iBinarySearch = i7;
            }
            i8 = z6 ? iBinarySearch : i7;
        }
        return z7 ? Math.max(0, i8) : i8;
    }

    public static int j(long[] jArr, long j6, boolean z6) {
        int i6;
        int iBinarySearch = Arrays.binarySearch(jArr, j6);
        if (iBinarySearch < 0) {
            i6 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i7 = iBinarySearch - 1;
                if (i7 < 0 || jArr[i7] != j6) {
                    break;
                }
                iBinarySearch = i7;
            }
            i6 = iBinarySearch;
        }
        return z6 ? Math.max(0, i6) : i6;
    }

    public static int k(int i6, byte[] bArr, int i7, int i8) {
        while (i6 < i7) {
            i8 = f5923k[(i8 >>> 24) ^ (bArr[i6] & 255)] ^ (i8 << 8);
            i6++;
        }
        return i8;
    }

    public static int l(int i6) {
        if (i6 == 20) {
            return 30;
        }
        if (i6 == 22) {
            return 31;
        }
        if (i6 == 30) {
            return 34;
        }
        switch (i6) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i6) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m(int i6) {
        switch (i6) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f5914a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
    }

    public static int n(int i6) {
        if (i6 != 2) {
            if (i6 == 3) {
                return 1;
            }
            if (i6 != 4) {
                if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 != 268435456) {
                            if (i6 != 1342177280) {
                                if (i6 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int o(int i6) {
        if (i6 == 2 || i6 == 4) {
            return 6005;
        }
        if (i6 == 10) {
            return 6004;
        }
        if (i6 == 7) {
            return 6005;
        }
        if (i6 == 8) {
            return 6003;
        }
        switch (i6) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case dn.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i6) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int p(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z6 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i6 = Integer.parseInt(str2);
            return z6 ? -i6 : i6;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int q(int i6) {
        if (i6 == 8) {
            return 3;
        }
        if (i6 == 16) {
            return 2;
        }
        if (i6 != 24) {
            return i6 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static long r(long j6, float f6) {
        return f6 == 1.0f ? j6 : Math.round(j6 * f6);
    }

    public static long s(long j6) {
        return (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? j6 : j6 * 1000;
    }

    public static long t(int i6, long j6) {
        return u(j6, 1000000L, i6, RoundingMode.DOWN);
    }

    public static long u(long j6, long j7, long j8, RoundingMode roundingMode) {
        if (j6 == 0 || j7 == 0) {
            return 0L;
        }
        return (j8 < j7 || j8 % j7 != 0) ? (j8 >= j7 || j7 % j8 != 0) ? (j8 < j6 || j8 % j6 != 0) ? (j8 >= j6 || j6 % j8 != 0) ? g(j6, j7, j8, roundingMode) : kq1.d(j7, kq1.b(j6, j8, RoundingMode.UNNECESSARY)) : kq1.b(j7, kq1.b(j8, j6, RoundingMode.UNNECESSARY), roundingMode) : kq1.d(j6, kq1.b(j7, j8, RoundingMode.UNNECESSARY)) : kq1.b(j6, kq1.b(j8, j7, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long v(long j6) {
        return (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? j6 : j6 / 1000;
    }

    public static AudioFormat w(int i6, int i7, int i8) {
        return new AudioFormat.Builder().setSampleRate(i6).setChannelMask(i7).setEncoding(i8).build();
    }
}
