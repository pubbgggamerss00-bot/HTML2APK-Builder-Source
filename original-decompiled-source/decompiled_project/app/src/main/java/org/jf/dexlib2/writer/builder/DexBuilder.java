package org.jf.dexlib2.writer.builder;

import i0.u2;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.e;
import nc.b0;
import nc.g0;
import nc.n0;
import nc.r;
import nc.u0;
import nc.v;
import nc.y;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.MethodParameter;
import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.dexlib2.iface.value.AnnotationEncodedValue;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.BooleanEncodedValue;
import org.jf.dexlib2.iface.value.ByteEncodedValue;
import org.jf.dexlib2.iface.value.CharEncodedValue;
import org.jf.dexlib2.iface.value.DoubleEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.EnumEncodedValue;
import org.jf.dexlib2.iface.value.FieldEncodedValue;
import org.jf.dexlib2.iface.value.FloatEncodedValue;
import org.jf.dexlib2.iface.value.IntEncodedValue;
import org.jf.dexlib2.iface.value.LongEncodedValue;
import org.jf.dexlib2.iface.value.MethodEncodedValue;
import org.jf.dexlib2.iface.value.MethodHandleEncodedValue;
import org.jf.dexlib2.iface.value.MethodTypeEncodedValue;
import org.jf.dexlib2.iface.value.ShortEncodedValue;
import org.jf.dexlib2.iface.value.StringEncodedValue;
import org.jf.dexlib2.iface.value.TypeEncodedValue;
import org.jf.dexlib2.util.FieldUtil;
import org.jf.dexlib2.writer.DexWriter;
import org.jf.dexlib2.writer.builder.BuilderEncodedValues;
import org.jf.dexlib2.writer.util.StaticInitializerUtil;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class DexBuilder extends DexWriter<BuilderStringReference, BuilderStringReference, BuilderTypeReference, BuilderTypeReference, BuilderMethodProtoReference, BuilderFieldReference, BuilderMethodReference, BuilderClassDef, BuilderCallSiteReference, BuilderMethodHandleReference, BuilderAnnotation, BuilderAnnotationSet, BuilderTypeList, BuilderField, BuilderMethod, BuilderEncodedValues.BuilderArrayEncodedValue, BuilderEncodedValues.BuilderEncodedValue, BuilderAnnotationElement, BuilderStringPool, BuilderTypePool, BuilderProtoPool, BuilderFieldPool, BuilderMethodPool, BuilderClassPool, BuilderCallSitePool, BuilderMethodHandlePool, BuilderTypeListPool, BuilderAnnotationPool, BuilderAnnotationSetPool, BuilderEncodedArrayPool> {

    public class DexBuilderSectionProvider extends DexWriter<BuilderStringReference, BuilderStringReference, BuilderTypeReference, BuilderTypeReference, BuilderMethodProtoReference, BuilderFieldReference, BuilderMethodReference, BuilderClassDef, BuilderCallSiteReference, BuilderMethodHandleReference, BuilderAnnotation, BuilderAnnotationSet, BuilderTypeList, BuilderField, BuilderMethod, BuilderEncodedValues.BuilderArrayEncodedValue, BuilderEncodedValues.BuilderEncodedValue, BuilderAnnotationElement, BuilderStringPool, BuilderTypePool, BuilderProtoPool, BuilderFieldPool, BuilderMethodPool, BuilderClassPool, BuilderCallSitePool, BuilderMethodHandlePool, BuilderTypeListPool, BuilderAnnotationPool, BuilderAnnotationSetPool, BuilderEncodedArrayPool>.SectionProvider {
        public DexBuilderSectionProvider() {
            super();
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderAnnotationPool getAnnotationSection() {
            return new BuilderAnnotationPool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderAnnotationSetPool getAnnotationSetSection() {
            return new BuilderAnnotationSetPool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderCallSitePool getCallSiteSection() {
            return new BuilderCallSitePool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderClassPool getClassSection() {
            return new BuilderClassPool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderEncodedArrayPool getEncodedArraySection() {
            return new BuilderEncodedArrayPool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderFieldPool getFieldSection() {
            return new BuilderFieldPool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderMethodHandlePool getMethodHandleSection() {
            return new BuilderMethodHandlePool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderMethodPool getMethodSection() {
            return new BuilderMethodPool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderProtoPool getProtoSection() {
            return new BuilderProtoPool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderStringPool getStringSection() {
            return new BuilderStringPool();
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderTypeListPool getTypeListSection() {
            return new BuilderTypeListPool(DexBuilder.this);
        }

        @Override // org.jf.dexlib2.writer.DexWriter.SectionProvider
        public BuilderTypePool getTypeSection() {
            return new BuilderTypePool(DexBuilder.this);
        }
    }

    public DexBuilder(Opcodes opcodes) {
        super(opcodes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BuilderAnnotationElement internAnnotationElement(AnnotationElement annotationElement) {
        return new BuilderAnnotationElement(((BuilderStringPool) this.stringSection).internString(annotationElement.getName()), internEncodedValue(annotationElement.getValue()));
    }

    private BuilderEncodedValues.BuilderAnnotationEncodedValue internAnnotationEncodedValue(AnnotationEncodedValue annotationEncodedValue) {
        return new BuilderEncodedValues.BuilderAnnotationEncodedValue(((BuilderTypePool) this.typeSection).internType(annotationEncodedValue.getType()), internAnnotationElements(annotationEncodedValue.getElements()));
    }

    private BuilderEncodedValues.BuilderArrayEncodedValue internArrayEncodedValue(ArrayEncodedValue arrayEncodedValue) {
        return new BuilderEncodedValues.BuilderArrayEncodedValue(r.m(new g0(arrayEncodedValue.getValue().iterator(), new e<EncodedValue, BuilderEncodedValues.BuilderEncodedValue>() { // from class: org.jf.dexlib2.writer.builder.DexBuilder.3
            @Override // lc.e
            public BuilderEncodedValues.BuilderEncodedValue apply(EncodedValue encodedValue) {
                return DexBuilder.this.internEncodedValue(encodedValue);
            }
        })));
    }

    private BuilderEncodedValues.BuilderEnumEncodedValue internEnumEncodedValue(EnumEncodedValue enumEncodedValue) {
        return new BuilderEncodedValues.BuilderEnumEncodedValue(((BuilderFieldPool) this.fieldSection).internField(enumEncodedValue.getValue()));
    }

    private BuilderEncodedValues.BuilderFieldEncodedValue internFieldEncodedValue(FieldEncodedValue fieldEncodedValue) {
        return new BuilderEncodedValues.BuilderFieldEncodedValue(((BuilderFieldPool) this.fieldSection).internField(fieldEncodedValue.getValue()));
    }

    private BuilderEncodedValues.BuilderMethodEncodedValue internMethodEncodedValue(MethodEncodedValue methodEncodedValue) {
        return new BuilderEncodedValues.BuilderMethodEncodedValue(((BuilderMethodPool) this.methodSection).internMethod(methodEncodedValue.getValue()));
    }

    private BuilderEncodedValues.BuilderMethodHandleEncodedValue internMethodHandleEncodedValue(MethodHandleEncodedValue methodHandleEncodedValue) {
        return new BuilderEncodedValues.BuilderMethodHandleEncodedValue(((BuilderMethodHandlePool) this.methodHandleSection).internMethodHandle(methodHandleEncodedValue.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BuilderMethodParameter internMethodParameter(MethodParameter methodParameter) {
        return new BuilderMethodParameter(((BuilderTypePool) this.typeSection).internType(methodParameter.getType()), ((BuilderStringPool) this.stringSection).internNullableString(methodParameter.getName()), ((BuilderAnnotationSetPool) this.annotationSetSection).internAnnotationSet(methodParameter.getAnnotations()));
    }

    private List<BuilderMethodParameter> internMethodParameters(List<? extends MethodParameter> list) {
        if (list != null) {
            return r.m(new g0(list.iterator(), new e<MethodParameter, BuilderMethodParameter>() { // from class: org.jf.dexlib2.writer.builder.DexBuilder.1
                @Override // lc.e
                public BuilderMethodParameter apply(MethodParameter methodParameter) {
                    return DexBuilder.this.internMethodParameter(methodParameter);
                }
            }));
        }
        r.a aVar = r.f18735b;
        return u0.f18756e;
    }

    private BuilderEncodedValues.BuilderMethodTypeEncodedValue internMethodTypeEncodedValue(MethodTypeEncodedValue methodTypeEncodedValue) {
        return new BuilderEncodedValues.BuilderMethodTypeEncodedValue(((BuilderProtoPool) this.protoSection).internMethodProto(methodTypeEncodedValue.getValue()));
    }

    private BuilderEncodedValues.BuilderStringEncodedValue internStringEncodedValue(StringEncodedValue stringEncodedValue) {
        return new BuilderEncodedValues.BuilderStringEncodedValue(((BuilderStringPool) this.stringSection).internString(stringEncodedValue.getValue()));
    }

    private BuilderEncodedValues.BuilderTypeEncodedValue internTypeEncodedValue(TypeEncodedValue typeEncodedValue) {
        return new BuilderEncodedValues.BuilderTypeEncodedValue(((BuilderTypePool) this.typeSection).internType(typeEncodedValue.getValue()));
    }

    @Override // org.jf.dexlib2.writer.DexWriter
    public DexWriter<BuilderStringReference, BuilderStringReference, BuilderTypeReference, BuilderTypeReference, BuilderMethodProtoReference, BuilderFieldReference, BuilderMethodReference, BuilderClassDef, BuilderCallSiteReference, BuilderMethodHandleReference, BuilderAnnotation, BuilderAnnotationSet, BuilderTypeList, BuilderField, BuilderMethod, BuilderEncodedValues.BuilderArrayEncodedValue, BuilderEncodedValues.BuilderEncodedValue, BuilderAnnotationElement, BuilderStringPool, BuilderTypePool, BuilderProtoPool, BuilderFieldPool, BuilderMethodPool, BuilderClassPool, BuilderCallSitePool, BuilderMethodHandlePool, BuilderTypeListPool, BuilderAnnotationPool, BuilderAnnotationSetPool, BuilderEncodedArrayPool>.SectionProvider getSectionProvider() {
        return new DexBuilderSectionProvider();
    }

    public Set<? extends BuilderAnnotationElement> internAnnotationElements(Set<? extends AnnotationElement> set) {
        return v.k(new g0(set.iterator(), new e<AnnotationElement, BuilderAnnotationElement>() { // from class: org.jf.dexlib2.writer.builder.DexBuilder.2
            @Override // lc.e
            public BuilderAnnotationElement apply(AnnotationElement annotationElement) {
                return DexBuilder.this.internAnnotationElement(annotationElement);
            }
        }));
    }

    public BuilderCallSiteReference internCallSite(CallSiteReference callSiteReference) {
        return ((BuilderCallSitePool) this.callSiteSection).internCallSite(callSiteReference);
    }

    public BuilderClassDef internClassDef(String str, int i10, String str2, List<String> list, String str3, Set<? extends Annotation> set, Iterable<? extends BuilderField> iterable, Iterable<? extends BuilderMethod> iterable2) {
        y yVar;
        y yVar2;
        BuilderEncodedValues.BuilderArrayEncodedValue builderArrayEncodedValueInternArrayEncodedValue;
        List<String> list2 = list;
        if (list2 == null) {
            r.a aVar = r.f18735b;
            list2 = u0.f18756e;
        } else {
            HashSet hashSet = new HashSet(list2);
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (hashSet.contains(next)) {
                    hashSet.remove(next);
                } else {
                    it.remove();
                }
            }
        }
        if (iterable != null) {
            b0 b0VarF = u2.f(iterable, FieldUtil.FIELD_IS_STATIC);
            int i11 = y.f18789f;
            n0 n0Var = n0.f18723a;
            y yVarQ = y.q(n0Var, b0VarF);
            y yVarQ2 = y.q(n0Var, u2.f(iterable, FieldUtil.FIELD_IS_INSTANCE));
            ArrayEncodedValue staticInitializers = StaticInitializerUtil.getStaticInitializers(yVarQ);
            yVar2 = yVarQ2;
            builderArrayEncodedValueInternArrayEncodedValue = staticInitializers != null ? ((BuilderEncodedArrayPool) this.encodedArraySection).internArrayEncodedValue(staticInitializers) : null;
            yVar = yVarQ;
        } else {
            yVar = null;
            yVar2 = null;
            builderArrayEncodedValueInternArrayEncodedValue = null;
        }
        return ((BuilderClassPool) this.classSection).internClass(new BuilderClassDef(((BuilderTypePool) this.typeSection).internType(str), i10, ((BuilderTypePool) this.typeSection).internNullableType(str2), ((BuilderTypeListPool) this.typeListSection).internTypeList(list2), ((BuilderStringPool) this.stringSection).internNullableString(str3), ((BuilderAnnotationSetPool) this.annotationSetSection).internAnnotationSet(set), yVar, yVar2, iterable2, builderArrayEncodedValueInternArrayEncodedValue));
    }

    public BuilderEncodedValues.BuilderEncodedValue internEncodedValue(EncodedValue encodedValue) {
        int valueType = encodedValue.getValueType();
        if (valueType == 0) {
            return new BuilderEncodedValues.BuilderByteEncodedValue(((ByteEncodedValue) encodedValue).getValue());
        }
        if (valueType == 6) {
            return new BuilderEncodedValues.BuilderLongEncodedValue(((LongEncodedValue) encodedValue).getValue());
        }
        if (valueType == 2) {
            return new BuilderEncodedValues.BuilderShortEncodedValue(((ShortEncodedValue) encodedValue).getValue());
        }
        if (valueType == 3) {
            return new BuilderEncodedValues.BuilderCharEncodedValue(((CharEncodedValue) encodedValue).getValue());
        }
        if (valueType == 4) {
            return new BuilderEncodedValues.BuilderIntEncodedValue(((IntEncodedValue) encodedValue).getValue());
        }
        if (valueType == 16) {
            return new BuilderEncodedValues.BuilderFloatEncodedValue(((FloatEncodedValue) encodedValue).getValue());
        }
        if (valueType == 17) {
            return new BuilderEncodedValues.BuilderDoubleEncodedValue(((DoubleEncodedValue) encodedValue).getValue());
        }
        switch (valueType) {
            case 21:
                return internMethodTypeEncodedValue((MethodTypeEncodedValue) encodedValue);
            case 22:
                return internMethodHandleEncodedValue((MethodHandleEncodedValue) encodedValue);
            case 23:
                return internStringEncodedValue((StringEncodedValue) encodedValue);
            case 24:
                return internTypeEncodedValue((TypeEncodedValue) encodedValue);
            case 25:
                return internFieldEncodedValue((FieldEncodedValue) encodedValue);
            case 26:
                return internMethodEncodedValue((MethodEncodedValue) encodedValue);
            case 27:
                return internEnumEncodedValue((EnumEncodedValue) encodedValue);
            case 28:
                return internArrayEncodedValue((ArrayEncodedValue) encodedValue);
            case 29:
                return internAnnotationEncodedValue((AnnotationEncodedValue) encodedValue);
            case 30:
                return BuilderEncodedValues.BuilderNullEncodedValue.INSTANCE;
            case 31:
                return ((BooleanEncodedValue) encodedValue).getValue() ? BuilderEncodedValues.BuilderBooleanEncodedValue.TRUE_VALUE : BuilderEncodedValues.BuilderBooleanEncodedValue.FALSE_VALUE;
            default:
                throw new ExceptionWithContext("Unexpected encoded value type: %d", Integer.valueOf(encodedValue.getValueType()));
        }
    }

    public BuilderField internField(String str, String str2, String str3, int i10, EncodedValue encodedValue, Set<? extends Annotation> set, Set<HiddenApiRestriction> set2) {
        return new BuilderField(((BuilderFieldPool) this.fieldSection).internField(str, str2, str3), i10, internNullableEncodedValue(encodedValue), ((BuilderAnnotationSetPool) this.annotationSetSection).internAnnotationSet(set), set2);
    }

    public BuilderFieldReference internFieldReference(FieldReference fieldReference) {
        return ((BuilderFieldPool) this.fieldSection).internField(fieldReference);
    }

    public BuilderMethod internMethod(String str, String str2, List<? extends MethodParameter> list, String str3, int i10, Set<? extends Annotation> set, Set<HiddenApiRestriction> set2, MethodImplementation methodImplementation) {
        if (list == null) {
            r.a aVar = r.f18735b;
            list = u0.f18756e;
        }
        return new BuilderMethod(((BuilderMethodPool) this.methodSection).internMethod(str, str2, list, str3), internMethodParameters(list), i10, ((BuilderAnnotationSetPool) this.annotationSetSection).internAnnotationSet(set), set2, methodImplementation);
    }

    public BuilderMethodHandleReference internMethodHandle(MethodHandleReference methodHandleReference) {
        return ((BuilderMethodHandlePool) this.methodHandleSection).internMethodHandle(methodHandleReference);
    }

    public BuilderMethodProtoReference internMethodProtoReference(MethodProtoReference methodProtoReference) {
        return ((BuilderProtoPool) this.protoSection).internMethodProto(methodProtoReference);
    }

    public BuilderMethodReference internMethodReference(MethodReference methodReference) {
        return ((BuilderMethodPool) this.methodSection).internMethod(methodReference);
    }

    public BuilderEncodedValues.BuilderEncodedValue internNullableEncodedValue(EncodedValue encodedValue) {
        if (encodedValue == null) {
            return null;
        }
        return internEncodedValue(encodedValue);
    }

    public BuilderStringReference internNullableStringReference(String str) {
        if (str != null) {
            return internStringReference(str);
        }
        return null;
    }

    public BuilderTypeReference internNullableTypeReference(String str) {
        if (str != null) {
            return internTypeReference(str);
        }
        return null;
    }

    public BuilderReference internReference(Reference reference) {
        if (reference instanceof StringReference) {
            return internStringReference(((StringReference) reference).getString());
        }
        if (reference instanceof TypeReference) {
            return internTypeReference(((TypeReference) reference).getType());
        }
        if (reference instanceof MethodReference) {
            return internMethodReference((MethodReference) reference);
        }
        if (reference instanceof FieldReference) {
            return internFieldReference((FieldReference) reference);
        }
        if (reference instanceof MethodProtoReference) {
            return internMethodProtoReference((MethodProtoReference) reference);
        }
        if (reference instanceof CallSiteReference) {
            return internCallSite((CallSiteReference) reference);
        }
        if (reference instanceof MethodHandleReference) {
            return internMethodHandle((MethodHandleReference) reference);
        }
        throw new IllegalArgumentException("Could not determine type of reference");
    }

    public BuilderStringReference internStringReference(String str) {
        return ((BuilderStringPool) this.stringSection).internString(str);
    }

    public BuilderTypeReference internTypeReference(String str) {
        return ((BuilderTypePool) this.typeSection).internType(str);
    }

    @Override // org.jf.dexlib2.writer.DexWriter
    public void writeEncodedValue(DexWriter<BuilderStringReference, BuilderStringReference, BuilderTypeReference, BuilderTypeReference, BuilderMethodProtoReference, BuilderFieldReference, BuilderMethodReference, BuilderClassDef, BuilderCallSiteReference, BuilderMethodHandleReference, BuilderAnnotation, BuilderAnnotationSet, BuilderTypeList, BuilderField, BuilderMethod, BuilderEncodedValues.BuilderArrayEncodedValue, BuilderEncodedValues.BuilderEncodedValue, BuilderAnnotationElement, BuilderStringPool, BuilderTypePool, BuilderProtoPool, BuilderFieldPool, BuilderMethodPool, BuilderClassPool, BuilderCallSitePool, BuilderMethodHandlePool, BuilderTypeListPool, BuilderAnnotationPool, BuilderAnnotationSetPool, BuilderEncodedArrayPool>.InternalEncodedValueWriter internalEncodedValueWriter, BuilderEncodedValues.BuilderEncodedValue builderEncodedValue) throws IOException {
        int valueType = builderEncodedValue.getValueType();
        if (valueType == 0) {
            internalEncodedValueWriter.writeByte(((ByteEncodedValue) builderEncodedValue).getValue());
            return;
        }
        if (valueType == 6) {
            internalEncodedValueWriter.writeLong(((LongEncodedValue) builderEncodedValue).getValue());
            return;
        }
        if (valueType == 2) {
            internalEncodedValueWriter.writeShort(((ShortEncodedValue) builderEncodedValue).getValue());
            return;
        }
        if (valueType == 3) {
            internalEncodedValueWriter.writeChar(((CharEncodedValue) builderEncodedValue).getValue());
            return;
        }
        if (valueType == 4) {
            internalEncodedValueWriter.writeInt(((IntEncodedValue) builderEncodedValue).getValue());
            return;
        }
        if (valueType == 16) {
            internalEncodedValueWriter.writeFloat(((FloatEncodedValue) builderEncodedValue).getValue());
            return;
        }
        if (valueType == 17) {
            internalEncodedValueWriter.writeDouble(((DoubleEncodedValue) builderEncodedValue).getValue());
            return;
        }
        switch (valueType) {
            case 21:
                internalEncodedValueWriter.writeMethodType(((BuilderEncodedValues.BuilderMethodTypeEncodedValue) builderEncodedValue).methodProtoReference);
                return;
            case 22:
                internalEncodedValueWriter.writeMethodHandle(((BuilderEncodedValues.BuilderMethodHandleEncodedValue) builderEncodedValue).methodHandleReference);
                return;
            case 23:
                internalEncodedValueWriter.writeString(((BuilderEncodedValues.BuilderStringEncodedValue) builderEncodedValue).stringReference);
                return;
            case 24:
                internalEncodedValueWriter.writeType(((BuilderEncodedValues.BuilderTypeEncodedValue) builderEncodedValue).typeReference);
                return;
            case 25:
                internalEncodedValueWriter.writeField(((BuilderEncodedValues.BuilderFieldEncodedValue) builderEncodedValue).fieldReference);
                return;
            case 26:
                internalEncodedValueWriter.writeMethod(((BuilderEncodedValues.BuilderMethodEncodedValue) builderEncodedValue).methodReference);
                return;
            case 27:
                internalEncodedValueWriter.writeEnum(((BuilderEncodedValues.BuilderEnumEncodedValue) builderEncodedValue).getValue());
                return;
            case 28:
                internalEncodedValueWriter.writeArray(((BuilderEncodedValues.BuilderArrayEncodedValue) builderEncodedValue).elements);
                return;
            case 29:
                BuilderEncodedValues.BuilderAnnotationEncodedValue builderAnnotationEncodedValue = (BuilderEncodedValues.BuilderAnnotationEncodedValue) builderEncodedValue;
                internalEncodedValueWriter.writeAnnotation(builderAnnotationEncodedValue.typeReference, builderAnnotationEncodedValue.elements);
                return;
            case 30:
                internalEncodedValueWriter.writeNull();
                return;
            case 31:
                internalEncodedValueWriter.writeBoolean(((BooleanEncodedValue) builderEncodedValue).getValue());
                return;
            default:
                throw new ExceptionWithContext("Unrecognized value type: %d", Integer.valueOf(builderEncodedValue.getValueType()));
        }
    }
}
