package org.jf.dexlib2.dexbacked;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.e;
import nc.g0;
import nc.j0;
import nc.r;
import nc.u0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.MultiDexContainer;
import org.jf.dexlib2.util.DexUtil;
import org.jf.util.AbstractForwardSequentialList;

/* loaded from: classes3.dex */
public class OatFile extends DexBuffer implements MultiDexContainer<DexBackedDexFile> {
    private static final int MAX_OAT_VERSION = 178;
    private static final int MIN_ELF_HEADER_SIZE = 52;
    private static final int MIN_OAT_VERSION = 56;
    public static final int SUPPORTED = 1;
    public static final int UNKNOWN = 2;
    public static final int UNSUPPORTED = 0;
    private final boolean is64bit;
    private final OatHeader oatHeader;
    private final Opcodes opcodes;
    private final VdexProvider vdexProvider;
    private static final byte[] ELF_MAGIC = {Byte.MAX_VALUE, 69, 76, 70};
    private static final byte[] OAT_MAGIC = {111, 97, 116, 10};

    public class DexEntryIterator implements Iterator<OatDexEntry> {
        int index;
        int offset;

        private DexEntryIterator() {
            this.index = 0;
            this.offset = OatFile.this.oatHeader.getDexListStart();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < OatFile.this.oatHeader.getDexFileCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public OatDexEntry next() {
            byte[] vdex;
            while (hasNext()) {
                int smallUint = OatFile.this.readSmallUint(this.offset);
                int i10 = this.offset + 4;
                this.offset = i10;
                String str = new String(OatFile.this.buf, i10, smallUint, Charset.forName("US-ASCII"));
                int i11 = this.offset + smallUint + 4;
                this.offset = i11;
                int smallUint2 = OatFile.this.readSmallUint(i11);
                this.offset += 4;
                if (OatFile.this.getOatVersion() < 87 || OatFile.this.vdexProvider == null || OatFile.this.vdexProvider.getVdex() == null) {
                    OatFile oatFile = OatFile.this;
                    byte[] bArr = oatFile.buf;
                    smallUint2 += oatFile.oatHeader.headerOffset;
                    vdex = bArr;
                } else {
                    vdex = OatFile.this.vdexProvider.getVdex();
                }
                if (OatFile.this.getOatVersion() >= 75) {
                    this.offset += 4;
                }
                if (OatFile.this.getOatVersion() >= 73) {
                    this.offset += 4;
                }
                if (OatFile.this.getOatVersion() >= 131) {
                    this.offset += 4;
                }
                if (OatFile.this.getOatVersion() >= 127) {
                    this.offset += 4;
                }
                if (OatFile.this.getOatVersion() >= 135) {
                    this.offset += 8;
                }
                if (OatFile.this.getOatVersion() < 75) {
                    this.offset = (OatFile.this.readSmallUint(smallUint2 + 96) * 4) + this.offset;
                }
                this.index++;
                if (OatFile.this.getOatVersion() < 138 || smallUint2 != 0) {
                    return OatFile.this.new OatDexEntry(str, vdex, smallUint2);
                }
            }
            return null;
        }
    }

    public static class InvalidOatFileException extends RuntimeException {
        public InvalidOatFileException(String str) {
            super(str);
        }
    }

    public static class NotAnOatFileException extends RuntimeException {
    }

    public class OatCDexFile extends CDexBackedDexFile {
        public OatCDexFile(byte[] bArr, int i10) {
            super(OatFile.this.opcodes, bArr, i10);
        }

        @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile
        public boolean supportsOptimizedOpcodes() {
            return true;
        }
    }

    public class OatDexEntry implements MultiDexContainer.DexEntry<DexBackedDexFile> {
        public final byte[] buf;
        public final int dexOffset;
        public final String entryName;

        public OatDexEntry(String str, byte[] bArr, int i10) {
            this.entryName = str;
            this.buf = bArr;
            this.dexOffset = i10;
        }

        @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
        public MultiDexContainer<? extends DexBackedDexFile> getContainer() {
            return OatFile.this;
        }

        @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
        public String getEntryName() {
            return this.entryName;
        }

