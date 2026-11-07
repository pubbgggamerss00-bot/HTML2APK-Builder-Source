package ff;

import java.io.EOFException;
import java.io.IOException;
import java.io.PushbackInputStream;

/* loaded from: classes2.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final PushbackInputStream f11211a;

    /* renamed from: b, reason: collision with root package name */
    public int f11212b = 0;

    public d(cf.h hVar) {
        this.f11211a = new PushbackInputStream(hVar, 32767);
    }

    @Override // ff.j
    public final void b0(int i10) throws IOException {
        this.f11211a.unread(i10);
        this.f11212b--;
    }

    @Override // ff.j
    public final byte[] c0(int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        do {
            int i12 = this.f11211a.read(bArr, i11, i10 - i11);
            if (i12 > 0) {
                this.f11212b += i12;
            } else {
                i12 = -1;
            }
            if (i12 < 0) {
                throw new EOFException();
            }
            i11 += i12;
        } while (i11 < i10);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11211a.close();
    }

    @Override // ff.j
    public final boolean g() throws IOException {
        return peek() == -1;
    }

    @Override // ff.j
    public final long getPosition() throws IOException {
        return this.f11212b;
    }

    @Override // ff.j
    public final void p0(byte[] bArr) throws IOException {
        this.f11211a.unread(bArr);
        this.f11212b -= bArr.length;
    }

    @Override // ff.j
    public final int peek() throws IOException {
        PushbackInputStream pushbackInputStream = this.f11211a;
        int i10 = pushbackInputStream.read();
        if (i10 != -1) {
            pushbackInputStream.unread(i10);
        }
        return i10;
    }

    @Override // ff.j
    public final int read() throws IOException {
        int i10 = this.f11211a.read();
        this.f11212b++;
        return i10;
    }

    @Override // ff.j
    public final void s(int i10, byte[] bArr) throws IOException {
        this.f11211a.unread(bArr, 0, i10);
        this.f11212b -= i10;
    }

    @Override // ff.j
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f11211a.read(bArr);
        if (i10 <= 0) {
            return -1;
        }
        this.f11212b += i10;
        return i10;
    }
}
