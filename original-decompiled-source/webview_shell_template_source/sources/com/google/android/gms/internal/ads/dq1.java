package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dq1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3991a = 0;

    static {
        new bq1();
    }

    public static byte[] a(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i6 = 0;
        while (i6 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i6);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i7 = 0;
            while (i7 < iMin2) {
                int i8 = inputStream.read(bArr, i7, iMin2 - i7);
                if (i8 == -1) {
                    return b(arrayDeque, i6);
                }
                i7 += i8;
                i6 += i8;
            }
            iMin = ed0.t(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] b(ArrayDeque arrayDeque, int i6) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        int length = bArr.length;
        if (length == i6) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i6);
        int i7 = i6 - length;
        while (i7 > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(i7, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i6 - i7, iMin);
            i7 -= iMin;
        }
        return bArrCopyOf;
    }
}
