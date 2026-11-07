package org.jf.dexlib2.dexbacked;

import i0.u2;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nc.r;
import nc.u0;
import nc.v;
import nc.w0;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.dexbacked.util.AnnotationsDirectory;
import org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator;
import org.jf.dexlib2.dexbacked.util.VariableSizeListIterator;
import org.jf.dexlib2.dexbacked.util.VariableSizeLookaheadIterator;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.immutable.reference.ImmutableFieldReference;
import org.jf.dexlib2.immutable.reference.ImmutableMethodReference;

/* loaded from: classes3.dex */
public class DexBackedClassDef extends BaseTypeReference implements ClassDef {
    static final int NO_HIDDEN_API_RESTRICTIONS = 7;
    private AnnotationsDirectory annotationsDirectory;
    private final int classDefOffset;
    public final DexBackedDexFile dexFile;
    private final int directMethodCount;
    private final HiddenApiRestrictionsReader hiddenApiRestrictionsReader;
    private final int instanceFieldCount;
    private final int staticFieldCount;
    private final int staticFieldsOffset;
    private final int virtualMethodCount;
    private int instanceFieldsOffset = 0;
    private int directMethodsOffset = 0;
    private int virtualMethodsOffset = 0;

    /* renamed from: org.jf.dexlib2.dexbacked.DexBackedClassDef$5, reason: invalid class name */
    public class AnonymousClass5 implements Iterable<DexBackedMethod> {
        final AnnotationsDirectory.AnnotationIterator methodAnnotationIterator;
        final AnnotationsDirectory.AnnotationIterator parameterAnnotationIterator;
        final /* synthetic */ AnnotationsDirectory val$annotationsDirectory;
        final /* synthetic */ Iterator val$hiddenApiRestrictionIterator;
        final /* synthetic */ int val$methodsStartOffset;
        final /* synthetic */ boolean val$skipDuplicates;

        public AnonymousClass5(AnnotationsDirectory annotationsDirectory, int i10, Iterator it, boolean z10) {
            this.val$annotationsDirectory = annotationsDirectory;
            this.val$methodsStartOffset = i10;
            this.val$hiddenApiRestrictionIterator = it;
            this.val$skipDuplicates = z10;
            this.methodAnnotationIterator = annotationsDirectory.getMethodAnnotationIterator();
            this.parameterAnnotationIterator = annotationsDirectory.getParameterAnnotationIterator();
        }

        @Override // java.lang.Iterable
        public Iterator<DexBackedMethod> iterator() {
            return new VariableSizeLookaheadIterator<DexBackedMethod>(DexBackedClassDef.this.dexFile.getDataBuffer(), this.val$methodsStartOffset) { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.5.1
                private int count;
                private int previousIndex;
                private MethodReference previousMethod;

                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeLookaheadIterator
                public DexBackedMethod readNextItem(DexReader dexReader) {
                    DexBackedMethod dexBackedMethod;
                    while (true) {
                        int i10 = this.count + 1;
                        this.count = i10;
                        if (i10 > DexBackedClassDef.this.virtualMethodCount) {
                            return endOfData();
                        }
                        Iterator it = AnonymousClass5.this.val$hiddenApiRestrictionIterator;
                        int iIntValue = it != null ? ((Integer) it.next()).intValue() : 7;
                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                        DexBackedClassDef dexBackedClassDef = DexBackedClassDef.this;
                        DexReader dexReader2 = dexReader;
                        dexBackedMethod = new DexBackedMethod(dexBackedClassDef.dexFile, dexReader2, dexBackedClassDef, this.previousIndex, anonymousClass5.methodAnnotationIterator, anonymousClass5.parameterAnnotationIterator, iIntValue);
                        MethodReference methodReference = this.previousMethod;
                        ImmutableMethodReference immutableMethodReferenceOf = ImmutableMethodReference.of(dexBackedMethod);
                        this.previousMethod = immutableMethodReferenceOf;
                        this.previousIndex = dexBackedMethod.methodIndex;
                        if (!AnonymousClass5.this.val$skipDuplicates || methodReference == null || !methodReference.equals(immutableMethodReferenceOf)) {
                            break;
                        }
                        dexReader = dexReader2;
                    }
                    return dexBackedMethod;
                }
            };
        }
    }

