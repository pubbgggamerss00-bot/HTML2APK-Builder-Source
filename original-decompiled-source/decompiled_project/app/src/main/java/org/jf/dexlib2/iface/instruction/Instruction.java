package org.jf.dexlib2.iface.instruction;

import org.jf.dexlib2.Opcode;

/* loaded from: classes3.dex */
public interface Instruction {
    int getCodeUnits();

    Opcode getOpcode();
}
