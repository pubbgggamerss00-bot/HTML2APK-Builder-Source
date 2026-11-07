package org.jf.dexlib2.dexbacked.instruction;

import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.instruction.formats.Instruction32x;

/* loaded from: classes3.dex */
public class DexBackedInstruction32x extends DexBackedInstruction implements Instruction32x {
    public DexBackedInstruction32x(DexBackedDexFile dexBackedDexFile, Opcode opcode, int i10) {
        super(dexBackedDexFile, opcode, i10);
    }

    @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return this.dexFile.getDataBuffer().readUshort(this.instructionStart + 2);
    }

    @Override // org.jf.dexlib2.iface.instruction.TwoRegisterInstruction
    public int getRegisterB() {
        return this.dexFile.getDataBuffer().readUshort(this.instructionStart + 4);
    }
}
