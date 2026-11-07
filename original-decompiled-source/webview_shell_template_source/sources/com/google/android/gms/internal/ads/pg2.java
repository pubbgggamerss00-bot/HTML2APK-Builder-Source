package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class pg2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f8070a = new HashMap();

    public static String a(w wVar) {
        Pair pairA;
        String str = wVar.f9978m;
        String str2 = wVar.f9978m;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairA = sl0.a(wVar)) != null) {
            int iIntValue = ((Integer) pairA.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static synchronized List b(boolean z6, boolean z7, String str) {
        try {
            ig2 ig2Var = new ig2(z6, z7, str);
            HashMap map = f8070a;
            List list = (List) map.get(ig2Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListD = d(ig2Var, new mg2(z6, z7));
            if (z6 && arrayListD.isEmpty() && j31.f5914a <= 23) {
                arrayListD = d(ig2Var, new lg2());
                if (!arrayListD.isEmpty()) {
                    qs0.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zf2) arrayListD.get(0)).f11282a);
                }
            }
            if ("audio/raw".equals(str)) {
                if (j31.f5914a < 26 && j31.f5915b.equals("R9") && arrayListD.size() == 1 && ((zf2) arrayListD.get(0)).f11282a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListD.add(zf2.b("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
                }
                Collections.sort(arrayListD, new hg2(new ih1(24)));
            }
            if (j31.f5914a < 32 && arrayListD.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zf2) arrayListD.get(0)).f11282a)) {
                arrayListD.add((zf2) arrayListD.remove(0));
            }
            bo1 bo1VarL = bo1.l(arrayListD);
            map.put(ig2Var, bo1VarL);
            return bo1VarL;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static cp1 c(gg2 gg2Var, w wVar, boolean z6, boolean z7) {
        List listA = gg2Var.a(z6, z7, wVar.f9978m);
        String strA = a(wVar);
        List listA2 = strA == null ? cp1.f3636w : gg2Var.a(z6, z7, strA);
        yn1 yn1Var = new yn1();
        yn1Var.r(listA);
        yn1Var.r(listA2);
        return yn1Var.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0182 A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:90:0x015e, B:96:0x0169, B:102:0x017c, B:104:0x0182, B:111:0x0195, B:113:0x019c, B:114:0x01a0, B:116:0x01b0, B:118:0x01b8, B:107:0x018c), top: B:155:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018c A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:90:0x015e, B:96:0x0169, B:102:0x017c, B:104:0x0182, B:111:0x0195, B:113:0x019c, B:114:0x01a0, B:116:0x01b0, B:118:0x01b8, B:107:0x018c), top: B:155:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019c A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:90:0x015e, B:96:0x0169, B:102:0x017c, B:104:0x0182, B:111:0x0195, B:113:0x019c, B:114:0x01a0, B:116:0x01b0, B:118:0x01b8, B:107:0x018c), top: B:155:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a0 A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:90:0x015e, B:96:0x0169, B:102:0x017c, B:104:0x0182, B:111:0x0195, B:113:0x019c, B:114:0x01a0, B:116:0x01b0, B:118:0x01b8, B:107:0x018c), top: B:155:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204 A[Catch: Exception -> 0x024f, TRY_ENTER, TryCatch #0 {Exception -> 0x024f, blocks: (B:3:0x000a, B:5:0x001c, B:7:0x0026, B:10:0x0031, B:14:0x0040, B:21:0x0050, B:23:0x0058, B:25:0x0060, B:27:0x006a, B:29:0x0074, B:31:0x007c, B:33:0x0084, B:35:0x008c, B:37:0x0094, B:39:0x009c, B:41:0x00a4, B:45:0x00b0, B:47:0x00b8, B:49:0x00c0, B:51:0x00c8, B:138:0x01fc, B:141:0x0204, B:143:0x020a, B:144:0x0224, B:145:0x0245, B:54:0x00d4, B:55:0x00d9, B:57:0x00e2, B:60:0x00ed, B:62:0x00f5, B:67:0x0103, B:69:0x010b, B:72:0x0116, B:74:0x011e, B:77:0x0129, B:79:0x0131, B:82:0x013c, B:84:0x0144), top: B:151:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0246 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(ig2 ig2Var, kg2 kg2Var) throws Exception {
        String str;
        int i6;
        String str2;
        String str3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zA;
        boolean zB;
        int i7;
        ig2 ig2Var2 = ig2Var;
        boolean z6 = ig2Var2.f5755b;
        String str4 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = ig2Var2.f5754a;
            int iZza = kg2Var.zza();
            boolean zZze = kg2Var.zze();
            int i8 = 0;
            while (i8 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = kg2Var.zzb(i8);
                int i9 = j31.f5914a;
                if (i9 < 29 || !mediaCodecInfoZzb.isAlias()) {
                    int i10 = i8;
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZze && name.endsWith(".secure"))) {
                        str = str4;
                        i6 = i10;
                    } else if (i9 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(j31.f5916c))) {
                        String str6 = j31.f5915b;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                        }
                    } else if (i9 > 23 || !"audio/eac3-joc".equals(str5) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                String[] strArr = supportedTypes;
                                str2 = strArr[i11];
                                if (str2.equalsIgnoreCase(str5)) {
                                    break;
                                }
                                i11++;
                                supportedTypes = strArr;
                            } else if (str5.equals("video/dolby-vision")) {
                                str2 = "OMX.MS.HEVCDV.Decoder".equals(name) ? "video/hevcdv" : ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) ? "video/dv_hevc" : null;
                            } else if (str5.equals("video/mv-hevc")) {
                                if ("c2.qti.mvhevc.decoder".equals(name)) {
                                    str2 = "video/x-mvhevc";
                                }
                            } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str2 = "audio/x-lg-alac";
                            } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str2 = "audio/x-lg-flac";
                            } else if (str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                str2 = "audio/lg-ac3";
                            }
                        }
                        if (str2 != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                zA = kg2Var.a(str4, str2, capabilitiesForType);
                                zB = kg2Var.b(str4, capabilitiesForType);
                                str = str4;
                            } catch (Exception e6) {
                                e = e6;
                                str = str4;
                            }
                            try {
                                if (ig2Var2.f5756c) {
                                    if (zA) {
                                        boolean zA2 = kg2Var.a("secure-playback", str2, capabilitiesForType);
                                        boolean zB2 = kg2Var.b("secure-playback", capabilitiesForType);
                                        boolean zIsHardwareAccelerated = true;
                                        if (z6) {
                                        }
                                    }
                                } else if (!zB) {
                                    boolean zA22 = kg2Var.a("secure-playback", str2, capabilitiesForType);
                                    boolean zB22 = kg2Var.b("secure-playback", capabilitiesForType);
                                    boolean zIsHardwareAccelerated2 = true;
                                    if (z6) {
                                        if (!zB22) {
                                            i7 = j31.f5914a;
                                            if (i7 < 29) {
                                                zIsHardwareAccelerated2 = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (e(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated2 = false;
                                            }
                                            e(mediaCodecInfoZzb, str5);
                                            if (i7 < 29) {
                                                mediaCodecInfoZzb.isVendor();
                                            } else {
                                                String strG = rj1.g(mediaCodecInfoZzb.getName());
                                                if (!strG.startsWith("omx.google.") && !strG.startsWith("c2.android.")) {
                                                    strG.startsWith("c2.google.");
                                                }
                                            }
                                            if ((zZze || z6 != zA22) && (zZze || z6)) {
                                                str3 = name;
                                                i6 = i10;
                                                boolean z7 = zIsHardwareAccelerated2;
                                                if (zZze && zA22) {
                                                    arrayList.add(zf2.b(str3 + ".secure", str5, str2, capabilitiesForType, z7, true));
                                                    break;
                                                }
                                            } else {
                                                i6 = i10;
                                                try {
                                                    str3 = name;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    str3 = name;
                                                    if (j31.f5914a > 23) {
                                                    }
                                                    qs0.c("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                    throw e;
                                                }
                                                try {
                                                    arrayList.add(zf2.b(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated2, false));
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    if (j31.f5914a > 23) {
                                                    }
                                                    qs0.c("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                    throw e;
                                                }
                                            }
                                        }
                                    } else if (zA22) {
                                        zA22 = true;
                                        i7 = j31.f5914a;
                                        if (i7 < 29) {
                                        }
                                        e(mediaCodecInfoZzb, str5);
                                        if (i7 < 29) {
                                        }
                                        if (zZze) {
                                            str3 = name;
                                            i6 = i10;
                                            boolean z72 = zIsHardwareAccelerated2;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            str3 = name;
                                            i6 = i10;
                                            boolean z722 = zIsHardwareAccelerated2;
                                            if (zZze) {
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e9) {
                                e = e9;
                                str3 = name;
                                i6 = i10;
                                if (j31.f5914a > 23 || arrayList.isEmpty()) {
                                    qs0.c("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                    throw e;
                                }
                                qs0.c("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                i8 = i6 + 1;
                                ig2Var2 = ig2Var;
                                str4 = str;
                            }
                        }
                        i6 = i10;
                    }
                } else {
                    str = str4;
                    i6 = i8;
                }
                i8 = i6 + 1;
                ig2Var2 = ig2Var;
                str4 = str;
            }
            return arrayList;
        } catch (Exception e10) {
            throw new jg2("Failed to query underlying media codecs", e10);
        }
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, String str) {
        if (j31.f5914a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if ("audio".equals(bk.h(str))) {
            return true;
        }
        String strG = rj1.g(mediaCodecInfo.getName());
        if (strG.startsWith("arc.")) {
            return false;
        }
        if (strG.startsWith("omx.google.") || strG.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strG.startsWith("omx.sec.") && strG.contains(".sw.")) || strG.equals("omx.qcom.video.decoder.hevcswvdec") || strG.startsWith("c2.android.") || strG.startsWith("c2.google.")) {
            return true;
        }
        return (strG.startsWith("omx.") || strG.startsWith("c2.")) ? false : true;
    }
}
