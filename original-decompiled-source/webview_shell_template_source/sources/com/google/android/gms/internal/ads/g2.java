package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdSize;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g2 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final bo1 f4868a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4869b;

    public g2(int i6, cp1 cp1Var) {
        this.f4869b = i6;
        this.f4868a = cp1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static g2 b(int i6, ex0 ex0Var) {
        String str;
        z1 h2Var;
        String str2;
        yn1 yn1Var = new yn1();
        int i7 = ex0Var.f4418c;
        char c7 = 65534;
        while (ex0Var.o() > 8) {
            int iR = ex0Var.r();
            int iR2 = ex0Var.f4417b + ex0Var.r();
            ex0Var.i(iR2);
            if (iR != 1414744396) {
                switch (iR) {
                    case 1718776947:
                        if (c7 == 2) {
                            ex0Var.k(4);
                            int iR3 = ex0Var.r();
                            int iR4 = ex0Var.r();
                            ex0Var.k(4);
                            int iR5 = ex0Var.r();
                            switch (iR5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                tk2 tk2Var = new tk2();
                                tk2Var.s = iR3;
                                tk2Var.f9337t = iR4;
                                tk2Var.c(str2);
                                h2Var = new h2(new w(tk2Var));
                                break;
                            } else {
                                androidx.activity.m.g(iR5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                h2Var = null;
                                break;
                            }
                        } else {
                            if (c7 == 1) {
                                int iT = ex0Var.t();
                                String str3 = iT != 1 ? iT != 85 ? iT != 255 ? iT != 8192 ? iT != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str3 != null) {
                                    int iT2 = ex0Var.t();
                                    int iR6 = ex0Var.r();
                                    ex0Var.k(6);
                                    int iQ = j31.q(ex0Var.t());
                                    int iT3 = ex0Var.o() > 0 ? ex0Var.t() : 0;
                                    byte[] bArr = new byte[iT3];
                                    ex0Var.f(0, iT3, bArr);
                                    tk2 tk2Var2 = new tk2();
                                    tk2Var2.c(str3);
                                    tk2Var2.A = iT2;
                                    tk2Var2.B = iR6;
                                    if ("audio/raw".equals(str3) && iQ != 0) {
                                        tk2Var2.C = iQ;
                                    }
                                    if ("audio/mp4a-latm".equals(str3) && iT3 > 0) {
                                        tk2Var2.f9333o = bo1.n(bArr);
                                    }
                                    h2Var = new h2(new w(tk2Var2));
                                    break;
                                } else {
                                    androidx.activity.m.g(iT, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                int i8 = j31.f5914a;
                                switch (c7) {
                                    case AdSize.AUTO_HEIGHT /* -2 */:
                                        str = "none";
                                        break;
                                    case 65535:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = "default";
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                qs0.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            h2Var = null;
                        }
                    case 1751742049:
                        int iR7 = ex0Var.r();
                        ex0Var.k(8);
                        int iR8 = ex0Var.r();
                        int iR9 = ex0Var.r();
                        ex0Var.k(4);
                        ex0Var.r();
                        ex0Var.k(12);
                        h2Var = new d2(iR7, iR8, iR9);
                        break;
                    case 1752331379:
                        int iR10 = ex0Var.r();
                        ex0Var.k(12);
                        ex0Var.r();
                        int iR11 = ex0Var.r();
                        int iR12 = ex0Var.r();
                        ex0Var.k(4);
                        int iR13 = ex0Var.r();
                        int iR14 = ex0Var.r();
                        ex0Var.k(8);
                        h2Var = new e2(iR10, iR11, iR12, iR13, iR14);
                        break;
                    case 1852994675:
                        h2Var = new i2(ex0Var.b(ex0Var.o(), StandardCharsets.UTF_8));
                        break;
                    default:
                        h2Var = null;
                        break;
                }
            } else {
                h2Var = b(ex0Var.r(), ex0Var);
            }
            if (h2Var != null) {
                if (h2Var.zza() == 1752331379) {
                    int i9 = ((e2) h2Var).f4081a;
                    if (i9 == 1935960438) {
                        c7 = 2;
                    } else if (i9 == 1935963489) {
                        c7 = 1;
                    } else if (i9 != 1937012852) {
                        qs0.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i9))));
                        c7 = 65535;
                    } else {
                        c7 = 3;
                    }
                }
                yn1Var.q(h2Var);
            }
            ex0Var.j(iR2);
            ex0Var.i(i7);
        }
        return new g2(i6, yn1Var.t());
    }

    public final z1 a(Class cls) {
        bo1 bo1Var = this.f4868a;
        int size = bo1Var.size();
        int i6 = 0;
        while (i6 < size) {
            z1 z1Var = (z1) bo1Var.get(i6);
            i6++;
            if (z1Var.getClass() == cls) {
                return z1Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int zza() {
        return this.f4869b;
    }
}
