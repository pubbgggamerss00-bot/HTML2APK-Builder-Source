package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction51l;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class BuilderInstruction51l extends BuilderInstruction implements Instruction51l {
    public static final Format FORMAT = Format.Format51l;
    protected final long literal;
    protected final int registerA;

    public BuilderInstruction51l(Opcode opcode, int i10, long j10) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i10);
        this.literal = j10;
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
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
