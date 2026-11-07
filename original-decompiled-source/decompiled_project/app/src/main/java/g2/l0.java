package g2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface l0 {
    default int c(q qVar, List<? extends p> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new l(list.get(i11), r.f11428b, s.f11434a));
        }
        return h(new u(qVar, qVar.getLayoutDirection()), arrayList, f3.c.b(0, i10, 7)).a();
    }

    default int f(q qVar, List<? extends p> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new l(list.get(i11), r.f11427a, s.f11434a));
        }
        return h(new u(qVar, qVar.getLayoutDirection()), arrayList, f3.c.b(0, i10, 7)).a();
    }

    default int g(q qVar, List<? extends p> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new l(list.get(i11), r.f11427a, s.f11435b));
        }
        return h(new u(qVar, qVar.getLayoutDirection()), arrayList, f3.c.b(i10, 0, 13)).getHeight();
    }

    m0 h(o0 o0Var, List<? extends k0> list, long j10);

    default int i(q qVar, List<? extends p> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new l(list.get(i11), r.f11428b, s.f11435b));
        }
        return h(new u(qVar, qVar.getLayoutDirection()), arrayList, f3.c.b(i10, 0, 13)).getHeight();
    }
}
