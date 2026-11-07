package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException;

    void init(DerivationParameters derivationParameters);
}
