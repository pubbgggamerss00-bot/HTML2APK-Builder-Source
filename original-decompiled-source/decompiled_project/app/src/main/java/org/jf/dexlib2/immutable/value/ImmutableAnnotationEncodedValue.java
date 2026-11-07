package org.jf.dexlib2.immutable.value;

import java.util.Collection;
import nc.v;
import org.jf.dexlib2.base.value.BaseAnnotationEncodedValue;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.value.AnnotationEncodedValue;
import org.jf.dexlib2.immutable.ImmutableAnnotationElement;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableAnnotationEncodedValue extends BaseAnnotationEncodedValue implements ImmutableEncodedValue {
    protected final v<? extends ImmutableAnnotationElement> elements;
    protected final String type;

    public ImmutableAnnotationEncodedValue(String str, Collection<? extends AnnotationElement> collection) {
        this.type = str;
        this.elements = ImmutableAnnotationElement.immutableSetOf(collection);
    }

    public static ImmutableAnnotationEncodedValue of(AnnotationEncodedValue annotationEncodedValue) {
        return annotationEncodedValue instanceof ImmutableAnnotationEncodedValue ? (ImmutableAnnotationEncodedValue) annotationEncodedValue : new ImmutableAnnotationEncodedValue(annotationEncodedValue.getType(), annotationEncodedValue.getElements());
    }

    @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, org.jf.dexlib2.iface.BasicAnnotation
    public String getType() {
        return this.type;
    }

    @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, org.jf.dexlib2.iface.BasicAnnotation
    public v<? extends ImmutableAnnotationElement> getElements() {
        return this.elements;
    }

    public ImmutableAnnotationEncodedValue(String str, v<? extends ImmutableAnnotationElement> vVar) {
        this.type = str;
        this.elements = ImmutableUtils.nullToEmptySet(vVar);
    }
}
