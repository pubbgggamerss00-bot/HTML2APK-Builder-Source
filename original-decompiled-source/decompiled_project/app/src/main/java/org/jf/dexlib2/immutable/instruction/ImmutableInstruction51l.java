package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction51l;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction51l extends ImmutableInstruction implements Instruction51l {
    public static final Format FORMAT = Format.Format51l;
    protected final long literal;
    protected final int registerA;

    public ImmutableInstruction51l(Opcode opcode, int i10, long j10) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i10);
        this.literal = j10;
    }

    public static ImmutableInstruction51l of(Instruction51l instruction51l) {
        return instruction51l instanceof ImmutableInstruction51l ? (ImmutableInstruction51l) instruction51l : new ImmutableInstruction51l(instruction51l.getOpcode(), instruction51l.getRegisterA(), instruction51l.getWideLiteral());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return this.registerA;
    }

    @Override // org.jf.dexlib2.iface.instruction.WideLiteralInstruction
    public long getWideLiteral() {
        return this.literal;
    }
}
