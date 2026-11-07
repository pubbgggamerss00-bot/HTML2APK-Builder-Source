package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction21t;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction21t extends ImmutableInstruction implements Instruction21t {
    public static final Format FORMAT = Format.Format21t;
    protected final int codeOffset;
    protected final int registerA;

    public ImmutableInstruction21t(Opcode opcode, int i10, int i11) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i10);
        this.codeOffset = Preconditions.checkShortCodeOffset(i11);
    }

    public static ImmutableInstruction21t of(Instruction21t instruction21t) {
        return instruction21t instanceof ImmutableInstruction21t ? (ImmutableInstruction21t) instruction21t : new ImmutableInstruction21t(instruction21t.getOpcode(), instruction21t.getRegisterA(), instruction21t.getCodeOffset());
    }

    @Override // org.jf.dexlib2.iface.instruction.OffsetInstruction
    public int getCodeOffset() {
        return this.codeOffset;
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return this.registerA;
    }
}
