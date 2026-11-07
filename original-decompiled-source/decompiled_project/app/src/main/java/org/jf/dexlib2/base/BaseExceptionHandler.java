package org.jf.dexlib2.base;

import i0.u2;
import java.util.Comparator;
import lc.i;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public abstract class BaseExceptionHandler implements ExceptionHandler {
    public static final Comparator<ExceptionHandler> BY_EXCEPTION = new Comparator<ExceptionHandler>() { // from class: org.jf.dexlib2.base.BaseExceptionHandler.2
        @Override // java.util.Comparator
        public int compare(ExceptionHandler exceptionHandler, ExceptionHandler exceptionHandler2) {
            String exceptionType = exceptionHandler.getExceptionType();
            if (exceptionType == null) {
                return exceptionHandler2.getExceptionType() != null ? 1 : 0;
            }
            if (exceptionHandler2.getExceptionType() == null) {
                return -1;
            }
            return exceptionType.compareTo(exceptionHandler2.getExceptionType());
        }
    };

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public boolean equals(Object obj) {
        if (obj instanceof ExceptionHandler) {
            ExceptionHandler exceptionHandler = (ExceptionHandler) obj;
            if (i.a(getExceptionType(), exceptionHandler.getExceptionType()) && getHandlerCodeAddress() == exceptionHandler.getHandlerCodeAddress()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public TypeReference getExceptionTypeReference() {
        final String exceptionType = getExceptionType();
        if (exceptionType == null) {
            return null;
        }
        return new BaseTypeReference() { // from class: org.jf.dexlib2.base.BaseExceptionHandler.1
            @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
            public String getType() {
                return exceptionType;
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public int hashCode() {
        String exceptionType = getExceptionType();
        return getHandlerCodeAddress() + ((exceptionType == null ? 0 : exceptionType.hashCode()) * 31);
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler, java.lang.Comparable
    public int compareTo(ExceptionHandler exceptionHandler) {
        String exceptionType = getExceptionType();
        if (exceptionType == null) {
            if (exceptionHandler.getExceptionType() != null) {
                return 1;
            }
        } else {
            if (exceptionHandler.getExceptionType() == null) {
                return -1;
            }
            int iCompareTo = exceptionType.compareTo(exceptionHandler.getExceptionType());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return u2.c(getHandlerCodeAddress(), exceptionHandler.getHandlerCodeAddress());
    }
}
