package w5;

import e5.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends j {
    public static List o(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return s.s;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return e5.k.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
