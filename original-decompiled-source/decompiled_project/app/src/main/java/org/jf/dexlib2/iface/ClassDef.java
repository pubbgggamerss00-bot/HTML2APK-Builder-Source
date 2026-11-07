package org.jf.dexlib2.iface;

import java.util.List;
import java.util.Set;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public interface ClassDef extends TypeReference, Annotatable {
    int getAccessFlags();

    @Override // org.jf.dexlib2.iface.Annotatable
    Set<? extends Annotation> getAnnotations();

    Iterable<? extends Method> getDirectMethods();

    Iterable<? extends Field> getFields();

    Iterable<? extends Field> getInstanceFields();

    List<String> getInterfaces();

    Iterable<? extends Method> getMethods();

    String getSourceFile();

    Iterable<? extends Field> getStaticFields();

    String getSuperclass();

    String getType();

    Iterable<? extends Method> getVirtualMethods();
}
