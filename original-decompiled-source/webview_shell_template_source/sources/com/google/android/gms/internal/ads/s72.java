package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class s72 {
    public static final String a(ByteBuffer byteBuffer, int i6, int i7) throws u52 {
        int i8;
        if ((((byteBuffer.limit() - i6) - i7) | i6 | i7) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i6), Integer.valueOf(i7)));
        }
        int i9 = i6 + i7;
        char[] cArr = new char[i7];
        int i10 = 0;
        while (i6 < i9) {
            byte b7 = byteBuffer.get(i6);
            if (b7 < 0) {
                break;
            }
            i6++;
            cArr[i10] = (char) b7;
            i10++;
        }
        int i11 = i10;
        while (i6 < i9) {
            int i12 = i6 + 1;
            byte b8 = byteBuffer.get(i6);
            if (b8 >= 0) {
                cArr[i11] = (char) b8;
                i11++;
                i6 = i12;
                while (i6 < i9) {
                    byte b9 = byteBuffer.get(i6);
                    if (b9 >= 0) {
                        i6++;
                        cArr[i11] = (char) b9;
                        i11++;
                    }
                }
            } else {
                if (b8 < -32) {
                    if (i12 >= i9) {
                        throw new u52("Protocol message had invalid UTF-8.");
                    }
                    i8 = i11 + 1;
                    i6 += 2;
                    yz1.h(b8, byteBuffer.get(i12), cArr, i11);
                } else if (b8 < -16) {
                    if (i12 >= i9 - 1) {
                        throw new u52("Protocol message had invalid UTF-8.");
                    }
                    i8 = i11 + 1;
                    int i13 = i6 + 2;
                    i6 += 3;
                    yz1.e(b8, byteBuffer.get(i12), byteBuffer.get(i13), cArr, i11);
                } else {
                    if (i12 >= i9 - 2) {
                        throw new u52("Protocol message had invalid UTF-8.");
                    }
                    byte b10 = byteBuffer.get(i12);
                    int i14 = i6 + 3;
                    byte b11 = byteBuffer.get(i6 + 2);
                    i6 += 4;
                    yz1.b(b8, b10, b11, byteBuffer.get(i14), cArr, i11);
                    i11 += 2;
                }
                i11 = i8;
            }
        }
        return new String(cArr, 0, i11);
    }
}
