package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cq1 extends FilterInputStream {
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public long f3642t;

    public cq1(InputStream inputStream, long j6) {
        super(inputStream);
        this.f3642t = -1L;
        inputStream.getClass();
        sl1.e("limit must be non-negative", j6 >= 0);
        this.s = j6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.s);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        ((FilterInputStream) this).in.mark(i6);
        this.f3642t = this.s;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.s == 0) {
            return -1;
        }
        int i6 = ((FilterInputStream) this).in.read();
        if (i6 != -1) {
            this.s--;
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f3642t == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.s = this.f3642t;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j6, this.s));
        this.s -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        long j6 = this.s;
        if (j6 == 0) {
            return -1;
        }
        int i8 = ((FilterInputStream) this).in.read(bArr, i6, (int) Math.min(i7, j6));
        if (i8 != -1) {
            this.s -= i8;
        }
        return i8;
    }
}
