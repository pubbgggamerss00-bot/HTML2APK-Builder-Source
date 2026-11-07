package org.jf.dexlib2.analysis;

import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.Instruction;

/* loaded from: classes3.dex */
public class UnresolvedOdexInstruction implements Instruction {
    public final int objectRegisterNum;
    public final Instruction originalInstruction;

    public UnresolvedOdexInstruction(Instruction instruction, int i10) {
        this.originalInstruction = instruction;
        this.objectRegisterNum = i10;
    }

    @Override // org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return this.originalInstruction.getCodeUnits();
    }

    @Override // org.jf.dexlib2.iface.instruction.Instruction
    public Opcode getOpcode() {
        return this.originalInstruction.getOpcode();
    }
}
