package org.jf.dexlib2.immutable.instruction;

import java.util.List;
import nc.r;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.dexlib2.iface.instruction.formats.PackedSwitchPayload;
import org.jf.dexlib2.util.Preconditions;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutablePackedSwitchPayload extends ImmutableInstruction implements PackedSwitchPayload {
    public static final Opcode OPCODE = Opcode.PACKED_SWITCH_PAYLOAD;
    protected final r<? extends ImmutableSwitchElement> switchElements;

    public ImmutablePackedSwitchPayload(List<? extends SwitchElement> list) {
        super(OPCODE);
        this.switchElements = (r) Preconditions.checkSequentialOrderedKeys(ImmutableSwitchElement.immutableListOf(list));
    }

    public static ImmutablePackedSwitchPayload of(PackedSwitchPayload packedSwitchPayload) {
        return packedSwitchPayload instanceof ImmutablePackedSwitchPayload ? (ImmutablePackedSwitchPayload) packedSwitchPayload : new ImmutablePackedSwitchPayload(packedSwitchPayload.getSwitchElements());
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction, org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return (this.switchElements.size() * 2) + 4;
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return OPCODE.format;
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.PackedSwitchPayload, org.jf.dexlib2.iface.instruction.SwitchPayload
    public List<? extends SwitchElement> getSwitchElements() {
        return this.switchElements;
    }

    public ImmutablePackedSwitchPayload(r<? extends ImmutableSwitchElement> rVar) {
        super(OPCODE);
        this.switchElements = (r) Preconditions.checkSequentialOrderedKeys(ImmutableUtils.nullToEmptyList(rVar));
    }
}
