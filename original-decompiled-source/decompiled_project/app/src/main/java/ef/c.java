package ef;

import com.google.protobuf.DescriptorProtos;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c extends InputStream implements f {

    /* renamed from: j, reason: collision with root package name */
    public final RandomAccessFile f8710j;

    /* renamed from: k, reason: collision with root package name */
    public final long f8711k;

    /* renamed from: a, reason: collision with root package name */
    public final int f8702a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final long f8703b = -4096;

    /* renamed from: c, reason: collision with root package name */
    public final int f8704c = DescriptorProtos.Edition.EDITION_2023_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8705d = null;

    /* renamed from: e, reason: collision with root package name */
    public final a f8706e = new a();

    /* renamed from: f, reason: collision with root package name */
    public long f8707f = -1;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f8708g = new byte[4096];

    /* renamed from: h, reason: collision with root package name */
    public int f8709h = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f8712l = 0;

    public class a extends LinkedHashMap<Long, byte[]> {
        public a() {
            super(DescriptorProtos.Edition.EDITION_2023_VALUE, 0.75f, true);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Long, byte[]> entry) {
            int size = size();
            c cVar = c.this;
            boolean z10 = size > cVar.f8704c;
            if (z10) {
                cVar.f8705d = entry.getValue();
            }
            return z10;
        }
    }

    public c(File file) throws IOException {
        this.f8710j = new RandomAccessFile(file, "r");
        this.f8711k = file.length();
        seek(0L);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(this.f8711k - this.f8712l, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8710j.close();
        this.f8706e.clear();
    }

    @Override // ef.f
    public final boolean g() throws IOException {
        return peek() == -1;
    }

    @Override // ef.f
    public final long getPosition() {
        return this.f8712l;
    }

    public final void h(int i10) throws IOException {
        seek(this.f8712l - i10);
    }

    @Override // ef.f
    public final long length() throws IOException {
        return this.f8711k;
    }

    public final int peek() throws IOException {
        int i10 = read();
        if (i10 != -1) {
            h(1);
        }
        return i10;
    }

    @Override // java.io.InputStream, ef.f
    public final int read() throws IOException {
        long j10 = this.f8712l;
        if (j10 >= this.f8711k) {
            return -1;
        }
        if (this.f8709h == this.f8702a) {
            seek(j10);
        }
        this.f8712l++;
        byte[] bArr = this.f8708g;
        int i10 = this.f8709h;
        this.f8709h = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // ef.f
    public final void seek(long j10) throws IOException {
        long j11 = this.f8703b & j10;
        if (j11 != this.f8707f) {
            Long lValueOf = Long.valueOf(j11);
            a aVar = this.f8706e;
            byte[] bArr = aVar.get(lValueOf);
            if (bArr == null) {
                RandomAccessFile randomAccessFile = this.f8710j;
                randomAccessFile.seek(j11);
                byte[] bArr2 = this.f8705d;
                int i10 = this.f8702a;
                if (bArr2 != null) {
                    this.f8705d = null;
                } else {
                    bArr2 = new byte[i10];
                }
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = randomAccessFile.read(bArr2, i11, i10 - i11);
                    if (i12 < 0) {
                        break;
                    } else {
                        i11 += i12;
                    }
                }
                aVar.put(Long.valueOf(j11), bArr2);
                bArr = bArr2;
            }
            this.f8707f = j11;
            this.f8708g = bArr;
        }
        this.f8709h = (int) (j10 - this.f8707f);
        this.f8712l = j10;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.f8712l;
        long j12 = this.f8711k;
        if (j12 - j11 < j10) {
            j10 = j12 - j11;
        }
        int i10 = this.f8702a;
        if (j10 < i10) {
            int i11 = this.f8709h;
            if (i11 + j10 <= i10) {
                this.f8709h = (int) (i11 + j10);
                this.f8712l = j11 + j10;
                return j10;
            }
        }
        seek(j11 + j10);
        return j10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream, ef.f
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f8712l;
        long j11 = this.f8711k;
        if (j10 >= j11) {
            return -1;
        }
        int i12 = this.f8709h;
        int i13 = this.f8702a;
        if (i12 == i13) {
            seek(j10);
        }
        int iMin = Math.min(i13 - this.f8709h, i11);
        long j12 = this.f8712l;
        if (j11 - j12 < i13) {
            iMin = Math.min(iMin, (int) (j11 - j12));
        }
        System.arraycopy(this.f8708g, this.f8709h, bArr, i10, iMin);
        this.f8709h += iMin;
        this.f8712l += iMin;
        return iMin;
    }
}
