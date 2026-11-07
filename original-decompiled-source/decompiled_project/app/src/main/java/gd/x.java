package gd;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class x extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final v f12006a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12007b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f12008c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f12009d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12010e;

    public x(p pVar, FileOutputStream fileOutputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(fileOutputStream);
        v vVarH = pVar.h(bArr);
        this.f12006a = vVarH;
        int iF = pVar.f();
        this.f12007b = iF;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iF);
        this.f12008c = byteBufferAllocate;
        this.f12009d = ByteBuffer.allocate(pVar.d());
        byteBufferAllocate.limit(iF - pVar.c());
        ByteBuffer byteBufferB = vVarH.b();
        byte[] bArr2 = new byte[byteBufferB.remaining()];
        byteBufferB.get(bArr2);
        ((FilterOutputStream) this).out.write(bArr2);
        this.f12010e = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f12010e) {
            try {
                this.f12008c.flip();
                this.f12009d.clear();
                this.f12006a.c(this.f12008c, this.f12009d);
                this.f12009d.flip();
                ((FilterOutputStream) this).out.write(this.f12009d.array(), this.f12009d.position(), this.f12009d.remaining());
                this.f12010e = false;
                super.close();
            } catch (GeneralSecurityException e10) {
                throw new IOException("ptBuffer.remaining():" + this.f12008c.remaining() + " ctBuffer.remaining():" + this.f12009d.remaining(), e10);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (this.f12010e) {
                while (i11 > this.f12008c.remaining()) {
                    int iRemaining = this.f12008c.remaining();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, iRemaining);
                    i10 += iRemaining;
                    i11 -= iRemaining;
                    try {
                        this.f12008c.flip();
                        this.f12009d.clear();
                        this.f12006a.a(this.f12008c, byteBufferWrap, this.f12009d);
                        this.f12009d.flip();
                        ((FilterOutputStream) this).out.write(this.f12009d.array(), this.f12009d.position(), this.f12009d.remaining());
                        this.f12008c.clear();
                        this.f12008c.limit(this.f12007b);
                    } catch (GeneralSecurityException e10) {
                        throw new IOException(e10);
                    }
                }
                this.f12008c.put(bArr, i10, i11);
            } else {
                throw new IOException("Trying to write to closed stream");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
