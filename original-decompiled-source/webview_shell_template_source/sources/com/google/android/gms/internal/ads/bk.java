package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f3208a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3209b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(String str, String str2) {
        c6.h hVarC;
        switch (str.hashCode()) {
            case -2123537834:
                return str.equals("audio/eac3-joc") ? 18 : 0;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    return 8;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    return 7;
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (hVarC = c(str2)) == null) {
                    return 0;
                }
                return hVarC.b();
            case 187078296:
                if (str.equals("audio/ac3")) {
                    return 5;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    return 17;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    return 30;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    return 6;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    return 9;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    return 20;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    return 8;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    return 14;
                }
                break;
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(h(str))) {
            return 1;
        }
        if (g(str)) {
            return 2;
        }
        if ("text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(h(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f3208a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((ii) arrayList.get(i6)).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static c6.h c(String str) throws NumberFormatException {
        Matcher matcher = f3209b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            Integer.parseInt(strGroup, 16);
            return new c6.h(strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(int i6) {
        if (i6 == 32) {
            return "video/mp4v-es";
        }
        if (i6 == 33) {
            return "video/avc";
        }
        if (i6 == 35) {
            return "video/hevc";
        }
        if (i6 == 64) {
            return "audio/mp4a-latm";
        }
        if (i6 == 163) {
            return "video/wvc1";
        }
        if (i6 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i6 == 221) {
            return "audio/vorbis";
        }
        if (i6 == 165) {
            return "audio/ac3";
        }
        if (i6 == 166) {
            return "audio/eac3";
        }
        switch (i6) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i6) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String strG = rj1.g(str);
        switch (strG.hashCode()) {
            case -1007807498:
                return strG.equals("audio/x-flac") ? "audio/flac" : strG;
            case -979095690:
                return strG.equals("application/x-mpegurl") ? "application/x-mpegURL" : strG;
            case -586683234:
                return strG.equals("audio/x-wav") ? "audio/wav" : strG;
            case -432836268:
                return strG.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strG;
            case -432836267:
                return strG.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strG;
            case 187090231:
                return strG.equals("audio/mp3") ? "audio/mpeg" : strG;
            default:
                return strG;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean f(String str, String str2) {
        c6.h hVarC;
        int iB;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (hVarC = c(str2)) == null || (iB = hVarC.b()) == 0 || iB == 16) {
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                }
                break;
        }
        return false;
    }

    public static boolean g(String str) {
        return "video".equals(h(str));
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
