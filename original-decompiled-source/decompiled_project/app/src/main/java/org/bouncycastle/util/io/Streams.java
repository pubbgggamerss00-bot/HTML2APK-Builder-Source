package org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class Streams {
    private static int BUFFER_SIZE = 4096;

    public static void drain(InputStream inputStream) throws IOException {
        int i10 = BUFFER_SIZE;
        while (inputStream.read(new byte[i10], 0, i10) >= 0) {
        }
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        pipeAll(inputStream, outputStream, BUFFER_SIZE);
    }

    public static long pipeAllLimited(InputStream inputStream, long j10, OutputStream outputStream) throws IOException {
        int i10 = BUFFER_SIZE;
        byte[] bArr = new byte[i10];
        long j11 = 0;
        while (true) {
            int i11 = inputStream.read(bArr, 0, i10);
            if (i11 < 0) {
                return j11;
            }
            long j12 = i11;
            if (j10 - j11 < j12) {
                throw new StreamOverflowException("Data Overflow");
            }
            j11 += j12;
            outputStream.write(bArr, 0, i11);
        }
    }

    public static byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAllLimited(inputStream, i10, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void validateBufferArguments(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        int length = bArr.length - i10;
        if ((length | i10 | i11 | (length - i11)) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void writeBufTo(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        while (true) {
            int i11 = inputStream.read(bArr, 0, i10);
            if (i11 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i11);
            }
        }
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 < 0) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }
}
