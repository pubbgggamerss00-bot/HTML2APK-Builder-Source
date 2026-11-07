package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class MethodIdItem {
    public static final int CLASS_OFFSET = 0;
    public static final int ITEM_SIZE = 8;
    public static final int NAME_OFFSET = 4;
    public static final int PROTO_OFFSET = 2;

    public static String asString(DexBackedDexFile dexBackedDexFile, int i10) {
        int offset = dexBackedDexFile.getMethodSection().getOffset(i10);
        String str = dexBackedDexFile.getTypeSection().get(dexBackedDexFile.getBuffer().readUshort(offset));
        String strAsString = ProtoIdItem.asString(dexBackedDexFile, dexBackedDexFile.getBuffer().readUshort(offset + 2));
        return str + "->" + dexBackedDexFile.getStringSection().get(dexBackedDexFile.getBuffer().readSmallUint(offset + 4)) + strAsString;
    }

    public static String[] getMethods(DexBackedDexFile dexBackedDexFile) {
        MapItem mapItemForSection = dexBackedDexFile.getMapItemForSection(5);
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
            return String.format("method_id_item[%d]: %s", Integer.valueOf(i10), asString(dexBackedDexFile, i10));
        } catch (Exception e10) {
            e10.printStackTrace(System.err);
            return String.format("method_id_item[%d]", Integer.valueOf(i10));
        }
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.MethodIdItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                annotatedBytes.annotate(2, "class_idx = %s", TypeIdItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readUshort(annotatedBytes.getCursor())));
                annotatedBytes.annotate(2, "proto_idx = %s", ProtoIdItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readUshort(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "name_idx = %s", StringIdItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor())));
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "method_id_item";
            }
        };
    }
}
