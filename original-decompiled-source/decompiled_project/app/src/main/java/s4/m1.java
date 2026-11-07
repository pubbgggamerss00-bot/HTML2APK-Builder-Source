package s4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m1 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f24323a;

    public m1(FileOutputStream fileOutputStream) {
        this.f24323a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f24323a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f24323a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b10) throws IOException {
        kotlin.jvm.internal.r.e(b10, "b");
        this.f24323a.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.r.e(bytes, "bytes");
        this.f24323a.write(bytes, i10, i11);
    }
}
