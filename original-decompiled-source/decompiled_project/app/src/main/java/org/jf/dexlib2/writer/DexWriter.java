package org.jf.dexlib2.writer;

import i0.u2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.CharSequence;
import java.lang.Comparable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.Adler32;
import nc.j0;
import nc.k0;
import nc.o0;
import nc.r;
import nc.u0;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.base.BaseAnnotation;
import org.jf.dexlib2.base.BaseAnnotationElement;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.builder.MutableMethodImplementation;
import org.jf.dexlib2.builder.instruction.BuilderInstruction31c;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import org.jf.dexlib2.dexbacked.raw.ItemType;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.debug.LineNumber;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.OneRegisterInstruction;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.iface.instruction.VariableRegisterInstruction;
import org.jf.dexlib2.iface.instruction.formats.ArrayPayload;
import org.jf.dexlib2.iface.instruction.formats.Instruction10t;
import org.jf.dexlib2.iface.instruction.formats.Instruction10x;
import org.jf.dexlib2.iface.instruction.formats.Instruction11n;
import org.jf.dexlib2.iface.instruction.formats.Instruction11x;
import org.jf.dexlib2.iface.instruction.formats.Instruction12x;
import org.jf.dexlib2.iface.instruction.formats.Instruction20bc;
import org.jf.dexlib2.iface.instruction.formats.Instruction20t;
import org.jf.dexlib2.iface.instruction.formats.Instruction21c;
import org.jf.dexlib2.iface.instruction.formats.Instruction21ih;
import org.jf.dexlib2.iface.instruction.formats.Instruction21lh;
import org.jf.dexlib2.iface.instruction.formats.Instruction21s;
import org.jf.dexlib2.iface.instruction.formats.Instruction21t;
import org.jf.dexlib2.iface.instruction.formats.Instruction22b;
import org.jf.dexlib2.iface.instruction.formats.Instruction22c;
import org.jf.dexlib2.iface.instruction.formats.Instruction22cs;
import org.jf.dexlib2.iface.instruction.formats.Instruction22s;
import org.jf.dexlib2.iface.instruction.formats.Instruction22t;
import org.jf.dexlib2.iface.instruction.formats.Instruction22x;
import org.jf.dexlib2.iface.instruction.formats.Instruction23x;
import org.jf.dexlib2.iface.instruction.formats.Instruction30t;
import org.jf.dexlib2.iface.instruction.formats.Instruction31c;
import org.jf.dexlib2.iface.instruction.formats.Instruction31i;
import org.jf.dexlib2.iface.instruction.formats.Instruction31t;
import org.jf.dexlib2.iface.instruction.formats.Instruction32x;
import org.jf.dexlib2.iface.instruction.formats.Instruction35c;
import org.jf.dexlib2.iface.instruction.formats.Instruction35mi;
import org.jf.dexlib2.iface.instruction.formats.Instruction35ms;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rc;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rmi;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rms;
import org.jf.dexlib2.iface.instruction.formats.Instruction45cc;
import org.jf.dexlib2.iface.instruction.formats.Instruction4rcc;
import org.jf.dexlib2.iface.instruction.formats.Instruction51l;
import org.jf.dexlib2.iface.instruction.formats.PackedSwitchPayload;
import org.jf.dexlib2.iface.instruction.formats.SparseSwitchPayload;
import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.dexlib2.util.InstructionUtil;
import org.jf.dexlib2.util.MethodUtil;
import org.jf.dexlib2.writer.AnnotationSection;
import org.jf.dexlib2.writer.AnnotationSetSection;
import org.jf.dexlib2.writer.CallSiteSection;
import org.jf.dexlib2.writer.ClassSection;
import org.jf.dexlib2.writer.EncodedArraySection;
import org.jf.dexlib2.writer.FieldSection;
import org.jf.dexlib2.writer.MethodHandleSection;
import org.jf.dexlib2.writer.MethodSection;
import org.jf.dexlib2.writer.ProtoSection;
import org.jf.dexlib2.writer.StringSection;
import org.jf.dexlib2.writer.TypeListSection;
import org.jf.dexlib2.writer.TypeSection;
import org.jf.dexlib2.writer.io.DeferredOutputStream;
import org.jf.dexlib2.writer.io.DeferredOutputStreamFactory;
import org.jf.dexlib2.writer.io.DexDataStore;
import org.jf.dexlib2.writer.io.MemoryDeferredOutputStream;
import org.jf.dexlib2.writer.util.TryListBuilder;
import org.jf.util.ExceptionWithContext;
import x0.a;

