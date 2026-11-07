package re;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23510a;

    /* renamed from: b, reason: collision with root package name */
    public int f23511b = 0;

    public p(byte[] bArr) {
        this.f23510a = bArr;
    }

    public final int a(int i10) throws IOException {
        int i11;
        try {
            i11 = this.f23510a[this.f23511b + i10] & 255;
        } catch (RuntimeException unused) {
            i11 = -1;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw new EOFException();
    }

    public final int b() {
        try {
            byte[] bArr = this.f23510a;
            int i10 = this.f23511b;
            int i11 = bArr[i10] & 255;
            this.f23511b = i10 + 1;
            return i11;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public final void c() throws IOException {
        try {
            byte[] bArr = this.f23510a;
            int i10 = this.f23511b;
            byte b10 = bArr[i10];
            this.f23511b = i10 + 1;
        } catch (RuntimeException unused) {
        }
    }

    public final byte[] d(int i10) throws IOException {
        if (i10 < 0) {
            throw new IOException("length is negative");
        }
        byte[] bArr = this.f23510a;
        int length = bArr.length;
        int i11 = this.f23511b;
        if (length - i11 < i10) {
            throw new EOFException();
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i11, bArr2, 0, i10);
        this.f23511b += i10;
        return bArr2;
    }

    public final int e() throws IOException {
        int iB = b();
        int iB2 = b();
        int iB3 = b();
        int iB4 = b();
        if ((iB | iB2 | iB3 | iB4) >= 0) {
            return (iB << 24) | (iB2 << 16) | (iB3 << 8) | iB4;
        }
        throw new EOFException();
    }

    public final int f() throws IOException {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new EOFException();
    }

    public final int g() throws IOException {
        int iB = b();
        int iB2 = b();
        if ((iB | iB2) >= 0) {
            return (iB << 8) | iB2;
        }
        throw new EOFException();
    }
}
