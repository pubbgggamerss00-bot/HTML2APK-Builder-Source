package org.bouncycastle.crypto.engines;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class GOST28147Engine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private boolean forEncryption;
    private static byte[] Sbox_Default = {4, 10, 9, 2, RegisterType.LONG_HI, 8, 0, RegisterType.DOUBLE_LO, 6, RegisterType.FLOAT, 1, 12, 7, RegisterType.DOUBLE_HI, 5, 3, RegisterType.DOUBLE_LO, RegisterType.FLOAT, 4, 12, 6, RegisterType.LONG_HI, RegisterType.DOUBLE_HI, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, RegisterType.LONG_HI, 10, 3, 4, 2, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 12, 7, 6, 0, 9, RegisterType.FLOAT, 7, RegisterType.LONG_HI, 10, 1, 0, 8, 9, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 4, 6, 12, RegisterType.FLOAT, 2, 5, 3, 6, 12, 7, 1, 5, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 8, 4, 10, 9, RegisterType.DOUBLE_LO, 0, 3, RegisterType.FLOAT, 2, 4, RegisterType.FLOAT, 10, 0, 7, 2, 1, RegisterType.LONG_HI, 3, 6, 8, 5, 9, 12, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, RegisterType.LONG_HI, RegisterType.FLOAT, 4, 1, 3, RegisterType.DOUBLE_HI, 5, 9, 0, 10, RegisterType.DOUBLE_LO, 7, 6, 8, 2, 12, 1, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 0, 5, 7, 10, 4, 9, 2, 3, RegisterType.DOUBLE_LO, 6, RegisterType.FLOAT, 8, 12};
    private static byte[] ESbox_Test = {4, 2, RegisterType.DOUBLE_HI, 5, 9, 1, 0, 8, RegisterType.DOUBLE_LO, 3, RegisterType.FLOAT, 12, RegisterType.LONG_HI, 7, 10, 6, 12, 9, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 8, 1, 3, 10, 2, 7, 4, RegisterType.LONG_HI, 6, 0, RegisterType.FLOAT, 5, RegisterType.LONG_HI, 8, RegisterType.DOUBLE_LO, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, RegisterType.DOUBLE_HI, 0, RegisterType.FLOAT, RegisterType.DOUBLE_LO, 9, RegisterType.FLOAT, 2, 5, RegisterType.DOUBLE_HI, 7, 1, 0, RegisterType.LONG_HI, 12, 6, 10, 4, 3, 8, 3, RegisterType.DOUBLE_LO, 5, 9, 6, 8, 0, RegisterType.LONG_HI, 10, RegisterType.FLOAT, 7, 12, 2, 1, RegisterType.DOUBLE_HI, 4, 8, RegisterType.DOUBLE_HI, 6, RegisterType.FLOAT, 1, 9, 12, 5, RegisterType.LONG_HI, 3, 7, 10, 0, RegisterType.DOUBLE_LO, 2, 4, 9, RegisterType.FLOAT, 12, 0, 3, 6, 7, 5, 4, 8, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 1, 10, 2, RegisterType.LONG_HI, 12, 6, 5, 2, RegisterType.FLOAT, 0, 9, RegisterType.LONG_HI, 3, RegisterType.DOUBLE_LO, 7, 10, RegisterType.DOUBLE_HI, 4, 1, 8};
    private static byte[] ESbox_A = {9, 6, 3, 2, 8, RegisterType.FLOAT, 1, 7, 10, 4, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 12, 0, RegisterType.LONG_HI, 5, 3, 7, RegisterType.DOUBLE_LO, 9, 8, 10, RegisterType.DOUBLE_HI, 0, 5, 2, 6, 12, RegisterType.FLOAT, 4, RegisterType.LONG_HI, 1, RegisterType.DOUBLE_LO, 4, 6, 2, RegisterType.FLOAT, 3, RegisterType.LONG_HI, 8, 12, RegisterType.DOUBLE_HI, 5, 10, 0, 7, 1, 9, RegisterType.DOUBLE_LO, 7, 10, 12, RegisterType.LONG_HI, 1, 3, 9, 0, 2, RegisterType.FLOAT, 4, RegisterType.DOUBLE_HI, 8, 5, 6, RegisterType.FLOAT, 5, 1, 9, 8, RegisterType.LONG_HI, RegisterType.DOUBLE_HI, 0, RegisterType.DOUBLE_LO, 4, 2, 3, 12, 7, 10, 6, 3, 10, RegisterType.LONG_HI, 12, 1, 2, 0, RegisterType.FLOAT, 7, 5, 9, 4, 8, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 6, 1, RegisterType.LONG_HI, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, RegisterType.DOUBLE_HI, 3, RegisterType.FLOAT, RegisterType.DOUBLE_LO, RegisterType.FLOAT, 10, RegisterType.DOUBLE_HI, 5, 0, 12, RegisterType.DOUBLE_LO, 8, 6, 2, 3, 9, 1, 7, RegisterType.LONG_HI, 4};
    private static byte[] ESbox_B = {8, 4, RegisterType.FLOAT, 1, 3, 5, 0, 9, 2, RegisterType.DOUBLE_LO, 10, 12, RegisterType.LONG_HI, 6, 7, RegisterType.DOUBLE_HI, 0, 1, 2, 10, 4, RegisterType.LONG_HI, 5, 12, 9, 7, 3, RegisterType.DOUBLE_HI, RegisterType.FLOAT, 8, 6, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_LO, 12, 0, 10, 9, 2, RegisterType.LONG_HI, RegisterType.FLOAT, 7, 5, 8, RegisterType.DOUBLE_HI, 3, 6, 1, 4, 7, 5, 0, RegisterType.LONG_HI, RegisterType.FLOAT, 6, 1, 2, 3, 10, 12, RegisterType.DOUBLE_HI, 4, RegisterType.DOUBLE_LO, 9, 8, 2, 7, 12, RegisterType.DOUBLE_HI, 9, 5, 10, RegisterType.FLOAT, 1, 4, 0, RegisterType.LONG_HI, 6, 8, RegisterType.DOUBLE_LO, 3, 8, 3, 2, 6, 4, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.FLOAT, 12, 1, 7, RegisterType.DOUBLE_HI, 10, 0, 9, 5, 5, 2, 10, RegisterType.FLOAT, 9, 1, 12, 3, 7, 4, RegisterType.LONG_HI, 0, 6, RegisterType.DOUBLE_HI, 8, RegisterType.DOUBLE_LO, 0, 4, RegisterType.FLOAT, RegisterType.DOUBLE_LO, 8, 3, 7, 1, 10, 2, 9, 6, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 5, 12};
    private static byte[] ESbox_C = {1, RegisterType.FLOAT, 12, 2, 9, RegisterType.LONG_HI, 0, RegisterType.DOUBLE_HI, 4, 5, 8, RegisterType.DOUBLE_LO, 10, 7, 6, 3, 0, 1, 7, RegisterType.LONG_HI, RegisterType.FLOAT, 4, 5, 2, 8, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, RegisterType.DOUBLE_HI, 10, 3, 7, 12, RegisterType.LONG_HI, 6, RegisterType.DOUBLE_LO, 1, RegisterType.FLOAT, 3, 6, 0, 1, 5, RegisterType.LONG_HI, 10, 8, RegisterType.FLOAT, 2, 9, 7, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 12, 4, 8, RegisterType.LONG_HI, RegisterType.FLOAT, 0, 4, 5, 1, 2, 9, 3, 12, RegisterType.DOUBLE_LO, 6, RegisterType.DOUBLE_HI, 10, 7, 12, 9, RegisterType.FLOAT, 1, 8, RegisterType.DOUBLE_LO, 2, 4, 7, 3, 6, 5, 10, 0, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 10, 9, 6, 8, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, 2, 0, RegisterType.DOUBLE_HI, 3, 5, RegisterType.FLOAT, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 12, 6, 1, RegisterType.FLOAT, RegisterType.LONG_HI, 9, 3, 8};
    private static byte[] ESbox_D = {RegisterType.DOUBLE_HI, 12, 2, 10, 6, 4, 5, 0, 7, 9, RegisterType.DOUBLE_LO, RegisterType.LONG_HI, 1, RegisterType.FLOAT, 8, 3, RegisterType.FLOAT, 6, 3, 4, 12, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 2, 7, RegisterType.LONG_HI, 8, 0, 5, 10, 9, 1, 1, 12, RegisterType.FLOAT, 0, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 6, 5, 10, RegisterType.LONG_HI, 4, 8, 9, 3, 7, 2, 1, 5, RegisterType.DOUBLE_LO, 12, 10, 7, 0, RegisterType.LONG_HI, 6, 2, RegisterType.FLOAT, 4, 9, 3, RegisterType.DOUBLE_HI, 8, 0, 12, 8, 9, RegisterType.LONG_HI, 2, 10, RegisterType.FLOAT, 7, 3, 6, 5, 4, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 1, 8, 0, RegisterType.DOUBLE_HI, 3, 2, 5, RegisterType.DOUBLE_LO, RegisterType.FLOAT, 1, 10, 4, 7, 12, 9, RegisterType.LONG_HI, 6, 3, 0, 6, RegisterType.DOUBLE_HI, 1, RegisterType.DOUBLE_LO, 9, 2, RegisterType.LONG_HI, 8, 12, 4, RegisterType.FLOAT, 10, 5, 7, 1, 10, 6, 8, RegisterType.DOUBLE_HI, RegisterType.FLOAT, 0, 4, 12, 3, 5, 9, 7, RegisterType.LONG_HI, 2, RegisterType.DOUBLE_LO};
    private static byte[] Param_Z = {12, 4, 6, 2, 10, 5, RegisterType.FLOAT, 9, RegisterType.DOUBLE_LO, 8, RegisterType.LONG_HI, 7, 0, 3, RegisterType.DOUBLE_HI, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, RegisterType.DOUBLE_LO, 4, 7, RegisterType.FLOAT, RegisterType.LONG_HI, 0, RegisterType.DOUBLE_HI, RegisterType.FLOAT, 3, 5, 8, 2, RegisterType.DOUBLE_HI, 10, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, RegisterType.LONG_HI, 4, RegisterType.DOUBLE_HI, 6, 7, 0, 10, 5, 3, RegisterType.DOUBLE_LO, 9, RegisterType.FLOAT, 7, RegisterType.DOUBLE_HI, 5, 10, 8, 1, 6, RegisterType.LONG_HI, 0, 9, 3, RegisterType.DOUBLE_LO, RegisterType.FLOAT, 4, 2, 12, 5, RegisterType.LONG_HI, RegisterType.DOUBLE_HI, 6, 9, 2, 12, 10, RegisterType.FLOAT, 7, 8, 1, 4, 3, RegisterType.DOUBLE_LO, 0, 8, RegisterType.DOUBLE_LO, 2, 5, 6, 9, 1, 12, RegisterType.DOUBLE_HI, 4, RegisterType.FLOAT, 0, RegisterType.LONG_HI, 10, 3, 7, 1, 7, RegisterType.DOUBLE_LO, RegisterType.LONG_HI, 0, 5, 8, 3, 4, RegisterType.DOUBLE_HI, 10, 6, 9, 12, RegisterType.FLOAT, 2};
    private static byte[] DSbox_Test = {4, 10, 9, 2, RegisterType.LONG_HI, 8, 0, RegisterType.DOUBLE_LO, 6, RegisterType.FLOAT, 1, 12, 7, RegisterType.DOUBLE_HI, 5, 3, RegisterType.DOUBLE_LO, RegisterType.FLOAT, 4, 12, 6, RegisterType.LONG_HI, RegisterType.DOUBLE_HI, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, RegisterType.LONG_HI, 10, 3, 4, 2, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 12, 7, 6, 0, 9, RegisterType.FLOAT, 7, RegisterType.LONG_HI, 10, 1, 0, 8, 9, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 4, 6, 12, RegisterType.FLOAT, 2, 5, 3, 6, 12, 7, 1, 5, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 8, 4, 10, 9, RegisterType.DOUBLE_LO, 0, 3, RegisterType.FLOAT, 2, 4, RegisterType.FLOAT, 10, 0, 7, 2, 1, RegisterType.LONG_HI, 3, 6, 8, 5, 9, 12, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, RegisterType.LONG_HI, RegisterType.FLOAT, 4, 1, 3, RegisterType.DOUBLE_HI, 5, 9, 0, 10, RegisterType.DOUBLE_LO, 7, 6, 8, 2, 12, 1, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 0, 5, 7, 10, 4, 9, 2, 3, RegisterType.DOUBLE_LO, 6, RegisterType.FLOAT, 8, 12};
    private static byte[] DSbox_A = {10, 4, 5, 6, 8, 1, 3, 7, RegisterType.LONG_HI, 12, RegisterType.DOUBLE_LO, 0, 9, 2, RegisterType.FLOAT, RegisterType.DOUBLE_HI, 5, RegisterType.DOUBLE_HI, 4, 0, 2, RegisterType.LONG_HI, RegisterType.FLOAT, 9, 1, 7, 6, 3, 12, RegisterType.DOUBLE_LO, 10, 8, 7, RegisterType.DOUBLE_HI, 12, RegisterType.DOUBLE_LO, 9, 4, 1, 0, 3, RegisterType.FLOAT, 5, 2, 6, 10, 8, RegisterType.LONG_HI, 4, 10, 7, 12, 0, RegisterType.DOUBLE_HI, 2, 8, RegisterType.DOUBLE_LO, 1, 6, 5, RegisterType.LONG_HI, RegisterType.FLOAT, 9, 3, 7, 6, 4, RegisterType.FLOAT, 9, 12, 2, 10, 1, 8, 0, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 3, 5, 7, 6, 2, 4, RegisterType.LONG_HI, 9, RegisterType.DOUBLE_HI, 0, 10, 1, 5, RegisterType.FLOAT, 8, RegisterType.DOUBLE_LO, 12, 3, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, 4, 1, 7, 0, 5, 10, 3, 12, 8, RegisterType.DOUBLE_HI, 6, 2, 9, RegisterType.FLOAT, 1, 3, 10, 9, 5, RegisterType.FLOAT, 4, RegisterType.DOUBLE_HI, 8, 6, 7, RegisterType.DOUBLE_LO, RegisterType.LONG_HI, 0, 2, 12};
    private static Hashtable sBoxes = new Hashtable();
    private int[] workingKey = null;
    private byte[] S = Sbox_Default;

    static {
        addSBox("Default", Sbox_Default);
        addSBox("E-TEST", ESbox_Test);
        addSBox("E-A", ESbox_A);
        addSBox("E-B", ESbox_B);
        addSBox("E-C", ESbox_C);
        addSBox("E-D", ESbox_D);
        addSBox("Param-Z", Param_Z);
        addSBox("D-TEST", DSbox_Test);
        addSBox("D-A", DSbox_A);
    }

    public GOST28147Engine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 178));
    }

    private void GOST28147Func(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13;
        int iBytesToint = bytesToint(bArr, i10);
        int iBytesToint2 = bytesToint(bArr, i10 + 4);
        int i14 = 7;
        if (this.forEncryption) {
            for (int i15 = 0; i15 < 3; i15++) {
                int i16 = 0;
                while (i16 < 8) {
                    int iGOST28147_mainStep = iBytesToint2 ^ GOST28147_mainStep(iBytesToint, iArr[i16]);
                    i16++;
                    int i17 = iBytesToint;
                    iBytesToint = iGOST28147_mainStep;
                    iBytesToint2 = i17;
                }
            }
            i12 = iBytesToint2;
            i13 = iBytesToint;
            while (i14 > 0) {
                int iGOST28147_mainStep2 = i12 ^ GOST28147_mainStep(i13, iArr[i14]);
                i14--;
                i12 = i13;
                i13 = iGOST28147_mainStep2;
            }
        } else {
            int i18 = 0;
            while (i18 < 8) {
                int iGOST28147_mainStep3 = iBytesToint2 ^ GOST28147_mainStep(iBytesToint, iArr[i18]);
                i18++;
                int i19 = iBytesToint;
                iBytesToint = iGOST28147_mainStep3;
                iBytesToint2 = i19;
            }
            i12 = iBytesToint2;
            i13 = iBytesToint;
            for (int i20 = 0; i20 < 3; i20++) {
                int i21 = 7;
                while (i21 >= 0 && (i20 != 2 || i21 != 0)) {
                    int iGOST28147_mainStep4 = i12 ^ GOST28147_mainStep(i13, iArr[i21]);
                    i21--;
                    i12 = i13;
                    i13 = iGOST28147_mainStep4;
                }
            }
        }
        int iGOST28147_mainStep5 = GOST28147_mainStep(i13, iArr[0]) ^ i12;
        intTobytes(i13, bArr2, i11);
        intTobytes(iGOST28147_mainStep5, bArr2, i11 + 4);
    }

    private int GOST28147_mainStep(int i10, int i11) {
        int i12 = i11 + i10;
        byte[] bArr = this.S;
        int i13 = bArr[i12 & 15] + (bArr[((i12 >> 4) & 15) + 16] << 4) + (bArr[((i12 >> 8) & 15) + 32] << 8) + (bArr[((i12 >> 12) & 15) + 48] << 12) + (bArr[((i12 >> 16) & 15) + 64] << RegisterType.UNINIT_REF) + (bArr[((i12 >> 20) & 15) + 80] << 20) + (bArr[((i12 >> 24) & 15) + 96] << 24) + (bArr[((i12 >> 28) & 15) + 112] << 28);
        return (i13 << 11) | (i13 >>> 21);
    }

    private static void addSBox(String str, byte[] bArr) {
        sBoxes.put(Strings.toUpperCase(str), bArr);
    }

    private int bytesToint(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] << 24) & (-16777216)) + ((bArr[i10 + 2] << RegisterType.UNINIT_REF) & 16711680) + ((bArr[i10 + 1] << 8) & 65280) + (bArr[i10] & 255);
    }

    private int[] generateWorkingKey(boolean z10, byte[] bArr) {
        this.forEncryption = z10;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i10 = 0; i10 != 8; i10++) {
            iArr[i10] = bytesToint(bArr, i10 * 4);
        }
        return iArr;
    }

    public static byte[] getSBox(String str) {
        byte[] bArr = (byte[]) sBoxes.get(Strings.toUpperCase(str));
        if (bArr != null) {
            return Arrays.clone(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    public static String getSBoxName(byte[] bArr) {
        Enumeration enumerationKeys = sBoxes.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            if (Arrays.areEqual((byte[]) sBoxes.get(str), bArr)) {
                return str;
            }
        }
        throw new IllegalArgumentException("SBOX provided did not map to a known one");
    }

    private void intTobytes(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) (i10 >>> 24);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "GOST28147";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithSBox) {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            byte[] sBox = parametersWithSBox.getSBox();
            if (sBox.length != Sbox_Default.length) {
                throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
            }
            this.S = Arrays.clone(sBox);
            if (parametersWithSBox.getParameters() != null) {
                this.workingKey = generateWorkingKey(z10, ((KeyParameter) parametersWithSBox.getParameters()).getKey());
            }
        } else if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(z10, ((KeyParameter) cipherParameters).getKey());
        } else if (cipherParameters != null) {
            throw new IllegalArgumentException(a.a("invalid parameter passed to GOST28147 init - ", cipherParameters));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 178, cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        GOST28147Func(iArr, bArr, i10, bArr2, i11);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
