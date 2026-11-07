package org.jf.dexlib2.dexbacked.instruction;

import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.instruction.formats.Instruction51l;

/* loaded from: classes3.dex */
public class DexBackedInstruction51l extends DexBackedInstruction implements Instruction51l {
    public DexBackedInstruction51l(DexBackedDexFile dexBackedDexFile, Opcode opcode, int i10) {
        super(dexBackedDexFile, opcode, i10);
    }

    @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return this.dexFile.getDataBuffer().readUbyte(this.instructionStart + 1);
    }

    @Override // org.jf.dexlib2.iface.instruction.WideLiteralInstruction
    public long getWideLiteral() {
        return this.dexFile.getDataBuffer().readLong(this.instructionStart + 2);
    }
}
