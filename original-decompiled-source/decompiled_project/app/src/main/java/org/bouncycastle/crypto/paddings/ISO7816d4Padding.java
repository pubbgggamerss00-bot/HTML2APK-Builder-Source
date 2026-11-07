package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes2.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i10) {
        int length = bArr.length - i10;
        bArr[i10] = Byte.MIN_VALUE;
        while (true) {
            i10++;
            if (i10 >= bArr.length) {
                return length;
            }
            bArr[i10] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            i10 ^= ((((r4 ^ 128) - 1) >> 31) & i11) & (length ^ i10);
            i11 &= ((bArr[length] & 255) - 1) >> 31;
        }
        if (i10 >= 0) {
            return bArr.length - i10;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
