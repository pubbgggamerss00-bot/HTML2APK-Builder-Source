package org.jf.dexlib2.iface;

import java.util.Set;
import org.jf.dexlib2.iface.debug.LocalInfo;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public interface MethodParameter extends TypeReference, LocalInfo {
    Set<? extends Annotation> getAnnotations();

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    String getName();

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    String getSignature();

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    String getType();
}
