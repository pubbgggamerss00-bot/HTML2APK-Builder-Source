package re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class t extends ci.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f23525a;

    public t(u uVar) {
        this.f23525a = uVar;
    }

    @Override // ci.a
    public final List G(ArrayList arrayList, o oVar) {
        u uVar = this.f23525a;
        boolean z10 = true;
        uVar.f23522j++;
        String str = o.f23507c.get(oVar.f23508a);
        if ("hstem".equals(str)) {
            uVar.g(arrayList, arrayList.size() % 2 != 0);
            return null;
        }
        if ("vstem".equals(str)) {
            uVar.g(arrayList, arrayList.size() % 2 != 0);
            return null;
        }
        if ("vmoveto".equals(str)) {
            List listG = uVar.g(arrayList, arrayList.size() > 1);
            if (uVar.f23528m > 0) {
                uVar.h();
            }
            uVar.f23528m++;
            uVar.e(listG, oVar);
            return null;
        }
        if ("rlineto".equals(str)) {
            uVar.f(u.l(2, arrayList), oVar);
            return null;
        }
        if ("hlineto".equals(str)) {
            uVar.j(arrayList, true);
            return null;
        }
        if ("vlineto".equals(str)) {
            uVar.j(arrayList, false);
            return null;
        }
        if ("rrcurveto".equals(str)) {
            uVar.f(u.l(6, arrayList), oVar);
            return null;
        }
        if ("endchar".equals(str)) {
            if (arrayList.size() != 5 && arrayList.size() != 1) {
                z10 = false;
            }
            List listG2 = uVar.g(arrayList, z10);
            uVar.h();
            if (listG2.size() != 4) {
                uVar.e(listG2, oVar);
                return null;
            }
            listG2.add(0, 0);
            uVar.e(listG2, new o(12, 6));
            return null;
        }
        if ("rmoveto".equals(str)) {
            List listG3 = uVar.g(arrayList, arrayList.size() > 2);
            if (uVar.f23528m > 0) {
                uVar.h();
            }
            uVar.f23528m++;
            uVar.e(listG3, oVar);
            return null;
        }
        if ("hmoveto".equals(str)) {
            List listG4 = uVar.g(arrayList, arrayList.size() > 1);
            if (uVar.f23528m > 0) {
                uVar.h();
            }
            uVar.f23528m++;
            uVar.e(listG4, oVar);
            return null;
        }
        if ("vhcurveto".equals(str)) {
            uVar.i(arrayList, false);
            return null;
        }
        if ("hvcurveto".equals(str)) {
            uVar.i(arrayList, true);
            return null;
        }
        if ("hflex".equals(str)) {
            if (arrayList.size() < 7) {
                return null;
            }
            uVar.f(Arrays.asList(Arrays.asList((Number) arrayList.get(0), 0, (Number) arrayList.get(1), (Number) arrayList.get(2), (Number) arrayList.get(3), 0), Arrays.asList((Number) arrayList.get(4), 0, (Number) arrayList.get(5), Float.valueOf(-((Number) arrayList.get(2)).floatValue()), (Number) arrayList.get(6), 0)), new o(8));
            return null;
        }
        if ("flex".equals(str)) {
            uVar.f(Arrays.asList(arrayList.subList(0, 6), arrayList.subList(6, 12)), new o(8));
            return null;
        }
        if ("hflex1".equals(str)) {
            if (arrayList.size() < 9) {
                return null;
            }
            uVar.f(Arrays.asList(Arrays.asList((Number) arrayList.get(0), (Number) arrayList.get(1), (Number) arrayList.get(2), (Number) arrayList.get(3), (Number) arrayList.get(4), 0), Arrays.asList((Number) arrayList.get(5), 0, (Number) arrayList.get(6), (Number) arrayList.get(7), (Number) arrayList.get(8), 0)), new o(8));
            return null;
        }
        if ("flex1".equals(str)) {
            int iIntValue = 0;
            int iIntValue2 = 0;
            for (int i10 = 0; i10 < 5; i10++) {
                int i11 = i10 * 2;
                iIntValue += ((Number) arrayList.get(i11)).intValue();
                iIntValue2 += ((Number) arrayList.get(i11 + 1)).intValue();
            }
            uVar.f(Arrays.asList(arrayList.subList(0, 6), Arrays.asList((Number) arrayList.get(6), (Number) arrayList.get(7), (Number) arrayList.get(8), (Number) arrayList.get(9), Math.abs(iIntValue) > Math.abs(iIntValue2) ? (Number) arrayList.get(10) : Integer.valueOf(-iIntValue), Math.abs(iIntValue) > Math.abs(iIntValue2) ? Integer.valueOf(-iIntValue2) : (Number) arrayList.get(10))), new o(8));
            return null;
        }
        if ("hstemhm".equals(str)) {
            uVar.g(arrayList, arrayList.size() % 2 != 0);
            return null;
        }
        if ("hintmask".equals(str) || "cntrmask".equals(str)) {
            uVar.g(arrayList, arrayList.size() % 2 != 0).isEmpty();
            return null;
        }
        if ("vstemhm".equals(str)) {
            uVar.g(arrayList, arrayList.size() % 2 != 0);
            return null;
        }
        if ("rcurveline".equals(str)) {
            if (arrayList.size() < 2) {
                return null;
            }
            uVar.f(u.l(6, arrayList.subList(0, arrayList.size() - 2)), new o(8));
            uVar.e(arrayList.subList(arrayList.size() - 2, arrayList.size()), new o(5));
            return null;
        }
        if ("rlinecurve".equals(str)) {
            if (arrayList.size() < 6) {
                return null;
            }
            uVar.f(u.l(2, arrayList.subList(0, arrayList.size() - 6)), new o(5));
            uVar.e(arrayList.subList(arrayList.size() - 6, arrayList.size()), new o(8));
            return null;
        }
        if ("vvcurveto".equals(str)) {
            uVar.k(arrayList, false);
            return null;
        }
        if ("hhcurveto".equals(str)) {
            uVar.k(arrayList, true);
            return null;
        }
        uVar.e(arrayList, oVar);
        return null;
    }
}
