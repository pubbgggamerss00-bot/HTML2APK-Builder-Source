package org.jf.dexlib2.writer.pool;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BasePool<Key, Value> implements Markable {
    protected final DexPool dexPool;
    protected final Map<Key, Value> internedItems = new LinkedHashMap();
    private int markedItemCount = -1;

    public BasePool(DexPool dexPool) {
        this.dexPool = dexPool;
    }

    public int getItemCount() {
        return this.internedItems.size();
    }

    @Override // org.jf.dexlib2.writer.pool.Markable
    public void mark() {
        this.markedItemCount = this.internedItems.size();
    }

    @Override // org.jf.dexlib2.writer.pool.Markable
    public void reset() {
        int i10 = this.markedItemCount;
        if (i10 < 0) {
            throw new IllegalStateException("mark() must be called before calling reset()");
        }
        if (i10 == this.internedItems.size()) {
            return;
        }
        Iterator<Key> it = this.internedItems.keySet().iterator();
        for (int i11 = 0; i11 < this.markedItemCount; i11++) {
            it.next();
        }
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
