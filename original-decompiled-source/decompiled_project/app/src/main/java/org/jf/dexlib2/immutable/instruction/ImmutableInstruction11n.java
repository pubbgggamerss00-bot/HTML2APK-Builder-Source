package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction11n;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction11n extends ImmutableInstruction implements Instruction11n {
    public static final Format FORMAT = Format.Format11n;
    protected final int literal;
    protected final int registerA;

    public ImmutableInstruction11n(Opcode opcode, int i10, int i11) {
        super(opcode);
        this.registerA = Preconditions.checkNibbleRegister(i10);
        this.literal = Preconditions.checkNibbleLiteral(i11);
    }

    public static ImmutableInstruction11n of(Instruction11n instruction11n) {
        return instruction11n instanceof ImmutableInstruction11n ? (ImmutableInstruction11n) instruction11n : new ImmutableInstruction11n(instruction11n.getOpcode(), instruction11n.getRegisterA(), instruction11n.getNarrowLiteral());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.NarrowLiteralInstruction
    public int getNarrowLiteral() {
        return this.literal;
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
