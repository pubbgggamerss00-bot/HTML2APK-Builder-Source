package c0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public p f2101a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<p> f2102b;

    public static long a(f fVar, long j6) {
        p pVar = fVar.f2083d;
        ArrayList arrayList = fVar.f2089k;
        if (pVar instanceof k) {
            return j6;
        }
        int size = arrayList.size();
        long jMin = j6;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2083d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f2085f + j6));
                }
            }
        }
        f fVar3 = pVar.f2118i;
        f fVar4 = pVar.h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j7 = j6 - pVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j7)), j7 - fVar4.f2085f);
    }

    public static long b(f fVar, long j6) {
        p pVar = fVar.f2083d;
        ArrayList arrayList = fVar.f2089k;
        if (pVar instanceof k) {
            return j6;
        }
        int size = arrayList.size();
        long jMax = j6;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2083d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f2085f + j6));
                }
            }
        }
        f fVar3 = pVar.h;
        f fVar4 = pVar.f2118i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j7 = pVar.j() + j6;
        return Math.max(Math.max(jMax, b(fVar4, j7)), j7 - fVar4.f2085f);
    }
}
