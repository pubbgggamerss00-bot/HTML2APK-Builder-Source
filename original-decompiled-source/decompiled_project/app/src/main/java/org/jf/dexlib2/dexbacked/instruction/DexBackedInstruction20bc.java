package org.jf.dexlib2.dexbacked.instruction;

import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.ReferenceType;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.reference.DexBackedReference;
import org.jf.dexlib2.iface.instruction.formats.Instruction20bc;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public class DexBackedInstruction20bc extends DexBackedInstruction implements Instruction20bc {
    public DexBackedInstruction20bc(DexBackedDexFile dexBackedDexFile, Opcode opcode, int i10) {
        super(dexBackedDexFile, opcode, i10);
    }

    @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
    public Reference getReference() {
        final int ushort = this.dexFile.getDataBuffer().readUshort(this.instructionStart + 2);
        try {
            return DexBackedReference.makeReference(this.dexFile, getReferenceType(), ushort);
        } catch (ReferenceType.InvalidReferenceTypeException e10) {
            return new Reference() { // from class: org.jf.dexlib2.dexbacked.instruction.DexBackedInstruction20bc.1
                @Override // org.jf.dexlib2.iface.reference.Reference
                public void validateReference() throws Reference.InvalidReferenceException {
                    throw new Reference.InvalidReferenceException(String.format("%d@%d", Integer.valueOf(e10.getReferenceType()), Integer.valueOf(ushort)), e10);
                }
            };
        }
    }

    @Override // org.jf.dexlib2.iface.instruction.ReferenceInstruction
    public int getReferenceType() {
        int ubyte = (this.dexFile.getDataBuffer().readUbyte(this.instructionStart + 1) >>> 6) + 1;
        ReferenceType.validateReferenceType(ubyte);
        return ubyte;
    }

    @Override // org.jf.dexlib2.iface.instruction.VerificationErrorInstruction
    public int getVerificationError() {
        return this.dexFile.getDataBuffer().readUbyte(this.instructionStart + 1) & 63;
    }
}
