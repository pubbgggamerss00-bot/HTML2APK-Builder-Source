package org.jf.dexlib2.writer.pool;

import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.dexlib2.writer.TypeSection;

/* loaded from: classes3.dex */
public class TypePool extends StringTypeBasePool implements TypeSection<CharSequence, CharSequence, TypeReference> {
    public TypePool(DexPool dexPool) {
        super(dexPool);
    }

    @Override // org.jf.dexlib2.writer.TypeSection
    public int getItemIndex(TypeReference typeReference) {
        return getItemIndex((CharSequence) typeReference.getType());
    }

    @Override // org.jf.dexlib2.writer.TypeSection
    public CharSequence getString(CharSequence charSequence) {
        return charSequence;
    }

    public void intern(CharSequence charSequence) {
        String string = charSequence.toString();
        if (((Integer) this.internedItems.put(string, 0)) == null) {
            ((StringPool) this.dexPool.stringSection).intern(string);
        }
    }

    public void internNullable(CharSequence charSequence) {
        if (charSequence != null) {
            intern(charSequence);
        }
    }
}
