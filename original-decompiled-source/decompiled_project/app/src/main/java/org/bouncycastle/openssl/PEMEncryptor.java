package org.bouncycastle.openssl;

/* loaded from: classes3.dex */
public interface PEMEncryptor {
    byte[] encrypt(byte[] bArr) throws PEMException;

    String getAlgorithm();

    byte[] getIV();
}
