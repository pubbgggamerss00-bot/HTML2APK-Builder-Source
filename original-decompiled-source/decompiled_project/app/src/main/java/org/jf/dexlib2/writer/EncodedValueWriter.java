package org.jf.dexlib2.writer;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import nc.o0;
import nc.r;
import org.jf.dexlib2.base.BaseAnnotationElement;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodReference;

/* loaded from: classes3.dex */
public abstract class EncodedValueWriter<StringKey, TypeKey, FieldRefKey extends FieldReference, MethodRefKey extends MethodReference, AnnotationElement extends AnnotationElement, ProtoRefKey, MethodHandleKey extends MethodHandleReference, EncodedValue> {
    private final AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection;
    private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
    private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    private final StringSection<StringKey, ?> stringSection;
    private final TypeSection<?, TypeKey, ?> typeSection;
    private final DexDataWriter writer;

    public EncodedValueWriter(DexDataWriter dexDataWriter, StringSection<StringKey, ?> stringSection, TypeSection<?, TypeKey, ?> typeSection, FieldSection<?, ?, FieldRefKey, ?> fieldSection, MethodSection<?, ?, ?, MethodRefKey, ?> methodSection, ProtoSection<?, ?, ProtoRefKey, ?> protoSection, MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection, AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection) {
        this.writer = dexDataWriter;
        this.stringSection = stringSection;
        this.typeSection = typeSection;
        this.fieldSection = fieldSection;
        this.methodSection = methodSection;
        this.protoSection = protoSection;
        this.methodHandleSection = methodHandleSection;
        this.annotationSection = annotationSection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeAnnotation(TypeKey typekey, Collection<? extends AnnotationElement> collection) throws IOException {
        this.writer.writeEncodedValueHeader(29, 0);
        this.writer.writeUleb128(this.typeSection.getItemIndex((TypeSection<?, TypeKey, ?>) typekey));
        this.writer.writeUleb128(collection.size());
        r.a aVarListIterator = o0.a(BaseAnnotationElement.BY_NAME).b(collection).listIterator(0);
        while (aVarListIterator.hasNext()) {
            AnnotationElement annotationElement = (AnnotationElement) aVarListIterator.next();
            this.writer.writeUleb128(this.stringSection.getItemIndex((StringSection<StringKey, ?>) this.annotationSection.getElementName(annotationElement)));
            writeEncodedValue(this.annotationSection.getElementValue(annotationElement));
        }
    }

    public void writeArray(Collection<? extends EncodedValue> collection) throws IOException {
        this.writer.writeEncodedValueHeader(28, 0);
        this.writer.writeUleb128(collection.size());
        Iterator<? extends EncodedValue> it = collection.iterator();
        while (it.hasNext()) {
            writeEncodedValue(it.next());
        }
    }

    public void writeBoolean(boolean z10) throws IOException {
        this.writer.writeEncodedValueHeader(31, z10 ? 1 : 0);
    }

    public void writeByte(byte b10) throws IOException {
        this.writer.writeEncodedInt(0, b10);
    }

    public void writeChar(char c10) throws IOException {
        this.writer.writeEncodedUint(3, c10);
    }

    public void writeDouble(double d10) throws IOException {
        this.writer.writeEncodedDouble(17, d10);
    }

    public abstract void writeEncodedValue(EncodedValue encodedvalue) throws IOException;

    public void writeEnum(FieldRefKey fieldrefkey) throws IOException {
        this.writer.writeEncodedUint(27, this.fieldSection.getItemIndex(fieldrefkey));
    }

    public void writeField(FieldRefKey fieldrefkey) throws IOException {
        this.writer.writeEncodedUint(25, this.fieldSection.getItemIndex(fieldrefkey));
    }

    public void writeFloat(float f10) throws IOException {
        this.writer.writeEncodedFloat(16, f10);
    }

    public void writeInt(int i10) throws IOException {
        this.writer.writeEncodedInt(4, i10);
    }

    public void writeLong(long j10) throws IOException {
        this.writer.writeEncodedLong(6, j10);
    }

    public void writeMethod(MethodRefKey methodrefkey) throws IOException {
        this.writer.writeEncodedUint(26, this.methodSection.getItemIndex(methodrefkey));
    }

    public void writeMethodHandle(MethodHandleKey methodhandlekey) throws IOException {
        this.writer.writeEncodedUint(22, this.methodHandleSection.getItemIndex(methodhandlekey));
    }

    public void writeMethodType(ProtoRefKey protorefkey) throws IOException {
        this.writer.writeEncodedUint(21, this.protoSection.getItemIndex(protorefkey));
    }

    public void writeNull() throws IOException {
        this.writer.write(30);
    }

    public void writeShort(int i10) throws IOException {
        this.writer.writeEncodedInt(2, i10);
    }

    public void writeString(StringKey stringkey) throws IOException {
        this.writer.writeEncodedUint(23, this.stringSection.getItemIndex((StringSection<StringKey, ?>) stringkey));
    }

    public void writeType(TypeKey typekey) throws IOException {
        this.writer.writeEncodedUint(24, this.typeSection.getItemIndex((TypeSection<?, TypeKey, ?>) typekey));
    }
}
