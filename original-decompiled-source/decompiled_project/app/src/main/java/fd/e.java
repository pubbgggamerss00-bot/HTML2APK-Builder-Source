package fd;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import sc.o;
import sc.s;

/* loaded from: classes2.dex */
public final class e extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11174a;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f11175b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f11176c;

    /* renamed from: d, reason: collision with root package name */
    public o<s> f11177d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f11178e;

    @Override // java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream = this.f11175b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f11176c.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = this.f11175b;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        if (!this.f11174a) {
            this.f11174a = true;
            Iterator<o.b<s>> it = this.f11177d.a(sc.b.f24795a).iterator();
            while (it.hasNext()) {
                try {
                    try {
                        InputStream inputStreamA = it.next().f24823b.a(this.f11176c, this.f11178e);
                        int i12 = inputStreamA.read(bArr, i10, i11);
                        if (i12 != 0) {
                            this.f11175b = inputStreamA;
                            this.f11176c.mark(0);
                            return i12;
                        }
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    } catch (IOException unused) {
                        this.f11176c.reset();
                    }
                } catch (GeneralSecurityException unused2) {
                    this.f11176c.reset();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}
