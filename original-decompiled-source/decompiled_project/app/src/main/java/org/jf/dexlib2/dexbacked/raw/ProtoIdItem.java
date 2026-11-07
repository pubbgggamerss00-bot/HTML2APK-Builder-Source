package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class ProtoIdItem {
    public static final int ITEM_SIZE = 12;
    public static final int PARAMETERS_OFFSET = 8;
    public static final int RETURN_TYPE_OFFSET = 4;
    public static final int SHORTY_OFFSET = 0;

    public static String asString(DexBackedDexFile dexBackedDexFile, int i10) {
        int offset = dexBackedDexFile.getProtoSection().getOffset(i10);
        return "(" + TypeListItem.asString(dexBackedDexFile, dexBackedDexFile.getBuffer().readSmallUint(offset + 8)) + ")" + dexBackedDexFile.getTypeSection().get(dexBackedDexFile.getBuffer().readSmallUint(offset + 4));
    }

    public static String[] getProtos(DexBackedDexFile dexBackedDexFile) {
        MapItem mapItemForSection = dexBackedDexFile.getMapItemForSection(3);
        if (mapItemForSection == null) {
            return new String[0];
        }
        int itemCount = mapItemForSection.getItemCount();
        String[] strArr = new String[itemCount];
        for (int i10 = 0; i10 < itemCount; i10++) {
            strArr[i10] = asString(dexBackedDexFile, i10);
        }
        return strArr;
    }

    public static String getReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10) {
        try {
            return String.format("proto_id_item[%d]: %s", Integer.valueOf(i10), asString(dexBackedDexFile, i10));
        } catch (Exception e10) {
            e10.printStackTrace(System.err);
            return String.format("proto_id_item[%d]", Integer.valueOf(i10));
        }
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.ProtoIdItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                annotatedBytes.annotate(4, "shorty_idx = %s", StringIdItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "return_type_idx = %s", TypeIdItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "parameters_off = %s", TypeListItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor())));
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "proto_id_item";
            }
        };
    }
}
