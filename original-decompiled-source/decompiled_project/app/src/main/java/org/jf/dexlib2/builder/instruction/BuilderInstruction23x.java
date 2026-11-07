package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction23x;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class BuilderInstruction23x extends BuilderInstruction implements Instruction23x {
    public static final Format FORMAT = Format.Format23x;
    protected final int registerA;
    protected final int registerB;
    protected final int registerC;

    public BuilderInstruction23x(Opcode opcode, int i10, int i11, int i12) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i10);
        this.registerB = Preconditions.checkByteRegister(i11);
        this.registerC = Preconditions.checkByteRegister(i12);
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return this.registerA;
    }

    @Override // org.jf.dexlib2.iface.instruction.TwoRegisterInstruction
    public int getRegisterB() {
        return this.registerB;
    }

    @Override // org.jf.dexlib2.iface.instruction.ThreeRegisterInstruction
    public int getRegisterC() {
        return this.registerC;
    }
}
