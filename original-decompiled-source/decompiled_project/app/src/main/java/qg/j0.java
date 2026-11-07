package qg;

import f9.oh;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class j0 extends oh {
    public static int a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> b(pg.n<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.r.e(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.f21469a, pair.f21470b);
        kotlin.jvm.internal.r.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }
}
