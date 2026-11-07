package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.engines.a;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Pack;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class GOST28147Mac implements Mac {
    private static final int BLOCK_SIZE = 8;
    private static final int MAC_SIZE = 4;
    private byte[] S;
    private byte[] buf;
    private int bufOff;
    private boolean firstStep;
    private byte[] mac;
    private byte[] macIV;
    private final CryptoServicePurpose purpose;
    private int[] workingKey;

    public GOST28147Mac() {
        this(CryptoServicePurpose.AUTHENTICATION);
    }

    private static void CM5func(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3) {
        for (int i11 = 0; i11 < 8; i11++) {
            bArr3[i11] = (byte) (bArr[i10 + i11] ^ bArr2[i11]);
        }
    }

    private int[] generateWorkingKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i10 = 0; i10 != 8; i10++) {
            iArr[i10] = Pack.littleEndianToInt(bArr, i10 * 4);
        }
        return iArr;
    }

    private void gost28147MacFunc(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i10);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i10 + 4);
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = 0;
            while (i13 < 8) {
                int iGost28147_mainStep = iLittleEndianToInt2 ^ gost28147_mainStep(iLittleEndianToInt, iArr[i13]);
                i13++;
                int i14 = iLittleEndianToInt;
                iLittleEndianToInt = iGost28147_mainStep;
                iLittleEndianToInt2 = i14;
            }
        }
        Pack.intToLittleEndian(iLittleEndianToInt, bArr2, i11);
        Pack.intToLittleEndian(iLittleEndianToInt2, bArr2, i11 + 4);
    }

    private int gost28147_mainStep(int i10, int i11) {
        int i12 = i11 + i10;
        byte[] bArr = this.S;
        int i13 = bArr[i12 & 15] + (bArr[((i12 >> 4) & 15) + 16] << 4) + (bArr[((i12 >> 8) & 15) + 32] << 8) + (bArr[((i12 >> 12) & 15) + 48] << 12) + (bArr[((i12 >> 16) & 15) + 64] << RegisterType.UNINIT_REF) + (bArr[((i12 >> 20) & 15) + 80] << 20) + (bArr[((i12 >> 24) & 15) + 96] << 24) + (bArr[((i12 >> 28) & 15) + 112] << 28);
        return (i13 << 11) | (i13 >>> 21);
    }

    private void recursiveInit(CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters == null) {
            return;
        }
        if (cipherParameters instanceof ParametersWithSBox) {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            System.arraycopy(parametersWithSBox.getSBox(), 0, this.S, 0, parametersWithSBox.getSBox().length);
            parameters = parametersWithSBox.getParameters();
        } else if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
            parameters = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(a.a("invalid parameter passed to GOST28147 init - ", cipherParameters));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            byte[] bArr = this.mac;
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
            this.macIV = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        }
        recursiveInit(parameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        while (true) {
            int i11 = this.bufOff;
            if (i11 >= 8) {
                break;
            }
            this.buf[i11] = 0;
            this.bufOff = i11 + 1;
        }
        byte[] bArr2 = this.buf;
        byte[] bArr3 = new byte[bArr2.length];
        if (this.firstStep) {
            this.firstStep = false;
            System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
        } else {
            CM5func(bArr2, 0, this.mac, bArr3);
        }
        gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
        byte[] bArr4 = this.mac;
        System.arraycopy(bArr4, (bArr4.length / 2) - 4, bArr, i10, 4);
        reset();
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        reset();
        this.buf = new byte[8];
        this.macIV = null;
        recursiveInit(cipherParameters);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 178, cipherParameters, this.purpose));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.bufOff = 0;
                this.firstStep = true;
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        GOST28147Mac gOST28147Mac;
        int i10 = this.bufOff;
        byte[] bArr = this.buf;
        if (i10 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            if (this.firstStep) {
                this.firstStep = false;
                byte[] bArr3 = this.macIV;
                if (bArr3 != null) {
                    CM5func(bArr, 0, bArr3, bArr2);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, this.mac.length);
                }
            } else {
                CM5func(bArr, 0, this.mac, bArr2);
            }
            gOST28147Mac = this;
            gOST28147Mac.gost28147MacFunc(this.workingKey, bArr2, 0, this.mac, 0);
            gOST28147Mac.bufOff = 0;
        } else {
            gOST28147Mac = this;
        }
        byte[] bArr4 = gOST28147Mac.buf;
        int i11 = gOST28147Mac.bufOff;
        gOST28147Mac.bufOff = i11 + 1;
        bArr4[i11] = b10;
    }

    public GOST28147Mac(CryptoServicePurpose cryptoServicePurpose) {
        this.firstStep = true;
        this.workingKey = null;
        this.macIV = null;
        this.S = new byte[]{9, 6, 3, 2, 8, RegisterType.FLOAT, 1, 7, 10, 4, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 12, 0, RegisterType.LONG_HI, 5, 3, 7, RegisterType.DOUBLE_LO, 9, 8, 10, RegisterType.DOUBLE_HI, 0, 5, 2, 6, 12, RegisterType.FLOAT, 4, RegisterType.LONG_HI, 1, RegisterType.DOUBLE_LO, 4, 6, 2, RegisterType.FLOAT, 3, RegisterType.LONG_HI, 8, 12, RegisterType.DOUBLE_HI, 5, 10, 0, 7, 1, 9, RegisterType.DOUBLE_LO, 7, 10, 12, RegisterType.LONG_HI, 1, 3, 9, 0, 2, RegisterType.FLOAT, 4, RegisterType.DOUBLE_HI, 8, 5, 6, RegisterType.FLOAT, 5, 1, 9, 8, RegisterType.LONG_HI, RegisterType.DOUBLE_HI, 0, RegisterType.DOUBLE_LO, 4, 2, 3, 12, 7, 10, 6, 3, 10, RegisterType.LONG_HI, 12, 1, 2, 0, RegisterType.FLOAT, 7, 5, 9, 4, 8, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 6, 1, RegisterType.LONG_HI, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, RegisterType.DOUBLE_HI, 3, RegisterType.FLOAT, RegisterType.DOUBLE_LO, RegisterType.FLOAT, 10, RegisterType.DOUBLE_HI, 5, 0, 12, RegisterType.DOUBLE_LO, 8, 6, 2, 3, 9, 1, 7, RegisterType.LONG_HI, 4};
        this.purpose = cryptoServicePurpose;
        this.mac = new byte[8];
        this.buf = new byte[8];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        GOST28147Mac gOST28147Mac;
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i12 = this.bufOff;
        int i13 = 8 - i12;
        if (i11 > i13) {
            System.arraycopy(bArr, i10, this.buf, i12, i13);
            byte[] bArr2 = this.buf;
            byte[] bArr3 = new byte[bArr2.length];
            if (this.firstStep) {
                this.firstStep = false;
                byte[] bArr4 = this.macIV;
                if (bArr4 != null) {
                    CM5func(bArr2, 0, bArr4, bArr3);
                } else {
                    System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
                }
            } else {
                CM5func(bArr2, 0, this.mac, bArr3);
            }
            gOST28147Mac = this;
            gOST28147Mac.gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
            gOST28147Mac.bufOff = 0;
            i11 -= i13;
            i10 += i13;
            while (i11 > 8) {
                CM5func(bArr, i10, gOST28147Mac.mac, bArr3);
                gOST28147Mac.gost28147MacFunc(gOST28147Mac.workingKey, bArr3, 0, gOST28147Mac.mac, 0);
                i11 -= 8;
                i10 += 8;
            }
        } else {
            gOST28147Mac = this;
        }
        System.arraycopy(bArr, i10, gOST28147Mac.buf, gOST28147Mac.bufOff, i11);
        gOST28147Mac.bufOff += i11;
    }
}
