package org.jf.dexlib2.immutable.instruction;

import java.util.List;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.writer.InstructionFactory;

/* loaded from: classes3.dex */
public class ImmutableInstructionFactory implements InstructionFactory<Reference> {
    public static final ImmutableInstructionFactory INSTANCE = new ImmutableInstructionFactory();

    private ImmutableInstructionFactory() {
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public /* bridge */ /* synthetic */ Instruction makeArrayPayload(int i10, List list) {
        return makeArrayPayload(i10, (List<Number>) list);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public /* bridge */ /* synthetic */ Instruction makePackedSwitchPayload(List list) {
        return makePackedSwitchPayload((List<? extends SwitchElement>) list);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public /* bridge */ /* synthetic */ Instruction makeSparseSwitchPayload(List list) {
        return makeSparseSwitchPayload((List<? extends SwitchElement>) list);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableArrayPayload makeArrayPayload(int i10, List<Number> list) {
        return new ImmutableArrayPayload(i10, list);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction10t makeInstruction10t(Opcode opcode, int i10) {
        return new ImmutableInstruction10t(opcode, i10);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction10x makeInstruction10x(Opcode opcode) {
        return new ImmutableInstruction10x(opcode);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction11n makeInstruction11n(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction11n(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction11x makeInstruction11x(Opcode opcode, int i10) {
        return new ImmutableInstruction11x(opcode, i10);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction12x makeInstruction12x(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction12x(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction20bc makeInstruction20bc(Opcode opcode, int i10, Reference reference) {
        return new ImmutableInstruction20bc(opcode, i10, reference);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction20t makeInstruction20t(Opcode opcode, int i10) {
        return new ImmutableInstruction20t(opcode, i10);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction21c makeInstruction21c(Opcode opcode, int i10, Reference reference) {
        return new ImmutableInstruction21c(opcode, i10, reference);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction21ih makeInstruction21ih(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction21ih(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction21lh makeInstruction21lh(Opcode opcode, int i10, long j10) {
        return new ImmutableInstruction21lh(opcode, i10, j10);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction21s makeInstruction21s(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction21s(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction21t makeInstruction21t(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction21t(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction22b makeInstruction22b(Opcode opcode, int i10, int i11, int i12) {
        return new ImmutableInstruction22b(opcode, i10, i11, i12);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction22c makeInstruction22c(Opcode opcode, int i10, int i11, Reference reference) {
        return new ImmutableInstruction22c(opcode, i10, i11, reference);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction22s makeInstruction22s(Opcode opcode, int i10, int i11, int i12) {
        return new ImmutableInstruction22s(opcode, i10, i11, i12);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction22t makeInstruction22t(Opcode opcode, int i10, int i11, int i12) {
        return new ImmutableInstruction22t(opcode, i10, i11, i12);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction22x makeInstruction22x(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction22x(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction23x makeInstruction23x(Opcode opcode, int i10, int i11, int i12) {
        return new ImmutableInstruction23x(opcode, i10, i11, i12);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction30t makeInstruction30t(Opcode opcode, int i10) {
        return new ImmutableInstruction30t(opcode, i10);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction31c makeInstruction31c(Opcode opcode, int i10, Reference reference) {
        return new ImmutableInstruction31c(opcode, i10, reference);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction31i makeInstruction31i(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction31i(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction31t makeInstruction31t(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction31t(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction32x makeInstruction32x(Opcode opcode, int i10, int i11) {
        return new ImmutableInstruction32x(opcode, i10, i11);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction35c makeInstruction35c(Opcode opcode, int i10, int i11, int i12, int i13, int i14, int i15, Reference reference) {
        return new ImmutableInstruction35c(opcode, i10, i11, i12, i13, i14, i15, reference);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction3rc makeInstruction3rc(Opcode opcode, int i10, int i11, Reference reference) {
        return new ImmutableInstruction3rc(opcode, i10, i11, reference);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableInstruction51l makeInstruction51l(Opcode opcode, int i10, long j10) {
        return new ImmutableInstruction51l(opcode, i10, j10);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutablePackedSwitchPayload makePackedSwitchPayload(List<? extends SwitchElement> list) {
        return new ImmutablePackedSwitchPayload(list);
    }

    @Override // org.jf.dexlib2.writer.InstructionFactory
    public ImmutableSparseSwitchPayload makeSparseSwitchPayload(List<? extends SwitchElement> list) {
        return new ImmutableSparseSwitchPayload(list);
    }
}
