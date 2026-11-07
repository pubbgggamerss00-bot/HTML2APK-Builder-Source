package se;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f24915a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f24916b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24917c;

    public d(byte[] bArr, byte[] bArr2) {
        this.f24917c = 0;
        if (bArr.length != bArr2.length && bArr.length == 1 && bArr[0] == 0) {
            bArr = new byte[bArr2.length];
        } else if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("The start and the end values must not have different lengths.");
        }
        this.f24915a = new int[bArr.length];
        this.f24916b = new int[bArr2.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.f24915a[i10] = bArr[i10] & 255;
            this.f24916b[i10] = bArr2[i10] & 255;
        }
        this.f24917c = bArr2.length;
    }

    public d() {
        this.f24917c = 0;
    }
}
