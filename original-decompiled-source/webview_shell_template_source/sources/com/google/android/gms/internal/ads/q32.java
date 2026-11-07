package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q32 {
    public static void a(int i6) throws InvalidAlgorithmParameterException {
        if (i6 != 16 && i6 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i6 * 8)));
        }
    }
}
