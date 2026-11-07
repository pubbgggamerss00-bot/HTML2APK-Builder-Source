package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Bytes;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public abstract class HarakaBase implements Digest {
    protected static final int DIGEST_SIZE = 32;
    static final byte[][] RC = {new byte[]{-99, 123, -127, 117, -16, -2, -59, -78, 10, -64, 32, -26, 76, 112, -124, 6}, new byte[]{23, -9, 8, 47, -92, 107, RegisterType.DOUBLE_HI, 100, 107, -96, -13, -120, -31, -76, 102, -117}, new byte[]{20, -111, 2, -97, 96, -99, 2, -49, -104, -124, -14, 83, 45, -34, 2, 52}, new byte[]{121, 79, 91, -3, -81, PSSSigner.TRAILER_IMPLICIT, -13, -69, 8, 79, 123, 46, -26, -22, -42, RegisterType.DOUBLE_LO}, new byte[]{68, 112, 57, -66, 28, -51, -18, 121, -117, 68, 114, 72, -53, -80, -49, -53}, new byte[]{123, 5, -118, 43, -19, 53, 83, -115, -73, 50, -112, 110, -18, -51, -22, 126}, new byte[]{27, -17, 79, -38, 97, 39, 65, -30, -48, 124, 46, 94, 67, -113, -62, 103}, new byte[]{59, RegisterType.FLOAT, -57, 31, -30, -3, 95, 103, 7, -52, -54, -81, -80, -39, 36, 41}, new byte[]{-18, 101, -44, -71, -54, -113, -37, -20, -23, Byte.MAX_VALUE, -122, -26, -15, 99, 77, -85}, new byte[]{51, 126, 3, -83, 79, 64, 42, 91, 100, -51, -73, -44, -124, -65, 48, 28}, new byte[]{0, -104, -10, -115, 46, -117, 2, 105, -65, 35, 23, -108, -71, RegisterType.FLOAT, -52, -78}, new byte[]{-118, 45, -99, 92, -56, -98, -86, 74, 114, 85, 111, -34, -90, 120, 4, -6}, new byte[]{-44, -97, RegisterType.REFERENCE, 41, 46, 79, -6, RegisterType.DOUBLE_LO, RegisterType.REFERENCE, 42, 119, 107, 43, -97, -76, -33}, new byte[]{-18, RegisterType.REFERENCE, 106, -69, -82, RegisterType.UNINIT_THIS, -42, 50, 54, -94, 73, -12, 68, 3, -95, 30}, new byte[]{-90, -20, -88, -100, -55, 0, -106, 95, -124, 0, 5, 75, -120, 73, 4, -81}, new byte[]{-20, -109, -27, 39, -29, -57, -94, 120, 79, -100, 25, -99, -40, 94, 2, 33}, new byte[]{115, 1, -44, -126, -51, 46, 40, -71, -73, -55, 89, -89, -8, -86, 58, -65}, new byte[]{107, 125, 48, RegisterType.UNINIT_REF, -39, -17, -14, 55, 23, -80, -122, 97, RegisterType.LONG_HI, 112, 96, 98}, new byte[]{-58, -102, -4, -10, 83, -111, -62, -127, 67, 4, 48, 33, -62, 69, -54, 90}, new byte[]{58, -108, -47, 54, -24, -110, -81, 44, -69, 104, 107, 34, 60, -105, 35, -110}, new byte[]{-76, 113, RegisterType.UNINIT_REF, -27, 88, -71, -70, 108, -21, -122, 88, 34, 56, -110, -65, -45}, new byte[]{-115, RegisterType.REFERENCE, -31, 36, -35, -3, 61, -109, 119, -58, -16, -82, -27, 60, -122, -37}, new byte[]{-79, RegisterType.REFERENCE, 34, -53, -29, -115, -28, -125, -100, -96, -21, -1, 104, 98, 96, -69}, new byte[]{125, -9, 43, -57, 78, 26, -71, 45, -100, -47, -28, -30, -36, -45, 75, 115}, new byte[]{78, -110, -77, 44, -60, 21, 20, 75, 67, 27, 48, 97, -61, 71, -69, 67}, new byte[]{-103, 104, -21, 22, -35, 49, -78, 3, -10, -17, 7, -25, -88, 117, -89, -37}, new byte[]{44, 71, -54, 126, 2, 35, 94, -114, 119, 89, 117, 60, 75, 97, -13, 109}, new byte[]{-7, 23, -122, -72, -71, -27, 27, 109, 119, 125, -34, -42, 23, 90, -89, -51}, new byte[]{93, -18, 70, -87, -99, 6, 108, -99, -86, -23, -88, 107, -16, 67, 107, -20}, new byte[]{-63, 39, -13, 59, 89, RegisterType.UNINIT_THIS, 83, -94, 43, 51, 87, -7, 80, 105, 30, -53}, new byte[]{-39, -48, RegisterType.DOUBLE_LO, 96, 83, 3, -19, -28, -100, 97, -38, 0, 117, 12, -18, 44}, new byte[]{80, -93, -92, 99, PSSSigner.TRAILER_IMPLICIT, -70, -69, Byte.MIN_VALUE, -85, 12, -23, -106, -95, -91, -79, -16}, new byte[]{57, -54, -115, -109, 48, -34, RegisterType.LONG_HI, -85, -120, 41, -106, 94, 2, -79, 61, -82}, new byte[]{66, -76, 117, 46, -88, -13, 20, -120, RegisterType.FLOAT, -92, 84, -43, 56, -113, -69, 23}, new byte[]{-10, 22, 10, 54, 121, -73, -74, -82, -41, Byte.MAX_VALUE, 66, 95, 91, -118, -69, 52}, new byte[]{-34, -81, -70, -1, 24, 89, -50, 67, 56, 84, -27, -53, 65, 82, -10, 38}, new byte[]{120, -55, -98, -125, -9, -100, -54, -94, 106, 2, -13, -71, 84, -102, -23, 76}, new byte[]{53, RegisterType.REFERENCE, -112, 34, 40, 110, -64, 64, -66, -9, -33, 27, 26, -91, 81, -82}, new byte[]{-49, 89, -90, 72, RegisterType.DOUBLE_HI, PSSSigner.TRAILER_IMPLICIT, 115, -63, 43, -46, 126, -70, 60, 97, -63, -96}, new byte[]{-95, -99, -59, -23, -3, -67, -42, 74, -120, -126, 40, 2, 3, -52, 106, 117}};
    private static final byte[][] S = {new byte[]{99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118}, new byte[]{-54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64}, new byte[]{-73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21}, new byte[]{4, -57, 35, -61, 24, -106, 5, -102, 7, RegisterType.REFERENCE, Byte.MIN_VALUE, -30, -21, 39, -78, 117}, new byte[]{9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124}, new byte[]{83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49}, new byte[]{-48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88}, new byte[]{81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, RegisterType.UNINIT_REF, -1, -13, -46}, new byte[]{-51, 12, RegisterType.CONFLICTED, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115}, new byte[]{96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, RegisterType.FLOAT, -37}, new byte[]{-32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121}, new byte[]{-25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8}, new byte[]{-70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118}, new byte[]{112, 62, -75, 102, 72, 3, -10, RegisterType.DOUBLE_LO, 97, 53, 87, -71, -122, -63, 29, -98}, new byte[]{-31, -8, -104, RegisterType.UNINIT_THIS, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33}, new byte[]{-116, -95, -119, RegisterType.LONG_HI, -65, -26, 66, 104, 65, -103, 45, RegisterType.DOUBLE_HI, -80, 84, -69, 22}};

    public static byte[] aesEnc(byte[] bArr, byte[] bArr2) {
        byte[] bArrMixColumns = mixColumns(shiftRows(subBytes(bArr)));
        Bytes.xorTo(16, bArr2, bArrMixColumns);
        return bArrMixColumns;
    }

    private static byte[] mixColumns(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 * 4;
            int i13 = i12 + 1;
            int i14 = i12 + 2;
            int i15 = i12 + 3;
            bArr2[i10] = (byte) ((((mulX(bArr[i12]) ^ mulX(bArr[i13])) ^ bArr[i13]) ^ bArr[i14]) ^ bArr[i15]);
            bArr2[i10 + 1] = (byte) ((((bArr[i12] ^ mulX(bArr[i13])) ^ mulX(bArr[i14])) ^ bArr[i14]) ^ bArr[i15]);
            int i16 = i10 + 3;
            bArr2[i10 + 2] = (byte) ((((bArr[i12] ^ bArr[i13]) ^ mulX(bArr[i14])) ^ mulX(bArr[i15])) ^ bArr[i15]);
            i10 += 4;
            bArr2[i16] = (byte) ((((mulX(bArr[i12]) ^ bArr[i12]) ^ bArr[i13]) ^ bArr[i14]) ^ mulX(bArr[i15]));
        }
        return bArr2;
    }

    public static byte mulX(byte b10) {
        return (byte) ((((b10 & 128) >> 7) * 27) ^ ((b10 & Byte.MAX_VALUE) << 1));
    }

    public static byte sBox(byte b10) {
        return S[(b10 & 255) >>> 4][b10 & RegisterType.DOUBLE_HI];
    }

    public static byte[] shiftRows(byte[] bArr) {
        return new byte[]{bArr[0], bArr[5], bArr[10], bArr[15], bArr[4], bArr[9], bArr[14], bArr[3], bArr[8], bArr[13], bArr[2], bArr[7], bArr[12], bArr[1], bArr[6], bArr[11]};
    }

    public static byte[] subBytes(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        bArr2[0] = sBox(bArr[0]);
        bArr2[1] = sBox(bArr[1]);
        bArr2[2] = sBox(bArr[2]);
        bArr2[3] = sBox(bArr[3]);
        bArr2[4] = sBox(bArr[4]);
        bArr2[5] = sBox(bArr[5]);
        bArr2[6] = sBox(bArr[6]);
        bArr2[7] = sBox(bArr[7]);
        bArr2[8] = sBox(bArr[8]);
        bArr2[9] = sBox(bArr[9]);
        bArr2[10] = sBox(bArr[10]);
        bArr2[11] = sBox(bArr[11]);
        bArr2[12] = sBox(bArr[12]);
        bArr2[13] = sBox(bArr[13]);
        bArr2[14] = sBox(bArr[14]);
        bArr2[15] = sBox(bArr[15]);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }
}
