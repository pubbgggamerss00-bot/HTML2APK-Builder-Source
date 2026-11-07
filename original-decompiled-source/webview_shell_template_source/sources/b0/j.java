package b0;

import b0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f1973a = new boolean[3];

    public static void a(f fVar, z.c cVar, e eVar) {
        eVar.f1920o = -1;
        d dVar = eVar.N;
        e.a[] aVarArr = eVar.U;
        d dVar2 = eVar.M;
        d dVar3 = eVar.K;
        d dVar4 = eVar.L;
        d dVar5 = eVar.J;
        eVar.f1922p = -1;
        e.a[] aVarArr2 = fVar.U;
        e.a aVar = aVarArr2[0];
        e.a aVar2 = e.a.f1935v;
        e.a aVar3 = e.a.f1933t;
        if (aVar != aVar3 && aVarArr[0] == aVar2) {
            int i6 = dVar5.f1884g;
            int iQ = fVar.q() - dVar4.f1884g;
            dVar5.f1885i = cVar.k(dVar5);
            dVar4.f1885i = cVar.k(dVar4);
            cVar.d(dVar5.f1885i, i6);
            cVar.d(dVar4.f1885i, iQ);
            eVar.f1920o = 2;
            eVar.f1894a0 = i6;
            int i7 = iQ - i6;
            eVar.W = i7;
            int i8 = eVar.f1900d0;
            if (i7 < i8) {
                eVar.W = i8;
            }
        }
        if (aVarArr2[1] == aVar3 || aVarArr[1] != aVar2) {
            return;
        }
        int i9 = dVar3.f1884g;
        int iK = fVar.k() - dVar2.f1884g;
        dVar3.f1885i = cVar.k(dVar3);
        dVar2.f1885i = cVar.k(dVar2);
        cVar.d(dVar3.f1885i, i9);
        cVar.d(dVar2.f1885i, iK);
        if (eVar.f1898c0 > 0 || eVar.f1909i0 == 8) {
            z.e eVarK = cVar.k(dVar);
            dVar.f1885i = eVarK;
            cVar.d(eVarK, eVar.f1898c0 + i9);
        }
        eVar.f1922p = 2;
        eVar.f1896b0 = i9;
        int i10 = iK - i9;
        eVar.X = i10;
        int i11 = eVar.f1902e0;
        if (i10 < i11) {
            eVar.X = i11;
        }
    }

    public static final boolean b(int i6, int i7) {
        return (i6 & i7) == i7;
    }
}
