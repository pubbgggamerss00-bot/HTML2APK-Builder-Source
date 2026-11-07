package org.bouncycastle.crypto.macs;

import j2.y;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class CMac implements Mac {
    private byte[] Lu;
    private byte[] Lu2;
    private byte[] ZEROES;
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;
    private byte[] poly;

    public CMac(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    private byte[] doubleLu(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i10 = (-shiftLeft(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b10 = bArr2[length];
        byte[] bArr3 = this.poly;
        bArr2[length] = (byte) (b10 ^ (bArr3[1] & i10));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i10) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i10 & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] lookupPoly(int i10) {
        int i11 = i10 * 8;
        int i12 = 135;
        switch (i11) {
            case 64:
            case DilithiumEngine.DilithiumPolyT1PackedBytes /* 320 */:
                i12 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i12 = 45;
                break;
            case BERTags.FLAGS /* 224 */:
                i12 = 777;
                break;
            case 256:
                i12 = 1061;
                break;
            case 384:
                i12 = 4109;
                break;
            case 448:
                i12 = 2129;
                break;
            case 512:
                i12 = 293;
                break;
            case 768:
                i12 = 655377;
                break;
            case 1024:
                i12 = 524355;
                break;
            case 2048:
                i12 = 548865;
                break;
            default:
                throw new IllegalArgumentException(y.a(i11, "Unknown block size for CMAC: "));
        }
        return Pack.intToBigEndian(i12);
    }

    private static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            int i11 = bArr[length] & 255;
            bArr2[length] = (byte) (i10 | (i11 << 1));
            i10 = (i11 >>> 7) & 1;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        byte[] bArr2;
        if (this.bufOff == this.cipher.getBlockSize()) {
            bArr2 = this.Lu;
        } else {
            new ISO7816d4Padding().addPadding(this.buf, this.bufOff);
            bArr2 = this.Lu2;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr3 = this.mac;
            if (i11 >= bArr3.length) {
                this.cipher.processBlock(this.buf, 0, bArr3, 0);
                System.arraycopy(this.mac, 0, bArr, i10, this.macSize);
                reset();
                return this.macSize;
            }
            byte[] bArr4 = this.buf;
            bArr4[i11] = (byte) (bArr4[i11] ^ bArr2[i11]);
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        validate(cipherParameters);
        this.cipher.init(true, cipherParameters);
        byte[] bArr = this.ZEROES;
        byte[] bArr2 = new byte[bArr.length];
        this.cipher.processBlock(bArr, 0, bArr2, 0);
        byte[] bArrDoubleLu = doubleLu(bArr2);
        this.Lu = bArrDoubleLu;
        this.Lu2 = doubleLu(bArrDoubleLu);
        reset();
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

    public void validate(CipherParameters cipherParameters) {
        if (cipherParameters != null && !(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    public CMac(BlockCipher blockCipher, int i10) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i10 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (blockCipher.getBlockSize() * 8));
        }
        this.cipher = CBCBlockCipher.newInstance(blockCipher);
        this.macSize = i10 / 8;
        this.poly = lookupPoly(blockCipher.getBlockSize());
        this.mac = new byte[blockCipher.getBlockSize()];
        this.buf = new byte[blockCipher.getBlockSize()];
        this.ZEROES = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
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
}
