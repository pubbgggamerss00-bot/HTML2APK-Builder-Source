package c0;

import androidx.constraintlayout.widget.ConstraintLayout;
import b0.e;
import c0.b;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public b0.f f2073a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2074b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2075c;

    /* renamed from: d, reason: collision with root package name */
    public b0.f f2076d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<p> f2077e;

    /* renamed from: f, reason: collision with root package name */
    public b.InterfaceC0025b f2078f;

    /* renamed from: g, reason: collision with root package name */
    public b.a f2079g;
    public ArrayList<m> h;

    public final void a(f fVar, int i6, ArrayList arrayList, m mVar) {
        p pVar = fVar.f2083d;
        m mVar2 = pVar.f2113c;
        f fVar2 = pVar.f2118i;
        f fVar3 = pVar.h;
        if (mVar2 == null) {
            b0.f fVar4 = this.f2073a;
            if (pVar == fVar4.f1899d || pVar == fVar4.f1901e) {
                return;
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f2101a = null;
                mVar.f2102b = new ArrayList<>();
                mVar.f2101a = pVar;
                arrayList.add(mVar);
            }
            pVar.f2113c = mVar;
            mVar.f2102b.add(pVar);
            ArrayList arrayList2 = fVar3.f2089k;
            int size = arrayList2.size();
            int i7 = 0;
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList2.get(i8);
                i8++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i6, arrayList, mVar);
                }
            }
            ArrayList arrayList3 = fVar2.f2089k;
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList3.get(i9);
                i9++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i6, arrayList, mVar);
                }
            }
            if (i6 == 1 && (pVar instanceof n)) {
                ArrayList arrayList4 = ((n) pVar).f2103k.f2089k;
                int size3 = arrayList4.size();
                int i10 = 0;
                while (i10 < size3) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i6, arrayList, mVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f2090l;
            int size4 = arrayList5.size();
            int i11 = 0;
            while (i11 < size4) {
                Object obj4 = arrayList5.get(i11);
                i11++;
                a((f) obj4, i6, arrayList, mVar);
            }
            ArrayList arrayList6 = fVar2.f2090l;
            int size5 = arrayList6.size();
            int i12 = 0;
            while (i12 < size5) {
                Object obj5 = arrayList6.get(i12);
                i12++;
                a((f) obj5, i6, arrayList, mVar);
            }
            if (i6 == 1 && (pVar instanceof n)) {
                ArrayList arrayList7 = ((n) pVar).f2103k.f2090l;
                int size6 = arrayList7.size();
                while (i7 < size6) {
                    Object obj6 = arrayList7.get(i7);
                    i7++;
                    a((f) obj6, i6, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(b0.f fVar) {
        e.a[] aVarArr;
        int i6;
        e.a aVar;
        e.a aVar2;
        e.a aVar3;
        e.a aVar4;
        e.a aVar5;
        e.a aVar6;
        e.a aVar7;
        int i7;
        e.a aVar8;
        e.a aVar9;
        ArrayList<b0.e> arrayList = fVar.f1981r0;
        e.a[] aVarArr2 = fVar.U;
        int size = arrayList.size();
        char c7 = 0;
        int i8 = 0;
        while (i8 < size) {
            b0.e eVar = arrayList.get(i8);
            i8++;
            b0.e eVar2 = eVar;
            e.a[] aVarArr3 = eVar2.U;
            b0.d[] dVarArr = eVar2.R;
            b0.d dVar = eVar2.M;
            b0.d dVar2 = eVar2.K;
            b0.d dVar3 = eVar2.L;
            b0.d dVar4 = eVar2.J;
            e.a aVar10 = aVarArr3[c7];
            e.a aVar11 = aVarArr3[1];
            char c8 = c7;
            if (eVar2.f1909i0 == 8) {
                eVar2.f1893a = true;
                c7 = c8;
            } else {
                float f6 = eVar2.f1929w;
                e.a aVar12 = e.a.f1934u;
                if (f6 < 1.0f && aVar10 == aVar12) {
                    eVar2.f1925r = 2;
                }
                float f7 = eVar2.f1932z;
                if (f7 < 1.0f && aVar11 == aVar12) {
                    eVar2.s = 2;
                }
                float f8 = eVar2.Y;
                e.a aVar13 = e.a.f1933t;
                ArrayList<b0.e> arrayList2 = arrayList;
                e.a aVar14 = e.a.s;
                if (f8 <= 0.0f) {
                    aVarArr = aVarArr2;
                } else if (aVar10 == aVar12 && (aVar11 == aVar13 || aVar11 == aVar14)) {
                    aVarArr = aVarArr2;
                    eVar2.f1925r = 3;
                } else {
                    aVarArr = aVarArr2;
                    if (aVar11 == aVar12 && (aVar10 == aVar13 || aVar10 == aVar14)) {
                        eVar2.s = 3;
                    } else {
                        if (aVar10 == aVar12 && aVar11 == aVar12) {
                            i6 = size;
                            if (eVar2.f1925r == 0) {
                                eVar2.f1925r = 3;
                            }
                            if (eVar2.s == 0) {
                                eVar2.s = 3;
                            }
                        }
                        if (aVar10 == aVar12 && eVar2.f1925r == 1 && (dVar4.f1883f == null || dVar3.f1883f == null)) {
                            aVar10 = aVar13;
                        }
                        if (aVar11 == aVar12 && eVar2.s == 1 && (dVar2.f1883f == null || dVar.f1883f == null)) {
                            aVar11 = aVar13;
                        }
                        l lVar = eVar2.f1899d;
                        lVar.f2114d = aVar10;
                        int i9 = eVar2.f1925r;
                        lVar.f2111a = i9;
                        n nVar = eVar2.f1901e;
                        nVar.f2114d = aVar11;
                        int i10 = eVar2.s;
                        nVar.f2111a = i10;
                        aVar = e.a.f1935v;
                        if ((aVar10 != aVar || aVar10 == aVar14 || aVar10 == aVar13) && (aVar11 == aVar || aVar11 == aVar14 || aVar11 == aVar13)) {
                            aVar2 = aVar10;
                            int iQ = eVar2.q();
                            if (aVar2 == aVar) {
                                iQ = (fVar.q() - dVar4.f1884g) - dVar3.f1884g;
                                aVar2 = aVar14;
                            }
                            int iK = eVar2.k();
                            if (aVar11 == aVar) {
                                iK = (fVar.k() - dVar2.f1884g) - dVar.f1884g;
                                aVar3 = aVar14;
                            } else {
                                aVar3 = aVar11;
                            }
                            f(eVar2, aVar2, iQ, aVar3, iK);
                            eVar2.f1899d.f2115e.d(eVar2.q());
                            eVar2.f1901e.f2115e.d(eVar2.k());
                            eVar2.f1893a = true;
                        } else {
                            if (aVar10 != aVar12 || (aVar11 != aVar13 && aVar11 != aVar14)) {
                                aVar4 = aVar13;
                                aVar5 = aVar11;
                            } else if (i9 == 3) {
                                if (aVar11 == aVar13) {
                                    f(eVar2, aVar13, 0, aVar13, 0);
                                }
                                int iK2 = eVar2.k();
                                f(eVar2, aVar14, (int) ((iK2 * eVar2.Y) + 0.5f), aVar14, iK2);
                                eVar2.f1899d.f2115e.d(eVar2.q());
                                eVar2.f1901e.f2115e.d(eVar2.k());
                                eVar2.f1893a = true;
                            } else {
                                aVar4 = aVar13;
                                if (i9 == 1) {
                                    f(eVar2, aVar4, 0, aVar11, 0);
                                    eVar2.f1899d.f2115e.f2098m = eVar2.q();
                                } else {
                                    e.a aVar15 = aVar11;
                                    if (i9 == 2) {
                                        e.a aVar16 = aVarArr[c8];
                                        if (aVar16 == aVar14 || aVar16 == aVar) {
                                            f(eVar2, aVar14, (int) ((f6 * fVar.q()) + 0.5f), aVar15, eVar2.k());
                                            eVar2.f1899d.f2115e.d(eVar2.q());
                                            eVar2.f1901e.f2115e.d(eVar2.k());
                                            eVar2.f1893a = true;
                                        } else {
                                            aVar14 = aVar14;
                                            aVar5 = aVar15;
                                        }
                                    } else {
                                        aVar14 = aVar14;
                                        aVar5 = aVar15;
                                        if (dVarArr[c8].f1883f == null || dVarArr[1].f1883f == null) {
                                            f(eVar2, aVar4, 0, aVar5, 0);
                                            eVar2.f1899d.f2115e.d(eVar2.q());
                                            eVar2.f1901e.f2115e.d(eVar2.k());
                                            eVar2.f1893a = true;
                                        }
                                    }
                                }
                            }
                            if (aVar5 != aVar12 || (aVar10 != aVar4 && aVar10 != aVar14)) {
                                aVar6 = aVar4;
                                aVar7 = aVar5;
                                i7 = 1;
                                aVar8 = aVar14;
                                aVar9 = aVar10;
                            } else if (i10 == 3) {
                                if (aVar10 == aVar4) {
                                    f(eVar2, aVar4, 0, aVar4, 0);
                                }
                                int iQ2 = eVar2.q();
                                float f9 = eVar2.Y;
                                if (eVar2.Z == -1) {
                                    f9 = 1.0f / f9;
                                }
                                f(eVar2, aVar14, iQ2, aVar14, (int) ((iQ2 * f9) + 0.5f));
                                eVar2.f1899d.f2115e.d(eVar2.q());
                                eVar2.f1901e.f2115e.d(eVar2.k());
                                eVar2.f1893a = true;
                            } else if (i10 == 1) {
                                f(eVar2, aVar10, 0, aVar4, 0);
                                eVar2.f1901e.f2115e.f2098m = eVar2.k();
                            } else {
                                aVar6 = aVar4;
                                e.a aVar17 = aVar10;
                                if (i10 == 2) {
                                    e.a aVar18 = aVarArr[1];
                                    if (aVar18 == aVar14 || aVar18 == aVar) {
                                        f(eVar2, aVar17, eVar2.q(), aVar14, (int) ((f7 * fVar.k()) + 0.5f));
                                        eVar2.f1899d.f2115e.d(eVar2.q());
                                        eVar2.f1901e.f2115e.d(eVar2.k());
                                        eVar2.f1893a = true;
                                    } else {
                                        aVar8 = aVar14;
                                        aVar9 = aVar17;
                                        aVar7 = aVar5;
                                        i7 = 1;
                                    }
                                } else {
                                    aVar8 = aVar14;
                                    aVar9 = aVar17;
                                    if (dVarArr[2].f1883f == null || dVarArr[3].f1883f == null) {
                                        f(eVar2, aVar6, 0, aVar5, 0);
                                        eVar2.f1899d.f2115e.d(eVar2.q());
                                        eVar2.f1901e.f2115e.d(eVar2.k());
                                        eVar2.f1893a = true;
                                    }
                                    aVar7 = aVar5;
                                    i7 = 1;
                                }
                            }
                            if (aVar9 == aVar12 && aVar7 == aVar12) {
                                if (i9 == i7 || i10 == i7) {
                                    e.a aVar19 = aVar6;
                                    f(eVar2, aVar19, 0, aVar19, 0);
                                    eVar2.f1899d.f2115e.f2098m = eVar2.q();
                                    eVar2.f1901e.f2115e.f2098m = eVar2.k();
                                } else if (i10 == 2 && i9 == 2 && aVarArr[c8] == aVar8 && aVarArr[i7] == aVar8) {
                                    f(eVar2, aVar8, (int) ((f6 * fVar.q()) + 0.5f), aVar8, (int) ((f7 * fVar.k()) + 0.5f));
                                    eVar2.f1899d.f2115e.d(eVar2.q());
                                    eVar2.f1901e.f2115e.d(eVar2.k());
                                    eVar2.f1893a = true;
                                }
                            }
                        }
                        c7 = c8;
                        aVarArr2 = aVarArr;
                        arrayList = arrayList2;
                        size = i6;
                    }
                }
                i6 = size;
                if (aVar10 == aVar12) {
                    aVar10 = aVar13;
                }
                if (aVar11 == aVar12) {
                    aVar11 = aVar13;
                }
                l lVar2 = eVar2.f1899d;
                lVar2.f2114d = aVar10;
                int i92 = eVar2.f1925r;
                lVar2.f2111a = i92;
                n nVar2 = eVar2.f1901e;
                nVar2.f2114d = aVar11;
                int i102 = eVar2.s;
                nVar2.f2111a = i102;
                aVar = e.a.f1935v;
                if (aVar10 != aVar) {
                    aVar2 = aVar10;
                    int iQ3 = eVar2.q();
                    if (aVar2 == aVar) {
                    }
                    int iK3 = eVar2.k();
                    if (aVar11 == aVar) {
                    }
                    f(eVar2, aVar2, iQ3, aVar3, iK3);
                    eVar2.f1899d.f2115e.d(eVar2.q());
                    eVar2.f1901e.f2115e.d(eVar2.k());
                    eVar2.f1893a = true;
                    c7 = c8;
                    aVarArr2 = aVarArr;
                    arrayList = arrayList2;
                    size = i6;
                } else {
                    aVar2 = aVar10;
                    int iQ32 = eVar2.q();
                    if (aVar2 == aVar) {
                    }
                    int iK32 = eVar2.k();
                    if (aVar11 == aVar) {
                    }
                    f(eVar2, aVar2, iQ32, aVar3, iK32);
                    eVar2.f1899d.f2115e.d(eVar2.q());
                    eVar2.f1901e.f2115e.d(eVar2.k());
                    eVar2.f1893a = true;
                    c7 = c8;
                    aVarArr2 = aVarArr;
                    arrayList = arrayList2;
                    size = i6;
                }
            }
        }
    }

    public final void c() {
        b0.f fVar = this.f2073a;
        ArrayList<m> arrayList = this.h;
        ArrayList<p> arrayList2 = this.f2077e;
        arrayList2.clear();
        b0.f fVar2 = this.f2076d;
        fVar2.f1899d.f();
        fVar2.f1901e.f();
        arrayList2.add(fVar2.f1899d);
        arrayList2.add(fVar2.f1901e);
        ArrayList<b0.e> arrayList3 = fVar2.f1981r0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i6 = 0;
        while (i6 < size) {
            b0.e eVar = arrayList3.get(i6);
            i6++;
            b0.e eVar2 = eVar;
            if (eVar2 instanceof b0.h) {
                j jVar = new j(eVar2);
                eVar2.f1899d.f();
                eVar2.f1901e.f();
                jVar.f2116f = ((b0.h) eVar2).f1969v0;
                arrayList2.add(jVar);
            } else {
                if (eVar2.x()) {
                    if (eVar2.f1895b == null) {
                        eVar2.f1895b = new c(eVar2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar2.f1895b);
                } else {
                    arrayList2.add(eVar2.f1899d);
                }
                if (eVar2.y()) {
                    if (eVar2.f1897c == null) {
                        eVar2.f1897c = new c(eVar2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar2.f1897c);
                } else {
                    arrayList2.add(eVar2.f1901e);
                }
                if (eVar2 instanceof b0.i) {
                    arrayList2.add(new k(eVar2));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            p pVar = arrayList2.get(i7);
            i7++;
            pVar.f();
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            p pVar2 = arrayList2.get(i8);
            i8++;
            p pVar3 = pVar2;
            if (pVar3.f2112b != fVar2) {
                pVar3.d();
            }
        }
        arrayList.clear();
        e(fVar.f1899d, 0, arrayList);
        e(fVar.f1901e, 1, arrayList);
        this.f2074b = false;
    }

    public final int d(b0.f fVar, int i6) {
        ArrayList<m> arrayList;
        int i7;
        long jMax;
        float f6;
        b0.f fVar2 = fVar;
        ArrayList<m> arrayList2 = this.h;
        int size = arrayList2.size();
        long j6 = 0;
        int i8 = 0;
        long jMax2 = 0;
        while (i8 < size) {
            p pVar = arrayList2.get(i8).f2101a;
            if (!(pVar instanceof c) ? !(i6 != 0 ? (pVar instanceof n) : (pVar instanceof l)) : ((c) pVar).f2116f != i6) {
                f fVar3 = (i6 == 0 ? fVar2.f1899d : fVar2.f1901e).h;
                f fVar4 = (i6 == 0 ? fVar2.f1899d : fVar2.f1901e).f2118i;
                f fVar5 = pVar.h;
                f fVar6 = pVar.f2118i;
                boolean zContains = fVar5.f2090l.contains(fVar3);
                boolean zContains2 = fVar6.f2090l.contains(fVar4);
                long j7 = pVar.j();
                if (zContains && zContains2) {
                    long jB = m.b(fVar5, j6);
                    long jA = m.a(fVar6, j6);
                    long j8 = jB - j7;
                    int i9 = fVar6.f2085f;
                    arrayList = arrayList2;
                    i7 = size;
                    if (j8 >= (-i9)) {
                        j8 += i9;
                    }
                    long j9 = fVar5.f2085f;
                    long j10 = ((-jA) - j7) - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    b0.e eVar = pVar.f2112b;
                    if (i6 == 0) {
                        f6 = eVar.f1904f0;
                    } else if (i6 == 1) {
                        f6 = eVar.f1906g0;
                    } else {
                        eVar.getClass();
                        f6 = -1.0f;
                    }
                    float f7 = f6 > 0.0f ? (long) ((j8 / (1.0f - f6)) + (j10 / f6)) : 0L;
                    jMax = (fVar5.f2085f + ((((long) ((f7 * f6) + 0.5f)) + j7) + ((long) (((1.0f - f6) * f7) + 0.5f)))) - fVar6.f2085f;
                } else {
                    arrayList = arrayList2;
                    i7 = size;
                    jMax = zContains ? Math.max(m.b(fVar5, fVar5.f2085f), fVar5.f2085f + j7) : zContains2 ? Math.max(-m.a(fVar6, fVar6.f2085f), (-fVar6.f2085f) + j7) : (pVar.j() + fVar5.f2085f) - fVar6.f2085f;
                }
            } else {
                arrayList = arrayList2;
                i7 = size;
                jMax = j6;
            }
            jMax2 = Math.max(jMax2, jMax);
            i8++;
            fVar2 = fVar;
            arrayList2 = arrayList;
            size = i7;
            j6 = 0;
        }
        return (int) jMax2;
    }

    public final void e(p pVar, int i6, ArrayList<m> arrayList) {
        f fVar = pVar.h;
        f fVar2 = pVar.f2118i;
        ArrayList arrayList2 = fVar.f2089k;
        int size = arrayList2.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList2.get(i8);
            i8++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i6, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).h, i6, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f2089k;
        int size2 = arrayList3.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList3.get(i9);
            i9++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i6, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f2118i, i6, arrayList, null);
            }
        }
        if (i6 == 1) {
            ArrayList arrayList4 = ((n) pVar).f2103k.f2089k;
            int size3 = arrayList4.size();
            while (i7 < size3) {
                Object obj3 = arrayList4.get(i7);
                i7++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i6, arrayList, null);
                }
            }
        }
    }

    public final void f(b0.e eVar, e.a aVar, int i6, e.a aVar2, int i7) {
        b.a aVar3 = this.f2079g;
        aVar3.f2062a = aVar;
        aVar3.f2063b = aVar2;
        aVar3.f2064c = i6;
        aVar3.f2065d = i7;
        ((ConstraintLayout.b) this.f2078f).b(eVar, aVar3);
        eVar.O(aVar3.f2066e);
        eVar.L(aVar3.f2067f);
        eVar.E = aVar3.h;
        eVar.I(aVar3.f2068g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList<b0.e> arrayList = eVar.f2073a.f1981r0;
        int size = arrayList.size();
        char c7 = 0;
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 + 1;
            b0.e eVar2 = arrayList.get(i6);
            if (!eVar2.f1893a) {
                e.a[] aVarArr = eVar2.U;
                e.a aVar2 = aVarArr[c7];
                e.a aVar3 = aVarArr[1];
                int i8 = eVar2.f1925r;
                int i9 = eVar2.s;
                e.a aVar4 = e.a.f1934u;
                e.a aVar5 = e.a.f1933t;
                char c8 = (aVar2 == aVar5 || (aVar2 == aVar4 && i8 == 1)) ? (char) 1 : c7;
                char c9 = (aVar3 == aVar5 || (aVar3 == aVar4 && i9 == 1)) ? (char) 1 : c7;
                g gVar = eVar2.f1899d.f2115e;
                boolean z6 = gVar.f2088j;
                g gVar2 = eVar2.f1901e.f2115e;
                boolean z7 = gVar2.f2088j;
                char c10 = c8;
                e.a aVar6 = e.a.s;
                if (z6 && z7) {
                    eVar.f(eVar2, aVar6, gVar.f2086g, aVar6, gVar2.f2086g);
                    eVar2.f1893a = true;
                } else if (z6 && c9 != 0) {
                    f(eVar2, aVar6, gVar.f2086g, aVar5, gVar2.f2086g);
                    if (aVar3 == aVar4) {
                        eVar2.f1901e.f2115e.f2098m = eVar2.k();
                    } else {
                        eVar2.f1901e.f2115e.d(eVar2.k());
                        eVar2.f1893a = true;
                    }
                } else if (z7 && c10 != 0) {
                    f(eVar2, aVar5, gVar.f2086g, aVar6, gVar2.f2086g);
                    if (aVar2 == aVar4) {
                        eVar2.f1899d.f2115e.f2098m = eVar2.q();
                    } else {
                        eVar2.f1899d.f2115e.d(eVar2.q());
                        eVar2.f1893a = true;
                    }
                }
                if (eVar2.f1893a && (aVar = eVar2.f1901e.f2104l) != null) {
                    aVar.d(eVar2.f1898c0);
                }
                c7 = 0;
                eVar = this;
            }
            i6 = i7;
        }
    }
}
