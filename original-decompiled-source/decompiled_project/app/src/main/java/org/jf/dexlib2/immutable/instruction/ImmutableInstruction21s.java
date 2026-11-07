package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction21s;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction21s extends ImmutableInstruction implements Instruction21s {
    public static final Format FORMAT = Format.Format21s;
    protected final int literal;
    protected final int registerA;

    public ImmutableInstruction21s(Opcode opcode, int i10, int i11) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i10);
        this.literal = Preconditions.checkShortLiteral(i11);
    }

    public static ImmutableInstruction21s of(Instruction21s instruction21s) {
        return instruction21s instanceof ImmutableInstruction21s ? (ImmutableInstruction21s) instruction21s : new ImmutableInstruction21s(instruction21s.getOpcode(), instruction21s.getRegisterA(), instruction21s.getNarrowLiteral());
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
