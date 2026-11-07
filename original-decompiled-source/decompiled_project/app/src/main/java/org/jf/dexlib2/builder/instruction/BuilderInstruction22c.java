package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction22c;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class BuilderInstruction22c extends BuilderInstruction implements Instruction22c {
    public static final Format FORMAT = Format.Format22c;
    protected final Reference reference;
    protected final int registerA;
    protected final int registerB;

    public BuilderInstruction22c(Opcode opcode, int i10, int i11, Reference reference) {
        super(opcode);
        this.registerA = Preconditions.checkNibbleRegister(i10);
        this.registerB = Preconditions.checkNibbleRegister(i11);
        this.reference = reference;
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
    public Reference getReference() {
        return this.reference;
    }

    @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
    public int getReferenceType() {
        return this.opcode.referenceType;
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
