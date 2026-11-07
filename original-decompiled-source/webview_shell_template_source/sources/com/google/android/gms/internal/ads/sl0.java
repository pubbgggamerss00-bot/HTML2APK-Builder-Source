package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class sl0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8977a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f8978b = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8979c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0351 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair a(w wVar) {
        int i6;
        int i7;
        int length;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num;
        Integer num2 = 1024;
        Integer numValueOf = Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
        int i13 = 2;
        String str = wVar.f9975j;
        String str2 = wVar.f9975j;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(wVar.f9978m)) {
            if (strArrSplit.length < 3) {
                androidx.camera.core.t.d(str2, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
                return null;
            }
            Matcher matcher = f8979c.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                androidx.camera.core.t.d(str2, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                int iHashCode = strGroup.hashCode();
                if (iHashCode != 1567) {
                    switch (iHashCode) {
                        case 1536:
                            if (!strGroup.equals("00")) {
                                num = null;
                                break;
                            } else {
                                num = 1;
                                break;
                            }
                        case 1537:
                            if (strGroup.equals("01")) {
                                num = 2;
                                break;
                            }
                            break;
                        case 1538:
                            if (strGroup.equals("02")) {
                                num = 4;
                                break;
                            }
                            break;
                        case 1539:
                            if (strGroup.equals("03")) {
                                num = 8;
                                break;
                            }
                            break;
                        case 1540:
                            if (strGroup.equals("04")) {
                                num = 16;
                                break;
                            }
                            break;
                        case 1541:
                            if (strGroup.equals("05")) {
                                num = 32;
                                break;
                            }
                            break;
                        case 1542:
                            if (strGroup.equals("06")) {
                                num = 64;
                                break;
                            }
                            break;
                        case 1543:
                            if (strGroup.equals("07")) {
                                num = 128;
                                break;
                            }
                            break;
                        case 1544:
                            if (strGroup.equals("08")) {
                                num = 256;
                                break;
                            }
                            break;
                        case 1545:
                            if (strGroup.equals("09")) {
                                num = numValueOf;
                                break;
                            }
                            break;
                    }
                } else if (strGroup.equals("10")) {
                    num = num2;
                }
            }
            if (num == null) {
                androidx.camera.core.t.d(strGroup, "Unknown Dolby Vision profile string: ", "CodecSpecificDataUtil");
                return null;
            }
            String str3 = strArrSplit[2];
            if (str3 != null) {
                int iHashCode2 = str3.hashCode();
                switch (iHashCode2) {
                    case 1537:
                        if (str3.equals("01")) {
                            num2 = 1;
                            break;
                        }
                        break;
                    case 1538:
                        if (str3.equals("02")) {
                            num2 = 2;
                            break;
                        }
                        break;
                    case 1539:
                        if (str3.equals("03")) {
                            num2 = 4;
                            break;
                        }
                        break;
                    case 1540:
                        if (str3.equals("04")) {
                            num2 = 8;
                            break;
                        }
                        break;
                    case 1541:
                        if (str3.equals("05")) {
                            num2 = 16;
                            break;
                        }
                        break;
                    case 1542:
                        if (str3.equals("06")) {
                            num2 = 32;
                            break;
                        }
                        break;
                    case 1543:
                        if (str3.equals("07")) {
                            num2 = 64;
                            break;
                        }
                        break;
                    case 1544:
                        if (str3.equals("08")) {
                            num2 = 128;
                            break;
                        }
                        break;
                    case 1545:
                        if (str3.equals("09")) {
                            num2 = 256;
                            break;
                        }
                        break;
                    default:
                        switch (iHashCode2) {
                            case 1567:
                                if (str3.equals("10")) {
                                    num2 = numValueOf;
                                    break;
                                }
                                break;
                            case 1568:
                                if (!str3.equals("11")) {
                                }
                                break;
                            case 1569:
                                if (str3.equals("12")) {
                                    num2 = 2048;
                                    break;
                                }
                                break;
                            case 1570:
                                if (str3.equals("13")) {
                                    num2 = 4096;
                                    break;
                                }
                                break;
                        }
                }
            } else {
                num2 = null;
            }
            if (num2 != null) {
                return new Pair(num, num2);
            }
            androidx.camera.core.t.d(str3, "Unknown Dolby Vision level string: ", "CodecSpecificDataUtil");
            return null;
        }
        String str4 = strArrSplit[0];
        switch (str4.hashCode()) {
            case 3004662:
                if (str4.equals("av01")) {
                    mb2 mb2Var = wVar.A;
                    if (strArrSplit.length < 4) {
                        androidx.camera.core.t.d(str2, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int i14 = Integer.parseInt(strArrSplit[1]);
                            int i15 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                            int i16 = Integer.parseInt(strArrSplit[3]);
                            if (i14 == 0) {
                                int i17 = 8;
                                if (i16 == 8) {
                                    i6 = 1;
                                } else if (i16 != 10) {
                                    androidx.activity.m.g(i16, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    i6 = (mb2Var == null || !(mb2Var.f7078d != null || (i7 = mb2Var.f7077c) == 7 || i7 == 6)) ? 2 : 4096;
                                }
                                switch (i15) {
                                    case 0:
                                        i17 = 1;
                                        break;
                                    case 1:
                                        i17 = 2;
                                        break;
                                    case 2:
                                        i17 = 4;
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        i17 = 16;
                                        break;
                                    case 5:
                                        i17 = 32;
                                        break;
                                    case 6:
                                        i17 = 64;
                                        break;
                                    case 7:
                                        i17 = 128;
                                        break;
                                    case 8:
                                        i17 = 256;
                                        break;
                                    case 9:
                                        i17 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                        break;
                                    case 10:
                                        i17 = 1024;
                                        break;
                                    case 11:
                                        i17 = 2048;
                                        break;
                                    case 12:
                                        i17 = 4096;
                                        break;
                                    case 13:
                                        i17 = 8192;
                                        break;
                                    case 14:
                                        i17 = 16384;
                                        break;
                                    case 15:
                                        i17 = 32768;
                                        break;
                                    case 16:
                                        i17 = 65536;
                                        break;
                                    case 17:
                                        i17 = 131072;
                                        break;
                                    case 18:
                                        i17 = 262144;
                                        break;
                                    case 19:
                                        i17 = 524288;
                                        break;
                                    case 20:
                                        i17 = 1048576;
                                        break;
                                    case dn.zzm /* 21 */:
                                        i17 = 2097152;
                                        break;
                                    case 22:
                                        i17 = 4194304;
                                        break;
                                    case 23:
                                        i17 = 8388608;
                                        break;
                                    default:
                                        i17 = -1;
                                        break;
                                }
                                if (i17 != -1) {
                                    break;
                                } else {
                                    androidx.activity.m.g(i15, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                androidx.activity.m.g(i14, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            androidx.camera.core.t.d(str2, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                }
                break;
            case 3006243:
                if (!str4.equals("avc1")) {
                }
                length = strArrSplit.length;
                if (length >= 2) {
                    androidx.camera.core.t.d(str2, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        if (strArrSplit[1].length() != 6) {
                            i8 = 16;
                            if (length < 3) {
                                qs0.f("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                break;
                            } else {
                                i9 = Integer.parseInt(strArrSplit[1]);
                                i10 = Integer.parseInt(strArrSplit[2]);
                            }
                        } else {
                            i8 = 16;
                            i9 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i10 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        }
                        if (i9 == 66) {
                            i13 = 1;
                        } else if (i9 != 77) {
                            i13 = i9 != 88 ? i9 != 100 ? i9 != 110 ? i9 != 122 ? i9 != 244 ? -1 : 64 : 32 : i8 : 8 : 4;
                        }
                        if (i13 != -1) {
                            switch (i10) {
                                case 10:
                                    i11 = 1;
                                    break;
                                case 11:
                                    i11 = 4;
                                    break;
                                case 12:
                                    i11 = 8;
                                    break;
                                case 13:
                                    i11 = i8;
                                    break;
                                default:
                                    switch (i10) {
                                        case 20:
                                            i11 = 32;
                                            break;
                                        case dn.zzm /* 21 */:
                                            i11 = 64;
                                            break;
                                        case 22:
                                            i11 = 128;
                                            break;
                                        default:
                                            switch (i10) {
                                                case 30:
                                                    i11 = 256;
                                                    break;
                                                case 31:
                                                    i11 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                                    break;
                                                case 32:
                                                    i11 = 1024;
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 40:
                                                            i11 = 2048;
                                                            break;
                                                        case 41:
                                                            i11 = 4096;
                                                            break;
                                                        case 42:
                                                            i11 = 8192;
                                                            break;
                                                        default:
                                                            switch (i10) {
                                                                case 50:
                                                                    i11 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i11 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i11 = 65536;
                                                                    break;
                                                                default:
                                                                    i11 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i11 != -1) {
                                break;
                            } else {
                                androidx.activity.m.g(i10, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            androidx.activity.m.g(i9, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                            break;
                        }
                    } catch (NumberFormatException unused2) {
                        androidx.camera.core.t.d(str2, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                }
                break;
            case 3006244:
                if (!str4.equals("avc2")) {
                }
                length = strArrSplit.length;
                if (length >= 2) {
                }
                break;
            case 3199032:
                if (!str4.equals("hev1")) {
                }
                break;
            case 3214780:
                if (!str4.equals("hvc1")) {
                }
                break;
            case 3356560:
                if (str4.equals("mp4a")) {
                    if (strArrSplit.length != 3) {
                        androidx.camera.core.t.d(str2, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            if ("audio/mp4a-latm".equals(bk.d(Integer.parseInt(strArrSplit[1], 16)))) {
                                int i18 = Integer.parseInt(strArrSplit[2]);
                                if (i18 == 17) {
                                    i12 = 17;
                                } else if (i18 == 20) {
                                    i12 = 20;
                                } else if (i18 == 23) {
                                    i12 = 23;
                                } else if (i18 == 29) {
                                    i12 = 29;
                                } else if (i18 == 39) {
                                    i12 = 39;
                                } else if (i18 != 42) {
                                    switch (i18) {
                                        case 1:
                                            i12 = 1;
                                            break;
                                        case 2:
                                            i12 = 2;
                                            break;
                                        case 3:
                                            i12 = 3;
                                            break;
                                        case 4:
                                            i12 = 4;
                                            break;
                                        case 5:
                                            i12 = 5;
                                            break;
                                        case 6:
                                            i12 = 6;
                                            break;
                                        default:
                                            i12 = -1;
                                            break;
                                    }
                                } else {
                                    i12 = 42;
                                }
                                if (i12 != -1) {
                                    break;
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            androidx.camera.core.t.d(str2, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                }
                break;
            case 3475740:
                if (str4.equals("s263")) {
                    Pair pair = new Pair(1, 1);
                    if (strArrSplit.length < 3) {
                        androidx.camera.core.t.d(str2, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                    } else {
                        try {
                            break;
                        } catch (NumberFormatException unused4) {
                            androidx.camera.core.t.d(str2, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        }
                    }
                    break;
                }
                break;
            case 3624515:
                if (str4.equals("vp09")) {
                    if (strArrSplit.length < 3) {
                        androidx.camera.core.t.d(str2, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int i19 = Integer.parseInt(strArrSplit[1]);
                            int i20 = Integer.parseInt(strArrSplit[2]);
                            int i21 = i19 != 0 ? i19 != 1 ? i19 != 2 ? i19 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i21 != -1) {
                                if (i20 == 10) {
                                    i13 = 1;
                                } else if (i20 != 11) {
                                    if (i20 == 20) {
                                        i13 = 4;
                                    } else if (i20 == 21) {
                                        i13 = 8;
                                    } else if (i20 == 30) {
                                        i13 = 16;
                                    } else if (i20 == 31) {
                                        i13 = 32;
                                    } else if (i20 == 40) {
                                        i13 = 64;
                                    } else if (i20 == 41) {
                                        i13 = 128;
                                    } else if (i20 == 50) {
                                        i13 = 256;
                                    } else if (i20 != 51) {
                                        switch (i20) {
                                            case 60:
                                                i13 = 2048;
                                                break;
                                            case 61:
                                                i13 = 4096;
                                                break;
                                            case 62:
                                                i13 = 8192;
                                                break;
                                            default:
                                                i13 = -1;
                                                break;
                                        }
                                    } else {
                                        i13 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                }
                                if (i13 != -1) {
                                    break;
                                } else {
                                    androidx.activity.m.g(i20, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                androidx.activity.m.g(i19, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused5) {
                            androidx.camera.core.t.d(str2, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(String str, String[] strArr, mb2 mb2Var) {
        int i6;
        Integer numValueOf;
        if (strArr.length < 4) {
            androidx.camera.core.t.d(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f8979c.matcher(strArr[1]);
        if (!matcher.matches()) {
            androidx.camera.core.t.d(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i6 = 1;
        } else {
            i6 = 6;
            if ("2".equals(strGroup)) {
                i6 = (mb2Var == null || mb2Var.f7077c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                androidx.camera.core.t.d(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        numValueOf = 2;
                        break;
                    }
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        numValueOf = 8;
                        break;
                    }
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        numValueOf = 32;
                        break;
                    }
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        numValueOf = 128;
                        break;
                    }
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        numValueOf = Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
                        break;
                    }
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        numValueOf = 1;
                        break;
                    }
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        numValueOf = 4;
                        break;
                    }
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        numValueOf = 16;
                        break;
                    }
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        numValueOf = 64;
                        break;
                    }
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        numValueOf = 256;
                        break;
                    }
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        numValueOf = 2048;
                        break;
                    }
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        numValueOf = 8192;
                        break;
                    }
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        numValueOf = 32768;
                        break;
                    }
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        numValueOf = 131072;
                        break;
                    }
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        numValueOf = 524288;
                        break;
                    }
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        numValueOf = 2097152;
                        break;
                    }
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        numValueOf = 8388608;
                        break;
                    }
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        numValueOf = 33554432;
                        break;
                    }
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        numValueOf = 1024;
                        break;
                    }
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        numValueOf = 4096;
                        break;
                    }
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        numValueOf = 16384;
                        break;
                    }
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        numValueOf = 65536;
                        break;
                    }
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        numValueOf = 262144;
                        break;
                    }
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        numValueOf = 1048576;
                        break;
                    }
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        numValueOf = 4194304;
                        break;
                    }
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        numValueOf = 16777216;
                        break;
                    }
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i6), numValueOf);
        }
        androidx.camera.core.t.d(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
        return null;
    }

    public static String c(int i6, boolean z6, int i7, int i8, int[] iArr, int i9) {
        int i10;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", f8978b[i6], Integer.valueOf(i7), Integer.valueOf(i8), Character.valueOf(true != z6 ? 'L' : 'H'), Integer.valueOf(i9)));
        int i11 = 6;
        while (true) {
            if (i11 <= 0) {
                break;
            }
            int i12 = i11 - 1;
            if (iArr[i12] != 0) {
                break;
            }
            i11 = i12;
        }
        for (i10 = 0; i10 < i11; i10++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i10])));
        }
        return sb.toString();
    }
}
