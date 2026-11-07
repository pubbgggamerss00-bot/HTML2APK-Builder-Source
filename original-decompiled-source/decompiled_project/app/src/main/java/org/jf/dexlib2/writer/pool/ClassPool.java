package org.jf.dexlib2.writer.pool;

import i0.u2;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.e;
import lc.l;
import nc.k;
import nc.n0;
import nc.r;
import nc.u0;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.builder.MutableMethodImplementation;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.MethodParameter;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.debug.EndLocal;
import org.jf.dexlib2.iface.debug.LineNumber;
import org.jf.dexlib2.iface.debug.RestartLocal;
import org.jf.dexlib2.iface.debug.SetSourceFile;
import org.jf.dexlib2.iface.debug.StartLocal;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.writer.ClassSection;
import org.jf.dexlib2.writer.DebugWriter;
import org.jf.dexlib2.writer.pool.TypeListPool;
import org.jf.dexlib2.writer.util.StaticInitializerUtil;
import org.jf.util.AbstractForwardSequentialList;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class ClassPool extends BasePool<String, PoolClassDef> implements ClassSection<CharSequence, CharSequence, TypeListPool.Key<? extends Collection<? extends CharSequence>>, PoolClassDef, Field, PoolMethod, Set<? extends Annotation>, ArrayEncodedValue> {
    private static final l<MethodParameter> HAS_PARAMETER_ANNOTATIONS = new l<MethodParameter>() { // from class: org.jf.dexlib2.writer.pool.ClassPool.2
        @Override // lc.l
        public boolean apply(MethodParameter methodParameter) {
            return methodParameter.getAnnotations().size() > 0;
        }
    };
    private static final e<MethodParameter, Set<? extends Annotation>> PARAMETER_ANNOTATIONS = new e<MethodParameter, Set<? extends Annotation>>() { // from class: org.jf.dexlib2.writer.pool.ClassPool.3
        @Override // lc.e
        public Set<? extends Annotation> apply(MethodParameter methodParameter) {
            return methodParameter.getAnnotations();
        }
    };
    private r<PoolClassDef> sortedClasses;

    public ClassPool(DexPool dexPool) {
        super(dexPool);
        this.sortedClasses = null;
    }

    private void internCode(Method method) {
        MethodImplementation implementation = method.getImplementation();
        if (implementation != null) {
            boolean z10 = false;
            for (Instruction instruction : implementation.getInstructions()) {
                if (instruction instanceof ReferenceInstruction) {
                    Reference reference = ((ReferenceInstruction) instruction).getReference();
                    int i10 = instruction.getOpcode().referenceType;
                    if (i10 == 0) {
                        ((StringPool) this.dexPool.stringSection).intern((StringReference) reference);
                    } else if (i10 == 1) {
                        ((TypePool) this.dexPool.typeSection).intern(((TypeReference) reference).getType());
                    } else if (i10 == 2) {
                        ((FieldPool) this.dexPool.fieldSection).intern((FieldReference) reference);
                    } else if (i10 == 3) {
                        ((MethodPool) this.dexPool.methodSection).intern((MethodReference) reference);
                    } else {
                        if (i10 != 5) {
                            throw new ExceptionWithContext("Unrecognized reference type: %d", Integer.valueOf(instruction.getOpcode().referenceType));
                        }
                        ((CallSitePool) this.dexPool.callSiteSection).intern((CallSiteReference) reference);
                    }
                }
                z10 = true;
            }
            List<? extends TryBlock<? extends ExceptionHandler>> tryBlocks = implementation.getTryBlocks();
            if (!z10 && tryBlocks.size() > 0) {
                throw new ExceptionWithContext("Method %s has no instructions, but has try blocks.", method);
            }
            Iterator<? extends TryBlock<? extends ExceptionHandler>> it = implementation.getTryBlocks().iterator();
            while (it.hasNext()) {
                Iterator it2 = it.next().getExceptionHandlers().iterator();
                while (it2.hasNext()) {
                    ((TypePool) this.dexPool.typeSection).internNullable(((ExceptionHandler) it2.next()).getExceptionType());
                }
            }
        }
    }

    private void internDebug(Method method) {
        Iterator<? extends MethodParameter> it = method.getParameters().iterator();
        while (it.hasNext()) {
            String name = it.next().getName();
            if (name != null) {
                ((StringPool) this.dexPool.stringSection).intern(name);
            }
        }
        MethodImplementation implementation = method.getImplementation();
        if (implementation != null) {
            for (DebugItem debugItem : implementation.getDebugItems()) {
                int debugItemType = debugItem.getDebugItemType();
                if (debugItemType == 3) {
                    StartLocal startLocal = (StartLocal) debugItem;
                    ((StringPool) this.dexPool.stringSection).internNullable(startLocal.getName());
                    ((TypePool) this.dexPool.typeSection).internNullable(startLocal.getType());
                    ((StringPool) this.dexPool.stringSection).internNullable(startLocal.getSignature());
                } else if (debugItemType == 9) {
                    ((StringPool) this.dexPool.stringSection).internNullable(((SetSourceFile) debugItem).getSourceFile());
                }
            }
        }
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Map.Entry<? extends PoolClassDef, Integer> getClassEntryByType(CharSequence charSequence) {
        final PoolClassDef poolClassDef;
        if (charSequence == null || (poolClassDef = (PoolClassDef) this.internedItems.get(charSequence.toString())) == null) {
            return null;
        }
        return new Map.Entry<PoolClassDef, Integer>() { // from class: org.jf.dexlib2.writer.pool.ClassPool.1
            @Override // java.util.Map.Entry
            public PoolClassDef getKey() {
                return poolClassDef;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Map.Entry
            public Integer getValue() {
                return Integer.valueOf(poolClassDef.classDefIndex);
            }

            @Override // java.util.Map.Entry
            public Integer setValue(Integer num) {
                poolClassDef.classDefIndex = num.intValue();
                return num;
            }
        };
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public CharSequence getExceptionType(ExceptionHandler exceptionHandler) {
        return exceptionHandler.getExceptionType();
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public Collection<? extends Map.Entry<PoolClassDef, Integer>> getItems() {
        return new AbstractCollection<Map.Entry<PoolClassDef, Integer>>() { // from class: org.jf.dexlib2.writer.pool.ClassPool.6
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<PoolClassDef, Integer>> iterator() {
                return new Iterator<Map.Entry<PoolClassDef, Integer>>() { // from class: org.jf.dexlib2.writer.pool.ClassPool.6.1
                    Iterator<PoolClassDef> iter;

                    {
                        this.iter = ClassPool.this.internedItems.values().iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.iter.hasNext();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    @Override // java.util.Iterator
                    public Map.Entry<PoolClassDef, Integer> next() {
                        return new Map.Entry<PoolClassDef, Integer>(this.iter.next()) { // from class: org.jf.dexlib2.writer.pool.ClassPool.1MapEntry
                            private final PoolClassDef classDef;

                            {
                                this.classDef = poolClassDef;
                            }

                            @Override // java.util.Map.Entry
                            public PoolClassDef getKey() {
                                return this.classDef;
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // java.util.Map.Entry
                            public Integer getValue() {
                                return Integer.valueOf(this.classDef.classDefIndex);
                            }

                            @Override // java.util.Map.Entry
                            public Integer setValue(Integer num) {
                                PoolClassDef poolClassDef = this.classDef;
                                int i10 = poolClassDef.classDefIndex;
                                poolClassDef.classDefIndex = num.intValue();
                                return Integer.valueOf(i10);
                            }
                        };
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return ClassPool.this.internedItems.size();
            }
        };
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends PoolClassDef> getSortedClasses() {
        if (this.sortedClasses == null) {
            this.sortedClasses = n0.f18723a.b(this.internedItems.values());
        }
        return this.sortedClasses;
    }

    public void intern(ClassDef classDef) {
        PoolClassDef poolClassDef = new PoolClassDef(classDef);
        if (((PoolClassDef) this.internedItems.put(poolClassDef.getType(), poolClassDef)) != null) {
            throw new ExceptionWithContext("Class %s has already been interned", poolClassDef.getType());
        }
        ((TypePool) this.dexPool.typeSection).intern(poolClassDef.getType());
        ((TypePool) this.dexPool.typeSection).internNullable(poolClassDef.getSuperclass());
        ((TypeListPool) this.dexPool.typeListSection).intern(poolClassDef.getInterfaces());
        ((StringPool) this.dexPool.stringSection).internNullable(poolClassDef.getSourceFile());
        HashSet hashSet = new HashSet();
        for (Field field : poolClassDef.getFields()) {
            String shortFieldDescriptor = DexFormatter.INSTANCE.getShortFieldDescriptor(field);
            if (!hashSet.add(shortFieldDescriptor)) {
                throw new ExceptionWithContext("Multiple definitions for field %s->%s", poolClassDef.getType(), shortFieldDescriptor);
            }
            ((FieldPool) this.dexPool.fieldSection).intern(field);
            EncodedValue initialValue = field.getInitialValue();
            if (initialValue != null) {
                this.dexPool.internEncodedValue(initialValue);
            }
            ((AnnotationSetPool) this.dexPool.annotationSetSection).intern(field.getAnnotations());
            ArrayEncodedValue staticInitializers = getStaticInitializers(poolClassDef);
            if (staticInitializers != null) {
                ((EncodedArrayPool) this.dexPool.encodedArraySection).intern(staticInitializers);
            }
        }
        HashSet hashSet2 = new HashSet();
        for (PoolMethod poolMethod : poolClassDef.getMethods()) {
            String shortMethodDescriptor = DexFormatter.INSTANCE.getShortMethodDescriptor(poolMethod);
            if (!hashSet2.add(shortMethodDescriptor)) {
                throw new ExceptionWithContext("Multiple definitions for method %s->%s", poolClassDef.getType(), shortMethodDescriptor);
            }
            ((MethodPool) this.dexPool.methodSection).intern(poolMethod);
            internCode(poolMethod);
            internDebug(poolMethod);
            ((AnnotationSetPool) this.dexPool.annotationSetSection).intern(poolMethod.getAnnotations());
            Iterator<? extends MethodParameter> it = poolMethod.getParameters().iterator();
            while (it.hasNext()) {
                ((AnnotationSetPool) this.dexPool.annotationSetSection).intern(it.next().getAnnotations());
            }
        }
        ((AnnotationSetPool) this.dexPool.annotationSetSection).intern(poolClassDef.getAnnotations());
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public void writeDebugItem(DebugWriter<CharSequence, CharSequence> debugWriter, DebugItem debugItem) throws IOException {
        switch (debugItem.getDebugItemType()) {
            case 3:
                StartLocal startLocal = (StartLocal) debugItem;
                debugWriter.writeStartLocal(startLocal.getCodeAddress(), startLocal.getRegister(), startLocal.getName(), startLocal.getType(), startLocal.getSignature());
                return;
            case 5:
                EndLocal endLocal = (EndLocal) debugItem;
                debugWriter.writeEndLocal(endLocal.getCodeAddress(), endLocal.getRegister());
                return;
            case 6:
                RestartLocal restartLocal = (RestartLocal) debugItem;
                debugWriter.writeRestartLocal(restartLocal.getCodeAddress(), restartLocal.getRegister());
                return;
            case 7:
                debugWriter.writePrologueEnd(debugItem.getCodeAddress());
                return;
            case 8:
                debugWriter.writeEpilogueBegin(debugItem.getCodeAddress());
                return;
            case 9:
                SetSourceFile setSourceFile = (SetSourceFile) debugItem;
                debugWriter.writeSetSourceFile(setSourceFile.getCodeAddress(), setSourceFile.getSourceFile());
                break;
            case 10:
                LineNumber lineNumber = (LineNumber) debugItem;
                debugWriter.writeLineNumber(lineNumber.getCodeAddress(), lineNumber.getLineNumber());
                return;
        }
        throw new ExceptionWithContext("Unexpected debug item type: %d", Integer.valueOf(debugItem.getDebugItemType()));
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getAccessFlags(PoolClassDef poolClassDef) {
        return poolClassDef.getAccessFlags();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getAnnotationDirectoryOffset(PoolClassDef poolClassDef) {
        return poolClassDef.annotationDirectoryOffset;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getAnnotationSetRefListOffset(PoolMethod poolMethod) {
        return poolMethod.annotationSetRefListOffset;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Set<? extends Annotation> getClassAnnotations(PoolClassDef poolClassDef) {
        Set<? extends Annotation> annotations = poolClassDef.getAnnotations();
        if (annotations.size() == 0) {
            return null;
        }
        return annotations;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getCodeItemOffset(PoolMethod poolMethod) {
        return poolMethod.codeItemOffset;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Iterable<? extends DebugItem> getDebugItems(PoolMethod poolMethod) {
        MethodImplementation implementation = poolMethod.getImplementation();
        if (implementation != null) {
            return implementation.getDebugItems();
        }
        return null;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getFieldAccessFlags(Field field) {
        return field.getAccessFlags();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Set<? extends Annotation> getFieldAnnotations(Field field) {
        Set<? extends Annotation> annotations = field.getAnnotations();
        if (annotations.size() == 0) {
            return null;
        }
        return annotations;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Set<HiddenApiRestriction> getFieldHiddenApiRestrictions(Field field) {
        return field.getHiddenApiRestrictions();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Iterable<? extends Instruction> getInstructions(PoolMethod poolMethod) {
        MethodImplementation implementation = poolMethod.getImplementation();
        if (implementation != null) {
            return implementation.getInstructions();
        }
        return null;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public TypeListPool.Key<List<String>> getInterfaces(PoolClassDef poolClassDef) {
        return poolClassDef.interfaces;
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public int getItemIndex(PoolClassDef poolClassDef) {
        return poolClassDef.classDefIndex;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getMethodAccessFlags(PoolMethod poolMethod) {
        return poolMethod.getAccessFlags();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Set<? extends Annotation> getMethodAnnotations(PoolMethod poolMethod) {
        Set<? extends Annotation> annotations = poolMethod.getAnnotations();
        if (annotations.size() == 0) {
            return null;
        }
        return annotations;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Set<HiddenApiRestriction> getMethodHiddenApiRestrictions(PoolMethod poolMethod) {
        return poolMethod.getHiddenApiRestrictions();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public List<? extends Set<? extends Annotation>> getParameterAnnotations(PoolMethod poolMethod) {
        final List<? extends MethodParameter> parameters = poolMethod.getParameters();
        if (u2.b(parameters, HAS_PARAMETER_ANNOTATIONS)) {
            return new AbstractForwardSequentialList<Set<? extends Annotation>>() { // from class: org.jf.dexlib2.writer.pool.ClassPool.4
                @Override // org.jf.util.AbstractForwardSequentialList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public Iterator<Set<? extends Annotation>> iterator() {
                    k kVarA = k.a(parameters);
                    return k.a(u2.j((Iterable) kVarA.f18706a.a(kVarA), ClassPool.PARAMETER_ANNOTATIONS)).iterator();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return parameters.size();
                }
            };
        }
        return null;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Iterable<CharSequence> getParameterNames(PoolMethod poolMethod) {
        return u2.j(poolMethod.getParameters(), new e<MethodParameter, CharSequence>() { // from class: org.jf.dexlib2.writer.pool.ClassPool.5
            @Override // lc.e
            public CharSequence apply(MethodParameter methodParameter) {
                return methodParameter.getName();
            }
        });
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getRegisterCount(PoolMethod poolMethod) {
        MethodImplementation implementation = poolMethod.getImplementation();
        if (implementation != null) {
            return implementation.getRegisterCount();
        }
        return 0;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<PoolMethod> getSortedDirectMethods(PoolClassDef poolClassDef) {
        return poolClassDef.getDirectMethods();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends Field> getSortedFields(PoolClassDef poolClassDef) {
        return poolClassDef.getFields();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends Field> getSortedInstanceFields(PoolClassDef poolClassDef) {
        return poolClassDef.getInstanceFields();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends PoolMethod> getSortedMethods(PoolClassDef poolClassDef) {
        return poolClassDef.getMethods();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends Field> getSortedStaticFields(PoolClassDef poolClassDef) {
        return poolClassDef.getStaticFields();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<PoolMethod> getSortedVirtualMethods(PoolClassDef poolClassDef) {
        return poolClassDef.getVirtualMethods();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public CharSequence getSourceFile(PoolClassDef poolClassDef) {
        return poolClassDef.getSourceFile();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public ArrayEncodedValue getStaticInitializers(PoolClassDef poolClassDef) {
        return StaticInitializerUtil.getStaticInitializers(poolClassDef.getStaticFields());
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public CharSequence getSuperclass(PoolClassDef poolClassDef) {
        return poolClassDef.getSuperclass();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public List<? extends TryBlock<? extends ExceptionHandler>> getTryBlocks(PoolMethod poolMethod) {
        MethodImplementation implementation = poolMethod.getImplementation();
        if (implementation != null) {
            return implementation.getTryBlocks();
        }
        r.a aVar = r.f18735b;
        return u0.f18756e;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public CharSequence getType(PoolClassDef poolClassDef) {
        return poolClassDef.getType();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public MutableMethodImplementation makeMutableMethodImplementation(PoolMethod poolMethod) {
        return new MutableMethodImplementation(poolMethod.getImplementation());
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public void setAnnotationDirectoryOffset(PoolClassDef poolClassDef, int i10) {
        poolClassDef.annotationDirectoryOffset = i10;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public void setAnnotationSetRefListOffset(PoolMethod poolMethod, int i10) {
        poolMethod.annotationSetRefListOffset = i10;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public void setCodeItemOffset(PoolMethod poolMethod, int i10) {
        poolMethod.codeItemOffset = i10;
    }
}
