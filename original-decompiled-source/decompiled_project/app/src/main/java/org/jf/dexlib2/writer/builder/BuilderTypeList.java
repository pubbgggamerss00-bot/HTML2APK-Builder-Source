package org.jf.dexlib2.writer.builder;

import java.util.AbstractList;
import java.util.List;
import nc.r;
import nc.u0;

/* loaded from: classes3.dex */
public class BuilderTypeList extends AbstractList<BuilderTypeReference> {
    static final BuilderTypeList EMPTY;
    int offset = 0;
    final List<? extends BuilderTypeReference> types;

    static {
        r.a aVar = r.f18735b;
        EMPTY = new BuilderTypeList(u0.f18756e);
    }

    public BuilderTypeList(List<? extends BuilderTypeReference> list) {
        this.types = list;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int i10) {
        this.offset = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.types.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public BuilderTypeReference get(int i10) {
        return this.types.get(i10);
    }
}
