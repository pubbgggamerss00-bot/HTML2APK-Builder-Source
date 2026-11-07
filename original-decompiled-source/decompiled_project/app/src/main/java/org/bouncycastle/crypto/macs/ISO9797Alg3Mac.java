package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class ISO9797Alg3Mac implements Mac {
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private KeyParameter lastKey2;
    private KeyParameter lastKey3;
    private byte[] mac;
    private int macSize;
    private BlockCipherPadding padding;

    public ISO9797Alg3Mac(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        int blockSize = this.cipher.getBlockSize();
        if (this.padding == null) {
            while (true) {
                int i11 = this.bufOff;
                if (i11 >= blockSize) {
                    break;
                }
                this.buf[i11] = 0;
                this.bufOff = i11 + 1;
            }
        } else {
            if (this.bufOff == blockSize) {
                this.cipher.processBlock(this.buf, 0, this.mac, 0);
                this.bufOff = 0;
            }
            this.padding.addPadding(this.buf, this.bufOff);
        }
        this.cipher.processBlock(this.buf, 0, this.mac, 0);
        DESEngine dESEngine = new DESEngine();
        dESEngine.init(false, this.lastKey2);
        byte[] bArr2 = this.mac;
        dESEngine.processBlock(bArr2, 0, bArr2, 0);
        dESEngine.init(true, this.lastKey3);
        byte[] bArr3 = this.mac;
        dESEngine.processBlock(bArr3, 0, bArr3, 0);
        System.arraycopy(this.mac, 0, bArr, i10, this.macSize);
        reset();
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        KeyParameter keyParameter;
        reset();
        boolean z10 = cipherParameters instanceof KeyParameter;
        if (!z10 && !(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        byte[] key = (z10 ? (KeyParameter) cipherParameters : (KeyParameter) ((ParametersWithIV) cipherParameters).getParameters()).getKey();
        if (key.length == 16) {
            keyParameter = new KeyParameter(key, 0, 8);
            this.lastKey2 = new KeyParameter(key, 8, 8);
            this.lastKey3 = keyParameter;
        } else {
            if (key.length != 24) {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            keyParameter = new KeyParameter(key, 0, 8);
            this.lastKey2 = new KeyParameter(key, 8, 8);
            this.lastKey3 = new KeyParameter(key, 16, 8);
        }
        if (cipherParameters instanceof ParametersWithIV) {
            this.cipher.init(true, new ParametersWithIV(keyParameter, ((ParametersWithIV) cipherParameters).getIV()));
        } else {
            this.cipher.init(true, keyParameter);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException, DataLengthException {
        int i10 = this.bufOff;
        byte[] bArr = this.buf;
        if (i10 == bArr.length) {
            this.cipher.processBlock(bArr, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i11 = this.bufOff;
        this.bufOff = i11 + 1;
        bArr2[i11] = b10;
    }

    public ISO9797Alg3Mac(BlockCipher blockCipher, int i10) {
        this(blockCipher, i10, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.cipher.getBlockSize();
        int i12 = this.bufOff;
        int i13 = blockSize - i12;
        if (i11 > i13) {
            System.arraycopy(bArr, i10, this.buf, i12, i13);
            this.cipher.processBlock(this.buf, 0, this.mac, 0);
            this.bufOff = 0;
            i11 -= i13;
            i10 += i13;
            while (i11 > blockSize) {
                this.cipher.processBlock(bArr, i10, this.mac, 0);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, this.buf, this.bufOff, i11);
        this.bufOff += i11;
    }

    public ISO9797Alg3Mac(BlockCipher blockCipher, int i10, BlockCipherPadding blockCipherPadding) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!(blockCipher instanceof DESEngine)) {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
        this.cipher = CBCBlockCipher.newInstance(blockCipher);
        this.padding = blockCipherPadding;
        this.macSize = i10 / 8;
        this.mac = new byte[blockCipher.getBlockSize()];
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    public ISO9797Alg3Mac(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this(blockCipher, blockCipher.getBlockSize() * 8, blockCipherPadding);
    }
}
