package ef;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class d extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final f f8714a;

    /* renamed from: b, reason: collision with root package name */
    public long f8715b = 0;

    public d(f fVar) {
        this.f8714a = fVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long j10 = this.f8715b;
        f fVar = this.f8714a;
        fVar.seek(j10);
        long length = fVar.length() - fVar.getPosition();
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j10 = this.f8715b;
        f fVar = this.f8714a;
        fVar.seek(j10);
        if (fVar.g()) {
            return -1;
        }
        int i10 = fVar.read();
        if (i10 != -1) {
            this.f8715b++;
            return i10;
        }
        Log.e("PdfBox-Android", "read() returns -1, assumed position: " + this.f8715b + ", actual position: " + fVar.getPosition());
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.f8715b;
        f fVar = this.f8714a;
        fVar.seek(j11);
        fVar.seek(this.f8715b + j10);
        this.f8715b += j10;
        return j10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f8715b;
        f fVar = this.f8714a;
        fVar.seek(j10);
        if (fVar.g()) {
            return -1;
        }
        int i12 = fVar.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f8715b += i12;
            return i12;
        }
        Log.e("PdfBox-Android", "read() returns -1, assumed position: " + this.f8715b + ", actual position: " + fVar.getPosition());
        return i12;
    }
}
