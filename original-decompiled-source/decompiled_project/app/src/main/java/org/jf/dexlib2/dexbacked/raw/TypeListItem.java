package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class TypeListItem {
    public static final int LIST_OFFSET = 4;
    public static final int SIZE_OFFSET = 0;

    public static String asString(DexBackedDexFile dexBackedDexFile, int i10) {
        if (i10 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int smallUint = dexBackedDexFile.getDataBuffer().readSmallUint(i10);
        for (int i11 = 0; i11 < smallUint; i11++) {
            sb.append(dexBackedDexFile.getTypeSection().get(dexBackedDexFile.getDataBuffer().readUshort((i11 * 2) + i10 + 4)));
        }
        return sb.toString();
    }

    public static String getReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10) {
        if (i10 == 0) {
            return "type_list_item[NO_OFFSET]";
        }
        try {
            return String.format("type_list_item[0x%x]: %s", Integer.valueOf(i10), asString(dexBackedDexFile, i10));
        } catch (Exception e10) {
            e10.printStackTrace(System.err);
            return String.format("type_list_item[0x%x]", Integer.valueOf(i10));
        }
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.TypeListItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                int smallUint = this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor());
                annotatedBytes.annotate(4, "size: %d", Integer.valueOf(smallUint));
                for (int i11 = 0; i11 < smallUint; i11++) {
                    annotatedBytes.annotate(2, TypeIdItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readUshort(annotatedBytes.getCursor())), new Object[0]);
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public int getItemAlignment() {
                return 4;
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "type_list";
            }
        };
    }
}
