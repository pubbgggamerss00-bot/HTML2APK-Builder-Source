package org.jf.dexlib2.writer.builder;

import org.jf.dexlib2.base.reference.BaseStringReference;

/* loaded from: classes3.dex */
public class BuilderStringReference extends BaseStringReference implements BuilderReference {
    int index = -1;
    final String string;

    public BuilderStringReference(String str) {
        this.string = str;
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public int getIndex() {
        return this.index;
    }

    @Override // org.jf.dexlib2.iface.reference.StringReference
    public String getString() {
        return this.string;
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public void setIndex(int i10) {
        this.index = i10;
    }
}
