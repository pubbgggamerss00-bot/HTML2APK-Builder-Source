package gd;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f11967a = Charset.forName("UTF-8");

    public static abstract class a {
    }

    public static class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f11968a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    public static class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f11969a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
    
        if (r6 != 4) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(f11967a);
        int length = bytes.length;
        int i10 = (length * 3) / 4;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < length) {
            int[] iArr = b.f11968a;
            if (i12 == 0) {
                while (true) {
                    int i15 = i11 + 4;
                    if (i15 > length || (i13 = (iArr[bytes[i11] & 255] << 18) | (iArr[bytes[i11 + 1] & 255] << 12) | (iArr[bytes[i11 + 2] & 255] << 6) | iArr[bytes[i11 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr[i14 + 2] = (byte) i13;
                    bArr[i14 + 1] = (byte) (i13 >> 8);
                    bArr[i14] = (byte) (i13 >> 16);
                    i14 += 3;
                    i11 = i15;
                }
                if (i11 >= length) {
                    break;
                }
            }
            int i16 = i11 + 1;
            int i17 = iArr[bytes[i11] & 255];
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i17 < 0) {
                        if (i17 != -1) {
                            break;
                        }
                        i11 = i16;
                    }
                    i17 |= i13 << 6;
                } else if (i12 == 2) {
                    if (i17 < 0) {
                        if (i17 != -2) {
                            if (i17 != -1) {
                                break;
                            }
                        } else {
                            bArr[i14] = (byte) (i13 >> 4);
                            i12 = 4;
                            i14++;
                        }
                        i11 = i16;
                    }
                    i17 |= i13 << 6;
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (i17 != -2) {
                            if (i17 != -1) {
                                break;
                            }
                        } else {
                            i12++;
                        }
                        i11 = i16;
                    } else {
                        if (i12 == 5 && i17 != -1) {
                            break;
                        }
                        i11 = i16;
                    }
                } else if (i17 >= 0) {
                    i17 |= i13 << 6;
                    bArr[i14 + 2] = (byte) i17;
                    bArr[i14 + 1] = (byte) (i17 >> 8);
                    bArr[i14] = (byte) (i17 >> 16);
                    i14 += 3;
                    i12 = 0;
                } else {
                    if (i17 != -2) {
                        if (i17 != -1) {
                            break;
                        }
                    } else {
                        bArr[i14 + 1] = (byte) (i13 >> 2);
                        bArr[i14] = (byte) (i13 >> 10);
                        i14 += 2;
                        i12 = 5;
                    }
                    i11 = i16;
                }
                i12++;
            } else {
                if (i17 < 0) {
                    if (i17 != -1) {
                        break;
                    }
                    i11 = i16;
                }
                i12++;
            }
            i13 = i17;
            i11 = i16;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                bArr[i14] = (byte) (i13 >> 4);
                i14++;
            } else if (i12 == 3) {
                int i18 = i14 + 1;
                bArr[i14] = (byte) (i13 >> 10);
                i14 += 2;
                bArr[i18] = (byte) (i13 >> 2);
            }
            if (i14 == i10) {
                return bArr;
            }
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, 0, bArr2, 0, i14);
            return bArr2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i10 = (length / 3) * 4;
        if (length % 3 > 0) {
            i10 += 4;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int i14 = i11 + 3;
            bArr2 = c.f11969a;
            if (i14 > length) {
                break;
            }
            int i15 = (bArr[i11 + 2] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
            bArr3[i12] = bArr2[(i15 >> 18) & 63];
            bArr3[i12 + 1] = bArr2[(i15 >> 12) & 63];
            bArr3[i12 + 2] = bArr2[(i15 >> 6) & 63];
            bArr3[i12 + 3] = bArr2[i15 & 63];
            int i16 = i12 + 4;
            i13--;
            if (i13 == 0) {
                i12 += 5;
                bArr3[i16] = 10;
                i13 = 19;
            } else {
                i12 = i16;
            }
            i11 = i14;
        }
        if (i11 == length - 1) {
            int i17 = (bArr[i11] & 255) << 4;
            bArr3[i12] = bArr2[(i17 >> 6) & 63];
            bArr3[i12 + 1] = bArr2[i17 & 63];
            bArr3[i12 + 2] = 61;
            bArr3[i12 + 3] = 61;
            return bArr3;
        }
        if (i11 == length - 2) {
            int i18 = ((bArr[i11 + 1] & 255) << 2) | ((bArr[i11] & 255) << 10);
            bArr3[i12] = bArr2[(i18 >> 12) & 63];
            bArr3[i12 + 1] = bArr2[(i18 >> 6) & 63];
            bArr3[i12 + 2] = bArr2[i18 & 63];
            bArr3[i12 + 3] = 61;
        }
        return bArr3;
    }
}
