package b6;

import b6.p;
import c0.g0;
import i0.x1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qg.x;

/* loaded from: classes.dex */
public final class o {

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return x1.b((Integer) ((Map.Entry) t3).getKey(), (Integer) ((Map.Entry) t10).getKey());
        }
    }

    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return x1.b((Integer) ((Map.Entry) t3).getKey(), (Integer) ((Map.Entry) t10).getKey());
        }
    }

    public static final List<j> a(h6.d dVar) {
        int iA = n.a(dVar, "id");
        int iA2 = n.a(dVar, "seq");
        int iA3 = n.a(dVar, "from");
        int iA4 = n.a(dVar, "to");
        rg.b bVarB = g0.b();
        while (dVar.t0()) {
            bVarB.add(new j((int) dVar.getLong(iA), (int) dVar.getLong(iA2), dVar.W(iA3), dVar.W(iA4)));
        }
        return x.T(g0.a(bVarB));
    }

    public static final p.d b(h6.b bVar, String str, boolean z10) {
        h6.d dVarB0 = bVar.B0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = n.a(dVarB0, "seqno");
            int iA2 = n.a(dVarB0, "cid");
            int iA3 = n.a(dVarB0, "name");
            int iA4 = n.a(dVarB0, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (dVarB0.t0()) {
                    if (((int) dVarB0.getLong(iA2)) >= 0) {
                        int i10 = (int) dVarB0.getLong(iA);
                        String strW = dVarB0.W(iA3);
                        String str2 = dVarB0.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strW);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listU = x.U(new a(), linkedHashMap.entrySet());
                ArrayList arrayList = new ArrayList(qg.p.h(listU, 10));
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listC0 = x.c0(arrayList);
                List listU2 = x.U(new b(), linkedHashMap2.entrySet());
                ArrayList arrayList2 = new ArrayList(qg.p.h(listU2, 10));
                Iterator it2 = listU2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                p.d dVar = new p.d(str, z10, listC0, x.c0(arrayList2));
                ch.a.a(dVarB0, null);
                return dVar;
            }
            ch.a.a(dVarB0, null);
            return null;
        } finally {
        }
    }
}
