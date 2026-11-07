package org.jf.dexlib2.dexbacked.value;

import java.util.Set;
import org.jf.dexlib2.base.value.BaseAnnotationEncodedValue;
import org.jf.dexlib2.dexbacked.DexBackedAnnotationElement;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.util.VariableSizeSet;
import org.jf.dexlib2.iface.value.AnnotationEncodedValue;

/* loaded from: classes3.dex */
public class DexBackedAnnotationEncodedValue extends BaseAnnotationEncodedValue implements AnnotationEncodedValue {
    public final DexBackedDexFile dexFile;
    private final int elementCount;
    private final int elementsOffset;
    public final String type;

    public DexBackedAnnotationEncodedValue(DexBackedDexFile dexBackedDexFile, DexReader dexReader) {
        this.dexFile = dexBackedDexFile;
        this.type = dexBackedDexFile.getTypeSection().get(dexReader.readSmallUleb128());
        int smallUleb128 = dexReader.readSmallUleb128();
        this.elementCount = smallUleb128;
        this.elementsOffset = dexReader.getOffset();
        skipElements(dexReader, smallUleb128);
    }

    private static void skipElements(DexReader dexReader, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            dexReader.skipUleb128();
            DexBackedEncodedValue.skipFrom(dexReader);
        }
    }

    public static void skipFrom(DexReader dexReader) {
        dexReader.skipUleb128();
        skipElements(dexReader, dexReader.readSmallUleb128());
    }

    @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, org.jf.dexlib2.iface.BasicAnnotation
    public Set<? extends DexBackedAnnotationElement> getElements() {
        return new VariableSizeSet<DexBackedAnnotationElement>(this.dexFile.getDataBuffer(), this.elementsOffset, this.elementCount) { // from class: org.jf.dexlib2.dexbacked.value.DexBackedAnnotationEncodedValue.1
            @Override // org.jf.dexlib2.dexbacked.util.VariableSizeSet
            public DexBackedAnnotationElement readNextItem(DexReader dexReader, int i10) {
                return new DexBackedAnnotationElement(DexBackedAnnotationEncodedValue.this.dexFile, dexReader);
            }
        };
    }

    @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, org.jf.dexlib2.iface.BasicAnnotation
    public String getType() {
        return this.type;
    }
}
