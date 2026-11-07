package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;
import org.jf.util.StringUtils;

/* loaded from: classes3.dex */
public class StringIdItem {
    public static final int ITEM_SIZE = 4;

    public static String getOptionalReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10) {
        return getOptionalReferenceAnnotation(dexBackedDexFile, i10, false);
    }

    public static String getReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10) {
        return getReferenceAnnotation(dexBackedDexFile, i10, false);
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.StringIdItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                int smallUint = this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor());
                try {
                    annotatedBytes.annotate(4, "string_data_item[0x%x]: \"%s\"", Integer.valueOf(smallUint), StringUtils.escapeString(this.dexFile.getStringSection().get(i10)));
                } catch (Exception e10) {
                    System.err.print("Error while resolving string value at index: ");
                    System.err.print(i10);
                    e10.printStackTrace(System.err);
                    annotatedBytes.annotate(4, "string_id_item[0x%x]", Integer.valueOf(smallUint));
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "string_id_item";
            }
        };
    }

    public static String getOptionalReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10, boolean z10) {
        return i10 == -1 ? "string_id_item[NO_INDEX]" : getReferenceAnnotation(dexBackedDexFile, i10, z10);
    }

    public static String getReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10, boolean z10) {
        try {
            String str = dexBackedDexFile.getStringSection().get(i10);
            if (z10) {
                str = "\"" + StringUtils.escapeString(str) + "\"";
            }
            return String.format("string_id_item[%d]: %s", Integer.valueOf(i10), str);
        } catch (Exception e10) {
            e10.printStackTrace(System.err);
            return String.format("string_id_item[%d]", Integer.valueOf(i10));
        }
    }
}
