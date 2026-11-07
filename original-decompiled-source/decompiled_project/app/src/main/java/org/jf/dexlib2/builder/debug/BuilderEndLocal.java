package org.jf.dexlib2.builder.debug;

import org.jf.dexlib2.builder.BuilderDebugItem;
import org.jf.dexlib2.iface.debug.EndLocal;

/* loaded from: classes3.dex */
public class BuilderEndLocal extends BuilderDebugItem implements EndLocal {
    private final int register;

    public BuilderEndLocal(int i10) {
        this.register = i10;
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 5;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getName() {
        return null;
    }

    @Override // org.jf.dexlib2.iface.debug.EndLocal
    public int getRegister() {
        return this.register;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getSignature() {
        return null;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getType() {
        return null;
    }
}
