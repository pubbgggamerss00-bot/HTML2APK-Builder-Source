package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class TypeIdItem {
    public static final int ITEM_SIZE = 4;

    public static String getOptionalReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10) {
        return i10 == -1 ? "type_id_item[NO_INDEX]" : getReferenceAnnotation(dexBackedDexFile, i10);
    }

    public static String getReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10) {
        try {
            return String.format("type_id_item[%d]: %s", Integer.valueOf(i10), dexBackedDexFile.getTypeSection().get(i10));
        } catch (Exception e10) {
            e10.printStackTrace(System.err);
            return String.format("type_id_item[%d]", Integer.valueOf(i10));
        }
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.TypeIdItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                annotatedBytes.annotate(4, StringIdItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor())), new Object[0]);
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "type_id_item";
            }
        };
    }
}
