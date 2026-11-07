package m5;

import androidx.activity.c0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import y5.b0;

/* loaded from: classes.dex */
public final class f extends b0 {
    public static void i(File file, File file2) throws IOException {
        j.e("<this>", file);
        if (!file.exists()) {
            throw new g(file, null, "The source file doesn't exist.");
        }
        if (file2.exists() && !file2.delete()) {
            throw new b(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new c(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                f5.b.f(fileInputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static byte[] j(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i6 = (int) length;
            byte[] bArrCopyOf = new byte[i6];
            int i7 = i6;
            int i8 = 0;
            while (i7 > 0) {
                int i9 = fileInputStream.read(bArrCopyOf, i8, i7);
                if (i9 < 0) {
                    break;
                }
                i7 -= i9;
                i8 += i9;
            }
            if (i7 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i8);
                j.d("copyOf(...)", bArrCopyOf);
            } else {
                int i10 = fileInputStream.read();
                if (i10 != -1) {
                    a aVar = new a(8193);
                    aVar.write(i10);
                    f5.b.f(fileInputStream, aVar, 8192);
                    int size = aVar.size() + i6;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = aVar.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    j.d("copyOf(...)", bArrCopyOf);
                    System.arraycopy(bArrA, 0, bArrCopyOf, i6, aVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.d(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static void k(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void l(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        j.e("charset", charset);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            j.d("getBytes(...)", bytes);
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        j.b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        j.d("allocate(...)", byteBufferAllocate);
        int i6 = 0;
        int i7 = 0;
        while (i6 < str.length()) {
            int iMin = Math.min(8192 - i7, str.length() - i6);
            int i8 = i6 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            j.d("array(...)", cArrArray);
            str.getChars(i6, i8, cArrArray, i7);
            charBufferAllocate.limit(iMin + i7);
            i7 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i8 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i7 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i6 = i8;
        }
    }
}
