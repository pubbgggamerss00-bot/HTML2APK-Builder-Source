package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y32 {
    public static int a(byte[] bArr, int i6, x32 x32Var) {
        int iF = f(bArr, i6, x32Var);
        int i7 = x32Var.f10344a;
        if (i7 < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i7 > bArr.length - iF) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i7 == 0) {
            x32Var.f10346c = g42.f4896t;
            return iF;
        }
        x32Var.f10346c = g42.s(iF, i7, bArr);
        return iF + i7;
    }

    public static int b(int i6, byte[] bArr) {
        int i7 = bArr[i6] & 255;
        int i8 = bArr[i6 + 1] & 255;
        int i9 = bArr[i6 + 2] & 255;
        return ((bArr[i6 + 3] & 255) << 24) | (i8 << 8) | i7 | (i9 << 16);
    }

    public static int c(b72 b72Var, int i6, byte[] bArr, int i7, int i8, r52 r52Var, x32 x32Var) {
        j52 j52VarZze = b72Var.zze();
        b72 b72Var2 = b72Var;
        byte[] bArr2 = bArr;
        int i9 = i8;
        x32 x32Var2 = x32Var;
        int iK = k(j52VarZze, b72Var2, bArr2, i7, i9, x32Var2);
        b72Var2.a(j52VarZze);
        x32Var2.f10346c = j52VarZze;
        r52Var.add(j52VarZze);
        while (iK < i9) {
            x32 x32Var3 = x32Var2;
            int i10 = i9;
            int iF = f(bArr2, iK, x32Var3);
            if (i6 != x32Var3.f10344a) {
                break;
            }
            byte[] bArr3 = bArr2;
            b72 b72Var3 = b72Var2;
            j52 j52VarZze2 = b72Var3.zze();
            iK = k(j52VarZze2, b72Var3, bArr3, iF, i10, x32Var3);
            b72Var2 = b72Var3;
            bArr2 = bArr3;
            i9 = i10;
            x32Var2 = x32Var3;
            b72Var2.a(j52VarZze2);
            x32Var2.f10346c = j52VarZze2;
            r52Var.add(j52VarZze2);
        }
        return iK;
    }

    public static int d(byte[] bArr, int i6, r52 r52Var, x32 x32Var) {
        k52 k52Var = (k52) r52Var;
        int iF = f(bArr, i6, x32Var);
        int i7 = x32Var.f10344a + iF;
        while (iF < i7) {
            iF = f(bArr, iF, x32Var);
            k52Var.f(x32Var.f10344a);
        }
        if (iF == i7) {
            return iF;
        }
        throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e(int i6, byte[] bArr, int i7, int i8, m72 m72Var, x32 x32Var) {
        if ((i6 >>> 3) == 0) {
            throw new u52("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i6 & 7;
        if (i9 == 0) {
            int i10 = i(bArr, i7, x32Var);
            m72Var.b(i6, Long.valueOf(x32Var.f10345b));
            return i10;
        }
        if (i9 == 1) {
            m72Var.b(i6, Long.valueOf(l(i7, bArr)));
            return i7 + 8;
        }
        if (i9 == 2) {
            int iF = f(bArr, i7, x32Var);
            int i11 = x32Var.f10344a;
            if (i11 < 0) {
                throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iF) {
                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                m72Var.b(i6, g42.f4896t);
            } else {
                m72Var.b(i6, g42.s(iF, i11, bArr));
            }
            return iF + i11;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new u52("Protocol message contained an invalid tag (zero).");
            }
            m72Var.b(i6, Integer.valueOf(b(i7, bArr)));
            return i7 + 4;
        }
        int i12 = (i6 & (-8)) | 4;
        m72 m72Var2 = new m72();
        int i13 = x32Var.f10348e + 1;
        x32Var.f10348e = i13;
        if (i13 >= 100) {
            throw new u52("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i14 = 0;
        while (true) {
            if (i7 >= i8) {
                break;
            }
            int iF2 = f(bArr, i7, x32Var);
            int i15 = x32Var.f10344a;
            if (i15 == i12) {
                i14 = i15;
                i7 = iF2;
                break;
            }
            i7 = e(i15, bArr, iF2, i8, m72Var2, x32Var);
            i14 = i15;
        }
        x32Var.f10348e--;
        if (i7 > i8 || i14 != i12) {
            throw new u52("Failed to parse the message.");
        }
        m72Var.b(i6, m72Var2);
        return i7;
    }

    public static int f(byte[] bArr, int i6, x32 x32Var) {
        int i7 = i6 + 1;
        byte b7 = bArr[i6];
        if (b7 < 0) {
            return g(b7, bArr, i7, x32Var);
        }
        x32Var.f10344a = b7;
        return i7;
    }

    public static int g(int i6, byte[] bArr, int i7, x32 x32Var) {
        byte b7 = bArr[i7];
        int i8 = i7 + 1;
        int i9 = i6 & 127;
        if (b7 >= 0) {
            x32Var.f10344a = i9 | (b7 << 7);
            return i8;
        }
        int i10 = i9 | ((b7 & Byte.MAX_VALUE) << 7);
        int i11 = i7 + 2;
        byte b8 = bArr[i8];
        if (b8 >= 0) {
            x32Var.f10344a = i10 | (b8 << 14);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 14);
        int i13 = i7 + 3;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            x32Var.f10344a = i12 | (b9 << 21);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 21);
        int i15 = i7 + 4;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            x32Var.f10344a = i14 | (b10 << 28);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                x32Var.f10344a = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    public static int h(int i6, byte[] bArr, int i7, int i8, r52 r52Var, x32 x32Var) {
        k52 k52Var = (k52) r52Var;
        int iF = f(bArr, i7, x32Var);
        k52Var.f(x32Var.f10344a);
        while (iF < i8) {
            int iF2 = f(bArr, iF, x32Var);
            if (i6 != x32Var.f10344a) {
                break;
            }
            iF = f(bArr, iF2, x32Var);
            k52Var.f(x32Var.f10344a);
        }
        return iF;
    }

    public static int i(byte[] bArr, int i6, x32 x32Var) {
        long j6 = bArr[i6];
        int i7 = i6 + 1;
        if (j6 >= 0) {
            x32Var.f10345b = j6;
            return i7;
        }
        int i8 = i6 + 2;
        byte b7 = bArr[i7];
        long j7 = (j6 & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i9 = 7;
        while (b7 < 0) {
            int i10 = i8 + 1;
            i9 += 7;
            j7 |= (r10 & Byte.MAX_VALUE) << i9;
            b7 = bArr[i8];
            i8 = i10;
        }
        x32Var.f10345b = j7;
        return i8;
    }

    public static int j(Object obj, b72 b72Var, byte[] bArr, int i6, int i7, int i8, x32 x32Var) {
        p62 p62Var = (p62) b72Var;
        int i9 = x32Var.f10348e + 1;
        x32Var.f10348e = i9;
        if (i9 >= 100) {
            throw new u52("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZ = p62Var.z(obj, bArr, i6, i7, i8, x32Var);
        x32Var.f10348e--;
        x32Var.f10346c = obj;
        return iZ;
    }

    public static int k(Object obj, b72 b72Var, byte[] bArr, int i6, int i7, x32 x32Var) {
        int iG = i6 + 1;
        int i8 = bArr[i6];
        if (i8 < 0) {
            iG = g(i8, bArr, iG, x32Var);
            i8 = x32Var.f10344a;
        }
        int i9 = iG;
        if (i8 < 0 || i8 > i7 - i9) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i10 = x32Var.f10348e + 1;
        x32Var.f10348e = i10;
        if (i10 >= 100) {
            throw new u52("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = i9 + i8;
        b72Var.f(obj, bArr, i9, i11, x32Var);
        x32Var.f10348e--;
        x32Var.f10346c = obj;
        return i11;
    }

    public static long l(int i6, byte[] bArr) {
        return (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48) | ((bArr[i6 + 7] & 255) << 56);
    }
}
