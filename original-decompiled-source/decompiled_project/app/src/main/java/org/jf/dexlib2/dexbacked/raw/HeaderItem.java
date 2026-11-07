package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.VersionMap;
import org.jf.dexlib2.dexbacked.CDexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;
import org.jf.util.StringUtils;

/* loaded from: classes3.dex */
public class HeaderItem {
    public static final int BIG_ENDIAN_TAG = 2018915346;
    public static final int CHECKSUM_DATA_START_OFFSET = 12;
    public static final int CHECKSUM_OFFSET = 8;
    public static final int CLASS_COUNT_OFFSET = 96;
    public static final int CLASS_START_OFFSET = 100;
    public static final int DATA_SIZE_OFFSET = 104;
    public static final int DATA_START_OFFSET = 108;
    public static final int ENDIAN_TAG_OFFSET = 40;
    public static final int FIELD_COUNT_OFFSET = 80;
    public static final int FIELD_START_OFFSET = 84;
    public static final int FILE_SIZE_OFFSET = 32;
    public static final int HEADER_SIZE_OFFSET = 36;
    public static final int ITEM_SIZE = 112;
    public static final int LITTLE_ENDIAN_TAG = 305419896;
    private static final byte[] MAGIC_VALUE = {100, 101, 120, 10, 0, 0, 0, 0};
    public static final int MAP_OFFSET = 52;
    public static final int METHOD_COUNT_OFFSET = 88;
    public static final int METHOD_START_OFFSET = 92;
    public static final int PROTO_COUNT_OFFSET = 72;
    public static final int PROTO_START_OFFSET = 76;
    public static final int SIGNATURE_DATA_START_OFFSET = 32;
    public static final int SIGNATURE_OFFSET = 12;
    public static final int SIGNATURE_SIZE = 20;
    public static final int STRING_COUNT_OFFSET = 56;
    public static final int STRING_START_OFFSET = 60;
    public static final int TYPE_COUNT_OFFSET = 64;
    public static final int TYPE_START_OFFSET = 68;
    private DexBackedDexFile dexFile;

    public HeaderItem(DexBackedDexFile dexBackedDexFile) {
        this.dexFile = dexBackedDexFile;
    }

    public static int getEndian(byte[] bArr, int i10) {
        return new DexBuffer(bArr).readInt(i10 + 40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getEndianText(int i10) {
        return i10 == 305419896 ? "Little Endian" : i10 == 2018915346 ? "Big Endian" : "Invalid";
    }

    public static byte[] getMagicForApi(int i10) {
        return getMagicForDexVersion(VersionMap.mapApiToDexVersion(i10));
    }

    public static byte[] getMagicForDexVersion(int i10) {
        byte[] bArr = (byte[]) MAGIC_VALUE.clone();
        if (i10 < 0 || i10 > 999) {
            throw new IllegalArgumentException("dexVersion must be within [0, 999]");
        }
        for (int i11 = 6; i11 >= 4; i11--) {
            bArr[i11] = (byte) ((i10 % 10) + 48);
            i10 /= 10;
        }
        return bArr;
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

    public static boolean isSupportedDexVersion(int i10) {
        return VersionMap.mapDexVersionToApi(i10) != -1;
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.HeaderItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                int cursor = annotatedBytes.getCursor();
                StringBuilder sb = new StringBuilder();
                for (int i11 = 0; i11 < 8; i11++) {
                    sb.append((char) this.dexFile.getBuffer().readUbyte(cursor + i11));
                }
                annotatedBytes.annotate(8, "magic: %s", StringUtils.escapeString(sb.toString()));
                annotatedBytes.annotate(4, "checksum", new Object[0]);
                annotatedBytes.annotate(20, "signature", new Object[0]);
                annotatedBytes.annotate(4, "file_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                int i12 = this.dexFile.getBuffer().readInt(annotatedBytes.getCursor());
                annotatedBytes.annotate(4, "header_size: %d", Integer.valueOf(i12));
                int i13 = this.dexFile.getBuffer().readInt(annotatedBytes.getCursor());
                annotatedBytes.annotate(4, "endian_tag: 0x%x (%s)", Integer.valueOf(i13), HeaderItem.getEndianText(i13));
                annotatedBytes.annotate(4, "link_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "link_offset: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "map_off: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "string_ids_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "string_ids_off: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "type_ids_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "type_ids_off: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "proto_ids_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "proto_ids_off: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "field_ids_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "field_ids_off: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "method_ids_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "method_ids_off: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "class_defs_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "class_defs_off: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "data_size: %d", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "data_off: 0x%x", Integer.valueOf(this.dexFile.getBuffer().readInt(annotatedBytes.getCursor())));
                if (this.annotator.dexFile instanceof CDexBackedDexFile) {
                    CdexHeaderItem.annotateCdexHeaderFields(annotatedBytes, this.dexFile.getBuffer());
                }
                if (i12 > 112) {
                    annotatedBytes.annotateTo(i12, "header padding", new Object[0]);
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "header_item";
            }
        };
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

    public int getChecksum() {
        return this.dexFile.getBuffer().readSmallUint(8);
    }

    public int getClassCount() {
        return this.dexFile.getBuffer().readSmallUint(96);
    }

    public int getClassOffset() {
        return this.dexFile.getBuffer().readSmallUint(100);
    }

    public int getFieldCount() {
        return this.dexFile.getBuffer().readSmallUint(80);
    }

    public int getFieldOffset() {
        return this.dexFile.getBuffer().readSmallUint(84);
    }

    public int getHeaderSize() {
        return this.dexFile.getBuffer().readSmallUint(36);
    }

    public int getMapOffset() {
        return this.dexFile.getBuffer().readSmallUint(52);
    }

    public int getMethodCount() {
        return this.dexFile.getBuffer().readSmallUint(88);
    }

    public int getMethodOffset() {
        return this.dexFile.getBuffer().readSmallUint(92);
    }

    public int getProtoCount() {
        return this.dexFile.getBuffer().readSmallUint(72);
    }

    public int getProtoOffset() {
        return this.dexFile.getBuffer().readSmallUint(76);
    }

    public byte[] getSignature() {
        return this.dexFile.getBuffer().readByteRange(12, 20);
    }

    public int getStringCount() {
        return this.dexFile.getBuffer().readSmallUint(56);
    }

    public int getStringOffset() {
        return this.dexFile.getBuffer().readSmallUint(60);
    }

    public int getTypeCount() {
        return this.dexFile.getBuffer().readSmallUint(64);
    }

    public int getTypeOffset() {
        return this.dexFile.getBuffer().readSmallUint(68);
    }
}
