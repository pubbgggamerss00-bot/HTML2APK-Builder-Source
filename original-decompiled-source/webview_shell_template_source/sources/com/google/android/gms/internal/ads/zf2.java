package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zf2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11282a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11283b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11284c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f11285d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11286e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11287f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11288g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11289i;

    public zf2(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9) {
        str.getClass();
        this.f11282a = str;
        this.f11283b = str2;
        this.f11284c = str3;
        this.f11285d = codecCapabilities;
        this.f11288g = z6;
        this.f11286e = z7;
        this.f11287f = z8;
        this.h = z9;
        this.f11289i = bk.g(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zf2 b(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7) {
        boolean z8;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z9;
        boolean z10;
        String str6;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z8 = false;
        } else {
            if (j31.f5914a <= 22) {
                String str7 = j31.f5917d;
                if (("ODROID-XU3".equals(str7) || "Nexus 10".equals(str7)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                }
            }
            z8 = true;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z11 = z7 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (j31.f5914a < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            str4 = str;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z9 = z6;
            z10 = false;
            str6 = str2;
        } else {
            str6 = str2;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z9 = z6;
            z10 = true;
            str4 = str;
        }
        return new zf2(str4, str6, str5, codecCapabilities2, z9, z8, z11, z10);
    }

    public static Point f(MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i7) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i8 = j31.f5914a;
        return new Point((((i6 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i7 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i7, double d7) {
        Point pointF = f(videoCapabilities, i6, i7);
        int i8 = pointF.x;
        int i9 = pointF.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i8, i9) : videoCapabilities.areSizeAndRateSupported(i8, i9, Math.floor(d7));
    }

    public final ra2 a(w wVar, w wVar2) {
        w wVar3;
        w wVar4;
        String str = wVar.f9978m;
        mb2 mb2Var = wVar.A;
        String str2 = wVar2.f9978m;
        mb2 mb2Var2 = wVar2.A;
        int i6 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.f11289i) {
            if (wVar.f9987w != wVar2.f9987w) {
                i6 |= 1024;
            }
            if (!this.f11286e && (wVar.f9984t != wVar2.f9984t || wVar.f9985u != wVar2.f9985u)) {
                i6 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if ((!mb2.e(mb2Var) || !mb2.e(mb2Var2)) && !Objects.equals(mb2Var, mb2Var2)) {
                i6 |= 2048;
            }
            if (j31.f5917d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f11282a) && !wVar.b(wVar2)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new ra2(this.f11282a, wVar, wVar2, true != wVar.b(wVar2) ? 2 : 3, 0);
            }
            wVar3 = wVar;
            wVar4 = wVar2;
        } else {
            wVar3 = wVar;
            wVar4 = wVar2;
            if (wVar3.B != wVar4.B) {
                i6 |= 4096;
            }
            if (wVar3.C != wVar4.C) {
                i6 |= 8192;
            }
            if (wVar3.D != wVar4.D) {
                i6 |= 16384;
            }
            String str3 = this.f11283b;
            if (i6 == 0 && "audio/mp4a-latm".equals(str3)) {
                HashMap map = pg2.f8070a;
                Pair pairA = sl0.a(wVar3);
                Pair pairA2 = sl0.a(wVar4);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ra2(this.f11282a, wVar3, wVar4, 3, 0);
                    }
                }
            }
            if (!wVar3.b(wVar4)) {
                i6 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new ra2(this.f11282a, wVar3, wVar4, 1, 0);
            }
        }
        return new ra2(this.f11282a, wVar3, wVar4, 0, i6);
    }

    public final boolean c(w wVar) {
        int i6;
        String str = wVar.f9978m;
        String str2 = this.f11283b;
        if ((!str2.equals(str) && !str2.equals(pg2.a(wVar))) || !i(wVar, true)) {
            return false;
        }
        if (this.f11289i) {
            int i7 = wVar.f9984t;
            if (i7 > 0 && (i6 = wVar.f9985u) > 0) {
                return e(i7, i6, wVar.f9986v);
            }
        } else {
            int i8 = wVar.C;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11285d;
            if (i8 != -1) {
                if (codecCapabilities == null) {
                    g("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i8)) {
                    g("sampleRate.support, " + i8);
                    return false;
                }
            }
            int i9 = wVar.B;
            if (i9 != -1) {
                if (codecCapabilities == null) {
                    g("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    g("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((j31.f5914a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i10 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    qs0.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f11282a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount < i9) {
                    g("channelCount.support, " + i9);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean d(w wVar) {
        if (this.f11289i) {
            return this.f11286e;
        }
        HashMap map = pg2.f8070a;
        Pair pairA = sl0.a(wVar);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i6, int i7, double d7) {
        char c7;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z6;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11285d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i8 = j31.f5914a;
        if (i8 < 29) {
            if (!h(videoCapabilities, i6, i7, d7)) {
                if (i6 < i7) {
                    String str = this.f11282a;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(j31.f5915b)) && h(videoCapabilities, i7, i6, d7)) {
                        StringBuilder sbA = androidx.camera.camera2.internal.g0.a("sizeAndRate.rotated, ", i6, "x", i7, "@");
                        sbA.append(d7);
                        String string = sbA.toString();
                        String str2 = j31.f5918e;
                        StringBuilder sbA2 = androidx.camera.camera2.internal.i0.a("AssumedSupport [", string, "] [", str, ", ");
                        sbA2.append(this.f11283b);
                        sbA2.append("] [");
                        sbA2.append(str2);
                        sbA2.append("]");
                        qs0.b("MediaCodecInfo", sbA2.toString());
                        return true;
                    }
                }
                StringBuilder sbA3 = androidx.camera.camera2.internal.g0.a("sizeAndRate.support, ", i6, "x", i7, "@");
                sbA3.append(d7);
                g(sbA3.toString());
                return false;
            }
        } else if (i8 < 29 || (((bool = cg2.f3570a) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
            c7 = 0;
            if (c7 != 2) {
                if (c7 == 1) {
                    StringBuilder sbA4 = androidx.camera.camera2.internal.g0.a("sizeAndRate.cover, ", i6, "x", i7, "@");
                    sbA4.append(d7);
                    g(sbA4.toString());
                    return false;
                }
                if (!h(videoCapabilities, i6, i7, d7)) {
                }
            }
        } else {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointE = androidx.activity.y.e(i6, i7, (int) d7);
            int i9 = 0;
            while (true) {
                if (i9 >= supportedPerformancePoints.size()) {
                    c7 = 1;
                    break;
                }
                if (androidx.camera.camera2.internal.compat.c.b(supportedPerformancePoints.get(i9)).covers(performancePointE)) {
                    c7 = 2;
                    break;
                }
                i9++;
            }
            if (c7 == 1 && cg2.f3570a == null) {
                if (i8 >= 35) {
                    z6 = false;
                    cg2.f3570a = Boolean.valueOf(z6);
                    if (z6) {
                    }
                } else {
                    int iA = bg2.a(false);
                    int iA2 = bg2.a(true);
                    if (iA == 0 || (iA2 != 0 ? iA != 2 || iA2 != 2 : iA != 2)) {
                        z6 = true;
                    }
                    cg2.f3570a = Boolean.valueOf(z6);
                    if (z6) {
                    }
                }
            }
            if (c7 != 2) {
            }
        }
        return true;
    }

    public final void g(String str) {
        qs0.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f11282a + ", " + this.f11283b + "] [" + j31.f5918e + "]");
    }

    public final boolean i(w wVar, boolean z6) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String strC;
        int i6;
        HashMap map = pg2.f8070a;
        Pair pairA = sl0.a(wVar);
        String str = wVar.f9978m;
        int i7 = 4;
        String str2 = this.f11284c;
        if (str != null && str.equals("video/mv-hevc") && str2.equals("video/hevc")) {
            List list = wVar.f9981p;
            int i8 = 0;
            loop0: while (true) {
                if (i8 >= list.size()) {
                    pair = null;
                    strC = null;
                    break;
                }
                byte[] bArr = (byte[]) list.get(i8);
                int length = bArr.length;
                int i9 = 3;
                if (length > 3) {
                    boolean[] zArr = new boolean[3];
                    yn1 yn1Var = new yn1();
                    int i10 = 0;
                    while (true) {
                        int length2 = bArr.length;
                        if (i10 >= length2) {
                            break;
                        }
                        int iA = uf1.a(bArr, i10, length2, zArr);
                        if (iA != length2) {
                            yn1Var.q(Integer.valueOf(iA));
                        }
                        i10 = iA + 3;
                    }
                    cp1 cp1VarT = yn1Var.t();
                    int i11 = 0;
                    while (i11 < cp1VarT.f3638v) {
                        if (((Integer) cp1VarT.get(i11)).intValue() + i9 < length) {
                            lg1 lg1Var = new lg1(bArr, ((Integer) cp1VarT.get(i11)).intValue() + i9, length);
                            ha1 ha1VarH = uf1.h(lg1Var);
                            if (ha1VarH.f5311a == 33 && ha1VarH.f5312b == 0) {
                                lg1Var.d(4);
                                int iA2 = lg1Var.a(3);
                                lg1Var.c();
                                pair = null;
                                wa1 wa1VarI = uf1.i(lg1Var, true, iA2, null);
                                strC = sl0.c(wa1VarI.f10136a, wa1VarI.f10137b, wa1VarI.f10138c, wa1VarI.f10139d, wa1VarI.f10140e, wa1VarI.f10141f);
                                break loop0;
                            }
                            i6 = 3;
                        } else {
                            i6 = i9;
                        }
                        i11++;
                        i9 = i6;
                    }
                }
                i8++;
            }
            if (strC == null) {
                pairA = pair;
            } else {
                String strTrim = strC.trim();
                int i12 = j31.f5914a;
                pairA = sl0.b(strC, strTrim.split("\\.", -1), wVar.A);
            }
        }
        if (pairA == null) {
            return true;
        }
        int iIntValue = ((Integer) pairA.first).intValue();
        int iIntValue2 = ((Integer) pairA.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str3 = this.f11283b;
        if (zEquals) {
            if ("video/avc".equals(str3)) {
                iIntValue = 8;
            } else if ("video/hevc".equals(str3)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.f11289i) {
            if (iIntValue != 42) {
                return true;
            }
            iIntValue = 42;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11285d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (j31.f5914a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i7 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i7 = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (iIntValue3 >= 60000000) {
                i7 = 256;
            } else if (iIntValue3 >= 30000000) {
                i7 = 128;
            } else if (iIntValue3 >= 18000000) {
                i7 = 64;
            } else if (iIntValue3 >= 12000000) {
                i7 = 32;
            } else if (iIntValue3 >= 7200000) {
                i7 = 16;
            } else if (iIntValue3 >= 3600000) {
                i7 = 8;
            } else if (iIntValue3 < 1800000) {
                i7 = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i7;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z6)) {
                if (!"video/hevc".equals(str3) || iIntValue != 2) {
                    return true;
                }
                String str4 = j31.f5915b;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        g("codec.profileLevel, " + wVar.f9975j + ", " + str2);
        return false;
    }

    public final String toString() {
        return this.f11282a;
    }
}
