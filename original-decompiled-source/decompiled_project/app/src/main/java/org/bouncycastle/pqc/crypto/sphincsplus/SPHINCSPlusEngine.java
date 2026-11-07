package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.generators.MGF1BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.MGFParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
abstract class SPHINCSPlusEngine {
    final int A;
    final int D;
    final int H;
    final int H_PRIME;
    final int K;
    final int N;
    final int T;
    final int WOTS_LEN;
    final int WOTS_LEN1;
    final int WOTS_LEN2;
    final int WOTS_LOGW;
    final int WOTS_W;

    @Deprecated
    final boolean robust;

    public static class HarakaSEngine extends SPHINCSPlusEngine {
        private HarakaS256Digest harakaS256Digest;
        private HarakaS512Digest harakaS512Digest;
        private HarakaSXof harakaSXof;

        public HarakaSEngine(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15) {
            super(z10, i10, i11, i12, i13, i14, i15);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] bArr3 = new byte[32];
            HarakaS512Digest harakaS512Digest = this.harakaS512Digest;
            byte[] bArr4 = adrs.value;
            harakaS512Digest.update(bArr4, 0, bArr4.length);
            if (this.robust) {
                HarakaS256Digest harakaS256Digest = this.harakaS256Digest;
                byte[] bArr5 = adrs.value;
                harakaS256Digest.update(bArr5, 0, bArr5.length);
                this.harakaS256Digest.doFinal(bArr3, 0);
                Bytes.xorTo(bArr2.length, bArr2, bArr3);
                this.harakaS512Digest.update(bArr3, 0, bArr2.length);
            } else {
                this.harakaS512Digest.update(bArr2, 0, bArr2.length);
            }
            this.harakaS512Digest.doFinal(bArr3, 0);
            return Arrays.copyOf(bArr3, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int i10 = this.N;
            byte[] bArr4 = new byte[i10];
            byte[] bArr5 = new byte[bArr2.length + bArr3.length];
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
            System.arraycopy(bArr3, 0, bArr5, bArr2.length, bArr3.length);
            byte[] bArrBitmask = bitmask(adrs, bArr5);
            HarakaSXof harakaSXof = this.harakaSXof;
            byte[] bArr6 = adrs.value;
            harakaSXof.update(bArr6, 0, bArr6.length);
            this.harakaSXof.update(bArrBitmask, 0, bArrBitmask.length);
            this.harakaSXof.doFinal(bArr4, 0, i10);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            int i10 = ((this.A * this.K) + 7) >> 3;
            int i11 = this.H;
            int i12 = i11 / this.D;
            int i13 = i11 - i12;
            int i14 = (i12 + 7) >> 3;
            int i15 = (i13 + 7) >> 3;
            int i16 = i10 + i14 + i15;
            byte[] bArr5 = new byte[i16];
            this.harakaSXof.update(bArr, 0, bArr.length);
            this.harakaSXof.update(bArr3, 0, bArr3.length);
            this.harakaSXof.update(bArr4, 0, bArr4.length);
            this.harakaSXof.doFinal(bArr5, 0, i16);
            byte[] bArr6 = new byte[8];
            System.arraycopy(bArr5, i10, bArr6, 8 - i15, i15);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr6, 0) & ((-1) >>> (64 - i13));
            byte[] bArr7 = new byte[4];
            System.arraycopy(bArr5, i15 + i10, bArr7, 4 - i14, i14);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr7, 0) & ((-1) >>> (32 - i12)), Arrays.copyOfRange(bArr5, 0, i10));
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            byte[] bArr3 = new byte[32];
            HarakaS512Digest harakaS512Digest = this.harakaS512Digest;
            byte[] bArr4 = adrs.value;
            harakaS512Digest.update(bArr4, 0, bArr4.length);
            this.harakaS512Digest.update(bArr2, 0, bArr2.length);
            this.harakaS512Digest.doFinal(bArr3, 0);
            return Arrays.copyOf(bArr3, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            int i10 = this.N;
            byte[] bArr4 = new byte[i10];
            this.harakaSXof.update(bArr, 0, bArr.length);
            this.harakaSXof.update(bArr2, 0, bArr2.length);
            this.harakaSXof.update(bArr3, 0, bArr3.length);
            this.harakaSXof.doFinal(bArr4, 0, i10);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int i10 = this.N;
            byte[] bArr3 = new byte[i10];
            byte[] bArrBitmask = bitmask(adrs, bArr2);
            HarakaSXof harakaSXof = this.harakaSXof;
            byte[] bArr4 = adrs.value;
            harakaSXof.update(bArr4, 0, bArr4.length);
            this.harakaSXof.update(bArrBitmask, 0, bArrBitmask.length);
            this.harakaSXof.doFinal(bArr3, 0, i10);
            return bArr3;
        }

        public byte[] bitmask(ADRS adrs, byte[] bArr) {
            if (this.robust) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                HarakaSXof harakaSXof = this.harakaSXof;
                byte[] bArr3 = adrs.value;
                harakaSXof.update(bArr3, 0, bArr3.length);
                this.harakaSXof.doFinal(bArr2, 0, length);
                Bytes.xorTo(bArr.length, bArr2, bArr);
            }
            return bArr;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public void init(byte[] bArr) {
            HarakaSXof harakaSXof = new HarakaSXof(bArr);
            this.harakaSXof = harakaSXof;
            this.harakaS256Digest = new HarakaS256Digest(harakaSXof);
            this.harakaS512Digest = new HarakaS512Digest(this.harakaSXof);
        }
    }

    public static class Sha2Engine extends SPHINCSPlusEngine {
        private final int bl;
        private final byte[] hmacBuf;
        private final MGF1BytesGenerator mgf1;
        private final Digest msgDigest;
        private final byte[] msgDigestBuf;
        private Memoable msgMemo;
        private final Digest sha256;
        private final byte[] sha256Buf;
        private Memoable sha256Memo;
        private final HMac treeHMac;

        public Sha2Engine(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15) {
            int i16;
            super(z10, i10, i11, i12, i13, i14, i15);
            SHA256Digest sHA256Digest = new SHA256Digest();
            this.sha256 = sHA256Digest;
            this.sha256Buf = new byte[sHA256Digest.getDigestSize()];
            if (i10 == 16) {
                this.msgDigest = new SHA256Digest();
                this.treeHMac = new HMac(new SHA256Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA256Digest());
                i16 = 64;
            } else {
                this.msgDigest = new SHA512Digest();
                this.treeHMac = new HMac(new SHA512Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA512Digest());
                i16 = 128;
            }
            this.bl = i16;
            this.hmacBuf = new byte[this.treeHMac.getMacSize()];
            this.msgDigestBuf = new byte[this.msgDigest.getDigestSize()];
        }

        private byte[] compressedADRS(ADRS adrs) {
            byte[] bArr = new byte[22];
            System.arraycopy(adrs.value, 3, bArr, 0, 1);
            System.arraycopy(adrs.value, 8, bArr, 1, 8);
            System.arraycopy(adrs.value, 19, bArr, 9, 1);
            System.arraycopy(adrs.value, 20, bArr, 10, 12);
            return bArr;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) throws DataLengthException, IllegalArgumentException {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            if (this.robust) {
                bArr2 = bitmask256(Arrays.concatenate(bArr, bArrCompressedADRS), bArr2);
            }
            ((Memoable) this.sha256).reset(this.sha256Memo);
            this.sha256.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) throws DataLengthException, IllegalArgumentException {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            if (this.robust) {
                byte[] bArrBitmask = bitmask(Arrays.concatenate(bArr, bArrCompressedADRS), bArr2, bArr3);
                this.msgDigest.update(bArrBitmask, 0, bArrBitmask.length);
            } else {
                this.msgDigest.update(bArr2, 0, bArr2.length);
                this.msgDigest.update(bArr3, 0, bArr3.length);
            }
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws DataLengthException, IllegalArgumentException {
            int i10 = ((this.A * this.K) + 7) / 8;
            int i11 = this.H;
            int i12 = i11 / this.D;
            int i13 = i11 - i12;
            int i14 = (i12 + 7) / 8;
            int i15 = (i13 + 7) / 8;
            byte[] bArr5 = new byte[this.msgDigest.getDigestSize()];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.update(bArr3, 0, bArr3.length);
            this.msgDigest.update(bArr4, 0, bArr4.length);
            this.msgDigest.doFinal(bArr5, 0);
            byte[] bArrBitmask = bitmask(Arrays.concatenate(bArr, bArr2, bArr5), new byte[i10 + i14 + i15]);
            byte[] bArr6 = new byte[8];
            System.arraycopy(bArrBitmask, i10, bArr6, 8 - i15, i15);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr6, 0) & ((-1) >>> (64 - i13));
            byte[] bArr7 = new byte[4];
            System.arraycopy(bArrBitmask, i15 + i10, bArr7, 4 - i14, i14);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr7, 0) & ((-1) >>> (32 - i12)), Arrays.copyOfRange(bArrBitmask, 0, i10));
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            int length = bArr2.length;
            ((Memoable) this.sha256).reset(this.sha256Memo);
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            this.sha256.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, length);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.treeHMac.init(new KeyParameter(bArr));
            this.treeHMac.update(bArr2, 0, bArr2.length);
            this.treeHMac.update(bArr3, 0, bArr3.length);
            this.treeHMac.doFinal(this.hmacBuf, 0);
            return Arrays.copyOfRange(this.hmacBuf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) throws DataLengthException, IllegalArgumentException {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            if (this.robust) {
                bArr2 = bitmask(Arrays.concatenate(bArr, bArrCompressedADRS), bArr2);
            }
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.N);
        }

        public byte[] bitmask(byte[] bArr, byte[] bArr2) throws DataLengthException, IllegalArgumentException {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        public byte[] bitmask256(byte[] bArr, byte[] bArr2) throws DataLengthException, IllegalArgumentException {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(new SHA256Digest());
            mGF1BytesGenerator.init(new MGFParameters(bArr));
            mGF1BytesGenerator.generateBytes(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public void init(byte[] bArr) {
            byte[] bArr2 = new byte[this.bl];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, this.bl - this.N);
            this.msgMemo = ((Memoable) this.msgDigest).copy();
            this.msgDigest.reset();
            this.sha256.update(bArr, 0, bArr.length);
            this.sha256.update(bArr2, 0, 64 - bArr.length);
            this.sha256Memo = ((Memoable) this.sha256).copy();
            this.sha256.reset();
        }

        public byte[] bitmask(byte[] bArr, byte[] bArr2, byte[] bArr3) throws DataLengthException, IllegalArgumentException {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr4, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr4);
            Bytes.xorTo(bArr3.length, bArr3, 0, bArr4, bArr2.length);
            return bArr4;
        }
    }

    public static class Shake256Engine extends SPHINCSPlusEngine {
        private final Xof maskDigest;
        private final Xof treeDigest;

        public Shake256Engine(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15) {
            super(z10, i10, i11, i12, i13, i14, i15);
            this.treeDigest = new SHAKEDigest(256);
            this.maskDigest = new SHAKEDigest(256);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            if (this.robust) {
                bArr2 = bitmask(bArr, adrs, bArr2);
            }
            int i10 = this.N;
            byte[] bArr3 = new byte[i10];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i10);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int i10 = this.N;
            byte[] bArr4 = new byte[i10];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr5 = adrs.value;
            xof.update(bArr5, 0, bArr5.length);
            if (this.robust) {
                byte[] bArrBitmask = bitmask(bArr, adrs, bArr2, bArr3);
                this.treeDigest.update(bArrBitmask, 0, bArrBitmask.length);
            } else {
                this.treeDigest.update(bArr2, 0, bArr2.length);
                this.treeDigest.update(bArr3, 0, bArr3.length);
            }
            this.treeDigest.doFinal(bArr4, 0, i10);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            int i10 = ((this.A * this.K) + 7) / 8;
            int i11 = this.H;
            int i12 = i11 / this.D;
            int i13 = i11 - i12;
            int i14 = (i12 + 7) / 8;
            int i15 = (i13 + 7) / 8;
            int i16 = i10 + i14 + i15;
            byte[] bArr5 = new byte[i16];
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            this.treeDigest.update(bArr4, 0, bArr4.length);
            this.treeDigest.doFinal(bArr5, 0, i16);
            byte[] bArr6 = new byte[8];
            System.arraycopy(bArr5, i10, bArr6, 8 - i15, i15);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr6, 0) & ((-1) >>> (64 - i13));
            byte[] bArr7 = new byte[4];
            System.arraycopy(bArr5, i15 + i10, bArr7, 4 - i14, i14);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr7, 0) & ((-1) >>> (32 - i12)), Arrays.copyOfRange(bArr5, 0, i10));
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr3 = adrs.value;
            xof.update(bArr3, 0, bArr3.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            int i10 = this.N;
            byte[] bArr4 = new byte[i10];
            this.treeDigest.doFinal(bArr4, 0, i10);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            int i10 = this.N;
            byte[] bArr4 = new byte[i10];
            this.treeDigest.doFinal(bArr4, 0, i10);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            if (this.robust) {
                bArr2 = bitmask(bArr, adrs, bArr2);
            }
            int i10 = this.N;
            byte[] bArr3 = new byte[i10];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i10);
            return bArr3;
        }

        public byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof = this.maskDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.maskDigest.doFinal(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public void init(byte[] bArr) {
        }

        public byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof = this.maskDigest;
            byte[] bArr5 = adrs.value;
            xof.update(bArr5, 0, bArr5.length);
            this.maskDigest.doFinal(bArr4, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr4);
            Bytes.xorTo(bArr3.length, bArr3, 0, bArr4, bArr2.length);
            return bArr4;
        }
    }

    public SPHINCSPlusEngine(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.N = i10;
        if (i11 == 16) {
            this.WOTS_LOGW = 4;
            this.WOTS_LEN1 = (i10 * 8) / 4;
            if (i10 <= 8) {
                this.WOTS_LEN2 = 2;
            } else if (i10 <= 136) {
                this.WOTS_LEN2 = 3;
            } else {
                if (i10 > 256) {
                    throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                }
                this.WOTS_LEN2 = 4;
            }
        } else {
            if (i11 != 256) {
                throw new IllegalArgumentException("wots_w assumed 16 or 256");
            }
            this.WOTS_LOGW = 8;
            this.WOTS_LEN1 = (i10 * 8) / 8;
            if (i10 <= 1) {
                this.WOTS_LEN2 = 1;
            } else {
                if (i10 > 256) {
                    throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                }
                this.WOTS_LEN2 = 2;
            }
        }
        this.WOTS_W = i11;
        this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
        this.robust = z10;
        this.D = i12;
        this.A = i13;
        this.K = i14;
        this.H = i15;
        this.H_PRIME = i15 / i12;
        this.T = 1 << i13;
    }

    public abstract byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2);

    public abstract byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3);

    public abstract IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public abstract byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs);

    public abstract byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public abstract byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2);

    public abstract void init(byte[] bArr);
}
