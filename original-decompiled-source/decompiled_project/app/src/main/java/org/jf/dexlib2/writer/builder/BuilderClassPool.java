package org.jf.dexlib2.writer.builder;

import i0.u2;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lc.e;
import lc.l;
import nc.k;
import nc.n0;
import nc.r;
import nc.u0;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.builder.MutableMethodImplementation;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.debug.EndLocal;
import org.jf.dexlib2.iface.debug.LineNumber;
import org.jf.dexlib2.iface.debug.RestartLocal;
import org.jf.dexlib2.iface.debug.SetSourceFile;
import org.jf.dexlib2.iface.debug.StartLocal;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.util.EncodedValueUtils;
import org.jf.dexlib2.writer.ClassSection;
import org.jf.dexlib2.writer.DebugWriter;
import org.jf.dexlib2.writer.builder.BuilderEncodedValues;
import org.jf.util.AbstractForwardSequentialList;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class BuilderClassPool extends BaseBuilderPool implements ClassSection<BuilderStringReference, BuilderTypeReference, BuilderTypeList, BuilderClassDef, BuilderField, BuilderMethod, BuilderAnnotationSet, BuilderEncodedValues.BuilderArrayEncodedValue> {
    private final ConcurrentMap<String, BuilderClassDef> internedItems;
    private r<BuilderClassDef> sortedClasses;
    private static final l<Field> HAS_INITIALIZER = new l<Field>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassPool.2
        @Override // lc.l
        public boolean apply(Field field) {
            EncodedValue initialValue = field.getInitialValue();
            return (initialValue == null || EncodedValueUtils.isDefaultValue(initialValue)) ? false : true;
        }
    };
    private static final e<BuilderField, BuilderEncodedValues.BuilderEncodedValue> GET_INITIAL_VALUE = new e<BuilderField, BuilderEncodedValues.BuilderEncodedValue>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassPool.3
        @Override // lc.e
        public BuilderEncodedValues.BuilderEncodedValue apply(BuilderField builderField) {
            BuilderEncodedValues.BuilderEncodedValue initialValue = builderField.getInitialValue();
            return initialValue == null ? BuilderEncodedValues.defaultValueForType(builderField.getType()) : initialValue;
        }
    };
    private static final l<BuilderMethodParameter> HAS_PARAMETER_ANNOTATIONS = new l<BuilderMethodParameter>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassPool.4
        @Override // lc.l
        public boolean apply(BuilderMethodParameter builderMethodParameter) {
            return builderMethodParameter.getAnnotations().size() > 0;
        }
    };
    private static final e<BuilderMethodParameter, BuilderAnnotationSet> PARAMETER_ANNOTATIONS = new e<BuilderMethodParameter, BuilderAnnotationSet>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassPool.5
        @Override // lc.e
        public BuilderAnnotationSet apply(BuilderMethodParameter builderMethodParameter) {
            return builderMethodParameter.getAnnotations();
        }
    };

    public BuilderClassPool(DexBuilder dexBuilder) {
        super(dexBuilder);
        this.internedItems = new ConcurrentHashMap();
        this.sortedClasses = null;
    }

    private BuilderStringReference checkStringReference(StringReference stringReference) {
        if (stringReference == null) {
            return null;
        }
        try {
            return (BuilderStringReference) stringReference;
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
        }
    }

    private BuilderTypeReference checkTypeReference(TypeReference typeReference) {
        if (typeReference == null) {
            return null;
        }
        try {
            return (BuilderTypeReference) typeReference;
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
        }
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public int getItemCount() {
        return this.internedItems.size();
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public Collection<? extends Map.Entry<? extends BuilderClassDef, Integer>> getItems() {
        return new BuilderMapEntryCollection<BuilderClassDef>(this.internedItems.values()) { // from class: org.jf.dexlib2.writer.builder.BuilderClassPool.8
            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int getValue(BuilderClassDef builderClassDef) {
                return builderClassDef.classDefIndex;
            }

            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int setValue(BuilderClassDef builderClassDef, int i10) {
                int i11 = builderClassDef.classDefIndex;
                builderClassDef.classDefIndex = i10;
                return i11;
            }
        };
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends BuilderClassDef> getSortedClasses() {
        if (this.sortedClasses == null) {
            this.sortedClasses = n0.f18723a.b(this.internedItems.values());
        }
        return this.sortedClasses;
    }

    public BuilderClassDef internClass(BuilderClassDef builderClassDef) {
        if (this.internedItems.put(builderClassDef.getType(), builderClassDef) == null) {
            return builderClassDef;
        }
        throw new ExceptionWithContext("Class %s has already been interned", builderClassDef.getType());
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public void writeDebugItem(DebugWriter<BuilderStringReference, BuilderTypeReference> debugWriter, DebugItem debugItem) throws IOException {
        switch (debugItem.getDebugItemType()) {
            case 3:
                StartLocal startLocal = (StartLocal) debugItem;
                debugWriter.writeStartLocal(startLocal.getCodeAddress(), startLocal.getRegister(), checkStringReference(startLocal.getNameReference()), checkTypeReference(startLocal.getTypeReference()), checkStringReference(startLocal.getSignatureReference()));
                return;
            case 4:
            default:
                throw new ExceptionWithContext("Unexpected debug item type: %d", Integer.valueOf(debugItem.getDebugItemType()));
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
                debugWriter.writeSetSourceFile(setSourceFile.getCodeAddress(), checkStringReference(setSourceFile.getSourceFileReference()));
                return;
            case 10:
                LineNumber lineNumber = (LineNumber) debugItem;
                debugWriter.writeLineNumber(lineNumber.getCodeAddress(), lineNumber.getLineNumber());
                return;
        }
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getAccessFlags(BuilderClassDef builderClassDef) {
        return builderClassDef.accessFlags;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getAnnotationDirectoryOffset(BuilderClassDef builderClassDef) {
        return builderClassDef.annotationDirectoryOffset;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getAnnotationSetRefListOffset(BuilderMethod builderMethod) {
        return builderMethod.annotationSetRefListOffset;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderAnnotationSet getClassAnnotations(BuilderClassDef builderClassDef) {
        if (builderClassDef.annotations.isEmpty()) {
            return null;
        }
        return builderClassDef.annotations;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Map.Entry<? extends BuilderClassDef, Integer> getClassEntryByType(BuilderTypeReference builderTypeReference) {
        final BuilderClassDef builderClassDef;
        if (builderTypeReference == null || (builderClassDef = this.internedItems.get(builderTypeReference.getType())) == null) {
            return null;
        }
        return new Map.Entry<BuilderClassDef, Integer>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassPool.1
            @Override // java.util.Map.Entry
            public BuilderClassDef getKey() {
                return builderClassDef;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Map.Entry
            public Integer getValue() {
                return Integer.valueOf(builderClassDef.classDefIndex);
            }

            @Override // java.util.Map.Entry
            public Integer setValue(Integer num) {
                builderClassDef.classDefIndex = num.intValue();
                return num;
            }
        };
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getCodeItemOffset(BuilderMethod builderMethod) {
        return builderMethod.codeItemOffset;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Iterable<? extends DebugItem> getDebugItems(BuilderMethod builderMethod) {
        MethodImplementation implementation = builderMethod.getImplementation();
        if (implementation == null) {
            return null;
        }
        return implementation.getDebugItems();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderTypeReference getExceptionType(ExceptionHandler exceptionHandler) {
        return checkTypeReference(exceptionHandler.getExceptionTypeReference());
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getFieldAccessFlags(BuilderField builderField) {
        return builderField.accessFlags;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderAnnotationSet getFieldAnnotations(BuilderField builderField) {
        if (builderField.annotations.isEmpty()) {
            return null;
        }
        return builderField.annotations;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Set<HiddenApiRestriction> getFieldHiddenApiRestrictions(BuilderField builderField) {
        return builderField.getHiddenApiRestrictions();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Iterable<? extends Instruction> getInstructions(BuilderMethod builderMethod) {
        MethodImplementation implementation = builderMethod.getImplementation();
        if (implementation == null) {
            return null;
        }
        return implementation.getInstructions();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderTypeList getInterfaces(BuilderClassDef builderClassDef) {
        return builderClassDef.interfaces;
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public int getItemIndex(BuilderClassDef builderClassDef) {
        return builderClassDef.classDefIndex;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getMethodAccessFlags(BuilderMethod builderMethod) {
        return builderMethod.accessFlags;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderAnnotationSet getMethodAnnotations(BuilderMethod builderMethod) {
        if (builderMethod.annotations.isEmpty()) {
            return null;
        }
        return builderMethod.annotations;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Set<HiddenApiRestriction> getMethodHiddenApiRestrictions(BuilderMethod builderMethod) {
        return builderMethod.getHiddenApiRestrictions();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public List<? extends BuilderAnnotationSet> getParameterAnnotations(BuilderMethod builderMethod) {
        final List<? extends BuilderMethodParameter> parameters = builderMethod.getParameters();
        if (u2.b(parameters, HAS_PARAMETER_ANNOTATIONS)) {
            return new AbstractForwardSequentialList<BuilderAnnotationSet>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassPool.6
                @Override // org.jf.util.AbstractForwardSequentialList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public Iterator<BuilderAnnotationSet> iterator() {
                    k kVarA = k.a(parameters);
                    return k.a(u2.j((Iterable) kVarA.f18706a.a(kVarA), BuilderClassPool.PARAMETER_ANNOTATIONS)).iterator();
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
    public Iterable<? extends BuilderStringReference> getParameterNames(BuilderMethod builderMethod) {
        return u2.j(builderMethod.getParameters(), new e<BuilderMethodParameter, BuilderStringReference>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassPool.7
            @Override // lc.e
            public BuilderStringReference apply(BuilderMethodParameter builderMethodParameter) {
                return builderMethodParameter.name;
            }
        });
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public int getRegisterCount(BuilderMethod builderMethod) {
        MethodImplementation implementation = builderMethod.getImplementation();
        if (implementation == null) {
            return 0;
        }
        return implementation.getRegisterCount();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends BuilderMethod> getSortedDirectMethods(BuilderClassDef builderClassDef) {
        return builderClassDef.getDirectMethods();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends BuilderField> getSortedFields(BuilderClassDef builderClassDef) {
        return builderClassDef.getFields();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends BuilderField> getSortedInstanceFields(BuilderClassDef builderClassDef) {
        return builderClassDef.getInstanceFields();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends BuilderMethod> getSortedMethods(BuilderClassDef builderClassDef) {
        return builderClassDef.getMethods();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends BuilderField> getSortedStaticFields(BuilderClassDef builderClassDef) {
        return builderClassDef.getStaticFields();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public Collection<? extends BuilderMethod> getSortedVirtualMethods(BuilderClassDef builderClassDef) {
        return builderClassDef.getVirtualMethods();
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderStringReference getSourceFile(BuilderClassDef builderClassDef) {
        return builderClassDef.sourceFile;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderEncodedValues.BuilderArrayEncodedValue getStaticInitializers(BuilderClassDef builderClassDef) {
        return builderClassDef.staticInitializers;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderTypeReference getSuperclass(BuilderClassDef builderClassDef) {
        return builderClassDef.superclass;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public List<? extends TryBlock<? extends ExceptionHandler>> getTryBlocks(BuilderMethod builderMethod) {
        MethodImplementation implementation = builderMethod.getImplementation();
        if (implementation != null) {
            return implementation.getTryBlocks();
        }
        r.a aVar = r.f18735b;
        return u0.f18756e;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public BuilderTypeReference getType(BuilderClassDef builderClassDef) {
        return builderClassDef.type;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public MutableMethodImplementation makeMutableMethodImplementation(BuilderMethod builderMethod) {
        MethodImplementation implementation = builderMethod.getImplementation();
        return implementation instanceof MutableMethodImplementation ? (MutableMethodImplementation) implementation : new MutableMethodImplementation(implementation);
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public void setAnnotationDirectoryOffset(BuilderClassDef builderClassDef, int i10) {
        builderClassDef.annotationDirectoryOffset = i10;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public void setAnnotationSetRefListOffset(BuilderMethod builderMethod, int i10) {
        builderMethod.annotationSetRefListOffset = i10;
    }

    @Override // org.jf.dexlib2.writer.ClassSection
    public void setCodeItemOffset(BuilderMethod builderMethod, int i10) {
        builderMethod.codeItemOffset = i10;
    }
}
