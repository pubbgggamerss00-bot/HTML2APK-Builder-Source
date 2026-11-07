package org.jf.dexlib2.writer.builder;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.immutable.reference.ImmutableFieldReference;
import org.jf.dexlib2.writer.FieldSection;

/* loaded from: classes3.dex */
public class BuilderFieldPool extends BaseBuilderPool implements FieldSection<BuilderStringReference, BuilderTypeReference, BuilderFieldReference, BuilderField> {
    private final ConcurrentMap<FieldReference, BuilderFieldReference> internedItems;

    public BuilderFieldPool(DexBuilder dexBuilder) {
        super(dexBuilder);
        this.internedItems = new ConcurrentHashMap();
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public int getItemCount() {
        return this.internedItems.size();
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public Collection<? extends Map.Entry<? extends BuilderFieldReference, Integer>> getItems() {
        return new BuilderMapEntryCollection<BuilderFieldReference>(this.internedItems.values()) { // from class: org.jf.dexlib2.writer.builder.BuilderFieldPool.1
            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int getValue(BuilderFieldReference builderFieldReference) {
                return builderFieldReference.index;
            }

            @Override // org.jf.dexlib2.writer.builder.BuilderMapEntryCollection
            public int setValue(BuilderFieldReference builderFieldReference, int i10) {
                int i11 = builderFieldReference.index;
                builderFieldReference.index = i10;
                return i11;
            }
        };
    }

    public BuilderFieldReference internField(String str, String str2, String str3) {
        return internField(new ImmutableFieldReference(str, str2, str3));
    }

    @Override // org.jf.dexlib2.writer.FieldSection
    public BuilderTypeReference getDefiningClass(BuilderFieldReference builderFieldReference) {
        return builderFieldReference.definingClass;
    }

    @Override // org.jf.dexlib2.writer.FieldSection
    public int getFieldIndex(BuilderField builderField) {
        return builderField.fieldReference.getIndex();
    }

    @Override // org.jf.dexlib2.writer.FieldSection
    public BuilderTypeReference getFieldType(BuilderFieldReference builderFieldReference) {
        return builderFieldReference.fieldType;
    }

    @Override // org.jf.dexlib2.writer.IndexSection
    public int getItemIndex(BuilderFieldReference builderFieldReference) {
        return builderFieldReference.index;
    }

    @Override // org.jf.dexlib2.writer.FieldSection
    public BuilderStringReference getName(BuilderFieldReference builderFieldReference) {
        return builderFieldReference.name;
    }

    public BuilderFieldReference internField(FieldReference fieldReference) {
        BuilderFieldReference builderFieldReference = this.internedItems.get(fieldReference);
        if (builderFieldReference != null) {
            return builderFieldReference;
        }
        BuilderFieldReference builderFieldReference2 = new BuilderFieldReference(((BuilderTypePool) this.dexBuilder.typeSection).internType(fieldReference.getDefiningClass()), ((BuilderStringPool) this.dexBuilder.stringSection).internString(fieldReference.getName()), ((BuilderTypePool) this.dexBuilder.typeSection).internType(fieldReference.getType()));
        BuilderFieldReference builderFieldReferencePutIfAbsent = this.internedItems.putIfAbsent(builderFieldReference2, builderFieldReference2);
        return builderFieldReferencePutIfAbsent == null ? builderFieldReference2 : builderFieldReferencePutIfAbsent;
    }
}
