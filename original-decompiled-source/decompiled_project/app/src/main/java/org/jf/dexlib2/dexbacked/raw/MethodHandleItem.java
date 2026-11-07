package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.MethodHandleType;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class MethodHandleItem {
    public static final int ITEM_SIZE = 8;
    public static final int MEMBER_ID_OFFSET = 4;
    public static final int METHOD_HANDLE_TYPE_OFFSET = 0;

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.MethodHandleItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                String referenceAnnotation;
                int ushort = this.dexFile.getBuffer().readUshort(annotatedBytes.getCursor());
                annotatedBytes.annotate(2, "type = %s", MethodHandleType.toString(ushort));
                annotatedBytes.annotate(2, "unused", new Object[0]);
                int ushort2 = this.dexFile.getBuffer().readUshort(annotatedBytes.getCursor());
                switch (ushort) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        referenceAnnotation = FieldIdItem.getReferenceAnnotation(this.dexFile, ushort2);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        referenceAnnotation = MethodIdItem.getReferenceAnnotation(this.dexFile, ushort2);
                        break;
                    default:
                        throw new ExceptionWithContext("Invalid method handle type: %d", Integer.valueOf(ushort));
                }
                annotatedBytes.annotate(2, "field_or_method_id = %s", referenceAnnotation);
                annotatedBytes.annotate(2, "unused", new Object[0]);
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "method_handle_item";
            }
        };
    }
}
