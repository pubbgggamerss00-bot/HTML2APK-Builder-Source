package org.jf.dexlib2.iface;

import java.util.Set;

/* loaded from: classes3.dex */
public interface BasicAnnotation {
    Set<? extends AnnotationElement> getElements();

    String getType();
}
