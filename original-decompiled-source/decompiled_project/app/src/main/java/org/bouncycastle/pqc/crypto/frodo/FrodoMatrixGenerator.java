package org.bouncycastle.pqc.crypto.frodo;

import ad.k;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
abstract class FrodoMatrixGenerator {

    /* renamed from: n, reason: collision with root package name */
    int f20347n;

    /* renamed from: q, reason: collision with root package name */
    int f20348q;

    public static class Aes128MatrixGenerator extends FrodoMatrixGenerator {
        public Aes128MatrixGenerator(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        public short[] genMatrix(byte[] bArr) throws IllegalStateException, DataLengthException, IllegalArgumentException {
            int i10 = this.f20347n;
            short[] sArr = new short[i10 * i10];
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            AESEngine aESEngine = new AESEngine();
            aESEngine.init(true, new KeyParameter(bArr));
            for (int i11 = 0; i11 < this.f20347n; i11++) {
                Pack.shortToLittleEndian((short) i11, bArr2, 0);
                for (int i12 = 0; i12 < this.f20347n; i12 += 8) {
                    Pack.shortToLittleEndian((short) i12, bArr2, 2);
                    aESEngine.processBlock(bArr2, 0, bArr3, 0);
                    for (int i13 = 0; i13 < 8; i13++) {
                        sArr[k.b(i11, this.f20347n, i12, i13)] = (short) (Pack.littleEndianToShort(bArr3, i13 * 2) & (this.f20348q - 1));
                    }
                }
            }
            return sArr;
        }
    }

    public static class Shake128MatrixGenerator extends FrodoMatrixGenerator {
        public Shake128MatrixGenerator(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        public short[] genMatrix(byte[] bArr) {
            int i10 = this.f20347n;
            short[] sArr = new short[i10 * i10];
            int i11 = (i10 * 16) / 8;
            byte[] bArr2 = new byte[i11];
            int length = bArr.length + 2;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
            SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
            for (short s10 = 0; s10 < this.f20347n; s10 = (short) (s10 + 1)) {
                Pack.shortToLittleEndian(s10, bArr3, 0);
                sHAKEDigest.update(bArr3, 0, length);
                sHAKEDigest.doFinal(bArr2, 0, i11);
                short s11 = 0;
                while (true) {
                    int i12 = this.f20347n;
                    if (s11 < i12) {
                        sArr[(i12 * s10) + s11] = (short) (Pack.littleEndianToShort(bArr2, s11 * 2) & (this.f20348q - 1));
                        s11 = (short) (s11 + 1);
                    }
                }
            }
            return sArr;
        }
    }

    public FrodoMatrixGenerator(int i10, int i11) {
        this.f20347n = i10;
        this.f20348q = i11;
    }

    public abstract short[] genMatrix(byte[] bArr);
}
