package org.jf.dexlib2.analysis;

import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.analysis.util.TypeProtoUtils;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.util.MethodUtil;
import org.jf.dexlib2.util.TypeUtils;

/* loaded from: classes3.dex */
public class AnalyzedMethodUtil {
    public static boolean canAccess(TypeProto typeProto, Method method, boolean z10, boolean z11, boolean z12) {
        if (z10 && MethodUtil.isPackagePrivate(method) && !TypeUtils.getPackage(method.getDefiningClass()).equals(TypeUtils.getPackage(typeProto.getType()))) {
            return false;
        }
        if (z11 && (method.getAccessFlags() & AccessFlags.PROTECTED.getValue()) != 0 && !TypeProtoUtils.extendsFrom(typeProto, method.getDefiningClass())) {
            return false;
        }
        if (z12) {
            return TypeUtils.canAccessClass(typeProto.getType(), typeProto.getClassPath().getClassDef(method.getDefiningClass()));
        }
        return true;
    }
}
