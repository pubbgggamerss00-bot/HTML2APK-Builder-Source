package lf;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f17038a = new int[256];

    /* renamed from: b, reason: collision with root package name */
    public int f17039b;

    /* renamed from: c, reason: collision with root package name */
    public int f17040c;

    public final void a(byte[] bArr) {
        int[] iArr;
        this.f17039b = 0;
        this.f17040c = 0;
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException("number of bytes must be between 1 and 32");
        }
        int i10 = 0;
        while (true) {
            iArr = this.f17038a;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = i10;
            i10++;
        }
        int length = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = bArr[length];
            if (i13 < 0) {
                i13 += 256;
            }
            int i14 = iArr[i12];
            i11 = ((i13 + i14) + i11) % 256;
            iArr[i12] = iArr[i11];
            iArr[i11] = i14;
            length = (length + 1) % bArr.length;
        }
    }

    public final void b(byte b10, OutputStream outputStream) throws IOException {
        int i10 = (this.f17039b + 1) % 256;
        this.f17039b = i10;
        int[] iArr = this.f17038a;
        int i11 = iArr[i10];
        int i12 = (this.f17040c + i11) % 256;
        this.f17040c = i12;
        iArr[i10] = iArr[i12];
        iArr[i12] = i11;
        outputStream.write(b10 ^ ((byte) iArr[(iArr[i10] + i11) % 256]));
    }
}
