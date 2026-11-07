package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction10x;

/* loaded from: classes3.dex */
public class ImmutableInstruction10x extends ImmutableInstruction implements Instruction10x {
    public static final Format FORMAT = Format.Format10x;

    public ImmutableInstruction10x(Opcode opcode) {
        super(opcode);
    }

    public static ImmutableInstruction10x of(Instruction10x instruction10x) {
        return instruction10x instanceof ImmutableInstruction10x ? (ImmutableInstruction10x) instruction10x : new ImmutableInstruction10x(instruction10x.getOpcode());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }
}