    public class HiddenApiRestrictionsReader {
        private int directMethodsStartOffset;
        private int instanceFieldsStartOffset;
        private final int startOffset;
        private int virtualMethodsStartOffset;

        public HiddenApiRestrictionsReader(int i10) {
            this.startOffset = i10;
        }

        private int getDirectMethodsStartOffset() {
            if (this.directMethodsStartOffset == 0) {
                DexReader<? extends DexBuffer> dexReader = DexBackedClassDef.this.dexFile.getDataBuffer().readerAt(getInstanceFieldsStartOffset());
                for (int i10 = 0; i10 < DexBackedClassDef.this.instanceFieldCount; i10++) {
                    dexReader.readSmallUleb128();
                }
                this.directMethodsStartOffset = dexReader.getOffset();
            }
            return this.directMethodsStartOffset;
        }

        private int getInstanceFieldsStartOffset() {
            if (this.instanceFieldsStartOffset == 0) {
                DexReader<? extends DexBuffer> dexReader = DexBackedClassDef.this.dexFile.getDataBuffer().readerAt(this.startOffset);
                for (int i10 = 0; i10 < DexBackedClassDef.this.staticFieldCount; i10++) {
                    dexReader.readSmallUleb128();
                }
                this.instanceFieldsStartOffset = dexReader.getOffset();
            }
            return this.instanceFieldsStartOffset;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Iterator<Integer> getRestrictionsForDirectMethods() {
            return new VariableSizeListIterator<Integer>(DexBackedClassDef.this.dexFile.getDataBuffer(), getDirectMethodsStartOffset(), DexBackedClassDef.this.directMethodCount) { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.HiddenApiRestrictionsReader.3
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
                public /* bridge */ /* synthetic */ Integer readNextItem(DexReader dexReader, int i10) {
                    return readNextItem((DexReader<? extends DexBuffer>) dexReader, i10);
                }

                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator, java.util.ListIterator, java.util.Iterator
                public Integer next() {
                    if (nextIndex() == DexBackedClassDef.this.directMethodCount) {
                        HiddenApiRestrictionsReader.this.virtualMethodsStartOffset = getReaderOffset();
                    }
                    return (Integer) super.next();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
                public Integer readNextItem(DexReader<? extends DexBuffer> dexReader, int i10) {
                    return Integer.valueOf(dexReader.readSmallUleb128());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Iterator<Integer> getRestrictionsForInstanceFields() {
            return new VariableSizeListIterator<Integer>(DexBackedClassDef.this.dexFile.getDataBuffer(), getInstanceFieldsStartOffset(), DexBackedClassDef.this.instanceFieldCount) { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.HiddenApiRestrictionsReader.2
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
                public /* bridge */ /* synthetic */ Integer readNextItem(DexReader dexReader, int i10) {
                    return readNextItem((DexReader<? extends DexBuffer>) dexReader, i10);
                }

                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator, java.util.ListIterator, java.util.Iterator
                public Integer next() {
                    if (nextIndex() == DexBackedClassDef.this.instanceFieldCount) {
                        HiddenApiRestrictionsReader.this.directMethodsStartOffset = getReaderOffset();
                    }
                    return (Integer) super.next();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
                public Integer readNextItem(DexReader<? extends DexBuffer> dexReader, int i10) {
                    return Integer.valueOf(dexReader.readSmallUleb128());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public VariableSizeListIterator<Integer> getRestrictionsForStaticFields() {
            return new VariableSizeListIterator<Integer>(DexBackedClassDef.this.dexFile.getDataBuffer(), this.startOffset, DexBackedClassDef.this.staticFieldCount) { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.HiddenApiRestrictionsReader.1
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
                public /* bridge */ /* synthetic */ Integer readNextItem(DexReader dexReader, int i10) {
                    return readNextItem((DexReader<? extends DexBuffer>) dexReader, i10);
                }

                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator, java.util.ListIterator, java.util.Iterator
                public Integer next() {
                    if (nextIndex() == DexBackedClassDef.this.staticFieldCount) {
                        HiddenApiRestrictionsReader.this.instanceFieldsStartOffset = getReaderOffset();
                    }
                    return (Integer) super.next();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
                public Integer readNextItem(DexReader<? extends DexBuffer> dexReader, int i10) {
                    return Integer.valueOf(dexReader.readSmallUleb128());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Iterator<Integer> getRestrictionsForVirtualMethods() {
            return new VariableSizeListIterator<Integer>(DexBackedClassDef.this.dexFile.getDataBuffer(), getVirtualMethodsStartOffset(), DexBackedClassDef.this.virtualMethodCount) { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.HiddenApiRestrictionsReader.4
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
                public /* bridge */ /* synthetic */ Integer readNextItem(DexReader dexReader, int i10) {
                    return readNextItem((DexReader<? extends DexBuffer>) dexReader, i10);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
                public Integer readNextItem(DexReader<? extends DexBuffer> dexReader, int i10) {
                    return Integer.valueOf(dexReader.readSmallUleb128());
                }
            };
        }

        private int getVirtualMethodsStartOffset() {
            if (this.virtualMethodsStartOffset == 0) {
                DexReader<? extends DexBuffer> dexReader = DexBackedClassDef.this.dexFile.getDataBuffer().readerAt(getDirectMethodsStartOffset());
                for (int i10 = 0; i10 < DexBackedClassDef.this.directMethodCount; i10++) {
                    dexReader.readSmallUleb128();
                }
                this.virtualMethodsStartOffset = dexReader.getOffset();
            }
            return this.virtualMethodsStartOffset;
        }
    }

    public DexBackedClassDef(DexBackedDexFile dexBackedDexFile, int i10, int i11) {
        this.dexFile = dexBackedDexFile;
        this.classDefOffset = i10;
        int smallUint = dexBackedDexFile.getBuffer().readSmallUint(i10 + 24);
        if (smallUint == 0) {
            this.staticFieldsOffset = -1;
            this.staticFieldCount = 0;
            this.instanceFieldCount = 0;
            this.directMethodCount = 0;
            this.virtualMethodCount = 0;
        } else {
            DexReader<? extends DexBuffer> dexReader = dexBackedDexFile.getDataBuffer().readerAt(smallUint);
            this.staticFieldCount = dexReader.readSmallUleb128();
            this.instanceFieldCount = dexReader.readSmallUleb128();
            this.directMethodCount = dexReader.readSmallUleb128();
            this.virtualMethodCount = dexReader.readSmallUleb128();
            this.staticFieldsOffset = dexReader.getOffset();
        }
        if (i11 != 0) {
            this.hiddenApiRestrictionsReader = new HiddenApiRestrictionsReader(i11);
        } else {
            this.hiddenApiRestrictionsReader = null;
        }
    }

    private AnnotationsDirectory getAnnotationsDirectory() {
        if (this.annotationsDirectory == null) {
            this.annotationsDirectory = AnnotationsDirectory.newOrEmpty(this.dexFile, this.dexFile.getBuffer().readSmallUint(this.classDefOffset + 20));
        }
        return this.annotationsDirectory;
    }

    private int getDirectMethodsOffset() {
        int i10 = this.directMethodsOffset;
        if (i10 > 0) {
            return i10;
        }
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(getInstanceFieldsOffset());
        DexBackedField.skipFields(dexReader, this.instanceFieldCount);
        int offset = dexReader.getOffset();
        this.directMethodsOffset = offset;
        return offset;
    }

    private int getInstanceFieldsOffset() {
        int i10 = this.instanceFieldsOffset;
        if (i10 > 0) {
            return i10;
        }
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(this.staticFieldsOffset);
        DexBackedField.skipFields(dexReader, this.staticFieldCount);
        int offset = dexReader.getOffset();
        this.instanceFieldsOffset = offset;
        return offset;
    }

    private int getVirtualMethodsOffset() {
        int i10 = this.virtualMethodsOffset;
        if (i10 > 0) {
            return i10;
        }
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(getDirectMethodsOffset());
        DexBackedMethod.skipMethods(dexReader, this.directMethodCount);
        int offset = dexReader.getOffset();
        this.virtualMethodsOffset = offset;
        return offset;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public int getAccessFlags() {
        return this.dexFile.getBuffer().readSmallUint(this.classDefOffset + 4);
    }

    @Override // org.jf.dexlib2.iface.ClassDef, org.jf.dexlib2.iface.Annotatable
    public Set<? extends DexBackedAnnotation> getAnnotations() {
        return getAnnotationsDirectory().getClassAnnotations();
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends DexBackedMethod> getDirectMethods() {
        return getDirectMethods(true);
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends DexBackedField> getFields() {
        return u2.d(getStaticFields(), getInstanceFields());
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends DexBackedField> getInstanceFields() {
        return getInstanceFields(true);
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public List<String> getInterfaces() {
        final int smallUint = this.dexFile.getBuffer().readSmallUint(this.classDefOffset + 12);
        if (smallUint > 0) {
            final int smallUint2 = this.dexFile.getDataBuffer().readSmallUint(smallUint);
            return new AbstractList<String>() { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.1
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return smallUint2;
                }

                @Override // java.util.AbstractList, java.util.List
                public String get(int i10) {
                    return DexBackedClassDef.this.dexFile.getTypeSection().get(DexBackedClassDef.this.dexFile.getDataBuffer().readUshort((i10 * 2) + smallUint + 4));
                }
            };
        }
        r.a aVar = r.f18735b;
        return u0.f18756e;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends DexBackedMethod> getMethods() {
        return u2.d(getDirectMethods(), getVirtualMethods());
    }

    public int getSize() {
        int size = getInterfaces().size();
        int size2 = size > 0 ? (size * 2) + 40 : 36;
        AnnotationsDirectory annotationsDirectory = getAnnotationsDirectory();
        if (!AnnotationsDirectory.EMPTY.equals(annotationsDirectory)) {
            int i10 = size2 + 16;
            Set<? extends DexBackedAnnotation> classAnnotations = annotationsDirectory.getClassAnnotations();
            size2 = !classAnnotations.isEmpty() ? size2 + 20 + (classAnnotations.size() * 4) : i10;
        }
        int smallUint = this.dexFile.getBuffer().readSmallUint(this.classDefOffset + 28);
        if (smallUint != 0) {
            size2 += this.dexFile.getDataBuffer().readerAt(smallUint).peekSmallUleb128Size();
        }
        int smallUint2 = this.dexFile.getBuffer().readSmallUint(this.classDefOffset + 24);
        if (smallUint2 > 0) {
            DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(smallUint2);
            dexReader.readSmallUleb128();
            dexReader.readSmallUleb128();
            dexReader.readSmallUleb128();
            dexReader.readSmallUleb128();
            size2 += dexReader.getOffset() - smallUint2;
        }
        Iterator<? extends DexBackedField> it = getFields().iterator();
        while (it.hasNext()) {
            size2 += it.next().getSize();
        }
        Iterator<? extends DexBackedMethod> it2 = getMethods().iterator();
        while (it2.hasNext()) {
            size2 += it2.next().getSize();
        }
        return size2;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSourceFile() {
        return this.dexFile.getStringSection().getOptional(this.dexFile.getBuffer().readOptionalUint(this.classDefOffset + 16));
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends DexBackedField> getStaticFields() {
        return getStaticFields(true);
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSuperclass() {
        return this.dexFile.getTypeSection().getOptional(this.dexFile.getBuffer().readOptionalUint(this.classDefOffset + 8));
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readSmallUint(this.classDefOffset));
    }

    public Iterable<? extends DexBackedMethod> getVirtualMethods(boolean z10) {
        if (this.virtualMethodCount <= 0) {
            int i10 = v.f18759c;
            return w0.f18781j;
        }
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(getVirtualMethodsOffset());
        AnnotationsDirectory annotationsDirectory = getAnnotationsDirectory();
        int offset = dexReader.getOffset();
        HiddenApiRestrictionsReader hiddenApiRestrictionsReader = this.hiddenApiRestrictionsReader;
        return new AnonymousClass5(annotationsDirectory, offset, hiddenApiRestrictionsReader == null ? null : hiddenApiRestrictionsReader.getRestrictionsForVirtualMethods(), z10);
    }

    public Iterable<? extends DexBackedMethod> getDirectMethods(final boolean z10) {
        if (this.directMethodCount <= 0) {
            int i10 = this.directMethodsOffset;
            if (i10 > 0) {
                this.virtualMethodsOffset = i10;
            }
            int i11 = v.f18759c;
            return w0.f18781j;
        }
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(getDirectMethodsOffset());
        final AnnotationsDirectory annotationsDirectory = getAnnotationsDirectory();
        final int offset = dexReader.getOffset();
        HiddenApiRestrictionsReader hiddenApiRestrictionsReader = this.hiddenApiRestrictionsReader;
        final Iterator restrictionsForDirectMethods = hiddenApiRestrictionsReader == null ? null : hiddenApiRestrictionsReader.getRestrictionsForDirectMethods();
        return new Iterable<DexBackedMethod>() { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.4
            @Override // java.lang.Iterable
            public Iterator<DexBackedMethod> iterator() {
                final AnnotationsDirectory.AnnotationIterator methodAnnotationIterator = annotationsDirectory.getMethodAnnotationIterator();
                final AnnotationsDirectory.AnnotationIterator parameterAnnotationIterator = annotationsDirectory.getParameterAnnotationIterator();
                return new VariableSizeLookaheadIterator<DexBackedMethod>(DexBackedClassDef.this.dexFile.getDataBuffer(), offset) { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.4.1
                    private int count;
                    private int previousIndex;
                    private MethodReference previousMethod;

                    @Override // org.jf.dexlib2.dexbacked.util.VariableSizeLookaheadIterator
                    public DexBackedMethod readNextItem(DexReader dexReader2) {
                        DexBackedMethod dexBackedMethod;
                        while (true) {
                            int i12 = this.count + 1;
                            this.count = i12;
                            if (i12 > DexBackedClassDef.this.directMethodCount) {
                                DexBackedClassDef.this.virtualMethodsOffset = dexReader2.getOffset();
                                return endOfData();
                            }
                            Iterator it = restrictionsForDirectMethods;
                            int iIntValue = it != null ? ((Integer) it.next()).intValue() : 7;
                            DexBackedClassDef dexBackedClassDef = DexBackedClassDef.this;
                            DexReader dexReader3 = dexReader2;
                            dexBackedMethod = new DexBackedMethod(dexBackedClassDef.dexFile, dexReader3, dexBackedClassDef, this.previousIndex, methodAnnotationIterator, parameterAnnotationIterator, iIntValue);
                            MethodReference methodReference = this.previousMethod;
                            ImmutableMethodReference immutableMethodReferenceOf = ImmutableMethodReference.of(dexBackedMethod);
                            this.previousMethod = immutableMethodReferenceOf;
                            this.previousIndex = dexBackedMethod.methodIndex;
                            if (!z10 || methodReference == null || !methodReference.equals(immutableMethodReferenceOf)) {
                                break;
                            }
                            dexReader2 = dexReader3;
                        }
                        return dexBackedMethod;
                    }
                };
            }
        };
    }

    public Iterable<? extends DexBackedField> getInstanceFields(final boolean z10) {
        if (this.instanceFieldCount <= 0) {
            int i10 = this.instanceFieldsOffset;
            if (i10 > 0) {
                this.directMethodsOffset = i10;
            }
            int i11 = v.f18759c;
            return w0.f18781j;
        }
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(getInstanceFieldsOffset());
        final AnnotationsDirectory annotationsDirectory = getAnnotationsDirectory();
        final int offset = dexReader.getOffset();
        HiddenApiRestrictionsReader hiddenApiRestrictionsReader = this.hiddenApiRestrictionsReader;
        final Iterator restrictionsForInstanceFields = hiddenApiRestrictionsReader == null ? null : hiddenApiRestrictionsReader.getRestrictionsForInstanceFields();
        return new Iterable<DexBackedField>() { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.3
            @Override // java.lang.Iterable
            public Iterator<DexBackedField> iterator() {
                final AnnotationsDirectory.AnnotationIterator fieldAnnotationIterator = annotationsDirectory.getFieldAnnotationIterator();
                return new VariableSizeLookaheadIterator<DexBackedField>(DexBackedClassDef.this.dexFile.getDataBuffer(), offset) { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.3.1
                    private int count;
                    private FieldReference previousField;
                    private int previousIndex;

                    @Override // org.jf.dexlib2.dexbacked.util.VariableSizeLookaheadIterator
                    public DexBackedField readNextItem(DexReader dexReader2) {
                        DexBackedField dexBackedField;
                        while (true) {
                            int i12 = this.count + 1;
                            this.count = i12;
                            if (i12 > DexBackedClassDef.this.instanceFieldCount) {
                                DexBackedClassDef.this.directMethodsOffset = dexReader2.getOffset();
                                return endOfData();
                            }
                            Iterator it = restrictionsForInstanceFields;
                            int iIntValue = it != null ? ((Integer) it.next()).intValue() : 7;
                            DexBackedClassDef dexBackedClassDef = DexBackedClassDef.this;
                            DexReader dexReader3 = dexReader2;
                            dexBackedField = new DexBackedField(dexBackedClassDef.dexFile, dexReader3, dexBackedClassDef, this.previousIndex, fieldAnnotationIterator, iIntValue);
                            FieldReference fieldReference = this.previousField;
                            ImmutableFieldReference immutableFieldReferenceOf = ImmutableFieldReference.of(dexBackedField);
                            this.previousField = immutableFieldReferenceOf;
                            this.previousIndex = dexBackedField.fieldIndex;
                            if (!z10 || fieldReference == null || !fieldReference.equals(immutableFieldReferenceOf)) {
                                break;
                            }
                            dexReader2 = dexReader3;
                        }
                        return dexBackedField;
                    }
                };
            }
        };
    }

    public Iterable<? extends DexBackedField> getStaticFields(final boolean z10) {
        if (this.staticFieldCount <= 0) {
            this.instanceFieldsOffset = this.staticFieldsOffset;
            int i10 = v.f18759c;
            return w0.f18781j;
        }
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(this.staticFieldsOffset);
        final AnnotationsDirectory annotationsDirectory = getAnnotationsDirectory();
        final int smallUint = this.dexFile.getBuffer().readSmallUint(this.classDefOffset + 28);
        final int offset = dexReader.getOffset();
        HiddenApiRestrictionsReader hiddenApiRestrictionsReader = this.hiddenApiRestrictionsReader;
        final VariableSizeListIterator restrictionsForStaticFields = hiddenApiRestrictionsReader == null ? null : hiddenApiRestrictionsReader.getRestrictionsForStaticFields();
        return new Iterable<DexBackedField>() { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.2
            @Override // java.lang.Iterable
            public Iterator<DexBackedField> iterator() {
                final AnnotationsDirectory.AnnotationIterator fieldAnnotationIterator = annotationsDirectory.getFieldAnnotationIterator();
                final EncodedArrayItemIterator encodedArrayItemIteratorNewOrEmpty = EncodedArrayItemIterator.newOrEmpty(DexBackedClassDef.this.dexFile, smallUint);
                return new VariableSizeLookaheadIterator<DexBackedField>(DexBackedClassDef.this.dexFile.getDataBuffer(), offset) { // from class: org.jf.dexlib2.dexbacked.DexBackedClassDef.2.1
                    private int count;
                    private FieldReference previousField;
                    private int previousIndex;

                    @Override // org.jf.dexlib2.dexbacked.util.VariableSizeLookaheadIterator
                    public DexBackedField readNextItem(DexReader dexReader2) {
                        DexBackedField dexBackedField;
                        while (true) {
                            int i11 = this.count + 1;
                            this.count = i11;
                            if (i11 > DexBackedClassDef.this.staticFieldCount) {
                                DexBackedClassDef.this.instanceFieldsOffset = dexReader2.getOffset();
                                return endOfData();
                            }
                            Iterator it = restrictionsForStaticFields;
                            int iIntValue = it != null ? ((Integer) it.next()).intValue() : 7;
                            DexBackedClassDef dexBackedClassDef = DexBackedClassDef.this;
                            DexReader dexReader3 = dexReader2;
                            dexBackedField = new DexBackedField(dexBackedClassDef.dexFile, dexReader3, dexBackedClassDef, this.previousIndex, encodedArrayItemIteratorNewOrEmpty, fieldAnnotationIterator, iIntValue);
                            FieldReference fieldReference = this.previousField;
                            ImmutableFieldReference immutableFieldReferenceOf = ImmutableFieldReference.of(dexBackedField);
                            this.previousField = immutableFieldReferenceOf;
                            this.previousIndex = dexBackedField.fieldIndex;
                            if (!z10 || fieldReference == null || !fieldReference.equals(immutableFieldReferenceOf)) {
                                break;
                            }
                            dexReader2 = dexReader3;
                        }
                        return dexBackedField;
                    }
                };
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends DexBackedMethod> getVirtualMethods() {
        return getVirtualMethods(true);
    }
}
