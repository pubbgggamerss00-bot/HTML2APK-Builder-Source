package org.jf.dexlib2.util;

import java.util.Collection;
import java.util.Iterator;
import lc.l;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.util.CharSequenceUtils;

/* loaded from: classes3.dex */
public final class MethodUtil {
    private static int directMask = (AccessFlags.STATIC.getValue() | AccessFlags.PRIVATE.getValue()) | AccessFlags.CONSTRUCTOR.getValue();
    public static l<Method> METHOD_IS_DIRECT = new l<Method>() { // from class: org.jf.dexlib2.util.MethodUtil.1
        @Override // lc.l
        public boolean apply(Method method) {
            return method != null && MethodUtil.isDirect(method);
        }
    };
    public static l<Method> METHOD_IS_VIRTUAL = new l<Method>() { // from class: org.jf.dexlib2.util.MethodUtil.2
        @Override // lc.l
        public boolean apply(Method method) {
            return (method == null || MethodUtil.isDirect(method)) ? false : true;
        }
    };

    private MethodUtil() {
    }

    public static int getParameterRegisterCount(Method method) {
        return getParameterRegisterCount(method, isStatic(method));
    }

    public static String getShorty(Collection<? extends CharSequence> collection, String str) {
        StringBuilder sb = new StringBuilder(collection.size() + 1);
        sb.append(getShortyType(str));
        Iterator<? extends CharSequence> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(getShortyType(it.next()));
        }
        return sb.toString();
    }

    private static char getShortyType(CharSequence charSequence) {
        return charSequence.length() > 1 ? Matrix.MATRIX_TYPE_RANDOM_LT : charSequence.charAt(0);
    }

    public static boolean isConstructor(MethodReference methodReference) {
        return methodReference.getName().equals("<init>");
    }

    public static boolean isDirect(Method method) {
        return (method.getAccessFlags() & directMask) != 0;
    }

    public static boolean isPackagePrivate(Method method) {
        return (method.getAccessFlags() & ((AccessFlags.PRIVATE.getValue() | AccessFlags.PROTECTED.getValue()) | AccessFlags.PUBLIC.getValue())) == 0;
    }

    public static boolean isStatic(Method method) {
        return AccessFlags.STATIC.isSet(method.getAccessFlags());
    }

    public static boolean methodSignaturesMatch(MethodReference methodReference, MethodReference methodReference2) {
        return methodReference.getName().equals(methodReference2.getName()) && methodReference.getReturnType().equals(methodReference2.getReturnType()) && CharSequenceUtils.listEquals(methodReference.getParameterTypes(), methodReference2.getParameterTypes());
    }

    public static int getParameterRegisterCount(MethodReference methodReference, boolean z10) {
        return getParameterRegisterCount(methodReference.getParameterTypes(), z10);
    }

    public static int getParameterRegisterCount(Collection<? extends CharSequence> collection, boolean z10) {
        Iterator<? extends CharSequence> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            char cCharAt = it.next().charAt(0);
            i10 = (cCharAt == 'J' || cCharAt == 'D') ? i10 + 2 : i10 + 1;
        }
        return !z10 ? i10 + 1 : i10;
    }
}
