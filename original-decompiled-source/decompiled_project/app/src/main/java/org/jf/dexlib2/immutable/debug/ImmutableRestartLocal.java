package org.jf.dexlib2.immutable.debug;

import org.jf.dexlib2.iface.debug.RestartLocal;

/* loaded from: classes3.dex */
public class ImmutableRestartLocal extends ImmutableDebugItem implements RestartLocal {
    protected final String name;
    protected final int register;
    protected final String signature;
    protected final String type;

    public ImmutableRestartLocal(int i10, int i11) {
        super(i10);
        this.register = i11;
        this.name = null;
        this.type = null;
        this.signature = null;
    }

    public static ImmutableRestartLocal of(RestartLocal restartLocal) {
        return restartLocal instanceof ImmutableRestartLocal ? (ImmutableRestartLocal) restartLocal : new ImmutableRestartLocal(restartLocal.getCodeAddress(), restartLocal.getRegister(), restartLocal.getType(), restartLocal.getName(), restartLocal.getSignature());
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 6;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.debug.RestartLocal
    public int getRegister() {
        return this.register;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getSignature() {
        return this.signature;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getType() {
        return this.type;
    }

    public ImmutableRestartLocal(int i10, int i11, String str, String str2, String str3) {
        super(i10);
        this.register = i11;
        this.name = str;
        this.type = str2;
        this.signature = str3;
    }
}
