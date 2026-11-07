package org.jf.dexlib2.iface;

import java.util.Set;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public interface Field extends FieldReference, Member {
    @Override // org.jf.dexlib2.iface.Member
    int getAccessFlags();

    @Override // org.jf.dexlib2.iface.Annotatable
    Set<? extends Annotation> getAnnotations();

    @Override // org.jf.dexlib2.iface.Member
    String getDefiningClass();

    @Override // org.jf.dexlib2.iface.Member
    Set<HiddenApiRestriction> getHiddenApiRestrictions();

    EncodedValue getInitialValue();

    @Override // org.jf.dexlib2.iface.Member
    String getName();

    String getType();
}
