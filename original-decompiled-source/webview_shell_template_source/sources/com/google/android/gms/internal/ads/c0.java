package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3348a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3349b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b0 a(l42 l42Var, boolean z6) throws rn {
        int iW = l42Var.w(5);
        if (iW == 31) {
            iW = l42Var.w(6) + 32;
        }
        int iB = b(l42Var);
        int iW2 = l42Var.w(4);
        String strD = androidx.camera.camera2.internal.compat.workaround.c.d(iW, "mp4a.40.");
        int i6 = 22;
        if (iW == 5 || iW == 29) {
            iB = b(l42Var);
            int iW3 = l42Var.w(5);
            if (iW3 == 31) {
                iW3 = l42Var.w(6) + 32;
            }
            iW = iW3;
            if (iW == 22) {
                iW2 = l42Var.w(4);
            }
        }
        if (z6) {
            int i7 = 3;
            if (iW != 1 && iW != 2 && iW != 3 && iW != 4 && iW != 6 && iW != 7 && iW != 17) {
                switch (iW) {
                    case 19:
                    case 20:
                    case dn.zzm /* 21 */:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw rn.b("Unsupported audio object type: " + iW);
                }
            }
            if (l42Var.G()) {
                qs0.f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (l42Var.G()) {
                l42Var.D(14);
            }
            boolean zG = l42Var.G();
            if (iW2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iW == 6) {
                l42Var.D(3);
                if (zG) {
                    if (iW == 22) {
                        l42Var.D(16);
                    } else {
                        i6 = iW;
                    }
                    if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                        l42Var.D(3);
                    }
                    l42Var.D(1);
                }
                switch (iW) {
                    case 17:
                    case 19:
                    case 20:
                    case dn.zzm /* 21 */:
                    case 22:
                    case 23:
                        int iW4 = l42Var.w(2);
                        if (iW4 == 2) {
                            i7 = iW4;
                        }
                        throw rn.b("Unsupported epConfig: " + i7);
                }
            }
            if (iW == 20) {
                iW = 20;
                l42Var.D(3);
            }
            if (zG) {
            }
            switch (iW) {
            }
        }
        int i8 = f3349b[iW2];
        if (i8 != -1) {
            return new b0(iB, i8, strD);
        }
        throw rn.a(null, null);
    }

    public static int b(l42 l42Var) throws rn {
        int iW = l42Var.w(4);
        if (iW == 15) {
            if (l42Var.t() >= 24) {
                return l42Var.w(24);
            }
            throw rn.a(null, "AAC header insufficient data");
        }
        if (iW < 13) {
            return f3348a[iW];
        }
        throw rn.a(null, "AAC header wrong Sampling Frequency Index");
    }
}
