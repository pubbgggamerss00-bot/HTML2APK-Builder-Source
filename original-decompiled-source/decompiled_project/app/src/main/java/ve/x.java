package ve;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
public final class x extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f30964a;

    /* renamed from: b, reason: collision with root package name */
    public int f30965b = 0;

    public x(InputStream inputStream) throws IOException {
        this.f30964a = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    this.f30964a = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Override // ve.k0
    public final long N() throws IOException {
        return (l0() << 32) + (l0() & BodyPartID.bodyIdMax);
    }

    @Override // ve.k0
    public final short Z() throws IOException {
        int i10 = read();
        int i11 = read();
        if ((i10 | i11) >= 0) {
            return (short) ((i10 << 8) + i11);
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // ve.k0
    public final long h() throws IOException {
        return this.f30965b;
    }

    @Override // ve.k0
    public final int i0() throws IOException {
        int i10 = read();
        int i11 = read();
        if ((i10 | i11) >= 0) {
            return (i10 << 8) + i11;
        }
        throw new EOFException();
    }

    @Override // ve.k0
    public final InputStream l() throws IOException {
        return new ByteArrayInputStream(this.f30964a);
    }

    public final int l0() throws IOException {
        int i10 = read();
        int i11 = read();
        int i12 = read();
        int i13 = read();
        if ((i10 | i11 | i12 | i13) >= 0) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new EOFException();
    }

    @Override // ve.k0
    public final long p() {
        return this.f30964a.length;
    }

    @Override // ve.k0
    public final int read() throws IOException {
        int i10 = this.f30965b;
        byte[] bArr = this.f30964a;
        if (i10 >= bArr.length) {
            return -1;
        }
        byte b10 = bArr[i10];
        this.f30965b = i10 + 1;
        return (b10 + HPKE.mode_base) % 256;
    }

    @Override // ve.k0
    public final void seek(long j10) throws IOException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IOException(m0.r.a("Illegal seek position: ", j10));
        }
        this.f30965b = (int) j10;
    }

    @Override // ve.k0
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f30965b;
        byte[] bArr2 = this.f30964a;
        if (i12 >= bArr2.length) {
            return -1;
        }
        int iMin = Math.min(i11, bArr2.length - i12);
        System.arraycopy(bArr2, this.f30965b, bArr, i10, iMin);
        this.f30965b += iMin;
        return iMin;
    }
}
