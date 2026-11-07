package org.jf.dexlib2.dexbacked.instruction;

import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.instruction.formats.Instruction22t;
import org.jf.util.NibbleUtils;

/* loaded from: classes3.dex */
public class DexBackedInstruction22t extends DexBackedInstruction implements Instruction22t {
    public DexBackedInstruction22t(DexBackedDexFile dexBackedDexFile, Opcode opcode, int i10) {
        super(dexBackedDexFile, opcode, i10);
    }

    @Override // org.jf.dexlib2.iface.instruction.OffsetInstruction
    public int getCodeOffset() {
        return this.dexFile.getDataBuffer().readShort(this.instructionStart + 2);
    }

    @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return NibbleUtils.extractLowUnsignedNibble(this.dexFile.getDataBuffer().readByte(this.instructionStart + 1));
    }

    @Override // org.jf.dexlib2.iface.instruction.TwoRegisterInstruction
    public int getRegisterB() {
        return NibbleUtils.extractHighUnsignedNibble(this.dexFile.getDataBuffer().readByte(this.instructionStart + 1));
    }
}
