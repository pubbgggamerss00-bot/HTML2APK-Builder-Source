package oc;

import d0.h0;
import i0.u2;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import r1.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19131a = 0;

    /* renamed from: oc.a$a, reason: collision with other inner class name */
    public static class C0216a extends OutputStream {
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            bArr.getClass();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            bArr.getClass();
        }
    }

    static {
        new C0216a();
    }

    public static void a(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        if (length < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i10 = 0;
        while (i10 < length) {
            int i11 = inputStream.read(bArr, i10, length - i10);
            if (i11 == -1) {
                break;
            } else {
                i10 += i11;
            }
        }
        if (i10 != length) {
            throw new EOFException(f.a(i10, length, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static byte[] b(FileInputStream fileInputStream, long j10) throws IOException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(h0.b("expectedSize (%s) must be non-negative", Long.valueOf(j10)));
        }
        if (j10 > 2147483639) {
            throw new OutOfMemoryError(j10 + " bytes is too large to fit in a byte array");
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = i10 - i11;
            int i13 = fileInputStream.read(bArr, i12, i11);
            if (i13 == -1) {
                return Arrays.copyOf(bArr, i12);
            }
            i11 -= i13;
        }
        int i14 = fileInputStream.read();
        if (i14 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i14});
        return d(fileInputStream, arrayDeque, i10 + 1);
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        inputStream.getClass();
        return d(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] d(InputStream inputStream, ArrayDeque arrayDeque, int i10) throws IOException {
        int i11 = 8192;
        while (i10 < 2147483639) {
            int iMin = Math.min(i11, 2147483639 - i10);
            byte[] bArr = new byte[iMin];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < iMin) {
                int i13 = inputStream.read(bArr, i12, iMin - i12);
                if (i13 == -1) {
                    byte[] bArr2 = new byte[i10];
                    int i14 = i10;
                    while (i14 > 0) {
                        byte[] bArr3 = (byte[]) arrayDeque.removeFirst();
                        int iMin2 = Math.min(i14, bArr3.length);
                        System.arraycopy(bArr3, 0, bArr2, i10 - i14, iMin2);
                        i14 -= iMin2;
                    }
                    return bArr2;
                }
                i12 += i13;
                i10 += i13;
            }
            i11 = u2.i(i11 * 2);
        }
        if (inputStream.read() != -1) {
            throw new OutOfMemoryError("input is too large to fit in a byte array");
        }
        byte[] bArr4 = new byte[2147483639];
        int i15 = 2147483639;
        while (i15 > 0) {
            byte[] bArr5 = (byte[]) arrayDeque.removeFirst();
            int iMin3 = Math.min(i15, bArr5.length);
            System.arraycopy(bArr5, 0, bArr4, 2147483639 - i15, iMin3);
            i15 -= iMin3;
        }
        return bArr4;
    }
}
