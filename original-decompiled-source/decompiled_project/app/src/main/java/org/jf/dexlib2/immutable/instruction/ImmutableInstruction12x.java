package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction12x;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction12x extends ImmutableInstruction implements Instruction12x {
    public static final Format FORMAT = Format.Format12x;
    protected final int registerA;
    protected final int registerB;

    public ImmutableInstruction12x(Opcode opcode, int i10, int i11) {
        super(opcode);
        this.registerA = Preconditions.checkNibbleRegister(i10);
        this.registerB = Preconditions.checkNibbleRegister(i11);
    }

    public static ImmutableInstruction12x of(Instruction12x instruction12x) {
        return instruction12x instanceof ImmutableInstruction12x ? (ImmutableInstruction12x) instruction12x : new ImmutableInstruction12x(instruction12x.getOpcode(), instruction12x.getRegisterA(), instruction12x.getRegisterB());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
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
}
