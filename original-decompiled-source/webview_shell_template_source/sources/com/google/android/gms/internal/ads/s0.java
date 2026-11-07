package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s0 implements a1 {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f8749u = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: v, reason: collision with root package name */
    public static final r0 f8750v = new r0(new ed0(10));

    /* renamed from: w, reason: collision with root package name */
    public static final r0 f8751w = new r0(new y5(14));
    public cp1 s;

    /* renamed from: t, reason: collision with root package name */
    public final w6 f8752t = new w6();

    public final void a(int i6, ArrayList arrayList) {
        w6 w6Var = this.f8752t;
        switch (i6) {
            case 0:
                arrayList.add(new r8());
                break;
            case 1:
                arrayList.add(new t8());
                break;
            case 2:
                arrayList.add(new v8());
                break;
            case 3:
                arrayList.add(new y1());
                break;
            case 4:
                x0 x0VarC = f8750v.c(0);
                if (x0VarC == null) {
                    arrayList.add(new o2());
                    break;
                } else {
                    arrayList.add(x0VarC);
                    break;
                }
            case 5:
                arrayList.add(new q2());
                break;
            case 6:
                arrayList.add(new z4(new x4(), 0, w6Var));
                break;
            case 7:
                arrayList.add(new f5(0));
                break;
            case 8:
                arrayList.add(new x5(w6Var, 0, cp1.f3636w));
                arrayList.add(new c6(w6Var, 0));
                break;
            case 9:
                arrayList.add(new n6());
                break;
            case 10:
                arrayList.add(new u9());
                break;
            case 11:
                if (this.s == null) {
                    zn1 zn1Var = bo1.f3236t;
                    this.s = cp1.f3636w;
                }
                arrayList.add(new ca(w6Var, new m11(), new xj1(2, this.s)));
                break;
            case 12:
                la laVar = new la();
                laVar.f6633c = 0;
                laVar.f6634d = -1L;
                laVar.f6636f = -1;
                laVar.f6637g = -1L;
                arrayList.add(laVar);
                break;
            case 14:
                arrayList.add(new v2());
                break;
            case 15:
                x0 x0VarC2 = f8751w.c(new Object[0]);
                if (x0VarC2 != null) {
                    arrayList.add(x0VarC2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new c2(w6Var));
                break;
            case 17:
                arrayList.add(new u6());
                break;
            case 18:
                arrayList.add(new qa());
                break;
            case 19:
                arrayList.add(new k2());
                break;
            case 20:
                arrayList.add(new u2());
                break;
            case dn.zzm /* 21 */:
                arrayList.add(new j2());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d7 A[PHI: r18
      0x01d7: PHI (r18v2 int) = (r18v0 int), (r18v1 int), (r18v1 int) binds: [B:125:0x01d5, B:128:0x01e3, B:131:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    @Override // com.google.android.gms.internal.ads.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized x0[] d(Uri uri, Map map) {
        ArrayList arrayList;
        int i6;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i7 = 6;
            int i8 = 1;
            if (str != null) {
                String strE = bk.e(str);
                switch (strE.hashCode()) {
                    case -2123537834:
                        if (strE.equals("audio/eac3-joc")) {
                            i6 = 0;
                            break;
                        }
                        break;
                    case -1662384011:
                        if (strE.equals("video/mp2p")) {
                            i6 = 10;
                            break;
                        }
                        break;
                    case -1662384007:
                        if (strE.equals("video/mp2t")) {
                            i6 = 11;
                            break;
                        }
                        break;
                    case -1662095187:
                        if (strE.equals("video/webm")) {
                            i6 = 6;
                            break;
                        }
                        break;
                    case -1606874997:
                        if (strE.equals("audio/amr-wb")) {
                            i6 = 3;
                            break;
                        }
                        break;
                    case -1487656890:
                        if (strE.equals("image/avif")) {
                            i6 = 21;
                            break;
                        }
                        break;
                    case -1487464693:
                        if (strE.equals("image/heic")) {
                            i6 = 20;
                            break;
                        }
                        break;
                    case -1487464690:
                        if (strE.equals("image/heif")) {
                            i6 = 20;
                            break;
                        }
                        i6 = -1;
                        break;
                    case -1487394660:
                        if (strE.equals("image/jpeg")) {
                            i6 = 14;
                            break;
                        }
                        break;
                    case -1487018032:
                        if (strE.equals("image/webp")) {
                            i6 = 18;
                            break;
                        }
                        break;
                    case -1248337486:
                        if (strE.equals("application/mp4")) {
                            i6 = 8;
                            break;
                        }
                        break;
                    case -1079884372:
                        if (strE.equals("video/x-msvideo")) {
                            i6 = 16;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (strE.equals("text/vtt")) {
                            i6 = 13;
                            break;
                        }
                        break;
                    case -879272239:
                        if (strE.equals("image/bmp")) {
                            i6 = 19;
                            break;
                        }
                        break;
                    case -879258763:
                        if (strE.equals("image/png")) {
                            i6 = 17;
                            break;
                        }
                        break;
                    case -387023398:
                        if (strE.equals("audio/x-matroska")) {
                            i6 = 6;
                            break;
                        }
                        i6 = -1;
                        break;
                    case -43467528:
                        if (strE.equals("application/webm")) {
                            i6 = 6;
                            break;
                        }
                        i6 = -1;
                        break;
                    case 13915911:
                        if (strE.equals("video/x-flv")) {
                            i6 = 5;
                            break;
                        }
                        break;
                    case 187078296:
                        if (strE.equals("audio/ac3")) {
                            i6 = 0;
                            break;
                        }
                        i6 = -1;
                        break;
                    case 187078297:
                        if (strE.equals("audio/ac4")) {
                            i6 = 1;
                            break;
                        }
                        break;
                    case 187078669:
                        if (strE.equals("audio/amr")) {
                            i6 = 3;
                            break;
                        }
                        i6 = -1;
                        break;
                    case 187090232:
                        if (strE.equals("audio/mp4")) {
                            i6 = 8;
                            break;
                        }
                        i6 = -1;
                        break;
                    case 187091926:
                        if (strE.equals("audio/ogg")) {
                            i6 = 9;
                            break;
                        }
                        break;
                    case 187099443:
                        if (strE.equals("audio/wav")) {
                            i6 = 12;
                            break;
                        }
                        break;
                    case 1331848029:
                        if (strE.equals("video/mp4")) {
                            i6 = 8;
                            break;
                        }
                        i6 = -1;
                        break;
                    case 1503095341:
                        if (strE.equals("audio/3gpp")) {
                            i6 = 3;
                            break;
                        }
                        i6 = -1;
                        break;
                    case 1504578661:
                        if (strE.equals("audio/eac3")) {
                            i6 = 0;
                            break;
                        }
                        i6 = -1;
                        break;
                    case 1504619009:
                        if (strE.equals("audio/flac")) {
                            i6 = 4;
                            break;
                        }
                        break;
                    case 1504824762:
                        if (strE.equals("audio/midi")) {
                            i6 = 15;
                            break;
                        }
                        break;
                    case 1504831518:
                        if (strE.equals("audio/mpeg")) {
                            i6 = 7;
                            break;
                        }
                        break;
                    case 1505118770:
                        if (strE.equals("audio/webm")) {
                            i6 = 6;
                            break;
                        }
                        i6 = -1;
                        break;
                    case 2039520277:
                        if (strE.equals("video/x-matroska")) {
                            i6 = 6;
                            break;
                        }
                        i6 = -1;
                        break;
                    default:
                        i6 = -1;
                        break;
                }
            } else {
                i6 = -1;
            }
            if (i6 != -1) {
                a(i6, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                    i7 = 0;
                } else if (lastPathSegment.endsWith(".ac4")) {
                    i7 = i8;
                } else {
                    i8 = 2;
                    if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                        if (lastPathSegment.endsWith(".amr")) {
                            i7 = 3;
                        } else if (lastPathSegment.endsWith(".flac")) {
                            i7 = 4;
                        } else if (lastPathSegment.endsWith(".flv")) {
                            i7 = 5;
                        } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                            i7 = 15;
                        } else if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                            i7 = lastPathSegment.endsWith(".mp3") ? 7 : (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() + (-4)) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() + (-5)) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() + (-5))) ? 8 : (lastPathSegment.startsWith(".og", lastPathSegment.length() + (-4)) || lastPathSegment.endsWith(".opus")) ? 9 : (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) ? 10 : (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() + (-4))) ? 11 : (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) ? 12 : (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) ? 13 : (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : lastPathSegment.endsWith(".avi") ? 16 : lastPathSegment.endsWith(".png") ? 17 : lastPathSegment.endsWith(".webp") ? 18 : (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) ? 19 : (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) ? 20 : lastPathSegment.endsWith(".avif") ? 21 : -1;
                        }
                    }
                }
            }
            if (i7 != -1 && i7 != i6) {
                a(i7, arrayList);
            }
            int[] iArr = f8749u;
            for (int i9 = 0; i9 < 21; i9++) {
                int i10 = iArr[i9];
                if (i10 != i6 && i10 != i7) {
                    a(i10, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (x0[]) arrayList.toArray(new x0[arrayList.size()]);
    }
}
