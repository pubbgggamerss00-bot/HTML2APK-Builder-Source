package org.jf.dexlib2.writer.builder;

import java.util.Set;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.base.reference.BaseFieldReference;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.writer.builder.BuilderEncodedValues;

/* loaded from: classes3.dex */
public class BuilderField extends BaseFieldReference implements Field {
    final int accessFlags;
    final BuilderAnnotationSet annotations;
    final BuilderFieldReference fieldReference;
    Set<HiddenApiRestriction> hiddenApiRestrictions;
    final BuilderEncodedValues.BuilderEncodedValue initialValue;

    public BuilderField(BuilderFieldReference builderFieldReference, int i10, BuilderEncodedValues.BuilderEncodedValue builderEncodedValue, BuilderAnnotationSet builderAnnotationSet, Set<HiddenApiRestriction> set) {
        this.fieldReference = builderFieldReference;
        this.accessFlags = i10;
        this.initialValue = builderEncodedValue;
        this.annotations = builderAnnotationSet;
        this.hiddenApiRestrictions = set;
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public int getAccessFlags() {
        return this.accessFlags;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.fieldReference.definingClass.getType();
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
        return this.hiddenApiRestrictions;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.fieldReference.name.getString();
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
    public String getType() {
        return this.fieldReference.fieldType.getType();
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Annotatable
    public BuilderAnnotationSet getAnnotations() {
        return this.annotations;
    }

    @Override // org.jf.dexlib2.iface.Field
    public BuilderEncodedValues.BuilderEncodedValue getInitialValue() {
        return this.initialValue;
    }
}
