package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5875a = d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int i6, int i7, int i8, int i9, int[] iArr) {
        int i10 = iArr[i6] + iArr[i7];
        iArr[i6] = i10;
        int i11 = i10 ^ iArr[i9];
        int i12 = (i11 >>> (-16)) | (i11 << 16);
        iArr[i9] = i12;
        int i13 = iArr[i8] + i12;
        iArr[i8] = i13;
        int i14 = iArr[i7] ^ i13;
        int i15 = (i14 >>> (-12)) | (i14 << 12);
        iArr[i7] = i15;
        int i16 = iArr[i6] + i15;
        iArr[i6] = i16;
        int i17 = iArr[i9] ^ i16;
        int i18 = (i17 >>> (-8)) | (i17 << 8);
        iArr[i9] = i18;
        int i19 = iArr[i8] + i18;
        iArr[i8] = i19;
        int i20 = iArr[i7] ^ i19;
        iArr[i7] = (i20 >>> (-7)) | (i20 << 7);
    }

    public static void b(int[] iArr) {
        for (int i6 = 0; i6 < 10; i6++) {
            a(0, 4, 8, 12, iArr);
            a(1, 5, 9, 13, iArr);
            a(2, 6, 10, 14, iArr);
            a(3, 7, 11, 15, iArr);
            a(0, 5, 10, 15, iArr);
            a(1, 6, 11, 12, iArr);
            a(2, 7, 8, 13, iArr);
            a(3, 4, 9, 14, iArr);
        }
    }

    public static int[] c(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = f5875a;
        System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
        System.arraycopy(iArr, 0, iArr3, iArr4.length, 8);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        b(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    public static int[] d(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
