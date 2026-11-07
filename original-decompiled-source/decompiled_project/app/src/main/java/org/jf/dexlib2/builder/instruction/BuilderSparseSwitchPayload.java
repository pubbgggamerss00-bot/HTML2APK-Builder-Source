package org.jf.dexlib2.builder.instruction;

import java.util.List;
import lc.e;
import nc.k0;
import nc.r;
import nc.u0;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderSwitchPayload;
import org.jf.dexlib2.builder.SwitchLabelElement;
import org.jf.dexlib2.iface.instruction.formats.SparseSwitchPayload;

/* loaded from: classes3.dex */
public class BuilderSparseSwitchPayload extends BuilderSwitchPayload implements SparseSwitchPayload {
    public static final Opcode OPCODE = Opcode.SPARSE_SWITCH_PAYLOAD;
    protected final List<BuilderSwitchElement> switchElements;

    public BuilderSparseSwitchPayload(List<? extends SwitchLabelElement> list) {
        super(OPCODE);
        if (list != null) {
            this.switchElements = k0.d(list, new e<SwitchLabelElement, BuilderSwitchElement>() { // from class: org.jf.dexlib2.builder.instruction.BuilderSparseSwitchPayload.1
                static final /* synthetic */ boolean $assertionsDisabled = false;

                @Override // lc.e
                public BuilderSwitchElement apply(SwitchLabelElement switchLabelElement) {
                    return new BuilderSwitchElement(BuilderSparseSwitchPayload.this, switchLabelElement.key, switchLabelElement.target);
                }
            });
        } else {
            r.a aVar = r.f18735b;
            this.switchElements = u0.f18756e;
        }
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction, org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return (this.switchElements.size() * 4) + 2;
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
