package org.jf.dexlib2.writer;

import java.util.List;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public interface InstructionFactory<Ref extends Reference> {
    Instruction makeArrayPayload(int i10, List<Number> list);

    Instruction makeInstruction10t(Opcode opcode, int i10);

    Instruction makeInstruction10x(Opcode opcode);

    Instruction makeInstruction11n(Opcode opcode, int i10, int i11);

    Instruction makeInstruction11x(Opcode opcode, int i10);

    Instruction makeInstruction12x(Opcode opcode, int i10, int i11);

    Instruction makeInstruction20bc(Opcode opcode, int i10, Ref ref);

    Instruction makeInstruction20t(Opcode opcode, int i10);

    Instruction makeInstruction21c(Opcode opcode, int i10, Ref ref);

    Instruction makeInstruction21ih(Opcode opcode, int i10, int i11);

    Instruction makeInstruction21lh(Opcode opcode, int i10, long j10);

    Instruction makeInstruction21s(Opcode opcode, int i10, int i11);

    Instruction makeInstruction21t(Opcode opcode, int i10, int i11);

    Instruction makeInstruction22b(Opcode opcode, int i10, int i11, int i12);

    Instruction makeInstruction22c(Opcode opcode, int i10, int i11, Ref ref);

    Instruction makeInstruction22s(Opcode opcode, int i10, int i11, int i12);

    Instruction makeInstruction22t(Opcode opcode, int i10, int i11, int i12);

    Instruction makeInstruction22x(Opcode opcode, int i10, int i11);

    Instruction makeInstruction23x(Opcode opcode, int i10, int i11, int i12);

    Instruction makeInstruction30t(Opcode opcode, int i10);

    Instruction makeInstruction31c(Opcode opcode, int i10, Ref ref);

    Instruction makeInstruction31i(Opcode opcode, int i10, int i11);

    Instruction makeInstruction31t(Opcode opcode, int i10, int i11);

    Instruction makeInstruction32x(Opcode opcode, int i10, int i11);

    Instruction makeInstruction35c(Opcode opcode, int i10, int i11, int i12, int i13, int i14, int i15, Ref ref);

    Instruction makeInstruction3rc(Opcode opcode, int i10, int i11, Ref ref);

    Instruction makeInstruction51l(Opcode opcode, int i10, long j10);

    Instruction makePackedSwitchPayload(List<? extends SwitchElement> list);

    Instruction makeSparseSwitchPayload(List<? extends SwitchElement> list);
}
