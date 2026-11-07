package org.jf.dexlib2.builder.debug;

import org.jf.dexlib2.builder.BuilderDebugItem;
import org.jf.dexlib2.iface.debug.LineNumber;

/* loaded from: classes3.dex */
public class BuilderLineNumber extends BuilderDebugItem implements LineNumber {
    private final int lineNumber;

    public BuilderLineNumber(int i10) {
        this.lineNumber = i10;
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
