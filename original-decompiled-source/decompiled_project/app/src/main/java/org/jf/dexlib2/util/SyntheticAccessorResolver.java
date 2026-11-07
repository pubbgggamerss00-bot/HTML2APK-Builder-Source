package org.jf.dexlib2.util;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nc.r;
import nc.s;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public class SyntheticAccessorResolver {
    public static final int ADD_ASSIGNMENT = 7;
    public static final int AND_ASSIGNMENT = 12;
    public static final int DIV_ASSIGNMENT = 10;
    public static final int GETTER = 1;
    public static final int METHOD = 0;
    public static final int MUL_ASSIGNMENT = 9;
    public static final int OR_ASSIGNMENT = 13;
    public static final int POSTFIX_DECREMENT = 5;
    public static final int POSTFIX_INCREMENT = 3;
    public static final int PREFIX_DECREMENT = 6;
    public static final int PREFIX_INCREMENT = 4;
    public static final int REM_ASSIGNMENT = 11;
    public static final int SETTER = 2;
    public static final int SHL_ASSIGNMENT = 15;
    public static final int SHR_ASSIGNMENT = 16;
    public static final int SUB_ASSIGNMENT = 8;
    public static final int USHR_ASSIGNMENT = 17;
    public static final int XOR_ASSIGNMENT = 14;
    private final Map<String, ClassDef> classDefMap;
    private final Map<MethodReference, AccessedMember> resolvedAccessors = new ConcurrentHashMap();
    private final SyntheticAccessorFSM syntheticAccessorFSM;

    public static class AccessedMember {
        public final Reference accessedMember;
        public final int accessedMemberType;

        public AccessedMember(int i10, Reference reference) {
            this.accessedMemberType = i10;
            this.accessedMember = reference;
        }
    }

    public SyntheticAccessorResolver(Opcodes opcodes, Iterable<? extends ClassDef> iterable) {
        this.syntheticAccessorFSM = new SyntheticAccessorFSM(opcodes);
        s.a aVar = new s.a(4);
        for (ClassDef classDef : iterable) {
            aVar.b(classDef.getType(), classDef);
        }
        this.classDefMap = aVar.a();
    }

    public static boolean looksLikeSyntheticAccessor(String str) {
        return str.startsWith("access$");
    }

    private static boolean methodReferenceEquals(MethodReference methodReference, MethodReference methodReference2) {
        return methodReference.getName().equals(methodReference2.getName()) && methodReference.getReturnType().equals(methodReference2.getReturnType()) && methodReference.getParameterTypes().equals(methodReference2.getParameterTypes());
    }

    public AccessedMember getAccessedMember(MethodReference methodReference) {
        Method next;
        MethodImplementation implementation;
        r rVarJ;
        int iTest;
        AccessedMember accessedMember = this.resolvedAccessors.get(methodReference);
        if (accessedMember != null) {
            return accessedMember;
        }
        ClassDef classDef = this.classDefMap.get(methodReference.getDefiningClass());
        if (classDef == null) {
            return null;
        }
        Iterator<? extends Method> it = classDef.getMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                implementation = null;
                break;
            }
            next = it.next();
            implementation = next.getImplementation();
            if (implementation != null && methodReferenceEquals(next, methodReference)) {
                break;
            }
        }
        if (next == null || !AccessFlags.SYNTHETIC.isSet(next.getAccessFlags()) || (iTest = this.syntheticAccessorFSM.test((rVarJ = r.j(implementation.getInstructions())))) < 0) {
            return null;
        }
        AccessedMember accessedMember2 = new AccessedMember(iTest, ((ReferenceInstruction) rVarJ.get(0)).getReference());
        this.resolvedAccessors.put(methodReference, accessedMember2);
        return accessedMember2;
    }
}
