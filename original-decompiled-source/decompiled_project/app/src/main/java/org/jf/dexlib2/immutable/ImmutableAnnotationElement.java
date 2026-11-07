package org.jf.dexlib2.immutable;

import nc.v;
import org.jf.dexlib2.base.BaseAnnotationElement;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEncodedValueFactory;
import org.jf.util.ImmutableConverter;

/* loaded from: classes3.dex */
public class ImmutableAnnotationElement extends BaseAnnotationElement {
    private static final ImmutableConverter<ImmutableAnnotationElement, AnnotationElement> CONVERTER = new ImmutableConverter<ImmutableAnnotationElement, AnnotationElement>() { // from class: org.jf.dexlib2.immutable.ImmutableAnnotationElement.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(AnnotationElement annotationElement) {
            return annotationElement instanceof ImmutableAnnotationElement;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableAnnotationElement makeImmutable(AnnotationElement annotationElement) {
            return ImmutableAnnotationElement.of(annotationElement);
        }
    };
    protected final String name;
    protected final ImmutableEncodedValue value;

    public ImmutableAnnotationElement(String str, EncodedValue encodedValue) {
        this.name = str;
        this.value = ImmutableEncodedValueFactory.of(encodedValue);
    }

    public static v<ImmutableAnnotationElement> immutableSetOf(Iterable<? extends AnnotationElement> iterable) {
        return CONVERTER.toSet(iterable);
    }

    public static ImmutableAnnotationElement of(AnnotationElement annotationElement) {
        return annotationElement instanceof ImmutableAnnotationElement ? (ImmutableAnnotationElement) annotationElement : new ImmutableAnnotationElement(annotationElement.getName(), annotationElement.getValue());
    }

    @Override // org.jf.dexlib2.iface.AnnotationElement
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.AnnotationElement
    public EncodedValue getValue() {
        return this.value;
    }

    public ImmutableAnnotationElement(String str, ImmutableEncodedValue immutableEncodedValue) {
        this.name = str;
        this.value = immutableEncodedValue;
    }
}
