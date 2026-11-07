package ve;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class h0 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public a f30822a;

    /* renamed from: b, reason: collision with root package name */
    public final File f30823b;

    public h0(File file) throws IOException {
        this.f30822a = null;
        this.f30823b = null;
        this.f30822a = new a(file);
        this.f30823b = file;
    }

    @Override // ve.k0
    public final long N() throws IOException {
        return this.f30822a.readLong();
    }

    @Override // ve.k0
    public final short Z() throws IOException {
        return this.f30822a.readShort();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a aVar = this.f30822a;
        if (aVar != null) {
            aVar.close();
            this.f30822a = null;
        }
    }

    @Override // ve.k0
    public final long h() throws IOException {
        return this.f30822a.getFilePointer();
    }

    @Override // ve.k0
    public final int i0() throws IOException {
        return this.f30822a.readUnsignedShort();
    }

    @Override // ve.k0
    public final InputStream l() throws IOException {
        return new FileInputStream(this.f30823b);
    }

    @Override // ve.k0
    public final long p() {
        return this.f30823b.length();
    }

    @Override // ve.k0
    public final int read() throws IOException {
        return this.f30822a.read();
    }

    @Override // ve.k0
    public final void seek(long j10) throws IOException {
        this.f30822a.seek(j10);
    }

    @Override // ve.k0
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f30822a.read(bArr, i10, i11);
    }
}
