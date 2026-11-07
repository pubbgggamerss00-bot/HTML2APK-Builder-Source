package org.bouncycastle.cert.selector;

import java.io.IOException;
import m.a;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
class MSOutlookKeyIdCalculator {

    public static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        public GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        public void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        public void finish() {
            long j10 = this.byteCount << 3;
            byte b10 = Byte.MIN_VALUE;
            while (true) {
                update(b10);
                if (this.xBufOff == 0) {
                    processLength(j10);
                    processBlock();
                    return;
                }
                b10 = 0;
            }
        }

        public abstract void processBlock();

        public abstract void processLength(long j10);

        public abstract void processWord(byte[] bArr, int i10);

        public void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i10 = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i10 >= bArr.length) {
                    return;
                }
                bArr[i10] = 0;
                i10++;
            }
        }

        public void update(byte b10) {
            byte[] bArr = this.xBuf;
            int i10 = this.xBufOff;
            int i11 = i10 + 1;
            this.xBufOff = i11;
            bArr[i10] = b10;
            if (i11 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }

        public GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        public void update(byte[] bArr, int i10, int i11) {
            while (this.xBufOff != 0 && i11 > 0) {
                update(bArr[i10]);
                i10++;
                i11--;
            }
            while (i11 > this.xBuf.length) {
                processWord(bArr, i10);
                byte[] bArr2 = this.xBuf;
                i10 += bArr2.length;
                i11 -= bArr2.length;
                this.byteCount += bArr2.length;
            }
            while (i11 > 0) {
                update(bArr[i10]);
                i10++;
                i11--;
            }
        }
    }

    public static class SHA1Digest extends GeneralDigest {
        private static final int DIGEST_LENGTH = 20;
        private static final int Y1 = 1518500249;
        private static final int Y2 = 1859775393;
        private static final int Y3 = -1894007588;
        private static final int Y4 = -899497514;
        private int H1;
        private int H2;
        private int H3;
        private int H4;
        private int H5;
        private int[] X = new int[80];
        private int xOff;

        public SHA1Digest() {
            reset();
        }

        private int f(int i10, int i11, int i12) {
            return ((~i10) & i12) | (i11 & i10);
        }

        private int g(int i10, int i11, int i12) {
            return (i10 & (i11 | i12)) | (i11 & i12);
        }

        private int h(int i10, int i11, int i12) {
            return (i10 ^ i11) ^ i12;
        }

        public int doFinal(byte[] bArr, int i10) {
            finish();
            Pack.intToBigEndian(this.H1, bArr, i10);
            Pack.intToBigEndian(this.H2, bArr, i10 + 4);
            Pack.intToBigEndian(this.H3, bArr, i10 + 8);
            Pack.intToBigEndian(this.H4, bArr, i10 + 12);
            Pack.intToBigEndian(this.H5, bArr, i10 + 16);
            reset();
            return 20;
        }

        public String getAlgorithmName() {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }

        public int getDigestSize() {
            return 20;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processBlock() {
            for (int i10 = 16; i10 < 80; i10++) {
                int[] iArr = this.X;
                int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
                iArr[i10] = (i11 >>> 31) | (i11 << 1);
            }
            int iA = this.H1;
            int iA2 = this.H2;
            int i12 = this.H3;
            int i13 = this.H4;
            int i14 = this.H5;
            int i15 = 0;
            for (int i16 = 0; i16 < 4; i16++) {
                int iA3 = a.a(((iA << 5) | (iA >>> 27)) + f(iA2, i12, i13), this.X[i15], Y1, i14);
                int i17 = (iA2 >>> 2) | (iA2 << 30);
                int iA4 = a.a(((iA3 << 5) | (iA3 >>> 27)) + f(iA, i17, i12), this.X[i15 + 1], Y1, i13);
                int i18 = (iA >>> 2) | (iA << 30);
                int iA5 = a.a(((iA4 << 5) | (iA4 >>> 27)) + f(iA3, i18, i17), this.X[i15 + 2], Y1, i12);
                i14 = (iA3 >>> 2) | (iA3 << 30);
                int i19 = i15 + 4;
                iA2 = a.a(((iA5 << 5) | (iA5 >>> 27)) + f(iA4, i14, i18), this.X[i15 + 3], Y1, i17);
                i13 = (iA4 >>> 2) | (iA4 << 30);
                i15 += 5;
                iA = a.a(((iA2 << 5) | (iA2 >>> 27)) + f(iA5, i13, i14), this.X[i19], Y1, i18);
                i12 = (iA5 >>> 2) | (iA5 << 30);
            }
            for (int i20 = 0; i20 < 4; i20++) {
                int iA6 = a.a(((iA << 5) | (iA >>> 27)) + h(iA2, i12, i13), this.X[i15], Y2, i14);
                int i21 = (iA2 >>> 2) | (iA2 << 30);
                int iA7 = a.a(((iA6 << 5) | (iA6 >>> 27)) + h(iA, i21, i12), this.X[i15 + 1], Y2, i13);
                int i22 = (iA >>> 2) | (iA << 30);
                int iA8 = a.a(((iA7 << 5) | (iA7 >>> 27)) + h(iA6, i22, i21), this.X[i15 + 2], Y2, i12);
                i14 = (iA6 >>> 2) | (iA6 << 30);
                int i23 = i15 + 4;
                iA2 = a.a(((iA8 << 5) | (iA8 >>> 27)) + h(iA7, i14, i22), this.X[i15 + 3], Y2, i21);
                i13 = (iA7 >>> 2) | (iA7 << 30);
                i15 += 5;
                iA = a.a(((iA2 << 5) | (iA2 >>> 27)) + h(iA8, i13, i14), this.X[i23], Y2, i22);
                i12 = (iA8 >>> 2) | (iA8 << 30);
            }
            for (int i24 = 0; i24 < 4; i24++) {
                int iA9 = a.a(((iA << 5) | (iA >>> 27)) + g(iA2, i12, i13), this.X[i15], Y3, i14);
                int i25 = (iA2 >>> 2) | (iA2 << 30);
                int iA10 = a.a(((iA9 << 5) | (iA9 >>> 27)) + g(iA, i25, i12), this.X[i15 + 1], Y3, i13);
                int i26 = (iA >>> 2) | (iA << 30);
                int iA11 = a.a(((iA10 << 5) | (iA10 >>> 27)) + g(iA9, i26, i25), this.X[i15 + 2], Y3, i12);
                i14 = (iA9 >>> 2) | (iA9 << 30);
                int i27 = i15 + 4;
                iA2 = a.a(((iA11 << 5) | (iA11 >>> 27)) + g(iA10, i14, i26), this.X[i15 + 3], Y3, i25);
                i13 = (iA10 >>> 2) | (iA10 << 30);
                i15 += 5;
                iA = a.a(((iA2 << 5) | (iA2 >>> 27)) + g(iA11, i13, i14), this.X[i27], Y3, i26);
                i12 = (iA11 >>> 2) | (iA11 << 30);
            }
            for (int i28 = 0; i28 <= 3; i28++) {
                int iA12 = a.a(((iA << 5) | (iA >>> 27)) + h(iA2, i12, i13), this.X[i15], Y4, i14);
                int i29 = (iA2 >>> 2) | (iA2 << 30);
                int iA13 = a.a(((iA12 << 5) | (iA12 >>> 27)) + h(iA, i29, i12), this.X[i15 + 1], Y4, i13);
                int i30 = (iA >>> 2) | (iA << 30);
                int iA14 = a.a(((iA13 << 5) | (iA13 >>> 27)) + h(iA12, i30, i29), this.X[i15 + 2], Y4, i12);
                i14 = (iA12 >>> 2) | (iA12 << 30);
                int i31 = i15 + 4;
                iA2 = a.a(((iA14 << 5) | (iA14 >>> 27)) + h(iA13, i14, i30), this.X[i15 + 3], Y4, i29);
                i13 = (iA13 >>> 2) | (iA13 << 30);
                i15 += 5;
                iA = a.a(((iA2 << 5) | (iA2 >>> 27)) + h(iA14, i13, i14), this.X[i31], Y4, i30);
                i12 = (iA14 >>> 2) | (iA14 << 30);
            }
            this.H1 += iA;
            this.H2 += iA2;
            this.H3 += i12;
            this.H4 += i13;
            this.H5 += i14;
            this.xOff = 0;
            for (int i32 = 0; i32 < 16; i32++) {
                this.X[i32] = 0;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processLength(long j10) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j10 >>> 32);
            iArr[15] = (int) j10;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processWord(byte[] bArr, int i10) {
            int i11 = (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
            int[] iArr = this.X;
            int i12 = this.xOff;
            iArr[i12] = i11;
            int i13 = i12 + 1;
            this.xOff = i13;
            if (i13 == 16) {
                processBlock();
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void reset() {
            super.reset();
            this.H1 = 1732584193;
            this.H2 = -271733879;
            this.H3 = -1732584194;
            this.H4 = 271733878;
            this.H5 = -1009589776;
            this.xOff = 0;
            int i10 = 0;
            while (true) {
                int[] iArr = this.X;
                if (i10 == iArr.length) {
                    return;
                }
                iArr[i10] = 0;
                i10++;
            }
        }
    }

    public static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded(ASN1Encoding.DER);
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
