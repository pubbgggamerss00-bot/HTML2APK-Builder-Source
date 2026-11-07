package ff;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ef.c f11229a;

    public i(ef.c cVar) {
        this.f11229a = cVar;
    }

    @Override // ff.j
    public final void b0(int i10) throws IOException {
        this.f11229a.h(1);
    }

    @Override // ff.j
    public final byte[] c0(int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        do {
            int i12 = this.f11229a.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new EOFException();
            }
            i11 += i12;
        } while (i11 < i10);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11229a.close();
    }

    @Override // ff.j
    public final boolean g() throws IOException {
        return this.f11229a.g();
    }

    @Override // ff.j
    public final long getPosition() throws IOException {
        return this.f11229a.f8712l;
    }

    @Override // ff.j
    public final void p0(byte[] bArr) throws IOException {
        this.f11229a.h(bArr.length);
    }

    @Override // ff.j
    public final int peek() throws IOException {
        return this.f11229a.peek();
    }

    @Override // ff.j
    public final int read() throws IOException {
        return this.f11229a.read();
    }

    @Override // ff.j
    public final void s(int i10, byte[] bArr) throws IOException {
        this.f11229a.h(i10);
    }

    @Override // ff.j
    public final int read(byte[] bArr) throws IOException {
        return this.f11229a.read(bArr, 0, bArr.length);
    }
}
