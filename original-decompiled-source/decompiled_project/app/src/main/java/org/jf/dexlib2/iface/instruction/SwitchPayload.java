package org.jf.dexlib2.iface.instruction;

import java.util.List;

/* loaded from: classes3.dex */
public interface SwitchPayload extends PayloadInstruction {
    List<? extends SwitchElement> getSwitchElements();
}
