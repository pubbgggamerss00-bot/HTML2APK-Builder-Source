package ba;

import android.util.SparseArray;
import j2.y;
import java.util.HashMap;
import o9.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray<c> f4200a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<c, Integer> f4201b;

    static {
        HashMap<c, Integer> map = new HashMap<>();
        f4201b = map;
        map.put(c.f19063a, 0);
        map.put(c.f19064b, 1);
        map.put(c.f19065c, 2);
        for (c cVar : map.keySet()) {
            f4200a.append(f4201b.get(cVar).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = f4201b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i10) {
        c cVar = f4200a.get(i10);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(y.a(i10, "Unknown Priority for value "));
    }
}
