package org.jf.dexlib2.writer;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public interface OffsetSection<Key> {
    int getItemOffset(Key key);

    Collection<? extends Map.Entry<? extends Key, Integer>> getItems();
}
