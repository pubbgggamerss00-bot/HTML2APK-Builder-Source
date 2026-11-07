package a1;

import java.util.Map;

/* loaded from: classes.dex */
public interface d<K, V> extends Map, fh.a {

    public interface a<K, V> extends Map<K, V>, fh.c {
        d<K, V> build();
    }

    a<K, V> builder();
}
