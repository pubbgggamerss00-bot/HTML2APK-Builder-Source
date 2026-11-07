package org.jf.dexlib2.util;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import oc.a;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBackedOdexFile;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import org.jf.dexlib2.dexbacked.raw.OdexHeaderItem;

/* loaded from: classes3.dex */
public class DexUtil {

    public static class InvalidFile extends RuntimeException {
        public InvalidFile() {
        }

        public InvalidFile(String str) {
            super(str);
        }

        public InvalidFile(String str, Throwable th2) {
            super(str, th2);
        }

        public InvalidFile(Throwable th2) {
            super(th2);
        }
    }

    public static class UnsupportedFile extends RuntimeException {
        public UnsupportedFile() {
        }

        public UnsupportedFile(String str) {
            super(str);
        }

        public UnsupportedFile(String str, Throwable th2) {
            super(str, th2);
        }

        public UnsupportedFile(Throwable th2) {
            super(th2);
        }
    }

    public static int verifyCdexHeader(byte[] bArr, int i10) {
        int version = CdexHeaderItem.getVersion(bArr, i10);
        if (version == -1) {
            StringBuilder sb = new StringBuilder("Not a valid cdex magic value:");
            for (int i11 = 0; i11 < 8; i11++) {
                sb.append(String.format(" %02x", Byte.valueOf(bArr[i10 + i11])));
            }
            throw new DexBackedDexFile.NotADexFile(sb.toString());
        }
        if (!CdexHeaderItem.isSupportedCdexVersion(version)) {
            throw new UnsupportedFile(String.format("Dex version %03d is not supported", Integer.valueOf(version)));
        }
        int endian = HeaderItem.getEndian(bArr, i10);
        if (endian == 2018915346) {
            throw new UnsupportedFile("Big endian dex files are not supported");
        }
        if (endian == 305419896) {
            return version;
        }
        throw new InvalidFile(String.format("Invalid endian tag: 0x%x", Integer.valueOf(endian)));
    }

    public static int verifyDexHeader(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(44);
        byte[] bArr = new byte[44];
        try {
            try {
                a.a(inputStream, bArr);
                inputStream.reset();
                return verifyDexHeader(bArr, 0);
            } catch (EOFException unused) {
                throw new DexBackedDexFile.NotADexFile("File is too short");
            }
        } catch (Throwable th2) {
            inputStream.reset();
            throw th2;
        }
    }

    public static void verifyOdexHeader(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(8);
        byte[] bArr = new byte[8];
        try {
            try {
                a.a(inputStream, bArr);
                inputStream.reset();
                verifyOdexHeader(bArr, 0);
            } catch (EOFException unused) {
                throw new DexBackedOdexFile.NotAnOdexFile("File is too short");
            }
        } catch (Throwable th2) {
            inputStream.reset();
            throw th2;
        }
    }

    public static int verifyDexHeader(byte[] bArr, int i10) {
        int version = HeaderItem.getVersion(bArr, i10);
        if (version == -1) {
            StringBuilder sb = new StringBuilder("Not a valid dex magic value:");
            for (int i11 = 0; i11 < 8; i11++) {
                sb.append(String.format(" %02x", Byte.valueOf(bArr[i11])));
            }
            throw new DexBackedDexFile.NotADexFile(sb.toString());
        }
        if (HeaderItem.isSupportedDexVersion(version)) {
            int endian = HeaderItem.getEndian(bArr, i10);
            if (endian == 2018915346) {
                throw new UnsupportedFile("Big endian dex files are not supported");
            }
            if (endian == 305419896) {
                return version;
            }
            throw new InvalidFile(String.format("Invalid endian tag: 0x%x", Integer.valueOf(endian)));
        }
        throw new UnsupportedFile(String.format("Dex version %03d is not supported", Integer.valueOf(version)));
    }

    public static void verifyOdexHeader(byte[] bArr, int i10) {
        int version = OdexHeaderItem.getVersion(bArr, i10);
        if (version == -1) {
            StringBuilder sb = new StringBuilder("Not a valid odex magic value:");
            for (int i11 = 0; i11 < 8; i11++) {
                sb.append(String.format(" %02x", Byte.valueOf(bArr[i11])));
            }
            throw new DexBackedOdexFile.NotAnOdexFile(sb.toString());
        }
        if (!OdexHeaderItem.isSupportedOdexVersion(version)) {
            throw new UnsupportedFile(String.format("Odex version %03d is not supported", Integer.valueOf(version)));
        }
    }
}
