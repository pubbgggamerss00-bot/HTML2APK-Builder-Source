package org.jf.dexlib2.builder.debug;

import org.jf.dexlib2.builder.BuilderDebugItem;
import org.jf.dexlib2.iface.debug.RestartLocal;

/* loaded from: classes3.dex */
public class BuilderRestartLocal extends BuilderDebugItem implements RestartLocal {
    private final int register;

    public BuilderRestartLocal(int i10) {
        this.register = i10;
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 6;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getName() {
        return null;
    }

    @Override // org.jf.dexlib2.iface.debug.RestartLocal
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
