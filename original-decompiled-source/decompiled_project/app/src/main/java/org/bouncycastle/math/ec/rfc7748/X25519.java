package org.bouncycastle.math.ec.rfc7748;

import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public abstract class X25519 {
    private static final int C_A = 486662;
    private static final int C_A24 = 121666;
    public static final int POINT_SIZE = 32;
    public static final int SCALAR_SIZE = 32;

    public static class F extends X25519Field {
        private F() {
        }
    }

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public static boolean calculateAgreement(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        scalarMult(bArr, i10, bArr2, i11, bArr3, i12);
        return !Arrays.areAllZeroes(bArr3, i12, 32);
    }

    private static int decode32(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private static void decodeScalar(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = decode32(bArr, (i11 * 4) + i10);
        }
        iArr[0] = iArr[0] & (-8);
        int i12 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i12;
        iArr[7] = i12 | 1073741824;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b10 = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = b10;
        bArr[31] = (byte) (b10 | 64);
    }

    public static void generatePublicKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        scalarMultBase(bArr, i10, bArr2, i11);
    }

    private static void pointDouble(int[] iArr, int[] iArr2) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        X25519Field.apm(iArr, iArr2, iArrCreate, iArrCreate2);
        X25519Field.sqr(iArrCreate, iArrCreate);
        X25519Field.sqr(iArrCreate2, iArrCreate2);
        X25519Field.mul(iArrCreate, iArrCreate2, iArr);
        X25519Field.sub(iArrCreate, iArrCreate2, iArrCreate);
        X25519Field.mul(iArrCreate, C_A24, iArr2);
        X25519Field.add(iArr2, iArrCreate2, iArr2);
        X25519Field.mul(iArr2, iArrCreate, iArr2);
    }

    public static void precompute() {
        Ed25519.precompute();
    }

    public static void scalarMult(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int[] iArr = new int[8];
        decodeScalar(bArr, i10, iArr);
        int[] iArrCreate = X25519Field.create();
        X25519Field.decode(bArr2, i11, iArrCreate);
        int[] iArrCreate2 = X25519Field.create();
        X25519Field.copy(iArrCreate, 0, iArrCreate2, 0);
        int[] iArrCreate3 = X25519Field.create();
        iArrCreate3[0] = 1;
        int[] iArrCreate4 = X25519Field.create();
        iArrCreate4[0] = 1;
        int[] iArrCreate5 = X25519Field.create();
        int[] iArrCreate6 = X25519Field.create();
        int[] iArrCreate7 = X25519Field.create();
        int i13 = 254;
        int i14 = 1;
        while (true) {
            X25519Field.apm(iArrCreate4, iArrCreate5, iArrCreate6, iArrCreate4);
            X25519Field.apm(iArrCreate2, iArrCreate3, iArrCreate5, iArrCreate2);
            X25519Field.mul(iArrCreate6, iArrCreate2, iArrCreate6);
            X25519Field.mul(iArrCreate4, iArrCreate5, iArrCreate4);
            X25519Field.sqr(iArrCreate5, iArrCreate5);
            X25519Field.sqr(iArrCreate2, iArrCreate2);
            X25519Field.sub(iArrCreate5, iArrCreate2, iArrCreate7);
            X25519Field.mul(iArrCreate7, C_A24, iArrCreate3);
            X25519Field.add(iArrCreate3, iArrCreate2, iArrCreate3);
            X25519Field.mul(iArrCreate3, iArrCreate7, iArrCreate3);
            X25519Field.mul(iArrCreate2, iArrCreate5, iArrCreate2);
            X25519Field.apm(iArrCreate6, iArrCreate4, iArrCreate4, iArrCreate5);
            X25519Field.sqr(iArrCreate4, iArrCreate4);
            X25519Field.sqr(iArrCreate5, iArrCreate5);
            X25519Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
            i13--;
            int i15 = (iArr[i13 >>> 5] >>> (i13 & 31)) & 1;
            int i16 = i14 ^ i15;
            X25519Field.cswap(i16, iArrCreate2, iArrCreate4);
            X25519Field.cswap(i16, iArrCreate3, iArrCreate5);
            if (i13 < 3) {
                break;
            } else {
                i14 = i15;
            }
        }
        for (int i17 = 0; i17 < 3; i17++) {
            pointDouble(iArrCreate2, iArrCreate3);
        }
        X25519Field.inv(iArrCreate3, iArrCreate3);
        X25519Field.mul(iArrCreate2, iArrCreate3, iArrCreate2);
        X25519Field.normalize(iArrCreate2);
        X25519Field.encode(iArrCreate2, bArr3, i12);
    }

    public static void scalarMultBase(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        Ed25519.scalarMultBaseYZ(Friend.INSTANCE, bArr, i10, iArrCreate, iArrCreate2);
        X25519Field.apm(iArrCreate2, iArrCreate, iArrCreate, iArrCreate2);
        X25519Field.inv(iArrCreate2, iArrCreate2);
        X25519Field.mul(iArrCreate, iArrCreate2, iArrCreate);
        X25519Field.normalize(iArrCreate);
        X25519Field.encode(iArrCreate, bArr2, i11);
    }
}
