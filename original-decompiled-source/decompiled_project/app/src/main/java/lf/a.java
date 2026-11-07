package lf;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f17032a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17033b = false;

    public a(byte[] bArr) {
        this.f17032a = 0;
        int i10 = (bArr[0] & 255) << 8;
        this.f17032a = i10;
        int i11 = (i10 | (bArr[1] & 255)) << 8;
        this.f17032a = i11;
        int i12 = (i11 | (bArr[2] & 255)) << 8;
        this.f17032a = i12;
        this.f17032a = (bArr[3] & 255) | i12;
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.f17032a;
        this.f17032a = z10 ? (1 << (i10 - 1)) | i11 : (~(1 << (i10 - 1))) & i11;
    }
}
