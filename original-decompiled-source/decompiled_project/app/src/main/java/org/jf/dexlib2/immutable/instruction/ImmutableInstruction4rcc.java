package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction4rcc;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.immutable.reference.ImmutableReference;
import org.jf.dexlib2.immutable.reference.ImmutableReferenceFactory;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction4rcc extends ImmutableInstruction implements Instruction4rcc {
    private static final Format FORMAT = Format.Format4rcc;
    protected final ImmutableReference reference;
    protected final ImmutableReference reference2;
    protected final int registerCount;
    protected final int startRegister;

    public ImmutableInstruction4rcc(Opcode opcode, int i10, int i11, Reference reference, Reference reference2) {
        super(opcode);
        this.startRegister = Preconditions.checkShortRegister(i10);
        this.registerCount = Preconditions.checkRegisterRangeCount(i11);
        this.reference = ImmutableReferenceFactory.of(reference);
        this.reference2 = ImmutableReferenceFactory.of(reference2);
    }

    public static ImmutableInstruction4rcc of(Instruction4rcc instruction4rcc) {
        return instruction4rcc instanceof ImmutableInstruction4rcc ? (ImmutableInstruction4rcc) instruction4rcc : new ImmutableInstruction4rcc(instruction4rcc.getOpcode(), instruction4rcc.getStartRegister(), instruction4rcc.getRegisterCount(), instruction4rcc.getReference(), instruction4rcc.getReference2());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
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
