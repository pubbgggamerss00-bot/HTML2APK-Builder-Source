package c0;

import b0.d;
import b0.e;
import c0.b;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f2099a = new b.a();

    public static boolean a(b0.e eVar) {
        e.a[] aVarArr = eVar.U;
        e.a aVar = aVarArr[0];
        e.a aVar2 = aVarArr[1];
        b0.e eVar2 = eVar.V;
        b0.f fVar = eVar2 != null ? (b0.f) eVar2 : null;
        e.a aVar3 = e.a.s;
        if (fVar != null) {
            e.a aVar4 = fVar.U[0];
        }
        if (fVar != null) {
            e.a aVar5 = fVar.U[1];
        }
        e.a aVar6 = e.a.f1934u;
        e.a aVar7 = e.a.f1933t;
        boolean z6 = aVar == aVar3 || eVar.A() || aVar == aVar7 || (aVar == aVar6 && eVar.f1925r == 0 && eVar.Y == 0.0f && eVar.t(0)) || (aVar == aVar6 && eVar.f1925r == 1 && eVar.u(0, eVar.q()));
        boolean z7 = aVar2 == aVar3 || eVar.B() || aVar2 == aVar7 || (aVar2 == aVar6 && eVar.s == 0 && eVar.Y == 0.0f && eVar.t(1)) || (aVar2 == aVar6 && eVar.s == 1 && eVar.u(1, eVar.k()));
        return (eVar.Y > 0.0f && (z6 || z7)) || (z6 && z7);
    }

    public static void b(int i6, b0.e eVar, b.InterfaceC0025b interfaceC0025b, boolean z6) {
        b0.d dVar;
        b0.d dVar2;
        boolean z7;
        b0.d dVar3;
        b0.d dVar4;
        if (eVar.f1916m) {
            return;
        }
        if (!(eVar instanceof b0.f) && eVar.z() && a(eVar)) {
            b0.f.V(eVar, interfaceC0025b, new b.a());
        }
        b0.d dVarI = eVar.i(d.a.s);
        b0.d dVarI2 = eVar.i(d.a.f1887u);
        int iD = dVarI.d();
        int iD2 = dVarI2.d();
        HashSet<b0.d> hashSet = dVarI.f1878a;
        e.a aVar = e.a.f1934u;
        if (hashSet != null && dVarI.f1880c) {
            Iterator<b0.d> it = hashSet.iterator();
            while (it.hasNext()) {
                b0.d next = it.next();
                b0.e eVar2 = next.f1881d;
                int i7 = i6 + 1;
                boolean zA = a(eVar2);
                b0.d dVar5 = eVar2.J;
                b0.d dVar6 = eVar2.L;
                if (eVar2.z() && zA) {
                    z7 = true;
                    b0.f.V(eVar2, interfaceC0025b, new b.a());
                } else {
                    z7 = true;
                }
                boolean z8 = ((next == dVar5 && (dVar4 = dVar6.f1883f) != null && dVar4.f1880c) || (next == dVar6 && (dVar3 = dVar5.f1883f) != null && dVar3.f1880c)) ? z7 : false;
                e.a aVar2 = eVar2.U[0];
                if (aVar2 != aVar || zA) {
                    if (!eVar2.z()) {
                        if (next == dVar5 && dVar6.f1883f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.J(iE, eVar2.q() + iE);
                            b(i7, eVar2, interfaceC0025b, z6);
                        } else if (next == dVar6 && dVar5.f1883f == null) {
                            int iE2 = iD - dVar6.e();
                            eVar2.J(iE2 - eVar2.q(), iE2);
                            b(i7, eVar2, interfaceC0025b, z6);
                        } else if (z8 && !eVar2.x()) {
                            c(i7, eVar2, interfaceC0025b, z6);
                        }
                    }
                } else if (aVar2 == aVar && eVar2.f1928v >= 0 && eVar2.f1927u >= 0 && (eVar2.f1909i0 == 8 || (eVar2.f1925r == 0 && eVar2.Y == 0.0f))) {
                    if (!eVar2.x() && !eVar2.G && z8 && !eVar2.x()) {
                        d(i7, eVar, interfaceC0025b, eVar2, z6);
                    }
                }
            }
        }
        if (eVar instanceof b0.h) {
            return;
        }
        HashSet<b0.d> hashSet2 = dVarI2.f1878a;
        if (hashSet2 != null && dVarI2.f1880c) {
            Iterator<b0.d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                b0.d next2 = it2.next();
                b0.e eVar3 = next2.f1881d;
                int i8 = i6 + 1;
                boolean zA2 = a(eVar3);
                b0.d dVar7 = eVar3.J;
                b0.d dVar8 = eVar3.L;
                if (eVar3.z() && zA2) {
                    b0.f.V(eVar3, interfaceC0025b, new b.a());
                }
                boolean z9 = (next2 == dVar7 && (dVar2 = dVar8.f1883f) != null && dVar2.f1880c) || (next2 == dVar8 && (dVar = dVar7.f1883f) != null && dVar.f1880c);
                e.a aVar3 = eVar3.U[0];
                if (aVar3 != aVar || zA2) {
                    if (!eVar3.z()) {
                        if (next2 == dVar7 && dVar8.f1883f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.J(iE3, eVar3.q() + iE3);
                            b(i8, eVar3, interfaceC0025b, z6);
                        } else if (next2 == dVar8 && dVar7.f1883f == null) {
                            int iE4 = iD2 - dVar8.e();
                            eVar3.J(iE4 - eVar3.q(), iE4);
                            b(i8, eVar3, interfaceC0025b, z6);
                        } else if (z9 && !eVar3.x()) {
                            c(i8, eVar3, interfaceC0025b, z6);
                        }
                    }
                } else if (aVar3 == aVar && eVar3.f1928v >= 0 && eVar3.f1927u >= 0) {
                    if (eVar3.f1909i0 == 8 || (eVar3.f1925r == 0 && eVar3.Y == 0.0f)) {
                        if (!eVar3.x() && !eVar3.G && z9 && !eVar3.x()) {
                            d(i8, eVar, interfaceC0025b, eVar3, z6);
                        }
                    }
                }
            }
        }
        eVar.f1916m = true;
    }

    public static void c(int i6, b0.e eVar, b.InterfaceC0025b interfaceC0025b, boolean z6) {
        float f6 = eVar.f1904f0;
        b0.d dVar = eVar.J;
        int iD = dVar.f1883f.d();
        b0.d dVar2 = eVar.L;
        int iD2 = dVar2.f1883f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f6 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = eVar.q();
        int i7 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i7 = (iD - iD2) - iQ;
        }
        int i8 = ((int) (i7 > 0 ? (f6 * i7) + 0.5f : f6 * i7)) + iD;
        int i9 = i8 + iQ;
        if (iD > iD2) {
            i9 = i8 - iQ;
        }
        eVar.J(i8, i9);
        b(i6 + 1, eVar, interfaceC0025b, z6);
    }

    public static void d(int i6, b0.e eVar, b.InterfaceC0025b interfaceC0025b, b0.e eVar2, boolean z6) {
        float f6 = eVar2.f1904f0;
        b0.d dVar = eVar2.J;
        int iE = dVar.e() + dVar.f1883f.d();
        b0.d dVar2 = eVar2.L;
        int iD = dVar2.f1883f.d() - dVar2.e();
        if (iD >= iE) {
            int iQ = eVar2.q();
            if (eVar2.f1909i0 != 8) {
                int i7 = eVar2.f1925r;
                if (i7 == 2) {
                    iQ = (int) (eVar2.f1904f0 * 0.5f * (eVar instanceof b0.f ? eVar.q() : eVar.V.q()));
                } else if (i7 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(eVar2.f1927u, iQ);
                int i8 = eVar2.f1928v;
                if (i8 > 0) {
                    iQ = Math.min(i8, iQ);
                }
            }
            int i9 = iE + ((int) ((f6 * ((iD - iE) - iQ)) + 0.5f));
            eVar2.J(i9, iQ + i9);
            b(i6 + 1, eVar2, interfaceC0025b, z6);
        }
    }

    public static void e(int i6, b0.e eVar, b.InterfaceC0025b interfaceC0025b) {
        float f6 = eVar.f1906g0;
        b0.d dVar = eVar.K;
        int iD = dVar.f1883f.d();
        b0.d dVar2 = eVar.M;
        int iD2 = dVar2.f1883f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f6 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = eVar.k();
        int i7 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i7 = (iD - iD2) - iK;
        }
        int i8 = (int) (i7 > 0 ? (f6 * i7) + 0.5f : f6 * i7);
        int i9 = iD + i8;
        int i10 = i9 + iK;
        if (iD > iD2) {
            i9 = iD - i8;
            i10 = i9 - iK;
        }
        eVar.K(i9, i10);
        g(i6 + 1, eVar, interfaceC0025b);
    }

    public static void f(int i6, b0.e eVar, b.InterfaceC0025b interfaceC0025b, b0.e eVar2) {
        float f6 = eVar2.f1906g0;
        b0.d dVar = eVar2.K;
        int iE = dVar.e() + dVar.f1883f.d();
        b0.d dVar2 = eVar2.M;
        int iD = dVar2.f1883f.d() - dVar2.e();
        if (iD >= iE) {
            int iK = eVar2.k();
            if (eVar2.f1909i0 != 8) {
                int i7 = eVar2.s;
                if (i7 == 2) {
                    iK = (int) (f6 * 0.5f * (eVar instanceof b0.f ? eVar.k() : eVar.V.k()));
                } else if (i7 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(eVar2.f1930x, iK);
                int i8 = eVar2.f1931y;
                if (i8 > 0) {
                    iK = Math.min(i8, iK);
                }
            }
            int i9 = iE + ((int) ((f6 * ((iD - iE) - iK)) + 0.5f));
            eVar2.K(i9, iK + i9);
            g(i6 + 1, eVar2, interfaceC0025b);
        }
    }

    public static void g(int i6, b0.e eVar, b.InterfaceC0025b interfaceC0025b) {
        boolean z6;
        b0.d dVar;
        b0.d dVar2;
        b0.d dVar3;
        b0.d dVar4;
        if (eVar.f1918n) {
            return;
        }
        if (!(eVar instanceof b0.f) && eVar.z() && a(eVar)) {
            b0.f.V(eVar, interfaceC0025b, new b.a());
        }
        b0.d dVarI = eVar.i(d.a.f1886t);
        b0.d dVarI2 = eVar.i(d.a.f1888v);
        int iD = dVarI.d();
        int iD2 = dVarI2.d();
        HashSet<b0.d> hashSet = dVarI.f1878a;
        e.a aVar = e.a.f1934u;
        if (hashSet != null && dVarI.f1880c) {
            Iterator<b0.d> it = hashSet.iterator();
            while (it.hasNext()) {
                b0.d next = it.next();
                b0.e eVar2 = next.f1881d;
                int i7 = i6 + 1;
                boolean zA = a(eVar2);
                b0.d dVar5 = eVar2.K;
                b0.d dVar6 = eVar2.M;
                if (eVar2.z() && zA) {
                    b0.f.V(eVar2, interfaceC0025b, new b.a());
                }
                boolean z7 = (next == dVar5 && (dVar4 = dVar6.f1883f) != null && dVar4.f1880c) || (next == dVar6 && (dVar3 = dVar5.f1883f) != null && dVar3.f1880c);
                e.a aVar2 = eVar2.U[1];
                if (aVar2 != aVar || zA) {
                    if (!eVar2.z()) {
                        if (next == dVar5 && dVar6.f1883f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.K(iE, eVar2.k() + iE);
                            g(i7, eVar2, interfaceC0025b);
                        } else if (next == dVar6 && dVar5.f1883f == null) {
                            int iE2 = iD - dVar6.e();
                            eVar2.K(iE2 - eVar2.k(), iE2);
                            g(i7, eVar2, interfaceC0025b);
                        } else if (z7 && !eVar2.y()) {
                            e(i7, eVar2, interfaceC0025b);
                        }
                    }
                } else if (aVar2 == aVar && eVar2.f1931y >= 0 && eVar2.f1930x >= 0 && (eVar2.f1909i0 == 8 || (eVar2.s == 0 && eVar2.Y == 0.0f))) {
                    if (!eVar2.y() && !eVar2.G && z7 && !eVar2.y()) {
                        f(i7, eVar, interfaceC0025b, eVar2);
                    }
                }
            }
        }
        boolean z8 = true;
        z8 = true;
        z8 = true;
        if (eVar instanceof b0.h) {
            return;
        }
        HashSet<b0.d> hashSet2 = dVarI2.f1878a;
        if (hashSet2 != null && dVarI2.f1880c) {
            Iterator<b0.d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                b0.d next2 = it2.next();
                b0.e eVar3 = next2.f1881d;
                int i8 = i6 + 1;
                boolean zA2 = a(eVar3);
                b0.d dVar7 = eVar3.K;
                b0.d dVar8 = eVar3.M;
                if (eVar3.z() && zA2) {
                    b0.f.V(eVar3, interfaceC0025b, new b.a());
                }
                boolean z9 = (next2 == dVar7 && (dVar2 = dVar8.f1883f) != null && dVar2.f1880c) || (next2 == dVar8 && (dVar = dVar7.f1883f) != null && dVar.f1880c);
                e.a aVar3 = eVar3.U[1];
                if (aVar3 != aVar || zA2) {
                    if (!eVar3.z()) {
                        if (next2 == dVar7 && dVar8.f1883f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.K(iE3, eVar3.k() + iE3);
                            g(i8, eVar3, interfaceC0025b);
                        } else if (next2 == dVar8 && dVar7.f1883f == null) {
                            int iE4 = iD2 - dVar8.e();
                            eVar3.K(iE4 - eVar3.k(), iE4);
                            g(i8, eVar3, interfaceC0025b);
                        } else if (z9 && !eVar3.y()) {
                            e(i8, eVar3, interfaceC0025b);
                        }
                    }
                } else if (aVar3 == aVar && eVar3.f1931y >= 0 && eVar3.f1930x >= 0 && (eVar3.f1909i0 == 8 || (eVar3.s == 0 && eVar3.Y == 0.0f))) {
                    if (!eVar3.y() && !eVar3.G && z9 && !eVar3.y()) {
                        f(i8, eVar, interfaceC0025b, eVar3);
                    }
                }
            }
        }
        b0.d dVarI3 = eVar.i(d.a.f1889w);
        if (dVarI3.f1878a != null && dVarI3.f1880c) {
            int iD3 = dVarI3.d();
            Iterator<b0.d> it3 = dVarI3.f1878a.iterator();
            while (it3.hasNext()) {
                b0.d next3 = it3.next();
                b0.e eVar4 = next3.f1881d;
                int i9 = i6 + 1;
                boolean zA3 = a(eVar4);
                b0.d dVar9 = eVar4.N;
                if (eVar4.z() && zA3) {
                    b0.f.V(eVar4, interfaceC0025b, new b.a());
                }
                if (eVar4.U[z8 ? 1 : 0] != aVar || zA3) {
                    if (!eVar4.z()) {
                        if (next3 == dVar9) {
                            int iE5 = next3.e() + iD3;
                            if (eVar4.E) {
                                int i10 = iE5 - eVar4.f1898c0;
                                int i11 = eVar4.X + i10;
                                eVar4.f1896b0 = i10;
                                eVar4.K.l(i10);
                                eVar4.M.l(i11);
                                dVar9.l(iE5);
                                z6 = z8 ? 1 : 0;
                                eVar4.f1914l = z6;
                            } else {
                                z6 = z8 ? 1 : 0;
                            }
                            g(i9, eVar4, interfaceC0025b);
                        }
                        z8 = z6;
                    }
                }
                z6 = z8 ? 1 : 0;
                z8 = z6;
            }
        }
        eVar.f1918n = z8;
    }
}
