package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;
import org.jf.util.StringUtils;

/* loaded from: classes3.dex */
public class StringDataItem {
    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.StringDataItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                DexReader<? extends DexBuffer> dexReader = this.dexFile.getBuffer().readerAt(annotatedBytes.getCursor());
                int smallUleb128 = dexReader.readSmallUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "utf16_size = %d", Integer.valueOf(smallUleb128));
                annotatedBytes.annotateTo(dexReader.getOffset() + 1, "data = \"%s\"", StringUtils.escapeString(dexReader.readString(smallUleb128)));
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "string_data_item";
            }
        };
    }
}
