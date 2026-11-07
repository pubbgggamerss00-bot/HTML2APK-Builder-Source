package ve;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class k0 implements Closeable {
    public final float E() throws IOException {
        return (i0() / 65536.0f) + Z();
    }

    public final Calendar M() throws IOException {
        long jN = N();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(1904, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        calendar.setTimeInMillis((jN * 1000) + calendar.getTimeInMillis());
        return calendar;
    }

    public abstract long N() throws IOException;

    public abstract short Z() throws IOException;

    public final String d0(int i10, Charset charset) throws IOException {
        return new String(z(i10), charset);
    }

    public final int e0() throws IOException {
        int i10 = read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException("premature EOF");
    }

    public final int[] f0(int i10) throws IOException {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = read();
        }
        return iArr;
    }

    public final long g0() throws IOException {
        long j10 = read();
        long j11 = read();
        long j12 = read();
        long j13 = read();
        if (j13 >= 0) {
            return (j10 << 24) + (j11 << 16) + (j12 << 8) + j13;
        }
        throw new EOFException();
    }

    public abstract long h() throws IOException;

    public abstract int i0() throws IOException;

    public final int[] k0(int i10) throws IOException {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i0();
        }
        return iArr;
    }

    public abstract InputStream l() throws IOException;

    public abstract long p();

    public abstract int read() throws IOException;

    public abstract int read(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void seek(long j10) throws IOException;

    public final byte[] z(int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                break;
            }
            i11 += i12;
        }
        if (i11 == i10) {
            return bArr;
        }
        throw new IOException("Unexpected end of TTF stream reached");
    }
}
