package org.jf.dexlib2.iface.instruction.formats;

import java.util.List;
import org.jf.dexlib2.iface.instruction.PayloadInstruction;

/* loaded from: classes3.dex */
public interface ArrayPayload extends PayloadInstruction {
    List<Number> getArrayElements();

    int getElementWidth();
}
