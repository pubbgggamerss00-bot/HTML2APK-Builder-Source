package org.jf.dexlib2.analysis.reflection;

import java.util.Set;
import nc.v;
import nc.w0;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.analysis.reflection.util.ReflectionUtils;
import org.jf.dexlib2.base.reference.BaseFieldReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public class ReflectionField extends BaseFieldReference implements Field {
    private final java.lang.reflect.Field field;

    public ReflectionField(java.lang.reflect.Field field) {
        this.field = field;
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public int getAccessFlags() {
        return this.field.getModifiers();
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Annotatable
    public Set<? extends Annotation> getAnnotations() {
        int i10 = v.f18759c;
        return w0.f18781j;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return ReflectionUtils.javaToDexName(this.field.getDeclaringClass().getName());
    }

    @Override // org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
        int i10 = v.f18759c;
        return w0.f18781j;
    }

    @Override // org.jf.dexlib2.iface.Field
    public EncodedValue getInitialValue() {
        return null;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.field.getName();
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
    public String getType() {
        return ReflectionUtils.javaToDexName(this.field.getType().getName());
    }
}
