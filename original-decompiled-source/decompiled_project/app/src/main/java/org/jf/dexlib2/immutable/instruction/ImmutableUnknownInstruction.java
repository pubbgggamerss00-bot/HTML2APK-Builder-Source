package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.UnknownInstruction;

/* loaded from: classes3.dex */
public class ImmutableUnknownInstruction extends ImmutableInstruction implements UnknownInstruction {
    public static final Format FORMAT = Format.Format10x;
    protected final int originalOpcode;

    public ImmutableUnknownInstruction(int i10) {
        super(Opcode.NOP);
        this.originalOpcode = i10;
    }

    public static ImmutableUnknownInstruction of(UnknownInstruction unknownInstruction) {
        return unknownInstruction instanceof ImmutableUnknownInstruction ? (ImmutableUnknownInstruction) unknownInstruction : new ImmutableUnknownInstruction(unknownInstruction.getOriginalOpcode());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.UnknownInstruction
    public int getOriginalOpcode() {
        return this.originalOpcode;
    }
}
