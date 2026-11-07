package org.jf.dexlib2.iface.instruction;

import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public interface DualReferenceInstruction extends ReferenceInstruction {
    Reference getReference2();

    int getReferenceType2();
}
