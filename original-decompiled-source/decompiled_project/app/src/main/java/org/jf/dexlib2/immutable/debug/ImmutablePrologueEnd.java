package org.jf.dexlib2.immutable.debug;

import org.jf.dexlib2.iface.debug.PrologueEnd;

/* loaded from: classes3.dex */
public class ImmutablePrologueEnd extends ImmutableDebugItem implements PrologueEnd {
    public ImmutablePrologueEnd(int i10) {
        super(i10);
    }

    public static ImmutablePrologueEnd of(PrologueEnd prologueEnd) {
        return prologueEnd instanceof ImmutablePrologueEnd ? (ImmutablePrologueEnd) prologueEnd : new ImmutablePrologueEnd(prologueEnd.getCodeAddress());
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 7;
    }
}
