package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nw1 extends kw1 {
    @Override // com.google.android.gms.internal.ads.kw1
    public final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.kw1
    public final int[] b(int[] iArr, int i6) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArrC = iw1.c(this.f6516a, iArr);
        int[] iArr3 = iw1.f5875a;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(iArrC, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i6;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
