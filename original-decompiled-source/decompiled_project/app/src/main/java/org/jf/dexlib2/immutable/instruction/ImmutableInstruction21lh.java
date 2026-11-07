package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction21lh;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction21lh extends ImmutableInstruction implements Instruction21lh {
    public static final Format FORMAT = Format.Format21lh;
    protected final long literal;
    protected final int registerA;

    public ImmutableInstruction21lh(Opcode opcode, int i10, long j10) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i10);
        this.literal = Preconditions.checkLongHatLiteral(j10);
    }

    public static ImmutableInstruction21lh of(Instruction21lh instruction21lh) {
        return instruction21lh instanceof ImmutableInstruction21lh ? (ImmutableInstruction21lh) instruction21lh : new ImmutableInstruction21lh(instruction21lh.getOpcode(), instruction21lh.getRegisterA(), instruction21lh.getWideLiteral());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.HatLiteralInstruction
    public short getHatLiteral() {
        return (short) (this.literal >>> 48);
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
