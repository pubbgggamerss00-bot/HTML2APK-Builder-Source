package org.jf.dexlib2.immutable.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.Instruction35ms;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class ImmutableInstruction35ms extends ImmutableInstruction implements Instruction35ms {
    public static final Format FORMAT = Format.Format35ms;
    protected final int registerC;
    protected final int registerCount;
    protected final int registerD;
    protected final int registerE;
    protected final int registerF;
    protected final int registerG;
    protected final int vtableIndex;

    public ImmutableInstruction35ms(Opcode opcode, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        super(opcode);
        this.registerCount = Preconditions.check35cAnd45ccRegisterCount(i10);
        this.registerC = i10 > 0 ? Preconditions.checkNibbleRegister(i11) : 0;
        this.registerD = i10 > 1 ? Preconditions.checkNibbleRegister(i12) : 0;
        this.registerE = i10 > 2 ? Preconditions.checkNibbleRegister(i13) : 0;
        this.registerF = i10 > 3 ? Preconditions.checkNibbleRegister(i14) : 0;
        this.registerG = i10 > 4 ? Preconditions.checkNibbleRegister(i15) : 0;
        this.vtableIndex = Preconditions.checkVtableIndex(i16);
    }

    public static ImmutableInstruction35ms of(Instruction35ms instruction35ms) {
        return instruction35ms instanceof ImmutableInstruction35ms ? (ImmutableInstruction35ms) instruction35ms : new ImmutableInstruction35ms(instruction35ms.getOpcode(), instruction35ms.getRegisterCount(), instruction35ms.getRegisterC(), instruction35ms.getRegisterD(), instruction35ms.getRegisterE(), instruction35ms.getRegisterF(), instruction35ms.getRegisterG(), instruction35ms.getVtableIndex());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
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

    @Override // org.jf.dexlib2.iface.instruction.VtableIndexInstruction
    public int getVtableIndex() {
        return this.vtableIndex;
    }
}
