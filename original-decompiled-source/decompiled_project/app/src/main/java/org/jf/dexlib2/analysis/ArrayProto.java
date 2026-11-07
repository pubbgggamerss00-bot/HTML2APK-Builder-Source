package org.jf.dexlib2.analysis;

import d0.h0;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.immutable.reference.ImmutableFieldReference;
import org.jf.dexlib2.util.TypeUtils;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class ArrayProto implements TypeProto {
    private static final String BRACKETS = h0.c(256, "[");
    protected final ClassPath classPath;
    protected final int dimensions;
    protected final String elementType;

    public ArrayProto(ClassPath classPath, String str) {
        this.classPath = classPath;
        int i10 = 0;
        while (str.charAt(i10) == '[') {
            i10++;
            if (i10 == str.length()) {
                throw new ExceptionWithContext("Invalid array type: %s", str);
            }
        }
        if (i10 == 0) {
            throw new ExceptionWithContext("Invalid array type: %s", str);
        }
        this.dimensions = i10;
        this.elementType = str.substring(i10);
    }

    private static String makeArrayType(String str, int i10) {
        return BRACKETS.substring(0, i10) + str;
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public int findMethodIndexInVtable(MethodReference methodReference) {
        return this.classPath.getClass("Ljava/lang/Object;").findMethodIndexInVtable(methodReference);
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public ClassPath getClassPath() {
        return this.classPath;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    @Override // org.jf.dexlib2.analysis.TypeProto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TypeProto getCommonSuperclass(TypeProto typeProto) {
        if (!(typeProto instanceof ArrayProto)) {
            if (!(typeProto instanceof ClassProto)) {
                return typeProto.getCommonSuperclass(this);
            }
            try {
                if (typeProto.isInterface()) {
                    if (implementsInterface(typeProto.getType())) {
                        return typeProto;
                    }
                }
            } catch (UnresolvedClassException unused) {
            }
            return this.classPath.getClass("Ljava/lang/Object;");
        }
        if (!TypeUtils.isPrimitiveType(getElementType())) {
            ArrayProto arrayProto = (ArrayProto) typeProto;
            if (TypeUtils.isPrimitiveType(arrayProto.getElementType())) {
                ArrayProto arrayProto2 = (ArrayProto) typeProto;
                if (this.dimensions != arrayProto2.dimensions || !getElementType().equals(arrayProto2.getElementType())) {
                    return this.classPath.getClass("Ljava/lang/Object;");
                }
            } else {
                int i10 = this.dimensions;
                int i11 = arrayProto.dimensions;
                if (i10 != i11) {
                    return this.classPath.getClass(makeArrayType("Ljava/lang/Object;", Math.min(i10, i11)));
                }
                TypeProto typeProto2 = this.classPath.getClass(this.elementType);
                TypeProto typeProto3 = this.classPath.getClass(arrayProto.elementType);
                TypeProto commonSuperclass = typeProto2.getCommonSuperclass(typeProto3);
                if (typeProto2 != commonSuperclass) {
                    return typeProto3 == commonSuperclass ? typeProto : this.classPath.getClass(makeArrayType(commonSuperclass.getType(), this.dimensions));
                }
            }
        }
        return this;
    }

    public int getDimensions() {
        return this.dimensions;
    }

    public String getElementType() {
        return this.elementType;
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public FieldReference getFieldByOffset(int i10) {
        if (i10 == 8) {
            return new ImmutableFieldReference(getType(), "length", "int");
        }
        return null;
    }

    public String getImmediateElementType() {
        int i10 = this.dimensions;
        return i10 > 1 ? makeArrayType(this.elementType, i10 - 1) : this.elementType;
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public Method getMethodByVtableIndex(int i10) {
        return this.classPath.getClass("Ljava/lang/Object;").getMethodByVtableIndex(i10);
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public String getSuperclass() {
        return "Ljava/lang/Object;";
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public String getType() {
        return makeArrayType(this.elementType, this.dimensions);
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public boolean implementsInterface(String str) {
        return str.equals("Ljava/lang/Cloneable;") || str.equals("Ljava/io/Serializable;");
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public boolean isInterface() {
        return false;
    }

    public String toString() {
        return getType();
    }
}
