package org.jf.dexlib2.dexbacked.raw;

import java.util.Arrays;
import lc.g;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class ClassDefItem {
    public static final int ACCESS_FLAGS_OFFSET = 4;
    public static final int ANNOTATIONS_OFFSET = 20;
    public static final int CLASS_DATA_OFFSET = 24;
    public static final int CLASS_OFFSET = 0;
    public static final int INTERFACES_OFFSET = 12;
    public static final int ITEM_SIZE = 32;
    public static final int SOURCE_FILE_OFFSET = 16;
    public static final int STATIC_VALUES_OFFSET = 28;
    public static final int SUPERCLASS_OFFSET = 8;

    public static String asString(DexBackedDexFile dexBackedDexFile, int i10) {
        return dexBackedDexFile.getTypeSection().get(dexBackedDexFile.getBuffer().readSmallUint(dexBackedDexFile.getClassSection().getOffset(i10)));
    }

    public static String[] getClasses(DexBackedDexFile dexBackedDexFile) {
        MapItem mapItemForSection = dexBackedDexFile.getMapItemForSection(6);
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

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.ClassDefItem.1
            private SectionAnnotator classDataAnnotator = null;

            private void addClassDataIdentity(int i10, String str) {
                SectionAnnotator sectionAnnotator = this.classDataAnnotator;
                if (sectionAnnotator != null) {
                    sectionAnnotator.setItemIdentity(i10, str);
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                int smallUint = this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor());
                annotatedBytes.annotate(4, "class_idx = %s", TypeIdItem.getReferenceAnnotation(this.dexFile, smallUint));
                int i11 = this.dexFile.getBuffer().readInt(annotatedBytes.getCursor());
                annotatedBytes.annotate(4, "access_flags = 0x%x: %s", Integer.valueOf(i11), new g(String.valueOf('|')).b(Arrays.asList(AccessFlags.getAccessFlagsForClass(i11))));
                annotatedBytes.annotate(4, "superclass_idx = %s", TypeIdItem.getOptionalReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readOptionalUint(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "interfaces_off = %s", TypeListItem.getReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor())));
                annotatedBytes.annotate(4, "source_file_idx = %s", StringIdItem.getOptionalReferenceAnnotation(this.dexFile, this.dexFile.getBuffer().readOptionalUint(annotatedBytes.getCursor())));
                int smallUint2 = this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor());
                if (smallUint2 == 0) {
                    annotatedBytes.annotate(4, "annotations_off = annotations_directory_item[NO_OFFSET]", new Object[0]);
                } else {
                    annotatedBytes.annotate(4, "annotations_off = annotations_directory_item[0x%x]", Integer.valueOf(smallUint2));
                }
                int smallUint3 = this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor());
                if (smallUint3 == 0) {
                    annotatedBytes.annotate(4, "class_data_off = class_data_item[NO_OFFSET]", new Object[0]);
                } else {
                    annotatedBytes.annotate(4, "class_data_off = class_data_item[0x%x]", Integer.valueOf(smallUint3));
                    addClassDataIdentity(smallUint3, this.dexFile.getTypeSection().get(smallUint));
                }
                int smallUint4 = this.dexFile.getBuffer().readSmallUint(annotatedBytes.getCursor());
                if (smallUint4 == 0) {
                    annotatedBytes.annotate(4, "static_values_off = encoded_array_item[NO_OFFSET]", new Object[0]);
                } else {
                    annotatedBytes.annotate(4, "static_values_off = encoded_array_item[0x%x]", Integer.valueOf(smallUint4));
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateSection(AnnotatedBytes annotatedBytes) {
                this.classDataAnnotator = this.annotator.getAnnotator(8192);
                super.annotateSection(annotatedBytes);
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "class_def_item";
            }
        };
    }
}
