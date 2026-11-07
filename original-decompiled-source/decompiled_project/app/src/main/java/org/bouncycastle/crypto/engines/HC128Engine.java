package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class HC128Engine implements StreamCipher {
    private boolean initialised;
    private byte[] iv;
    private byte[] key;

    /* renamed from: p, reason: collision with root package name */
    private int[] f19969p = new int[512];

    /* renamed from: q, reason: collision with root package name */
    private int[] f19970q = new int[512];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private static int dim(int i10, int i11) {
        return mod512(i10 - i11);
    }

    private static int f1(int i10) {
        return (i10 >>> 3) ^ (rotateRight(i10, 7) ^ rotateRight(i10, 18));
    }

    private static int f2(int i10) {
        return (i10 >>> 10) ^ (rotateRight(i10, 17) ^ rotateRight(i10, 19));
    }

    private int g1(int i10, int i11, int i12) {
        return (rotateRight(i10, 10) ^ rotateRight(i12, 23)) + rotateRight(i11, 8);
    }

    private int g2(int i10, int i11, int i12) {
        return (rotateLeft(i10, 10) ^ rotateLeft(i12, 23)) + rotateLeft(i11, 8);
    }

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (iStep & 255);
            bArr[1] = (byte) ((iStep >> 8) & 255);
            bArr[2] = (byte) ((iStep >> 16) & 255);
            bArr[3] = (byte) ((iStep >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i10 = this.idx;
        byte b10 = bArr2[i10];
        this.idx = 3 & (i10 + 1);
        return b10;
    }

    private int h1(int i10) {
        int[] iArr = this.f19970q;
        return iArr[i10 & 255] + iArr[((i10 >> 16) & 255) + 256];
    }

    private int h2(int i10) {
        int[] iArr = this.f19969p;
        return iArr[i10 & 255] + iArr[((i10 >> 16) & 255) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        if (this.iv.length != 16) {
            throw new IllegalArgumentException("The IV must be 128 bits long");
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[1280];
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = i10 >> 2;
            iArr[i11] = ((this.key[i10] & 255) << ((i10 & 3) * 8)) | iArr[i11];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i12 = 0;
        while (true) {
            byte[] bArr = this.iv;
            if (i12 >= bArr.length || i12 >= 16) {
                break;
            }
            int i13 = (i12 >> 2) + 8;
            iArr[i13] = ((bArr[i12] & 255) << ((i12 & 3) * 8)) | iArr[i13];
            i12++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i14 = 16; i14 < 1280; i14++) {
            iArr[i14] = f2(iArr[i14 - 2]) + iArr[i14 - 7] + f1(iArr[i14 - 15]) + iArr[i14 - 16] + i14;
        }
        System.arraycopy(iArr, 256, this.f19969p, 0, 512);
        System.arraycopy(iArr, 768, this.f19970q, 0, 512);
        for (int i15 = 0; i15 < 512; i15++) {
            this.f19969p[i15] = step();
        }
        for (int i16 = 0; i16 < 512; i16++) {
            this.f19970q[i16] = step();
        }
        this.cnt = 0;
    }

    private static int mod1024(int i10) {
        return i10 & 1023;
    }

    private static int mod512(int i10) {
        return i10 & 511;
    }

    private static int rotateLeft(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    private static int rotateRight(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private int step() {
        int iH2;
        int i10;
        int iMod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f19969p;
            iArr[iMod512] = iArr[iMod512] + g1(iArr[dim(iMod512, 3)], this.f19969p[dim(iMod512, 10)], this.f19969p[dim(iMod512, 511)]);
            iH2 = h1(this.f19969p[dim(iMod512, 12)]);
            i10 = this.f19969p[iMod512];
        } else {
            int[] iArr2 = this.f19970q;
            iArr2[iMod512] = iArr2[iMod512] + g2(iArr2[dim(iMod512, 3)], this.f19970q[dim(iMod512, 10)], this.f19970q[dim(iMod512, 511)]);
            iH2 = h2(this.f19970q[dim(iMod512, 12)]);
            i10 = this.f19970q[iMod512];
        }
        int i11 = i10 ^ iH2;
        this.cnt = mod1024(this.cnt + 1);
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ getByte());
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        return (byte) (b10 ^ getByte());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("no IV passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.iv = parametersWithIV.getIV();
        CipherParameters parameters = parametersWithIV.getParameters();
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.a("Invalid parameter passed to HC128 init - ", cipherParameters));
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
        this.initialised = true;
    }
}
