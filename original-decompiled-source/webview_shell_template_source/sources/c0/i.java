package c0;

import b0.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i {
    public static o a(b0.e eVar, int i6, ArrayList<o> arrayList, o oVar) {
        int i7;
        int i8 = i6 == 0 ? eVar.p0 : eVar.f1924q0;
        if (i8 != -1 && (oVar == null || i8 != oVar.f2107b)) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i9);
                if (oVar2.f2107b == i8) {
                    if (oVar != null) {
                        oVar.c(i6, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i9++;
                }
            }
        } else if (i8 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof b0.i) {
                b0.i iVar = (b0.i) eVar;
                int i10 = 0;
                while (true) {
                    if (i10 >= iVar.f1972s0) {
                        i7 = -1;
                        break;
                    }
                    b0.e eVar2 = iVar.f1971r0[i10];
                    if ((i6 == 0 && (i7 = eVar2.p0) != -1) || (i6 == 1 && (i7 = eVar2.f1924q0) != -1)) {
                        break;
                    }
                    i10++;
                }
                if (i7 != -1) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i11);
                        if (oVar3.f2107b == i7) {
                            oVar = oVar3;
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o();
                oVar.f2106a = new ArrayList<>();
                oVar.f2109d = null;
                oVar.f2110e = -1;
                int i12 = o.f2105f;
                o.f2105f = i12 + 1;
                oVar.f2107b = i12;
                oVar.f2108c = i6;
            }
            arrayList.add(oVar);
        }
        int i13 = oVar.f2107b;
        ArrayList<b0.e> arrayList2 = oVar.f2106a;
        if (arrayList2.contains(eVar)) {
            return oVar;
        }
        arrayList2.add(eVar);
        if (eVar instanceof b0.h) {
            b0.h hVar = (b0.h) eVar;
            hVar.f1968u0.c(hVar.f1969v0 == 0 ? 1 : 0, oVar, arrayList);
        }
        if (i6 == 0) {
            eVar.p0 = i13;
            eVar.J.c(i6, oVar, arrayList);
            eVar.L.c(i6, oVar, arrayList);
        } else {
            eVar.f1924q0 = i13;
            eVar.K.c(i6, oVar, arrayList);
            eVar.N.c(i6, oVar, arrayList);
            eVar.M.c(i6, oVar, arrayList);
        }
        eVar.Q.c(i6, oVar, arrayList);
        return oVar;
    }

    public static boolean b(e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4) {
        e.a aVar5 = e.a.f1935v;
        e.a aVar6 = e.a.f1933t;
        e.a aVar7 = e.a.s;
        return (aVar3 == aVar7 || aVar3 == aVar6 || (aVar3 == aVar5 && aVar != aVar6)) || (aVar4 == aVar7 || aVar4 == aVar6 || (aVar4 == aVar5 && aVar2 != aVar6));
    }
}
