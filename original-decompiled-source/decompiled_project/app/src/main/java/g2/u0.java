package g2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface u0 {
    default int c(q qVar, List<? extends List<? extends p>> list, int i10) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new l((p) list2.get(i12), r.f11428b, s.f11434a));
            }
            arrayList2.add(arrayList3);
        }
        return h(new u(qVar, qVar.getLayoutDirection()), arrayList2, f3.c.b(0, i10, 7)).a();
    }

    default int f(q qVar, List<? extends List<? extends p>> list, int i10) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new l((p) list2.get(i12), r.f11427a, s.f11434a));
            }
            arrayList2.add(arrayList3);
        }
        return h(new u(qVar, qVar.getLayoutDirection()), arrayList2, f3.c.b(0, i10, 7)).a();
    }

    default int g(q qVar, List<? extends List<? extends p>> list, int i10) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new l((p) list2.get(i12), r.f11427a, s.f11435b));
            }
            arrayList2.add(arrayList3);
        }
        return h(new u(qVar, qVar.getLayoutDirection()), arrayList2, f3.c.b(i10, 0, 13)).getHeight();
    }

    m0 h(o0 o0Var, List<? extends List<? extends k0>> list, long j10);

    default int i(q qVar, List<? extends List<? extends p>> list, int i10) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new l((p) list2.get(i12), r.f11428b, s.f11435b));
            }
            arrayList2.add(arrayList3);
        }
        return h(new u(qVar, qVar.getLayoutDirection()), arrayList2, f3.c.b(i10, 0, 13)).getHeight();
    }
}
