package ef;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.BitSet;
import p.i0;

/* loaded from: classes2.dex */
public final class g implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public File f8718b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f8719c;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f8721e;

    /* renamed from: f, reason: collision with root package name */
    public volatile byte[][] f8722f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8723g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8724h;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8725j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8726k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f8727l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8717a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile int f8720d = 0;

    public g(b bVar) throws IOException {
        BitSet bitSet = new BitSet();
        this.f8721e = bitSet;
        this.f8727l = false;
        boolean z10 = !bVar.f8698a || bVar.f8700c >= 0;
        this.f8726k = z10;
        this.f8725j = z10 && bVar.f8699b;
        long j10 = bVar.f8701d;
        int iMin = Integer.MAX_VALUE;
        this.f8724h = j10 > 0 ? (int) Math.min(2147483647L, j10 / 4096) : Integer.MAX_VALUE;
        if (bVar.f8698a) {
            long j11 = bVar.f8700c;
            if (j11 >= 0) {
                iMin = (int) Math.min(2147483647L, j11 / 4096);
            }
        } else {
            iMin = 0;
        }
        this.f8723g = iMin;
        this.f8722f = new byte[z10 ? iMin : 100000][];
        bitSet.set(0, this.f8722f.length);
    }

    public static g p() {
        try {
            return new g(new b(true, false, -1L));
        } catch (IOException e10) {
            Log.e("PdfBox-Android", "Unexpected exception occurred creating main memory scratch file instance: " + e10.getMessage());
            return null;
        }
    }

    public final void E(int i10, byte[] bArr) throws IOException {
        if (i10 < 0 || i10 >= this.f8720d) {
            h();
            StringBuilder sbB = i0.b(i10, "Page index out of range: ", ". Max value: ");
            sbB.append(this.f8720d - 1);
            throw new IOException(sbB.toString());
        }
        if (bArr.length != 4096) {
            throw new IOException(x0.a.a(new StringBuilder("Wrong page size to write: "), bArr.length, ". Expected: 4096"));
        }
        if (i10 >= this.f8723g) {
            synchronized (this.f8717a) {
                h();
                this.f8719c.seek((i10 - this.f8723g) * 4096);
                this.f8719c.write(bArr);
            }
            return;
        }
        if (this.f8726k) {
            this.f8722f[i10] = bArr;
        } else {
            synchronized (this.f8717a) {
                this.f8722f[i10] = bArr;
            }
        }
        h();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f8717a) {
            try {
                if (this.f8727l) {
                    return;
                }
                this.f8727l = true;
                RandomAccessFile randomAccessFile = this.f8719c;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        e = null;
                    } catch (IOException e10) {
                        e = e10;
                    }
                } else {
                    e = null;
                }
                File file = this.f8718b;
                if (file != null && !file.delete() && this.f8718b.exists() && e == null) {
                    e = new IOException("Error deleting scratch file: " + this.f8718b.getAbsolutePath());
                }
                synchronized (this.f8721e) {
                    this.f8721e.clear();
                    this.f8720d = 0;
                }
                if (e != null) {
                    throw e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() throws IOException {
        if (this.f8727l) {
            throw new IOException("Scratch file already closed");
        }
    }

    public final void l() throws IOException {
        synchronized (this.f8717a) {
            try {
                h();
                if (this.f8720d >= this.f8724h) {
                    return;
                }
                if (this.f8725j) {
                    if (this.f8719c == null) {
                        this.f8718b = File.createTempFile("PDFBox", ".tmp", null);
                        try {
                            this.f8719c = new RandomAccessFile(this.f8718b, "rw");
                        } catch (IOException e10) {
                            if (!this.f8718b.delete()) {
                                Log.w("PdfBox-Android", "Error deleting scratch file: " + this.f8718b.getAbsolutePath());
                            }
                            throw e10;
                        }
                    }
                    long length = this.f8719c.length();
                    long j10 = (this.f8720d - this.f8723g) * 4096;
                    if (j10 != length) {
                        throw new IOException("Expected scratch file size of " + j10 + " but found " + length + " in file " + this.f8718b);
                    }
                    if (this.f8720d + 16 > this.f8720d) {
                        long j11 = 65536 + length;
                        this.f8719c.setLength(j11);
                        if (j11 != this.f8719c.length()) {
                            long filePointer = this.f8719c.getFilePointer();
                            this.f8719c.seek(length + 65535);
                            this.f8719c.write(0);
                            this.f8719c.seek(filePointer);
                            Log.d("PdfBox-Android", "fileLen after2:  " + j11 + ", raf length: " + this.f8719c.length() + ", file length: " + this.f8718b.length());
                        }
                        this.f8721e.set(this.f8720d, this.f8720d + 16);
                    }
                } else if (!this.f8726k) {
                    int length2 = this.f8722f.length;
                    int iMin = (int) Math.min(length2 * 2, 2147483647L);
                    if (iMin > length2) {
                        byte[][] bArr = new byte[iMin][];
                        System.arraycopy(this.f8722f, 0, bArr, 0, length2);
                        this.f8722f = bArr;
                        this.f8721e.set(length2, iMin);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] z(int i10) throws IOException {
        byte[] bArr;
        if (i10 < 0 || i10 >= this.f8720d) {
            h();
            StringBuilder sbB = i0.b(i10, "Page index out of range: ", ". Max value: ");
            sbB.append(this.f8720d - 1);
            throw new IOException(sbB.toString());
        }
        if (i10 < this.f8723g) {
            byte[] bArr2 = this.f8722f[i10];
            if (bArr2 != null) {
                return bArr2;
            }
            h();
            throw new IOException(ad.b.b(i10, "Requested page with index ", " was not written before."));
        }
        synchronized (this.f8717a) {
            try {
                RandomAccessFile randomAccessFile = this.f8719c;
                if (randomAccessFile == null) {
                    h();
                    throw new IOException("Missing scratch file to read page with index " + i10 + " from.");
                }
                bArr = new byte[4096];
                randomAccessFile.seek((i10 - this.f8723g) * 4096);
                this.f8719c.readFully(bArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }
}
