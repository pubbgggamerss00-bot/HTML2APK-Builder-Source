package j7;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f15230a;

    /* renamed from: b, reason: collision with root package name */
    public int f15231b = 1073741824;

    public k(InputStream inputStream) {
        this.f15230a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f15231b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15230a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f15230a.read();
        if (i10 == -1) {
            this.f15231b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        return this.f15230a.skip(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f15230a.read(bArr);
        if (i10 == -1) {
            this.f15231b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f15230a.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f15231b = 0;
        }
        return i12;
    }
}
