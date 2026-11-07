package org.jf.dexlib2.writer.pool;

import java.util.Iterator;
import java.util.List;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.writer.EncodedArraySection;

/* loaded from: classes3.dex */
public class EncodedArrayPool extends BaseOffsetPool<ArrayEncodedValue> implements EncodedArraySection<ArrayEncodedValue, EncodedValue> {
    public EncodedArrayPool(DexPool dexPool) {
        super(dexPool);
    }

    public void intern(ArrayEncodedValue arrayEncodedValue) {
        if (((Integer) this.internedItems.put(arrayEncodedValue, 0)) == null) {
            Iterator<? extends EncodedValue> it = arrayEncodedValue.getValue().iterator();
            while (it.hasNext()) {
                this.dexPool.internEncodedValue(it.next());
            }
        }
    }

    @Override // org.jf.dexlib2.writer.EncodedArraySection
    public List<? extends EncodedValue> getEncodedValueList(ArrayEncodedValue arrayEncodedValue) {
        return arrayEncodedValue.getValue();
    }
}
