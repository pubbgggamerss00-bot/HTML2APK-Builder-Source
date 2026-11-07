package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes2.dex */
public class ZeroBytePadding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i10) {
        int length = bArr.length - i10;
        while (i10 < bArr.length) {
            bArr[i10] = 0;
            i10++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ZeroByte";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i11 &= ((bArr[length] & 255) - 1) >> 31;
            i10 -= i11;
        }
    }
}
