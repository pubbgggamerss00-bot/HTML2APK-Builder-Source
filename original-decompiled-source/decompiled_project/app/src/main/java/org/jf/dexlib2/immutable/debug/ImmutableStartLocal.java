package org.jf.dexlib2.immutable.debug;

import org.jf.dexlib2.base.reference.BaseStringReference;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.debug.StartLocal;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public class ImmutableStartLocal extends ImmutableDebugItem implements StartLocal {
    protected final String name;
    protected final int register;
    protected final String signature;
    protected final String type;

    public ImmutableStartLocal(int i10, int i11, String str, String str2, String str3) {
        super(i10);
        this.register = i11;
        this.name = str;
        this.type = str2;
        this.signature = str3;
    }

    public static ImmutableStartLocal of(StartLocal startLocal) {
        return startLocal instanceof ImmutableStartLocal ? (ImmutableStartLocal) startLocal : new ImmutableStartLocal(startLocal.getCodeAddress(), startLocal.getRegister(), startLocal.getName(), startLocal.getType(), startLocal.getSignature());
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 3;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.debug.StartLocal
    public StringReference getNameReference() {
        if (this.name == null) {
            return null;
        }
        return new BaseStringReference() { // from class: org.jf.dexlib2.immutable.debug.ImmutableStartLocal.1
            @Override // org.jf.dexlib2.iface.reference.StringReference
            public String getString() {
                return ImmutableStartLocal.this.name;
            }
        };
    }

    @Override // org.jf.dexlib2.iface.debug.StartLocal
    public int getRegister() {
        return this.register;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getSignature() {
        return this.signature;
    }

    @Override // org.jf.dexlib2.iface.debug.StartLocal
    public StringReference getSignatureReference() {
        if (this.signature == null) {
            return null;
        }
        return new BaseStringReference() { // from class: org.jf.dexlib2.immutable.debug.ImmutableStartLocal.3
            @Override // org.jf.dexlib2.iface.reference.StringReference
            public String getString() {
                return ImmutableStartLocal.this.signature;
            }
        };
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getType() {
        return this.type;
    }

    @Override // org.jf.dexlib2.iface.debug.StartLocal
    public TypeReference getTypeReference() {
        if (this.type == null) {
            return null;
        }
        return new BaseTypeReference() { // from class: org.jf.dexlib2.immutable.debug.ImmutableStartLocal.2
            @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
            public String getType() {
                return ImmutableStartLocal.this.type;
            }
        };
    }
}
