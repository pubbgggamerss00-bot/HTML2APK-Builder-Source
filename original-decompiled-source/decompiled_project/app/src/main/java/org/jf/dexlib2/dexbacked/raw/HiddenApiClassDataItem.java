package org.jf.dexlib2.dexbacked.raw;

import java.util.Iterator;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.dexbacked.DexBackedClassDef;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class HiddenApiClassDataItem {
    public static final int OFFSETS_LIST_OFFSET = 4;
    public static final int OFFSET_ITEM_SIZE = 4;
    public static final int SIZE_OFFSET = 0;

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.HiddenApiClassDataItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                int cursor = annotatedBytes.getCursor();
                annotatedBytes.annotate(4, "size = 0x%x", Integer.valueOf(this.dexFile.getDataBuffer().readSmallUint(annotatedBytes.getCursor())));
                int i11 = 0;
                for (DexBackedClassDef dexBackedClassDef : this.dexFile.getClasses()) {
                    annotatedBytes.annotate(0, "[%d] %s", Integer.valueOf(i11), dexBackedClassDef);
                    annotatedBytes.indent();
                    int smallUint = this.dexFile.getDataBuffer().readSmallUint(annotatedBytes.getCursor());
                    if (smallUint == 0) {
                        annotatedBytes.annotate(4, "offset = 0x%x", Integer.valueOf(smallUint));
                    } else {
                        annotatedBytes.annotate(4, "offset = 0x%x (absolute offset: 0x%x)", Integer.valueOf(smallUint), Integer.valueOf(cursor + smallUint));
                    }
                    int cursor2 = annotatedBytes.getCursor();
                    if (smallUint > 0) {
                        annotatedBytes.deindent();
                        annotatedBytes.moveTo(smallUint + cursor);
                        DexReader<? extends DexBuffer> dexReader = this.dexFile.getBuffer().readerAt(annotatedBytes.getCursor());
                        Iterator<? extends Field> it = dexBackedClassDef.getStaticFields().iterator();
                        while (it.hasNext()) {
                            annotatedBytes.annotate(0, "%s:", it.next());
                            annotatedBytes.indent();
                            int smallUleb128 = dexReader.readSmallUleb128();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "restriction = 0x%x: %s", Integer.valueOf(smallUleb128), HiddenApiRestriction.formatHiddenRestrictions(smallUleb128));
                            annotatedBytes.deindent();
                        }
                        Iterator<? extends Field> it2 = dexBackedClassDef.getInstanceFields().iterator();
                        while (it2.hasNext()) {
                            annotatedBytes.annotate(0, "%s:", it2.next());
                            annotatedBytes.indent();
                            int smallUleb1282 = dexReader.readSmallUleb128();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "restriction = 0x%x: %s", Integer.valueOf(smallUleb1282), HiddenApiRestriction.formatHiddenRestrictions(smallUleb1282));
                            annotatedBytes.deindent();
                        }
                        Iterator<? extends Method> it3 = dexBackedClassDef.getDirectMethods().iterator();
                        while (it3.hasNext()) {
                            annotatedBytes.annotate(0, "%s:", it3.next());
                            annotatedBytes.indent();
                            int smallUleb1283 = dexReader.readSmallUleb128();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "restriction = 0x%x: %s", Integer.valueOf(smallUleb1283), HiddenApiRestriction.formatHiddenRestrictions(smallUleb1283));
                            annotatedBytes.deindent();
                        }
                        Iterator<? extends Method> it4 = dexBackedClassDef.getVirtualMethods().iterator();
                        while (it4.hasNext()) {
                            annotatedBytes.annotate(0, "%s:", it4.next());
                            annotatedBytes.indent();
                            int smallUleb1284 = dexReader.readSmallUleb128();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "restriction = 0x%x: %s", Integer.valueOf(smallUleb1284), HiddenApiRestriction.formatHiddenRestrictions(smallUleb1284));
                            annotatedBytes.deindent();
                        }
                        annotatedBytes.indent();
                    }
                    annotatedBytes.moveTo(cursor2);
                    annotatedBytes.deindent();
                    i11++;
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "hiddenapi_class_data_item";
            }
        };
    }
}
