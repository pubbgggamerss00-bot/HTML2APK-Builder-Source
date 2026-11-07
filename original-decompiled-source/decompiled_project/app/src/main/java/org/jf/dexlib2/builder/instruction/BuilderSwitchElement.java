package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.builder.BuilderSwitchPayload;
import org.jf.dexlib2.builder.Label;
import org.jf.dexlib2.iface.instruction.SwitchElement;

/* loaded from: classes3.dex */
public class BuilderSwitchElement implements SwitchElement {
    private final int key;
    BuilderSwitchPayload parent;
    private final Label target;

    public BuilderSwitchElement(BuilderSwitchPayload builderSwitchPayload, int i10, Label label) {
        this.parent = builderSwitchPayload;
        this.key = i10;
        this.target = label;
    }

    @Override // org.jf.dexlib2.iface.instruction.SwitchElement
    public int getKey() {
        return this.key;
    }

    @Override // org.jf.dexlib2.iface.instruction.SwitchElement
    public int getOffset() {
        return this.target.getCodeAddress() - this.parent.getReferrer().getCodeAddress();
    }

    public Label getTarget() {
        return this.target;
    }
}
