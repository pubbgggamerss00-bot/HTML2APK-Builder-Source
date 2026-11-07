package org.bouncycastle.pqc.crypto.ntru;

/* loaded from: classes3.dex */
class OWCPADecryptResult {
    final int fail;
    final byte[] rm;

    public OWCPADecryptResult(byte[] bArr, int i10) {
        this.rm = bArr;
        this.fail = i10;
    }
}
