package org.jf.dexlib2.iface.instruction;

import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public interface ReferenceInstruction extends Instruction {
    Reference getReference();

    int getReferenceType();
}
