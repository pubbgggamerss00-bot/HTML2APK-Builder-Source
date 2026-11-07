package org.jf.dexlib2.dexbacked;

import org.jf.dexlib2.dexbacked.raw.CodeItem;

/* loaded from: classes3.dex */
public class CDexBackedMethodImplementation extends DexBackedMethodImplementation {
    public CDexBackedMethodImplementation(DexBackedDexFile dexBackedDexFile, DexBackedMethod dexBackedMethod, int i10) {
        super(dexBackedDexFile, dexBackedMethod, i10);
    }

    private int getPreheaderFlags() {
        return this.dexFile.getDataBuffer().readUshort(this.codeOffset + CodeItem.CDEX_INSTRUCTIONS_SIZE_AND_PREHEADER_FLAGS_OFFSET) & CodeItem.CDEX_PREHEADER_FLAGS_MASK;
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedMethodImplementation
    public int getDebugOffset() {
        CDexBackedDexFile cDexBackedDexFile = (CDexBackedDexFile) this.dexFile;
        int i10 = this.method.methodIndex;
        int i11 = (i10 / 16) * 4;
        int i12 = i10 % 16;
        int debugInfoOffsetsPos = cDexBackedDexFile.getDebugInfoOffsetsPos();
        DexReader<? extends DexBuffer> dexReader = cDexBackedDexFile.getDataBuffer().readerAt(debugInfoOffsetsPos + cDexBackedDexFile.getDataBuffer().readSmallUint(cDexBackedDexFile.getDebugInfoOffsetsTableOffset() + debugInfoOffsetsPos + i11));
        int ubyte = dexReader.readUbyte() + (dexReader.readUbyte() << 8);
        if (((1 << i12) & ubyte) == 0) {
            return 0;
        }
        int iBitCount = Integer.bitCount((65535 >> (16 - i12)) & ubyte);
        int debugInfoBase = cDexBackedDexFile.getDebugInfoBase();
        for (int i13 = 0; i13 < iBitCount; i13++) {
            debugInfoBase += dexReader.readBigUleb128();
        }
        return dexReader.readBigUleb128() + debugInfoBase;
    }

    public int getInsCount() {
        int ushort = (this.dexFile.getDataBuffer().readUshort(this.codeOffset) >> CodeItem.CDEX_INS_COUNT_SHIFT) & 15;
        if ((getPreheaderFlags() & CodeItem.CDEX_PREHEADER_FLAG_INS_COUNT) == 0) {
            return ushort;
        }
        int i10 = (getPreheaderFlags() & CodeItem.CDEX_PREHEADER_FLAG_INSTRUCTIONS_SIZE) != 0 ? 3 : 1;
        if ((getPreheaderFlags() & CodeItem.CDEX_PREHEADER_FLAG_REGISTER_COUNT) != 0) {
            i10++;
        }
        return this.dexFile.getDataBuffer().readUshort(this.codeOffset - (i10 * 2)) + ushort;
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedMethodImplementation
    public int getInstructionsSize() {
        int ushort = this.dexFile.getDataBuffer().readUshort(this.codeOffset + CodeItem.CDEX_INSTRUCTIONS_SIZE_AND_PREHEADER_FLAGS_OFFSET) >> CodeItem.CDEX_INSTRUCTIONS_SIZE_SHIFT;
        return (getPreheaderFlags() & CodeItem.CDEX_PREHEADER_FLAG_INSTRUCTIONS_SIZE) != 0 ? this.dexFile.getDataBuffer().readUshort(this.codeOffset - 2) + ushort + (this.dexFile.getDataBuffer().readUshort(this.codeOffset - 4) << 16) : ushort;
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedMethodImplementation
    public int getInstructionsStartOffset() {
        return this.codeOffset + 4;
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedMethodImplementation, org.jf.dexlib2.iface.MethodImplementation
    public int getRegisterCount() {
        int insCount = getInsCount() + ((this.dexFile.getDataBuffer().readUshort(this.codeOffset) >> CodeItem.CDEX_REGISTER_COUNT_SHIFT) & 15);
        if ((getPreheaderFlags() & CodeItem.CDEX_PREHEADER_FLAG_REGISTER_COUNT) != 0) {
            return this.dexFile.getDataBuffer().readUshort(this.codeOffset - (((getPreheaderFlags() & CodeItem.CDEX_PREHEADER_FLAG_INSTRUCTIONS_SIZE) > 0 ? 3 : 1) * 2)) + insCount;
        }
        return insCount;
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedMethodImplementation
    public int getTriesSize() {
        int ushort = (this.dexFile.getDataBuffer().readUshort(this.codeOffset) >> CodeItem.CDEX_TRIES_SIZE_SHIFT) & 15;
        if ((getPreheaderFlags() & CodeItem.CDEX_PREHEADER_FLAG_TRIES_COUNT) == 0) {
            return ushort;
        }
        int iBitCount = Integer.bitCount(getPreheaderFlags());
        if ((getPreheaderFlags() & CodeItem.CDEX_PREHEADER_FLAG_INSTRUCTIONS_SIZE) != 0) {
            iBitCount++;
        }
        return this.dexFile.getDataBuffer().readUshort(this.codeOffset - (iBitCount * 2)) + ushort;
    }
}
