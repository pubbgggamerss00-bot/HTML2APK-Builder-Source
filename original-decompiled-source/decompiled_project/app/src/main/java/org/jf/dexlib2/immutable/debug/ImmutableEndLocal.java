package org.jf.dexlib2.immutable.debug;

import org.jf.dexlib2.iface.debug.EndLocal;

/* loaded from: classes3.dex */
public class ImmutableEndLocal extends ImmutableDebugItem implements EndLocal {
    protected final String name;
    protected final int register;
    protected final String signature;
    protected final String type;

    public ImmutableEndLocal(int i10, int i11) {
        super(i10);
        this.register = i11;
        this.name = null;
        this.type = null;
        this.signature = null;
    }

    public static ImmutableEndLocal of(EndLocal endLocal) {
        return endLocal instanceof ImmutableEndLocal ? (ImmutableEndLocal) endLocal : new ImmutableEndLocal(endLocal.getCodeAddress(), endLocal.getRegister(), endLocal.getType(), endLocal.getName(), endLocal.getSignature());
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 5;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.debug.EndLocal
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

    public ImmutableEndLocal(int i10, int i11, String str, String str2, String str3) {
        super(i10);
        this.register = i11;
        this.name = str;
        this.type = str2;
        this.signature = str3;
    }
}
