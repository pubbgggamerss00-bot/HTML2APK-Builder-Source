package org.jf.dexlib2.analysis;

import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;

/* loaded from: classes3.dex */
public class UnknownClassProto implements TypeProto {
    protected final ClassPath classPath;

    public UnknownClassProto(ClassPath classPath) {
        this.classPath = classPath;
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public int findMethodIndexInVtable(MethodReference methodReference) {
        return this.classPath.getClass("Ljava/lang/Object;").findMethodIndexInVtable(methodReference);
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public ClassPath getClassPath() {
        return this.classPath;
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public TypeProto getCommonSuperclass(TypeProto typeProto) {
        return typeProto.getType().equals("Ljava/lang/Object;") ? typeProto : typeProto instanceof ArrayProto ? this.classPath.getClass("Ljava/lang/Object;") : this;
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public FieldReference getFieldByOffset(int i10) {
        return this.classPath.getClass("Ljava/lang/Object;").getFieldByOffset(i10);
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public Method getMethodByVtableIndex(int i10) {
        return this.classPath.getClass("Ljava/lang/Object;").getMethodByVtableIndex(i10);
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public String getSuperclass() {
        return null;
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public String getType() {
        return "Ujava/lang/Object;";
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public boolean implementsInterface(String str) {
        return false;
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public boolean isInterface() {
        return false;
    }

    public String toString() {
        return "Ujava/lang/Object;";
    }
}
