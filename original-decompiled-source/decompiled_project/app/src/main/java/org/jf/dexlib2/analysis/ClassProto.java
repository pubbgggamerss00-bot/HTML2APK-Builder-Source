package org.jf.dexlib2.analysis;

import i0.u2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import lc.g;
import lc.m;
import lc.t;
import lc.u;
import nc.j0;
import nc.k;
import nc.k0;
import nc.v;
import nc.w0;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.analysis.util.TypeProtoUtils;
import org.jf.dexlib2.base.reference.BaseMethodReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.MethodParameter;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.util.AlignmentUtils;
import org.jf.dexlib2.util.MethodUtil;
import org.jf.util.ExceptionWithContext;
import org.jf.util.SparseArray;

/* loaded from: classes3.dex */
public class ClassProto implements TypeProto {
    private static final byte OTHER = 2;
    private static final byte REFERENCE = 0;
    private static final byte WIDE = 1;
    protected final ClassPath classPath;
    protected final String type;
    protected boolean vtableFullyResolved = true;
    protected boolean interfacesFullyResolved = true;
    protected Set<String> unresolvedInterfaces = null;
    private final t<ClassDef> classDefSupplier = u.a(new t<ClassDef>() { // from class: org.jf.dexlib2.analysis.ClassProto.1
        @Override // lc.t
        public ClassDef get() {
            ClassProto classProto = ClassProto.this;
            return classProto.classPath.getClassDef(classProto.type);
        }
    });
    private final t<LinkedHashMap<String, ClassDef>> preDefaultMethodInterfaceSupplier = u.a(new t<LinkedHashMap<String, ClassDef>>() { // from class: org.jf.dexlib2.analysis.ClassProto.2
        @Override // lc.t
        public LinkedHashMap<String, ClassDef> get() {
            HashSet hashSet = new HashSet(0);
            LinkedHashMap<String, ClassDef> linkedHashMap = new LinkedHashMap<>();
            try {
                for (String str : ClassProto.this.getClassDef().getInterfaces()) {
                    if (!linkedHashMap.containsKey(str)) {
                        try {
                            linkedHashMap.put(str, ClassProto.this.classPath.getClassDef(str));
                        } catch (UnresolvedClassException unused) {
                            linkedHashMap.put(str, null);
                            hashSet.add(str);
                            ClassProto.this.interfacesFullyResolved = false;
                        }
                        ClassProto classProto = (ClassProto) ClassProto.this.classPath.getClass(str);
                        for (String str2 : classProto.getInterfaces().keySet()) {
                            if (!linkedHashMap.containsKey(str2)) {
                                linkedHashMap.put(str2, classProto.getInterfaces().get(str2));
                            }
                        }
                        if (!classProto.interfacesFullyResolved) {
                            hashSet.addAll(classProto.getUnresolvedInterfaces());
                            ClassProto.this.interfacesFullyResolved = false;
                        }
                    }
                }
            } catch (UnresolvedClassException unused2) {
                linkedHashMap.put(ClassProto.this.type, null);
                hashSet.add(ClassProto.this.type);
                ClassProto.this.interfacesFullyResolved = false;
            }
            if (ClassProto.this.isInterface() && !linkedHashMap.containsKey(ClassProto.this.getType())) {
                linkedHashMap.put(ClassProto.this.getType(), null);
            }
            String superclass = ClassProto.this.getSuperclass();
            if (superclass != null) {
                try {
                    ClassProto classProto2 = (ClassProto) ClassProto.this.classPath.getClass(superclass);
                    for (String str3 : classProto2.getInterfaces().keySet()) {
                        if (!linkedHashMap.containsKey(str3)) {
                            linkedHashMap.put(str3, null);
                        }
                    }
                    if (!classProto2.interfacesFullyResolved) {
                        hashSet.addAll(classProto2.getUnresolvedInterfaces());
                        ClassProto.this.interfacesFullyResolved = false;
                    }
                } catch (UnresolvedClassException unused3) {
                    hashSet.add(superclass);
                    ClassProto.this.interfacesFullyResolved = false;
                }
            }
            if (hashSet.size() > 0) {
                ClassProto.this.unresolvedInterfaces = hashSet;
            }
            return linkedHashMap;
        }
    });
    private final t<LinkedHashMap<String, ClassDef>> postDefaultMethodInterfaceSupplier = u.a(new t<LinkedHashMap<String, ClassDef>>() { // from class: org.jf.dexlib2.analysis.ClassProto.3
        @Override // lc.t
        public LinkedHashMap<String, ClassDef> get() {
            HashSet hashSet = new HashSet(0);
            LinkedHashMap<String, ClassDef> linkedHashMap = new LinkedHashMap<>();
            String superclass = ClassProto.this.getSuperclass();
            if (superclass != null) {
                ClassProto classProto = (ClassProto) ClassProto.this.classPath.getClass(superclass);
                Iterator<String> it = classProto.getInterfaces().keySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), null);
                }
                if (!classProto.interfacesFullyResolved) {
                    hashSet.addAll(classProto.getUnresolvedInterfaces());
                    ClassProto.this.interfacesFullyResolved = false;
                }
            }
            try {
                for (String str : ClassProto.this.getClassDef().getInterfaces()) {
                    if (!linkedHashMap.containsKey(str)) {
                        ClassProto classProto2 = (ClassProto) ClassProto.this.classPath.getClass(str);
                        try {
                            for (Map.Entry<String, ClassDef> entry : classProto2.getInterfaces().entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } catch (UnresolvedClassException unused) {
                            linkedHashMap.put(str, null);
                            hashSet.add(str);
                            ClassProto.this.interfacesFullyResolved = false;
                        }
                        if (!classProto2.interfacesFullyResolved) {
                            hashSet.addAll(classProto2.getUnresolvedInterfaces());
                            ClassProto.this.interfacesFullyResolved = false;
                        }
                        try {
                            linkedHashMap.put(str, ClassProto.this.classPath.getClassDef(str));
                        } catch (UnresolvedClassException unused2) {
                            linkedHashMap.put(str, null);
                            hashSet.add(str);
                            ClassProto.this.interfacesFullyResolved = false;
                        }
                    }
                }
            } catch (UnresolvedClassException unused3) {
                linkedHashMap.put(ClassProto.this.type, null);
                hashSet.add(ClassProto.this.type);
                ClassProto.this.interfacesFullyResolved = false;
            }
            if (hashSet.size() > 0) {
                ClassProto.this.unresolvedInterfaces = hashSet;
            }
            return linkedHashMap;
        }
    });
    private final t<SparseArray<FieldReference>> dalvikInstanceFieldsSupplier = u.a(new t<SparseArray<FieldReference>>() { // from class: org.jf.dexlib2.analysis.ClassProto.4
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private ArrayList<Field> getSortedInstanceFields(ClassDef classDef) {
            ArrayList<Field> arrayListA = k0.a(classDef.getInstanceFields());
            Collections.sort(arrayListA);
            return arrayListA;
        }

        private void swap(byte[] bArr, List<Field> list, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
            list.set(i11, list.set(i10, list.get(i11)));
        }

        @Override // lc.t
        public SparseArray<FieldReference> get() {
            ClassProto classProto;
            int nextFieldOffset;
            ArrayList<Field> sortedInstanceFields = getSortedInstanceFields(ClassProto.this.getClassDef());
            int size = sortedInstanceFields.size();
            byte[] bArr = new byte[sortedInstanceFields.size()];
            for (int i10 = 0; i10 < size; i10++) {
                bArr[i10] = ClassProto.getFieldType(sortedInstanceFields.get(i10));
            }
            int size2 = sortedInstanceFields.size() - 1;
            int i11 = 0;
            while (i11 < size) {
                if (bArr[i11] != 0) {
                    while (true) {
                        if (size2 <= i11) {
                            break;
                        }
                        if (bArr[size2] == 0) {
                            swap(bArr, sortedInstanceFields, i11, size2);
                            size2--;
                            break;
                        }
                        size2--;
                    }
                }
                if (bArr[i11] != 0) {
                    break;
                }
                i11++;
            }
            String superclass = ClassProto.this.getSuperclass();
            int i12 = 8;
            if (superclass != null) {
                classProto = (ClassProto) ClassProto.this.classPath.getClass(superclass);
                nextFieldOffset = classProto.getNextFieldOffset();
            } else {
                classProto = null;
                nextFieldOffset = 8;
            }
            int i13 = nextFieldOffset % 8 == 0 ? 0 : 1;
            if (i11 < size && i11 % 2 != i13) {
                if (bArr[i11] == 1) {
                    int i14 = size - 1;
                    while (true) {
                        if (i14 <= i11) {
                            break;
                        }
                        if (bArr[i14] == 2) {
                            swap(bArr, sortedInstanceFields, i11, i14);
                            i11++;
                            break;
                        }
                        i14--;
                    }
                } else {
                    i11++;
                }
            }
            int i15 = size - 1;
            while (i11 < size) {
                if (bArr[i11] != 1) {
                    while (true) {
                        if (i15 <= i11) {
                            break;
                        }
                        if (bArr[i15] == 1) {
                            swap(bArr, sortedInstanceFields, i11, i15);
                            i15--;
                            break;
                        }
                        i15--;
                    }
                }
                if (bArr[i11] != 1) {
                    break;
                }
                i11++;
            }
            SparseArray<FieldReference> instanceFields = classProto != null ? classProto.getInstanceFields() : new SparseArray<>();
            int size3 = instanceFields.size();
            SparseArray<FieldReference> sparseArray = new SparseArray<>(size3 + size);
            if (classProto != null && size3 > 0) {
                for (int i16 = 0; i16 < size3; i16++) {
                    sparseArray.append(instanceFields.keyAt(i16), instanceFields.valueAt(i16));
                }
                int i17 = size3 - 1;
                int iKeyAt = sparseArray.keyAt(i17);
                char cCharAt = instanceFields.valueAt(i17).getType().charAt(0);
                i12 = (cCharAt == 'J' || cCharAt == 'D') ? iKeyAt + 8 : iKeyAt + 4;
            }
            boolean z10 = false;
            for (int i18 = 0; i18 < size; i18++) {
                Field field = sortedInstanceFields.get(i18);
                if (bArr[i18] == 1 && !z10) {
                    if (i12 % 8 != 0) {
                        i12 += 4;
                    }
                    z10 = true;
                }
                sparseArray.append(i12, field);
                i12 = bArr[i18] == 1 ? i12 + 8 : i12 + 4;
            }
            return sparseArray;
        }
    });
    private final t<SparseArray<FieldReference>> artInstanceFieldsSupplier = u.a(new t<SparseArray<FieldReference>>() { // from class: org.jf.dexlib2.analysis.ClassProto.5
        private void addFieldGap(int i10, int i11, PriorityQueue<FieldGap> priorityQueue) {
            while (i10 < i11) {
                int i12 = i11 - i10;
                if (i12 >= 4 && i10 % 4 == 0) {
                    priorityQueue.add(FieldGap.newFieldGap(i10, 4, ClassProto.this.classPath.oatVersion));
                    i10 += 4;
                } else if (i12 < 2 || i10 % 2 != 0) {
                    priorityQueue.add(FieldGap.newFieldGap(i10, 1, ClassProto.this.classPath.oatVersion));
                    i10++;
                } else {
                    priorityQueue.add(FieldGap.newFieldGap(i10, 2, ClassProto.this.classPath.oatVersion));
                    i10 += 2;
                }
            }
        }

        private int getFieldSize(FieldReference fieldReference) {
            return ClassProto.getTypeSize(fieldReference.getType().charAt(0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getFieldSortOrder(FieldReference fieldReference) {
            char cCharAt = fieldReference.getType().charAt(0);
            if (cCharAt == 'F') {
                return 4;
            }
            if (cCharAt != 'L') {
                if (cCharAt == 'S') {
                    return 6;
                }
                if (cCharAt == 'I') {
                    return 3;
                }
                if (cCharAt == 'J') {
                    return 1;
                }
                if (cCharAt == 'Z') {
                    return 7;
                }
                if (cCharAt != '[') {
                    switch (cCharAt) {
                        case EACTags.ADDRESS /* 66 */:
                            return 8;
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                            return 5;
                        case 'D':
                            return 2;
                        default:
                            throw new ExceptionWithContext("Invalid field type: %s", fieldReference.getType());
                    }
                }
            }
            return 0;
        }

        private ArrayList<Field> getSortedInstanceFields(ClassDef classDef) {
            ArrayList<Field> arrayListA = k0.a(classDef.getInstanceFields());
            Collections.sort(arrayListA, new Comparator<Field>() { // from class: org.jf.dexlib2.analysis.ClassProto.5.1
                @Override // java.util.Comparator
                public int compare(Field field, Field field2) {
                    int iC = u2.c(getFieldSortOrder(field), getFieldSortOrder(field2));
                    if (iC != 0) {
                        return iC;
                    }
                    int iCompareTo = field.getName().compareTo(field2.getName());
                    return iCompareTo != 0 ? iCompareTo : field.getType().compareTo(field2.getType());
                }
            });
            return arrayListA;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
        @Override // lc.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SparseArray<FieldReference> get() {
            int fieldSize;
            PriorityQueue<FieldGap> priorityQueue = new PriorityQueue<>();
            SparseArray<FieldReference> sparseArray = new SparseArray<>();
            ArrayList<Field> sortedInstanceFields = getSortedInstanceFields(ClassProto.this.getClassDef());
            String superclass = ClassProto.this.getSuperclass();
            int i10 = 0;
            if (superclass != null) {
                SparseArray<FieldReference> instanceFields = ((ClassProto) ClassProto.this.classPath.getClass(superclass)).getInstanceFields();
                FieldReference fieldReferenceValueAt = null;
                int iKeyAt = 0;
                for (int i11 = 0; i11 < instanceFields.size(); i11++) {
                    iKeyAt = instanceFields.keyAt(i11);
                    fieldReferenceValueAt = instanceFields.valueAt(i11);
                    sparseArray.put(iKeyAt, fieldReferenceValueAt);
                }
                fieldSize = fieldReferenceValueAt != null ? iKeyAt + getFieldSize(fieldReferenceValueAt) : 0;
            }
            int size = sortedInstanceFields.size();
            while (i10 < size) {
                Field field = sortedInstanceFields.get(i10);
                i10++;
                Field field2 = field;
                int fieldSize2 = getFieldSize(field2);
                if (!AlignmentUtils.isAligned(fieldSize, fieldSize2)) {
                    int iAlignOffset = AlignmentUtils.alignOffset(fieldSize, fieldSize2);
                    addFieldGap(fieldSize, iAlignOffset, priorityQueue);
                    fieldSize = iAlignOffset;
                }
                FieldGap fieldGapPeek = priorityQueue.peek();
                if (fieldGapPeek == null || fieldGapPeek.size < fieldSize2) {
                    sparseArray.append(fieldSize, field2);
                    fieldSize += fieldSize2;
                } else {
                    priorityQueue.poll();
                    sparseArray.put(fieldGapPeek.offset, field2);
                    int i12 = fieldGapPeek.size;
                    if (i12 > fieldSize2) {
                        int i13 = fieldGapPeek.offset;
                        addFieldGap(fieldSize2 + i13, i13 + i12, priorityQueue);
                    }
                }
            }
            return sparseArray;
        }
    });
    private final t<List<Method>> preDefaultMethodVtableSupplier = u.a(new t<List<Method>>() { // from class: org.jf.dexlib2.analysis.ClassProto.6
        @Override // lc.t
        public List<Method> get() {
            ArrayList arrayList = new ArrayList();
            try {
                String superclass = ClassProto.this.getSuperclass();
                if (superclass != null) {
                    ClassProto classProto = (ClassProto) ClassProto.this.classPath.getClass(superclass);
                    arrayList.addAll(classProto.getVtable());
                    if (!classProto.vtableFullyResolved) {
                        ClassProto.this.vtableFullyResolved = false;
                        return arrayList;
                    }
                }
                if (!ClassProto.this.isInterface()) {
                    ClassProto classProto2 = ClassProto.this;
                    classProto2.addToVtable(classProto2.getClassDef().getVirtualMethods(), arrayList, true, true);
                    for (ClassDef classDef : ClassProto.this.getDirectInterfaces()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<? extends Method> it = classDef.getVirtualMethods().iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new ReparentedMethod(it.next(), ClassProto.this.type));
                        }
                        ClassProto.this.addToVtable(arrayList2, arrayList, false, true);
                    }
                }
                return arrayList;
            } catch (UnresolvedClassException unused) {
                arrayList.addAll(((ClassProto) ClassProto.this.classPath.getClass("Ljava/lang/Object;")).getVtable());
                ClassProto.this.vtableFullyResolved = false;
                return arrayList;
            }
        }
    });
    private final t<List<Method>> buggyPostDefaultMethodVtableSupplier = u.a(new t<List<Method>>() { // from class: org.jf.dexlib2.analysis.ClassProto.7
        @Override // lc.t
        public List<Method> get() {
            ArrayList arrayList;
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            try {
                String superclass = ClassProto.this.getSuperclass();
                if (superclass != null) {
                    ClassProto classProto = (ClassProto) ClassProto.this.classPath.getClass(superclass);
                    arrayList2.addAll(classProto.getVtable());
                    if (!classProto.vtableFullyResolved) {
                        ClassProto.this.vtableFullyResolved = false;
                        return arrayList2;
                    }
                }
                if (!ClassProto.this.isInterface()) {
                    ClassProto classProto2 = ClassProto.this;
                    classProto2.addToVtable(classProto2.getClassDef().getVirtualMethods(), arrayList2, true, true);
                    ArrayList arrayListA = k0.a(ClassProto.this.getInterfaces().keySet());
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    final HashMap map = new HashMap();
                    int size = arrayListA.size() - 1;
                    while (size >= 0) {
                        for (Method method : ClassProto.this.classPath.getClassDef((String) arrayListA.get(size)).getVirtualMethods()) {
                            int iFindMethodIndexInVtableReverse = ClassProto.this.findMethodIndexInVtableReverse(arrayList2, method);
                            Method method2 = iFindMethodIndexInVtableReverse >= 0 ? (Method) arrayList2.get(iFindMethodIndexInVtableReverse) : null;
                            int i11 = i10;
                            while (i11 < arrayList2.size()) {
                                Method method3 = (Method) arrayList2.get(i11);
                                if (MethodUtil.methodSignaturesMatch(method3, method)) {
                                    if (ClassProto.this.classPath.shouldCheckPackagePrivateAccess()) {
                                        arrayList = arrayListA;
                                        if (AnalyzedMethodUtil.canAccess(ClassProto.this, method3, true, false, false)) {
                                        }
                                    } else {
                                        arrayList = arrayListA;
                                    }
                                    if (ClassProto.this.interfaceMethodOverrides(method, method3)) {
                                        arrayList2.set(i11, method);
                                    }
                                } else {
                                    arrayList = arrayListA;
                                }
                                i11++;
                                arrayListA = arrayList;
                            }
                            ArrayList arrayList6 = arrayListA;
                            if (iFindMethodIndexInVtableReverse < 0 || ClassProto.this.isOverridableByDefaultMethod((Method) arrayList2.get(iFindMethodIndexInVtableReverse))) {
                                int iFindMethodIndexInVtable = ClassProto.this.findMethodIndexInVtable(arrayList3, method);
                                if (iFindMethodIndexInVtable >= 0) {
                                    if (!AccessFlags.ABSTRACT.isSet(method.getAccessFlags()) && !((ClassProto) ClassProto.this.classPath.getClass(((Method) arrayList3.get(iFindMethodIndexInVtable)).getDefiningClass())).implementsInterface(method.getDefiningClass())) {
                                        arrayList4.add((Method) arrayList3.remove(iFindMethodIndexInVtable));
                                    }
                                } else if (ClassProto.this.findMethodIndexInVtable(arrayList4, method) < 0) {
                                    int iFindMethodIndexInVtable2 = ClassProto.this.findMethodIndexInVtable(arrayList5, method);
                                    if (iFindMethodIndexInVtable2 >= 0) {
                                        if (!AccessFlags.ABSTRACT.isSet(method.getAccessFlags()) && !((ClassProto) ClassProto.this.classPath.getClass(((Method) arrayList5.get(iFindMethodIndexInVtable2)).getDefiningClass())).implementsInterface(method.getDefiningClass())) {
                                            Integer num = (Integer) map.get((Method) arrayList5.remove(iFindMethodIndexInVtable2));
                                            num.intValue();
                                            map.put(method, num);
                                            arrayList3.add(method);
                                        }
                                    } else if (AccessFlags.ABSTRACT.isSet(method.getAccessFlags())) {
                                        if (method2 == null) {
                                            arrayList5.add(method);
                                            map.put(method, Integer.valueOf(map.size()));
                                        }
                                    } else if (method2 == null || ClassProto.this.interfaceMethodOverrides(method, method2)) {
                                        arrayList3.add(method);
                                        map.put(method, Integer.valueOf(map.size()));
                                    }
                                }
                            }
                            arrayListA = arrayList6;
                            i10 = 0;
                        }
                        size--;
                        i10 = 0;
                    }
                    Comparator<MethodReference> comparator = new Comparator<MethodReference>() { // from class: org.jf.dexlib2.analysis.ClassProto.7.1
                        @Override // java.util.Comparator
                        public int compare(MethodReference methodReference, MethodReference methodReference2) {
                            return u2.c(((Integer) map.get(methodReference)).intValue(), ((Integer) map.get(methodReference2)).intValue());
                        }
                    };
                    Collections.sort(arrayList5, comparator);
                    Collections.sort(arrayList3, comparator);
                    Collections.sort(arrayList4, comparator);
                    arrayList2.addAll(arrayList5);
                    arrayList2.addAll(arrayList3);
                    arrayList2.addAll(arrayList4);
                }
                return arrayList2;
            } catch (UnresolvedClassException unused) {
                arrayList2.addAll(((ClassProto) ClassProto.this.classPath.getClass("Ljava/lang/Object;")).getVtable());
                ClassProto.this.vtableFullyResolved = false;
                return arrayList2;
            }
        }
    });
    private final t<List<Method>> postDefaultMethodVtableSupplier = u.a(new t<List<Method>>() { // from class: org.jf.dexlib2.analysis.ClassProto.8
        @Override // lc.t
        public List<Method> get() {
            ArrayList arrayList = new ArrayList();
            try {
                String superclass = ClassProto.this.getSuperclass();
                if (superclass != null) {
                    ClassProto classProto = (ClassProto) ClassProto.this.classPath.getClass(superclass);
                    arrayList.addAll(classProto.getVtable());
                    if (!classProto.vtableFullyResolved) {
                        ClassProto.this.vtableFullyResolved = false;
                        return arrayList;
                    }
                }
                if (!ClassProto.this.isInterface()) {
                    ClassProto classProto2 = ClassProto.this;
                    classProto2.addToVtable(classProto2.getClassDef().getVirtualMethods(), arrayList, true, true);
                    List listC = k0.c(k0.a(ClassProto.this.getDirectInterfaces()));
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    final HashMap map = new HashMap();
                    Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        for (Method method : ((ClassDef) it.next()).getVirtualMethods()) {
                            int iFindMethodIndexInVtable = ClassProto.this.findMethodIndexInVtable(arrayList, method);
                            if (iFindMethodIndexInVtable < 0) {
                                int iFindMethodIndexInVtable2 = ClassProto.this.findMethodIndexInVtable(arrayList2, method);
                                if (iFindMethodIndexInVtable2 >= 0) {
                                    if (!AccessFlags.ABSTRACT.isSet(method.getAccessFlags()) && !((ClassProto) ClassProto.this.classPath.getClass(((Method) arrayList2.get(iFindMethodIndexInVtable2)).getDefiningClass())).implementsInterface(method.getDefiningClass())) {
                                        arrayList3.add((Method) arrayList2.remove(iFindMethodIndexInVtable2));
                                    }
                                } else if (ClassProto.this.findMethodIndexInVtable(arrayList3, method) < 0) {
                                    int iFindMethodIndexInVtable3 = ClassProto.this.findMethodIndexInVtable(arrayList4, method);
                                    if (iFindMethodIndexInVtable3 >= 0) {
                                        if (!AccessFlags.ABSTRACT.isSet(method.getAccessFlags()) && !((ClassProto) ClassProto.this.classPath.getClass(((Method) arrayList4.get(iFindMethodIndexInVtable3)).getDefiningClass())).implementsInterface(method.getDefiningClass())) {
                                            Integer num = (Integer) map.get((Method) arrayList4.remove(iFindMethodIndexInVtable3));
                                            num.intValue();
                                            map.put(method, num);
                                            arrayList2.add(method);
                                        }
                                    } else if (AccessFlags.ABSTRACT.isSet(method.getAccessFlags())) {
                                        arrayList4.add(method);
                                        map.put(method, Integer.valueOf(map.size()));
                                    } else {
                                        arrayList2.add(method);
                                        map.put(method, Integer.valueOf(map.size()));
                                    }
                                }
                            } else if (ClassProto.this.interfaceMethodOverrides(method, (Method) arrayList.get(iFindMethodIndexInVtable))) {
                                arrayList.set(iFindMethodIndexInVtable, method);
                            }
                        }
                    }
                    Comparator<MethodReference> comparator = new Comparator<MethodReference>() { // from class: org.jf.dexlib2.analysis.ClassProto.8.1
                        @Override // java.util.Comparator
                        public int compare(MethodReference methodReference, MethodReference methodReference2) {
                            return u2.c(((Integer) map.get(methodReference)).intValue(), ((Integer) map.get(methodReference2)).intValue());
                        }
                    };
                    Collections.sort(arrayList2, comparator);
                    Collections.sort(arrayList3, comparator);
                    Collections.sort(arrayList4, comparator);
                    ClassProto.this.addToVtable(arrayList2, arrayList, false, false);
                    ClassProto.this.addToVtable(arrayList3, arrayList, false, false);
                    ClassProto.this.addToVtable(arrayList4, arrayList, false, false);
                }
                return arrayList;
            } catch (UnresolvedClassException unused) {
                arrayList.addAll(((ClassProto) ClassProto.this.classPath.getClass("Ljava/lang/Object;")).getVtable());
                ClassProto.this.vtableFullyResolved = false;
                return arrayList;
            }
        }
    });

    public static abstract class FieldGap implements Comparable<FieldGap> {
        public final int offset;
        public final int size;

        public static FieldGap newFieldGap(int i10, int i11, int i12) {
            return i12 >= 67 ? new FieldGap(i10, i11) { // from class: org.jf.dexlib2.analysis.ClassProto.FieldGap.1
                @Override // java.lang.Comparable
                public int compareTo(FieldGap fieldGap) {
                    int iC = u2.c(fieldGap.size, this.size);
                    return iC != 0 ? iC : u2.c(this.offset, fieldGap.offset);
                }
            } : new FieldGap(i10, i11) { // from class: org.jf.dexlib2.analysis.ClassProto.FieldGap.2
                @Override // java.lang.Comparable
                public int compareTo(FieldGap fieldGap) {
                    int iC = u2.c(this.size, fieldGap.size);
                    return iC != 0 ? iC : u2.c(fieldGap.offset, this.offset);
                }
            };
        }

        private FieldGap(int i10, int i11) {
            this.offset = i10;
            this.size = i11;
        }
    }

    public static class ReparentedMethod extends BaseMethodReference implements Method {
        private final String definingClass;
        private final Method method;

        public ReparentedMethod(Method method, String str) {
            this.method = method;
            this.definingClass = str;
        }

        @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
        public int getAccessFlags() {
            return this.method.getAccessFlags();
        }

        @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Annotatable
        public Set<? extends Annotation> getAnnotations() {
            return this.method.getAnnotations();
        }

        @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
        public String getDefiningClass() {
            return this.definingClass;
        }

        @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
        public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
            return this.method.getHiddenApiRestrictions();
        }

        @Override // org.jf.dexlib2.iface.Method
        public MethodImplementation getImplementation() {
            return this.method.getImplementation();
        }

        @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
        public String getName() {
            return this.method.getName();
        }

        @Override // org.jf.dexlib2.iface.reference.MethodReference
        public List<? extends CharSequence> getParameterTypes() {
            return this.method.getParameterTypes();
        }

        @Override // org.jf.dexlib2.iface.Method
        public List<? extends MethodParameter> getParameters() {
            return this.method.getParameters();
        }

        @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method
        public String getReturnType() {
            return this.method.getReturnType();
        }
    }

    public ClassProto(ClassPath classPath, String str) {
        if (str.charAt(0) != 'L') {
            throw new ExceptionWithContext("Cannot construct ClassProto for non reference type: %s", str);
        }
        this.classPath = classPath;
        this.type = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToVtable(Iterable<? extends Method> iterable, List<Method> list, boolean z10, boolean z11) {
        Iterable<? extends Method> iterable2 = iterable;
        if (z11) {
            ArrayList arrayListA = k0.a(iterable);
            Collections.sort(arrayListA);
            iterable2 = arrayListA;
        }
        for (Method method : iterable2) {
            int iFindMethodIndexInVtable = findMethodIndexInVtable(list, method);
            if (iFindMethodIndexInVtable < 0) {
                list.add(method);
            } else if (z10) {
                list.set(iFindMethodIndexInVtable, method);
            }
        }
    }

    private boolean checkInterface(ClassProto classProto) {
        boolean z10;
        boolean zIsInterface;
        try {
            zIsInterface = isInterface();
            z10 = true;
        } catch (UnresolvedClassException unused) {
            z10 = false;
            zIsInterface = true;
        }
        if (zIsInterface) {
            try {
                if (classProto.implementsInterface(getType())) {
                    return true;
                }
            } catch (UnresolvedClassException e10) {
                if (z10) {
                    throw e10;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findMethodIndexInVtableReverse(List<Method> list, MethodReference methodReference) {
        for (int size = list.size() - 1; size >= 0; size--) {
            Method method = list.get(size);
            if (MethodUtil.methodSignaturesMatch(method, methodReference) && (!this.classPath.shouldCheckPackagePrivateAccess() || AnalyzedMethodUtil.canAccess(this, method, true, false, false))) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getFieldType(FieldReference fieldReference) {
        char cCharAt = fieldReference.getType().charAt(0);
        if (cCharAt == 'D' || cCharAt == 'J') {
            return (byte) 1;
        }
        return (cCharAt == 'L' || cCharAt == '[') ? (byte) 0 : (byte) 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getNextFieldOffset() {
        SparseArray<FieldReference> instanceFields = getInstanceFields();
        if (instanceFields.size() == 0) {
            return this.classPath.isArt() ? 0 : 8;
        }
        int size = instanceFields.size() - 1;
        int iKeyAt = instanceFields.keyAt(size);
        FieldReference fieldReferenceValueAt = instanceFields.valueAt(size);
        if (this.classPath.isArt()) {
            return iKeyAt + getTypeSize(fieldReferenceValueAt.getType().charAt(0));
        }
        char cCharAt = fieldReferenceValueAt.getType().charAt(0);
        return (cCharAt == 'D' || cCharAt == 'J') ? iKeyAt + 8 : iKeyAt + 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getTypeSize(char c10) {
        if (c10 == 'F' || c10 == 'L') {
            return 4;
        }
        if (c10 == 'S') {
            return 2;
        }
        if (c10 == 'I') {
            return 4;
        }
        if (c10 == 'J') {
            return 8;
        }
        if (c10 == 'Z') {
            return 1;
        }
        if (c10 == '[') {
            return 4;
        }
        switch (c10) {
            case EACTags.ADDRESS /* 66 */:
                return 1;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return 2;
            case 'D':
                return 8;
            default:
                throw new ExceptionWithContext("Invalid type: %s", Character.valueOf(c10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean interfaceMethodOverrides(Method method, Method method2) {
        if (((ClassProto) this.classPath.getClass(method2.getDefiningClass())).isInterface()) {
            return ((ClassProto) this.classPath.getClass(method.getDefiningClass())).implementsInterface(method2.getDefiningClass());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOverridableByDefaultMethod(Method method) {
        return ((ClassProto) this.classPath.getClass(method.getDefiningClass())).isInterface();
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public int findMethodIndexInVtable(MethodReference methodReference) {
        return findMethodIndexInVtable(getVtable(), methodReference);
    }

    public ClassDef getClassDef() {
        return this.classDefSupplier.get();
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public ClassPath getClassPath() {
        return this.classPath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (((org.jf.dexlib2.analysis.ClassProto) r6).checkInterface(r5) != false) goto L24;
     */
    @Override // org.jf.dexlib2.analysis.TypeProto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TypeProto getCommonSuperclass(TypeProto typeProto) {
        boolean z10;
        if (!(typeProto instanceof ClassProto)) {
            return typeProto.getCommonSuperclass(this);
        }
        if (this != typeProto && !getType().equals(typeProto.getType()) && !getType().equals("Ljava/lang/Object;")) {
            if (!typeProto.getType().equals("Ljava/lang/Object;")) {
                try {
                } catch (UnresolvedClassException unused) {
                    z10 = true;
                }
                if (!checkInterface((ClassProto) typeProto)) {
                    z10 = false;
                    try {
                    } catch (UnresolvedClassException unused2) {
                        z10 = true;
                    }
                }
            }
            return typeProto;
        }
        return this;
        if (z10) {
            return this.classPath.getUnknownClass();
        }
        ArrayList arrayListB = k0.b(this);
        Iterable<TypeProto> superclassChain = TypeProtoUtils.getSuperclassChain(this);
        if (superclassChain instanceof Collection) {
            arrayListB.addAll((Collection) superclassChain);
        } else {
            superclassChain.getClass();
            j0.a(arrayListB, superclassChain.iterator());
        }
        ArrayList arrayListB2 = k0.b(typeProto);
        Iterable<TypeProto> superclassChain2 = TypeProtoUtils.getSuperclassChain(typeProto);
        if (superclassChain2 instanceof Collection) {
            arrayListB2.addAll((Collection) superclassChain2);
        } else {
            superclassChain2.getClass();
            j0.a(arrayListB2, superclassChain2.iterator());
        }
        List listC = k0.c(arrayListB);
        List listC2 = k0.c(arrayListB2);
        for (int iMin = Math.min(listC.size(), listC2.size()) - 1; iMin >= 0; iMin--) {
            TypeProto typeProto2 = (TypeProto) listC.get(iMin);
            if (typeProto2.getType().equals(((TypeProto) listC2.get(iMin)).getType())) {
                return typeProto2;
            }
        }
        return this.classPath.getUnknownClass();
    }

    public Iterable<ClassDef> getDirectInterfaces() {
        k kVarA = k.a(getInterfaces().values());
        k kVarA2 = k.a(u2.f((Iterable) kVarA.f18706a.a(kVarA), m.f16949a));
        if (this.interfacesFullyResolved) {
            return kVarA2;
        }
        throw new UnresolvedClassException("Interfaces for class %s not fully resolved: %s", getType(), new g(String.valueOf(',')).b(getUnresolvedInterfaces()));
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public FieldReference getFieldByOffset(int i10) {
        if (getInstanceFields().size() == 0) {
            return null;
        }
        return getInstanceFields().get(i10);
    }

    public SparseArray<FieldReference> getInstanceFields() {
        return this.classPath.isArt() ? this.artInstanceFieldsSupplier.get() : this.dalvikInstanceFieldsSupplier.get();
    }

    public LinkedHashMap<String, ClassDef> getInterfaces() {
        return (!this.classPath.isArt() || this.classPath.oatVersion < 72) ? this.preDefaultMethodInterfaceSupplier.get() : this.postDefaultMethodInterfaceSupplier.get();
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public Method getMethodByVtableIndex(int i10) {
        List<Method> vtable = getVtable();
        if (i10 < 0 || i10 >= vtable.size()) {
            return null;
        }
        return vtable.get(i10);
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public String getSuperclass() {
        return getClassDef().getSuperclass();
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public String getType() {
        return this.type;
    }

    public Set<String> getUnresolvedInterfaces() {
        Set<String> set = this.unresolvedInterfaces;
        if (set != null) {
            return set;
        }
        int i10 = v.f18759c;
        return w0.f18781j;
    }

    public List<Method> getVtable() {
        int i10;
        return (!this.classPath.isArt() || (i10 = this.classPath.oatVersion) < 72) ? this.preDefaultMethodVtableSupplier.get() : i10 < 87 ? this.buggyPostDefaultMethodVtableSupplier.get() : this.postDefaultMethodVtableSupplier.get();
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public boolean implementsInterface(String str) {
        if (getInterfaces().containsKey(str)) {
            return true;
        }
        if (this.interfacesFullyResolved) {
            return false;
        }
        throw new UnresolvedClassException("Interfaces for class %s not fully resolved", getType());
    }

    @Override // org.jf.dexlib2.analysis.TypeProto
    public boolean isInterface() {
        return (getClassDef().getAccessFlags() & AccessFlags.INTERFACE.getValue()) != 0;
    }

    public String toString() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findMethodIndexInVtable(List<Method> list, MethodReference methodReference) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Method method = list.get(i10);
            if (MethodUtil.methodSignaturesMatch(method, methodReference) && (!this.classPath.shouldCheckPackagePrivateAccess() || AnalyzedMethodUtil.canAccess(this, method, true, false, false))) {
                return i10;
            }
        }
        return -1;
    }
}
