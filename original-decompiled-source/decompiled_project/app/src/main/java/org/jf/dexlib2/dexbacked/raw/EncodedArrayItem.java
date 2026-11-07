package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class EncodedArrayItem {
    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.EncodedArrayItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                EncodedValue.annotateEncodedArray(this.dexFile, annotatedBytes, this.dexFile.getBuffer().readerAt(annotatedBytes.getCursor()));
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "encoded_array_item";
            }
        };
    }
}
