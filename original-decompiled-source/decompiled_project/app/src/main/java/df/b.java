package df;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class b extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f7905a;

    /* renamed from: b, reason: collision with root package name */
    public int f7906b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7907c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f7908d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f7909e;

    public b(InputStream inputStream) {
        super(inputStream);
        this.f7905a = 0;
        this.f7906b = 0;
        this.f7907c = false;
        this.f7908d = new byte[5];
        this.f7909e = new byte[4];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7908d = null;
        this.f7907c = true;
        this.f7909e = null;
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        r13 = r14.f7908d;
        r13[r2] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r12 != 126) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        r13[r2] = 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        r4 = r2 - 1;
        r14.f7906b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r4 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        r14.f7907c = true;
        r14.f7908d = null;
        r14.f7909e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        if (r2 >= 5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r2 >= 5) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        r14.f7908d[r2] = 117;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        r14.f7907c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        r1 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        if (r4 >= 5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
    
        r5 = (byte) (r14.f7908d[r4] - 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r5 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
    
        if (r5 > 93) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
    
        r1 = (r1 * 85) + r5;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        r14.f7906b = 0;
        r14.f7907c = true;
        r14.f7908d = null;
        r14.f7909e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        throw new java.io.IOException("Invalid data in Ascii85 stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (r10 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        r14.f7909e[r10] = (byte) (255 & r1);
        r1 = r1 >>> 8;
        r10 = r10 - 1;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read() throws IOException {
        if (this.f7905a >= this.f7906b) {
            if (this.f7907c) {
                return -1;
            }
            this.f7905a = 0;
            while (true) {
                byte b10 = (byte) ((FilterInputStream) this).in.read();
                if (b10 == -1) {
                    this.f7907c = true;
                    return -1;
                }
                byte b11 = b10;
                if (b11 != 10 && b11 != 13 && b11 != 32) {
                    if (b11 == 126) {
                        this.f7907c = true;
                        this.f7909e = null;
                        this.f7908d = null;
                        this.f7906b = 0;
                        return -1;
                    }
                    int i10 = 3;
                    if (b11 == 122) {
                        byte[] bArr = this.f7909e;
                        bArr[3] = 0;
                        bArr[2] = 0;
                        bArr[1] = 0;
                        bArr[0] = 0;
                        this.f7906b = 4;
                    } else {
                        this.f7908d[0] = b11;
                        int i11 = 1;
                        while (true) {
                            if (i11 >= 5) {
                                break;
                            }
                            while (true) {
                                byte b12 = (byte) ((FilterInputStream) this).in.read();
                                if (b12 != -1) {
                                    byte b13 = b12;
                                    if (b13 != 10 && b13 != 13 && b13 != 32) {
                                        break;
                                    }
                                } else {
                                    this.f7907c = true;
                                    return -1;
                                }
                            }
                            i11++;
                        }
                    }
                }
            }
        }
        byte[] bArr2 = this.f7909e;
        int i12 = this.f7905a;
        this.f7905a = i12 + 1;
        return bArr2[i12] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        throw new IOException("Reset is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f7907c && this.f7905a >= this.f7906b) {
            return -1;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f7905a;
            if (i13 < this.f7906b) {
                byte[] bArr2 = this.f7909e;
                this.f7905a = i13 + 1;
                bArr[i12 + i10] = bArr2[i13];
            } else {
                int i14 = read();
                if (i14 == -1) {
                    return i12;
                }
                bArr[i12 + i10] = (byte) i14;
            }
        }
        return i11;
    }
}
