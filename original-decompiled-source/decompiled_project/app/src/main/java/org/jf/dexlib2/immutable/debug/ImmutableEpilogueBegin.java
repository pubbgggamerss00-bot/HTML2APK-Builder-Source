package org.jf.dexlib2.immutable.debug;

import org.jf.dexlib2.iface.debug.EpilogueBegin;

/* loaded from: classes3.dex */
public class ImmutableEpilogueBegin extends ImmutableDebugItem implements EpilogueBegin {
    public ImmutableEpilogueBegin(int i10) {
        super(i10);
    }

    public static ImmutableEpilogueBegin of(EpilogueBegin epilogueBegin) {
        return epilogueBegin instanceof ImmutableEpilogueBegin ? (ImmutableEpilogueBegin) epilogueBegin : new ImmutableEpilogueBegin(epilogueBegin.getCodeAddress());
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 8;
    }
}
