package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9991a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9992b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9993c = {64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9994d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9995e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f9996f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f9997g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f9998i = {5, 8, 10, 12};

    public static int a(l42 l42Var, int[] iArr) {
        int i6 = 0;
        for (int i7 = 0; i7 < 3 && l42Var.G(); i7++) {
            i6++;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            i8 += 1 << iArr[i9];
        }
        return l42Var.w(iArr[i6]) + i8;
    }

    public static l42 b(byte[] bArr) {
        byte b7 = bArr[0];
        if (b7 == Byte.MAX_VALUE || b7 == 100 || b7 == 64 || b7 == 113) {
            return new l42(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b8 = bArrCopyOf[0];
        if (b8 == -2 || b8 == -1 || b8 == 37 || b8 == -14 || b8 == -24) {
            for (int i6 = 0; i6 < bArrCopyOf.length - 1; i6 += 2) {
                byte b9 = bArrCopyOf[i6];
                int i7 = i6 + 1;
                bArrCopyOf[i6] = bArrCopyOf[i7];
                bArrCopyOf[i7] = b9;
            }
        }
        int length = bArrCopyOf.length;
        l42 l42Var = new l42(length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            l42 l42Var2 = new l42(length, bArrCopyOf);
            while (l42Var2.t() >= 16) {
                l42Var2.D(2);
                int iW = l42Var2.w(14);
                int iMin = Math.min(8 - l42Var.f6574b, 14);
                int i8 = l42Var.f6574b;
                int i9 = (8 - i8) - iMin;
                byte[] bArr2 = (byte[]) l42Var.f6576d;
                int i10 = l42Var.f6573a;
                byte b10 = (byte) (((65280 >> i8) | ((1 << i9) - 1)) & bArr2[i10]);
                bArr2[i10] = b10;
                int i11 = 14 - iMin;
                int i12 = iW & 16383;
                bArr2[i10] = (byte) (b10 | ((i12 >>> i11) << i9));
                int i13 = i10 + 1;
                while (i11 > 8) {
                    i11 -= 8;
                    ((byte[]) l42Var.f6576d)[i13] = (byte) (i12 >>> i11);
                    i13++;
                }
                byte[] bArr3 = (byte[]) l42Var.f6576d;
                byte b11 = (byte) (bArr3[i13] & ((1 << r7) - 1));
                bArr3[i13] = b11;
                bArr3[i13] = (byte) (((i12 & ((1 << i11) - 1)) << (8 - i11)) | b11);
                l42Var.D(14);
                l42Var.H();
            }
        }
        int length2 = bArrCopyOf.length;
        l42Var.f6576d = bArrCopyOf;
        l42Var.f6573a = 0;
        l42Var.f6574b = 0;
        l42Var.f6575c = length2;
        return l42Var;
    }
}
