package org.jf.dexlib2.writer.pool;

import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.writer.StringSection;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class StringPool extends StringTypeBasePool implements StringSection<CharSequence, StringReference> {
    public StringPool(DexPool dexPool) {
        super(dexPool);
    }

    @Override // org.jf.dexlib2.writer.StringSection
    public int getItemIndex(StringReference stringReference) {
        Integer num = (Integer) this.internedItems.get(stringReference.toString());
        if (num != null) {
            return num.intValue();
        }
        throw new ExceptionWithContext("Item not found.: %s", stringReference.toString());
    }

    @Override // org.jf.dexlib2.writer.StringSection
    public boolean hasJumboIndexes() {
        return this.internedItems.size() > 65536;
    }

    public void intern(CharSequence charSequence) {
        this.internedItems.put(charSequence.toString(), 0);
    }

    public void internNullable(CharSequence charSequence) {
        if (charSequence != null) {
            intern(charSequence);
        }
    }
}
