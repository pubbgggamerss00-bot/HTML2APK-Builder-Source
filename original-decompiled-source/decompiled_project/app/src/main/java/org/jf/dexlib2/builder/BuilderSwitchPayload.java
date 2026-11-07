package org.jf.dexlib2.builder;

import java.util.List;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.instruction.BuilderSwitchElement;
import org.jf.dexlib2.iface.instruction.SwitchPayload;

/* loaded from: classes3.dex */
public abstract class BuilderSwitchPayload extends BuilderInstruction implements SwitchPayload {
    MethodLocation referrer;

    public BuilderSwitchPayload(Opcode opcode) {
        super(opcode);
    }

    public MethodLocation getReferrer() {
        MethodLocation methodLocation = this.referrer;
        if (methodLocation != null) {
            return methodLocation;
        }
        throw new IllegalStateException("The referrer has not been set yet");
    }

    @Override // org.jf.dexlib2.iface.instruction.SwitchPayload
    public abstract List<? extends BuilderSwitchElement> getSwitchElements();
}
