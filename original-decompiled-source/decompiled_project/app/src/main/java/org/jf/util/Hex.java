package org.jf.util;

/* loaded from: classes3.dex */
public final class Hex {
    private Hex() {
    }

    public static String dump(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 + i11;
        if ((i10 | i11 | i15) < 0 || i15 > bArr.length) {
            throw new IndexOutOfBoundsException("arr.length " + bArr.length + "; " + i10 + "..!" + i15);
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("outOffset < 0");
        }
        if (i11 == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer((i11 * 4) + 6);
        int i16 = 0;
        while (i11 > 0) {
            if (i16 == 0) {
                stringBuffer.append(i14 != 2 ? i14 != 4 ? i14 != 6 ? u4(i12) : u3(i12) : u2(i12) : u1(i12));
                stringBuffer.append(": ");
            } else if ((i16 & 1) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append(u1(bArr[i10]));
            i12++;
            i10++;
            i16++;
            if (i16 == i13) {
                stringBuffer.append('\n');
                i16 = 0;
            }
            i11--;
        }
        if (i16 != 0) {
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public static String s1(int i10) {
        char[] cArr = new char[3];
        if (i10 < 0) {
            cArr[0] = '-';
            i10 = -i10;
        } else {
            cArr[0] = '+';
        }
        for (int i11 = 0; i11 < 2; i11++) {
            cArr[2 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    public static String s2(int i10) {
        char[] cArr = new char[5];
        if (i10 < 0) {
            cArr[0] = '-';
            i10 = -i10;
        } else {
            cArr[0] = '+';
        }
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[4 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    public static String s4(int i10) {
        char[] cArr = new char[9];
        if (i10 < 0) {
            cArr[0] = '-';
            i10 = -i10;
        } else {
            cArr[0] = '+';
        }
        for (int i11 = 0; i11 < 8; i11++) {
            cArr[8 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    public static String s8(long j10) {
        char[] cArr = new char[17];
        if (j10 < 0) {
            cArr[0] = '-';
            j10 = -j10;
        } else {
            cArr[0] = '+';
        }
        for (int i10 = 0; i10 < 16; i10++) {
            cArr[16 - i10] = Character.forDigit(((int) j10) & 15, 16);
            j10 >>= 4;
        }
        return new String(cArr);
    }

    public static String u1(int i10) {
        char[] cArr = new char[2];
        for (int i11 = 0; i11 < 2; i11++) {
            cArr[1 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    public static String u2(int i10) {
        char[] cArr = new char[4];
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[3 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    public static String u2or4(int i10) {
        return i10 == ((char) i10) ? u2(i10) : u4(i10);
    }

    public static String u3(int i10) {
        char[] cArr = new char[6];
        for (int i11 = 0; i11 < 6; i11++) {
            cArr[5 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    public static String u4(int i10) {
        char[] cArr = new char[8];
        for (int i11 = 0; i11 < 8; i11++) {
            cArr[7 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    public static String u8(long j10) {
        char[] cArr = new char[16];
        for (int i10 = 0; i10 < 16; i10++) {
            cArr[15 - i10] = Character.forDigit(((int) j10) & 15, 16);
            j10 >>= 4;
        }
        return new String(cArr);
    }

    public static String uNibble(int i10) {
        return new String(new char[]{Character.forDigit(i10 & 15, 16)});
    }
}
