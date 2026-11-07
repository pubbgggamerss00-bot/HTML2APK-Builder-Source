package org.jf.dexlib2.writer.builder;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.jf.dexlib2.writer.StringSection;

/* loaded from: classes3.dex */
class BuilderStringPool implements StringSection<BuilderStringReference, BuilderStringReference> {
    private final ConcurrentMap<String, BuilderStringReference> internedItems = new ConcurrentHashMap();

    @Override // org.jf.dexlib2.writer.IndexSection
    public int getItemCount() {
        return this.internedItems.size();
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public Collection<? extends Map.Entry<? extends BuilderStringReference, Integer>> getItems() {
        return new BuilderMapEntryCollection<BuilderStringReference>(this.internedItems.values()) { // from class: org.jf.dexlib2.writer.builder.BuilderStringPool.1
            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int getValue(BuilderStringReference builderStringReference) {
                return builderStringReference.index;
            }

            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int setValue(BuilderStringReference builderStringReference, int i10) {
                int i11 = builderStringReference.index;
                builderStringReference.index = i10;
                return i11;
            }
        };
    }

    @Override // org.jf.dexlib2.writer.StringSection
    public boolean hasJumboIndexes() {
        return this.internedItems.size() > 65536;
    }

    public BuilderStringReference internNullableString(String str) {
        if (str == null) {
            return null;
        }
        return internString(str);
    }

    public BuilderStringReference internString(String str) {
        BuilderStringReference builderStringReference = this.internedItems.get(str);
        if (builderStringReference != null) {
            return builderStringReference;
        }
        BuilderStringReference builderStringReference2 = new BuilderStringReference(str);
        BuilderStringReference builderStringReferencePutIfAbsent = this.internedItems.putIfAbsent(str, builderStringReference2);
        return builderStringReferencePutIfAbsent == null ? builderStringReference2 : builderStringReferencePutIfAbsent;
    }

    @Override // org.jf.dexlib2.writer.NullableIndexSection
    public int getNullableItemIndex(BuilderStringReference builderStringReference) {
        if (builderStringReference == null) {
            return -1;
        }
        return builderStringReference.index;
    }

    @Override // org.jf.dexlib2.writer.StringSection
    public int getItemIndex(BuilderStringReference builderStringReference) {
        return builderStringReference.index;
    }
}
