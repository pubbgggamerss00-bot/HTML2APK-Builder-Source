package org.jf.dexlib2.writer.builder;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.jf.dexlib2.writer.TypeSection;

/* loaded from: classes3.dex */
class BuilderTypePool extends BaseBuilderPool implements TypeSection<BuilderStringReference, BuilderTypeReference, BuilderTypeReference> {
    private final ConcurrentMap<String, BuilderTypeReference> internedItems;

    public BuilderTypePool(DexBuilder dexBuilder) {
        super(dexBuilder);
        this.internedItems = new ConcurrentHashMap();
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public int getItemCount() {
        return this.internedItems.size();
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public Collection<? extends Map.Entry<? extends BuilderTypeReference, Integer>> getItems() {
        return new BuilderMapEntryCollection<BuilderTypeReference>(this.internedItems.values()) { // from class: org.jf.dexlib2.writer.builder.BuilderTypePool.1
            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int getValue(BuilderTypeReference builderTypeReference) {
                return builderTypeReference.index;
            }

            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int setValue(BuilderTypeReference builderTypeReference, int i10) {
                int i11 = builderTypeReference.index;
                builderTypeReference.index = i10;
                return i11;
            }
        };
    }

    public BuilderTypeReference internNullableType(String str) {
        if (str == null) {
            return null;
        }
        return internType(str);
    }

    public BuilderTypeReference internType(String str) {
        BuilderTypeReference builderTypeReference = this.internedItems.get(str);
        if (builderTypeReference != null) {
            return builderTypeReference;
        }
        BuilderTypeReference builderTypeReference2 = new BuilderTypeReference(((BuilderStringPool) this.dexBuilder.stringSection).internString(str));
        BuilderTypeReference builderTypeReferencePutIfAbsent = this.internedItems.putIfAbsent(str, builderTypeReference2);
        return builderTypeReferencePutIfAbsent == null ? builderTypeReference2 : builderTypeReferencePutIfAbsent;
    }

    @Override // org.jf.dexlib2.writer.NullableIndexSection
    public int getNullableItemIndex(BuilderTypeReference builderTypeReference) {
        if (builderTypeReference == null) {
            return -1;
        }
        return builderTypeReference.index;
    }

    @Override // org.jf.dexlib2.writer.TypeSection
    public BuilderStringReference getString(BuilderTypeReference builderTypeReference) {
        return builderTypeReference.stringReference;
    }

    @Override // org.jf.dexlib2.writer.TypeSection
    public int getItemIndex(BuilderTypeReference builderTypeReference) {
        return builderTypeReference.getIndex();
    }
}
