package b6;

import androidx.room.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import qg.z;

/* loaded from: classes.dex */
public final class l {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[EDGE_INSN: B:45:0x0090->B:41:0x0090 BREAK  A[LOOP:0: B:11:0x0018->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<z5.a> a(g0.e eVar, int i10, int i11) {
        pg.n nVar;
        boolean z10;
        kotlin.jvm.internal.r.e(eVar, "<this>");
        LinkedHashMap linkedHashMap = eVar.f2943a;
        if (i10 == i11) {
            return z.f22752a;
        }
        boolean z11 = i11 > i10;
        ArrayList arrayList = new ArrayList();
        do {
            if (z11) {
                if (i10 >= i11) {
                    return arrayList;
                }
                if (z11) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i10));
                    if (treeMap != null) {
                        nVar = new pg.n(treeMap, treeMap.keySet());
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i10));
                    nVar = treeMap2 == null ? null : new pg.n(treeMap2, treeMap2.descendingKeySet());
                }
                if (nVar != null) {
                    break;
                }
                Map map = (Map) nVar.f21469a;
                Iterator it = ((Iterable) nVar.f21470b).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!z11) {
                        if (i11 <= iIntValue && iIntValue < i10) {
                            Object obj = map.get(Integer.valueOf(iIntValue));
                            kotlin.jvm.internal.r.b(obj);
                            arrayList.add(obj);
                            z10 = true;
                            i10 = iIntValue;
                            break;
                            break;
                        }
                    } else if (i10 + 1 <= iIntValue && iIntValue <= i11) {
                        Object obj2 = map.get(Integer.valueOf(iIntValue));
                        kotlin.jvm.internal.r.b(obj2);
                        arrayList.add(obj2);
                        z10 = true;
                        i10 = iIntValue;
                        break;
                    }
                }
                z10 = false;
            } else {
                if (i10 <= i11) {
                    return arrayList;
                }
                if (z11) {
                }
                if (nVar != null) {
                }
            }
        } while (z10);
        return null;
    }

    public static final boolean b(androidx.room.c cVar, int i10, int i11) {
        kotlin.jvm.internal.r.e(cVar, "<this>");
        if (i10 > i11 && cVar.f2868l) {
            return false;
        }
        Set<Integer> set = cVar.f2869m;
        return cVar.f2867k && (set == null || !set.contains(Integer.valueOf(i10)));
    }
}
