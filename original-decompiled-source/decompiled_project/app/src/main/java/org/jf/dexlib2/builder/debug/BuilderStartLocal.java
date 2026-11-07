package org.jf.dexlib2.builder.debug;

import org.jf.dexlib2.builder.BuilderDebugItem;
import org.jf.dexlib2.iface.debug.StartLocal;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public class BuilderStartLocal extends BuilderDebugItem implements StartLocal {
    private final StringReference name;
    private final int register;
    private final StringReference signature;
    private final TypeReference type;

    public BuilderStartLocal(int i10, StringReference stringReference, TypeReference typeReference, StringReference stringReference2) {
        this.register = i10;
        this.name = stringReference;
        this.type = typeReference;
        this.signature = stringReference2;
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 3;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getName() {
        StringReference stringReference = this.name;
        if (stringReference == null) {
            return null;
        }
        return stringReference.getString();
    }

    @Override // org.jf.dexlib2.iface.debug.StartLocal
    public StringReference getNameReference() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.debug.StartLocal
    public int getRegister() {
        return this.register;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getSignature() {
        StringReference stringReference = this.signature;
        if (stringReference == null) {
            return null;
        }
        return stringReference.getString();
    }

    @Override // org.jf.dexlib2.iface.debug.StartLocal
    public StringReference getSignatureReference() {
        return this.signature;
    }

    @Override // org.jf.dexlib2.iface.debug.LocalInfo
    public String getType() {
        TypeReference typeReference = this.type;
        if (typeReference == null) {
            return null;
        }
        return typeReference.getType();
    }

    @Override // org.jf.dexlib2.iface.debug.StartLocal
    public TypeReference getTypeReference() {
        return this.type;
    }
}
