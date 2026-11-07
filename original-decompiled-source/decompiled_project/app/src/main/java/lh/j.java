package lh;

import c0.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import qg.z;

/* loaded from: classes2.dex */
public final class j extends l {
    public static e i(ah.h hVar, eh.l lVar) {
        return new e(hVar, true, lVar);
    }

    public static String j(g gVar, String str) {
        r.e(gVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i10 = 0;
        for (Object obj : gVar) {
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) str);
            }
            mh.o.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static List k(g gVar) {
        r.e(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return z.f22752a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return g0.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
