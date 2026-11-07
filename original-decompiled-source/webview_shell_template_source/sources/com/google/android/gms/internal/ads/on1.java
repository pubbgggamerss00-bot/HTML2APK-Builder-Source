package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class on1 {
    public static int a(Object obj, Object obj2, int i6, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i7;
        int i8;
        int iN = aa1.n(obj);
        int i9 = iN & i6;
        int iB = b(i9, obj3);
        if (iB != 0) {
            int i10 = ~i6;
            int i11 = iN & i10;
            int i12 = -1;
            while (true) {
                i7 = iB - 1;
                int i13 = iArr[i7];
                i8 = i13 & i6;
                if ((i13 & i10) != i11 || !aa1.k(obj, objArr[i7]) || (objArr2 != null && !aa1.k(obj2, objArr2[i7]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i12 = i7;
                    iB = i8;
                } else {
                    break;
                }
            }
            if (i12 == -1) {
                d(i9, i8, obj3);
                return i7;
            }
            iArr[i12] = (iArr[i12] & i10) | (i8 & i6);
            return i7;
        }
        return -1;
    }

    public static int b(int i6, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i6] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i6] : ((int[]) obj)[i6];
    }

    public static Object c(int i6) {
        if (i6 < 2 || i6 > 1073741824 || Integer.highestOneBit(i6) != i6) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i6 <= 256 ? new byte[i6] : i6 <= 65536 ? new short[i6] : new int[i6];
    }

    public static void d(int i6, int i7, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i6] = (byte) i7;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i6] = (short) i7;
        } else {
            ((int[]) obj)[i6] = i7;
        }
    }
}
