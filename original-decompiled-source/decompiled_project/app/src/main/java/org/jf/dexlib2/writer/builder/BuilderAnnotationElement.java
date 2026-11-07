package org.jf.dexlib2.writer.builder;

import org.jf.dexlib2.base.BaseAnnotationElement;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.writer.builder.BuilderEncodedValues;

/* loaded from: classes3.dex */
public class BuilderAnnotationElement extends BaseAnnotationElement {
    final BuilderStringReference name;
    final BuilderEncodedValues.BuilderEncodedValue value;

    public BuilderAnnotationElement(BuilderStringReference builderStringReference, BuilderEncodedValues.BuilderEncodedValue builderEncodedValue) {
        this.name = builderStringReference;
        this.value = builderEncodedValue;
    }

    @Override // org.jf.dexlib2.iface.AnnotationElement
    public String getName() {
        return this.name.getString();
    }

    @Override // org.jf.dexlib2.iface.AnnotationElement
    public EncodedValue getValue() {
        return this.value;
    }
}
