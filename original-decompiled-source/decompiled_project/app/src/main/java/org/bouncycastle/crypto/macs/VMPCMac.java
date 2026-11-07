package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class VMPCMac implements Mac {
    private byte[] T;

    /* renamed from: g, reason: collision with root package name */
    private byte f20035g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* renamed from: x1, reason: collision with root package name */
    private byte f20038x1;

    /* renamed from: x2, reason: collision with root package name */
    private byte f20039x2;

    /* renamed from: x3, reason: collision with root package name */
    private byte f20040x3;

    /* renamed from: x4, reason: collision with root package name */
    private byte f20041x4;

    /* renamed from: n, reason: collision with root package name */
    private byte f20036n = 0;
    private byte[] P = null;

    /* renamed from: s, reason: collision with root package name */
    private byte f20037s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f20037s = (byte) 0;
        this.P = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            this.P[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr3 = this.P;
            byte b10 = this.f20037s;
            int i12 = i11 & 255;
            byte b11 = bArr3[i12];
            byte b12 = bArr3[(b10 + b11 + bArr[i11 % bArr.length]) & 255];
            this.f20037s = b12;
            bArr3[i12] = bArr3[b12 & 255];
            bArr3[b12 & 255] = b11;
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.P;
            byte b13 = this.f20037s;
            int i14 = i13 & 255;
            byte b14 = bArr4[i14];
            byte b15 = bArr4[(b13 + b14 + bArr2[i13 % bArr2.length]) & 255];
            this.f20037s = b15;
            bArr4[i14] = bArr4[b15 & 255];
            bArr4[b15 & 255] = b14;
        }
        this.f20036n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        for (int i11 = 1; i11 < 25; i11++) {
            byte[] bArr2 = this.P;
            byte b10 = this.f20037s;
            byte b11 = this.f20036n;
            byte b12 = bArr2[(b10 + bArr2[b11 & 255]) & 255];
            this.f20037s = b12;
            byte b13 = this.f20041x4;
            byte b14 = this.f20040x3;
            byte b15 = bArr2[(b13 + b14 + i11) & 255];
            this.f20041x4 = b15;
            byte b16 = this.f20039x2;
            byte b17 = bArr2[(b14 + b16 + i11) & 255];
            this.f20040x3 = b17;
            byte b18 = this.f20038x1;
            byte b19 = bArr2[(b16 + b18 + i11) & 255];
            this.f20039x2 = b19;
            byte b20 = bArr2[(b18 + b12 + i11) & 255];
            this.f20038x1 = b20;
            byte[] bArr3 = this.T;
            byte b21 = this.f20035g;
            bArr3[b21 & 31] = (byte) (b20 ^ bArr3[b21 & 31]);
            bArr3[(b21 + 1) & 31] = (byte) (b19 ^ bArr3[(b21 + 1) & 31]);
            bArr3[(b21 + 2) & 31] = (byte) (b17 ^ bArr3[(b21 + 2) & 31]);
            bArr3[(b21 + 3) & 31] = (byte) (b15 ^ bArr3[(b21 + 3) & 31]);
            this.f20035g = (byte) ((b21 + 4) & 31);
            byte b22 = bArr2[b11 & 255];
            bArr2[b11 & 255] = bArr2[b12 & 255];
            bArr2[b12 & 255] = b22;
            this.f20036n = (byte) ((b11 + 1) & 255);
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr4 = this.P;
            byte b23 = this.f20037s;
            int i13 = i12 & 255;
            byte b24 = bArr4[i13];
            byte b25 = bArr4[(b23 + b24 + this.T[i12 & 31]) & 255];
            this.f20037s = b25;
            bArr4[i13] = bArr4[b25 & 255];
            bArr4[b25 & 255] = b24;
        }
        byte[] bArr5 = new byte[20];
        for (int i14 = 0; i14 < 20; i14++) {
            byte[] bArr6 = this.P;
            int i15 = i14 & 255;
            byte b26 = bArr6[(this.f20037s + bArr6[i15]) & 255];
            this.f20037s = b26;
            bArr5[i14] = bArr6[(bArr6[bArr6[b26 & 255] & 255] + 1) & 255];
            byte b27 = bArr6[i15];
            bArr6[i15] = bArr6[b26 & 255];
            bArr6[b26 & 255] = b27;
        }
        System.arraycopy(bArr5, 0, bArr, i10, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f20036n = (byte) 0;
        this.f20041x4 = (byte) 0;
        this.f20040x3 = (byte) 0;
        this.f20039x2 = (byte) 0;
        this.f20038x1 = (byte) 0;
        this.f20035g = (byte) 0;
        this.T = new byte[32];
        for (int i10 = 0; i10 < 32; i10++) {
            this.T[i10] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        byte[] bArr = this.P;
        byte b11 = this.f20037s;
        byte b12 = this.f20036n;
        byte b13 = bArr[(b11 + bArr[b12 & 255]) & 255];
        this.f20037s = b13;
        byte b14 = (byte) (b10 ^ bArr[(bArr[bArr[b13 & 255] & 255] + 1) & 255]);
        byte b15 = this.f20041x4;
        byte b16 = this.f20040x3;
        byte b17 = bArr[(b15 + b16) & 255];
        this.f20041x4 = b17;
        byte b18 = this.f20039x2;
        byte b19 = bArr[(b16 + b18) & 255];
        this.f20040x3 = b19;
        byte b20 = this.f20038x1;
        byte b21 = bArr[(b18 + b20) & 255];
        this.f20039x2 = b21;
        byte b22 = bArr[(b20 + b13 + b14) & 255];
        this.f20038x1 = b22;
        byte[] bArr2 = this.T;
        byte b23 = this.f20035g;
        bArr2[b23 & 31] = (byte) (b22 ^ bArr2[b23 & 31]);
        bArr2[(b23 + 1) & 31] = (byte) (b21 ^ bArr2[(b23 + 1) & 31]);
        bArr2[(b23 + 2) & 31] = (byte) (b19 ^ bArr2[(b23 + 2) & 31]);
        bArr2[(b23 + 3) & 31] = (byte) (b17 ^ bArr2[(b23 + 3) & 31]);
        this.f20035g = (byte) ((b23 + 4) & 31);
        byte b24 = bArr[b12 & 255];
        bArr[b12 & 255] = bArr[b13 & 255];
        bArr[b13 & 255] = b24;
        this.f20036n = (byte) ((b12 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            update(bArr[i10 + i12]);
        }
    }
}
