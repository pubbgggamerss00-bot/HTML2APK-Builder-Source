package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes2.dex */
public class HPKEContext {
    protected final AEAD aead;
    protected final byte[] exporterSecret;
    protected final HKDF hkdf;
    protected final byte[] suiteId;

    public HPKEContext(AEAD aead, HKDF hkdf, byte[] bArr, byte[] bArr2) {
        this.aead = aead;
        this.hkdf = hkdf;
        this.exporterSecret = bArr;
        this.suiteId = bArr2;
    }

    public byte[] expand(byte[] bArr, byte[] bArr2, int i10) {
        return this.hkdf.Expand(bArr, bArr2, i10);
    }

    public byte[] export(byte[] bArr, int i10) {
        return this.hkdf.LabeledExpand(this.exporterSecret, this.suiteId, "sec", bArr, i10);
    }

    public byte[] extract(byte[] bArr, byte[] bArr2) {
        return this.hkdf.Extract(bArr, bArr2);
    }

    public byte[] open(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        return this.aead.open(bArr, bArr2);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        return this.aead.seal(bArr, bArr2);
    }

    public byte[] open(byte[] bArr, byte[] bArr2, int i10, int i11) throws InvalidCipherTextException {
        return this.aead.open(bArr, bArr2, i10, i11);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2, int i10, int i11) throws InvalidCipherTextException {
        return this.aead.seal(bArr, bArr2, i10, i11);
    }
}
