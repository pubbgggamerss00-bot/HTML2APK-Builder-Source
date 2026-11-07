package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class AnnotationSetItem {
    public static final int LIST_OFFSET = 4;
    public static final int SIZE_OFFSET = 0;

    public static String getReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10) {
        return i10 == 0 ? "annotation_set_item[NO_OFFSET]" : String.format("annotation_set_item[0x%x]", Integer.valueOf(i10));
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.AnnotationSetItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                int smallUint = this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor());
                annotatedBytes.annotate(4, "size = %d", Integer.valueOf(smallUint));
                for (int i11 = 0; i11 < smallUint; i11++) {
                    annotatedBytes.annotate(4, AnnotationItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor())), new Object[0]);
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public int getItemAlignment() {
                return 4;
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "annotation_set_item";
            }
        };
    }
}
