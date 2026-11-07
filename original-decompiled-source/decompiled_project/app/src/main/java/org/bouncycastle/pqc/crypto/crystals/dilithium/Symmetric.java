package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes3.dex */
abstract class Symmetric {
    final int stream128BlockBytes;
    final int stream256BlockBytes;

    @Deprecated
    public static class AesSymmetric extends Symmetric {
        private final StreamCipher cipher;

        public AesSymmetric() {
            super(64, 64);
            this.cipher = SICBlockCipher.newInstance(AESEngine.newInstance());
        }

        private void aes128(byte[] bArr, int i10, int i11) throws DataLengthException {
            this.cipher.processBytes(new byte[i11], 0, i11, bArr, i10);
        }

        private void streamInit(byte[] bArr, short s10) throws IllegalArgumentException {
            byte[] bArr2 = new byte[12];
            bArr2[0] = (byte) s10;
            bArr2[1] = (byte) (s10 >> 8);
            this.cipher.init(true, new ParametersWithIV(new KeyParameter(bArr, 0, 32), bArr2));
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream128init(byte[] bArr, short s10) throws IllegalArgumentException {
            streamInit(bArr, s10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream128squeezeBlocks(byte[] bArr, int i10, int i11) throws DataLengthException {
            aes128(bArr, i10, i11);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream256init(byte[] bArr, short s10) throws IllegalArgumentException {
            streamInit(bArr, s10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream256squeezeBlocks(byte[] bArr, int i10, int i11) throws DataLengthException {
            aes128(bArr, i10, i11);
        }
    }

    public static class ShakeSymmetric extends Symmetric {
        private final SHAKEDigest digest128;
        private final SHAKEDigest digest256;

        public ShakeSymmetric() {
            super(168, 136);
            this.digest128 = new SHAKEDigest(128);
            this.digest256 = new SHAKEDigest(256);
        }

        private void streamInit(SHAKEDigest sHAKEDigest, byte[] bArr, short s10) {
            sHAKEDigest.reset();
            sHAKEDigest.update(bArr, 0, bArr.length);
            sHAKEDigest.update(new byte[]{(byte) s10, (byte) (s10 >> 8)}, 0, 2);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream128init(byte[] bArr, short s10) {
            streamInit(this.digest128, bArr, s10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream128squeezeBlocks(byte[] bArr, int i10, int i11) {
            this.digest128.doOutput(bArr, i10, i11);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream256init(byte[] bArr, short s10) {
            streamInit(this.digest256, bArr, s10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream256squeezeBlocks(byte[] bArr, int i10, int i11) {
            this.digest256.doOutput(bArr, i10, i11);
        }
    }

    public Symmetric(int i10, int i11) {
        this.stream128BlockBytes = i10;
        this.stream256BlockBytes = i11;
    }

    public abstract void stream128init(byte[] bArr, short s10);

    public abstract void stream128squeezeBlocks(byte[] bArr, int i10, int i11);

    public abstract void stream256init(byte[] bArr, short s10);

    public abstract void stream256squeezeBlocks(byte[] bArr, int i10, int i11);
}
