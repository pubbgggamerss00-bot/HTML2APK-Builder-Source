package org.jf.dexlib2.dexbacked;

import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractList;
import java.util.List;
import java.util.Set;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import org.jf.dexlib2.dexbacked.raw.ItemType;
import org.jf.dexlib2.dexbacked.raw.MapItem;
import org.jf.dexlib2.dexbacked.reference.DexBackedCallSiteReference;
import org.jf.dexlib2.dexbacked.reference.DexBackedFieldReference;
import org.jf.dexlib2.dexbacked.reference.DexBackedMethodHandleReference;
import org.jf.dexlib2.dexbacked.reference.DexBackedMethodProtoReference;
import org.jf.dexlib2.dexbacked.reference.DexBackedMethodReference;
import org.jf.dexlib2.dexbacked.reference.DexBackedStringReference;
import org.jf.dexlib2.dexbacked.reference.DexBackedTypeReference;
import org.jf.dexlib2.dexbacked.util.FixedSizeList;
import org.jf.dexlib2.dexbacked.util.FixedSizeSet;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.util.DexUtil;

/* loaded from: classes3.dex */
public class DexBackedDexFile implements DexFile {
    private IndexedSection<DexBackedCallSiteReference> callSiteSection;
    private final int classCount;
    private IndexedSection<DexBackedClassDef> classSection;
    private final int classStartOffset;
    private final DexBuffer dataBuffer;
    private final DexBuffer dexBuffer;
    private final int fieldCount;
    private IndexedSection<DexBackedFieldReference> fieldSection;
    private final int fieldStartOffset;
    private final int hiddenApiRestrictionsOffset;
    private final int mapOffset;
    private final int methodCount;
    private IndexedSection<DexBackedMethodHandleReference> methodHandleSection;
    private IndexedSection<DexBackedMethodReference> methodSection;
    private final int methodStartOffset;
    private final Opcodes opcodes;
    private final int protoCount;
    private IndexedSection<DexBackedMethodProtoReference> protoSection;
    private final int protoStartOffset;
    private final int stringCount;
    private OptionalIndexedSection<String> stringSection;
    private final int stringStartOffset;
    private final int typeCount;
    private OptionalIndexedSection<String> typeSection;
    private final int typeStartOffset;

    public static abstract class IndexedSection<T> extends AbstractList<T> {
        public abstract int getOffset(int i10);
    }

    public static class NotADexFile extends RuntimeException {
        public NotADexFile() {
        }

        public NotADexFile(Throwable th2) {
            super(th2);
        }

        public NotADexFile(String str) {
            super(str);
        }

