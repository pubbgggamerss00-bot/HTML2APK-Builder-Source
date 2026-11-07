package org.jf.dexlib2.util;

import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public final class TypeUtils {
    private TypeUtils() {
    }

    public static boolean canAccessClass(String str, ClassDef classDef) {
        if (AccessFlags.PUBLIC.isSet(classDef.getAccessFlags())) {
            return true;
        }
        return getPackage(classDef.getType()).equals(getPackage(str));
    }

    public static String getPackage(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf < 0 ? "" : str.substring(1, iLastIndexOf);
    }

    public static boolean isPrimitiveType(String str) {
        return str.length() == 1;
    }

    public static boolean isWideType(String str) {
        char cCharAt = str.charAt(0);
        return cCharAt == 'J' || cCharAt == 'D';
    }

    public static boolean isWideType(TypeReference typeReference) {
        return isWideType(typeReference.getType());
    }
}
