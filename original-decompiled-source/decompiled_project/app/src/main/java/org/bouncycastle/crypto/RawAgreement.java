package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface RawAgreement {
    void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i10);

    int getAgreementSize();

    void init(CipherParameters cipherParameters);
}
