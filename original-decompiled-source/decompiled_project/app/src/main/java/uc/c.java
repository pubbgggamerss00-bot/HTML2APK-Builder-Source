package uc;

/* loaded from: classes2.dex */
public final class c extends d {
    @Override // uc.d
    public final int[] b(int[] iArr, int i10) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = a.f29696a;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.f29700a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // uc.d
    public final int c() {
        return 12;
    }
}
