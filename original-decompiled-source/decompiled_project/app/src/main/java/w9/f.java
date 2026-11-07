package w9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import x9.e;

/* loaded from: classes.dex */
public final class f implements t9.b<x9.e> {
    @Override // og.a
    public final Object get() {
        aa.c cVar = new aa.c();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(o9.c.f19063a, new x9.c(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(o9.c.f19065c, new x9.c(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e.b.f33478b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(o9.c.f19064b, new x9.c(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < o9.c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new x9.b(cVar, map);
    }
}
