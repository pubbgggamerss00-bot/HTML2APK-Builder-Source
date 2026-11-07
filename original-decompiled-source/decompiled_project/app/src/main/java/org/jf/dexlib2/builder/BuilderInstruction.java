package org.jf.dexlib2.builder;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public abstract class BuilderInstruction implements Instruction {
    MethodLocation location;
    protected final Opcode opcode;

    public BuilderInstruction(Opcode opcode) {
        Preconditions.checkFormat(opcode, getFormat());
        this.opcode = opcode;
    }

    @Override // org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return getFormat().size / 2;
    }

    public abstract Format getFormat();

    public MethodLocation getLocation() {
        MethodLocation methodLocation = this.location;
        if (methodLocation != null) {
            return methodLocation;
        }
        throw new IllegalStateException("Cannot get the location of an instruction that hasn't been added to a method.");
    }

    @Override // org.jf.dexlib2.iface.instruction.Instruction
    public Opcode getOpcode() {
        return this.opcode;
    }
}
