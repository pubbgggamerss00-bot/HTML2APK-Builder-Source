package org.jf.dexlib2.dexbacked;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import nc.v;
import nc.w0;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.base.reference.BaseFieldReference;
import org.jf.dexlib2.dexbacked.reference.DexBackedFieldReference;
import org.jf.dexlib2.dexbacked.util.AnnotationsDirectory;
import org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator;
import org.jf.dexlib2.dexbacked.value.DexBackedEncodedValue;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public class DexBackedField extends BaseFieldReference implements Field {
    public final int accessFlags;
    public final int annotationSetOffset;
    public final ClassDef classDef;
    public final DexBackedDexFile dexFile;
    private int fieldIdItemOffset;
    public final int fieldIndex;
    private final int hiddenApiRestrictions;
    public final EncodedValue initialValue;
    private final int initialValueOffset;
    private final int startOffset;

    public DexBackedField(DexBackedDexFile dexBackedDexFile, DexReader dexReader, DexBackedClassDef dexBackedClassDef, int i10, EncodedArrayItemIterator encodedArrayItemIterator, AnnotationsDirectory.AnnotationIterator annotationIterator, int i11) {
        this.dexFile = dexBackedDexFile;
        this.classDef = dexBackedClassDef;
        this.startOffset = dexReader.getOffset();
        int largeUleb128 = dexReader.readLargeUleb128() + i10;
        this.fieldIndex = largeUleb128;
        this.accessFlags = dexReader.readSmallUleb128();
        this.annotationSetOffset = annotationIterator.seekTo(largeUleb128);
        this.initialValueOffset = encodedArrayItemIterator.getReaderOffset();
        this.initialValue = encodedArrayItemIterator.getNextOrNull();
        this.hiddenApiRestrictions = i11;
    }

    private int getFieldIdItemOffset() {
        if (this.fieldIdItemOffset == 0) {
            this.fieldIdItemOffset = this.dexFile.getFieldSection().getOffset(this.fieldIndex);
        }
        return this.fieldIdItemOffset;
    }

    public static void skipFields(DexReader dexReader, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            dexReader.skipUleb128();
            dexReader.skipUleb128();
        }
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public int getAccessFlags() {
        return this.accessFlags;
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Annotatable
    public Set<? extends DexBackedAnnotation> getAnnotations() {
        return AnnotationsDirectory.getAnnotations(this.dexFile, this.annotationSetOffset);
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.classDef.getType();
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
        int i10 = this.hiddenApiRestrictions;
        if (i10 != 7) {
            return EnumSet.copyOf((Collection) HiddenApiRestriction.getAllFlags(i10));
        }
        int i11 = v.f18759c;
        return w0.f18781j;
    }

    @Override // org.jf.dexlib2.iface.Field
    public EncodedValue getInitialValue() {
        return this.initialValue;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.dexFile.getStringSection().get(this.dexFile.getBuffer().readSmallUint(getFieldIdItemOffset() + 4));
    }

    public int getSize() {
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getBuffer().readerAt(this.startOffset);
        dexReader.readLargeUleb128();
        dexReader.readSmallUleb128();
        int offset = dexReader.getOffset() - this.startOffset;
        if (!getAnnotations().isEmpty()) {
            offset += 8;
        }
        int i10 = this.initialValueOffset;
        if (i10 > 0) {
            dexReader.setOffset(i10);
            if (this.initialValue != null) {
                DexBackedEncodedValue.skipFrom(dexReader);
                offset += dexReader.getOffset() - this.initialValueOffset;
            }
        }
        return new DexBackedFieldReference(this.dexFile, this.fieldIndex).getSize() + offset;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
    public String getType() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readUshort(getFieldIdItemOffset() + 2));
    }

    public DexBackedField(DexBackedDexFile dexBackedDexFile, DexReader dexReader, DexBackedClassDef dexBackedClassDef, int i10, AnnotationsDirectory.AnnotationIterator annotationIterator, int i11) {
        this.dexFile = dexBackedDexFile;
        this.classDef = dexBackedClassDef;
        this.startOffset = dexReader.getOffset();
        int largeUleb128 = dexReader.readLargeUleb128() + i10;
        this.fieldIndex = largeUleb128;
        this.accessFlags = dexReader.readSmallUleb128();
        this.annotationSetOffset = annotationIterator.seekTo(largeUleb128);
        this.initialValueOffset = 0;
        this.initialValue = null;
        this.hiddenApiRestrictions = i11;
    }
}