        @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
        public DexBackedDexFile getDexFile() {
            if (CDexBackedDexFile.isCdex(this.buf, this.dexOffset)) {
                return OatFile.this.new OatCDexFile(this.buf, this.dexOffset);
            }
            try {
                DexUtil.verifyDexHeader(this.buf, this.dexOffset);
                return OatFile.this.new OatDexFile(this.buf, this.dexOffset);
            } catch (DexBackedDexFile.NotADexFile e10) {
                if (OatFile.this.getOatVersion() >= 87) {
                    throw new DexFileFactory.DexFileNotFoundException(e10, "Could not locate the embedded dex file %s. Is the vdex file missing?", this.entryName);
                }
                throw new DexFileFactory.DexFileNotFoundException(e10, "The embedded dex file %s does not appear to be a valid dex file.", this.entryName);
            }
        }
    }

    public class OatDexFile extends DexBackedDexFile {
        public OatDexFile(byte[] bArr, int i10) {
            super(OatFile.this.opcodes, bArr, i10);
        }

        @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile
        public boolean supportsOptimizedOpcodes() {
            return true;
        }
    }

    public class OatHeader {
        private final int headerOffset;
        private final int keyValueStoreOffset;

        public OatHeader(int i10) {
            this.headerOffset = i10;
            if (getVersion() >= 170) {
                this.keyValueStoreOffset = 56;
                return;
            }
            if (getVersion() >= 166) {
                this.keyValueStoreOffset = 64;
                return;
            }
            if (getVersion() >= 162) {
                this.keyValueStoreOffset = 68;
            } else if (getVersion() >= 127) {
                this.keyValueStoreOffset = 76;
            } else {
                this.keyValueStoreOffset = 72;
            }
        }

        public int getDexFileCount() {
            return OatFile.this.readSmallUint(this.headerOffset + 20);
        }

        public int getDexListStart() {
            if (getVersion() < 127) {
                return this.headerOffset + getHeaderSize();
            }
            int i10 = this.headerOffset;
            return OatFile.this.readSmallUint(i10 + 24) + i10;
        }

        public int getHeaderSize() {
            if (getVersion() >= 56) {
                return this.keyValueStoreOffset + getKeyValueStoreSize();
            }
            throw new IllegalStateException("Unsupported oat version");
        }

        public String getKeyValue(String str) {
            int keyValueStoreSize = getKeyValueStoreSize();
            int i10 = this.headerOffset + this.keyValueStoreOffset;
            int i11 = keyValueStoreSize + i10;
            while (i10 < i11) {
                int i12 = i10;
                while (i12 < i11 && OatFile.this.buf[i12] != 0) {
                    i12++;
                }
                if (i12 >= i11) {
                    throw new InvalidOatFileException("Oat file contains truncated key value store");
                }
                if (new String(OatFile.this.buf, i10, i12 - i10).equals(str)) {
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (i14 < i11 && OatFile.this.buf[i14] != 0) {
                        i14++;
                    }
                    if (i14 < i11) {
                        return new String(OatFile.this.buf, i13, i14 - i13);
                    }
                    throw new InvalidOatFileException("Oat file contains truncated key value store");
                }
                i10 = i12 + 1;
            }
            return null;
        }

        public int getKeyValueStoreSize() {
            if (getVersion() < 56) {
                throw new IllegalStateException("Unsupported oat version");
            }
            return OatFile.this.readSmallUint(this.headerOffset + (this.keyValueStoreOffset - 4));
        }

        public int getVersion() {
            return Integer.valueOf(new String(OatFile.this.buf, this.headerOffset + 4, 3)).intValue();
        }

        public boolean isValid() {
            for (int i10 = 0; i10 < OatFile.OAT_MAGIC.length; i10++) {
                if (OatFile.this.buf[this.headerOffset + i10] != OatFile.OAT_MAGIC[i10]) {
                    return false;
                }
            }
            for (int i11 = 4; i11 < 7; i11++) {
                byte[] bArr = OatFile.this.buf;
                int i12 = this.headerOffset;
                if (bArr[i12 + i11] < 48 || bArr[i12 + i11] > 57) {
                    return false;
                }
            }
            return OatFile.this.buf[this.headerOffset + 7] == 0;
        }
    }

    public abstract class SectionHeader {
        public static final int TYPE_DYNAMIC_SYMBOL_TABLE = 11;
        protected final int offset;

        public SectionHeader(int i10) {
            this.offset = i10;
        }

        public abstract long getAddress();

        public abstract int getEntrySize();

        public abstract int getLink();

        public String getName() {
            return OatFile.this.getSectionNameStringTable().getString(OatFile.this.readSmallUint(this.offset));
        }

        public abstract int getOffset();

        public abstract int getSize();

        public int getType() {
            return OatFile.this.readInt(this.offset + 4);
        }
    }

