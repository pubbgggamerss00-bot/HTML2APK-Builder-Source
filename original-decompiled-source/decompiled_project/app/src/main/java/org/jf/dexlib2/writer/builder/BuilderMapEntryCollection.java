package org.jf.dexlib2.writer.builder;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BuilderMapEntryCollection<Key> extends AbstractCollection<Map.Entry<Key, Integer>> {
    private final Collection<Key> keys;

    public class MapEntry implements Map.Entry<Key, Integer> {
        private Key key;

        private MapEntry() {
        }

        @Override // java.util.Map.Entry
        public Key getKey() {
            return this.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Map.Entry
        public Integer getValue() {
            return Integer.valueOf(BuilderMapEntryCollection.this.getValue(this.key));
        }

        @Override // java.util.Map.Entry
        public Integer setValue(Integer num) {
            return Integer.valueOf(BuilderMapEntryCollection.this.setValue(this.key, num.intValue()));
        }
    }

    public BuilderMapEntryCollection(Collection<Key> collection) {
        this.keys = collection;
    }

    public abstract int getValue(Key key);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<Key, Integer>> iterator() {
        final Iterator<Key> it = this.keys.iterator();
        return new Iterator<Map.Entry<Key, Integer>>() { // from class: org.jf.dexlib2.writer.builder.BuilderMapEntryCollection.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public Map.Entry<Key, Integer> next() {
                MapEntry mapEntry = new MapEntry();
                mapEntry.key = it.next();
                return mapEntry;
            }
        };
    }

    public abstract int setValue(Key key, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.keys.size();
    }
}
