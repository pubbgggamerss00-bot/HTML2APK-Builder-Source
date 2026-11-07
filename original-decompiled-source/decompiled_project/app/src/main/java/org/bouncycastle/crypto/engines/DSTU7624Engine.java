package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class DSTU7624Engine implements BlockCipher {
    private static final int ROUNDS_128 = 10;
    private static final int ROUNDS_256 = 14;
    private static final int ROUNDS_512 = 18;
    private static final byte[] S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, RegisterType.DOUBLE_LO, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, RegisterType.DOUBLE_HI, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, RegisterType.UNINIT_THIS, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, RegisterType.FLOAT, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, RegisterType.LONG_HI, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, RegisterType.UNINIT_REF, -48, -39, RegisterType.CONFLICTED, 12, RegisterType.REFERENCE, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, Byte.MIN_VALUE};
    private static final byte[] S1 = {-50, -69, -21, -110, -22, -53, RegisterType.CONFLICTED, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, RegisterType.DOUBLE_HI, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, RegisterType.UNINIT_REF, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, RegisterType.REFERENCE, RegisterType.LONG_HI, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, RegisterType.UNINIT_THIS, -43, -100, -49, RegisterType.DOUBLE_LO, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, RegisterType.FLOAT, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, Byte.MIN_VALUE, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, Byte.MAX_VALUE, -118, 39, -57, -64, 41, -41};
    private static final byte[] S2 = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, RegisterType.DOUBLE_LO, 65, 76, -34, -78, -112, 37, -91, -41, 3, RegisterType.UNINIT_THIS, 0, -61, 46, -110, -17, 78, RegisterType.REFERENCE, -99, 125, -53, 53, RegisterType.UNINIT_REF, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, RegisterType.FLOAT, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, Byte.MIN_VALUE, 41, 39, -49, -103, -88, 80, RegisterType.DOUBLE_HI, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, RegisterType.LONG_HI, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, RegisterType.CONFLICTED, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};
    private static final byte[] S3 = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, RegisterType.CONFLICTED, -118, -73, -43, 37, 121, -11, -67, 88, 47, RegisterType.LONG_HI, 2, -19, 81, -98, RegisterType.UNINIT_THIS, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, RegisterType.DOUBLE_LO, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, RegisterType.UNINIT_REF, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, RegisterType.DOUBLE_HI, 10, 6, -26, 43, -106, -93, 28, -81, 106, RegisterType.REFERENCE, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, Byte.MIN_VALUE, -17, -53, -69, 107, 118, -70, 90, 125, 120, RegisterType.FLOAT, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, Byte.MAX_VALUE, -111, -72, -55, 87, 27, -32, 97};
    private static final byte[] T0 = {-92, -94, -87, -59, 78, -55, 3, -39, 126, RegisterType.DOUBLE_HI, -46, -83, -25, -45, 39, 91, -29, -95, -24, -26, 124, 42, 85, 12, -122, 57, -41, -115, -72, RegisterType.REFERENCE, 111, 40, -51, -118, 112, 86, 114, -7, -65, 79, 115, -23, -9, 87, 22, -84, 80, -64, -99, -73, 71, 113, 96, -60, 116, 67, 108, 31, -109, 119, -36, -50, 32, -116, -103, 95, 68, 1, -11, 30, -121, 94, 97, 44, 75, 29, -127, 21, -12, 35, -42, -22, -31, 103, -15, Byte.MAX_VALUE, -2, -38, 60, 7, 83, 106, -124, -100, -53, 2, -125, 51, -35, 53, -30, 89, 90, -104, -91, -110, 100, 4, 6, RegisterType.UNINIT_REF, 77, 28, -105, 8, 49, -18, -85, 5, -81, 121, -96, 24, 70, 109, -4, -119, -44, -57, -1, -16, -49, 66, -111, -8, 104, 10, 101, -114, -74, -3, -61, -17, 120, 76, -52, -98, 48, 46, PSSSigner.TRAILER_IMPLICIT, RegisterType.FLOAT, 84, 26, -90, -69, 38, Byte.MIN_VALUE, 72, -108, 50, 125, -89, 63, -82, 34, 61, 102, -86, -10, 0, 93, -67, 74, -32, 59, -76, 23, -117, -97, 118, -80, 36, -102, 37, 99, -37, -21, 122, 62, 92, -77, -79, 41, -14, -54, 88, 110, -40, -88, 47, 117, -33, 20, -5, RegisterType.CONFLICTED, 73, -120, -78, -20, -28, 52, 45, -106, -58, 58, -19, -107, RegisterType.DOUBLE_LO, -27, -123, 107, 64, 33, -101, 9, 25, 43, 82, -34, 69, -93, -6, 81, -62, -75, -47, -112, -71, -13, 55, -63, RegisterType.LONG_HI, -70, 65, RegisterType.UNINIT_THIS, 56, 123, -66, -48, -43, 105, 54, -56, 98, 27, -126, -113};
    private static final byte[] T1 = {-125, -14, 42, -21, -23, -65, 123, -100, 52, -106, -115, -104, -71, 105, -116, 41, 61, -120, 104, 6, 57, RegisterType.UNINIT_THIS, 76, RegisterType.DOUBLE_LO, -96, 86, 64, -110, 21, PSSSigner.TRAILER_IMPLICIT, -77, -36, 111, -8, 38, -70, -66, -67, 49, -5, -61, -2, Byte.MIN_VALUE, 97, -31, 122, 50, -46, 112, 32, -95, 69, -20, -39, 26, 93, -76, -40, 9, -91, 85, -114, 55, 118, -87, 103, RegisterType.UNINIT_REF, 23, 54, 101, -79, -107, 98, 89, 116, -93, 80, 47, 75, -56, -48, -113, -51, -44, 60, -122, RegisterType.REFERENCE, 29, 35, -17, -12, 83, 25, 53, -26, Byte.MAX_VALUE, 94, -42, 121, 81, 34, 20, -9, 30, 74, 66, -101, 65, 115, 45, -63, 92, -90, -94, -32, 46, -45, 40, -69, -55, -82, 106, -47, 90, 48, -112, -124, -7, -78, 88, -49, 126, -59, -53, -105, -28, 22, 108, -6, -80, 109, 31, 82, -103, RegisterType.LONG_HI, 78, 3, -111, -62, 77, 100, 119, -97, -35, -60, 73, -118, -102, 36, 56, -89, 87, -123, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, RegisterType.FLOAT, -43, RegisterType.CONFLICTED, 117, -16, 114, -74, -99, 27, 1, 63, 68, -27, -121, -3, 7, -15, -85, -108, 24, -22, -4, 58, -126, 95, 5, 84, -37, 0, -117, -29, 72, 12, -54, 120, -119, 10, -1, 62, 91, -127, -18, 113, -30, -38, 44, -72, -75, -52, 110, -88, 107, -83, 96, -58, 8, 4, 2, -24, -11, 79, -92, -13, -64, -50, 67, 37, 28, 33, 51, RegisterType.DOUBLE_HI, -81, 71, -19, 102, 99, -109, -86};
    private static final byte[] T2 = {69, -44, RegisterType.FLOAT, 67, -15, 114, -19, -92, -62, 56, -26, 113, -3, -74, 58, -107, 80, 68, 75, -30, 116, 107, 30, RegisterType.UNINIT_THIS, 90, -58, -76, -40, -91, -118, 112, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, -36, RegisterType.REFERENCE, 49, 44, 71, 106, -103, -82, -56, Byte.MAX_VALUE, -7, 79, 93, -106, 111, -12, -77, 57, 33, -38, -100, -123, -98, 59, -16, -65, -17, 6, -18, -27, 95, 32, RegisterType.UNINIT_REF, -52, 60, 84, 74, 82, -108, RegisterType.DOUBLE_LO, -64, 40, -10, 86, 96, -94, -29, RegisterType.DOUBLE_HI, -20, -99, 36, -125, 126, -43, 124, -21, 24, -41, -51, -35, 120, -1, -37, -95, 9, -48, 118, -124, 117, -69, 29, 26, 47, -80, -2, -42, 52, 99, 53, -46, 42, 89, 109, 77, 119, -25, -114, 97, -49, -97, -50, 39, -11, Byte.MIN_VALUE, -122, -57, -90, -5, -8, -121, -85, 98, 63, -33, 72, 0, 20, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, 12, -14, 41, -81, 23, 108, 65, 48, -23, -109, 85, -9, -84, 104, 38, -60, 125, -54, 122, 62, -96, 55, 3, -63, 54, 105, 102, 8, 22, -89, PSSSigner.TRAILER_IMPLICIT, -59, -45, 34, -73, RegisterType.CONFLICTED, 70, 50, -24, 87, -120, 43, -127, -78, 78, 100, 28, -86, -111, 88, 46, -101, 92, 27, 81, 115, 66, 35, 1, 110, -13, RegisterType.LONG_HI, -66, 61, 10, 45, 31, 103, 51, 25, 123, 94, -22, -34, -117, -53, -87, -116, -115, -83, 73, -126, -28, -70, -61, 21, -47, -32, -119, -4, -79, -71, -75, 7, 121, -72, -31};
    private static final byte[] T3 = {-78, -74, 35, RegisterType.UNINIT_THIS, -89, -120, -59, -90, 57, -113, -60, -24, 115, 34, 67, -61, -126, 39, -51, 24, 81, 98, 45, -9, 92, RegisterType.DOUBLE_LO, 59, -3, -54, -101, RegisterType.LONG_HI, RegisterType.DOUBLE_HI, 121, -116, RegisterType.UNINIT_REF, 76, 116, 28, 10, -114, 124, -108, 7, -57, 94, 20, -95, 33, 87, 80, 78, -87, Byte.MIN_VALUE, -39, -17, 100, 65, -49, 60, -18, 46, RegisterType.CONFLICTED, 41, -70, 52, 90, -82, -118, 97, 51, RegisterType.REFERENCE, -71, 85, -88, 21, 5, -10, 3, 6, 73, -75, 37, 9, 22, 12, 42, 56, -4, 32, -12, -27, Byte.MAX_VALUE, -41, 49, 43, 102, 111, -1, 114, -122, -16, -93, 47, 120, 0, PSSSigner.TRAILER_IMPLICIT, -52, -30, -80, -15, 66, -76, 48, 95, 96, 4, -20, -91, -29, -117, -25, 29, -65, -124, 123, -26, -127, -8, -34, -40, -46, 23, -50, 75, 71, -42, 105, 108, 25, -103, -102, 1, -77, -123, -79, -7, 89, -62, 55, -23, -56, -96, -19, 79, -119, 104, 109, -43, 38, -111, -121, 88, -67, -55, -104, -36, 117, -64, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, RegisterType.FLOAT, -37, 64, -110, 26, -6, -84, -28, -31, 113, 31, 101, -115, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, -32, 53, -69, 58, 77, -83, 44, 61, 86, 8, 27, 74, -109, 106, -85, -72, 122, -14, 125, -38, 63, -2, 62, -66, -22, -86, 68, -58, -48, 54, 72, 112, -106, 119, 36, 83, -33, -13, -125, 40, 50, 69, 30, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};
    private boolean forEncryption;
    private long[] internalState;
    private long[][] roundKeys;
    private int roundsAmount;
    private int wordsInBlock;
    private int wordsInKey;
    private long[] workingKey;

    public DSTU7624Engine(int i10) throws IllegalArgumentException {
        if (i10 != 128 && i10 != 256 && i10 != 512) {
            throw new IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        int i11 = i10 >>> 6;
        this.wordsInBlock = i11;
        this.internalState = new long[i11];
    }

    private void addRoundKey(int i10) {
        long[] jArr = this.roundKeys[i10];
        for (int i11 = 0; i11 < this.wordsInBlock; i11++) {
            long[] jArr2 = this.internalState;
            jArr2[i11] = jArr2[i11] + jArr[i11];
        }
    }

    private void decryptBlock_128(byte[] bArr, int i10, byte[] bArr2, int i11) {
        long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i10);
        long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, i10 + 8);
        long[][] jArr = this.roundKeys;
        int i12 = this.roundsAmount;
        long[] jArr2 = jArr[i12];
        boolean z10 = false;
        long j10 = jLittleEndianToLong - jArr2[0];
        boolean z11 = true;
        long j11 = jLittleEndianToLong2 - jArr2[1];
        while (true) {
            long jMixColumnInv = mixColumnInv(j10);
            long jMixColumnInv2 = mixColumnInv(j11);
            int i13 = (int) jMixColumnInv;
            int i14 = (int) (jMixColumnInv >>> 32);
            int i15 = (int) jMixColumnInv2;
            int i16 = (int) (jMixColumnInv2 >>> 32);
            byte[] bArr3 = T0;
            byte b10 = bArr3[i13 & 255];
            byte[] bArr4 = T1;
            byte b11 = bArr4[(i13 >>> 8) & 255];
            byte[] bArr5 = T2;
            boolean z12 = z10;
            byte b12 = bArr5[(i13 >>> 16) & 255];
            byte[] bArr6 = T3;
            int i17 = (bArr6[i13 >>> 24] << 24) | ((b12 & 255) << 16) | (b10 & 255) | ((b11 & 255) << 8);
            byte b13 = bArr3[i16 & 255];
            byte b14 = bArr4[(i16 >>> 8) & 255];
            byte b15 = bArr5[(i16 >>> 16) & 255];
            boolean z13 = z11;
            long j12 = (i17 & BodyPartID.bodyIdMax) | (((bArr6[i16 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16))) << 32);
            int i18 = (bArr6[i15 >>> 24] << 24) | (bArr3[i15 & 255] & 255) | ((bArr4[(i15 >>> 8) & 255] & 255) << 8) | ((bArr5[(i15 >>> 16) & 255] & 255) << 16);
            byte b16 = bArr3[i14 & 255];
            byte b17 = bArr4[(i14 >>> 8) & 255];
            byte b18 = bArr5[(i14 >>> 16) & 255];
            long j13 = (i18 & BodyPartID.bodyIdMax) | (((bArr6[i14 >>> 24] << 24) | (((b16 & 255) | ((b17 & 255) << 8)) | ((b18 & 255) << 16))) << 32);
            i12--;
            long[][] jArr3 = this.roundKeys;
            if (i12 == 0) {
                long[] jArr4 = jArr3[z12 ? 1 : 0];
                long j14 = j12 - jArr4[z12 ? 1 : 0];
                long j15 = j13 - jArr4[z13 ? 1 : 0];
                Pack.longToLittleEndian(j14, bArr2, i11);
                Pack.longToLittleEndian(j15, bArr2, i11 + 8);
                return;
            }
            long[] jArr5 = jArr3[i12];
            long j16 = jArr5[z12 ? 1 : 0] ^ j12;
            j11 = j13 ^ jArr5[z13 ? 1 : 0];
            j10 = j16;
            z10 = z12 ? 1 : 0;
            z11 = z13 ? 1 : 0;
        }
    }

    private void encryptBlock_128(byte[] bArr, int i10, byte[] bArr2, int i11) {
        long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i10);
        long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, i10 + 8);
        boolean z10 = false;
        long[] jArr = this.roundKeys[0];
        long j10 = jLittleEndianToLong + jArr[0];
        boolean z11 = true;
        long j11 = jLittleEndianToLong2 + jArr[1];
        int i12 = 0;
        while (true) {
            int i13 = (int) j10;
            int i14 = (int) (j10 >>> 32);
            int i15 = (int) j11;
            int i16 = (int) (j11 >>> 32);
            byte[] bArr3 = S0;
            byte b10 = bArr3[i13 & 255];
            byte[] bArr4 = S1;
            byte b11 = bArr4[(i13 >>> 8) & 255];
            byte[] bArr5 = S2;
            boolean z12 = z10;
            byte b12 = bArr5[(i13 >>> 16) & 255];
            byte[] bArr6 = S3;
            int i17 = ((b12 & 255) << 16) | (b10 & 255) | ((b11 & 255) << 8) | (bArr6[i13 >>> 24] << 24);
            byte b13 = bArr3[i16 & 255];
            byte b14 = bArr4[(i16 >>> 8) & 255];
            byte b15 = bArr5[(i16 >>> 16) & 255];
            boolean z13 = z11;
            long j12 = (i17 & BodyPartID.bodyIdMax) | (((bArr6[i16 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16))) << 32);
            int i18 = (bArr6[i15 >>> 24] << 24) | (bArr3[i15 & 255] & 255) | ((bArr4[(i15 >>> 8) & 255] & 255) << 8) | ((bArr5[(i15 >>> 16) & 255] & 255) << 16);
            byte b16 = bArr3[i14 & 255];
            byte b17 = bArr4[(i14 >>> 8) & 255];
            byte b18 = bArr5[(i14 >>> 16) & 255];
            long j13 = (i18 & BodyPartID.bodyIdMax) | (((bArr6[i14 >>> 24] << 24) | (((b16 & 255) | ((b17 & 255) << 8)) | ((b18 & 255) << 16))) << 32);
            long jMixColumn = mixColumn(j12);
            long jMixColumn2 = mixColumn(j13);
            i12++;
            int i19 = this.roundsAmount;
            if (i12 == i19) {
                long[] jArr2 = this.roundKeys[i19];
                long j14 = jMixColumn + jArr2[z12 ? 1 : 0];
                long j15 = jMixColumn2 + jArr2[z13 ? 1 : 0];
                Pack.longToLittleEndian(j14, bArr2, i11);
                Pack.longToLittleEndian(j15, bArr2, i11 + 8);
                return;
            }
            long[] jArr3 = this.roundKeys[i12];
            long j16 = jMixColumn ^ jArr3[z12 ? 1 : 0];
            j11 = jMixColumn2 ^ jArr3[z13 ? 1 : 0];
            j10 = j16;
            z10 = z12 ? 1 : 0;
            z11 = z13 ? 1 : 0;
        }
    }

    private void invShiftRows() {
        int i10 = this.wordsInBlock;
        if (i10 == 2) {
            long[] jArr = this.internalState;
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = (-4294967296L) & (j10 ^ j11);
            jArr[0] = j10 ^ j12;
            jArr[1] = j12 ^ j11;
            return;
        }
        if (i10 == 4) {
            long[] jArr2 = this.internalState;
            long j13 = jArr2[0];
            long j14 = jArr2[1];
            long j15 = jArr2[2];
            long j16 = jArr2[3];
            long j17 = (j13 ^ j14) & (-281470681808896L);
            long j18 = j13 ^ j17;
            long j19 = j14 ^ j17;
            long j20 = (j15 ^ j16) & (-281470681808896L);
            long j21 = j15 ^ j20;
            long j22 = j16 ^ j20;
            long j23 = (j18 ^ j21) & (-4294967296L);
            long j24 = j18 ^ j23;
            long j25 = (j19 ^ j22) & 281474976645120L;
            jArr2[0] = j24;
            jArr2[1] = j19 ^ j25;
            jArr2[2] = j21 ^ j23;
            jArr2[3] = j25 ^ j22;
            return;
        }
        if (i10 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.internalState;
        long j26 = jArr3[0];
        long j27 = jArr3[1];
        long j28 = jArr3[2];
        long j29 = jArr3[3];
        long j30 = jArr3[4];
        long j31 = jArr3[5];
        long j32 = jArr3[6];
        long j33 = jArr3[7];
        long j34 = (j26 ^ j27) & (-71777214294589696L);
        long j35 = j26 ^ j34;
        long j36 = j27 ^ j34;
        long j37 = (j28 ^ j29) & (-71777214294589696L);
        long j38 = j28 ^ j37;
        long j39 = j29 ^ j37;
        long j40 = (j30 ^ j31) & (-71777214294589696L);
        long j41 = j30 ^ j40;
        long j42 = j31 ^ j40;
        long j43 = (j32 ^ j33) & (-71777214294589696L);
        long j44 = j32 ^ j43;
        long j45 = j33 ^ j43;
        long j46 = (j35 ^ j38) & (-281470681808896L);
        long j47 = j35 ^ j46;
        long j48 = j38 ^ j46;
        long j49 = (j36 ^ j39) & 72056494543077120L;
        long j50 = j36 ^ j49;
        long j51 = j39 ^ j49;
        long j52 = (j41 ^ j44) & (-281470681808896L);
        long j53 = j41 ^ j52;
        long j54 = j44 ^ j52;
        long j55 = (j42 ^ j45) & 72056494543077120L;
        long j56 = j42 ^ j55;
        long j57 = j45 ^ j55;
        long j58 = (j47 ^ j53) & (-4294967296L);
        long j59 = j47 ^ j58;
        long j60 = j53 ^ j58;
        long j61 = (j50 ^ j56) & 72057594021150720L;
        long j62 = j50 ^ j61;
        long j63 = (j48 ^ j54) & 281474976645120L;
        long j64 = j48 ^ j63;
        long j65 = j63 ^ j54;
        long j66 = (j51 ^ j57) & 1099511627520L;
        jArr3[0] = j59;
        jArr3[1] = j62;
        jArr3[2] = j64;
        jArr3[3] = j51 ^ j66;
        jArr3[4] = j60;
        jArr3[5] = j56 ^ j61;
        jArr3[6] = j65;
        jArr3[7] = j57 ^ j66;
    }

    private void invSubBytes() {
        for (int i10 = 0; i10 < this.wordsInBlock; i10++) {
            long[] jArr = this.internalState;
            long j10 = jArr[i10];
            int i11 = (int) j10;
            int i12 = (int) (j10 >>> 32);
            byte[] bArr = T0;
            byte b10 = bArr[i11 & 255];
            byte[] bArr2 = T1;
            byte b11 = bArr2[(i11 >>> 8) & 255];
            byte[] bArr3 = T2;
            byte b12 = bArr3[(i11 >>> 16) & 255];
            int i13 = (T3[i11 >>> 24] << 24) | (b10 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
            byte b13 = bArr[i12 & 255];
            byte b14 = bArr2[(i12 >>> 8) & 255];
            byte b15 = bArr3[(i12 >>> 16) & 255];
            jArr[i10] = (i13 & BodyPartID.bodyIdMax) | (((r11[i12 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16))) << 32);
        }
    }

    private static long mixColumn(long j10) {
        long jMulX = mulX(j10);
        long jRotate = rotate(8, j10) ^ j10;
        long jRotate2 = (jRotate ^ rotate(16, jRotate)) ^ rotate(48, j10);
        return ((rotate(32, mulX2((j10 ^ jRotate2) ^ jMulX)) ^ jRotate2) ^ rotate(40, jMulX)) ^ rotate(48, jMulX);
    }

    private static long mixColumnInv(long j10) {
        long jRotate = rotate(8, j10) ^ j10;
        long jRotate2 = (jRotate ^ rotate(32, jRotate)) ^ rotate(48, j10);
        long j11 = jRotate2 ^ j10;
        long jRotate3 = rotate(48, j10);
        long jRotate4 = rotate(56, j10);
        long jMulX = mulX(j11 ^ jRotate4) ^ rotate(56, j11);
        long jMulX2 = mulX(rotate(40, mulX(jMulX) ^ j10) ^ (rotate(16, j11) ^ j10)) ^ (j11 ^ jRotate3);
        return mulX(rotate(40, ((j10 ^ rotate(32, j11)) ^ jRotate4) ^ mulX(((jRotate3 ^ (rotate(24, j10) ^ j11)) ^ jRotate4) ^ mulX(mulX(jMulX2) ^ rotate(16, jRotate2))))) ^ jRotate2;
    }

    private void mixColumns() {
        for (int i10 = 0; i10 < this.wordsInBlock; i10++) {
            long[] jArr = this.internalState;
            jArr[i10] = mixColumn(jArr[i10]);
        }
    }

    private void mixColumnsInv() {
        for (int i10 = 0; i10 < this.wordsInBlock; i10++) {
            long[] jArr = this.internalState;
            jArr[i10] = mixColumnInv(jArr[i10]);
        }
    }

    private static long mulX(long j10) {
        return (((j10 & (-9187201950435737472L)) >>> 7) * 29) ^ ((9187201950435737471L & j10) << 1);
    }

    private static long mulX2(long j10) {
        return (((j10 & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j10) << 2) ^ ((((-9187201950435737472L) & j10) >>> 6) * 29));
    }

    private static long rotate(int i10, long j10) {
        return (j10 << (-i10)) | (j10 >>> i10);
    }

    private void rotateLeft(long[] jArr, long[] jArr2) {
        int i10 = this.wordsInBlock;
        if (i10 == 2) {
            long j10 = jArr[0];
            long j11 = jArr[1];
            jArr2[0] = (j10 >>> 56) | (j11 << 8);
            jArr2[1] = (j10 << 8) | (j11 >>> 56);
            return;
        }
        if (i10 == 4) {
            long j12 = jArr[0];
            long j13 = jArr[1];
            long j14 = jArr[2];
            long j15 = jArr[3];
            jArr2[0] = (j13 >>> 24) | (j14 << 40);
            jArr2[1] = (j14 >>> 24) | (j15 << 40);
            jArr2[2] = (j15 >>> 24) | (j12 << 40);
            jArr2[3] = (j12 >>> 24) | (j13 << 40);
            return;
        }
        if (i10 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long j16 = jArr[0];
        long j17 = jArr[1];
        long j18 = jArr[2];
        long j19 = jArr[3];
        long j20 = jArr[4];
        long j21 = jArr[5];
        long j22 = jArr[6];
        long j23 = jArr[7];
        jArr2[0] = (j18 >>> 24) | (j19 << 40);
        jArr2[1] = (j19 >>> 24) | (j20 << 40);
        jArr2[2] = (j20 >>> 24) | (j21 << 40);
        jArr2[3] = (j21 >>> 24) | (j22 << 40);
        jArr2[4] = (j22 >>> 24) | (j23 << 40);
        jArr2[5] = (j23 >>> 24) | (j16 << 40);
        jArr2[6] = (j16 >>> 24) | (j17 << 40);
        jArr2[7] = (j17 >>> 24) | (j18 << 40);
    }

    private void shiftRows() {
        int i10 = this.wordsInBlock;
        if (i10 == 2) {
            long[] jArr = this.internalState;
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = (-4294967296L) & (j10 ^ j11);
            jArr[0] = j10 ^ j12;
            jArr[1] = j12 ^ j11;
            return;
        }
        if (i10 == 4) {
            long[] jArr2 = this.internalState;
            long j13 = jArr2[0];
            long j14 = jArr2[1];
            long j15 = jArr2[2];
            long j16 = jArr2[3];
            long j17 = (j13 ^ j15) & (-4294967296L);
            long j18 = j13 ^ j17;
            long j19 = j15 ^ j17;
            long j20 = (j14 ^ j16) & 281474976645120L;
            long j21 = j14 ^ j20;
            long j22 = j16 ^ j20;
            long j23 = (j18 ^ j21) & (-281470681808896L);
            long j24 = (j19 ^ j22) & (-281470681808896L);
            jArr2[0] = j18 ^ j23;
            jArr2[1] = j21 ^ j23;
            jArr2[2] = j19 ^ j24;
            jArr2[3] = j22 ^ j24;
            return;
        }
        if (i10 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.internalState;
        long j25 = jArr3[0];
        long j26 = jArr3[1];
        long j27 = jArr3[2];
        long j28 = jArr3[3];
        long j29 = jArr3[4];
        long j30 = jArr3[5];
        long j31 = jArr3[6];
        long j32 = jArr3[7];
        long j33 = (j25 ^ j29) & (-4294967296L);
        long j34 = j25 ^ j33;
        long j35 = j29 ^ j33;
        long j36 = (j26 ^ j30) & 72057594021150720L;
        long j37 = j26 ^ j36;
        long j38 = j30 ^ j36;
        long j39 = (j27 ^ j31) & 281474976645120L;
        long j40 = j27 ^ j39;
        long j41 = j31 ^ j39;
        long j42 = (j28 ^ j32) & 1099511627520L;
        long j43 = j28 ^ j42;
        long j44 = j32 ^ j42;
        long j45 = (j34 ^ j40) & (-281470681808896L);
        long j46 = j34 ^ j45;
        long j47 = j40 ^ j45;
        long j48 = (j37 ^ j43) & 72056494543077120L;
        long j49 = j37 ^ j48;
        long j50 = j43 ^ j48;
        long j51 = (j35 ^ j41) & (-281470681808896L);
        long j52 = j35 ^ j51;
        long j53 = j41 ^ j51;
        long j54 = (j38 ^ j44) & 72056494543077120L;
        long j55 = j38 ^ j54;
        long j56 = j44 ^ j54;
        long j57 = (j46 ^ j49) & (-71777214294589696L);
        long j58 = j46 ^ j57;
        long j59 = j49 ^ j57;
        long j60 = (j47 ^ j50) & (-71777214294589696L);
        long j61 = j47 ^ j60;
        long j62 = j50 ^ j60;
        long j63 = (j52 ^ j55) & (-71777214294589696L);
        long j64 = j52 ^ j63;
        long j65 = j55 ^ j63;
        long j66 = (j53 ^ j56) & (-71777214294589696L);
        jArr3[0] = j58;
        jArr3[1] = j59;
        jArr3[2] = j61;
        jArr3[3] = j62;
        jArr3[4] = j64;
        jArr3[5] = j65;
        jArr3[6] = j53 ^ j66;
        jArr3[7] = j56 ^ j66;
    }

    private void subBytes() {
        for (int i10 = 0; i10 < this.wordsInBlock; i10++) {
            long[] jArr = this.internalState;
            long j10 = jArr[i10];
            int i11 = (int) j10;
            int i12 = (int) (j10 >>> 32);
            byte[] bArr = S0;
            byte b10 = bArr[i11 & 255];
            byte[] bArr2 = S1;
            byte b11 = bArr2[(i11 >>> 8) & 255];
            byte[] bArr3 = S2;
            byte b12 = bArr3[(i11 >>> 16) & 255];
            int i13 = (S3[i11 >>> 24] << 24) | (b10 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
            byte b13 = bArr[i12 & 255];
            byte b14 = bArr2[(i12 >>> 8) & 255];
            byte b15 = bArr3[(i12 >>> 16) & 255];
            jArr[i10] = (i13 & BodyPartID.bodyIdMax) | (((r11[i12 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16))) << 32);
        }
    }

    private void subRoundKey(int i10) {
        long[] jArr = this.roundKeys[i10];
        for (int i11 = 0; i11 < this.wordsInBlock; i11++) {
            long[] jArr2 = this.internalState;
            jArr2[i11] = jArr2[i11] - jArr[i11];
        }
    }

    private void workingKeyExpandEven(long[] jArr, long[] jArr2) {
        int i10;
        int i11;
        int i12 = this.wordsInKey;
        long[] jArr3 = new long[i12];
        long[] jArr4 = new long[this.wordsInBlock];
        System.arraycopy(jArr, 0, jArr3, 0, i12);
        long j10 = 281479271743489L;
        int i13 = 0;
        while (true) {
            for (int i14 = 0; i14 < this.wordsInBlock; i14++) {
                jArr4[i14] = jArr2[i14] + j10;
            }
            for (int i15 = 0; i15 < this.wordsInBlock; i15++) {
                this.internalState[i15] = jArr3[i15] + jArr4[i15];
            }
            subBytes();
            shiftRows();
            mixColumns();
            for (int i16 = 0; i16 < this.wordsInBlock; i16++) {
                long[] jArr5 = this.internalState;
                jArr5[i16] = jArr5[i16] ^ jArr4[i16];
            }
            subBytes();
            shiftRows();
            mixColumns();
            int i17 = 0;
            while (true) {
                i10 = this.wordsInBlock;
                if (i17 >= i10) {
                    break;
                }
                long[] jArr6 = this.internalState;
                jArr6[i17] = jArr6[i17] + jArr4[i17];
                i17++;
            }
            System.arraycopy(this.internalState, 0, this.roundKeys[i13], 0, i10);
            if (this.roundsAmount == i13) {
                return;
            }
            if (this.wordsInBlock != this.wordsInKey) {
                i13 += 2;
                j10 <<= 1;
                for (int i18 = 0; i18 < this.wordsInBlock; i18++) {
                    jArr4[i18] = jArr2[i18] + j10;
                }
                int i19 = 0;
                while (true) {
                    int i20 = this.wordsInBlock;
                    if (i19 >= i20) {
                        break;
                    }
                    this.internalState[i19] = jArr3[i20 + i19] + jArr4[i19];
                    i19++;
                }
                subBytes();
                shiftRows();
                mixColumns();
                for (int i21 = 0; i21 < this.wordsInBlock; i21++) {
                    long[] jArr7 = this.internalState;
                    jArr7[i21] = jArr7[i21] ^ jArr4[i21];
                }
                subBytes();
                shiftRows();
                mixColumns();
                int i22 = 0;
                while (true) {
                    i11 = this.wordsInBlock;
                    if (i22 >= i11) {
                        break;
                    }
                    long[] jArr8 = this.internalState;
                    jArr8[i22] = jArr8[i22] + jArr4[i22];
                    i22++;
                }
                System.arraycopy(this.internalState, 0, this.roundKeys[i13], 0, i11);
                if (this.roundsAmount == i13) {
                    return;
                }
            }
            i13 += 2;
            j10 <<= 1;
            long j11 = jArr3[0];
            for (int i23 = 1; i23 < i12; i23++) {
                jArr3[i23 - 1] = jArr3[i23];
            }
            jArr3[i12 - 1] = j11;
        }
    }

    private void workingKeyExpandKT(long[] jArr, long[] jArr2) {
        int i10 = this.wordsInBlock;
        long[] jArr3 = new long[i10];
        long[] jArr4 = new long[i10];
        long[] jArr5 = new long[i10];
        this.internalState = jArr5;
        long j10 = jArr5[0];
        int i11 = this.wordsInKey;
        jArr5[0] = j10 + i10 + i11 + 1;
        System.arraycopy(jArr, 0, jArr3, 0, i10);
        if (i10 == i11) {
            System.arraycopy(jArr, 0, jArr4, 0, i10);
        } else {
            int i12 = this.wordsInBlock;
            System.arraycopy(jArr, i12, jArr4, 0, i12);
        }
        int i13 = 0;
        while (true) {
            long[] jArr6 = this.internalState;
            if (i13 >= jArr6.length) {
                break;
            }
            jArr6[i13] = jArr6[i13] + jArr3[i13];
            i13++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i14 = 0;
        while (true) {
            long[] jArr7 = this.internalState;
            if (i14 >= jArr7.length) {
                break;
            }
            jArr7[i14] = jArr7[i14] ^ jArr4[i14];
            i14++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i15 = 0;
        while (true) {
            long[] jArr8 = this.internalState;
            if (i15 >= jArr8.length) {
                subBytes();
                shiftRows();
                mixColumns();
                System.arraycopy(this.internalState, 0, jArr2, 0, this.wordsInBlock);
                return;
            }
            jArr8[i15] = jArr8[i15] + jArr3[i15];
            i15++;
        }
    }

    private void workingKeyExpandOdd() {
        for (int i10 = 1; i10 < this.roundsAmount; i10 += 2) {
            long[][] jArr = this.roundKeys;
            rotateLeft(jArr[i10 - 1], jArr[i10]);
        }
    }

    private void xorRoundKey(int i10) {
        long[] jArr = this.roundKeys[i10];
        for (int i11 = 0; i11 < this.wordsInBlock; i11++) {
            long[] jArr2 = this.internalState;
            jArr2[i11] = jArr2[i11] ^ jArr[i11];
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DSTU7624";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.wordsInBlock << 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[LOOP:0: B:26:0x0086->B:28:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[EDGE_INSN: B:37:0x0094->B:29:0x0094 BREAK  A[LOOP:0: B:26:0x0086->B:28:0x008b], SYNTHETIC] */
    @Override // org.bouncycastle.crypto.BlockCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        DefaultServiceProperties defaultServiceProperties;
        int i10;
        long[][] jArr;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to DSTU7624Engine init");
        }
        this.forEncryption = z10;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length << 3;
        int i11 = this.wordsInBlock << 6;
        if (length != 128 && length != 256 && length != 512) {
            throw new IllegalArgumentException("unsupported key length: only 128/256/512 are allowed");
        }
        if (length != i11 && length != i11 * 2) {
            throw new IllegalArgumentException("Unsupported key length");
        }
        if (length == 128) {
            this.roundsAmount = 10;
            defaultServiceProperties = new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10));
        } else {
            if (length != 256) {
                if (length == 512) {
                    this.roundsAmount = 18;
                    defaultServiceProperties = new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z10));
                }
                this.wordsInKey = length >>> 6;
                this.roundKeys = new long[this.roundsAmount + 1][];
                i10 = 0;
                while (true) {
                    jArr = this.roundKeys;
                    if (i10 < jArr.length) {
                        break;
                    }
                    jArr[i10] = new long[this.wordsInBlock];
                    i10++;
                }
                long[] jArr2 = new long[this.wordsInKey];
                this.workingKey = jArr2;
                if (key.length == (length >>> 3)) {
                    throw new IllegalArgumentException("Invalid key parameter passed to DSTU7624Engine init");
                }
                Pack.littleEndianToLong(key, 0, jArr2);
                long[] jArr3 = new long[this.wordsInBlock];
                workingKeyExpandKT(this.workingKey, jArr3);
                workingKeyExpandEven(this.workingKey, jArr3);
                workingKeyExpandOdd();
                return;
            }
            this.roundsAmount = 14;
            defaultServiceProperties = new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z10));
        }
        CryptoServicesRegistrar.checkConstraints(defaultServiceProperties);
        this.wordsInKey = length >>> 6;
        this.roundKeys = new long[this.roundsAmount + 1][];
        i10 = 0;
        while (true) {
            jArr = this.roundKeys;
            if (i10 < jArr.length) {
            }
            jArr[i10] = new long[this.wordsInBlock];
            i10++;
        }
        long[] jArr22 = new long[this.wordsInKey];
        this.workingKey = jArr22;
        if (key.length == (length >>> 3)) {
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12;
        if (this.workingKey == null) {
            throw new IllegalStateException("DSTU7624Engine not initialised");
        }
        if (getBlockSize() + i10 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (getBlockSize() + i11 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i13 = 0;
        if (this.forEncryption) {
            if (this.wordsInBlock != 2) {
                Pack.littleEndianToLong(bArr, i10, this.internalState);
                addRoundKey(0);
                while (true) {
                    subBytes();
                    shiftRows();
                    mixColumns();
                    i13++;
                    i12 = this.roundsAmount;
                    if (i13 == i12) {
                        break;
                    }
                    xorRoundKey(i13);
                }
                addRoundKey(i12);
                Pack.longToLittleEndian(this.internalState, bArr2, i11);
            } else {
                encryptBlock_128(bArr, i10, bArr2, i11);
            }
        } else if (this.wordsInBlock != 2) {
            Pack.littleEndianToLong(bArr, i10, this.internalState);
            subRoundKey(this.roundsAmount);
            int i14 = this.roundsAmount;
            while (true) {
                mixColumnsInv();
                invShiftRows();
                invSubBytes();
                i14--;
                if (i14 == 0) {
                    break;
                }
                xorRoundKey(i14);
            }
            subRoundKey(0);
            Pack.longToLittleEndian(this.internalState, bArr2, i11);
        } else {
            decryptBlock_128(bArr, i10, bArr2, i11);
        }
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.internalState, 0L);
    }
}
