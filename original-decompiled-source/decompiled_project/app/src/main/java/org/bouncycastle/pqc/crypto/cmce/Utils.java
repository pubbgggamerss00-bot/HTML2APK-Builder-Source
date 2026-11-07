package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Utils {
    public static short bitrev(short s10, int i10) {
        short s11 = (short) (((s10 & 65280) >> 8) | ((s10 & 255) << 8));
        short s12 = (short) (((s11 & 61680) >> 4) | ((s11 & 3855) << 4));
        short s13 = (short) (((s12 & 52428) >> 2) | ((s12 & 13107) << 2));
        short s14 = (short) (((s13 & 43690) >> 1) | ((s13 & 21845) << 1));
        return (short) (i10 == 12 ? s14 >> 4 : s14 >> 3);
    }

    public static int load4(byte[] bArr, int i10) {
        return Pack.littleEndianToInt(bArr, i10);
    }

    public static long load8(byte[] bArr, int i10) {
        return Pack.littleEndianToLong(bArr, i10);
    }

    public static short load_gf(byte[] bArr, int i10, int i11) {
        return (short) (Pack.littleEndianToShort(bArr, i10) & i11);
    }

    public static void store8(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 4] = (byte) ((j10 >> 32) & 255);
        bArr[i10 + 5] = (byte) ((j10 >> 40) & 255);
        bArr[i10 + 6] = (byte) ((j10 >> 48) & 255);
        bArr[i10 + 7] = (byte) ((j10 >> 56) & 255);
    }

    public static void store_gf(byte[] bArr, int i10, short s10) {
        bArr[i10] = (byte) (s10 & 255);
        bArr[i10 + 1] = (byte) (s10 >> 8);
    }
}
