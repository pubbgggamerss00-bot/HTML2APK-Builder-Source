package org.jf.dexlib2.builder.instruction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.r;
import nc.u0;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderSwitchPayload;
import org.jf.dexlib2.builder.Label;
import org.jf.dexlib2.iface.instruction.formats.PackedSwitchPayload;

/* loaded from: classes3.dex */
public class BuilderPackedSwitchPayload extends BuilderSwitchPayload implements PackedSwitchPayload {
    public static final Opcode OPCODE = Opcode.PACKED_SWITCH_PAYLOAD;
    protected final List<BuilderSwitchElement> switchElements;

    public BuilderPackedSwitchPayload(int i10, List<? extends Label> list) {
        super(OPCODE);
        if (list == null) {
            r.a aVar = r.f18735b;
            this.switchElements = u0.f18756e;
            return;
        }
        this.switchElements = new ArrayList();
        Iterator<? extends Label> it = list.iterator();
        while (it.hasNext()) {
            this.switchElements.add(new BuilderSwitchElement(this, i10, it.next()));
            i10++;
        }
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction, org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return (this.switchElements.size() * 2) + 4;
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return OPCODE.format;
    }

    @Override // org.jf.dexlib2.builder.BuilderSwitchPayload, org.jf.dexlib2.iface.instruction.SwitchPayload
    public List<BuilderSwitchElement> getSwitchElements() {
        return this.switchElements;
    }
}
