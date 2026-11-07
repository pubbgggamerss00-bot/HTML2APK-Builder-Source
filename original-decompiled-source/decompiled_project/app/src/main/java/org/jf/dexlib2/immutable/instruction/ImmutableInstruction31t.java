package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction31t;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction31t extends ImmutableInstruction implements Instruction31t {
    public static final Format FORMAT = Format.Format31t;
    protected final int codeOffset;
    protected final int registerA;

    public ImmutableInstruction31t(Opcode opcode, int i10, int i11) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i10);
        this.codeOffset = i11;
    }

    public static ImmutableInstruction31t of(Instruction31t instruction31t) {
        return instruction31t instanceof ImmutableInstruction31t ? (ImmutableInstruction31t) instruction31t : new ImmutableInstruction31t(instruction31t.getOpcode(), instruction31t.getRegisterA(), instruction31t.getCodeOffset());
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
