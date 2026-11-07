package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction35c;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class BuilderInstruction35c extends BuilderInstruction implements Instruction35c {
    public static final Format FORMAT = Format.Format35c;
    protected final Reference reference;
    protected final int registerC;
    protected final int registerCount;
    protected final int registerD;
    protected final int registerE;
    protected final int registerF;
    protected final int registerG;

    public BuilderInstruction35c(Opcode opcode, int i10, int i11, int i12, int i13, int i14, int i15, Reference reference) {
        super(opcode);
        this.registerCount = Preconditions.check35cAnd45ccRegisterCount(i10);
        this.registerC = i10 > 0 ? Preconditions.checkNibbleRegister(i11) : 0;
        this.registerD = i10 > 1 ? Preconditions.checkNibbleRegister(i12) : 0;
        this.registerE = i10 > 2 ? Preconditions.checkNibbleRegister(i13) : 0;
        this.registerF = i10 > 3 ? Preconditions.checkNibbleRegister(i14) : 0;
        this.registerG = i10 > 4 ? Preconditions.checkNibbleRegister(i15) : 0;
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
}
