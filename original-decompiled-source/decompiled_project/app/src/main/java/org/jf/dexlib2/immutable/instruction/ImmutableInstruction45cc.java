package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction45cc;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.immutable.reference.ImmutableReference;
import org.jf.dexlib2.immutable.reference.ImmutableReferenceFactory;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction45cc extends ImmutableInstruction implements Instruction45cc {
    public static final Format FORMAT = Format.Format45cc;
    protected final ImmutableReference reference;
    protected final ImmutableReference reference2;
    protected final int registerC;
    protected final int registerCount;
    protected final int registerD;
    protected final int registerE;
    protected final int registerF;
    protected final int registerG;

    public ImmutableInstruction45cc(Opcode opcode, int i10, int i11, int i12, int i13, int i14, int i15, Reference reference, Reference reference2) {
        super(opcode);
        this.registerCount = Preconditions.check35cAnd45ccRegisterCount(i10);
        this.registerC = i10 > 0 ? Preconditions.checkNibbleRegister(i11) : 0;
        this.registerD = i10 > 1 ? Preconditions.checkNibbleRegister(i12) : 0;
        this.registerE = i10 > 2 ? Preconditions.checkNibbleRegister(i13) : 0;
        this.registerF = i10 > 3 ? Preconditions.checkNibbleRegister(i14) : 0;
        this.registerG = i10 > 4 ? Preconditions.checkNibbleRegister(i15) : 0;
        this.reference = ImmutableReferenceFactory.of(reference);
        this.reference2 = ImmutableReferenceFactory.of(reference2);
    }

    public static ImmutableInstruction45cc of(Instruction45cc instruction45cc) {
        return instruction45cc instanceof ImmutableInstruction45cc ? (ImmutableInstruction45cc) instruction45cc : new ImmutableInstruction45cc(instruction45cc.getOpcode(), instruction45cc.getRegisterCount(), instruction45cc.getRegisterC(), instruction45cc.getRegisterD(), instruction45cc.getRegisterE(), instruction45cc.getRegisterF(), instruction45cc.getRegisterG(), instruction45cc.getReference(), instruction45cc.getReference2());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
    public int getReferenceType() {
        return this.opcode.referenceType;
    }

    @Override // org.jf.dexlib2.iface.instruction.DualReferenceInstruction
    public int getReferenceType2() {
        return this.opcode.referenceType2;
    }

    @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
    public int getRegisterC() {
        return this.registerC;
    }

    @Override // org.jf.dexlib2.iface.instruction.VariableRegisterInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
    public int getRegisterD() {
        return this.registerD;
    }

    @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
    public int getRegisterE() {
        return this.registerE;
    }

    @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
    public int getRegisterF() {
        return this.registerF;
    }

    @Override // org.jf.dexlib2.iface.instruction.FiveRegisterInstruction
    public int getRegisterG() {
        return this.registerG;
    }

    @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
    public ImmutableReference getReference() {
        return this.reference;
    }

    @Override // org.jf.dexlib2.iface.instruction.DualReferenceInstruction
    public ImmutableReference getReference2() {
        return this.reference2;
    }
}
