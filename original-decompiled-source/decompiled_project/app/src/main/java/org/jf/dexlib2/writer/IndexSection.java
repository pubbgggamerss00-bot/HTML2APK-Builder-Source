package org.jf.dexlib2.writer;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IndexSection<Key> {
    int getItemCount();

    int getItemIndex(Key key);

    Collection<? extends Map.Entry<? extends Key, Integer>> getItems();
}
