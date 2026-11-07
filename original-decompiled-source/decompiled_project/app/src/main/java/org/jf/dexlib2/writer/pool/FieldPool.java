package org.jf.dexlib2.writer.pool;

import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.writer.FieldSection;

/* loaded from: classes3.dex */
public class FieldPool extends BaseIndexPool<FieldReference> implements FieldSection<CharSequence, CharSequence, FieldReference, Field> {
    public FieldPool(DexPool dexPool) {
        super(dexPool);
    }

    public void intern(FieldReference fieldReference) {
        if (((Integer) this.internedItems.put(fieldReference, 0)) == null) {
            ((TypePool) this.dexPool.typeSection).intern(fieldReference.getDefiningClass());
            ((StringPool) this.dexPool.stringSection).intern(fieldReference.getName());
            ((TypePool) this.dexPool.typeSection).intern(fieldReference.getType());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.jf.dexlib2.writer.FieldSection
    public CharSequence getDefiningClass(FieldReference fieldReference) {
        return fieldReference.getDefiningClass();
    }

    @Override // org.jf.dexlib2.writer.FieldSection
    public int getFieldIndex(Field field) {
        return getItemIndex(field);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.jf.dexlib2.writer.FieldSection
    public CharSequence getFieldType(FieldReference fieldReference) {
        return fieldReference.getType();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.jf.dexlib2.writer.FieldSection
    public CharSequence getName(FieldReference fieldReference) {
        return fieldReference.getName();
    }
}