/* loaded from: classes3.dex */
public abstract class DexWriter<StringKey extends CharSequence, StringRef extends StringReference, TypeKey extends CharSequence, TypeRef extends TypeReference, ProtoRefKey extends MethodProtoReference, FieldRefKey extends FieldReference, MethodRefKey extends MethodReference, ClassKey extends Comparable<? super ClassKey>, CallSiteKey extends CallSiteReference, MethodHandleKey extends MethodHandleReference, AnnotationKey extends Annotation, AnnotationSetKey, TypeListKey, FieldKey, MethodKey, EncodedArrayKey, EncodedValue, AnnotationElement extends AnnotationElement, StringSectionType extends StringSection<StringKey, StringRef>, TypeSectionType extends TypeSection<StringKey, TypeKey, TypeRef>, ProtoSectionType extends ProtoSection<StringKey, TypeKey, ProtoRefKey, TypeListKey>, FieldSectionType extends FieldSection<StringKey, TypeKey, FieldRefKey, FieldKey>, MethodSectionType extends MethodSection<StringKey, TypeKey, ProtoRefKey, MethodRefKey, MethodKey>, ClassSectionType extends ClassSection<StringKey, TypeKey, TypeListKey, ClassKey, FieldKey, MethodKey, AnnotationSetKey, EncodedArrayKey>, CallSiteSectionType extends CallSiteSection<CallSiteKey, EncodedArrayKey>, MethodHandleSectionType extends MethodHandleSection<MethodHandleKey, FieldRefKey, MethodRefKey>, TypeListSectionType extends TypeListSection<TypeKey, TypeListKey>, AnnotationSectionType extends AnnotationSection<StringKey, TypeKey, AnnotationKey, AnnotationElement, EncodedValue>, AnnotationSetSectionType extends AnnotationSetSection<AnnotationKey, AnnotationSetKey>, EncodedArraySectionType extends EncodedArraySection<EncodedArrayKey, EncodedValue>> {
    public static final int MAX_POOL_SIZE = 65536;
    public static final int NO_INDEX = -1;
    public static final int NO_OFFSET = 0;
    private static Comparator<Map.Entry> toStringKeyComparator = new Comparator<Map.Entry>() { // from class: org.jf.dexlib2.writer.DexWriter.2
        @Override // java.util.Comparator
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return entry.getKey().toString().compareTo(entry2.getKey().toString());
        }
    };
    public final AnnotationSectionType annotationSection;
    public final AnnotationSetSectionType annotationSetSection;
    public final CallSiteSectionType callSiteSection;
    public final ClassSectionType classSection;
    public final EncodedArraySectionType encodedArraySection;
    public final FieldSectionType fieldSection;
    public final MethodHandleSectionType methodHandleSection;
    public final MethodSectionType methodSection;
    protected final Opcodes opcodes;
    private final IndexSection<?>[] overflowableSections;
    public final ProtoSectionType protoSection;
    public final StringSectionType stringSection;
    public final TypeListSectionType typeListSection;
    public final TypeSectionType typeSection;
    protected int stringIndexSectionOffset = 0;
    protected int typeSectionOffset = 0;
    protected int protoSectionOffset = 0;
    protected int fieldSectionOffset = 0;
    protected int methodSectionOffset = 0;
    protected int classIndexSectionOffset = 0;
    protected int callSiteSectionOffset = 0;
    protected int methodHandleSectionOffset = 0;
    protected int stringDataSectionOffset = 0;
    protected int classDataSectionOffset = 0;
    protected int typeListSectionOffset = 0;
    protected int encodedArraySectionOffset = 0;
    protected int annotationSectionOffset = 0;
    protected int annotationSetSectionOffset = 0;
    protected int annotationSetRefSectionOffset = 0;
    protected int annotationDirectorySectionOffset = 0;
    protected int debugSectionOffset = 0;
    protected int codeSectionOffset = 0;
    protected int hiddenApiRestrictionsOffset = 0;
    protected int mapSectionOffset = 0;
    protected boolean hasHiddenApiRestrictions = false;
    protected int numAnnotationSetRefItems = 0;
    protected int numAnnotationDirectoryItems = 0;
    protected int numDebugInfoItems = 0;
    protected int numCodeItemItems = 0;
    protected int numClassDataItems = 0;
    private Comparator<Map.Entry<? extends CallSiteKey, Integer>> callSiteComparator = (Comparator<Map.Entry<? extends CallSiteKey, Integer>>) new Comparator<Map.Entry<? extends CallSiteKey, Integer>>() { // from class: org.jf.dexlib2.writer.DexWriter.1
        @Override // java.util.Comparator
        public int compare(Map.Entry<? extends CallSiteKey, Integer> entry, Map.Entry<? extends CallSiteKey, Integer> entry2) {
            DexWriter dexWriter = DexWriter.this;
            int itemOffset = dexWriter.encodedArraySection.getItemOffset(dexWriter.callSiteSection.getEncodedCallSite(entry.getKey()));
            DexWriter dexWriter2 = DexWriter.this;
            return u2.c(itemOffset, dexWriter2.encodedArraySection.getItemOffset(dexWriter2.callSiteSection.getEncodedCallSite(entry2.getKey())));
        }
    };

    /* renamed from: org.jf.dexlib2.writer.DexWriter$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$org$jf$dexlib2$Format;

        static {
            int[] iArr = new int[Format.values().length];
            $SwitchMap$org$jf$dexlib2$Format = iArr;
            try {
                iArr[Format.Format10t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format10x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format11n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format11x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format12x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format20bc.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format20t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21c.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21ih.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21lh.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22b.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22c.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22cs.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22x.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format23x.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format30t.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31c.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31i.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31t.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format32x.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35c.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35mi.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35ms.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rc.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rmi.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rms.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format45cc.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format4rcc.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format51l.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.ArrayPayload.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.PackedSwitchPayload.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.SparseSwitchPayload.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public static class CodeItemOffset<MethodKey> {
        int codeOffset;
        MethodKey method;

        private CodeItemOffset(MethodKey methodkey, int i10) {
            this.codeOffset = i10;
            this.method = methodkey;
        }
    }

    public class InternalEncodedValueWriter extends EncodedValueWriter<StringKey, TypeKey, FieldRefKey, MethodRefKey, AnnotationElement, ProtoRefKey, MethodHandleKey, EncodedValue> {
        @Override // org.jf.dexlib2.writer.EncodedValueWriter
        public void writeEncodedValue(EncodedValue encodedvalue) throws IOException {
            DexWriter.this.writeEncodedValue(this, encodedvalue);
        }

        private InternalEncodedValueWriter(DexDataWriter dexDataWriter) {
            super(dexDataWriter, DexWriter.this.stringSection, DexWriter.this.typeSection, DexWriter.this.fieldSection, DexWriter.this.methodSection, DexWriter.this.protoSection, DexWriter.this.methodHandleSection, DexWriter.this.annotationSection);
        }
    }

    public static class RestrictionsWriter {
        private final DexDataStore dataStore;
        private final DexDataWriter offsetsWriter;
        private final DexDataWriter restrictionsWriter;
        private final int startOffset;
        private boolean writeRestrictionsForClass = false;
        private int pendingBlankEntries = 0;

        public RestrictionsWriter(DexDataStore dexDataStore, DexDataWriter dexDataWriter, int i10) throws IOException {
            this.startOffset = dexDataWriter.getPosition();
            this.dataStore = dexDataStore;
            this.restrictionsWriter = dexDataWriter;
            int i11 = i10 * 4;
            dexDataWriter.writeInt(0);
            this.offsetsWriter = DexWriter.outputAt(dexDataStore, dexDataWriter.getPosition());
            for (int i12 = 0; i12 < i11; i12++) {
                this.restrictionsWriter.write(0);
            }
            this.restrictionsWriter.flush();
        }

        private void addBlankEntry() throws IOException {
            if (this.writeRestrictionsForClass) {
                this.restrictionsWriter.writeUleb128(HiddenApiRestriction.WHITELIST.getValue());
            } else {
                this.pendingBlankEntries++;
            }
        }

        public void close() throws IOException {
            this.offsetsWriter.close();
            DexDataWriter dexDataWriterOutputAt = null;
            try {
                dexDataWriterOutputAt = DexWriter.outputAt(this.dataStore, this.startOffset);
                dexDataWriterOutputAt.writeInt(this.restrictionsWriter.getPosition() - this.startOffset);
                dexDataWriterOutputAt.close();
            } catch (Throwable th2) {
                if (dexDataWriterOutputAt != null) {
                    dexDataWriterOutputAt.close();
                }
                throw th2;
            }
        }

        public void finishClass() throws IOException {
            if (!this.writeRestrictionsForClass) {
                this.offsetsWriter.writeInt(0);
            }
            this.writeRestrictionsForClass = false;
            this.pendingBlankEntries = 0;
        }

        public void writeRestriction(Set<HiddenApiRestriction> set) throws IOException {
            if (set.isEmpty()) {
                addBlankEntry();
                return;
            }
            if (!this.writeRestrictionsForClass) {
                this.writeRestrictionsForClass = true;
                this.offsetsWriter.writeInt(this.restrictionsWriter.getPosition() - this.startOffset);
                for (int i10 = 0; i10 < this.pendingBlankEntries; i10++) {
                    this.restrictionsWriter.writeUleb128(HiddenApiRestriction.WHITELIST.getValue());
                }
                this.pendingBlankEntries = 0;
            }
            this.restrictionsWriter.writeUleb128(HiddenApiRestriction.combineFlags(set));
        }
    }

    public abstract class SectionProvider {
        public SectionProvider() {
        }

        public abstract AnnotationSectionType getAnnotationSection();

        public abstract AnnotationSetSectionType getAnnotationSetSection();

        public abstract CallSiteSectionType getCallSiteSection();

        public abstract ClassSectionType getClassSection();

        public abstract EncodedArraySectionType getEncodedArraySection();

        public abstract FieldSectionType getFieldSection();

        public abstract MethodHandleSectionType getMethodHandleSection();

        public abstract MethodSectionType getMethodSection();

        public abstract ProtoSectionType getProtoSection();

        public abstract StringSectionType getStringSection();

        public abstract TypeListSectionType getTypeListSection();

        public abstract TypeSectionType getTypeSection();
    }

    public DexWriter(Opcodes opcodes) {
        this.opcodes = opcodes;
        DexWriter<StringKey, StringRef, TypeKey, TypeRef, ProtoRefKey, FieldRefKey, MethodRefKey, ClassKey, CallSiteKey, MethodHandleKey, AnnotationKey, AnnotationSetKey, TypeListKey, FieldKey, MethodKey, EncodedArrayKey, EncodedValue, AnnotationElement, StringSectionType, TypeSectionType, ProtoSectionType, FieldSectionType, MethodSectionType, ClassSectionType, CallSiteSectionType, MethodHandleSectionType, TypeListSectionType, AnnotationSectionType, AnnotationSetSectionType, EncodedArraySectionType>.SectionProvider sectionProvider = getSectionProvider();
        this.stringSection = (StringSectionType) sectionProvider.getStringSection();
        TypeSectionType typesectiontype = (TypeSectionType) sectionProvider.getTypeSection();
        this.typeSection = typesectiontype;
        ProtoSectionType protosectiontype = (ProtoSectionType) sectionProvider.getProtoSection();
        this.protoSection = protosectiontype;
        FieldSectionType fieldsectiontype = (FieldSectionType) sectionProvider.getFieldSection();
        this.fieldSection = fieldsectiontype;
        MethodSectionType methodsectiontype = (MethodSectionType) sectionProvider.getMethodSection();
        this.methodSection = methodsectiontype;
        this.classSection = (ClassSectionType) sectionProvider.getClassSection();
        CallSiteSectionType callsitesectiontype = (CallSiteSectionType) sectionProvider.getCallSiteSection();
        this.callSiteSection = callsitesectiontype;
        MethodHandleSectionType methodhandlesectiontype = (MethodHandleSectionType) sectionProvider.getMethodHandleSection();
        this.methodHandleSection = methodhandlesectiontype;
        this.typeListSection = (TypeListSectionType) sectionProvider.getTypeListSection();
        this.annotationSection = (AnnotationSectionType) sectionProvider.getAnnotationSection();
        this.annotationSetSection = (AnnotationSetSectionType) sectionProvider.getAnnotationSetSection();
        this.encodedArraySection = (EncodedArraySectionType) sectionProvider.getEncodedArraySection();
        this.overflowableSections = new IndexSection[]{typesectiontype, protosectiontype, fieldsectiontype, methodsectiontype, callsitesectiontype, methodhandlesectiontype};
    }

    private int calcNumItems() {
        int i10 = this.stringSection.getItems().size() > 0 ? 3 : 1;
        if (this.typeSection.getItems().size() > 0) {
            i10++;
        }
        if (this.protoSection.getItems().size() > 0) {
            i10++;
        }
        if (this.fieldSection.getItems().size() > 0) {
            i10++;
        }
        if (this.methodSection.getItems().size() > 0) {
            i10++;
        }
        if (this.callSiteSection.getItems().size() > 0) {
            i10++;
        }
        if (this.methodHandleSection.getItems().size() > 0) {
            i10++;
        }
        if (this.typeListSection.getItems().size() > 0) {
            i10++;
        }
        if (this.encodedArraySection.getItems().size() > 0) {
            i10++;
        }
        if (this.annotationSection.getItems().size() > 0) {
            i10++;
        }
        if (this.annotationSetSection.getItems().size() > 0 || shouldCreateEmptyAnnotationSet()) {
            i10++;
        }
        if (this.numAnnotationSetRefItems > 0) {
            i10++;
        }
        if (this.numAnnotationDirectoryItems > 0) {
            i10++;
        }
        if (this.numDebugInfoItems > 0) {
            i10++;
        }
        if (this.numCodeItemItems > 0) {
            i10++;
        }
        if (this.classSection.getItems().size() > 0) {
            i10++;
        }
        if (this.numClassDataItems > 0) {
            i10++;
        }
        if (shouldWriteHiddenApiRestrictions()) {
            i10++;
        }
        return i10 + 1;
    }

    private static <T extends Comparable<? super T>> Comparator<Map.Entry<? extends T, ?>> comparableKeyComparator() {
        return (Comparator<Map.Entry<? extends T, ?>>) new Comparator<Map.Entry<? extends T, ?>>() { // from class: org.jf.dexlib2.writer.DexWriter.3
            @Override // java.util.Comparator
            public int compare(Map.Entry<? extends T, ?> entry, Map.Entry<? extends T, ?> entry2) {
                return ((Comparable) entry.getKey()).compareTo(entry2.getKey());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void fixInstructions(MutableMethodImplementation mutableMethodImplementation) {
        List<BuilderInstruction> instructions = mutableMethodImplementation.getInstructions();
        for (int i10 = 0; i10 < instructions.size(); i10++) {
            Instruction instruction = instructions.get(i10);
            if (instruction.getOpcode() == Opcode.CONST_STRING) {
                ReferenceInstruction referenceInstruction = (ReferenceInstruction) instruction;
                if (this.stringSection.getItemIndex((StringReference) referenceInstruction.getReference()) >= 65536) {
                    mutableMethodImplementation.replaceInstruction(i10, new BuilderInstruction31c(Opcode.CONST_STRING_JUMBO, ((OneRegisterInstruction) instruction).getRegisterA(), referenceInstruction.getReference()));
                }
            }
        }
    }

    private int getDataSectionOffset() {
        return (this.methodHandleSection.getItemCount() * 8) + (this.callSiteSection.getItemCount() * 4) + (this.classSection.getItemCount() * 32) + (this.methodSection.getItemCount() * 8) + (this.fieldSection.getItemCount() * 8) + (this.protoSection.getItemCount() * 12) + (this.typeSection.getItemCount() * 4) + (this.stringSection.getItemCount() * 4) + 112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DexDataWriter outputAt(DexDataStore dexDataStore, int i10) throws IOException {
        return new DexDataWriter(dexDataStore.outputAt(i10), i10);
    }

    private boolean shouldCreateEmptyAnnotationSet() {
        return this.opcodes.api < 17;
    }

    private boolean shouldWriteHiddenApiRestrictions() {
        return this.hasHiddenApiRestrictions && this.opcodes.api >= 29;
    }

    private void updateChecksum(DexDataStore dexDataStore) throws IOException {
        Adler32 adler32 = new Adler32();
        byte[] bArr = new byte[4096];
        InputStream at = dexDataStore.readAt(12);
        for (int i10 = at.read(bArr); i10 >= 0; i10 = at.read(bArr)) {
            adler32.update(bArr, 0, i10);
        }
        OutputStream outputStreamOutputAt = dexDataStore.outputAt(8);
        DexDataWriter.writeInt(outputStreamOutputAt, (int) adler32.getValue());
        outputStreamOutputAt.close();
    }

    private void updateSignature(DexDataStore dexDataStore) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            byte[] bArr = new byte[4096];
            InputStream at = dexDataStore.readAt(32);
            for (int i10 = at.read(bArr); i10 >= 0; i10 = at.read(bArr)) {
                messageDigest.update(bArr, 0, i10);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest.length != 20) {
                throw new RuntimeException(a.a(new StringBuilder("unexpected digest write: "), bArrDigest.length, " bytes"));
            }
            OutputStream outputStreamOutputAt = dexDataStore.outputAt(12);
            outputStreamOutputAt.write(bArrDigest);
            outputStreamOutputAt.close();
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void writeAnnotationDirectories(DexDataWriter dexDataWriter) throws IOException {
        dexDataWriter.align();
        this.annotationDirectorySectionOffset = dexDataWriter.getPosition();
        HashMap map = new HashMap();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(65536);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (Comparable comparable : this.classSection.getSortedClasses()) {
            Collection<? extends FieldKey> sortedFields = this.classSection.getSortedFields(comparable);
            Collection<? extends MethodKey> sortedMethods = this.classSection.getSortedMethods(comparable);
            int size = (sortedMethods.size() * 16) + (sortedFields.size() * 8);
            if (size > byteBufferAllocate.capacity()) {
                byteBufferAllocate = ByteBuffer.allocate(size);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            }
            byteBufferAllocate.clear();
            int i10 = 0;
            for (FieldKey fieldkey : sortedFields) {
                Object fieldAnnotations = this.classSection.getFieldAnnotations(fieldkey);
                if (fieldAnnotations != null) {
                    i10++;
                    byteBufferAllocate.putInt(this.fieldSection.getFieldIndex(fieldkey));
                    byteBufferAllocate.putInt(this.annotationSetSection.getItemOffset(fieldAnnotations));
                }
            }
            int i11 = 0;
            for (MethodKey methodkey : sortedMethods) {
                Object methodAnnotations = this.classSection.getMethodAnnotations(methodkey);
                if (methodAnnotations != null) {
                    i11++;
                    byteBufferAllocate.putInt(this.methodSection.getMethodIndex(methodkey));
                    byteBufferAllocate.putInt(this.annotationSetSection.getItemOffset(methodAnnotations));
                }
            }
            int i12 = 0;
            for (MethodKey methodkey2 : sortedMethods) {
                int annotationSetRefListOffset = this.classSection.getAnnotationSetRefListOffset(methodkey2);
                if (annotationSetRefListOffset != 0) {
                    i12++;
                    byteBufferAllocate.putInt(this.methodSection.getMethodIndex(methodkey2));
                    byteBufferAllocate.putInt(annotationSetRefListOffset);
                }
            }
            Object classAnnotations = this.classSection.getClassAnnotations(comparable);
            if (i10 == 0 && i11 == 0 && i12 == 0) {
                if (classAnnotations != null) {
                    Integer num = (Integer) map.get(classAnnotations);
                    if (num != null) {
                        this.classSection.setAnnotationDirectoryOffset(comparable, num.intValue());
                    } else {
                        map.put(classAnnotations, Integer.valueOf(dexDataWriter.getPosition()));
                    }
                }
            }
            this.numAnnotationDirectoryItems++;
            this.classSection.setAnnotationDirectoryOffset(comparable, dexDataWriter.getPosition());
            dexDataWriter.writeInt(this.annotationSetSection.getNullableItemOffset(classAnnotations));
            dexDataWriter.writeInt(i10);
            dexDataWriter.writeInt(i11);
            dexDataWriter.writeInt(i12);
            dexDataWriter.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
        }
    }

    private void writeAnnotationSetRefs(DexDataWriter dexDataWriter) throws IOException {
        dexDataWriter.align();
        this.annotationSetRefSectionOffset = dexDataWriter.getPosition();
        HashMap map = new HashMap();
        Iterator it = this.classSection.getSortedClasses().iterator();
        while (it.hasNext()) {
            for (MethodKey methodkey : this.classSection.getSortedMethods((Comparable) it.next())) {
                List<? extends AnnotationSetKey> parameterAnnotations = this.classSection.getParameterAnnotations(methodkey);
                if (parameterAnnotations != null) {
                    Integer num = (Integer) map.get(parameterAnnotations);
                    if (num != null) {
                        this.classSection.setAnnotationSetRefListOffset(methodkey, num.intValue());
                    } else {
                        dexDataWriter.align();
                        int position = dexDataWriter.getPosition();
                        this.classSection.setAnnotationSetRefListOffset(methodkey, position);
                        map.put(parameterAnnotations, Integer.valueOf(position));
                        this.numAnnotationSetRefItems++;
                        dexDataWriter.writeInt(parameterAnnotations.size());
                        for (AnnotationSetKey annotationsetkey : parameterAnnotations) {
                            if (this.annotationSetSection.getAnnotations(annotationsetkey).size() > 0) {
                                dexDataWriter.writeInt(this.annotationSetSection.getItemOffset(annotationsetkey));
                            } else if (shouldCreateEmptyAnnotationSet()) {
                                dexDataWriter.writeInt(this.annotationSetSectionOffset);
                            } else {
                                dexDataWriter.writeInt(0);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeAnnotationSets(DexDataWriter dexDataWriter) throws IOException {
        dexDataWriter.align();
        this.annotationSetSectionOffset = dexDataWriter.getPosition();
        if (shouldCreateEmptyAnnotationSet()) {
            dexDataWriter.writeInt(0);
        }
        for (Map.Entry entry : this.annotationSetSection.getItems()) {
            u0 u0VarB = o0.a(BaseAnnotation.BY_TYPE).b(this.annotationSetSection.getAnnotations(entry.getKey()));
            dexDataWriter.align();
            entry.setValue(Integer.valueOf(dexDataWriter.getPosition()));
            dexDataWriter.writeInt(u0VarB.f18758d);
            r.a aVarListIterator = u0VarB.listIterator(0);
            while (aVarListIterator.hasNext()) {
                dexDataWriter.writeInt(this.annotationSection.getItemOffset((Annotation) aVarListIterator.next()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeAnnotations(DexDataWriter dexDataWriter) throws IOException {
        InternalEncodedValueWriter internalEncodedValueWriter = new InternalEncodedValueWriter(dexDataWriter);
        this.annotationSectionOffset = dexDataWriter.getPosition();
        for (Map.Entry entry : this.annotationSection.getItems()) {
            entry.setValue(Integer.valueOf(dexDataWriter.getPosition()));
            Annotation annotation = (Annotation) entry.getKey();
            dexDataWriter.writeUbyte(this.annotationSection.getVisibility(annotation));
            dexDataWriter.writeUleb128(this.typeSection.getItemIndex((CharSequence) this.annotationSection.getType(annotation)));
            u0 u0VarB = o0.a(BaseAnnotationElement.BY_NAME).b(this.annotationSection.getElements(annotation));
            dexDataWriter.writeUleb128(u0VarB.f18758d);
            r.a aVarListIterator = u0VarB.listIterator(0);
            while (aVarListIterator.hasNext()) {
                AnnotationElement annotationElement = (AnnotationElement) aVarListIterator.next();
                dexDataWriter.writeUleb128(this.stringSection.getItemIndex((CharSequence) this.annotationSection.getElementName(annotationElement)));
                writeEncodedValue(internalEncodedValueWriter, this.annotationSection.getElementValue(annotationElement));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeCallSites(DexDataWriter dexDataWriter) throws IOException {
        this.callSiteSectionOffset = dexDataWriter.getPosition();
        ArrayList arrayListA = k0.a(this.callSiteSection.getItems());
        Collections.sort(arrayListA, this.callSiteComparator);
        int size = arrayListA.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            Map.Entry entry = (Map.Entry) obj;
            entry.setValue(Integer.valueOf(i10));
            dexDataWriter.writeInt(this.encodedArraySection.getItemOffset(this.callSiteSection.getEncodedCallSite((CallSiteReference) entry.getKey())));
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int writeClass(DexDataWriter dexDataWriter, DexDataWriter dexDataWriter2, int i10, Map.Entry<? extends ClassKey, Integer> entry) throws IOException {
        if (entry == null || entry.getValue().intValue() != -1) {
            return i10;
        }
        ClassKey key = entry.getKey();
        entry.setValue(0);
        ClassSectionType classsectiontype = this.classSection;
        int iWriteClass = writeClass(dexDataWriter, dexDataWriter2, i10, classsectiontype.getClassEntryByType(classsectiontype.getSuperclass(key)));
        Iterator it = this.typeListSection.getTypes(this.classSection.getInterfaces(key)).iterator();
        while (it.hasNext()) {
            iWriteClass = writeClass(dexDataWriter, dexDataWriter2, iWriteClass, this.classSection.getClassEntryByType((CharSequence) it.next()));
        }
        int i11 = iWriteClass + 1;
        entry.setValue(Integer.valueOf(iWriteClass));
        dexDataWriter.writeInt(this.typeSection.getItemIndex(this.classSection.getType(key)));
        dexDataWriter.writeInt(this.classSection.getAccessFlags(key));
        dexDataWriter.writeInt(this.typeSection.getNullableItemIndex(this.classSection.getSuperclass(key)));
        dexDataWriter.writeInt(this.typeListSection.getNullableItemOffset(this.classSection.getInterfaces(key)));
        dexDataWriter.writeInt(this.stringSection.getNullableItemIndex(this.classSection.getSourceFile(key)));
        dexDataWriter.writeInt(this.classSection.getAnnotationDirectoryOffset(key));
        Collection<? extends FieldKey> sortedStaticFields = this.classSection.getSortedStaticFields(key);
        Collection<? extends FieldKey> sortedInstanceFields = this.classSection.getSortedInstanceFields(key);
        Collection<? extends MethodKey> sortedDirectMethods = this.classSection.getSortedDirectMethods(key);
        Collection<? extends MethodKey> sortedVirtualMethods = this.classSection.getSortedVirtualMethods(key);
        boolean z10 = sortedStaticFields.size() > 0 || sortedInstanceFields.size() > 0 || sortedDirectMethods.size() > 0 || sortedVirtualMethods.size() > 0;
        if (z10) {
            dexDataWriter.writeInt(dexDataWriter2.getPosition());
        } else {
            dexDataWriter.writeInt(0);
        }
        Object staticInitializers = this.classSection.getStaticInitializers(key);
        if (staticInitializers != null) {
            dexDataWriter.writeInt(this.encodedArraySection.getItemOffset(staticInitializers));
        } else {
            dexDataWriter.writeInt(0);
        }
        if (z10) {
            this.numClassDataItems++;
            dexDataWriter2.writeUleb128(sortedStaticFields.size());
            dexDataWriter2.writeUleb128(sortedInstanceFields.size());
            dexDataWriter2.writeUleb128(sortedDirectMethods.size());
            dexDataWriter2.writeUleb128(sortedVirtualMethods.size());
            writeEncodedFields(dexDataWriter2, sortedStaticFields);
            writeEncodedFields(dexDataWriter2, sortedInstanceFields);
            writeEncodedMethods(dexDataWriter2, sortedDirectMethods);
            writeEncodedMethods(dexDataWriter2, sortedVirtualMethods);
        }
        return i11;
    }

    private void writeClasses(DexDataStore dexDataStore, DexDataWriter dexDataWriter, DexDataWriter dexDataWriter2) throws IOException {
        this.classIndexSectionOffset = dexDataWriter.getPosition();
        this.classDataSectionOffset = dexDataWriter2.getPosition();
        ArrayList arrayListA = k0.a(this.classSection.getItems());
        Collections.sort(arrayListA, comparableKeyComparator());
        int size = arrayListA.size();
        int i10 = 0;
        int iWriteClass = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            iWriteClass = writeClass(dexDataWriter, dexDataWriter2, iWriteClass, (Map.Entry) obj);
        }
        if (shouldWriteHiddenApiRestrictions()) {
            this.hiddenApiRestrictionsOffset = dexDataWriter2.getPosition();
            RestrictionsWriter restrictionsWriter = new RestrictionsWriter(dexDataStore, dexDataWriter2, arrayListA.size());
            try {
                int size2 = arrayListA.size();
                while (i10 < size2) {
                    Object obj2 = arrayListA.get(i10);
                    i10++;
                    Map.Entry entry = (Map.Entry) obj2;
                    Iterator<? extends FieldKey> it = this.classSection.getSortedStaticFields((Comparable) entry.getKey()).iterator();
                    while (it.hasNext()) {
                        restrictionsWriter.writeRestriction(this.classSection.getFieldHiddenApiRestrictions(it.next()));
                    }
                    Iterator<? extends FieldKey> it2 = this.classSection.getSortedInstanceFields((Comparable) entry.getKey()).iterator();
                    while (it2.hasNext()) {
                        restrictionsWriter.writeRestriction(this.classSection.getFieldHiddenApiRestrictions(it2.next()));
                    }
                    Iterator<? extends MethodKey> it3 = this.classSection.getSortedDirectMethods((Comparable) entry.getKey()).iterator();
                    while (it3.hasNext()) {
                        restrictionsWriter.writeRestriction(this.classSection.getMethodHiddenApiRestrictions(it3.next()));
                    }
                    Iterator<? extends MethodKey> it4 = this.classSection.getSortedVirtualMethods((Comparable) entry.getKey()).iterator();
                    while (it4.hasNext()) {
                        restrictionsWriter.writeRestriction(this.classSection.getMethodHiddenApiRestrictions(it4.next()));
                    }
                    restrictionsWriter.finishClass();
                }
                restrictionsWriter.close();
            } catch (Throwable th2) {
                restrictionsWriter.close();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int writeCodeItem(DexDataWriter dexDataWriter, ByteArrayOutputStream byteArrayOutputStream, MethodKey methodkey, List<? extends TryBlock<? extends ExceptionHandler>> list, Iterable<? extends Instruction> iterable, int i10) throws IOException {
        if (iterable == null && i10 == 0) {
            return -1;
        }
        this.numCodeItemItems++;
        dexDataWriter.align();
        int position = dexDataWriter.getPosition();
        dexDataWriter.writeUshort(this.classSection.getRegisterCount(methodkey));
        dexDataWriter.writeUshort(MethodUtil.getParameterRegisterCount((Collection<? extends CharSequence>) this.typeListSection.getTypes(this.protoSection.getParameters(this.methodSection.getPrototype(methodkey))), AccessFlags.STATIC.isSet(this.classSection.getMethodAccessFlags(methodkey))));
        if (iterable == null) {
            dexDataWriter.writeUshort(0);
            dexDataWriter.writeUshort(0);
            dexDataWriter.writeInt(i10);
            dexDataWriter.writeInt(0);
            return position;
        }
        List<TryBlock> listMassageTryBlocks = TryListBuilder.massageTryBlocks(list);
        int i11 = 0;
        int codeUnits = 0;
        for (Instruction instruction : iterable) {
            codeUnits += instruction.getCodeUnits();
            if (instruction.getOpcode().referenceType == 3) {
                MethodReference methodReference = (MethodReference) ((ReferenceInstruction) instruction).getReference();
                Opcode opcode = instruction.getOpcode();
                int registerCount = InstructionUtil.isInvokePolymorphic(opcode) ? ((VariableRegisterInstruction) instruction).getRegisterCount() : MethodUtil.getParameterRegisterCount(methodReference, InstructionUtil.isInvokeStatic(opcode));
                if (registerCount > i11) {
                    i11 = registerCount;
                }
            }
        }
        dexDataWriter.writeUshort(i11);
        dexDataWriter.writeUshort(listMassageTryBlocks.size());
        dexDataWriter.writeInt(i10);
        InstructionWriter instructionWriterMakeInstructionWriter = InstructionWriter.makeInstructionWriter(this.opcodes, dexDataWriter, this.stringSection, this.typeSection, this.fieldSection, this.methodSection, this.protoSection, this.methodHandleSection, this.callSiteSection);
        dexDataWriter.writeInt(codeUnits);
        int codeUnits2 = 0;
        for (Instruction instruction2 : iterable) {
            try {
                switch (AnonymousClass4.$SwitchMap$org$jf$dexlib2$Format[instruction2.getOpcode().format.ordinal()]) {
                    case 1:
                        instructionWriterMakeInstructionWriter.write((Instruction10t) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 2:
                        instructionWriterMakeInstructionWriter.write((Instruction10x) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 3:
                        instructionWriterMakeInstructionWriter.write((Instruction11n) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 4:
                        instructionWriterMakeInstructionWriter.write((Instruction11x) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 5:
                        instructionWriterMakeInstructionWriter.write((Instruction12x) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 6:
                        instructionWriterMakeInstructionWriter.write((Instruction20bc) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 7:
                        instructionWriterMakeInstructionWriter.write((Instruction20t) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 8:
                        instructionWriterMakeInstructionWriter.write((Instruction21c) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 9:
                        instructionWriterMakeInstructionWriter.write((Instruction21ih) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 10:
                        instructionWriterMakeInstructionWriter.write((Instruction21lh) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 11:
                        instructionWriterMakeInstructionWriter.write((Instruction21s) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 12:
                        instructionWriterMakeInstructionWriter.write((Instruction21t) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 13:
                        instructionWriterMakeInstructionWriter.write((Instruction22b) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 14:
                        instructionWriterMakeInstructionWriter.write((Instruction22c) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 15:
                        instructionWriterMakeInstructionWriter.write((Instruction22cs) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 16:
                        instructionWriterMakeInstructionWriter.write((Instruction22s) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 17:
                        instructionWriterMakeInstructionWriter.write((Instruction22t) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 18:
                        instructionWriterMakeInstructionWriter.write((Instruction22x) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 19:
                        instructionWriterMakeInstructionWriter.write((Instruction23x) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 20:
                        instructionWriterMakeInstructionWriter.write((Instruction30t) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 21:
                        instructionWriterMakeInstructionWriter.write((Instruction31c) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 22:
                        instructionWriterMakeInstructionWriter.write((Instruction31i) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 23:
                        instructionWriterMakeInstructionWriter.write((Instruction31t) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 24:
                        instructionWriterMakeInstructionWriter.write((Instruction32x) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 25:
                        instructionWriterMakeInstructionWriter.write((Instruction35c) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 26:
                        instructionWriterMakeInstructionWriter.write((Instruction35mi) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 27:
                        instructionWriterMakeInstructionWriter.write((Instruction35ms) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 28:
                        instructionWriterMakeInstructionWriter.write((Instruction3rc) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 29:
                        instructionWriterMakeInstructionWriter.write((Instruction3rmi) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 30:
                        instructionWriterMakeInstructionWriter.write((Instruction3rms) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 31:
                        instructionWriterMakeInstructionWriter.write((Instruction45cc) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 32:
                        instructionWriterMakeInstructionWriter.write((Instruction4rcc) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 33:
                        instructionWriterMakeInstructionWriter.write((Instruction51l) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 34:
                        instructionWriterMakeInstructionWriter.write((ArrayPayload) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 35:
                        instructionWriterMakeInstructionWriter.write((PackedSwitchPayload) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    case 36:
                        instructionWriterMakeInstructionWriter.write((SparseSwitchPayload) instruction2);
                        continue;
                        codeUnits2 += instruction2.getCodeUnits();
                    default:
                        throw new ExceptionWithContext("Unsupported instruction format: %s", instruction2.getOpcode().format);
                }
            } catch (RuntimeException e10) {
                throw new ExceptionWithContext(e10, "Error while writing instruction at code offset 0x%x", Integer.valueOf(codeUnits2));
            }
            throw new ExceptionWithContext(e10, "Error while writing instruction at code offset 0x%x", Integer.valueOf(codeUnits2));
        }
        if (listMassageTryBlocks.size() > 0) {
            dexDataWriter.align();
            HashMap map = new HashMap();
            Iterator it = listMassageTryBlocks.iterator();
            while (it.hasNext()) {
                map.put(((TryBlock) it.next()).getExceptionHandlers(), 0);
            }
            DexDataWriter.writeUleb128(byteArrayOutputStream, map.size());
            for (TryBlock tryBlock : listMassageTryBlocks) {
                int startCodeAddress = tryBlock.getStartCodeAddress();
                int codeUnitCount = (tryBlock.getCodeUnitCount() + startCodeAddress) - startCodeAddress;
                dexDataWriter.writeInt(startCodeAddress);
                dexDataWriter.writeUshort(codeUnitCount);
                if (tryBlock.getExceptionHandlers().size() == 0) {
                    throw new ExceptionWithContext("No exception handlers for the try block!", new Object[0]);
                }
                Integer num = (Integer) map.get(tryBlock.getExceptionHandlers());
                if (num.intValue() != 0) {
                    dexDataWriter.writeUshort(num.intValue());
                } else {
                    int size = byteArrayOutputStream.size();
                    Integer numValueOf = Integer.valueOf(size);
                    dexDataWriter.writeUshort(size);
                    map.put(tryBlock.getExceptionHandlers(), numValueOf);
                    int size2 = tryBlock.getExceptionHandlers().size();
                    if (((ExceptionHandler) tryBlock.getExceptionHandlers().get(size2 - 1)).getExceptionType() == null) {
                        size2 = (size2 * (-1)) + 1;
                    }
                    DexDataWriter.writeSleb128(byteArrayOutputStream, size2);
                    for (ExceptionHandler exceptionHandler : tryBlock.getExceptionHandlers()) {
                        CharSequence exceptionType = this.classSection.getExceptionType(exceptionHandler);
                        int handlerCodeAddress = exceptionHandler.getHandlerCodeAddress();
                        if (exceptionType != null) {
                            DexDataWriter.writeUleb128(byteArrayOutputStream, this.typeSection.getItemIndex(exceptionType));
                            DexDataWriter.writeUleb128(byteArrayOutputStream, handlerCodeAddress);
                        } else {
                            DexDataWriter.writeUleb128(byteArrayOutputStream, handlerCodeAddress);
                        }
                    }
                }
            }
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.writeTo(dexDataWriter);
                byteArrayOutputStream.reset();
            }
        }
        return position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeDebugAndCodeItems(DexDataWriter dexDataWriter, DeferredOutputStream deferredOutputStream) throws IOException {
        DexDataWriter dexDataWriter2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.debugSectionOffset = dexDataWriter.getPosition();
        DebugWriter debugWriter = new DebugWriter(this.stringSection, this.typeSection, dexDataWriter);
        DexDataWriter dexDataWriter3 = new DexDataWriter(deferredOutputStream, 0);
        ArrayList arrayList = new ArrayList();
        for (Comparable comparable : this.classSection.getSortedClasses()) {
            Iterator<Object> it = u2.d(this.classSection.getSortedDirectMethods(comparable), this.classSection.getSortedVirtualMethods(comparable)).iterator();
            while (true) {
                j0.b bVar = (j0.b) it;
                if (bVar.hasNext()) {
                    Object next = bVar.next();
                    List tryBlocks = this.classSection.getTryBlocks(next);
                    Iterable<Instruction> instructions = this.classSection.getInstructions(next);
                    Iterable<? extends DebugItem> debugItems = this.classSection.getDebugItems(next);
                    if (instructions == null || !this.stringSection.hasJumboIndexes()) {
                        dexDataWriter2 = dexDataWriter3;
                    } else {
                        for (Instruction instruction : instructions) {
                            dexDataWriter2 = dexDataWriter3;
                            if (instruction.getOpcode() == Opcode.CONST_STRING && this.stringSection.getItemIndex((StringReference) ((ReferenceInstruction) instruction).getReference()) >= 65536) {
                                MutableMethodImplementation mutableMethodImplementationMakeMutableMethodImplementation = this.classSection.makeMutableMethodImplementation(next);
                                fixInstructions(mutableMethodImplementationMakeMutableMethodImplementation);
                                instructions = mutableMethodImplementationMakeMutableMethodImplementation.getInstructions();
                                tryBlocks = mutableMethodImplementationMakeMutableMethodImplementation.getTryBlocks();
                                debugItems = mutableMethodImplementationMakeMutableMethodImplementation.getDebugItems();
                                break;
                            }
                            dexDataWriter3 = dexDataWriter2;
                        }
                        dexDataWriter2 = dexDataWriter3;
                    }
                    DexDataWriter dexDataWriter4 = dexDataWriter2;
                    try {
                        int iWriteCodeItem = writeCodeItem(dexDataWriter4, byteArrayOutputStream, next, tryBlocks, instructions, writeDebugItem(dexDataWriter, debugWriter, this.classSection.getParameterNames(next), debugItems));
                        if (iWriteCodeItem != -1) {
                            arrayList.add(new CodeItemOffset(next, iWriteCodeItem));
                        }
                        dexDataWriter3 = dexDataWriter4;
                    } catch (RuntimeException e10) {
                        throw new ExceptionWithContext(e10, "Exception occurred while writing code_item for method %s", this.methodSection.getMethodReference(next));
                    }
                }
            }
        }
        dexDataWriter.align();
        this.codeSectionOffset = dexDataWriter.getPosition();
        dexDataWriter3.close();
        deferredOutputStream.writeTo(dexDataWriter);
        deferredOutputStream.close();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            CodeItemOffset codeItemOffset = (CodeItemOffset) obj;
            this.classSection.setCodeItemOffset(codeItemOffset.method, this.codeSectionOffset + codeItemOffset.codeOffset);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if ((r11 instanceof java.util.Collection ? ((java.util.Collection) r11).isEmpty() : !r11.iterator().hasNext()) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int writeDebugItem(DexDataWriter dexDataWriter, DebugWriter<StringKey, TypeKey> debugWriter, Iterable<? extends StringKey> iterable, Iterable<? extends DebugItem> iterable2) throws IOException {
        int size;
        int i10;
        int lineNumber;
        if (iterable != null) {
            size = iterable instanceof Collection ? ((Collection) iterable).size() : j0.g(iterable.iterator());
            Iterator<? extends StringKey> it = iterable.iterator();
            int i11 = 0;
            i10 = -1;
            while (it.hasNext()) {
                if (it.next() != null) {
                    i10 = i11;
                }
                i11++;
            }
        } else {
            size = 0;
            i10 = -1;
        }
        if (i10 == -1) {
            if (iterable2 != null) {
            }
            return 0;
        }
        this.numDebugInfoItems++;
        int position = dexDataWriter.getPosition();
        if (iterable2 != null) {
            for (DebugItem debugItem : iterable2) {
                if (debugItem instanceof LineNumber) {
                    lineNumber = ((LineNumber) debugItem).getLineNumber();
                    break;
                }
            }
            lineNumber = 0;
        } else {
            lineNumber = 0;
        }
        dexDataWriter.writeUleb128(lineNumber);
        dexDataWriter.writeUleb128(size);
        if (iterable != null) {
            int i12 = 0;
            for (StringKey stringkey : iterable) {
                if (i12 == size) {
                    break;
                }
                i12++;
                dexDataWriter.writeUleb128(this.stringSection.getNullableItemIndex(stringkey) + 1);
            }
        }
        if (iterable2 != null) {
            debugWriter.reset(lineNumber);
            Iterator<? extends DebugItem> it2 = iterable2.iterator();
            while (it2.hasNext()) {
                this.classSection.writeDebugItem(debugWriter, it2.next());
            }
        }
        dexDataWriter.write(0);
        return position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeEncodedArrays(DexDataWriter dexDataWriter) throws IOException {
        InternalEncodedValueWriter internalEncodedValueWriter = new InternalEncodedValueWriter(dexDataWriter);
        this.encodedArraySectionOffset = dexDataWriter.getPosition();
        for (Map.Entry entry : this.encodedArraySection.getItems()) {
            entry.setValue(Integer.valueOf(dexDataWriter.getPosition()));
            List encodedValueList = this.encodedArraySection.getEncodedValueList(entry.getKey());
            dexDataWriter.writeUleb128(encodedValueList.size());
            Iterator it = encodedValueList.iterator();
            while (it.hasNext()) {
                writeEncodedValue(internalEncodedValueWriter, it.next());
            }
        }
    }

    private void writeEncodedFields(DexDataWriter dexDataWriter, Collection<? extends FieldKey> collection) throws IOException {
        int i10 = 0;
        for (FieldKey fieldkey : collection) {
            int fieldIndex = this.fieldSection.getFieldIndex(fieldkey);
            if (!this.classSection.getFieldHiddenApiRestrictions(fieldkey).isEmpty()) {
                this.hasHiddenApiRestrictions = true;
            }
            dexDataWriter.writeUleb128(fieldIndex - i10);
            dexDataWriter.writeUleb128(this.classSection.getFieldAccessFlags(fieldkey));
            i10 = fieldIndex;
        }
    }

    private void writeEncodedMethods(DexDataWriter dexDataWriter, Collection<? extends MethodKey> collection) throws IOException {
        int i10 = 0;
        for (MethodKey methodkey : collection) {
            int methodIndex = this.methodSection.getMethodIndex(methodkey);
            if (!this.classSection.getMethodHiddenApiRestrictions(methodkey).isEmpty()) {
                this.hasHiddenApiRestrictions = true;
            }
            dexDataWriter.writeUleb128(methodIndex - i10);
            dexDataWriter.writeUleb128(this.classSection.getMethodAccessFlags(methodkey));
            dexDataWriter.writeUleb128(this.classSection.getCodeItemOffset(methodkey));
            i10 = methodIndex;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeFields(DexDataWriter dexDataWriter) throws IOException {
        this.fieldSectionOffset = dexDataWriter.getPosition();
        ArrayList arrayListA = k0.a(this.fieldSection.getItems());
        Collections.sort(arrayListA, comparableKeyComparator());
        int size = arrayListA.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 1;
            entry.setValue(Integer.valueOf(i10));
            FieldReference fieldReference = (FieldReference) entry.getKey();
            dexDataWriter.writeUshort(this.typeSection.getItemIndex((CharSequence) this.fieldSection.getDefiningClass(fieldReference)));
            dexDataWriter.writeUshort(this.typeSection.getItemIndex((CharSequence) this.fieldSection.getFieldType(fieldReference)));
            dexDataWriter.writeInt(this.stringSection.getItemIndex((CharSequence) this.fieldSection.getName(fieldReference)));
            i10 = i12;
        }
    }

    private void writeHeader(DexDataWriter dexDataWriter, int i10, int i11) throws IOException {
        dexDataWriter.write(HeaderItem.getMagicForApi(this.opcodes.api));
        dexDataWriter.writeInt(0);
        dexDataWriter.write(new byte[20]);
        dexDataWriter.writeInt(i11);
        dexDataWriter.writeInt(112);
        dexDataWriter.writeInt(HeaderItem.LITTLE_ENDIAN_TAG);
        dexDataWriter.writeInt(0);
        dexDataWriter.writeInt(0);
        dexDataWriter.writeInt(this.mapSectionOffset);
        writeSectionInfo(dexDataWriter, this.stringSection.getItems().size(), this.stringIndexSectionOffset);
        writeSectionInfo(dexDataWriter, this.typeSection.getItems().size(), this.typeSectionOffset);
        writeSectionInfo(dexDataWriter, this.protoSection.getItems().size(), this.protoSectionOffset);
        writeSectionInfo(dexDataWriter, this.fieldSection.getItems().size(), this.fieldSectionOffset);
        writeSectionInfo(dexDataWriter, this.methodSection.getItems().size(), this.methodSectionOffset);
        writeSectionInfo(dexDataWriter, this.classSection.getItems().size(), this.classIndexSectionOffset);
        dexDataWriter.writeInt(i11 - i10);
        dexDataWriter.writeInt(i10);
    }

    private void writeMapItem(DexDataWriter dexDataWriter) throws IOException {
        dexDataWriter.align();
        this.mapSectionOffset = dexDataWriter.getPosition();
        dexDataWriter.writeInt(calcNumItems());
        writeMapItem(dexDataWriter, 0, 1, 0);
        writeMapItem(dexDataWriter, 1, this.stringSection.getItems().size(), this.stringIndexSectionOffset);
        writeMapItem(dexDataWriter, 2, this.typeSection.getItems().size(), this.typeSectionOffset);
        writeMapItem(dexDataWriter, 3, this.protoSection.getItems().size(), this.protoSectionOffset);
        writeMapItem(dexDataWriter, 4, this.fieldSection.getItems().size(), this.fieldSectionOffset);
        writeMapItem(dexDataWriter, 5, this.methodSection.getItems().size(), this.methodSectionOffset);
        writeMapItem(dexDataWriter, 6, this.classSection.getItems().size(), this.classIndexSectionOffset);
        writeMapItem(dexDataWriter, 7, this.callSiteSection.getItems().size(), this.callSiteSectionOffset);
        writeMapItem(dexDataWriter, 8, this.methodHandleSection.getItems().size(), this.methodHandleSectionOffset);
        writeMapItem(dexDataWriter, ItemType.STRING_DATA_ITEM, this.stringSection.getItems().size(), this.stringDataSectionOffset);
        writeMapItem(dexDataWriter, ItemType.TYPE_LIST, this.typeListSection.getItems().size(), this.typeListSectionOffset);
        writeMapItem(dexDataWriter, ItemType.ENCODED_ARRAY_ITEM, this.encodedArraySection.getItems().size(), this.encodedArraySectionOffset);
        writeMapItem(dexDataWriter, ItemType.ANNOTATION_ITEM, this.annotationSection.getItems().size(), this.annotationSectionOffset);
        writeMapItem(dexDataWriter, ItemType.ANNOTATION_SET_ITEM, this.annotationSetSection.getItems().size() + (shouldCreateEmptyAnnotationSet() ? 1 : 0), this.annotationSetSectionOffset);
        writeMapItem(dexDataWriter, ItemType.ANNOTATION_SET_REF_LIST, this.numAnnotationSetRefItems, this.annotationSetRefSectionOffset);
        writeMapItem(dexDataWriter, ItemType.ANNOTATION_DIRECTORY_ITEM, this.numAnnotationDirectoryItems, this.annotationDirectorySectionOffset);
        writeMapItem(dexDataWriter, ItemType.DEBUG_INFO_ITEM, this.numDebugInfoItems, this.debugSectionOffset);
        writeMapItem(dexDataWriter, ItemType.CODE_ITEM, this.numCodeItemItems, this.codeSectionOffset);
        writeMapItem(dexDataWriter, 8192, this.numClassDataItems, this.classDataSectionOffset);
        if (shouldWriteHiddenApiRestrictions()) {
            writeMapItem(dexDataWriter, ItemType.HIDDENAPI_CLASS_DATA_ITEM, 1, this.hiddenApiRestrictionsOffset);
        }
        writeMapItem(dexDataWriter, 4096, 1, this.mapSectionOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeMethodHandles(DexDataWriter dexDataWriter) throws IOException {
        int itemIndex;
        this.methodHandleSectionOffset = dexDataWriter.getPosition();
        int i10 = 0;
        for (Map.Entry entry : this.methodHandleSection.getItems()) {
            int i11 = i10 + 1;
            entry.setValue(Integer.valueOf(i10));
            MethodHandleReference methodHandleReference = (MethodHandleReference) entry.getKey();
            dexDataWriter.writeUshort(methodHandleReference.getMethodHandleType());
            dexDataWriter.writeUshort(0);
            switch (methodHandleReference.getMethodHandleType()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    itemIndex = this.fieldSection.getItemIndex(this.methodHandleSection.getFieldReference(methodHandleReference));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    itemIndex = this.methodSection.getItemIndex(this.methodHandleSection.getMethodReference(methodHandleReference));
                    break;
                default:
                    throw new ExceptionWithContext("Invalid method handle type: %d", Integer.valueOf(methodHandleReference.getMethodHandleType()));
            }
            dexDataWriter.writeUshort(itemIndex);
            dexDataWriter.writeUshort(0);
            i10 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeMethods(DexDataWriter dexDataWriter) throws IOException {
        this.methodSectionOffset = dexDataWriter.getPosition();
        ArrayList arrayListA = k0.a(this.methodSection.getItems());
        Collections.sort(arrayListA, comparableKeyComparator());
        int size = arrayListA.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 1;
            entry.setValue(Integer.valueOf(i10));
            MethodReference methodReference = (MethodReference) entry.getKey();
            dexDataWriter.writeUshort(this.typeSection.getItemIndex((CharSequence) this.methodSection.getDefiningClass(methodReference)));
            dexDataWriter.writeUshort(this.protoSection.getItemIndex(this.methodSection.getPrototype(methodReference)));
            dexDataWriter.writeInt(this.stringSection.getItemIndex((CharSequence) this.methodSection.getName(methodReference)));
            i10 = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeProtos(DexDataWriter dexDataWriter) throws IOException {
        this.protoSectionOffset = dexDataWriter.getPosition();
        ArrayList arrayListA = k0.a(this.protoSection.getItems());
        Collections.sort(arrayListA, comparableKeyComparator());
        int size = arrayListA.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 1;
            entry.setValue(Integer.valueOf(i10));
            MethodProtoReference methodProtoReference = (MethodProtoReference) entry.getKey();
            dexDataWriter.writeInt(this.stringSection.getItemIndex((CharSequence) this.protoSection.getShorty(methodProtoReference)));
            dexDataWriter.writeInt(this.typeSection.getItemIndex((CharSequence) this.protoSection.getReturnType(methodProtoReference)));
            dexDataWriter.writeInt(this.typeListSection.getNullableItemOffset(this.protoSection.getParameters(methodProtoReference)));
            i10 = i12;
        }
    }

    private void writeSectionInfo(DexDataWriter dexDataWriter, int i10, int i11) throws IOException {
        dexDataWriter.writeInt(i10);
        if (i10 > 0) {
            dexDataWriter.writeInt(i11);
        } else {
            dexDataWriter.writeInt(0);
        }
    }

    private void writeStrings(DexDataWriter dexDataWriter, DexDataWriter dexDataWriter2) throws IOException {
        this.stringIndexSectionOffset = dexDataWriter.getPosition();
        this.stringDataSectionOffset = dexDataWriter2.getPosition();
        ArrayList arrayListA = k0.a(this.stringSection.getItems());
        Collections.sort(arrayListA, toStringKeyComparator);
        int size = arrayListA.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 1;
            entry.setValue(Integer.valueOf(i10));
            dexDataWriter.writeInt(dexDataWriter2.getPosition());
            String string = ((CharSequence) entry.getKey()).toString();
            dexDataWriter2.writeUleb128(string.length());
            dexDataWriter2.writeString(string);
            dexDataWriter2.write(0);
            i10 = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeTypeLists(DexDataWriter dexDataWriter) throws IOException {
        dexDataWriter.align();
        this.typeListSectionOffset = dexDataWriter.getPosition();
        for (Map.Entry entry : this.typeListSection.getItems()) {
            dexDataWriter.align();
            entry.setValue(Integer.valueOf(dexDataWriter.getPosition()));
            Collection types = this.typeListSection.getTypes(entry.getKey());
            dexDataWriter.writeInt(types.size());
            Iterator it = types.iterator();
            while (it.hasNext()) {
                dexDataWriter.writeUshort(this.typeSection.getItemIndex((CharSequence) it.next()));
            }
        }
    }

    private void writeTypes(DexDataWriter dexDataWriter) throws IOException {
        this.typeSectionOffset = dexDataWriter.getPosition();
        ArrayList arrayListA = k0.a(this.typeSection.getItems());
        Collections.sort(arrayListA, toStringKeyComparator);
        int size = arrayListA.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            Map.Entry entry = (Map.Entry) obj;
            entry.setValue(Integer.valueOf(i10));
            dexDataWriter.writeInt(this.stringSection.getItemIndex((CharSequence) this.typeSection.getString((CharSequence) entry.getKey())));
            i10++;
        }
    }

    public List<String> getFieldReferences() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.fieldSection.getItems().iterator();
        while (it.hasNext()) {
            arrayList.add(DexFormatter.INSTANCE.getFieldDescriptor((FieldReference) ((Map.Entry) it.next()).getKey()));
        }
        return arrayList;
    }

    public List<String> getMethodReferences() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.methodSection.getItems().iterator();
        while (it.hasNext()) {
            arrayList.add(DexFormatter.INSTANCE.getMethodDescriptor((MethodReference) ((Map.Entry) it.next()).getKey()));
        }
        return arrayList;
    }

    public abstract DexWriter<StringKey, StringRef, TypeKey, TypeRef, ProtoRefKey, FieldRefKey, MethodRefKey, ClassKey, CallSiteKey, MethodHandleKey, AnnotationKey, AnnotationSetKey, TypeListKey, FieldKey, MethodKey, EncodedArrayKey, EncodedValue, AnnotationElement, StringSectionType, TypeSectionType, ProtoSectionType, FieldSectionType, MethodSectionType, ClassSectionType, CallSiteSectionType, MethodHandleSectionType, TypeListSectionType, AnnotationSectionType, AnnotationSetSectionType, EncodedArraySectionType>.SectionProvider getSectionProvider();

    public List<String> getTypeReferences() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.typeSection.getItems().iterator();
        while (it.hasNext()) {
            arrayList.add(((CharSequence) ((Map.Entry) it.next()).getKey()).toString());
        }
        return arrayList;
    }

    public boolean hasOverflowed() {
        return hasOverflowed(65536);
    }

    public abstract void writeEncodedValue(DexWriter<StringKey, StringRef, TypeKey, TypeRef, ProtoRefKey, FieldRefKey, MethodRefKey, ClassKey, CallSiteKey, MethodHandleKey, AnnotationKey, AnnotationSetKey, TypeListKey, FieldKey, MethodKey, EncodedArrayKey, EncodedValue, AnnotationElement, StringSectionType, TypeSectionType, ProtoSectionType, FieldSectionType, MethodSectionType, ClassSectionType, CallSiteSectionType, MethodHandleSectionType, TypeListSectionType, AnnotationSectionType, AnnotationSetSectionType, EncodedArraySectionType>.InternalEncodedValueWriter internalEncodedValueWriter, EncodedValue encodedvalue) throws IOException;

    public void writeTo(DexDataStore dexDataStore) throws IOException {
        writeTo(dexDataStore, MemoryDeferredOutputStream.getFactory());
    }

    public boolean hasOverflowed(int i10) {
        for (IndexSection<?> indexSection : this.overflowableSections) {
            if (indexSection.getItemCount() > i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public void writeTo(DexDataStore dexDataStore, DeferredOutputStreamFactory deferredOutputStreamFactory) throws IOException {
        try {
            int dataSectionOffset = getDataSectionOffset();
            DexDataWriter dexDataWriterOutputAt = outputAt(dexDataStore, 0);
            DexDataWriter dexDataWriterOutputAt2 = outputAt(dexDataStore, 112);
            DexDataWriter dexDataWriterOutputAt3 = outputAt(dexDataStore, dataSectionOffset);
            try {
                writeStrings(dexDataWriterOutputAt2, dexDataWriterOutputAt3);
                writeTypes(dexDataWriterOutputAt2);
                writeTypeLists(dexDataWriterOutputAt3);
                writeProtos(dexDataWriterOutputAt2);
                writeFields(dexDataWriterOutputAt2);
                writeMethods(dexDataWriterOutputAt2);
                DexDataWriter dexDataWriterOutputAt4 = outputAt(dexDataStore, (this.callSiteSection.getItemCount() * 4) + (this.classSection.getItemCount() * 32) + dexDataWriterOutputAt2.getPosition());
                try {
                    writeMethodHandles(dexDataWriterOutputAt4);
                    dexDataWriterOutputAt4.close();
                    writeEncodedArrays(dexDataWriterOutputAt3);
                    DexDataWriter dexDataWriterOutputAt5 = outputAt(dexDataStore, (this.classSection.getItemCount() * 32) + dexDataWriterOutputAt2.getPosition());
                    try {
                        writeCallSites(dexDataWriterOutputAt5);
                        dexDataWriterOutputAt5.close();
                        writeAnnotations(dexDataWriterOutputAt3);
                        writeAnnotationSets(dexDataWriterOutputAt3);
                        writeAnnotationSetRefs(dexDataWriterOutputAt3);
                        writeAnnotationDirectories(dexDataWriterOutputAt3);
                        writeDebugAndCodeItems(dexDataWriterOutputAt3, deferredOutputStreamFactory.makeDeferredOutputStream());
                        writeClasses(dexDataStore, dexDataWriterOutputAt2, dexDataWriterOutputAt3);
                        writeMapItem(dexDataWriterOutputAt3);
                        writeHeader(dexDataWriterOutputAt, dataSectionOffset, dexDataWriterOutputAt3.getPosition());
                        dexDataWriterOutputAt.close();
                        dexDataWriterOutputAt2.close();
                        dexDataWriterOutputAt3.close();
                        updateSignature(dexDataStore);
                        updateChecksum(dexDataStore);
                    } catch (Throwable th2) {
                        dexDataWriterOutputAt5.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    dexDataWriterOutputAt4.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                dexDataWriterOutputAt.close();
                dexDataWriterOutputAt2.close();
                dexDataWriterOutputAt3.close();
                throw th4;
            }
        } finally {
            dexDataStore.close();
        }
    }

    private void writeMapItem(DexDataWriter dexDataWriter, int i10, int i11, int i12) throws IOException {
        if (i11 > 0) {
            dexDataWriter.writeUshort(i10);
            dexDataWriter.writeUshort(0);
            dexDataWriter.writeInt(i11);
            dexDataWriter.writeInt(i12);
        }
    }
}
