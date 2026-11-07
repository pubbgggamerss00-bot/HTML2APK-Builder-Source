package org.jf.dexlib2.iface;

import java.util.List;
import java.util.Set;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.iface.reference.MethodReference;

/* loaded from: classes3.dex */
public interface Method extends MethodReference, Member {
    @Override // org.jf.dexlib2.iface.Member
    int getAccessFlags();

    @Override // org.jf.dexlib2.iface.Annotatable
    Set<? extends Annotation> getAnnotations();

    @Override // org.jf.dexlib2.iface.Member
    String getDefiningClass();

    @Override // org.jf.dexlib2.iface.Member
    Set<HiddenApiRestriction> getHiddenApiRestrictions();

    MethodImplementation getImplementation();

    @Override // org.jf.dexlib2.iface.Member
    String getName();

    List<? extends MethodParameter> getParameters();

    String getReturnType();
}
