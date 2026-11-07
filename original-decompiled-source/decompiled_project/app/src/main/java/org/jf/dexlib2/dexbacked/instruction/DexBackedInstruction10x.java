package org.jf.dexlib2.dexbacked.instruction;

import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.instruction.formats.Instruction10x;

/* loaded from: classes3.dex */
public class DexBackedInstruction10x extends DexBackedInstruction implements Instruction10x {
    public DexBackedInstruction10x(DexBackedDexFile dexBackedDexFile, Opcode opcode, int i10) {
        super(dexBackedDexFile, opcode, i10);
    }
}
