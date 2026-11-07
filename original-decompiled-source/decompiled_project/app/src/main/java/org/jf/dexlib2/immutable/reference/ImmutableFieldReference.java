package org.jf.dexlib2.immutable.reference;

import org.jf.dexlib2.base.reference.BaseFieldReference;
import org.jf.dexlib2.iface.reference.FieldReference;

/* loaded from: classes3.dex */
public class ImmutableFieldReference extends BaseFieldReference implements ImmutableReference {
    protected final String definingClass;
    protected final String name;
    protected final String type;

    public ImmutableFieldReference(String str, String str2, String str3) {
        this.definingClass = str;
        this.name = str2;
        this.type = str3;
    }

    public static ImmutableFieldReference of(FieldReference fieldReference) {
        return fieldReference instanceof ImmutableFieldReference ? (ImmutableFieldReference) fieldReference : new ImmutableFieldReference(fieldReference.getDefiningClass(), fieldReference.getName(), fieldReference.getType());
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.definingClass;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
    public String getType() {
        return this.type;
    }
}
