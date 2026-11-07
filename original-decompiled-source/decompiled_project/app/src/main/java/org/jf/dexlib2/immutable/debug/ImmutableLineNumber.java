package org.jf.dexlib2.immutable.debug;

import org.jf.dexlib2.iface.debug.LineNumber;

/* loaded from: classes3.dex */
public class ImmutableLineNumber extends ImmutableDebugItem implements LineNumber {
    protected final int lineNumber;

    public ImmutableLineNumber(int i10, int i11) {
        super(i10);
        this.lineNumber = i11;
    }

    public static ImmutableLineNumber of(LineNumber lineNumber) {
        return lineNumber instanceof ImmutableLineNumber ? (ImmutableLineNumber) lineNumber : new ImmutableLineNumber(lineNumber.getCodeAddress(), lineNumber.getLineNumber());
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 10;
    }

    @Override // org.jf.dexlib2.iface.debug.LineNumber
    public int getLineNumber() {
        return this.lineNumber;
    }
}
