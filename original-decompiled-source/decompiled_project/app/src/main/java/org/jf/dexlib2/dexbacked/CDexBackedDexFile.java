package org.jf.dexlib2.dexbacked;

import java.io.UnsupportedEncodingException;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import org.jf.dexlib2.util.DexUtil;

/* loaded from: classes3.dex */
public class CDexBackedDexFile extends DexBackedDexFile {
    public CDexBackedDexFile(Opcodes opcodes, byte[] bArr, int i10, boolean z10) {
        super(opcodes, bArr, i10, z10);
    }

    public static boolean isCdex(byte[] bArr, int i10) throws UnsupportedEncodingException {
        if (i10 + 4 > bArr.length) {
            return false;
        }
        try {
            byte[] bytes = "cdex".getBytes("US-ASCII");
            return bArr[i10] == bytes[0] && bArr[i10 + 1] == bytes[1] && bArr[i10 + 2] == bytes[2] && bArr[i10 + 3] == bytes[3];
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile
    public DexBackedMethodImplementation createMethodImplementation(DexBackedDexFile dexBackedDexFile, DexBackedMethod dexBackedMethod, int i10) {
        return new CDexBackedMethodImplementation(dexBackedDexFile, dexBackedMethod, i10);
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile
    public int getBaseDataOffset() {
        return getBuffer().readSmallUint(HeaderItem.DATA_START_OFFSET);
    }

    public int getDebugInfoBase() {
        return getBuffer().readSmallUint(CdexHeaderItem.DEBUG_INFO_BASE);
    }

    public int getDebugInfoOffsetsPos() {
        return getBuffer().readSmallUint(CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET);
    }

    public int getDebugInfoOffsetsTableOffset() {
        return getBuffer().readSmallUint(CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile
    public Opcodes getDefaultOpcodes(int i10) {
        return Opcodes.forApi(28);
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile
    public int getVersion(byte[] bArr, int i10, boolean z10) {
        return z10 ? DexUtil.verifyCdexHeader(bArr, i10) : CdexHeaderItem.getVersion(bArr, i10);
    }

    public CDexBackedDexFile(Opcodes opcodes, DexBuffer dexBuffer) {
        super(opcodes, dexBuffer);
    }

    public CDexBackedDexFile(Opcodes opcodes, byte[] bArr, int i10) {
        super(opcodes, bArr, i10);
    }

    public CDexBackedDexFile(Opcodes opcodes, byte[] bArr) {
        super(opcodes, bArr);
    }
}
