package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction4rcc;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class BuilderInstruction4rcc extends BuilderInstruction implements Instruction4rcc {
    public static final Format FORMAT = Format.Format4rcc;
    protected final Reference reference;
    protected final Reference reference2;
    protected final int registerCount;
    protected final int startRegister;

    public BuilderInstruction4rcc(Opcode opcode, int i10, int i11, Reference reference, Reference reference2) {
        super(opcode);
        this.startRegister = Preconditions.checkShortRegister(i10);
        this.registerCount = Preconditions.checkRegisterRangeCount(i11);
        this.reference = reference;
        this.reference2 = reference2;
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
    public Reference getReference() {
        return this.reference;
    }

    @Override // org.jf.dexlib2.iface.instruction.DualReferenceInstruction
    public Reference getReference2() {
        return this.reference2;
    }

    @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
    public int getReferenceType() {
        return this.opcode.referenceType;
    }

    @Override // org.jf.dexlib2.iface.instruction.DualReferenceInstruction
    public int getReferenceType2() {
        return this.opcode.referenceType2;
    }

    @Override // org.jf.dexlib2.iface.instruction.VariableRegisterInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // org.jf.dexlib2.iface.instruction.RegisterRangeInstruction
    public int getStartRegister() {
        return this.startRegister;
    }
}
