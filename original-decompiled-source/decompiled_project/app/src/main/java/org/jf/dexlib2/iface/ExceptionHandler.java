package org.jf.dexlib2.iface;

import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public interface ExceptionHandler extends Comparable<ExceptionHandler> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(ExceptionHandler exceptionHandler);

    boolean equals(Object obj);

    String getExceptionType();

    TypeReference getExceptionTypeReference();

    int getHandlerCodeAddress();

    int hashCode();
}
