package ef;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import m0.r;

/* loaded from: classes2.dex */
public final class h implements f, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final int f8728a;

    /* renamed from: b, reason: collision with root package name */
    public g f8729b;

    /* renamed from: d, reason: collision with root package name */
    public int f8731d;

    /* renamed from: e, reason: collision with root package name */
    public long f8732e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f8733f;

    /* renamed from: g, reason: collision with root package name */
    public int f8734g;

    /* renamed from: c, reason: collision with root package name */
    public long f8730c = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8735h = false;

    /* renamed from: j, reason: collision with root package name */
    public int[] f8736j = new int[16];

    /* renamed from: k, reason: collision with root package name */
    public int f8737k = 0;

    public h(g gVar) throws IOException {
        gVar.h();
        this.f8729b = gVar;
        this.f8728a = 4096;
        h();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        g gVar = this.f8729b;
        if (gVar != null) {
            int[] iArr = this.f8736j;
            int i10 = this.f8737k;
            synchronized (gVar.f8721e) {
                for (int i11 = 0; i11 < i10; i11++) {
                    try {
                        int i12 = iArr[i11];
                        if (i12 >= 0 && i12 < gVar.f8720d && !gVar.f8721e.get(i12)) {
                            gVar.f8721e.set(i12);
                            if (i12 < gVar.f8723g) {
                                gVar.f8722f[i12] = null;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f8729b = null;
            this.f8736j = null;
            this.f8733f = null;
            this.f8732e = 0L;
            this.f8731d = -1;
            this.f8734g = 0;
            this.f8730c = 0L;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // ef.f
    public final boolean g() throws IOException {
        l();
        return this.f8732e + ((long) this.f8734g) >= this.f8730c;
    }

    @Override // ef.f
    public final long getPosition() throws IOException {
        l();
        return this.f8732e + this.f8734g;
    }

    public final void h() throws IOException {
        int iNextSetBit;
        int i10 = this.f8737k;
        int i11 = i10 + 1;
        int[] iArr = this.f8736j;
        if (i11 >= iArr.length) {
            int length = iArr.length * 2;
            if (length < iArr.length) {
                if (iArr.length == Integer.MAX_VALUE) {
                    throw new IOException("Maximum buffer size reached.");
                }
                length = Integer.MAX_VALUE;
            }
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f8736j = iArr2;
        }
        g gVar = this.f8729b;
        synchronized (gVar.f8721e) {
            try {
                iNextSetBit = gVar.f8721e.nextSetBit(0);
                if (iNextSetBit < 0) {
                    gVar.l();
                    iNextSetBit = gVar.f8721e.nextSetBit(0);
                    if (iNextSetBit < 0) {
                        throw new IOException("Maximum allowed scratch file memory exceeded.");
                    }
                }
                gVar.f8721e.clear(iNextSetBit);
                if (iNextSetBit >= gVar.f8720d) {
                    gVar.f8720d = iNextSetBit + 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int[] iArr3 = this.f8736j;
        int i12 = this.f8737k;
        iArr3[i12] = iNextSetBit;
        this.f8731d = i12;
        int i13 = this.f8728a;
        this.f8732e = i12 * i13;
        this.f8737k = i12 + 1;
        this.f8733f = new byte[i13];
        this.f8734g = 0;
    }

    public final void l() throws IOException {
        g gVar = this.f8729b;
        if (gVar == null) {
            throw new IOException("Buffer already closed");
        }
        gVar.h();
    }

    @Override // ef.f
    public final long length() throws IOException {
        return this.f8730c;
    }

    public final boolean p(boolean z10) throws IOException {
        int i10 = this.f8734g;
        int i11 = this.f8728a;
        if (i10 < i11) {
            return true;
        }
        if (this.f8735h) {
            this.f8729b.E(this.f8736j[this.f8731d], this.f8733f);
            this.f8735h = false;
        }
        int i12 = this.f8731d + 1;
        if (i12 >= this.f8737k) {
            if (!z10) {
                return false;
            }
            h();
            return true;
        }
        g gVar = this.f8729b;
        int[] iArr = this.f8736j;
        this.f8731d = i12;
        this.f8733f = gVar.z(iArr[i12]);
        this.f8732e = this.f8731d * i11;
        this.f8734g = 0;
        return true;
    }

    @Override // ef.f
    public final int read() throws IOException {
        l();
        if (this.f8732e + this.f8734g >= this.f8730c) {
            return -1;
        }
        if (!p(false)) {
            throw new IOException("Unexpectedly no bytes available for read in buffer.");
        }
        byte[] bArr = this.f8733f;
        int i10 = this.f8734g;
        this.f8734g = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // ef.f
    public final void seek(long j10) throws IOException {
        l();
        if (j10 > this.f8730c) {
            throw new EOFException();
        }
        if (j10 < 0) {
            throw new IOException(r.a("Negative seek offset: ", j10));
        }
        long j11 = this.f8732e;
        int i10 = this.f8728a;
        if (j10 >= j11 && j10 <= i10 + j11) {
            this.f8734g = (int) (j10 - j11);
            return;
        }
        if (this.f8735h) {
            this.f8729b.E(this.f8736j[this.f8731d], this.f8733f);
            this.f8735h = false;
        }
        long j12 = i10;
        int i11 = (int) (j10 / j12);
        if (j10 % j12 == 0 && j10 == this.f8730c) {
            i11--;
        }
        this.f8733f = this.f8729b.z(this.f8736j[i11]);
        this.f8731d = i11;
        long j13 = i11 * j12;
        this.f8732e = j13;
        this.f8734g = (int) (j10 - j13);
    }

    public final void write(int i10) throws IOException {
        l();
        p(true);
        byte[] bArr = this.f8733f;
        int i11 = this.f8734g;
        int i12 = i11 + 1;
        this.f8734g = i12;
        bArr[i11] = (byte) i10;
        this.f8735h = true;
        long j10 = this.f8732e + i12;
        if (j10 > this.f8730c) {
            this.f8730c = j10;
        }
    }

    @Override // ef.f
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        l();
        long j10 = this.f8732e + this.f8734g;
        long j11 = this.f8730c;
        if (j10 >= j11) {
            return -1;
        }
        int iMin = (int) Math.min(i11, j11 - j10);
        int i12 = 0;
        while (iMin > 0) {
            if (p(false)) {
                int iMin2 = Math.min(iMin, this.f8728a - this.f8734g);
                System.arraycopy(this.f8733f, this.f8734g, bArr, i10, iMin2);
                this.f8734g += iMin2;
                i12 += iMin2;
                i10 += iMin2;
                iMin -= iMin2;
            } else {
                throw new IOException("Unexpectedly no bytes available for read in buffer.");
            }
        }
        return i12;
    }

    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        l();
        while (i11 > 0) {
            p(true);
            int iMin = Math.min(i11, this.f8728a - this.f8734g);
            System.arraycopy(bArr, i10, this.f8733f, this.f8734g, iMin);
            this.f8734g += iMin;
            this.f8735h = true;
            i10 += iMin;
            i11 -= iMin;
        }
        long j10 = this.f8732e + this.f8734g;
        if (j10 > this.f8730c) {
            this.f8730c = j10;
        }
    }
}
