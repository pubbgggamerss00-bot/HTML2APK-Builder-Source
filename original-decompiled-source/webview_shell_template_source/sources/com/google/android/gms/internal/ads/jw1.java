package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jw1 extends kw1 {
    @Override // com.google.android.gms.internal.ads.kw1
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.kw1
    public final int[] b(int[] iArr, int i6) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = iw1.f5875a;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.f6516a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i6;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
