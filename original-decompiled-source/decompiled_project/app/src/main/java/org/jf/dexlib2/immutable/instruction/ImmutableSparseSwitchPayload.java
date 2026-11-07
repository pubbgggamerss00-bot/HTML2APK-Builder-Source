package org.jf.dexlib2.immutable.instruction;

import java.util.List;
import nc.r;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.dexlib2.iface.instruction.formats.SparseSwitchPayload;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableSparseSwitchPayload extends ImmutableInstruction implements SparseSwitchPayload {
    public static final Opcode OPCODE = Opcode.SPARSE_SWITCH_PAYLOAD;
    protected final r<? extends ImmutableSwitchElement> switchElements;

    public ImmutableSparseSwitchPayload(List<? extends SwitchElement> list) {
        super(OPCODE);
        this.switchElements = ImmutableSwitchElement.immutableListOf(list);
    }

    public static ImmutableSparseSwitchPayload of(SparseSwitchPayload sparseSwitchPayload) {
        return sparseSwitchPayload instanceof ImmutableSparseSwitchPayload ? (ImmutableSparseSwitchPayload) sparseSwitchPayload : new ImmutableSparseSwitchPayload(sparseSwitchPayload.getSwitchElements());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction, org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return (this.switchElements.size() * 4) + 2;
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return OPCODE.format;
    }

    @Override // org.jf.dexlib2.iface.instruction.SwitchPayload
    public List<? extends SwitchElement> getSwitchElements() {
        return this.switchElements;
    }

    public ImmutableSparseSwitchPayload(r<? extends ImmutableSwitchElement> rVar) {
        super(OPCODE);
        this.switchElements = ImmutableUtils.nullToEmptyList(rVar);
    }
}
