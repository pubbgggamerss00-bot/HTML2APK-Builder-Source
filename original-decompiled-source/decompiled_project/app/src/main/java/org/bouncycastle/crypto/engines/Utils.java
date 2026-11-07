package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: classes2.dex */
class Utils {
    public static CryptoServicePurpose getPurpose(boolean z10) {
        return z10 ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }
}
