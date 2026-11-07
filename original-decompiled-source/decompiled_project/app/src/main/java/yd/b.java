package yd;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f34384a;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f34384a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f34384a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f34384a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
