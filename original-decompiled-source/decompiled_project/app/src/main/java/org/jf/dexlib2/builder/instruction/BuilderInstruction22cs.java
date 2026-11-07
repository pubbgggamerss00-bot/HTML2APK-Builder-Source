package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction22cs;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class BuilderInstruction22cs extends BuilderInstruction implements Instruction22cs {
    public static final Format FORMAT = Format.Format22cs;
    protected final int fieldOffset;
    protected final int registerA;
    protected final int registerB;

    public BuilderInstruction22cs(Opcode opcode, int i10, int i11, int i12) {
        super(opcode);
        this.registerA = Preconditions.checkNibbleRegister(i10);
        this.registerB = Preconditions.checkNibbleRegister(i11);
        this.fieldOffset = i12;
    }

    @Override // org.jf.dexlib2.iface.instruction.FieldOffsetInstruction
    public int getFieldOffset() {
        return this.fieldOffset;
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
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
