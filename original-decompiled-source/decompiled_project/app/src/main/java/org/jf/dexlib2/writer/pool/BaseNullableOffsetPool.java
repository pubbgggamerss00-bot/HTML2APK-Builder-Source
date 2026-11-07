package org.jf.dexlib2.writer.pool;

import org.jf.dexlib2.writer.NullableOffsetSection;

/* loaded from: classes3.dex */
public abstract class BaseNullableOffsetPool<Key> extends BaseOffsetPool<Key> implements NullableOffsetSection<Key> {
    public BaseNullableOffsetPool(DexPool dexPool) {
        super(dexPool);
    }

    @Override // org.jf.dexlib2.writer.NullableOffsetSection
    public int getNullableItemOffset(Key key) {
        if (key == null) {
            return 0;
        }
        return getItemOffset(key);
    }
}
