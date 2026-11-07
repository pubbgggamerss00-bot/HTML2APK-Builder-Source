package d0;

import d0.c1;
import d0.k;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class n {
    public static final List<Integer> a(g0 g0Var, c1 c1Var, k kVar) {
        jh.g gVar;
        z0.b<k.a> bVar = kVar.f7169a;
        if (!(bVar.f34702c != 0) && c1Var.f7078a.isEmpty()) {
            return qg.z.f22752a;
        }
        ArrayList arrayList = new ArrayList();
        if (kVar.f7169a.f34702c != 0) {
            int i10 = bVar.f34702c;
            if (i10 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            k.a[] aVarArr = bVar.f34700a;
            int i11 = aVarArr[0].f7170a;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = aVarArr[i12].f7170a;
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i11 < 0) {
                y.c.a("negative minIndex");
            }
            int i14 = bVar.f34702c;
            if (i14 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            k.a[] aVarArr2 = bVar.f34700a;
            int i15 = aVarArr2[0].f7171b;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = aVarArr2[i16].f7171b;
                if (i17 > i15) {
                    i15 = i17;
                }
            }
            gVar = new jh.g(i11, Math.min(i15, g0Var.getItemCount() - 1), 1);
        } else {
            gVar = jh.g.f15751d;
        }
        int size = c1Var.f7078a.size();
        for (int i18 = 0; i18 < size; i18++) {
            c1.a aVar = (c1.a) c1Var.get(i18);
            int iA = h0.a(aVar.getIndex(), g0Var, aVar.getKey());
            int i19 = gVar.f15744a;
            if ((iA > gVar.f15745b || i19 > iA) && iA >= 0 && iA < g0Var.getItemCount()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int i20 = gVar.f15744a;
        int i21 = gVar.f15745b;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }
}
