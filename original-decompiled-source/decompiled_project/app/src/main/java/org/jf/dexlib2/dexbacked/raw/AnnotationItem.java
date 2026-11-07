package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class AnnotationItem {
    public static final int ANNOTATION_OFFSET = 1;
    public static final int VISIBILITY_OFFSET = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static String getAnnotationVisibility(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "invalid visibility" : "system" : "runtime" : "build";
    }

    public static String getReferenceAnnotation(DexBackedDexFile dexBackedDexFile, int i10) {
        try {
            DexReader<? extends DexBuffer> dexReader = dexBackedDexFile.getDataBuffer().readerAt(i10);
            dexReader.readUbyte();
            return String.format("annotation_item[0x%x]: %s", Integer.valueOf(i10), dexBackedDexFile.getTypeSection().get(dexReader.readSmallUleb128()));
        } catch (Exception e10) {
            e10.printStackTrace(System.err);
            return String.format("annotation_item[0x%x]", Integer.valueOf(i10));
        }
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.AnnotationItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                int ubyte = this.dexFile.getBuffer().readUbyte(annotatedBytes.getCursor());
                annotatedBytes.annotate(1, "visibility = %d: %s", Integer.valueOf(ubyte), AnnotationItem.getAnnotationVisibility(ubyte));
                EncodedValue.annotateEncodedAnnotation(this.dexFile, annotatedBytes, this.dexFile.getBuffer().readerAt(annotatedBytes.getCursor()));
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "annotation_item";
            }
        };
    }
}
