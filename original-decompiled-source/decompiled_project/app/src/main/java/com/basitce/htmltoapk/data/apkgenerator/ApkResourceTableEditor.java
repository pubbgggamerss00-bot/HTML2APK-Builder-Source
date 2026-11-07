package com.basitce.htmltoapk.data.apkgenerator;

import java.util.Arrays;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class ApkResourceTableEditor {
    public static final int $stable = 0;
    public static final ApkResourceTableEditor INSTANCE = new ApkResourceTableEditor();
    private static final int RES_TABLE_PACKAGE_TYPE = 512;
    private static final int RES_TABLE_TYPE = 2;

    private ApkResourceTableEditor() {
    }

    private final int findPackageChunkOffset(byte[] bArr) {
        if (bArr.length < 12 || readU16(bArr, 0) != 2) {
            return -1;
        }
        int u16 = readU16(bArr, 2);
        if (readU32(bArr, 4) != bArr.length) {
            return -1;
        }
        while (u16 + 8 <= bArr.length) {
            int u162 = readU16(bArr, u16);
            readU16(bArr, u16 + 2);
            int u32 = readU32(bArr, u16 + 4);
            if (u162 == 512) {
                return u16;
            }
            if (u32 <= 0 || (u16 = u16 + u32) > bArr.length) {
                break;
            }
        }
        return -1;
    }

    private final int readU16(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    private final int readU32(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private final String readUtf16Fixed(byte[] bArr, int i10, int i11) {
        int u16;
        StringBuilder sb = new StringBuilder();
        for (int i12 = 0; i12 + 1 < i11 && (u16 = readU16(bArr, i10 + i12)) != 0; i12 += 2) {
            sb.append((char) u16);
        }
        String string = sb.toString();
        r.d(string, "toString(...)");
        return string;
    }

    private final void writeUtf16Fixed(byte[] bArr, int i10, int i11, String str) {
        int length = str.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (i12 + 1 >= i11) {
                break;
            }
            int i14 = i10 + i12;
            bArr[i14] = (byte) (cCharAt & 255);
            bArr[i14 + 1] = (byte) ((cCharAt >> '\b') & 255);
            i12 += 2;
        }
        while (i12 < i11) {
            bArr[i10 + i12] = 0;
            i12++;
        }
    }

    public final byte[] updatePackageName(byte[] data, String oldPackage, String newPackage) {
        r.e(data, "data");
        r.e(oldPackage, "oldPackage");
        r.e(newPackage, "newPackage");
        if (newPackage.length() > 127) {
            throw new IllegalArgumentException("New package name is too long for resources.arsc header");
        }
        int iFindPackageChunkOffset = findPackageChunkOffset(data);
        if (iFindPackageChunkOffset >= 0) {
            int i10 = iFindPackageChunkOffset + 12;
            if (iFindPackageChunkOffset + 268 <= data.length && r.a(readUtf16Fixed(data, i10, 256), oldPackage)) {
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                r.d(bArrCopyOf, "copyOf(...)");
                writeUtf16Fixed(bArrCopyOf, i10, 256, newPackage);
                return bArrCopyOf;
            }
        }
        return data;
    }
}
