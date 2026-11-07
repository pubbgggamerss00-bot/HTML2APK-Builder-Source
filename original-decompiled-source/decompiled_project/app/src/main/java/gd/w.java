package gd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f11994a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f11995b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11996c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11997d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11998e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11999f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12000g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f12001h;

    /* renamed from: j, reason: collision with root package name */
    public int f12002j;

    /* renamed from: k, reason: collision with root package name */
    public final u f12003k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12004l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12005m;

    public w(p pVar, InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(inputStream);
        this.f12003k = pVar.g();
        this.f11996c = pVar.e();
        this.f12001h = Arrays.copyOf(bArr, bArr.length);
        int iD = pVar.d();
        this.f12004l = iD;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iD + 1);
        this.f11994a = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.f12005m = iD - pVar.c();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(pVar.f() + 16);
        this.f11995b = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.f11997d = false;
        this.f11998e = false;
        this.f11999f = false;
        this.f12002j = 0;
        this.f12000g = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.f11995b.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        super.close();
    }

    public final void h() throws IOException {
        byte b10;
        while (!this.f11998e && this.f11994a.remaining() > 0) {
            int i10 = ((FilterInputStream) this).in.read(this.f11994a.array(), this.f11994a.position(), this.f11994a.remaining());
            if (i10 > 0) {
                ByteBuffer byteBuffer = this.f11994a;
                byteBuffer.position(byteBuffer.position() + i10);
            } else if (i10 == -1) {
                this.f11998e = true;
            } else if (i10 == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (this.f11998e) {
            b10 = 0;
        } else {
            ByteBuffer byteBuffer2 = this.f11994a;
            b10 = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.f11994a;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.f11994a.flip();
        this.f11995b.clear();
        try {
            this.f12003k.b(this.f11994a, this.f12002j, this.f11998e, this.f11995b);
            this.f12002j++;
            this.f11995b.flip();
            this.f11994a.clear();
            if (this.f11998e) {
                return;
            }
            this.f11994a.clear();
            this.f11994a.limit(this.f12004l + 1);
            this.f11994a.put(b10);
        } catch (GeneralSecurityException e10) {
            this.f12000g = true;
            this.f11995b.limit(0);
            throw new IOException(e10.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.f12002j + " endOfCiphertext:" + this.f11998e, e10);
        }
    }

    public final void l() throws IOException {
        if (this.f11997d) {
            this.f12000g = true;
            this.f11995b.limit(0);
            throw new IOException("Decryption failed.");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f11996c);
        while (byteBufferAllocate.remaining() > 0) {
            int i10 = ((FilterInputStream) this).in.read(byteBufferAllocate.array(), byteBufferAllocate.position(), byteBufferAllocate.remaining());
            if (i10 == -1) {
                this.f12000g = true;
                this.f11995b.limit(0);
                throw new IOException("Ciphertext is too short");
            }
            if (i10 == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
            byteBufferAllocate.position(byteBufferAllocate.position() + i10);
        }
        byteBufferAllocate.flip();
        try {
            this.f12003k.a(byteBufferAllocate, this.f12001h);
            this.f11997d = true;
        } catch (GeneralSecurityException e10) {
            throw new IOException(e10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i10 = read(bArr, 0, 1);
        if (i10 == 1) {
            return bArr[0] & 255;
        }
        if (i10 == -1) {
            return i10;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        int i10;
        long j11 = this.f12004l;
        if (j10 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j11, j10);
        byte[] bArr = new byte[iMin];
        long j12 = j10;
        while (j12 > 0 && (i10 = read(bArr, 0, (int) Math.min(iMin, j12))) > 0) {
            j12 -= i10;
        }
        return j10 - j12;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.f12002j + "\nciphertextSegmentSize:" + this.f12004l + "\nheaderRead:" + this.f11997d + "\nendOfCiphertext:" + this.f11998e + "\nendOfPlaintext:" + this.f11999f + "\ndecryptionErrorOccured:" + this.f12000g + "\nciphertextSgement position:" + this.f11994a.position() + " limit:" + this.f11994a.limit() + "\nplaintextSegment position:" + this.f11995b.position() + " limit:" + this.f11995b.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (!this.f12000g) {
                if (!this.f11997d) {
                    l();
                    this.f11994a.clear();
                    this.f11994a.limit(this.f12005m + 1);
                }
                if (this.f11999f) {
                    return -1;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        break;
                    }
                    if (this.f11995b.remaining() == 0) {
                        if (this.f11998e) {
                            this.f11999f = true;
                            break;
                        }
                        h();
                    }
                    int iMin = Math.min(this.f11995b.remaining(), i11 - i12);
                    this.f11995b.get(bArr, i12 + i10, iMin);
                    i12 += iMin;
                }
                if (i12 == 0 && this.f11999f) {
                    return -1;
                }
                return i12;
            }
            throw new IOException("Decryption failed.");
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
