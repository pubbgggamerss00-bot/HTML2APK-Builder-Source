package org.jf.dexlib2.dexbacked.instruction;

import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.instruction.formats.UnknownInstruction;

/* loaded from: classes3.dex */
public class DexBackedUnknownInstruction extends DexBackedInstruction implements UnknownInstruction {
    public DexBackedUnknownInstruction(DexBackedDexFile dexBackedDexFile, int i10) {
        super(dexBackedDexFile, Opcode.NOP, i10);
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.UnknownInstruction
    public int getOriginalOpcode() {
        int ubyte = this.dexFile.getDataBuffer().readUbyte(this.instructionStart);
        return ubyte == 0 ? this.dexFile.getDataBuffer().readUshort(this.instructionStart) : ubyte;
    }
}
