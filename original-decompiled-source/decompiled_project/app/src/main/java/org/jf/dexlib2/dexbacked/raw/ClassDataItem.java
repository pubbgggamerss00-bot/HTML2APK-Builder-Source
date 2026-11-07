package org.jf.dexlib2.dexbacked.raw;

import java.util.Arrays;
import lc.g;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class ClassDataItem {
    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.ClassDataItem.1
            private SectionAnnotator codeItemAnnotator = null;

            private void addCodeItemIdentity(int i10, String str) {
                SectionAnnotator sectionAnnotator = this.codeItemAnnotator;
                if (sectionAnnotator != null) {
                    sectionAnnotator.setItemIdentity(i10, str);
                }
            }

            private int annotateEncodedField(AnnotatedBytes annotatedBytes, DexBackedDexFile dexBackedDexFile, DexReader dexReader, int i10) {
                int largeUleb128 = dexReader.readLargeUleb128();
                int i11 = i10 + largeUleb128;
                annotatedBytes.annotateTo(dexReader.getOffset(), "field_idx_diff = %d: %s", Integer.valueOf(largeUleb128), FieldIdItem.getReferenceAnnotation(dexBackedDexFile, i11));
                int smallUleb128 = dexReader.readSmallUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "access_flags = 0x%x: %s", Integer.valueOf(smallUleb128), new g(String.valueOf('|')).b(Arrays.asList(AccessFlags.getAccessFlagsForField(smallUleb128))));
                return i11;
            }

            private int annotateEncodedMethod(AnnotatedBytes annotatedBytes, DexBackedDexFile dexBackedDexFile, DexReader dexReader, int i10) {
                int largeUleb128 = dexReader.readLargeUleb128();
                int i11 = i10 + largeUleb128;
                annotatedBytes.annotateTo(dexReader.getOffset(), "method_idx_diff = %d: %s", Integer.valueOf(largeUleb128), MethodIdItem.getReferenceAnnotation(dexBackedDexFile, i11));
                int smallUleb128 = dexReader.readSmallUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "access_flags = 0x%x: %s", Integer.valueOf(smallUleb128), new g(String.valueOf('|')).b(Arrays.asList(AccessFlags.getAccessFlagsForMethod(smallUleb128))));
                int smallUleb1282 = dexReader.readSmallUleb128();
                if (smallUleb1282 == 0) {
                    annotatedBytes.annotateTo(dexReader.getOffset(), "code_off = code_item[NO_OFFSET]", new Object[0]);
                    return i11;
                }
                annotatedBytes.annotateTo(dexReader.getOffset(), "code_off = code_item[0x%x]", Integer.valueOf(smallUleb1282));
                addCodeItemIdentity(smallUleb1282, MethodIdItem.asString(dexBackedDexFile, i11));
                return i11;
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                DexReader<? extends DexBuffer> dexReader = this.dexFile.getBuffer().readerAt(annotatedBytes.getCursor());
                int smallUleb128 = dexReader.readSmallUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "static_fields_size = %d", Integer.valueOf(smallUleb128));
                int smallUleb1282 = dexReader.readSmallUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "instance_fields_size = %d", Integer.valueOf(smallUleb1282));
                int smallUleb1283 = dexReader.readSmallUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "direct_methods_size = %d", Integer.valueOf(smallUleb1283));
                int smallUleb1284 = dexReader.readSmallUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "virtual_methods_size = %d", Integer.valueOf(smallUleb1284));
                if (smallUleb128 > 0) {
                    annotatedBytes.annotate(0, "static_fields:", new Object[0]);
                    annotatedBytes.indent();
                    int iAnnotateEncodedField = 0;
                    for (int i11 = 0; i11 < smallUleb128; i11++) {
                        annotatedBytes.annotate(0, "static_field[%d]", Integer.valueOf(i11));
                        annotatedBytes.indent();
                        iAnnotateEncodedField = annotateEncodedField(annotatedBytes, this.dexFile, dexReader, iAnnotateEncodedField);
                        annotatedBytes.deindent();
                    }
                    annotatedBytes.deindent();
                }
                if (smallUleb1282 > 0) {
                    annotatedBytes.annotate(0, "instance_fields:", new Object[0]);
                    annotatedBytes.indent();
                    int iAnnotateEncodedField2 = 0;
                    for (int i12 = 0; i12 < smallUleb1282; i12++) {
                        annotatedBytes.annotate(0, "instance_field[%d]", Integer.valueOf(i12));
                        annotatedBytes.indent();
                        iAnnotateEncodedField2 = annotateEncodedField(annotatedBytes, this.dexFile, dexReader, iAnnotateEncodedField2);
                        annotatedBytes.deindent();
                    }
                    annotatedBytes.deindent();
                }
                if (smallUleb1283 > 0) {
                    annotatedBytes.annotate(0, "direct_methods:", new Object[0]);
                    annotatedBytes.indent();
                    int iAnnotateEncodedMethod = 0;
                    for (int i13 = 0; i13 < smallUleb1283; i13++) {
                        annotatedBytes.annotate(0, "direct_method[%d]", Integer.valueOf(i13));
                        annotatedBytes.indent();
                        iAnnotateEncodedMethod = annotateEncodedMethod(annotatedBytes, this.dexFile, dexReader, iAnnotateEncodedMethod);
                        annotatedBytes.deindent();
                    }
                    annotatedBytes.deindent();
                }
                if (smallUleb1284 > 0) {
                    annotatedBytes.annotate(0, "virtual_methods:", new Object[0]);
                    annotatedBytes.indent();
                    int iAnnotateEncodedMethod2 = 0;
                    for (int i14 = 0; i14 < smallUleb1284; i14++) {
                        annotatedBytes.annotate(0, "virtual_method[%d]", Integer.valueOf(i14));
                        annotatedBytes.indent();
                        iAnnotateEncodedMethod2 = annotateEncodedMethod(annotatedBytes, this.dexFile, dexReader, iAnnotateEncodedMethod2);
                        annotatedBytes.deindent();
                    }
                    annotatedBytes.deindent();
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateSection(AnnotatedBytes annotatedBytes) {
                this.codeItemAnnotator = this.annotator.getAnnotator(ItemType.CODE_ITEM);
                super.annotateSection(annotatedBytes);
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "class_data_item";
            }
        };
    }
}
