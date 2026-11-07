package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class CdexHeaderItem {
    public static final int DEBUG_INFO_BASE = 124;
    public static final int DEBUG_INFO_OFFSETS_POS_OFFSET = 116;
    public static final int DEBUG_INFO_OFFSETS_TABLE_OFFSET = 120;
    public static final int FEATURE_FLAGS_OFFSET = 112;
    private static final byte[] MAGIC_VALUE = {99, 100, 101, 120, 0, 0, 0, 0};
    private static final int[] SUPPORTED_CDEX_VERSIONS = {1};

    public static void annotateCdexHeaderFields(AnnotatedBytes annotatedBytes, DexBuffer dexBuffer) {
        annotatedBytes.annotate(4, "feature_flags: 0x%x", Integer.valueOf(dexBuffer.readInt(annotatedBytes.getCursor())));
        annotatedBytes.annotate(4, "debug_info_offsets_pos: 0x%x", Integer.valueOf(dexBuffer.readInt(annotatedBytes.getCursor())));
        annotatedBytes.annotate(4, "debug_info_offsets_table_offset: 0x%x", Integer.valueOf(dexBuffer.readInt(annotatedBytes.getCursor())));
        annotatedBytes.annotate(4, "debug_info_base: 0x%x", Integer.valueOf(dexBuffer.readInt(annotatedBytes.getCursor())));
    }

    public static int getVersion(byte[] bArr, int i10) {
        if (verifyMagic(bArr, i10)) {
            return getVersionUnchecked(bArr, i10);
        }
        return -1;
    }

    private static int getVersionUnchecked(byte[] bArr, int i10) {
        return (bArr[i10 + 6] - 48) + ((bArr[i10 + 5] - 48) * 10) + ((bArr[i10 + 4] - 48) * 100);
    }

    public static boolean isSupportedCdexVersion(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = SUPPORTED_CDEX_VERSIONS;
            if (i11 >= iArr.length) {
                return false;
            }
            if (iArr[i11] == i10) {
                return true;
            }
            i11++;
        }
    }

    public static boolean verifyMagic(byte[] bArr, int i10) {
        if (bArr.length - i10 < 8) {
            return false;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                for (int i12 = 4; i12 < 7; i12++) {
                    byte b10 = bArr[i10 + i12];
                    if (b10 < 48 || b10 > 57) {
                        return false;
                    }
                }
                return bArr[i10 + 7] == MAGIC_VALUE[7];
            }
            if (bArr[i10 + i11] != MAGIC_VALUE[i11]) {
                return false;
            }
            i11++;
        }
    }
}
