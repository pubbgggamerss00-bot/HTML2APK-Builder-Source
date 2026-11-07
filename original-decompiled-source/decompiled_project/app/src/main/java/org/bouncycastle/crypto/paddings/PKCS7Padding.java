package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.openssl.PEMParser;

/* loaded from: classes2.dex */
public class PKCS7Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i10) {
        byte length = (byte) (bArr.length - i10);
        while (i10 < bArr.length) {
            bArr[i10] = length;
            i10++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return PEMParser.TYPE_PKCS7;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        byte b10 = bArr[bArr.length - 1];
        int i10 = b10 & 255;
        int length = bArr.length - i10;
        int i11 = ((i10 - 1) | length) >> 31;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i11 |= (bArr[i12] ^ b10) & (~((i12 - length) >> 31));
        }
        if (i11 == 0) {
            return i10;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
