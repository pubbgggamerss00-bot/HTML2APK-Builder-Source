package b8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qg.a0;
import qg.x;
import qg.z;

/* loaded from: classes.dex */
public final class c {
    public static final <T> List<T> a(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(x.B(list)) : z.f22752a;
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return a0.f22708a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) x.A(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