        public NotADexFile(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static abstract class OptionalIndexedSection<T> extends IndexedSection<T> {
        public abstract T getOptional(int i10);
    }

    public DexBackedDexFile(Opcodes opcodes, byte[] bArr, int i10, boolean z10) {
        this.stringSection = new OptionalIndexedSection<String>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.5
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid string index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 4) + DexBackedDexFile.this.stringStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.stringCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public String get(int i11) {
                DexReader<? extends DexBuffer> dexReader = DexBackedDexFile.this.dataBuffer.readerAt(DexBackedDexFile.this.dexBuffer.readSmallUint(getOffset(i11)));
                return dexReader.readString(dexReader.readSmallUleb128());
            }

            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.OptionalIndexedSection
            public String getOptional(int i11) {
                if (i11 == -1) {
                    return null;
                }
                return get(i11);
            }
        };
        this.typeSection = new OptionalIndexedSection<String>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.6
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid type index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 4) + DexBackedDexFile.this.typeStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.typeCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public String get(int i11) {
                return DexBackedDexFile.this.getStringSection().get(DexBackedDexFile.this.dexBuffer.readSmallUint(getOffset(i11)));
            }

            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.OptionalIndexedSection
            public String getOptional(int i11) {
                if (i11 == -1) {
                    return null;
                }
                return get(i11);
            }
        };
        this.fieldSection = new IndexedSection<DexBackedFieldReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.7
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid field index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 8) + DexBackedDexFile.this.fieldStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.fieldCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedFieldReference get(int i11) {
                return new DexBackedFieldReference(DexBackedDexFile.this, i11);
            }
        };
        this.methodSection = new IndexedSection<DexBackedMethodReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.8
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid method index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 8) + DexBackedDexFile.this.methodStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.methodCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedMethodReference get(int i11) {
                return new DexBackedMethodReference(DexBackedDexFile.this, i11);
            }
        };
        this.protoSection = new IndexedSection<DexBackedMethodProtoReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.9
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid proto index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 12) + DexBackedDexFile.this.protoStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.protoCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedMethodProtoReference get(int i11) {
                return new DexBackedMethodProtoReference(DexBackedDexFile.this, i11);
            }
        };
        this.classSection = new IndexedSection<DexBackedClassDef>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.10
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid class index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 32) + DexBackedDexFile.this.classStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.classCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedClassDef get(int i11) {
                return new DexBackedClassDef(DexBackedDexFile.this, getOffset(i11), DexBackedDexFile.this.readHiddenApiRestrictionsOffset(i11));
            }
        };
        this.callSiteSection = new IndexedSection<DexBackedCallSiteReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.11
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                MapItem mapItemForSection = DexBackedDexFile.this.getMapItemForSection(7);
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid callsite index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 4) + mapItemForSection.getOffset();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                MapItem mapItemForSection = DexBackedDexFile.this.getMapItemForSection(7);
                if (mapItemForSection == null) {
                    return 0;
                }
                return mapItemForSection.getItemCount();
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedCallSiteReference get(int i11) {
                return new DexBackedCallSiteReference(DexBackedDexFile.this, i11);
            }
        };
        this.methodHandleSection = new IndexedSection<DexBackedMethodHandleReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.12
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                MapItem mapItemForSection = DexBackedDexFile.this.getMapItemForSection(8);
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid method handle index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 8) + mapItemForSection.getOffset();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                MapItem mapItemForSection = DexBackedDexFile.this.getMapItemForSection(8);
                if (mapItemForSection == null) {
                    return 0;
                }
                return mapItemForSection.getItemCount();
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedMethodHandleReference get(int i11) {
                return new DexBackedMethodHandleReference(DexBackedDexFile.this, i11);
            }
        };
        DexBuffer dexBuffer = new DexBuffer(bArr, i10);
        this.dexBuffer = dexBuffer;
        this.dataBuffer = new DexBuffer(bArr, getBaseDataOffset() + i10);
        int version = getVersion(bArr, i10, z10);
        if (opcodes == null) {
            this.opcodes = getDefaultOpcodes(version);
        } else {
            this.opcodes = opcodes;
        }
        this.stringCount = dexBuffer.readSmallUint(56);
        this.stringStartOffset = dexBuffer.readSmallUint(60);
        this.typeCount = dexBuffer.readSmallUint(64);
        this.typeStartOffset = dexBuffer.readSmallUint(68);
        this.protoCount = dexBuffer.readSmallUint(72);
        this.protoStartOffset = dexBuffer.readSmallUint(76);
        this.fieldCount = dexBuffer.readSmallUint(80);
        this.fieldStartOffset = dexBuffer.readSmallUint(84);
        this.methodCount = dexBuffer.readSmallUint(88);
        this.methodStartOffset = dexBuffer.readSmallUint(92);
        this.classCount = dexBuffer.readSmallUint(96);
        this.classStartOffset = dexBuffer.readSmallUint(100);
        this.mapOffset = dexBuffer.readSmallUint(52);
        MapItem mapItemForSection = getMapItemForSection(ItemType.HIDDENAPI_CLASS_DATA_ITEM);
        if (mapItemForSection != null) {
            this.hiddenApiRestrictionsOffset = mapItemForSection.getOffset();
        } else {
            this.hiddenApiRestrictionsOffset = 0;
        }
    }

    public static DexBackedDexFile fromInputStream(Opcodes opcodes, InputStream inputStream) throws IOException {
        DexUtil.verifyDexHeader(inputStream);
        return new DexBackedDexFile(opcodes, oc.a.c(inputStream), 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int readHiddenApiRestrictionsOffset(int i10) {
        int i11 = this.hiddenApiRestrictionsOffset;
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.dexBuffer.readInt((i10 * 4) + i11 + 4);
        if (i12 == 0) {
            return 0;
        }
        return this.hiddenApiRestrictionsOffset + i12;
    }

    public DexBackedMethodImplementation createMethodImplementation(DexBackedDexFile dexBackedDexFile, DexBackedMethod dexBackedMethod, int i10) {
        return new DexBackedMethodImplementation(dexBackedDexFile, dexBackedMethod, i10);
    }

    public int getBaseDataOffset() {
        return 0;
    }

    public DexBuffer getBuffer() {
        return this.dexBuffer;
    }

    public IndexedSection<DexBackedCallSiteReference> getCallSiteSection() {
        return this.callSiteSection;
    }

    public IndexedSection<DexBackedClassDef> getClassSection() {
        return this.classSection;
    }

    @Override // org.jf.dexlib2.iface.DexFile
    public Set<? extends DexBackedClassDef> getClasses() {
        return new FixedSizeSet<DexBackedClassDef>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DexBackedDexFile.this.classCount;
            }

            @Override // org.jf.dexlib2.dexbacked.util.FixedSizeSet
            public DexBackedClassDef readItem(int i10) {
                return DexBackedDexFile.this.getClassSection().get(i10);
            }
        };
    }

    public DexBuffer getDataBuffer() {
        return this.dataBuffer;
    }

    public Opcodes getDefaultOpcodes(int i10) {
        return Opcodes.forDexVersion(i10);
    }

    public IndexedSection<DexBackedFieldReference> getFieldSection() {
        return this.fieldSection;
    }

    public MapItem getMapItemForSection(int i10) {
        for (MapItem mapItem : getMapItems()) {
            if (mapItem.getType() == i10) {
                return mapItem;
            }
        }
        return null;
    }

    public List<MapItem> getMapItems() {
        final int smallUint = this.dataBuffer.readSmallUint(this.mapOffset);
        return new FixedSizeList<MapItem>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.4
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return smallUint;
            }

            @Override // org.jf.dexlib2.dexbacked.util.FixedSizeList
            public MapItem readItem(int i10) {
                return new MapItem(DexBackedDexFile.this, (i10 * 12) + DexBackedDexFile.this.mapOffset + 4);
            }
        };
    }

    public IndexedSection<DexBackedMethodHandleReference> getMethodHandleSection() {
        return this.methodHandleSection;
    }

    public IndexedSection<DexBackedMethodReference> getMethodSection() {
        return this.methodSection;
    }

    @Override // org.jf.dexlib2.iface.DexFile
    public Opcodes getOpcodes() {
        return this.opcodes;
    }

    public IndexedSection<DexBackedMethodProtoReference> getProtoSection() {
        return this.protoSection;
    }

    public List<? extends Reference> getReferences(int i10) {
        if (i10 == 0) {
            return getStringReferences();
        }
        if (i10 == 1) {
            return getTypeReferences();
        }
        if (i10 == 2) {
            return getFieldSection();
        }
        if (i10 == 3) {
            return getMethodSection();
        }
        throw new IllegalArgumentException(String.format("Invalid reference type: %d", Integer.valueOf(i10)));
    }

    public List<DexBackedStringReference> getStringReferences() {
        return new AbstractList<DexBackedStringReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.getStringSection().size();
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedStringReference get(int i10) {
                if (i10 < 0 || i10 >= DexBackedDexFile.this.getStringSection().size()) {
                    throw new IndexOutOfBoundsException();
                }
                return new DexBackedStringReference(DexBackedDexFile.this, i10);
            }
        };
    }

    public OptionalIndexedSection<String> getStringSection() {
        return this.stringSection;
    }

    public List<DexBackedTypeReference> getTypeReferences() {
        return new AbstractList<DexBackedTypeReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.getTypeSection().size();
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedTypeReference get(int i10) {
                if (i10 < 0 || i10 >= DexBackedDexFile.this.getTypeSection().size()) {
                    throw new IndexOutOfBoundsException();
                }
                return new DexBackedTypeReference(DexBackedDexFile.this, i10);
            }
        };
    }

    public OptionalIndexedSection<String> getTypeSection() {
        return this.typeSection;
    }

    public int getVersion(byte[] bArr, int i10, boolean z10) {
        return z10 ? DexUtil.verifyDexHeader(bArr, i10) : HeaderItem.getVersion(bArr, i10);
    }

    public boolean supportsOptimizedOpcodes() {
        return false;
    }

    public DexBackedDexFile(Opcodes opcodes, DexBuffer dexBuffer, DexBuffer dexBuffer2, int i10, boolean z10) {
        this.stringSection = new OptionalIndexedSection<String>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.5
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid string index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 4) + DexBackedDexFile.this.stringStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.stringCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public String get(int i11) {
                DexReader<? extends DexBuffer> dexReader = DexBackedDexFile.this.dataBuffer.readerAt(DexBackedDexFile.this.dexBuffer.readSmallUint(getOffset(i11)));
                return dexReader.readString(dexReader.readSmallUleb128());
            }

            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.OptionalIndexedSection
            public String getOptional(int i11) {
                if (i11 == -1) {
                    return null;
                }
                return get(i11);
            }
        };
        this.typeSection = new OptionalIndexedSection<String>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.6
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid type index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 4) + DexBackedDexFile.this.typeStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.typeCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public String get(int i11) {
                return DexBackedDexFile.this.getStringSection().get(DexBackedDexFile.this.dexBuffer.readSmallUint(getOffset(i11)));
            }

            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.OptionalIndexedSection
            public String getOptional(int i11) {
                if (i11 == -1) {
                    return null;
                }
                return get(i11);
            }
        };
        this.fieldSection = new IndexedSection<DexBackedFieldReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.7
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid field index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 8) + DexBackedDexFile.this.fieldStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.fieldCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedFieldReference get(int i11) {
                return new DexBackedFieldReference(DexBackedDexFile.this, i11);
            }
        };
        this.methodSection = new IndexedSection<DexBackedMethodReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.8
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid method index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 8) + DexBackedDexFile.this.methodStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.methodCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedMethodReference get(int i11) {
                return new DexBackedMethodReference(DexBackedDexFile.this, i11);
            }
        };
        this.protoSection = new IndexedSection<DexBackedMethodProtoReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.9
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid proto index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 12) + DexBackedDexFile.this.protoStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.protoCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedMethodProtoReference get(int i11) {
                return new DexBackedMethodProtoReference(DexBackedDexFile.this, i11);
            }
        };
        this.classSection = new IndexedSection<DexBackedClassDef>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.10
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid class index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 32) + DexBackedDexFile.this.classStartOffset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return DexBackedDexFile.this.classCount;
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedClassDef get(int i11) {
                return new DexBackedClassDef(DexBackedDexFile.this, getOffset(i11), DexBackedDexFile.this.readHiddenApiRestrictionsOffset(i11));
            }
        };
        this.callSiteSection = new IndexedSection<DexBackedCallSiteReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.11
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                MapItem mapItemForSection = DexBackedDexFile.this.getMapItemForSection(7);
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid callsite index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 4) + mapItemForSection.getOffset();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                MapItem mapItemForSection = DexBackedDexFile.this.getMapItemForSection(7);
                if (mapItemForSection == null) {
                    return 0;
                }
                return mapItemForSection.getItemCount();
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedCallSiteReference get(int i11) {
                return new DexBackedCallSiteReference(DexBackedDexFile.this, i11);
            }
        };
        this.methodHandleSection = new IndexedSection<DexBackedMethodHandleReference>() { // from class: org.jf.dexlib2.dexbacked.DexBackedDexFile.12
            @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile.IndexedSection
            public int getOffset(int i11) {
                MapItem mapItemForSection = DexBackedDexFile.this.getMapItemForSection(8);
                if (i11 < 0 || i11 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid method handle index %d, not in [0, %d)", Integer.valueOf(i11), Integer.valueOf(size())));
                }
                return (i11 * 8) + mapItemForSection.getOffset();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                MapItem mapItemForSection = DexBackedDexFile.this.getMapItemForSection(8);
                if (mapItemForSection == null) {
                    return 0;
                }
                return mapItemForSection.getItemCount();
            }

            @Override // java.util.AbstractList, java.util.List
            public DexBackedMethodHandleReference get(int i11) {
                return new DexBackedMethodHandleReference(DexBackedDexFile.this, i11);
            }
        };
        this.dexBuffer = dexBuffer;
        this.dataBuffer = dexBuffer2;
        int version = getVersion(dexBuffer.readByteRange(i10, 112), i10, z10);
        if (opcodes == null) {
            this.opcodes = getDefaultOpcodes(version);
        } else {
            this.opcodes = opcodes;
        }
        this.stringCount = dexBuffer.readSmallUint(56);
        this.stringStartOffset = dexBuffer.readSmallUint(60);
        this.typeCount = dexBuffer.readSmallUint(64);
        this.typeStartOffset = dexBuffer.readSmallUint(68);
        this.protoCount = dexBuffer.readSmallUint(72);
        this.protoStartOffset = dexBuffer.readSmallUint(76);
        this.fieldCount = dexBuffer.readSmallUint(80);
        this.fieldStartOffset = dexBuffer.readSmallUint(84);
        this.methodCount = dexBuffer.readSmallUint(88);
        this.methodStartOffset = dexBuffer.readSmallUint(92);
        this.classCount = dexBuffer.readSmallUint(96);
        this.classStartOffset = dexBuffer.readSmallUint(100);
        this.mapOffset = dexBuffer.readSmallUint(52);
        MapItem mapItemForSection = getMapItemForSection(ItemType.HIDDENAPI_CLASS_DATA_ITEM);
        if (mapItemForSection != null) {
            this.hiddenApiRestrictionsOffset = mapItemForSection.getOffset();
        } else {
            this.hiddenApiRestrictionsOffset = 0;
        }
    }

    public DexBackedDexFile(Opcodes opcodes, DexBuffer dexBuffer) {
        this(opcodes, dexBuffer.buf, dexBuffer.baseOffset);
    }

    public DexBackedDexFile(Opcodes opcodes, byte[] bArr, int i10) {
        this(opcodes, bArr, i10, false);
    }

    public DexBackedDexFile(Opcodes opcodes, byte[] bArr) {
        this(opcodes, bArr, 0, true);
    }
}
