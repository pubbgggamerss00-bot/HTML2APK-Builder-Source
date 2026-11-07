package org.jf.dexlib2.writer;

import java.util.Collection;

/* loaded from: classes3.dex */
public interface AnnotationSection<StringKey, TypeKey, AnnotationKey, AnnotationElement, EncodedValue> extends OffsetSection<AnnotationKey> {
    StringKey getElementName(AnnotationElement annotationelement);

    EncodedValue getElementValue(AnnotationElement annotationelement);

    Collection<? extends AnnotationElement> getElements(AnnotationKey annotationkey);

    TypeKey getType(AnnotationKey annotationkey);

    int getVisibility(AnnotationKey annotationkey);
}