    public class SectionHeader32Bit extends SectionHeader {
        public SectionHeader32Bit(int i10) {
            super(i10);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public long getAddress() {
            return OatFile.this.readInt(this.offset + 12) & BodyPartID.bodyIdMax;
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public int getEntrySize() {
            return OatFile.this.readSmallUint(this.offset + 36);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public int getLink() {
            return OatFile.this.readSmallUint(this.offset + 24);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public int getOffset() {
            return OatFile.this.readSmallUint(this.offset + 16);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public int getSize() {
            return OatFile.this.readSmallUint(this.offset + 20);
        }
    }

    public class SectionHeader64Bit extends SectionHeader {
        public SectionHeader64Bit(int i10) {
            super(i10);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public long getAddress() {
            return OatFile.this.readLong(this.offset + 16);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public int getEntrySize() {
            return OatFile.this.readLongAsSmallUint(this.offset + 56);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public int getLink() {
            return OatFile.this.readSmallUint(this.offset + 40);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public int getOffset() {
            return OatFile.this.readLongAsSmallUint(this.offset + 24);
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.SectionHeader
        public int getSize() {
            return OatFile.this.readLongAsSmallUint(this.offset + 32);
        }
    }

    public class StringTable {
        private final int offset;
        private final int size;

        public StringTable(SectionHeader sectionHeader) {
            int offset = sectionHeader.getOffset();
            this.offset = offset;
            int size = sectionHeader.getSize();
            this.size = size;
            if (offset + size > OatFile.this.buf.length) {
                throw new InvalidOatFileException("String table extends past end of file");
            }
        }

        public String getString(int i10) {
            if (i10 >= this.size) {
                throw new InvalidOatFileException("String index is out of bounds");
            }
            int i11 = this.offset + i10;
            int i12 = i11;
            do {
                byte[] bArr = OatFile.this.buf;
                if (bArr[i12] == 0) {
                    return new String(bArr, i11, i12 - i11, Charset.forName("US-ASCII"));
                }
                i12++;
            } while (i12 < this.offset + this.size);
            throw new InvalidOatFileException("String extends past end of string table");
        }
    }

    public class SymbolTable {
        private final int entryCount;
        private final int entrySize;
        private final int offset;
        private final StringTable stringTable;

        public abstract class Symbol {
            static final /* synthetic */ boolean $assertionsDisabled = false;
            protected final int offset;

            public Symbol(int i10) {
                this.offset = i10;
            }

            public int getFileOffset() {
                try {
                    SectionHeader sectionHeader = (SectionHeader) OatFile.this.getSections().get(getSectionIndex());
                    long address = sectionHeader.getAddress();
                    int offset = sectionHeader.getOffset();
                    int size = sectionHeader.getSize();
                    long value = getValue();
                    if (value < address || value >= size + address) {
                        throw new InvalidOatFileException("symbol address lies outside it's associated section");
                    }
                    return (int) ((getValue() - address) + offset);
                } catch (IndexOutOfBoundsException unused) {
                    throw new InvalidOatFileException("Section index for symbol is out of bounds");
                }
            }

            public abstract String getName();

            public abstract int getSectionIndex();

            public abstract int getSize();

            public abstract long getValue();
        }

        public class Symbol32 extends Symbol {
            public Symbol32(int i10) {
                super(i10);
            }

            @Override // org.jf.dexlib2.dexbacked.OatFile.SymbolTable.Symbol
            public String getName() {
                return SymbolTable.this.stringTable.getString(OatFile.this.readSmallUint(this.offset));
            }

            @Override // org.jf.dexlib2.dexbacked.OatFile.SymbolTable.Symbol
            public int getSectionIndex() {
                return OatFile.this.readUshort(this.offset + 14);
            }

            @Override // org.jf.dexlib2.dexbacked.OatFile.SymbolTable.Symbol
            public int getSize() {
                return OatFile.this.readSmallUint(this.offset + 8);
            }

            @Override // org.jf.dexlib2.dexbacked.OatFile.SymbolTable.Symbol
            public long getValue() {
                return OatFile.this.readSmallUint(this.offset + 4);
            }
        }

        public class Symbol64 extends Symbol {
            public Symbol64(int i10) {
                super(i10);
            }

            @Override // org.jf.dexlib2.dexbacked.OatFile.SymbolTable.Symbol
            public String getName() {
                return SymbolTable.this.stringTable.getString(OatFile.this.readSmallUint(this.offset));
            }

            @Override // org.jf.dexlib2.dexbacked.OatFile.SymbolTable.Symbol
            public int getSectionIndex() {
                return OatFile.this.readUshort(this.offset + 6);
            }

            @Override // org.jf.dexlib2.dexbacked.OatFile.SymbolTable.Symbol
            public int getSize() {
                return OatFile.this.readLongAsSmallUint(this.offset + 16);
            }

            @Override // org.jf.dexlib2.dexbacked.OatFile.SymbolTable.Symbol
            public long getValue() {
                return OatFile.this.readLong(this.offset + 8);
            }
        }

        public SymbolTable(SectionHeader sectionHeader) {
            try {
                this.stringTable = OatFile.this.new StringTable((SectionHeader) OatFile.this.getSections().get(sectionHeader.getLink()));
                int offset = sectionHeader.getOffset();
                this.offset = offset;
                int entrySize = sectionHeader.getEntrySize();
                this.entrySize = entrySize;
                int size = sectionHeader.getSize() / entrySize;
                this.entryCount = size;
                if ((size * entrySize) + offset > OatFile.this.buf.length) {
                    throw new InvalidOatFileException("Symbol table extends past end of file");
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new InvalidOatFileException("String table section index is invalid");
            }
        }

        public List<Symbol> getSymbols() {
            return new AbstractList<Symbol>() { // from class: org.jf.dexlib2.dexbacked.OatFile.SymbolTable.1
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return SymbolTable.this.entryCount;
                }

                @Override // java.util.AbstractList, java.util.List
                public Symbol get(int i10) {
                    if (i10 < 0 || i10 >= SymbolTable.this.entryCount) {
                        throw new IndexOutOfBoundsException();
                    }
                    if (OatFile.this.is64bit) {
                        SymbolTable symbolTable = SymbolTable.this;
                        return symbolTable.new Symbol64((i10 * SymbolTable.this.entrySize) + symbolTable.offset);
                    }
                    SymbolTable symbolTable2 = SymbolTable.this;
                    return symbolTable2.new Symbol32((i10 * SymbolTable.this.entrySize) + symbolTable2.offset);
                }
            };
        }
    }

    public interface VdexProvider {
        byte[] getVdex();
    }

    public OatFile(byte[] bArr) {
        this(bArr, null);
    }

    public static OatFile fromInputStream(InputStream inputStream) throws IOException {
        return fromInputStream(inputStream, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StringTable getSectionNameStringTable() {
        int ushort = readUshort(50);
        if (ushort == 0) {
            throw new InvalidOatFileException("There is no section name string table");
        }
        try {
            return new StringTable(getSections().get(ushort));
        } catch (IndexOutOfBoundsException unused) {
            throw new InvalidOatFileException("The section index for the section name string table is invalid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SectionHeader> getSections() {
        final int smallUint;
        final int ushort;
        final int ushort2;
        if (this.is64bit) {
            smallUint = readLongAsSmallUint(40);
            ushort = readUshort(58);
            ushort2 = readUshort(60);
        } else {
            smallUint = readSmallUint(32);
            ushort = readUshort(46);
            ushort2 = readUshort(48);
        }
        if ((ushort * ushort2) + smallUint <= this.buf.length) {
            return new AbstractList<SectionHeader>() { // from class: org.jf.dexlib2.dexbacked.OatFile.3
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return ushort2;
                }

                @Override // java.util.AbstractList, java.util.List
                public SectionHeader get(int i10) {
                    if (i10 < 0 || i10 >= ushort2) {
                        throw new IndexOutOfBoundsException();
                    }
                    if (OatFile.this.is64bit) {
                        return OatFile.this.new SectionHeader64Bit((i10 * ushort) + smallUint);
                    }
                    return OatFile.this.new SectionHeader32Bit((i10 * ushort) + smallUint);
                }
            };
        }
        throw new InvalidOatFileException("The ELF section headers extend past the end of the file");
    }

    private SymbolTable getSymbolTable() {
        for (SectionHeader sectionHeader : getSections()) {
            if (sectionHeader.getType() == 11) {
                return new SymbolTable(sectionHeader);
            }
        }
        throw new InvalidOatFileException("Oat file has no symbol table");
    }

    private static void verifyMagic(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = ELF_MAGIC;
            if (i10 >= bArr2.length) {
                return;
            }
            if (bArr[i10] != bArr2[i10]) {
                throw new NotAnOatFileException();
            }
            i10++;
        }
    }

    public List<String> getBootClassPath() {
        if (getOatVersion() < 75) {
            r.a aVar = r.f18735b;
            return u0.f18756e;
        }
        String keyValue = this.oatHeader.getKeyValue("bootclasspath");
        if (keyValue != null) {
            return Arrays.asList(keyValue.split(":"));
        }
        r.a aVar2 = r.f18735b;
        return u0.f18756e;
    }

    @Override // org.jf.dexlib2.iface.MultiDexContainer
    public List<String> getDexEntryNames() throws IOException {
        return new AbstractForwardSequentialList<String>() { // from class: org.jf.dexlib2.dexbacked.OatFile.2
            @Override // org.jf.util.AbstractForwardSequentialList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public Iterator<String> iterator() {
                return new g0(j0.d(new DexEntryIterator(), new a()), new e<OatDexEntry, String>() { // from class: org.jf.dexlib2.dexbacked.OatFile.2.1
                    @Override // lc.e
                    public String apply(OatDexEntry oatDexEntry) {
                        return oatDexEntry.entryName;
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return j0.g(j0.d(new DexEntryIterator(), new a()));
            }
        };
    }

    public List<DexBackedDexFile> getDexFiles() {
        return new AbstractForwardSequentialList<DexBackedDexFile>() { // from class: org.jf.dexlib2.dexbacked.OatFile.1
            @Override // org.jf.util.AbstractForwardSequentialList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public Iterator<DexBackedDexFile> iterator() {
                return new g0(j0.d(new DexEntryIterator(), new a()), new e<OatDexEntry, DexBackedDexFile>() { // from class: org.jf.dexlib2.dexbacked.OatFile.1.1
                    @Override // lc.e
                    public DexBackedDexFile apply(OatDexEntry oatDexEntry) {
                        return oatDexEntry.getDexFile();
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return j0.g(j0.d(new DexEntryIterator(), new a()));
            }
        };
    }

    public int getOatVersion() {
        return this.oatHeader.getVersion();
    }

    public int isSupportedVersion() {
        int oatVersion = getOatVersion();
        if (oatVersion < 56) {
            return 0;
        }
        return oatVersion <= MAX_OAT_VERSION ? 1 : 2;
    }

    public OatFile(byte[] bArr, VdexProvider vdexProvider) {
        OatHeader oatHeader;
        super(bArr);
        if (bArr.length < 52) {
            throw new NotAnOatFileException();
        }
        verifyMagic(bArr);
        byte b10 = bArr[4];
        if (b10 == 1) {
            this.is64bit = false;
        } else {
            if (b10 != 2) {
                throw new InvalidOatFileException(String.format("Invalid word-size value: %x", Byte.valueOf(bArr[5])));
            }
            this.is64bit = true;
        }
        Iterator<SymbolTable.Symbol> it = getSymbolTable().getSymbols().iterator();
        while (true) {
            if (!it.hasNext()) {
                oatHeader = null;
                break;
            }
            SymbolTable.Symbol next = it.next();
            if (next.getName().equals("oatdata")) {
                oatHeader = new OatHeader(next.getFileOffset());
                break;
            }
        }
        if (oatHeader == null) {
            throw new InvalidOatFileException("Oat file has no oatdata symbol");
        }
        this.oatHeader = oatHeader;
        if (!oatHeader.isValid()) {
            throw new InvalidOatFileException("Invalid oat magic value");
        }
        this.opcodes = Opcodes.forArtVersion(oatHeader.getVersion());
        this.vdexProvider = vdexProvider;
    }

    /* JADX WARN: Finally extract failed */
    public static OatFile fromInputStream(InputStream inputStream, VdexProvider vdexProvider) throws IOException {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(4);
        byte[] bArr = new byte[4];
        try {
            try {
                oc.a.a(inputStream, bArr);
                inputStream.reset();
                verifyMagic(bArr);
                inputStream.reset();
                return new OatFile(oc.a.c(inputStream), vdexProvider);
            } catch (EOFException unused) {
                throw new NotAnOatFileException();
            }
        } catch (Throwable th2) {
            inputStream.reset();
            throw th2;
        }
    }

    @Override // org.jf.dexlib2.iface.MultiDexContainer
    public OatDexEntry getEntry(String str) throws IOException {
        DexEntryIterator dexEntryIterator = new DexEntryIterator();
        while (dexEntryIterator.hasNext()) {
            OatDexEntry next = dexEntryIterator.next();
            if (next != null && next.getEntryName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
